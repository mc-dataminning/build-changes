import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class vp {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private vq b;

   public vp(UUID $$0, UUID $$1) {
      this.b = vq.a($$0, $$1);
   }

   public vp.c a(aud $$0) {
      return $$1 -> {
         vq $$2 = this.a();
         return $$2 == null ? null : new vh($$0.sign($$2x -> vl.a($$2x, $$2, $$1)));
      };
   }

   public vp.b a(cec $$0) {
      auc $$1 = $$0.a();
      return ($$2, $$3) -> {
         vq $$4 = this.a();
         if ($$4 == null) {
            throw new vp.a(uv.c("chat.disabled.chain_broken"), false);
         } else if ($$0.b().a()) {
            throw new vp.a(uv.c("chat.disabled.expiredProfileKey"), false);
         } else {
            vl $$5 = new vl($$4, $$2, $$3, null, uz.c);
            if (!$$5.a($$1)) {
               throw new vp.a(uv.c("multiplayer.disconnect.unsigned_chat"), true);
            } else {
               if ($$5.a(Instant.now())) {
                  a.warn("Received expired chat: '{}'. Is the client/server system time unsynchronized?", $$3.a());
               }

               return $$5;
            }
         }
      };
   }

   @Nullable
   private vq a() {
      vq $$0 = this.b;
      if ($$0 != null) {
         this.b = $$0.a();
      }

      return $$0;
   }

   public static class a extends vv {
      private final boolean a;

      public a(uv $$0, boolean $$1) {
         super($$0);
         this.a = $$1;
      }

      public boolean a() {
         return this.a;
      }
   }

   @FunctionalInterface
   public interface b {
      vp.b a = ($$0, $$1) -> {
         throw new vp.a(uv.c("chat.disabled.missingProfileKey"), false);
      };

      static vp.b unsigned(UUID $$0) {
         return ($$1, $$2) -> vl.a($$0, $$2.a());
      }

      vl unpack(@Nullable vh var1, vo var2) throws vp.a;
   }

   @FunctionalInterface
   public interface c {
      vp.c a = $$0 -> null;

      @Nullable
      vh pack(vo var1);
   }
}
