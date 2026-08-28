import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class yp {
   static final Logger a = LogUtils.getLogger();
   @Nullable
   yq b;
   Instant c = Instant.EPOCH;

   public yp(UUID $$0, UUID $$1) {
      this.b = yq.a($$0, $$1);
   }

   public yp.c a(bas $$0) {
      return $$1 -> {
         yq $$2 = this.b;
         if ($$2 == null) {
            return null;
         } else {
            this.b = $$2.a();
            return new yh($$0.sign($$2x -> yl.a($$2x, $$2, $$1)));
         }
      };
   }

   public yp.b a(final cqa $$0) {
      final bar $$1 = $$0.a();
      return new yp.b() {
         @Override
         public yl unpack(@Nullable yh $$0x, yo $$1x) throws yp.a {
            if ($$0 == null) {
               throw new yp.a(yp.a.a);
            } else if ($$0.b().a()) {
               throw new yp.a(yp.a.c);
            } else {
               yq $$2 = yp.this.b;
               if ($$2 == null) {
                  throw new yp.a(yp.a.b);
               } else if ($$1.b().isBefore(yp.this.c)) {
                  this.setChainBroken();
                  throw new yp.a(yp.a.e);
               } else {
                  yp.this.c = $$1.b();
                  yl $$3 = new yl($$2, $$0, $$1, null, xz.c);
                  if (!$$3.a($$1)) {
                     this.setChainBroken();
                     throw new yp.a(yp.a.d);
                  } else {
                     if ($$3.a(Instant.now())) {
                        yp.a.warn("Received expired chat: '{}'. Is the client/server system time unsynchronized?", $$1.a());
                     }

                     yp.this.b = $$2.a();
                     return $$3;
                  }
               }
            }
         }

         @Override
         public void setChainBroken() {
            yp.this.b = null;
         }
      };
   }

   public static class a extends yv {
      static final xv a = xv.c("chat.disabled.missingProfileKey");
      static final xv b = xv.c("chat.disabled.chain_broken");
      static final xv c = xv.c("chat.disabled.expiredProfileKey");
      static final xv d = xv.c("chat.disabled.invalid_signature");
      static final xv e = xv.c("chat.disabled.out_of_order_chat");

      public a(xv $$0) {
         super($$0);
      }
   }

   @FunctionalInterface
   public interface b {
      static yp.b unsigned(UUID $$0, BooleanSupplier $$1) {
         return ($$2, $$3) -> {
            if ($$1.getAsBoolean()) {
               throw new yp.a(yp.a.a);
            } else {
               return yl.a($$0, $$3.a());
            }
         };
      }

      yl unpack(@Nullable yh var1, yo var2) throws yp.a;

      default void setChainBroken() {
      }
   }

   @FunctionalInterface
   public interface c {
      yp.c a = $$0 -> null;

      @Nullable
      yh pack(yo var1);
   }
}
