import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class xc {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private xd b;
   private Instant c = Instant.EPOCH;

   public xc(UUID $$0, UUID $$1) {
      this.b = xd.a($$0, $$1);
   }

   public xc.c a(axz $$0) {
      return $$1 -> {
         xd $$2 = this.a();
         return $$2 == null ? null : new wu($$0.sign($$2x -> wy.a($$2x, $$2, $$1)));
      };
   }

   public xc.b a(ckd $$0) {
      axy $$1 = $$0.a();
      return ($$2, $$3) -> {
         xd $$4 = this.a();
         if ($$4 == null) {
            throw new xc.a(wi.c("chat.disabled.chain_broken"), false);
         } else if ($$0.b().a()) {
            throw new xc.a(wi.c("chat.disabled.expiredProfileKey"), false);
         } else if ($$3.b().isBefore(this.c)) {
            throw new xc.a(wi.c("multiplayer.disconnect.out_of_order_chat"), true);
         } else {
            this.c = $$3.b();
            wy $$5 = new wy($$4, $$2, $$3, null, wm.c);
            if (!$$5.a($$1)) {
               throw new xc.a(wi.c("multiplayer.disconnect.unsigned_chat"), true);
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
   private xd a() {
      xd $$0 = this.b;
      if ($$0 != null) {
         this.b = $$0.a();
      }

      return $$0;
   }

   public static class a extends xi {
      private final boolean a;

      public a(wi $$0, boolean $$1) {
         super($$0);
         this.a = $$1;
      }

      public boolean a() {
         return this.a;
      }
   }

   @FunctionalInterface
   public interface b {
      static xc.b unsigned(UUID $$0, BooleanSupplier $$1) {
         return ($$2, $$3) -> {
            if ($$1.getAsBoolean()) {
               throw new xc.a(wi.c("chat.disabled.missingProfileKey"), false);
            } else {
               return wy.a($$0, $$3.a());
            }
         };
      }

      wy unpack(@Nullable wu var1, xb var2) throws xc.a;
   }

   @FunctionalInterface
   public interface c {
      xc.c a = $$0 -> null;

      @Nullable
      wu pack(xb var1);
   }
}
