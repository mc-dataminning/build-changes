import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class vc {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private vd b;

   public vc(UUID $$0, UUID $$1) {
      this.b = vd.a($$0, $$1);
   }

   public vc.c a(atk $$0) {
      return $$1 -> {
         vd $$2 = this.a();
         return $$2 == null ? null : new uu($$0.sign($$2x -> uy.a($$2x, $$2, $$1)));
      };
   }

   public vc.b a(cda $$0) {
      atj $$1 = $$0.a();
      return ($$2, $$3) -> {
         vd $$4 = this.a();
         if ($$4 == null) {
            throw new vc.a(ui.c("chat.disabled.chain_broken"), false);
         } else if ($$0.b().a()) {
            throw new vc.a(ui.c("chat.disabled.expiredProfileKey"), false);
         } else {
            uy $$5 = new uy($$4, $$2, $$3, null, um.c);
            if (!$$5.a($$1)) {
               throw new vc.a(ui.c("multiplayer.disconnect.unsigned_chat"), true);
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
   private vd a() {
      vd $$0 = this.b;
      if ($$0 != null) {
         this.b = $$0.a();
      }

      return $$0;
   }

   public static class a extends vi {
      private final boolean a;

      public a(ui $$0, boolean $$1) {
         super($$0);
         this.a = $$1;
      }

      public boolean a() {
         return this.a;
      }
   }

   @FunctionalInterface
   public interface b {
      vc.b a = ($$0, $$1) -> {
         throw new vc.a(ui.c("chat.disabled.missingProfileKey"), false);
      };

      static vc.b unsigned(UUID $$0) {
         return ($$1, $$2) -> uy.a($$0, $$2.a());
      }

      uy unpack(@Nullable uu var1, vb var2) throws vc.a;
   }

   @FunctionalInterface
   public interface c {
      vc.c a = $$0 -> null;

      @Nullable
      uu pack(vb var1);
   }
}
