import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class xu {
   static final Logger a = LogUtils.getLogger();
   @Nullable
   xv b;
   Instant c = Instant.EPOCH;

   public xu(UUID $$0, UUID $$1) {
      this.b = xv.a($$0, $$1);
   }

   public xu.c a(bae $$0) {
      return $$1 -> {
         xv $$2 = this.b;
         if ($$2 == null) {
            return null;
         } else {
            this.b = $$2.a();
            return new xm($$0.sign($$2x -> xq.a($$2x, $$2, $$1)));
         }
      };
   }

   public xu.b a(final csb $$0) {
      final bad $$1 = $$0.a();
      return new xu.b() {
         @Override
         public xq unpack(@Nullable xm $$0x, xt $$1x) throws xu.a {
            if ($$0 == null) {
               throw new xu.a(xu.a.a);
            } else if ($$0.b().a()) {
               throw new xu.a(xu.a.c);
            } else {
               xv $$2 = xu.this.b;
               if ($$2 == null) {
                  throw new xu.a(xu.a.b);
               } else if ($$1.b().isBefore(xu.this.c)) {
                  this.setChainBroken();
                  throw new xu.a(xu.a.e);
               } else {
                  xu.this.c = $$1.b();
                  xq $$3 = new xq($$2, $$0, $$1, null, xe.c);
                  if (!$$3.a($$1)) {
                     this.setChainBroken();
                     throw new xu.a(xu.a.d);
                  } else {
                     if ($$3.a(Instant.now())) {
                        xu.a.warn("Received expired chat: '{}'. Is the client/server system time unsynchronized?", $$1.a());
                     }

                     xu.this.b = $$2.a();
                     return $$3;
                  }
               }
            }
         }

         @Override
         public void setChainBroken() {
            xu.this.b = null;
         }
      };
   }

   public static class a extends ya {
      static final xa a = xa.c("chat.disabled.missingProfileKey");
      static final xa b = xa.c("chat.disabled.chain_broken");
      static final xa c = xa.c("chat.disabled.expiredProfileKey");
      static final xa d = xa.c("chat.disabled.invalid_signature");
      static final xa e = xa.c("chat.disabled.out_of_order_chat");

      public a(xa $$0) {
         super($$0);
      }
   }

   @FunctionalInterface
   public interface b {
      static xu.b unsigned(UUID $$0, BooleanSupplier $$1) {
         return ($$2, $$3) -> {
            if ($$1.getAsBoolean()) {
               throw new xu.a(xu.a.a);
            } else {
               return xq.a($$0, $$3.a());
            }
         };
      }

      xq unpack(@Nullable xm var1, xt var2) throws xu.a;

      default void setChainBroken() {
      }
   }

   @FunctionalInterface
   public interface c {
      xu.c a = $$0 -> null;

      @Nullable
      xm pack(xt var1);
   }
}
