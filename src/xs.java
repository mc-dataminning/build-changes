import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class xs {
   static final Logger a = LogUtils.getLogger();
   @Nullable
   xt b;
   Instant c = Instant.EPOCH;

   public xs(UUID $$0, UUID $$1) {
      this.b = xt.a($$0, $$1);
   }

   public xs.c a(bac $$0) {
      return $$1 -> {
         xt $$2 = this.b;
         if ($$2 == null) {
            return null;
         } else {
            this.b = $$2.a();
            return new xk($$0.sign($$2x -> xo.a($$2x, $$2, $$1)));
         }
      };
   }

   public xs.b a(final crq $$0) {
      final bab $$1 = $$0.a();
      return new xs.b() {
         @Override
         public xo unpack(@Nullable xk $$0x, xr $$1x) throws xs.a {
            if ($$0 == null) {
               throw new xs.a(xs.a.a);
            } else if ($$0.b().a()) {
               throw new xs.a(xs.a.c);
            } else {
               xt $$2 = xs.this.b;
               if ($$2 == null) {
                  throw new xs.a(xs.a.b);
               } else if ($$1.b().isBefore(xs.this.c)) {
                  this.setChainBroken();
                  throw new xs.a(xs.a.e);
               } else {
                  xs.this.c = $$1.b();
                  xo $$3 = new xo($$2, $$0, $$1, null, xc.c);
                  if (!$$3.a($$1)) {
                     this.setChainBroken();
                     throw new xs.a(xs.a.d);
                  } else {
                     if ($$3.a(Instant.now())) {
                        xs.a.warn("Received expired chat: '{}'. Is the client/server system time unsynchronized?", $$1.a());
                     }

                     xs.this.b = $$2.a();
                     return $$3;
                  }
               }
            }
         }

         @Override
         public void setChainBroken() {
            xs.this.b = null;
         }
      };
   }

   public static class a extends xy {
      static final wy a = wy.c("chat.disabled.missingProfileKey");
      static final wy b = wy.c("chat.disabled.chain_broken");
      static final wy c = wy.c("chat.disabled.expiredProfileKey");
      static final wy d = wy.c("chat.disabled.invalid_signature");
      static final wy e = wy.c("chat.disabled.out_of_order_chat");

      public a(wy $$0) {
         super($$0);
      }
   }

   @FunctionalInterface
   public interface b {
      static xs.b unsigned(UUID $$0, BooleanSupplier $$1) {
         return ($$2, $$3) -> {
            if ($$1.getAsBoolean()) {
               throw new xs.a(xs.a.a);
            } else {
               return xo.a($$0, $$3.a());
            }
         };
      }

      xo unpack(@Nullable xk var1, xr var2) throws xs.a;

      default void setChainBroken() {
      }
   }

   @FunctionalInterface
   public interface c {
      xs.c a = $$0 -> null;

      @Nullable
      xk pack(xr var1);
   }
}
