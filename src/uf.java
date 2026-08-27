import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class uf {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private ug b;

   public uf(UUID $$0, UUID $$1) {
      this.b = ug.a($$0, $$1);
   }

   public uf.c a(asi $$0) {
      return $$1 -> {
         ug $$2 = this.a();
         return $$2 == null ? null : new tx($$0.sign($$2x -> ub.a($$2x, $$2, $$1)));
      };
   }

   public uf.b a(cbx $$0) {
      ash $$1 = $$0.a();
      return ($$2, $$3) -> {
         ug $$4 = this.a();
         if ($$4 == null) {
            throw new uf.a(tm.c("chat.disabled.chain_broken"), false);
         } else if ($$0.b().a()) {
            throw new uf.a(tm.c("chat.disabled.expiredProfileKey"), false);
         } else {
            ub $$5 = new ub($$4, $$2, $$3, null, tp.c);
            if (!$$5.a($$1)) {
               throw new uf.a(tm.c("multiplayer.disconnect.unsigned_chat"), true);
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
   private ug a() {
      ug $$0 = this.b;
      if ($$0 != null) {
         this.b = $$0.a();
      }

      return $$0;
   }

   public static class a extends ul {
      private final boolean a;

      public a(tm $$0, boolean $$1) {
         super($$0);
         this.a = $$1;
      }

      public boolean a() {
         return this.a;
      }
   }

   @FunctionalInterface
   public interface b {
      uf.b a = ($$0, $$1) -> {
         throw new uf.a(tm.c("chat.disabled.missingProfileKey"), false);
      };

      static uf.b unsigned(UUID $$0) {
         return ($$1, $$2) -> ub.a($$0, $$2.a());
      }

      ub unpack(@Nullable tx var1, ue var2) throws uf.a;
   }

   @FunctionalInterface
   public interface c {
      uf.c a = $$0 -> null;

      @Nullable
      tx pack(ue var1);
   }
}
