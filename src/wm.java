import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class wm {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private wn b;
   private Instant c = Instant.EPOCH;

   public wm(UUID $$0, UUID $$1) {
      this.b = wn.a($$0, $$1);
   }

   public wm.c a(awz $$0) {
      return $$1 -> {
         wn $$2 = this.a();
         return $$2 == null ? null : new we($$0.sign($$2x -> wi.a($$2x, $$2, $$1)));
      };
   }

   public wm.b a(cid $$0) {
      awy $$1 = $$0.a();
      return ($$2, $$3) -> {
         wn $$4 = this.a();
         if ($$4 == null) {
            throw new wm.a(vs.c("chat.disabled.chain_broken"), false);
         } else if ($$0.b().a()) {
            throw new wm.a(vs.c("chat.disabled.expiredProfileKey"), false);
         } else if ($$3.b().isBefore(this.c)) {
            throw new wm.a(vs.c("multiplayer.disconnect.out_of_order_chat"), true);
         } else {
            this.c = $$3.b();
            wi $$5 = new wi($$4, $$2, $$3, null, vw.c);
            if (!$$5.a($$1)) {
               throw new wm.a(vs.c("multiplayer.disconnect.unsigned_chat"), true);
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
   private wn a() {
      wn $$0 = this.b;
      if ($$0 != null) {
         this.b = $$0.a();
      }

      return $$0;
   }

   public static class a extends ws {
      private final boolean a;

      public a(vs $$0, boolean $$1) {
         super($$0);
         this.a = $$1;
      }

      public boolean a() {
         return this.a;
      }
   }

   @FunctionalInterface
   public interface b {
      static wm.b unsigned(UUID $$0, BooleanSupplier $$1) {
         return ($$2, $$3) -> {
            if ($$1.getAsBoolean()) {
               throw new wm.a(vs.c("chat.disabled.missingProfileKey"), false);
            } else {
               return wi.a($$0, $$3.a());
            }
         };
      }

      wi unpack(@Nullable we var1, wl var2) throws wm.a;
   }

   @FunctionalInterface
   public interface c {
      wm.c a = $$0 -> null;

      @Nullable
      we pack(wl var1);
   }
}
