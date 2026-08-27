import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class vl {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private vm b;

   public vl(UUID $$0, UUID $$1) {
      this.b = vm.a($$0, $$1);
   }

   public vl.c a(atu $$0) {
      return $$1 -> {
         vm $$2 = this.a();
         return $$2 == null ? null : new vd($$0.sign($$2x -> vh.a($$2x, $$2, $$1)));
      };
   }

   public vl.b a(cdp $$0) {
      att $$1 = $$0.a();
      return ($$2, $$3) -> {
         vm $$4 = this.a();
         if ($$4 == null) {
            throw new vl.a(ur.c("chat.disabled.chain_broken"), false);
         } else if ($$0.b().a()) {
            throw new vl.a(ur.c("chat.disabled.expiredProfileKey"), false);
         } else {
            vh $$5 = new vh($$4, $$2, $$3, null, uv.c);
            if (!$$5.a($$1)) {
               throw new vl.a(ur.c("multiplayer.disconnect.unsigned_chat"), true);
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
   private vm a() {
      vm $$0 = this.b;
      if ($$0 != null) {
         this.b = $$0.a();
      }

      return $$0;
   }

   public static class a extends vr {
      private final boolean a;

      public a(ur $$0, boolean $$1) {
         super($$0);
         this.a = $$1;
      }

      public boolean a() {
         return this.a;
      }
   }

   @FunctionalInterface
   public interface b {
      vl.b a = ($$0, $$1) -> {
         throw new vl.a(ur.c("chat.disabled.missingProfileKey"), false);
      };

      static vl.b unsigned(UUID $$0) {
         return ($$1, $$2) -> vh.a($$0, $$2.a());
      }

      vh unpack(@Nullable vd var1, vk var2) throws vl.a;
   }

   @FunctionalInterface
   public interface c {
      vl.c a = $$0 -> null;

      @Nullable
      vd pack(vk var1);
   }
}
