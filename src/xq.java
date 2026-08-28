import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class xq {
   static final Logger a = LogUtils.getLogger();
   @Nullable
   xr b;
   Instant c = Instant.EPOCH;

   public xq(UUID $$0, UUID $$1) {
      this.b = xr.a($$0, $$1);
   }

   public xq.c a(baa $$0) {
      return $$1 -> {
         xr $$2 = this.b;
         if ($$2 == null) {
            return null;
         } else {
            this.b = $$2.a();
            return new xi($$0.sign($$2x -> xm.a($$2x, $$2, $$1)));
         }
      };
   }

   public xq.b a(final cqv $$0) {
      final azz $$1 = $$0.a();
      return new xq.b() {
         @Override
         public xm unpack(@Nullable xi $$0x, xp $$1x) throws xq.a {
            if ($$0 == null) {
               throw new xq.a(xq.a.a);
            } else if ($$0.b().a()) {
               throw new xq.a(xq.a.c);
            } else {
               xr $$2 = xq.this.b;
               if ($$2 == null) {
                  throw new xq.a(xq.a.b);
               } else if ($$1.b().isBefore(xq.this.c)) {
                  this.setChainBroken();
                  throw new xq.a(xq.a.e);
               } else {
                  xq.this.c = $$1.b();
                  xm $$3 = new xm($$2, $$0, $$1, null, xa.c);
                  if (!$$3.a($$1)) {
                     this.setChainBroken();
                     throw new xq.a(xq.a.d);
                  } else {
                     if ($$3.a(Instant.now())) {
                        xq.a.warn("Received expired chat: '{}'. Is the client/server system time unsynchronized?", $$1.a());
                     }

                     xq.this.b = $$2.a();
                     return $$3;
                  }
               }
            }
         }

         @Override
         public void setChainBroken() {
            xq.this.b = null;
         }
      };
   }

   public static class a extends xw {
      static final ww a = ww.c("chat.disabled.missingProfileKey");
      static final ww b = ww.c("chat.disabled.chain_broken");
      static final ww c = ww.c("chat.disabled.expiredProfileKey");
      static final ww d = ww.c("chat.disabled.invalid_signature");
      static final ww e = ww.c("chat.disabled.out_of_order_chat");

      public a(ww $$0) {
         super($$0);
      }
   }

   @FunctionalInterface
   public interface b {
      static xq.b unsigned(UUID $$0, BooleanSupplier $$1) {
         return ($$2, $$3) -> {
            if ($$1.getAsBoolean()) {
               throw new xq.a(xq.a.a);
            } else {
               return xm.a($$0, $$3.a());
            }
         };
      }

      xm unpack(@Nullable xi var1, xp var2) throws xq.a;

      default void setChainBroken() {
      }
   }

   @FunctionalInterface
   public interface c {
      xq.c a = $$0 -> null;

      @Nullable
      xi pack(xp var1);
   }
}
