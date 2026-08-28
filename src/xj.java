import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class xj {
   static final Logger a = LogUtils.getLogger();
   @Nullable
   xk b;
   Instant c = Instant.EPOCH;

   public xj(UUID $$0, UUID $$1) {
      this.b = xk.a($$0, $$1);
   }

   public xj.c a(azn $$0) {
      return $$1 -> {
         xk $$2 = this.b;
         if ($$2 == null) {
            return null;
         } else {
            this.b = $$2.a();
            return new xb($$0.sign($$2x -> xf.a($$2x, $$2, $$1)));
         }
      };
   }

   public xj.b a(final coz $$0) {
      final azm $$1 = $$0.a();
      return new xj.b() {
         @Override
         public xf unpack(@Nullable xb $$0x, xi $$1x) throws xj.a {
            if ($$0 == null) {
               throw new xj.a(xj.a.a);
            } else if ($$0.b().a()) {
               throw new xj.a(xj.a.c);
            } else {
               xk $$2 = xj.this.b;
               if ($$2 == null) {
                  throw new xj.a(xj.a.b);
               } else if ($$1.b().isBefore(xj.this.c)) {
                  this.setChainBroken();
                  throw new xj.a(xj.a.e);
               } else {
                  xj.this.c = $$1.b();
                  xf $$3 = new xf($$2, $$0, $$1, null, wt.c);
                  if (!$$3.a($$1)) {
                     this.setChainBroken();
                     throw new xj.a(xj.a.d);
                  } else {
                     if ($$3.a(Instant.now())) {
                        xj.a.warn("Received expired chat: '{}'. Is the client/server system time unsynchronized?", $$1.a());
                     }

                     xj.this.b = $$2.a();
                     return $$3;
                  }
               }
            }
         }

         @Override
         public void setChainBroken() {
            xj.this.b = null;
         }
      };
   }

   public static class a extends xp {
      static final wp a = wp.c("chat.disabled.missingProfileKey");
      static final wp b = wp.c("chat.disabled.chain_broken");
      static final wp c = wp.c("chat.disabled.expiredProfileKey");
      static final wp d = wp.c("chat.disabled.invalid_signature");
      static final wp e = wp.c("chat.disabled.out_of_order_chat");

      public a(wp $$0) {
         super($$0);
      }
   }

   @FunctionalInterface
   public interface b {
      static xj.b unsigned(UUID $$0, BooleanSupplier $$1) {
         return ($$2, $$3) -> {
            if ($$1.getAsBoolean()) {
               throw new xj.a(xj.a.a);
            } else {
               return xf.a($$0, $$3.a());
            }
         };
      }

      xf unpack(@Nullable xb var1, xi var2) throws xj.a;

      default void setChainBroken() {
      }
   }

   @FunctionalInterface
   public interface c {
      xj.c a = $$0 -> null;

      @Nullable
      xb pack(xi var1);
   }
}
