import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class vz {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private wa b;

   public vz(UUID $$0, UUID $$1) {
      this.b = wa.a($$0, $$1);
   }

   public vz.c a(avc $$0) {
      return $$1 -> {
         wa $$2 = this.a();
         return $$2 == null ? null : new vr($$0.sign($$2x -> vv.a($$2x, $$2, $$1)));
      };
   }

   public vz.b a(cfk $$0) {
      avb $$1 = $$0.a();
      return ($$2, $$3) -> {
         wa $$4 = this.a();
         if ($$4 == null) {
            throw new vz.a(vf.c("chat.disabled.chain_broken"), false);
         } else if ($$0.b().a()) {
            throw new vz.a(vf.c("chat.disabled.expiredProfileKey"), false);
         } else {
            vv $$5 = new vv($$4, $$2, $$3, null, vj.c);
            if (!$$5.a($$1)) {
               throw new vz.a(vf.c("multiplayer.disconnect.unsigned_chat"), true);
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
   private wa a() {
      wa $$0 = this.b;
      if ($$0 != null) {
         this.b = $$0.a();
      }

      return $$0;
   }

   public static class a extends wf {
      private final boolean a;

      public a(vf $$0, boolean $$1) {
         super($$0);
         this.a = $$1;
      }

      public boolean a() {
         return this.a;
      }
   }

   @FunctionalInterface
   public interface b {
      vz.b a = ($$0, $$1) -> {
         throw new vz.a(vf.c("chat.disabled.missingProfileKey"), false);
      };

      static vz.b unsigned(UUID $$0) {
         return ($$1, $$2) -> vv.a($$0, $$2.a());
      }

      vv unpack(@Nullable vr var1, vy var2) throws vz.a;
   }

   @FunctionalInterface
   public interface c {
      vz.c a = $$0 -> null;

      @Nullable
      vr pack(vy var1);
   }
}
