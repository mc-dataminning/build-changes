import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class yj {
   static final Logger a = LogUtils.getLogger();
   @Nullable
   yk b;
   Instant c = Instant.EPOCH;

   public yj(UUID $$0, UUID $$1) {
      this.b = yk.a($$0, $$1);
   }

   public yj.c a(azn $$0) {
      return $$1 -> {
         yk $$2 = this.b;
         if ($$2 == null) {
            return null;
         } else {
            this.b = $$2.a();
            return new yb($$0.sign($$2x -> yf.a($$2x, $$2, $$1)));
         }
      };
   }

   public yj.b a(final cnc $$0) {
      final azm $$1 = $$0.a();
      return new yj.b() {
         @Override
         public yf unpack(@Nullable yb $$0x, yi $$1x) throws yj.a {
            if ($$0 == null) {
               throw new yj.a(yj.a.a);
            } else if ($$0.b().a()) {
               throw new yj.a(yj.a.c);
            } else {
               yk $$2 = yj.this.b;
               if ($$2 == null) {
                  throw new yj.a(yj.a.b);
               } else if ($$1.b().isBefore(yj.this.c)) {
                  this.setChainBroken();
                  throw new yj.a(yj.a.e);
               } else {
                  yj.this.c = $$1.b();
                  yf $$3 = new yf($$2, $$0, $$1, null, xt.c);
                  if (!$$3.a($$1)) {
                     this.setChainBroken();
                     throw new yj.a(yj.a.d);
                  } else {
                     if ($$3.a(Instant.now())) {
                        yj.a.warn("Received expired chat: '{}'. Is the client/server system time unsynchronized?", $$1.a());
                     }

                     yj.this.b = $$2.a();
                     return $$3;
                  }
               }
            }
         }

         @Override
         public void setChainBroken() {
            yj.this.b = null;
         }
      };
   }

   public static class a extends yp {
      static final xp a = xp.c("chat.disabled.missingProfileKey");
      static final xp b = xp.c("chat.disabled.chain_broken");
      static final xp c = xp.c("chat.disabled.expiredProfileKey");
      static final xp d = xp.c("chat.disabled.invalid_signature");
      static final xp e = xp.c("chat.disabled.out_of_order_chat");

      public a(xp $$0) {
         super($$0);
      }
   }

   @FunctionalInterface
   public interface b {
      static yj.b unsigned(UUID $$0, BooleanSupplier $$1) {
         return ($$2, $$3) -> {
            if ($$1.getAsBoolean()) {
               throw new yj.a(yj.a.a);
            } else {
               return yf.a($$0, $$3.a());
            }
         };
      }

      yf unpack(@Nullable yb var1, yi var2) throws yj.a;

      default void setChainBroken() {
      }
   }

   @FunctionalInterface
   public interface c {
      yj.c a = $$0 -> null;

      @Nullable
      yb pack(yi var1);
   }
}
