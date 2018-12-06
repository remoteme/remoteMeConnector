package org.remoteme.client.invoker;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import org.remoteme.client.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("AMessage".equalsIgnoreCase(className)) {
      return new TypeToken<List<AMessage>>(){}.getType();
    }
    
    if ("ARTokenDto".equalsIgnoreCase(className)) {
      return new TypeToken<List<ARTokenDto>>(){}.getType();
    }
    
    if ("ARemoteMeMessage".equalsIgnoreCase(className)) {
      return new TypeToken<List<ARemoteMeMessage>>(){}.getType();
    }
    
    if ("AVariableStateOfobject".equalsIgnoreCase(className)) {
      return new TypeToken<List<AVariableStateOfobject>>(){}.getType();
    }
    
    if ("AndroidRegisterDto".equalsIgnoreCase(className)) {
      return new TypeToken<List<AndroidRegisterDto>>(){}.getType();
    }
    
    if ("DataSeries".equalsIgnoreCase(className)) {
      return new TypeToken<List<DataSeries>>(){}.getType();
    }
    
    if ("DeviceDto".equalsIgnoreCase(className)) {
      return new TypeToken<List<DeviceDto>>(){}.getType();
    }
    
    if ("HelloDto".equalsIgnoreCase(className)) {
      return new TypeToken<List<HelloDto>>(){}.getType();
    }
    
    if ("PlainResultDto".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlainResultDto>>(){}.getType();
    }
    
    if ("RegisterDto".equalsIgnoreCase(className)) {
      return new TypeToken<List<RegisterDto>>(){}.getType();
    }
    
    if ("StandardResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<StandardResponse>>(){}.getType();
    }
    
    if ("TokenDto".equalsIgnoreCase(className)) {
      return new TypeToken<List<TokenDto>>(){}.getType();
    }
    
    if ("VariableDetails".equalsIgnoreCase(className)) {
      return new TypeToken<List<VariableDetails>>(){}.getType();
    }
    
    if ("VariableDto".equalsIgnoreCase(className)) {
      return new TypeToken<List<VariableDto>>(){}.getType();
    }
    
    if ("VariableIdentifier".equalsIgnoreCase(className)) {
      return new TypeToken<List<VariableIdentifier>>(){}.getType();
    }
    
    if ("VariableRemoveMessageData".equalsIgnoreCase(className)) {
      return new TypeToken<List<VariableRemoveMessageData>>(){}.getType();
    }
    
    if ("VariableRenameMessageData".equalsIgnoreCase(className)) {
      return new TypeToken<List<VariableRenameMessageData>>(){}.getType();
    }
    
    if ("VariableSchedulerDto".equalsIgnoreCase(className)) {
      return new TypeToken<List<VariableSchedulerDto>>(){}.getType();
    }
    
    if ("VariableSchedulerEntityDto".equalsIgnoreCase(className)) {
      return new TypeToken<List<VariableSchedulerEntityDto>>(){}.getType();
    }
    
    if ("AddDataMessage".equalsIgnoreCase(className)) {
      return new TypeToken<List<AddDataMessage>>(){}.getType();
    }
    
    if ("CreateVariablesMessage".equalsIgnoreCase(className)) {
      return new TypeToken<List<CreateVariablesMessage>>(){}.getType();
    }
    
    if ("LogMessage".equalsIgnoreCase(className)) {
      return new TypeToken<List<LogMessage>>(){}.getType();
    }
    
    if ("NotifyAboutVariablesMessage".equalsIgnoreCase(className)) {
      return new TypeToken<List<NotifyAboutVariablesMessage>>(){}.getType();
    }
    
    if ("PingMessage".equalsIgnoreCase(className)) {
      return new TypeToken<List<PingMessage>>(){}.getType();
    }
    
    if ("RegisterDeviceMessage".equalsIgnoreCase(className)) {
      return new TypeToken<List<RegisterDeviceMessage>>(){}.getType();
    }
    
    if ("RegisterLeafDeviceMessage".equalsIgnoreCase(className)) {
      return new TypeToken<List<RegisterLeafDeviceMessage>>(){}.getType();
    }
    
    if ("SyncMessage".equalsIgnoreCase(className)) {
      return new TypeToken<List<SyncMessage>>(){}.getType();
    }
    
    if ("SyncResponseMessage".equalsIgnoreCase(className)) {
      return new TypeToken<List<SyncResponseMessage>>(){}.getType();
    }
    
    if ("SyncUserMessage".equalsIgnoreCase(className)) {
      return new TypeToken<List<SyncUserMessage>>(){}.getType();
    }
    
    if ("SystemMessage".equalsIgnoreCase(className)) {
      return new TypeToken<List<SystemMessage>>(){}.getType();
    }
    
    if ("UserMessage".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserMessage>>(){}.getType();
    }
    
    if ("VariableChangeMessage".equalsIgnoreCase(className)) {
      return new TypeToken<List<VariableChangeMessage>>(){}.getType();
    }
    
    if ("VariableChangePropagateMessage".equalsIgnoreCase(className)) {
      return new TypeToken<List<VariableChangePropagateMessage>>(){}.getType();
    }
    
    if ("VariableObserveMessage".equalsIgnoreCase(className)) {
      return new TypeToken<List<VariableObserveMessage>>(){}.getType();
    }
    
    if ("VariableRemoveMessage".equalsIgnoreCase(className)) {
      return new TypeToken<List<VariableRemoveMessage>>(){}.getType();
    }
    
    if ("VariableRenameMessage".equalsIgnoreCase(className)) {
      return new TypeToken<List<VariableRenameMessage>>(){}.getType();
    }
    
    if ("WebRRCConnectionStatusChangeMessage".equalsIgnoreCase(className)) {
      return new TypeToken<List<WebRRCConnectionStatusChangeMessage>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("AMessage".equalsIgnoreCase(className)) {
      return new TypeToken<AMessage>(){}.getType();
    }
    
    if ("ARTokenDto".equalsIgnoreCase(className)) {
      return new TypeToken<ARTokenDto>(){}.getType();
    }
    
    if ("ARemoteMeMessage".equalsIgnoreCase(className)) {
      return new TypeToken<ARemoteMeMessage>(){}.getType();
    }
    
    if ("AVariableStateOfobject".equalsIgnoreCase(className)) {
      return new TypeToken<AVariableStateOfobject>(){}.getType();
    }
    
    if ("AndroidRegisterDto".equalsIgnoreCase(className)) {
      return new TypeToken<AndroidRegisterDto>(){}.getType();
    }
    
    if ("DataSeries".equalsIgnoreCase(className)) {
      return new TypeToken<DataSeries>(){}.getType();
    }
    
    if ("DeviceDto".equalsIgnoreCase(className)) {
      return new TypeToken<DeviceDto>(){}.getType();
    }
    
    if ("HelloDto".equalsIgnoreCase(className)) {
      return new TypeToken<HelloDto>(){}.getType();
    }
    
    if ("PlainResultDto".equalsIgnoreCase(className)) {
      return new TypeToken<PlainResultDto>(){}.getType();
    }
    
    if ("RegisterDto".equalsIgnoreCase(className)) {
      return new TypeToken<RegisterDto>(){}.getType();
    }
    
    if ("StandardResponse".equalsIgnoreCase(className)) {
      return new TypeToken<StandardResponse>(){}.getType();
    }
    
    if ("TokenDto".equalsIgnoreCase(className)) {
      return new TypeToken<TokenDto>(){}.getType();
    }
    
    if ("VariableDetails".equalsIgnoreCase(className)) {
      return new TypeToken<VariableDetails>(){}.getType();
    }
    
    if ("VariableDto".equalsIgnoreCase(className)) {
      return new TypeToken<VariableDto>(){}.getType();
    }
    
    if ("VariableIdentifier".equalsIgnoreCase(className)) {
      return new TypeToken<VariableIdentifier>(){}.getType();
    }
    
    if ("VariableRemoveMessageData".equalsIgnoreCase(className)) {
      return new TypeToken<VariableRemoveMessageData>(){}.getType();
    }
    
    if ("VariableRenameMessageData".equalsIgnoreCase(className)) {
      return new TypeToken<VariableRenameMessageData>(){}.getType();
    }
    
    if ("VariableSchedulerDto".equalsIgnoreCase(className)) {
      return new TypeToken<VariableSchedulerDto>(){}.getType();
    }
    
    if ("VariableSchedulerEntityDto".equalsIgnoreCase(className)) {
      return new TypeToken<VariableSchedulerEntityDto>(){}.getType();
    }
    
    if ("AddDataMessage".equalsIgnoreCase(className)) {
      return new TypeToken<AddDataMessage>(){}.getType();
    }
    
    if ("CreateVariablesMessage".equalsIgnoreCase(className)) {
      return new TypeToken<CreateVariablesMessage>(){}.getType();
    }
    
    if ("LogMessage".equalsIgnoreCase(className)) {
      return new TypeToken<LogMessage>(){}.getType();
    }
    
    if ("NotifyAboutVariablesMessage".equalsIgnoreCase(className)) {
      return new TypeToken<NotifyAboutVariablesMessage>(){}.getType();
    }
    
    if ("PingMessage".equalsIgnoreCase(className)) {
      return new TypeToken<PingMessage>(){}.getType();
    }
    
    if ("RegisterDeviceMessage".equalsIgnoreCase(className)) {
      return new TypeToken<RegisterDeviceMessage>(){}.getType();
    }
    
    if ("RegisterLeafDeviceMessage".equalsIgnoreCase(className)) {
      return new TypeToken<RegisterLeafDeviceMessage>(){}.getType();
    }
    
    if ("SyncMessage".equalsIgnoreCase(className)) {
      return new TypeToken<SyncMessage>(){}.getType();
    }
    
    if ("SyncResponseMessage".equalsIgnoreCase(className)) {
      return new TypeToken<SyncResponseMessage>(){}.getType();
    }
    
    if ("SyncUserMessage".equalsIgnoreCase(className)) {
      return new TypeToken<SyncUserMessage>(){}.getType();
    }
    
    if ("SystemMessage".equalsIgnoreCase(className)) {
      return new TypeToken<SystemMessage>(){}.getType();
    }
    
    if ("UserMessage".equalsIgnoreCase(className)) {
      return new TypeToken<UserMessage>(){}.getType();
    }
    
    if ("VariableChangeMessage".equalsIgnoreCase(className)) {
      return new TypeToken<VariableChangeMessage>(){}.getType();
    }
    
    if ("VariableChangePropagateMessage".equalsIgnoreCase(className)) {
      return new TypeToken<VariableChangePropagateMessage>(){}.getType();
    }
    
    if ("VariableObserveMessage".equalsIgnoreCase(className)) {
      return new TypeToken<VariableObserveMessage>(){}.getType();
    }
    
    if ("VariableRemoveMessage".equalsIgnoreCase(className)) {
      return new TypeToken<VariableRemoveMessage>(){}.getType();
    }
    
    if ("VariableRenameMessage".equalsIgnoreCase(className)) {
      return new TypeToken<VariableRenameMessage>(){}.getType();
    }
    
    if ("WebRRCConnectionStatusChangeMessage".equalsIgnoreCase(className)) {
      return new TypeToken<WebRRCConnectionStatusChangeMessage>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
