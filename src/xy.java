import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class xy {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private xz b;
   private Instant c = Instant.EPOCH;

   public xy(UUID $$0, UUID $$1) {
      this.b = xz.a($$0, $$1);
   }

   public xy.c a(ayz $$0) {
      return $$1 -> {
         xz $$2 = this.a();
         return $$2 == null ? null : new xq($$0.sign($$2x -> xu.a($$2x, $$2, $$1)));
      };
   }

   public xy.b a(cmb $$0) {
      ayy $$1 = $$0.a();
      return ($$2, $$3) -> {
         xz $$4 = this.a();
         if ($$4 == null) {
            throw new xy.a(xe.c("chat.disabled.chain_broken"), false);
         } else if ($$0.b().a()) {
            throw new xy.a(xe.c("chat.disabled.expiredProfileKey"), false);
         } else if ($$3.b().isBefore(this.c)) {
            throw new xy.a(xe.c("multiplayer.disconnect.out_of_order_chat"), true);
         } else {
            this.c = $$3.b();
            xu $$5 = new xu($$4, $$2, $$3, null, xi.c);
            if (!$$5.a($$1)) {
               throw new xy.a(xe.c("multiplayer.disconnect.unsigned_chat"), true);
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
   private xz a() {
      xz $$0 = this.b;
      if ($$0 != null) {
         this.b = $$0.a();
      }

      return $$0;
   }

   public static class a extends ye {
      private final boolean a;

      public a(xe $$0, boolean $$1) {
         super($$0);
         this.a = $$1;
      }

      public boolean a() {
         return this.a;
      }
   }

   @FunctionalInterface
   public interface b {
      static xy.b unsigned(UUID $$0, BooleanSupplier $$1) {
         return ($$2, $$3) -> {
            if ($$1.getAsBoolean()) {
               throw new xy.a(xe.c("chat.disabled.missingProfileKey"), false);
            } else {
               return xu.a($$0, $$3.a());
            }
         };
      }

      xu unpack(@Nullable xq var1, xx var2) throws xy.a;
   }

   @FunctionalInterface
   public interface c {
      xy.c a = $$0 -> null;

      @Nullable
      xq pack(xx var1);
   }
}
