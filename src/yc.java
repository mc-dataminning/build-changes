import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class yc {
   static final Logger a = LogUtils.getLogger();
   @Nullable
   yd b;
   Instant c = Instant.EPOCH;

   public yc(UUID $$0, UUID $$1) {
      this.b = yd.a($$0, $$1);
   }

   public yc.c a(azy $$0) {
      return $$1 -> {
         yd $$2 = this.b;
         if ($$2 == null) {
            return null;
         } else {
            this.b = $$2.a();
            return new xu($$0.sign($$2x -> xy.a($$2x, $$2, $$1)));
         }
      };
   }

   public yc.b a(final coq $$0) {
      final azx $$1 = $$0.a();
      return new yc.b() {
         @Override
         public xy unpack(@Nullable xu $$0x, yb $$1x) throws yc.a {
            if ($$0 == null) {
               throw new yc.a(yc.a.a);
            } else if ($$0.b().a()) {
               throw new yc.a(yc.a.c);
            } else {
               yd $$2 = yc.this.b;
               if ($$2 == null) {
                  throw new yc.a(yc.a.b);
               } else if ($$1.b().isBefore(yc.this.c)) {
                  this.setChainBroken();
                  throw new yc.a(yc.a.e);
               } else {
                  yc.this.c = $$1.b();
                  xy $$3 = new xy($$2, $$0, $$1, null, xm.c);
                  if (!$$3.a($$1)) {
                     this.setChainBroken();
                     throw new yc.a(yc.a.d);
                  } else {
                     if ($$3.a(Instant.now())) {
                        yc.a.warn("Received expired chat: '{}'. Is the client/server system time unsynchronized?", $$1.a());
                     }

                     yc.this.b = $$2.a();
                     return $$3;
                  }
               }
            }
         }

         @Override
         public void setChainBroken() {
            yc.this.b = null;
         }
      };
   }

   public static class a extends yi {
      static final xi a = xi.c("chat.disabled.missingProfileKey");
      static final xi b = xi.c("chat.disabled.chain_broken");
      static final xi c = xi.c("chat.disabled.expiredProfileKey");
      static final xi d = xi.c("chat.disabled.invalid_signature");
      static final xi e = xi.c("chat.disabled.out_of_order_chat");

      public a(xi $$0) {
         super($$0);
      }
   }

   @FunctionalInterface
   public interface b {
      static yc.b unsigned(UUID $$0, BooleanSupplier $$1) {
         return ($$2, $$3) -> {
            if ($$1.getAsBoolean()) {
               throw new yc.a(yc.a.a);
            } else {
               return xy.a($$0, $$3.a());
            }
         };
      }

      xy unpack(@Nullable xu var1, yb var2) throws yc.a;

      default void setChainBroken() {
      }
   }

   @FunctionalInterface
   public interface c {
      yc.c a = $$0 -> null;

      @Nullable
      xu pack(yb var1);
   }
}
