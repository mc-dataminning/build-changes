import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class vv {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private vw b;

   public vv(UUID $$0, UUID $$1) {
      this.b = vw.a($$0, $$1);
   }

   public vv.c a(aum $$0) {
      return $$1 -> {
         vw $$2 = this.a();
         return $$2 == null ? null : new vn($$0.sign($$2x -> vr.a($$2x, $$2, $$1)));
      };
   }

   public vv.b a(ceu $$0) {
      aul $$1 = $$0.a();
      return ($$2, $$3) -> {
         vw $$4 = this.a();
         if ($$4 == null) {
            throw new vv.a(vb.c("chat.disabled.chain_broken"), false);
         } else if ($$0.b().a()) {
            throw new vv.a(vb.c("chat.disabled.expiredProfileKey"), false);
         } else {
            vr $$5 = new vr($$4, $$2, $$3, null, vf.c);
            if (!$$5.a($$1)) {
               throw new vv.a(vb.c("multiplayer.disconnect.unsigned_chat"), true);
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
   private vw a() {
      vw $$0 = this.b;
      if ($$0 != null) {
         this.b = $$0.a();
      }

      return $$0;
   }

   public static class a extends wb {
      private final boolean a;

      public a(vb $$0, boolean $$1) {
         super($$0);
         this.a = $$1;
      }

      public boolean a() {
         return this.a;
      }
   }

   @FunctionalInterface
   public interface b {
      vv.b a = ($$0, $$1) -> {
         throw new vv.a(vb.c("chat.disabled.missingProfileKey"), false);
      };

      static vv.b unsigned(UUID $$0) {
         return ($$1, $$2) -> vr.a($$0, $$2.a());
      }

      vr unpack(@Nullable vn var1, vu var2) throws vv.a;
   }

   @FunctionalInterface
   public interface c {
      vv.c a = $$0 -> null;

      @Nullable
      vn pack(vu var1);
   }
}
