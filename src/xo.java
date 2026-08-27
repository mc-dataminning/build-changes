import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class xo {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private xp b;
   private Instant c = Instant.EPOCH;

   public xo(UUID $$0, UUID $$1) {
      this.b = xp.a($$0, $$1);
   }

   public xo.c a(aym $$0) {
      return $$1 -> {
         xp $$2 = this.a();
         return $$2 == null ? null : new xg($$0.sign($$2x -> xk.a($$2x, $$2, $$1)));
      };
   }

   public xo.b a(clk $$0) {
      ayl $$1 = $$0.a();
      return ($$2, $$3) -> {
         xp $$4 = this.a();
         if ($$4 == null) {
            throw new xo.a(wu.c("chat.disabled.chain_broken"), false);
         } else if ($$0.b().a()) {
            throw new xo.a(wu.c("chat.disabled.expiredProfileKey"), false);
         } else if ($$3.b().isBefore(this.c)) {
            throw new xo.a(wu.c("multiplayer.disconnect.out_of_order_chat"), true);
         } else {
            this.c = $$3.b();
            xk $$5 = new xk($$4, $$2, $$3, null, wy.c);
            if (!$$5.a($$1)) {
               throw new xo.a(wu.c("multiplayer.disconnect.unsigned_chat"), true);
            } else {
               if ($$5.a(Instant.now())) {
                  a.warn("Received expired chat: '{}'. Is the client/server system time unsynchronized?", $$3.a());
               }

               return $$5;
            }
         }
      };
   }

   @Nullable
   private xp a() {
      xp $$0 = this.b;
      if ($$0 != null) {
         this.b = $$0.a();
      }

      return $$0;
   }

   public static class a extends xu {
      private final boolean a;

      public a(wu $$0, boolean $$1) {
         super($$0);
         this.a = $$1;
      }

      public boolean a() {
         return this.a;
      }
   }

   @FunctionalInterface
   public interface b {
      static xo.b unsigned(UUID $$0, BooleanSupplier $$1) {
         return ($$2, $$3) -> {
            if ($$1.getAsBoolean()) {
               throw new xo.a(wu.c("chat.disabled.missingProfileKey"), false);
            } else {
               return xk.a($$0, $$3.a());
            }
         };
      }

      xk unpack(@Nullable xg var1, xn var2) throws xo.a;
   }

   @FunctionalInterface
   public interface c {
      xo.c a = $$0 -> null;

      @Nullable
      xg pack(xn var1);
   }
}
