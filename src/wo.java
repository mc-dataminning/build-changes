import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class wo {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private wp b;
   private Instant c = Instant.EPOCH;

   public wo(UUID $$0, UUID $$1) {
      this.b = wp.a($$0, $$1);
   }

   public wo.c a(axj $$0) {
      return $$1 -> {
         wp $$2 = this.a();
         return $$2 == null ? null : new wg($$0.sign($$2x -> wk.a($$2x, $$2, $$1)));
      };
   }

   public wo.b a(civ $$0) {
      axi $$1 = $$0.a();
      return ($$2, $$3) -> {
         wp $$4 = this.a();
         if ($$4 == null) {
            throw new wo.a(vu.c("chat.disabled.chain_broken"), false);
         } else if ($$0.b().a()) {
            throw new wo.a(vu.c("chat.disabled.expiredProfileKey"), false);
         } else if ($$3.b().isBefore(this.c)) {
            throw new wo.a(vu.c("multiplayer.disconnect.out_of_order_chat"), true);
         } else {
            this.c = $$3.b();
            wk $$5 = new wk($$4, $$2, $$3, null, vy.c);
            if (!$$5.a($$1)) {
               throw new wo.a(vu.c("multiplayer.disconnect.unsigned_chat"), true);
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
   private wp a() {
      wp $$0 = this.b;
      if ($$0 != null) {
         this.b = $$0.a();
      }

      return $$0;
   }

   public static class a extends wu {
      private final boolean a;

      public a(vu $$0, boolean $$1) {
         super($$0);
         this.a = $$1;
      }

      public boolean a() {
         return this.a;
      }
   }

   @FunctionalInterface
   public interface b {
      static wo.b unsigned(UUID $$0, BooleanSupplier $$1) {
         return ($$2, $$3) -> {
            if ($$1.getAsBoolean()) {
               throw new wo.a(vu.c("chat.disabled.missingProfileKey"), false);
            } else {
               return wk.a($$0, $$3.a());
            }
         };
      }

      wk unpack(@Nullable wg var1, wn var2) throws wo.a;
   }

   @FunctionalInterface
   public interface c {
      wo.c a = $$0 -> null;

      @Nullable
      wg pack(wn var1);
   }
}
