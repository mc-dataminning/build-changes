import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class xm {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private xn b;
   private Instant c = Instant.EPOCH;

   public xm(UUID $$0, UUID $$1) {
      this.b = xn.a($$0, $$1);
   }

   public xm.c a(ayj $$0) {
      return $$1 -> {
         xn $$2 = this.a();
         return $$2 == null ? null : new xe($$0.sign($$2x -> xi.a($$2x, $$2, $$1)));
      };
   }

   public xm.b a(cko $$0) {
      ayi $$1 = $$0.a();
      return ($$2, $$3) -> {
         xn $$4 = this.a();
         if ($$4 == null) {
            throw new xm.a(ws.c("chat.disabled.chain_broken"), false);
         } else if ($$0.b().a()) {
            throw new xm.a(ws.c("chat.disabled.expiredProfileKey"), false);
         } else if ($$3.b().isBefore(this.c)) {
            throw new xm.a(ws.c("multiplayer.disconnect.out_of_order_chat"), true);
         } else {
            this.c = $$3.b();
            xi $$5 = new xi($$4, $$2, $$3, null, ww.c);
            if (!$$5.a($$1)) {
               throw new xm.a(ws.c("multiplayer.disconnect.unsigned_chat"), true);
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
   private xn a() {
      xn $$0 = this.b;
      if ($$0 != null) {
         this.b = $$0.a();
      }

      return $$0;
   }

   public static class a extends xs {
      private final boolean a;

      public a(ws $$0, boolean $$1) {
         super($$0);
         this.a = $$1;
      }

      public boolean a() {
         return this.a;
      }
   }

   @FunctionalInterface
   public interface b {
      static xm.b unsigned(UUID $$0, BooleanSupplier $$1) {
         return ($$2, $$3) -> {
            if ($$1.getAsBoolean()) {
               throw new xm.a(ws.c("chat.disabled.missingProfileKey"), false);
            } else {
               return xi.a($$0, $$3.a());
            }
         };
      }

      xi unpack(@Nullable xe var1, xl var2) throws xm.a;
   }

   @FunctionalInterface
   public interface c {
      xm.c a = $$0 -> null;

      @Nullable
      xe pack(xl var1);
   }
}
