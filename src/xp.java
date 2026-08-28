import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class xp {
   static final Logger a = LogUtils.getLogger();
   @Nullable
   xq b;
   Instant c = Instant.EPOCH;

   public xp(UUID $$0, UUID $$1) {
      this.b = xq.a($$0, $$1);
   }

   public xp.c a(azy $$0) {
      return $$1 -> {
         xq $$2 = this.b;
         if ($$2 == null) {
            return null;
         } else {
            this.b = $$2.a();
            return new xh($$0.sign($$2x -> xl.a($$2x, $$2, $$1)));
         }
      };
   }

   public xp.b a(final cql $$0) {
      final azx $$1 = $$0.a();
      return new xp.b() {
         @Override
         public xl unpack(@Nullable xh $$0x, xo $$1x) throws xp.a {
            if ($$0 == null) {
               throw new xp.a(xp.a.a);
            } else if ($$0.b().a()) {
               throw new xp.a(xp.a.c);
            } else {
               xq $$2 = xp.this.b;
               if ($$2 == null) {
                  throw new xp.a(xp.a.b);
               } else if ($$1.b().isBefore(xp.this.c)) {
                  this.setChainBroken();
                  throw new xp.a(xp.a.e);
               } else {
                  xp.this.c = $$1.b();
                  xl $$3 = new xl($$2, $$0, $$1, null, wz.c);
                  if (!$$3.a($$1)) {
                     this.setChainBroken();
                     throw new xp.a(xp.a.d);
                  } else {
                     if ($$3.a(Instant.now())) {
                        xp.a.warn("Received expired chat: '{}'. Is the client/server system time unsynchronized?", $$1.a());
                     }

                     xp.this.b = $$2.a();
                     return $$3;
                  }
               }
            }
         }

         @Override
         public void setChainBroken() {
            xp.this.b = null;
         }
      };
   }

   public static class a extends xv {
      static final wv a = wv.c("chat.disabled.missingProfileKey");
      static final wv b = wv.c("chat.disabled.chain_broken");
      static final wv c = wv.c("chat.disabled.expiredProfileKey");
      static final wv d = wv.c("chat.disabled.invalid_signature");
      static final wv e = wv.c("chat.disabled.out_of_order_chat");

      public a(wv $$0) {
         super($$0);
      }
   }

   @FunctionalInterface
   public interface b {
      static xp.b unsigned(UUID $$0, BooleanSupplier $$1) {
         return ($$2, $$3) -> {
            if ($$1.getAsBoolean()) {
               throw new xp.a(xp.a.a);
            } else {
               return xl.a($$0, $$3.a());
            }
         };
      }

      xl unpack(@Nullable xh var1, xo var2) throws xp.a;

      default void setChainBroken() {
      }
   }

   @FunctionalInterface
   public interface c {
      xp.c a = $$0 -> null;

      @Nullable
      xh pack(xo var1);
   }
}
