import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class yd {
   static final Logger a = LogUtils.getLogger();
   @Nullable
   ye b;
   Instant c = Instant.EPOCH;

   public yd(UUID $$0, UUID $$1) {
      this.b = ye.a($$0, $$1);
   }

   public yd.c a(baa $$0) {
      return $$1 -> {
         ye $$2 = this.b;
         if ($$2 == null) {
            return null;
         } else {
            this.b = $$2.a();
            return new xv($$0.sign($$2x -> xz.a($$2x, $$2, $$1)));
         }
      };
   }

   public yd.b a(final cox $$0) {
      final azz $$1 = $$0.a();
      return new yd.b() {
         @Override
         public xz unpack(@Nullable xv $$0x, yc $$1x) throws yd.a {
            if ($$0 == null) {
               throw new yd.a(yd.a.a);
            } else if ($$0.b().a()) {
               throw new yd.a(yd.a.c);
            } else {
               ye $$2 = yd.this.b;
               if ($$2 == null) {
                  throw new yd.a(yd.a.b);
               } else if ($$1.b().isBefore(yd.this.c)) {
                  this.setChainBroken();
                  throw new yd.a(yd.a.e);
               } else {
                  yd.this.c = $$1.b();
                  xz $$3 = new xz($$2, $$0, $$1, null, xn.c);
                  if (!$$3.a($$1)) {
                     this.setChainBroken();
                     throw new yd.a(yd.a.d);
                  } else {
                     if ($$3.a(Instant.now())) {
                        yd.a.warn("Received expired chat: '{}'. Is the client/server system time unsynchronized?", $$1.a());
                     }

                     yd.this.b = $$2.a();
                     return $$3;
                  }
               }
            }
         }

         @Override
         public void setChainBroken() {
            yd.this.b = null;
         }
      };
   }

   public static class a extends yj {
      static final xj a = xj.c("chat.disabled.missingProfileKey");
      static final xj b = xj.c("chat.disabled.chain_broken");
      static final xj c = xj.c("chat.disabled.expiredProfileKey");
      static final xj d = xj.c("chat.disabled.invalid_signature");
      static final xj e = xj.c("chat.disabled.out_of_order_chat");

      public a(xj $$0) {
         super($$0);
      }
   }

   @FunctionalInterface
   public interface b {
      static yd.b unsigned(UUID $$0, BooleanSupplier $$1) {
         return ($$2, $$3) -> {
            if ($$1.getAsBoolean()) {
               throw new yd.a(yd.a.a);
            } else {
               return xz.a($$0, $$3.a());
            }
         };
      }

      xz unpack(@Nullable xv var1, yc var2) throws yd.a;

      default void setChainBroken() {
      }
   }

   @FunctionalInterface
   public interface c {
      yd.c a = $$0 -> null;

      @Nullable
      xv pack(yc var1);
   }
}
