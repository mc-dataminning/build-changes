import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class xo {
   static final Logger a = LogUtils.getLogger();
   @Nullable
   xp b;
   Instant c = Instant.EPOCH;

   public xo(UUID $$0, UUID $$1) {
      this.b = xp.a($$0, $$1);
   }

   public xo.c a(ayu $$0) {
      return $$1 -> {
         xp $$2 = this.b;
         if ($$2 == null) {
            return null;
         } else {
            this.b = $$2.a();
            return new xg($$0.sign($$2x -> xk.a($$2x, $$2, $$1)));
         }
      };
   }

   public xo.b a(final cmo $$0) {
      final ayt $$1 = $$0.a();
      return new xo.b() {
         @Override
         public xk unpack(@Nullable xg $$0x, xn $$1x) throws xo.a {
            if ($$0 == null) {
               throw new xo.a(xo.a.a);
            } else if ($$0.b().a()) {
               throw new xo.a(xo.a.c);
            } else {
               xp $$2 = xo.this.b;
               if ($$2 == null) {
                  throw new xo.a(xo.a.b);
               } else if ($$1.b().isBefore(xo.this.c)) {
                  this.setChainBroken();
                  throw new xo.a(xo.a.e);
               } else {
                  xo.this.c = $$1.b();
                  xk $$3 = new xk($$2, $$0, $$1, null, wy.c);
                  if (!$$3.a($$1)) {
                     this.setChainBroken();
                     throw new xo.a(xo.a.d);
                  } else {
                     if ($$3.a(Instant.now())) {
                        xo.a.warn("Received expired chat: '{}'. Is the client/server system time unsynchronized?", $$1.a());
                     }

                     xo.this.b = $$2.a();
                     return $$3;
                  }
               }
            }
         }

         @Override
         public void setChainBroken() {
            xo.this.b = null;
         }
      };
   }

   public static class a extends xu {
      static final wu a = wu.c("chat.disabled.missingProfileKey");
      static final wu b = wu.c("chat.disabled.chain_broken");
      static final wu c = wu.c("chat.disabled.expiredProfileKey");
      static final wu d = wu.c("chat.disabled.invalid_signature");
      static final wu e = wu.c("chat.disabled.out_of_order_chat");

      public a(wu $$0) {
         super($$0);
      }
   }

   @FunctionalInterface
   public interface b {
      static xo.b unsigned(UUID $$0, BooleanSupplier $$1) {
         return ($$2, $$3) -> {
            if ($$1.getAsBoolean()) {
               throw new xo.a(xo.a.a);
            } else {
               return xk.a($$0, $$3.a());
            }
         };
      }

      xk unpack(@Nullable xg var1, xn var2) throws xo.a;

      default void setChainBroken() {
      }
   }

   @FunctionalInterface
   public interface c {
      xo.c a = $$0 -> null;

      @Nullable
      xg pack(xn var1);
   }
}
