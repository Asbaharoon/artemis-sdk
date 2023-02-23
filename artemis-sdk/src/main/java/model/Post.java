/*
 * OpenAPI definition
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.client.model.AnswerPost;
import org.openapitools.client.model.Conversation;
import org.openapitools.client.model.Course;
import org.openapitools.client.model.Exercise;
import org.openapitools.client.model.Lecture;
import org.openapitools.client.model.PlagiarismCase;
import org.openapitools.client.model.Reaction;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * Post
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class Post {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private OffsetDateTime creationDate;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_TOKENIZED_CONTENT = "tokenizedContent";
  @SerializedName(SERIALIZED_NAME_TOKENIZED_CONTENT)
  private String tokenizedContent;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_VISIBLE_FOR_STUDENTS = "visibleForStudents";
  @SerializedName(SERIALIZED_NAME_VISIBLE_FOR_STUDENTS)
  private Boolean visibleForStudents;

  public static final String SERIALIZED_NAME_REACTIONS = "reactions";
  @SerializedName(SERIALIZED_NAME_REACTIONS)
  private Set<Reaction> reactions = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_ANSWERS = "answers";
  @SerializedName(SERIALIZED_NAME_ANSWERS)
  private Set<AnswerPost> answers = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Set<String> tags = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_EXERCISE = "exercise";
  @SerializedName(SERIALIZED_NAME_EXERCISE)
  private Exercise exercise;

  public static final String SERIALIZED_NAME_LECTURE = "lecture";
  @SerializedName(SERIALIZED_NAME_LECTURE)
  private Lecture lecture;

  public static final String SERIALIZED_NAME_COURSE = "course";
  @SerializedName(SERIALIZED_NAME_COURSE)
  private Course course;

  /**
   * Gets or Sets courseWideContext
   */
  @JsonAdapter(CourseWideContextEnum.Adapter.class)
  public enum CourseWideContextEnum {
    TECH_SUPPORT("TECH_SUPPORT"),
    
    ORGANIZATION("ORGANIZATION"),
    
    RANDOM("RANDOM"),
    
    ANNOUNCEMENT("ANNOUNCEMENT");

    private String value;

    CourseWideContextEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CourseWideContextEnum fromValue(String value) {
      for (CourseWideContextEnum b : CourseWideContextEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CourseWideContextEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CourseWideContextEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CourseWideContextEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CourseWideContextEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_COURSE_WIDE_CONTEXT = "courseWideContext";
  @SerializedName(SERIALIZED_NAME_COURSE_WIDE_CONTEXT)
  private CourseWideContextEnum courseWideContext;

  public static final String SERIALIZED_NAME_CONVERSATION = "conversation";
  @SerializedName(SERIALIZED_NAME_CONVERSATION)
  private Conversation conversation;

  /**
   * Gets or Sets displayPriority
   */
  @JsonAdapter(DisplayPriorityEnum.Adapter.class)
  public enum DisplayPriorityEnum {
    PINNED("PINNED"),
    
    ARCHIVED("ARCHIVED"),
    
    NONE("NONE");

    private String value;

    DisplayPriorityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DisplayPriorityEnum fromValue(String value) {
      for (DisplayPriorityEnum b : DisplayPriorityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DisplayPriorityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DisplayPriorityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DisplayPriorityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DisplayPriorityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DISPLAY_PRIORITY = "displayPriority";
  @SerializedName(SERIALIZED_NAME_DISPLAY_PRIORITY)
  private DisplayPriorityEnum displayPriority;

  public static final String SERIALIZED_NAME_PLAGIARISM_CASE = "plagiarismCase";
  @SerializedName(SERIALIZED_NAME_PLAGIARISM_CASE)
  private PlagiarismCase plagiarismCase;

  public static final String SERIALIZED_NAME_RESOLVED = "resolved";
  @SerializedName(SERIALIZED_NAME_RESOLVED)
  private Boolean resolved;

  public static final String SERIALIZED_NAME_ANSWER_COUNT = "answerCount";
  @SerializedName(SERIALIZED_NAME_ANSWER_COUNT)
  private Integer answerCount;

  public static final String SERIALIZED_NAME_VOTE_COUNT = "voteCount";
  @SerializedName(SERIALIZED_NAME_VOTE_COUNT)
  private Integer voteCount;

  /**
   * Gets or Sets authorRole
   */
  @JsonAdapter(AuthorRoleEnum.Adapter.class)
  public enum AuthorRoleEnum {
    INSTRUCTOR("INSTRUCTOR"),
    
    TUTOR("TUTOR"),
    
    USER("USER");

    private String value;

    AuthorRoleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthorRoleEnum fromValue(String value) {
      for (AuthorRoleEnum b : AuthorRoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AuthorRoleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthorRoleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthorRoleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AuthorRoleEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AUTHOR_ROLE = "authorRole";
  @SerializedName(SERIALIZED_NAME_AUTHOR_ROLE)
  private AuthorRoleEnum authorRole;

  public Post() {
  }

  public Post id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public Post creationDate(OffsetDateTime creationDate) {
    
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }


  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }


  public Post content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public Post tokenizedContent(String tokenizedContent) {
    
    this.tokenizedContent = tokenizedContent;
    return this;
  }

   /**
   * Get tokenizedContent
   * @return tokenizedContent
  **/
  @javax.annotation.Nullable

  public String getTokenizedContent() {
    return tokenizedContent;
  }


  public void setTokenizedContent(String tokenizedContent) {
    this.tokenizedContent = tokenizedContent;
  }


  public Post title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public Post visibleForStudents(Boolean visibleForStudents) {
    
    this.visibleForStudents = visibleForStudents;
    return this;
  }

   /**
   * Get visibleForStudents
   * @return visibleForStudents
  **/
  @javax.annotation.Nullable

  public Boolean getVisibleForStudents() {
    return visibleForStudents;
  }


  public void setVisibleForStudents(Boolean visibleForStudents) {
    this.visibleForStudents = visibleForStudents;
  }


  public Post reactions(Set<Reaction> reactions) {
    
    this.reactions = reactions;
    return this;
  }

  public Post addReactionsItem(Reaction reactionsItem) {
    if (this.reactions == null) {
      this.reactions = new LinkedHashSet<>();
    }
    this.reactions.add(reactionsItem);
    return this;
  }

   /**
   * Get reactions
   * @return reactions
  **/
  @javax.annotation.Nullable

  public Set<Reaction> getReactions() {
    return reactions;
  }


  public void setReactions(Set<Reaction> reactions) {
    this.reactions = reactions;
  }


  public Post answers(Set<AnswerPost> answers) {
    
    this.answers = answers;
    return this;
  }

  public Post addAnswersItem(AnswerPost answersItem) {
    if (this.answers == null) {
      this.answers = new LinkedHashSet<>();
    }
    this.answers.add(answersItem);
    return this;
  }

   /**
   * Get answers
   * @return answers
  **/
  @javax.annotation.Nullable

  public Set<AnswerPost> getAnswers() {
    return answers;
  }


  public void setAnswers(Set<AnswerPost> answers) {
    this.answers = answers;
  }


  public Post tags(Set<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public Post addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new LinkedHashSet<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable

  public Set<String> getTags() {
    return tags;
  }


  public void setTags(Set<String> tags) {
    this.tags = tags;
  }


  public Post exercise(Exercise exercise) {
    
    this.exercise = exercise;
    return this;
  }

   /**
   * Get exercise
   * @return exercise
  **/
  @javax.annotation.Nullable

  public Exercise getExercise() {
    return exercise;
  }


  public void setExercise(Exercise exercise) {
    this.exercise = exercise;
  }


  public Post lecture(Lecture lecture) {
    
    this.lecture = lecture;
    return this;
  }

   /**
   * Get lecture
   * @return lecture
  **/
  @javax.annotation.Nullable

  public Lecture getLecture() {
    return lecture;
  }


  public void setLecture(Lecture lecture) {
    this.lecture = lecture;
  }


  public Post course(Course course) {
    
    this.course = course;
    return this;
  }

   /**
   * Get course
   * @return course
  **/
  @javax.annotation.Nullable

  public Course getCourse() {
    return course;
  }


  public void setCourse(Course course) {
    this.course = course;
  }


  public Post courseWideContext(CourseWideContextEnum courseWideContext) {
    
    this.courseWideContext = courseWideContext;
    return this;
  }

   /**
   * Get courseWideContext
   * @return courseWideContext
  **/
  @javax.annotation.Nullable

  public CourseWideContextEnum getCourseWideContext() {
    return courseWideContext;
  }


  public void setCourseWideContext(CourseWideContextEnum courseWideContext) {
    this.courseWideContext = courseWideContext;
  }


  public Post conversation(Conversation conversation) {
    
    this.conversation = conversation;
    return this;
  }

   /**
   * Get conversation
   * @return conversation
  **/
  @javax.annotation.Nullable

  public Conversation getConversation() {
    return conversation;
  }


  public void setConversation(Conversation conversation) {
    this.conversation = conversation;
  }


  public Post displayPriority(DisplayPriorityEnum displayPriority) {
    
    this.displayPriority = displayPriority;
    return this;
  }

   /**
   * Get displayPriority
   * @return displayPriority
  **/
  @javax.annotation.Nullable

  public DisplayPriorityEnum getDisplayPriority() {
    return displayPriority;
  }


  public void setDisplayPriority(DisplayPriorityEnum displayPriority) {
    this.displayPriority = displayPriority;
  }


  public Post plagiarismCase(PlagiarismCase plagiarismCase) {
    
    this.plagiarismCase = plagiarismCase;
    return this;
  }

   /**
   * Get plagiarismCase
   * @return plagiarismCase
  **/
  @javax.annotation.Nullable

  public PlagiarismCase getPlagiarismCase() {
    return plagiarismCase;
  }


  public void setPlagiarismCase(PlagiarismCase plagiarismCase) {
    this.plagiarismCase = plagiarismCase;
  }


  public Post resolved(Boolean resolved) {
    
    this.resolved = resolved;
    return this;
  }

   /**
   * Get resolved
   * @return resolved
  **/
  @javax.annotation.Nullable

  public Boolean getResolved() {
    return resolved;
  }


  public void setResolved(Boolean resolved) {
    this.resolved = resolved;
  }


  public Post answerCount(Integer answerCount) {
    
    this.answerCount = answerCount;
    return this;
  }

   /**
   * Get answerCount
   * @return answerCount
  **/
  @javax.annotation.Nullable

  public Integer getAnswerCount() {
    return answerCount;
  }


  public void setAnswerCount(Integer answerCount) {
    this.answerCount = answerCount;
  }


  public Post voteCount(Integer voteCount) {
    
    this.voteCount = voteCount;
    return this;
  }

   /**
   * Get voteCount
   * @return voteCount
  **/
  @javax.annotation.Nullable

  public Integer getVoteCount() {
    return voteCount;
  }


  public void setVoteCount(Integer voteCount) {
    this.voteCount = voteCount;
  }


  public Post authorRole(AuthorRoleEnum authorRole) {
    
    this.authorRole = authorRole;
    return this;
  }

   /**
   * Get authorRole
   * @return authorRole
  **/
  @javax.annotation.Nullable

  public AuthorRoleEnum getAuthorRole() {
    return authorRole;
  }


  public void setAuthorRole(AuthorRoleEnum authorRole) {
    this.authorRole = authorRole;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Post post = (Post) o;
    return Objects.equals(this.id, post.id) &&
        Objects.equals(this.creationDate, post.creationDate) &&
        Objects.equals(this.content, post.content) &&
        Objects.equals(this.tokenizedContent, post.tokenizedContent) &&
        Objects.equals(this.title, post.title) &&
        Objects.equals(this.visibleForStudents, post.visibleForStudents) &&
        Objects.equals(this.reactions, post.reactions) &&
        Objects.equals(this.answers, post.answers) &&
        Objects.equals(this.tags, post.tags) &&
        Objects.equals(this.exercise, post.exercise) &&
        Objects.equals(this.lecture, post.lecture) &&
        Objects.equals(this.course, post.course) &&
        Objects.equals(this.courseWideContext, post.courseWideContext) &&
        Objects.equals(this.conversation, post.conversation) &&
        Objects.equals(this.displayPriority, post.displayPriority) &&
        Objects.equals(this.plagiarismCase, post.plagiarismCase) &&
        Objects.equals(this.resolved, post.resolved) &&
        Objects.equals(this.answerCount, post.answerCount) &&
        Objects.equals(this.voteCount, post.voteCount) &&
        Objects.equals(this.authorRole, post.authorRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, creationDate, content, tokenizedContent, title, visibleForStudents, reactions, answers, tags, exercise, lecture, course, courseWideContext, conversation, displayPriority, plagiarismCase, resolved, answerCount, voteCount, authorRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Post {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    tokenizedContent: ").append(toIndentedString(tokenizedContent)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    visibleForStudents: ").append(toIndentedString(visibleForStudents)).append("\n");
    sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    exercise: ").append(toIndentedString(exercise)).append("\n");
    sb.append("    lecture: ").append(toIndentedString(lecture)).append("\n");
    sb.append("    course: ").append(toIndentedString(course)).append("\n");
    sb.append("    courseWideContext: ").append(toIndentedString(courseWideContext)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    displayPriority: ").append(toIndentedString(displayPriority)).append("\n");
    sb.append("    plagiarismCase: ").append(toIndentedString(plagiarismCase)).append("\n");
    sb.append("    resolved: ").append(toIndentedString(resolved)).append("\n");
    sb.append("    answerCount: ").append(toIndentedString(answerCount)).append("\n");
    sb.append("    voteCount: ").append(toIndentedString(voteCount)).append("\n");
    sb.append("    authorRole: ").append(toIndentedString(authorRole)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("creationDate");
    openapiFields.add("content");
    openapiFields.add("tokenizedContent");
    openapiFields.add("title");
    openapiFields.add("visibleForStudents");
    openapiFields.add("reactions");
    openapiFields.add("answers");
    openapiFields.add("tags");
    openapiFields.add("exercise");
    openapiFields.add("lecture");
    openapiFields.add("course");
    openapiFields.add("courseWideContext");
    openapiFields.add("conversation");
    openapiFields.add("displayPriority");
    openapiFields.add("plagiarismCase");
    openapiFields.add("resolved");
    openapiFields.add("answerCount");
    openapiFields.add("voteCount");
    openapiFields.add("authorRole");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Post
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Post.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Post is not found in the empty JSON string", Post.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Post.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Post` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      if ((jsonObj.get("tokenizedContent") != null && !jsonObj.get("tokenizedContent").isJsonNull()) && !jsonObj.get("tokenizedContent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tokenizedContent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tokenizedContent").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (jsonObj.get("reactions") != null && !jsonObj.get("reactions").isJsonNull()) {
        JsonArray jsonArrayreactions = jsonObj.getAsJsonArray("reactions");
        if (jsonArrayreactions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("reactions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `reactions` to be an array in the JSON string but got `%s`", jsonObj.get("reactions").toString()));
          }

          // validate the optional field `reactions` (array)
          for (int i = 0; i < jsonArrayreactions.size(); i++) {
            Reaction.validateJsonObject(jsonArrayreactions.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("answers") != null && !jsonObj.get("answers").isJsonNull()) {
        JsonArray jsonArrayanswers = jsonObj.getAsJsonArray("answers");
        if (jsonArrayanswers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("answers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `answers` to be an array in the JSON string but got `%s`", jsonObj.get("answers").toString()));
          }

          // validate the optional field `answers` (array)
          for (int i = 0; i < jsonArrayanswers.size(); i++) {
            AnswerPost.validateJsonObject(jsonArrayanswers.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      // validate the optional field `exercise`
      if (jsonObj.get("exercise") != null && !jsonObj.get("exercise").isJsonNull()) {
        Exercise.validateJsonObject(jsonObj.getAsJsonObject("exercise"));
      }
      // validate the optional field `lecture`
      if (jsonObj.get("lecture") != null && !jsonObj.get("lecture").isJsonNull()) {
        Lecture.validateJsonObject(jsonObj.getAsJsonObject("lecture"));
      }
      // validate the optional field `course`
      if (jsonObj.get("course") != null && !jsonObj.get("course").isJsonNull()) {
        Course.validateJsonObject(jsonObj.getAsJsonObject("course"));
      }
      if ((jsonObj.get("courseWideContext") != null && !jsonObj.get("courseWideContext").isJsonNull()) && !jsonObj.get("courseWideContext").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `courseWideContext` to be a primitive type in the JSON string but got `%s`", jsonObj.get("courseWideContext").toString()));
      }
      // validate the optional field `conversation`
      if (jsonObj.get("conversation") != null && !jsonObj.get("conversation").isJsonNull()) {
        Conversation.validateJsonObject(jsonObj.getAsJsonObject("conversation"));
      }
      if ((jsonObj.get("displayPriority") != null && !jsonObj.get("displayPriority").isJsonNull()) && !jsonObj.get("displayPriority").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayPriority` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayPriority").toString()));
      }
      // validate the optional field `plagiarismCase`
      if (jsonObj.get("plagiarismCase") != null && !jsonObj.get("plagiarismCase").isJsonNull()) {
        PlagiarismCase.validateJsonObject(jsonObj.getAsJsonObject("plagiarismCase"));
      }
      if ((jsonObj.get("authorRole") != null && !jsonObj.get("authorRole").isJsonNull()) && !jsonObj.get("authorRole").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorRole` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorRole").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Post.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Post' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Post> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Post.class));

       return (TypeAdapter<T>) new TypeAdapter<Post>() {
           @Override
           public void write(JsonWriter out, Post value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Post read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Post given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Post
  * @throws IOException if the JSON string is invalid with respect to Post
  */
  public static Post fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Post.class);
  }

 /**
  * Convert an instance of Post to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

