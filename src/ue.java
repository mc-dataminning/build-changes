import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ue {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private uf b;

   public ue(UUID $$0, UUID $$1) {
      this.b = uf.a($$0, $$1);
   }

   public ue.c a(asi $$0) {
      return $$1 -> {
         uf $$2 = this.a();
         return $$2 == null ? null : new tw($$0.sign($$2x -> ua.a($$2x, $$2, $$1)));
      };
   }

   public ue.b a(cbx $$0) {
      ash $$1 = $$0.a();
      return ($$2, $$3) -> {
         uf $$4 = this.a();
         if ($$4 == null) {
            throw new ue.a(tl.c("chat.disabled.chain_broken"), false);
         } else if ($$0.b().a()) {
            throw new ue.a(tl.c("chat.disabled.expiredProfileKey"), false);
         } else {
            ua $$5 = new ua($$4, $$2, $$3, null, to.c);
            if (!$$5.a($$1)) {
               throw new ue.a(tl.c("multiplayer.disconnect.unsigned_chat"), true);
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
   private uf a() {
      uf $$0 = this.b;
      if ($$0 != null) {
         this.b = $$0.a();
      }

      return $$0;
   }

   public static class a extends uk {
      private final boolean a;

      public a(tl $$0, boolean $$1) {
         super($$0);
         this.a = $$1;
      }

      public boolean a() {
         return this.a;
      }
   }

   @FunctionalInterface
   public interface b {
      ue.b a = ($$0, $$1) -> {
         throw new ue.a(tl.c("chat.disabled.missingProfileKey"), false);
      };

      static ue.b unsigned(UUID $$0) {
         return ($$1, $$2) -> ua.a($$0, $$2.a());
      }

      ua unpack(@Nullable tw var1, ud var2) throws ue.a;
   }

   @FunctionalInterface
   public interface c {
      ue.c a = $$0 -> null;

      @Nullable
      tw pack(ud var1);
   }
}
