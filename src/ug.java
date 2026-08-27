import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ug {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private uh b;

   public ug(UUID $$0, UUID $$1) {
      this.b = uh.a($$0, $$1);
   }

   public ug.c a(ask $$0) {
      return $$1 -> {
         uh $$2 = this.a();
         return $$2 == null ? null : new ty($$0.sign($$2x -> uc.a($$2x, $$2, $$1)));
      };
   }

   public ug.b a(cbz $$0) {
      asj $$1 = $$0.a();
      return ($$2, $$3) -> {
         uh $$4 = this.a();
         if ($$4 == null) {
            throw new ug.a(tn.c("chat.disabled.chain_broken"), false);
         } else if ($$0.b().a()) {
            throw new ug.a(tn.c("chat.disabled.expiredProfileKey"), false);
         } else {
            uc $$5 = new uc($$4, $$2, $$3, null, tq.c);
            if (!$$5.a($$1)) {
               throw new ug.a(tn.c("multiplayer.disconnect.unsigned_chat"), true);
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
   private uh a() {
      uh $$0 = this.b;
      if ($$0 != null) {
         this.b = $$0.a();
      }

      return $$0;
   }

   public static class a extends um {
      private final boolean a;

      public a(tn $$0, boolean $$1) {
         super($$0);
         this.a = $$1;
      }

      public boolean a() {
         return this.a;
      }
   }

   @FunctionalInterface
   public interface b {
      ug.b a = ($$0, $$1) -> {
         throw new ug.a(tn.c("chat.disabled.missingProfileKey"), false);
      };

      static ug.b unsigned(UUID $$0) {
         return ($$1, $$2) -> uc.a($$0, $$2.a());
      }

      uc unpack(@Nullable ty var1, uf var2) throws ug.a;
   }

   @FunctionalInterface
   public interface c {
      ug.c a = $$0 -> null;

      @Nullable
      ty pack(uf var1);
   }
}
