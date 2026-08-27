import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class xa {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private xb b;
   private Instant c = Instant.EPOCH;

   public xa(UUID $$0, UUID $$1) {
      this.b = xb.a($$0, $$1);
   }

   public xa.c a(axx $$0) {
      return $$1 -> {
         xb $$2 = this.a();
         return $$2 == null ? null : new ws($$0.sign($$2x -> ww.a($$2x, $$2, $$1)));
      };
   }

   public xa.b a(cjw $$0) {
      axw $$1 = $$0.a();
      return ($$2, $$3) -> {
         xb $$4 = this.a();
         if ($$4 == null) {
            throw new xa.a(wg.c("chat.disabled.chain_broken"), false);
         } else if ($$0.b().a()) {
            throw new xa.a(wg.c("chat.disabled.expiredProfileKey"), false);
         } else if ($$3.b().isBefore(this.c)) {
            throw new xa.a(wg.c("multiplayer.disconnect.out_of_order_chat"), true);
         } else {
            this.c = $$3.b();
            ww $$5 = new ww($$4, $$2, $$3, null, wk.c);
            if (!$$5.a($$1)) {
               throw new xa.a(wg.c("multiplayer.disconnect.unsigned_chat"), true);
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
   private xb a() {
      xb $$0 = this.b;
      if ($$0 != null) {
         this.b = $$0.a();
      }

      return $$0;
   }

   public static class a extends xg {
      private final boolean a;

      public a(wg $$0, boolean $$1) {
         super($$0);
         this.a = $$1;
      }

      public boolean a() {
         return this.a;
      }
   }

   @FunctionalInterface
   public interface b {
      static xa.b unsigned(UUID $$0, BooleanSupplier $$1) {
         return ($$2, $$3) -> {
            if ($$1.getAsBoolean()) {
               throw new xa.a(wg.c("chat.disabled.missingProfileKey"), false);
            } else {
               return ww.a($$0, $$3.a());
            }
         };
      }

      ww unpack(@Nullable ws var1, wz var2) throws xa.a;
   }

   @FunctionalInterface
   public interface c {
      xa.c a = $$0 -> null;

      @Nullable
      ws pack(wz var1);
   }
}
