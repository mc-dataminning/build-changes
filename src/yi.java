import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class yi {
   static final Logger a = LogUtils.getLogger();
   @Nullable
   yj b;
   Instant c = Instant.EPOCH;

   public yi(UUID $$0, UUID $$1) {
      this.b = yj.a($$0, $$1);
   }

   public yi.c a(azl $$0) {
      return $$1 -> {
         yj $$2 = this.b;
         if ($$2 == null) {
            return null;
         } else {
            this.b = $$2.a();
            return new ya($$0.sign($$2x -> ye.a($$2x, $$2, $$1)));
         }
      };
   }

   public yi.b a(final cmy $$0) {
      final azk $$1 = $$0.a();
      return new yi.b() {
         @Override
         public ye unpack(@Nullable ya $$0x, yh $$1x) throws yi.a {
            if ($$0 == null) {
               throw new yi.a(yi.a.a);
            } else if ($$0.b().a()) {
               throw new yi.a(yi.a.c);
            } else {
               yj $$2 = yi.this.b;
               if ($$2 == null) {
                  throw new yi.a(yi.a.b);
               } else if ($$1.b().isBefore(yi.this.c)) {
                  this.setChainBroken();
                  throw new yi.a(yi.a.e);
               } else {
                  yi.this.c = $$1.b();
                  ye $$3 = new ye($$2, $$0, $$1, null, xs.c);
                  if (!$$3.a($$1)) {
                     this.setChainBroken();
                     throw new yi.a(yi.a.d);
                  } else {
                     if ($$3.a(Instant.now())) {
                        yi.a.warn("Received expired chat: '{}'. Is the client/server system time unsynchronized?", $$1.a());
                     }

                     yi.this.b = $$2.a();
                     return $$3;
                  }
               }
            }
         }

         @Override
         public void setChainBroken() {
            yi.this.b = null;
         }
      };
   }

   public static class a extends yo {
      static final xo a = xo.c("chat.disabled.missingProfileKey");
      static final xo b = xo.c("chat.disabled.chain_broken");
      static final xo c = xo.c("chat.disabled.expiredProfileKey");
      static final xo d = xo.c("chat.disabled.invalid_signature");
      static final xo e = xo.c("chat.disabled.out_of_order_chat");

      public a(xo $$0) {
         super($$0);
      }
   }

   @FunctionalInterface
   public interface b {
      static yi.b unsigned(UUID $$0, BooleanSupplier $$1) {
         return ($$2, $$3) -> {
            if ($$1.getAsBoolean()) {
               throw new yi.a(yi.a.a);
            } else {
               return ye.a($$0, $$3.a());
            }
         };
      }

      ye unpack(@Nullable ya var1, yh var2) throws yi.a;

      default void setChainBroken() {
      }
   }

   @FunctionalInterface
   public interface c {
      yi.c a = $$0 -> null;

      @Nullable
      ya pack(yh var1);
   }
}
