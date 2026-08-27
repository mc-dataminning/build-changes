import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ub {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private uc b;

   public ub(UUID $$0, UUID $$1) {
      this.b = uc.a($$0, $$1);
   }

   public ub.c a(asd $$0) {
      return $$1 -> {
         uc $$2 = this.a();
         return $$2 == null ? null : new tt($$0.sign($$2x -> tx.a($$2x, $$2, $$1)));
      };
   }

   public ub.b a(cbs $$0) {
      asc $$1 = $$0.a();
      return ($$2, $$3) -> {
         uc $$4 = this.a();
         if ($$4 == null) {
            throw new ub.a(ti.c("chat.disabled.chain_broken"), false);
         } else if ($$0.b().a()) {
            throw new ub.a(ti.c("chat.disabled.expiredProfileKey"), false);
         } else {
            tx $$5 = new tx($$4, $$2, $$3, null, tl.c);
            if (!$$5.a($$1)) {
               throw new ub.a(ti.c("multiplayer.disconnect.unsigned_chat"), true);
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
   private uc a() {
      uc $$0 = this.b;
      if ($$0 != null) {
         this.b = $$0.a();
      }

      return $$0;
   }

   public static class a extends uh {
      private final boolean a;

      public a(ti $$0, boolean $$1) {
         super($$0);
         this.a = $$1;
      }

      public boolean a() {
         return this.a;
      }
   }

   @FunctionalInterface
   public interface b {
      ub.b a = ($$0, $$1) -> {
         throw new ub.a(ti.c("chat.disabled.missingProfileKey"), false);
      };

      static ub.b unsigned(UUID $$0) {
         return ($$1, $$2) -> tx.a($$0, $$2.a());
      }

      tx unpack(@Nullable tt var1, ua var2) throws ub.a;
   }

   @FunctionalInterface
   public interface c {
      ub.c a = $$0 -> null;

      @Nullable
      tt pack(ua var1);
   }
}
