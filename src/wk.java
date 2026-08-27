import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class wk {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private wl b;
   private Instant c = Instant.EPOCH;

   public wk(UUID $$0, UUID $$1) {
      this.b = wl.a($$0, $$1);
   }

   public wk.c a(awv $$0) {
      return $$1 -> {
         wl $$2 = this.a();
         return $$2 == null ? null : new wc($$0.sign($$2x -> wg.a($$2x, $$2, $$1)));
      };
   }

   public wk.b a(cho $$0) {
      awu $$1 = $$0.a();
      return ($$2, $$3) -> {
         wl $$4 = this.a();
         if ($$4 == null) {
            throw new wk.a(vq.c("chat.disabled.chain_broken"), false);
         } else if ($$0.b().a()) {
            throw new wk.a(vq.c("chat.disabled.expiredProfileKey"), false);
         } else if ($$3.b().isBefore(this.c)) {
            throw new wk.a(vq.c("multiplayer.disconnect.out_of_order_chat"), true);
         } else {
            this.c = $$3.b();
            wg $$5 = new wg($$4, $$2, $$3, null, vu.c);
            if (!$$5.a($$1)) {
               throw new wk.a(vq.c("multiplayer.disconnect.unsigned_chat"), true);
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
   private wl a() {
      wl $$0 = this.b;
      if ($$0 != null) {
         this.b = $$0.a();
      }

      return $$0;
   }

   public static class a extends wq {
      private final boolean a;

      public a(vq $$0, boolean $$1) {
         super($$0);
         this.a = $$1;
      }

      public boolean a() {
         return this.a;
      }
   }

   @FunctionalInterface
   public interface b {
      static wk.b unsigned(UUID $$0, BooleanSupplier $$1) {
         return ($$2, $$3) -> {
            if ($$1.getAsBoolean()) {
               throw new wk.a(vq.c("chat.disabled.missingProfileKey"), false);
            } else {
               return wg.a($$0, $$3.a());
            }
         };
      }

      wg unpack(@Nullable wc var1, wj var2) throws wk.a;
   }

   @FunctionalInterface
   public interface c {
      wk.c a = $$0 -> null;

      @Nullable
      wc pack(wj var1);
   }
}
