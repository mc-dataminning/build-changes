import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class tx {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private ty b;

   public tx(UUID $$0, UUID $$1) {
      this.b = ty.a($$0, $$1);
   }

   public tx.c a(ary $$0) {
      return $$1 -> {
         ty $$2 = this.a();
         return $$2 == null ? null : new tp($$0.sign($$2x -> tt.a($$2x, $$2, $$1)));
      };
   }

   public tx.b a(cbo $$0) {
      arx $$1 = $$0.a();
      return ($$2, $$3) -> {
         ty $$4 = this.a();
         if ($$4 == null) {
            throw new tx.a(te.c("chat.disabled.chain_broken"), false);
         } else if ($$0.b().a()) {
            throw new tx.a(te.c("chat.disabled.expiredProfileKey"), false);
         } else {
            tt $$5 = new tt($$4, $$2, $$3, null, th.c);
            if (!$$5.a($$1)) {
               throw new tx.a(te.c("multiplayer.disconnect.unsigned_chat"), true);
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
   private ty a() {
      ty $$0 = this.b;
      if ($$0 != null) {
         this.b = $$0.a();
      }

      return $$0;
   }

   public static class a extends ud {
      private final boolean a;

      public a(te $$0, boolean $$1) {
         super($$0);
         this.a = $$1;
      }

      public boolean a() {
         return this.a;
      }
   }

   @FunctionalInterface
   public interface b {
      tx.b a = ($$0, $$1) -> {
         throw new tx.a(te.c("chat.disabled.missingProfileKey"), false);
      };

      static tx.b unsigned(UUID $$0) {
         return ($$1, $$2) -> tt.a($$0, $$2.a());
      }

      tt unpack(@Nullable tp var1, tw var2) throws tx.a;
   }

   @FunctionalInterface
   public interface c {
      tx.c a = $$0 -> null;

      @Nullable
      tp pack(tw var1);
   }
}
