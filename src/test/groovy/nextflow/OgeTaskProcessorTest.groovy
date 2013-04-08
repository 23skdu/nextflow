/*
 * Copyright (c) 2012, the authors.
 *
 *   This file is part of 'Nextflow'.
 *
 *   Nextflow is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   Nextflow is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with Nextflow.  If not, see <http://www.gnu.org/licenses/>.
 */

package nextflow
import nextflow.processor.OgeTaskProcessor
import nextflow.processor.TaskDef
import spock.lang.Specification
/**
 *
 * @author Paolo Di Tommaso <paolo.ditommaso@gmail.com>
 */
class OgeTaskProcessorTest extends Specification {

    def 'test qsub cmd line' () {

        when:
        def processor = new OgeTaskProcessor(new Session())
        processor.queue('my-queue')
        processor.maxMemory( '2GB' )
        processor.maxDuration( '3h' )
        processor.qsubCmdLine('-extra opt')
        processor.name = 'task'

        def task = new TaskDef(name: 'my-task', index: 9)


        then:
        processor.getQsubCommandLine(task).join(' ') == 'qsub -terse -wd $PWD -o .command.out -j y -sync y -V -q my-queue -l h_rt=03:00:00 -l virtual_free=2G -N nf-task-9 -extra opt .command.sh'

    }

}
