import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class xy {
   static final Logger a = LogUtils.getLogger();
   @Nullable
   xz b;
   Instant c = Instant.EPOCH;

   public xy(UUID $$0, UUID $$1) {
      this.b = xz.a($$0, $$1);
   }

   public xy.c a(azt $$0) {
      return $$1 -> {
         xz $$2 = this.b;
         if ($$2 == null) {
            return null;
         } else {
            this.b = $$2.a();
            return new xq($$0.sign($$2x -> xu.a($$2x, $$2, $$1)));
         }
      };
   }

   public xy.b a(final coa $$0) {
      final azs $$1 = $$0.a();
      return new xy.b() {
         @Override
         public xu unpack(@Nullable xq $$0x, xx $$1x) throws xy.a {
            if ($$0 == null) {
               throw new xy.a(xy.a.a);
            } else if ($$0.b().a()) {
               throw new xy.a(xy.a.c);
            } else {
               xz $$2 = xy.this.b;
               if ($$2 == null) {
                  throw new xy.a(xy.a.b);
               } else if ($$1.b().isBefore(xy.this.c)) {
                  this.setChainBroken();
                  throw new xy.a(xy.a.e);
               } else {
                  xy.this.c = $$1.b();
                  xu $$3 = new xu($$2, $$0, $$1, null, xi.c);
                  if (!$$3.a($$1)) {
                     this.setChainBroken();
                     throw new xy.a(xy.a.d);
                  } else {
                     if ($$3.a(Instant.now())) {
                        xy.a.warn("Received expired chat: '{}'. Is the client/server system time unsynchronized?", $$1.a());
                     }

                     xy.this.b = $$2.a();
                     return $$3;
                  }
               }
            }
         }

         @Override
         public void setChainBroken() {
            xy.this.b = null;
         }
      };
   }

   public static class a extends ye {
      static final xe a = xe.c("chat.disabled.missingProfileKey");
      static final xe b = xe.c("chat.disabled.chain_broken");
      static final xe c = xe.c("chat.disabled.expiredProfileKey");
      static final xe d = xe.c("chat.disabled.invalid_signature");
      static final xe e = xe.c("chat.disabled.out_of_order_chat");

      public a(xe $$0) {
         super($$0);
      }
   }

   @FunctionalInterface
   public interface b {
      static xy.b unsigned(UUID $$0, BooleanSupplier $$1) {
         return ($$2, $$3) -> {
            if ($$1.getAsBoolean()) {
               throw new xy.a(xy.a.a);
            } else {
               return xu.a($$0, $$3.a());
            }
         };
      }

      xu unpack(@Nullable xq var1, xx var2) throws xy.a;

      default void setChainBroken() {
      }
   }

   @FunctionalInterface
   public interface c {
      xy.c a = $$0 -> null;

      @Nullable
      xq pack(xx var1);
   }
}
