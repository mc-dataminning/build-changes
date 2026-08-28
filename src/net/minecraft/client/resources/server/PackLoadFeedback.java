package net.minecraft.client.resources.server;

import java.util.UUID;

public interface PackLoadFeedback {
   void reportUpdate(UUID id, PackLoadFeedback.Update result);

   void reportFinalResult(UUID id, PackLoadFeedback.FinalResult result);

   public static enum FinalResult {
      DECLINED,
      APPLIED,
      DISCARDED,
      DOWNLOAD_FAILED,
      ACTIVATION_FAILED;
   }

   public static enum Update {
      ACCEPTED,
      DOWNLOADED;
   }
}
