import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class xw {
   static final Logger a = LogUtils.getLogger();
   @Nullable
   xx b;
   Instant c = Instant.EPOCH;

   public xw(UUID $$0, UUID $$1) {
      this.b = xx.a($$0, $$1);
   }

   public xw.c a(bag $$0) {
      return $$1 -> {
         xx $$2 = this.b;
         if ($$2 == null) {
            return null;
         } else {
            this.b = $$2.a();
            return new xo($$0.sign($$2x -> xs.a($$2x, $$2, $$1)));
         }
      };
   }

   public xw.b a(final csd $$0) {
      final baf $$1 = $$0.a();
      return new xw.b() {
         @Override
         public xs unpack(@Nullable xo $$0x, xv $$1x) throws xw.a {
            if ($$0 == null) {
               throw new xw.a(xw.a.a);
            } else if ($$0.b().a()) {
               throw new xw.a(xw.a.c);
            } else {
               xx $$2 = xw.this.b;
               if ($$2 == null) {
                  throw new xw.a(xw.a.b);
               } else if ($$1.b().isBefore(xw.this.c)) {
                  this.setChainBroken();
                  throw new xw.a(xw.a.e);
               } else {
                  xw.this.c = $$1.b();
                  xs $$3 = new xs($$2, $$0, $$1, null, xg.c);
                  if (!$$3.a($$1)) {
                     this.setChainBroken();
                     throw new xw.a(xw.a.d);
                  } else {
                     if ($$3.a(Instant.now())) {
                        xw.a.warn("Received expired chat: '{}'. Is the client/server system time unsynchronized?", $$1.a());
                     }

                     xw.this.b = $$2.a();
                     return $$3;
                  }
               }
            }
         }

         @Override
         public void setChainBroken() {
            xw.this.b = null;
         }
      };
   }

   public static class a extends yc {
      static final xc a = xc.c("chat.disabled.missingProfileKey");
      static final xc b = xc.c("chat.disabled.chain_broken");
      static final xc c = xc.c("chat.disabled.expiredProfileKey");
      static final xc d = xc.c("chat.disabled.invalid_signature");
      static final xc e = xc.c("chat.disabled.out_of_order_chat");

      public a(xc $$0) {
         super($$0);
      }
   }

   @FunctionalInterface
   public interface b {
      static xw.b unsigned(UUID $$0, BooleanSupplier $$1) {
         return ($$2, $$3) -> {
            if ($$1.getAsBoolean()) {
               throw new xw.a(xw.a.a);
            } else {
               return xs.a($$0, $$3.a());
            }
         };
      }

      xs unpack(@Nullable xo var1, xv var2) throws xw.a;

      default void setChainBroken() {
      }
   }

   @FunctionalInterface
   public interface c {
      xw.c a = $$0 -> null;

      @Nullable
      xo pack(xv var1);
   }
}
