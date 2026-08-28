import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class yb {
   static final Logger a = LogUtils.getLogger();
   @Nullable
   yc b;
   Instant c = Instant.EPOCH;

   public yb(UUID $$0, UUID $$1) {
      this.b = yc.a($$0, $$1);
   }

   public yb.c a(azx $$0) {
      return $$1 -> {
         yc $$2 = this.b;
         if ($$2 == null) {
            return null;
         } else {
            this.b = $$2.a();
            return new xt($$0.sign($$2x -> xx.a($$2x, $$2, $$1)));
         }
      };
   }

   public yb.b a(final cok $$0) {
      final azw $$1 = $$0.a();
      return new yb.b() {
         @Override
         public xx unpack(@Nullable xt $$0x, ya $$1x) throws yb.a {
            if ($$0 == null) {
               throw new yb.a(yb.a.a);
            } else if ($$0.b().a()) {
               throw new yb.a(yb.a.c);
            } else {
               yc $$2 = yb.this.b;
               if ($$2 == null) {
                  throw new yb.a(yb.a.b);
               } else if ($$1.b().isBefore(yb.this.c)) {
                  this.setChainBroken();
                  throw new yb.a(yb.a.e);
               } else {
                  yb.this.c = $$1.b();
                  xx $$3 = new xx($$2, $$0, $$1, null, xl.c);
                  if (!$$3.a($$1)) {
                     this.setChainBroken();
                     throw new yb.a(yb.a.d);
                  } else {
                     if ($$3.a(Instant.now())) {
                        yb.a.warn("Received expired chat: '{}'. Is the client/server system time unsynchronized?", $$1.a());
                     }

                     yb.this.b = $$2.a();
                     return $$3;
                  }
               }
            }
         }

         @Override
         public void setChainBroken() {
            yb.this.b = null;
         }
      };
   }

   public static class a extends yh {
      static final xh a = xh.c("chat.disabled.missingProfileKey");
      static final xh b = xh.c("chat.disabled.chain_broken");
      static final xh c = xh.c("chat.disabled.expiredProfileKey");
      static final xh d = xh.c("chat.disabled.invalid_signature");
      static final xh e = xh.c("chat.disabled.out_of_order_chat");

      public a(xh $$0) {
         super($$0);
      }
   }

   @FunctionalInterface
   public interface b {
      static yb.b unsigned(UUID $$0, BooleanSupplier $$1) {
         return ($$2, $$3) -> {
            if ($$1.getAsBoolean()) {
               throw new yb.a(yb.a.a);
            } else {
               return xx.a($$0, $$3.a());
            }
         };
      }

      xx unpack(@Nullable xt var1, ya var2) throws yb.a;

      default void setChainBroken() {
      }
   }

   @FunctionalInterface
   public interface c {
      yb.c a = $$0 -> null;

      @Nullable
      xt pack(ya var1);
   }
}
