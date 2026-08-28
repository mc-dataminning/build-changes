import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class yf {
   static final Logger a = LogUtils.getLogger();
   @Nullable
   yg b;
   Instant c = Instant.EPOCH;

   public yf(UUID $$0, UUID $$1) {
      this.b = yg.a($$0, $$1);
   }

   public yf.c a(bab $$0) {
      return $$1 -> {
         yg $$2 = this.b;
         if ($$2 == null) {
            return null;
         } else {
            this.b = $$2.a();
            return new xx($$0.sign($$2x -> yb.a($$2x, $$2, $$1)));
         }
      };
   }

   public yf.b a(final cou $$0) {
      final baa $$1 = $$0.a();
      return new yf.b() {
         @Override
         public yb unpack(@Nullable xx $$0x, ye $$1x) throws yf.a {
            if ($$0 == null) {
               throw new yf.a(yf.a.a);
            } else if ($$0.b().a()) {
               throw new yf.a(yf.a.c);
            } else {
               yg $$2 = yf.this.b;
               if ($$2 == null) {
                  throw new yf.a(yf.a.b);
               } else if ($$1.b().isBefore(yf.this.c)) {
                  this.setChainBroken();
                  throw new yf.a(yf.a.e);
               } else {
                  yf.this.c = $$1.b();
                  yb $$3 = new yb($$2, $$0, $$1, null, xp.c);
                  if (!$$3.a($$1)) {
                     this.setChainBroken();
                     throw new yf.a(yf.a.d);
                  } else {
                     if ($$3.a(Instant.now())) {
                        yf.a.warn("Received expired chat: '{}'. Is the client/server system time unsynchronized?", $$1.a());
                     }

                     yf.this.b = $$2.a();
                     return $$3;
                  }
               }
            }
         }

         @Override
         public void setChainBroken() {
            yf.this.b = null;
         }
      };
   }

   public static class a extends yl {
      static final xl a = xl.c("chat.disabled.missingProfileKey");
      static final xl b = xl.c("chat.disabled.chain_broken");
      static final xl c = xl.c("chat.disabled.expiredProfileKey");
      static final xl d = xl.c("chat.disabled.invalid_signature");
      static final xl e = xl.c("chat.disabled.out_of_order_chat");

      public a(xl $$0) {
         super($$0);
      }
   }

   @FunctionalInterface
   public interface b {
      static yf.b unsigned(UUID $$0, BooleanSupplier $$1) {
         return ($$2, $$3) -> {
            if ($$1.getAsBoolean()) {
               throw new yf.a(yf.a.a);
            } else {
               return yb.a($$0, $$3.a());
            }
         };
      }

      yb unpack(@Nullable xx var1, ye var2) throws yf.a;

      default void setChainBroken() {
      }
   }

   @FunctionalInterface
   public interface c {
      yf.c a = $$0 -> null;

      @Nullable
      xx pack(ye var1);
   }
}
