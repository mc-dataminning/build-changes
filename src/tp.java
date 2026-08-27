import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class tp {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private tq b;

   public tp(UUID $$0, UUID $$1) {
      this.b = tq.a($$0, $$1);
   }

   public tp.c a(apk $$0) {
      return $$1 -> {
         tq $$2 = this.a();
         return $$2 == null ? null : new th($$0.sign($$2x -> tl.a($$2x, $$2, $$1)));
      };
   }

   public tp.b a(byr $$0) {
      apj $$1 = $$0.a();
      return ($$2, $$3) -> {
         tq $$4 = this.a();
         if ($$4 == null) {
            throw new tp.a(sw.c("chat.disabled.chain_broken"), false);
         } else if ($$0.b().a()) {
            throw new tp.a(sw.c("chat.disabled.expiredProfileKey"), false);
         } else {
            tl $$5 = new tl($$4, $$2, $$3, null, sz.c);
            if (!$$5.a($$1)) {
               throw new tp.a(sw.c("multiplayer.disconnect.unsigned_chat"), true);
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
   private tq a() {
      tq $$0 = this.b;
      if ($$0 != null) {
         this.b = $$0.a();
      }

      return $$0;
   }

   public static class a extends tv {
      private final boolean a;

      public a(sw $$0, boolean $$1) {
         super($$0);
         this.a = $$1;
      }

      public boolean a() {
         return this.a;
      }
   }

   @FunctionalInterface
   public interface b {
      tp.b a = ($$0, $$1) -> {
         throw new tp.a(sw.c("chat.disabled.missingProfileKey"), false);
      };

      static tp.b unsigned(UUID $$0) {
         return ($$1, $$2) -> tl.a($$0, $$2.a());
      }

      tl unpack(@Nullable th var1, to var2) throws tp.a;
   }

   @FunctionalInterface
   public interface c {
      tp.c a = $$0 -> null;

      @Nullable
      th pack(to var1);
   }
}
