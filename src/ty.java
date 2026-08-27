import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ty {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private tz b;

   public ty(UUID $$0, UUID $$1) {
      this.b = tz.a($$0, $$1);
   }

   public ty.c a(asa $$0) {
      return $$1 -> {
         tz $$2 = this.a();
         return $$2 == null ? null : new tq($$0.sign($$2x -> tu.a($$2x, $$2, $$1)));
      };
   }

   public ty.b a(cbq $$0) {
      arz $$1 = $$0.a();
      return ($$2, $$3) -> {
         tz $$4 = this.a();
         if ($$4 == null) {
            throw new ty.a(tf.c("chat.disabled.chain_broken"), false);
         } else if ($$0.b().a()) {
            throw new ty.a(tf.c("chat.disabled.expiredProfileKey"), false);
         } else {
            tu $$5 = new tu($$4, $$2, $$3, null, ti.c);
            if (!$$5.a($$1)) {
               throw new ty.a(tf.c("multiplayer.disconnect.unsigned_chat"), true);
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
   private tz a() {
      tz $$0 = this.b;
      if ($$0 != null) {
         this.b = $$0.a();
      }

      return $$0;
   }

   public static class a extends ue {
      private final boolean a;

      public a(tf $$0, boolean $$1) {
         super($$0);
         this.a = $$1;
      }

      public boolean a() {
         return this.a;
      }
   }

   @FunctionalInterface
   public interface b {
      ty.b a = ($$0, $$1) -> {
         throw new ty.a(tf.c("chat.disabled.missingProfileKey"), false);
      };

      static ty.b unsigned(UUID $$0) {
         return ($$1, $$2) -> tu.a($$0, $$2.a());
      }

      tu unpack(@Nullable tq var1, tx var2) throws ty.a;
   }

   @FunctionalInterface
   public interface c {
      ty.c a = $$0 -> null;

      @Nullable
      tq pack(tx var1);
   }
}
