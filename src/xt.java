import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class xt {
   static final Logger a = LogUtils.getLogger();
   @Nullable
   xu b;
   Instant c = Instant.EPOCH;

   public xt(UUID $$0, UUID $$1) {
      this.b = xu.a($$0, $$1);
   }

   public xt.c a(azc $$0) {
      return $$1 -> {
         xu $$2 = this.b;
         if ($$2 == null) {
            return null;
         } else {
            this.b = $$2.a();
            return new xl($$0.sign($$2x -> xp.a($$2x, $$2, $$1)));
         }
      };
   }

   public xt.b a(final cna $$0) {
      final azb $$1 = $$0.a();
      return new xt.b() {
         @Override
         public xp unpack(@Nullable xl $$0x, xs $$1x) throws xt.a {
            if ($$0 == null) {
               throw new xt.a(xt.a.a);
            } else if ($$0.b().a()) {
               throw new xt.a(xt.a.c);
            } else {
               xu $$2 = xt.this.b;
               if ($$2 == null) {
                  throw new xt.a(xt.a.b);
               } else if ($$1.b().isBefore(xt.this.c)) {
                  this.setChainBroken();
                  throw new xt.a(xt.a.e);
               } else {
                  xt.this.c = $$1.b();
                  xp $$3 = new xp($$2, $$0, $$1, null, xd.c);
                  if (!$$3.a($$1)) {
                     this.setChainBroken();
                     throw new xt.a(xt.a.d);
                  } else {
                     if ($$3.a(Instant.now())) {
                        xt.a.warn("Received expired chat: '{}'. Is the client/server system time unsynchronized?", $$1.a());
                     }

                     xt.this.b = $$2.a();
                     return $$3;
                  }
               }
            }
         }

         @Override
         public void setChainBroken() {
            xt.this.b = null;
         }
      };
   }

   public static class a extends xz {
      static final wz a = wz.c("chat.disabled.missingProfileKey");
      static final wz b = wz.c("chat.disabled.chain_broken");
      static final wz c = wz.c("chat.disabled.expiredProfileKey");
      static final wz d = wz.c("chat.disabled.invalid_signature");
      static final wz e = wz.c("chat.disabled.out_of_order_chat");

      public a(wz $$0) {
         super($$0);
      }
   }

   @FunctionalInterface
   public interface b {
      static xt.b unsigned(UUID $$0, BooleanSupplier $$1) {
         return ($$2, $$3) -> {
            if ($$1.getAsBoolean()) {
               throw new xt.a(xt.a.a);
            } else {
               return xp.a($$0, $$3.a());
            }
         };
      }

      xp unpack(@Nullable xl var1, xs var2) throws xt.a;

      default void setChainBroken() {
      }
   }

   @FunctionalInterface
   public interface c {
      xt.c a = $$0 -> null;

      @Nullable
      xl pack(xs var1);
   }
}
