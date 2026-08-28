import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ye {
   static final Logger a = LogUtils.getLogger();
   @Nullable
   yf b;
   Instant c = Instant.EPOCH;

   public ye(UUID $$0, UUID $$1) {
      this.b = yf.a($$0, $$1);
   }

   public ye.c a(bai $$0) {
      return $$1 -> {
         yf $$2 = this.b;
         if ($$2 == null) {
            return null;
         } else {
            this.b = $$2.a();
            return new xw($$0.sign($$2x -> ya.a($$2x, $$2, $$1)));
         }
      };
   }

   public ye.b a(final cpr $$0) {
      final bah $$1 = $$0.a();
      return new ye.b() {
         @Override
         public ya unpack(@Nullable xw $$0x, yd $$1x) throws ye.a {
            if ($$0 == null) {
               throw new ye.a(ye.a.a);
            } else if ($$0.b().a()) {
               throw new ye.a(ye.a.c);
            } else {
               yf $$2 = ye.this.b;
               if ($$2 == null) {
                  throw new ye.a(ye.a.b);
               } else if ($$1.b().isBefore(ye.this.c)) {
                  this.setChainBroken();
                  throw new ye.a(ye.a.e);
               } else {
                  ye.this.c = $$1.b();
                  ya $$3 = new ya($$2, $$0, $$1, null, xo.c);
                  if (!$$3.a($$1)) {
                     this.setChainBroken();
                     throw new ye.a(ye.a.d);
                  } else {
                     if ($$3.a(Instant.now())) {
                        ye.a.warn("Received expired chat: '{}'. Is the client/server system time unsynchronized?", $$1.a());
                     }

                     ye.this.b = $$2.a();
                     return $$3;
                  }
               }
            }
         }

         @Override
         public void setChainBroken() {
            ye.this.b = null;
         }
      };
   }

   public static class a extends yk {
      static final xk a = xk.c("chat.disabled.missingProfileKey");
      static final xk b = xk.c("chat.disabled.chain_broken");
      static final xk c = xk.c("chat.disabled.expiredProfileKey");
      static final xk d = xk.c("chat.disabled.invalid_signature");
      static final xk e = xk.c("chat.disabled.out_of_order_chat");

      public a(xk $$0) {
         super($$0);
      }
   }

   @FunctionalInterface
   public interface b {
      static ye.b unsigned(UUID $$0, BooleanSupplier $$1) {
         return ($$2, $$3) -> {
            if ($$1.getAsBoolean()) {
               throw new ye.a(ye.a.a);
            } else {
               return ya.a($$0, $$3.a());
            }
         };
      }

      ya unpack(@Nullable xw var1, yd var2) throws ye.a;

      default void setChainBroken() {
      }
   }

   @FunctionalInterface
   public interface c {
      ye.c a = $$0 -> null;

      @Nullable
      xw pack(yd var1);
   }
}
