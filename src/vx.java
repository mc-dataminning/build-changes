import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class vx {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private vy b;

   public vx(UUID $$0, UUID $$1) {
      this.b = vy.a($$0, $$1);
   }

   public vx.c a(auw $$0) {
      return $$1 -> {
         vy $$2 = this.a();
         return $$2 == null ? null : new vp($$0.sign($$2x -> vt.a($$2x, $$2, $$1)));
      };
   }

   public vx.b a(cfe $$0) {
      auv $$1 = $$0.a();
      return ($$2, $$3) -> {
         vy $$4 = this.a();
         if ($$4 == null) {
            throw new vx.a(vd.c("chat.disabled.chain_broken"), false);
         } else if ($$0.b().a()) {
            throw new vx.a(vd.c("chat.disabled.expiredProfileKey"), false);
         } else {
            vt $$5 = new vt($$4, $$2, $$3, null, vh.c);
            if (!$$5.a($$1)) {
               throw new vx.a(vd.c("multiplayer.disconnect.unsigned_chat"), true);
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
   private vy a() {
      vy $$0 = this.b;
      if ($$0 != null) {
         this.b = $$0.a();
      }

      return $$0;
   }

   public static class a extends wd {
      private final boolean a;

      public a(vd $$0, boolean $$1) {
         super($$0);
         this.a = $$1;
      }

      public boolean a() {
         return this.a;
      }
   }

   @FunctionalInterface
   public interface b {
      vx.b a = ($$0, $$1) -> {
         throw new vx.a(vd.c("chat.disabled.missingProfileKey"), false);
      };

      static vx.b unsigned(UUID $$0) {
         return ($$1, $$2) -> vt.a($$0, $$2.a());
      }

      vt unpack(@Nullable vp var1, vw var2) throws vx.a;
   }

   @FunctionalInterface
   public interface c {
      vx.c a = $$0 -> null;

      @Nullable
      vp pack(vw var1);
   }
}
