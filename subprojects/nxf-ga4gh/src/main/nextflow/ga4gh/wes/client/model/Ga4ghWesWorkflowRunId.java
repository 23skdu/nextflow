/*
 * workflow_execution.proto
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: version not set
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package nextflow.ga4gh.wes.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * Ga4ghWesWorkflowRunId
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-01T15:34:23.960Z")
public class Ga4ghWesWorkflowRunId {
  @SerializedName("workflow_id")
  private String workflowId = null;

  public Ga4ghWesWorkflowRunId workflowId(String workflowId) {
    this.workflowId = workflowId;
    return this;
  }

   /**
   * Get workflowId
   * @return workflowId
  **/
  @ApiModelProperty(value = "")
  public String getWorkflowId() {
    return workflowId;
  }

  public void setWorkflowId(String workflowId) {
    this.workflowId = workflowId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ga4ghWesWorkflowRunId ga4ghWesWorkflowRunId = (Ga4ghWesWorkflowRunId) o;
    return Objects.equals(this.workflowId, ga4ghWesWorkflowRunId.workflowId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflowId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ga4ghWesWorkflowRunId {\n");
    
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
