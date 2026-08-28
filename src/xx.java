import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class xx {
   static final Logger a = LogUtils.getLogger();
   @Nullable
   xy b;
   Instant c = Instant.EPOCH;

   public xx(UUID $$0, UUID $$1) {
      this.b = xy.a($$0, $$1);
   }

   public xx.c a(azq $$0) {
      return $$1 -> {
         xy $$2 = this.b;
         if ($$2 == null) {
            return null;
         } else {
            this.b = $$2.a();
            return new xp($$0.sign($$2x -> xt.a($$2x, $$2, $$1)));
         }
      };
   }

   public xx.b a(final cns $$0) {
      final azp $$1 = $$0.a();
      return new xx.b() {
         @Override
         public xt unpack(@Nullable xp $$0x, xw $$1x) throws xx.a {
            if ($$0 == null) {
               throw new xx.a(xx.a.a);
            } else if ($$0.b().a()) {
               throw new xx.a(xx.a.c);
            } else {
               xy $$2 = xx.this.b;
               if ($$2 == null) {
                  throw new xx.a(xx.a.b);
               } else if ($$1.b().isBefore(xx.this.c)) {
                  this.setChainBroken();
                  throw new xx.a(xx.a.e);
               } else {
                  xx.this.c = $$1.b();
                  xt $$3 = new xt($$2, $$0, $$1, null, xh.c);
                  if (!$$3.a($$1)) {
                     this.setChainBroken();
                     throw new xx.a(xx.a.d);
                  } else {
                     if ($$3.a(Instant.now())) {
                        xx.a.warn("Received expired chat: '{}'. Is the client/server system time unsynchronized?", $$1.a());
                     }

                     xx.this.b = $$2.a();
                     return $$3;
                  }
               }
            }
         }

         @Override
         public void setChainBroken() {
            xx.this.b = null;
         }
      };
   }

   public static class a extends yd {
      static final xd a = xd.c("chat.disabled.missingProfileKey");
      static final xd b = xd.c("chat.disabled.chain_broken");
      static final xd c = xd.c("chat.disabled.expiredProfileKey");
      static final xd d = xd.c("chat.disabled.invalid_signature");
      static final xd e = xd.c("chat.disabled.out_of_order_chat");

      public a(xd $$0) {
         super($$0);
      }
   }

   @FunctionalInterface
   public interface b {
      static xx.b unsigned(UUID $$0, BooleanSupplier $$1) {
         return ($$2, $$3) -> {
            if ($$1.getAsBoolean()) {
               throw new xx.a(xx.a.a);
            } else {
               return xt.a($$0, $$3.a());
            }
         };
      }

      xt unpack(@Nullable xp var1, xw var2) throws xx.a;

      default void setChainBroken() {
      }
   }

   @FunctionalInterface
   public interface c {
      xx.c a = $$0 -> null;

      @Nullable
      xp pack(xw var1);
   }
}
