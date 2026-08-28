import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ya {
   static final Logger a = LogUtils.getLogger();
   @Nullable
   yb b;
   Instant c = Instant.EPOCH;

   public ya(UUID $$0, UUID $$1) {
      this.b = yb.a($$0, $$1);
   }

   public ya.c a(bap $$0) {
      return $$1 -> {
         yb $$2 = this.b;
         if ($$2 == null) {
            return null;
         } else {
            this.b = $$2.a();
            return new xs($$0.sign($$2x -> xw.a($$2x, $$2, $$1)));
         }
      };
   }

   public ya.b a(final csm $$0) {
      final bao $$1 = $$0.a();
      return new ya.b() {
         @Override
         public xw unpack(@Nullable xs $$0x, xz $$1x) throws ya.a {
            if ($$0 == null) {
               throw new ya.a(ya.a.a);
            } else if ($$0.b().a()) {
               throw new ya.a(ya.a.c);
            } else {
               yb $$2 = ya.this.b;
               if ($$2 == null) {
                  throw new ya.a(ya.a.b);
               } else if ($$1.b().isBefore(ya.this.c)) {
                  this.setChainBroken();
                  throw new ya.a(ya.a.e);
               } else {
                  ya.this.c = $$1.b();
                  xw $$3 = new xw($$2, $$0, $$1, null, xk.c);
                  if (!$$3.a($$1)) {
                     this.setChainBroken();
                     throw new ya.a(ya.a.d);
                  } else {
                     if ($$3.a(Instant.now())) {
                        ya.a.warn("Received expired chat: '{}'. Is the client/server system time unsynchronized?", $$1.a());
                     }

                     ya.this.b = $$2.a();
                     return $$3;
                  }
               }
            }
         }

         @Override
         public void setChainBroken() {
            ya.this.b = null;
         }
      };
   }

   public static class a extends yg {
      static final xg a = xg.c("chat.disabled.missingProfileKey");
      static final xg b = xg.c("chat.disabled.chain_broken");
      static final xg c = xg.c("chat.disabled.expiredProfileKey");
      static final xg d = xg.c("chat.disabled.invalid_signature");
      static final xg e = xg.c("chat.disabled.out_of_order_chat");

      public a(xg $$0) {
         super($$0);
      }
   }

   @FunctionalInterface
   public interface b {
      static ya.b unsigned(UUID $$0, BooleanSupplier $$1) {
         return ($$2, $$3) -> {
            if ($$1.getAsBoolean()) {
               throw new ya.a(ya.a.a);
            } else {
               return xw.a($$0, $$3.a());
            }
         };
      }

      xw unpack(@Nullable xs var1, xz var2) throws ya.a;

      default void setChainBroken() {
      }
   }

   @FunctionalInterface
   public interface c {
      ya.c a = $$0 -> null;

      @Nullable
      xs pack(xz var1);
   }
}
