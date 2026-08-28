import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class xi {
   static final Logger a = LogUtils.getLogger();
   @Nullable
   xj b;
   Instant c = Instant.EPOCH;

   public xi(UUID $$0, UUID $$1) {
      this.b = xj.a($$0, $$1);
   }

   public xi.c a(azm $$0) {
      return $$1 -> {
         xj $$2 = this.b;
         if ($$2 == null) {
            return null;
         } else {
            this.b = $$2.a();
            return new xa($$0.sign($$2x -> xe.a($$2x, $$2, $$1)));
         }
      };
   }

   public xi.b a(final coy $$0) {
      final azl $$1 = $$0.a();
      return new xi.b() {
         @Override
         public xe unpack(@Nullable xa $$0x, xh $$1x) throws xi.a {
            if ($$0 == null) {
               throw new xi.a(xi.a.a);
            } else if ($$0.b().a()) {
               throw new xi.a(xi.a.c);
            } else {
               xj $$2 = xi.this.b;
               if ($$2 == null) {
                  throw new xi.a(xi.a.b);
               } else if ($$1.b().isBefore(xi.this.c)) {
                  this.setChainBroken();
                  throw new xi.a(xi.a.e);
               } else {
                  xi.this.c = $$1.b();
                  xe $$3 = new xe($$2, $$0, $$1, null, ws.c);
                  if (!$$3.a($$1)) {
                     this.setChainBroken();
                     throw new xi.a(xi.a.d);
                  } else {
                     if ($$3.a(Instant.now())) {
                        xi.a.warn("Received expired chat: '{}'. Is the client/server system time unsynchronized?", $$1.a());
                     }

                     xi.this.b = $$2.a();
                     return $$3;
                  }
               }
            }
         }

         @Override
         public void setChainBroken() {
            xi.this.b = null;
         }
      };
   }

   public static class a extends xo {
      static final wo a = wo.c("chat.disabled.missingProfileKey");
      static final wo b = wo.c("chat.disabled.chain_broken");
      static final wo c = wo.c("chat.disabled.expiredProfileKey");
      static final wo d = wo.c("chat.disabled.invalid_signature");
      static final wo e = wo.c("chat.disabled.out_of_order_chat");

      public a(wo $$0) {
         super($$0);
      }
   }

   @FunctionalInterface
   public interface b {
      static xi.b unsigned(UUID $$0, BooleanSupplier $$1) {
         return ($$2, $$3) -> {
            if ($$1.getAsBoolean()) {
               throw new xi.a(xi.a.a);
            } else {
               return xe.a($$0, $$3.a());
            }
         };
      }

      xe unpack(@Nullable xa var1, xh var2) throws xi.a;

      default void setChainBroken() {
      }
   }

   @FunctionalInterface
   public interface c {
      xi.c a = $$0 -> null;

      @Nullable
      xa pack(xh var1);
   }
}
