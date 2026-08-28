import com.mojang.logging.LogUtils;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

@FunctionalInterface
public interface xz {
   Logger a = LogUtils.getLogger();
   xz b = xt::b;
   xz c = $$0 -> {
      a.error("Received chat message from {}, but they have no chat session initialized and secure chat is enforced", $$0.g());
      return null;
   };

   @Nullable
   xt updateAndValidate(xt var1);

   public static class a implements xz {
      private final azp d;
      private final BooleanSupplier e;
      @Nullable
      private xt f;
      private boolean g = true;

      public a(azp $$0, BooleanSupplier $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      private boolean a(xt $$0) {
         if ($$0.equals(this.f)) {
            return true;
         } else if (this.f != null && !$$0.k().a(this.f.k())) {
            a.error(
               "Received out-of-order chat message from {}: expected index > {} for session {}, but was {} for session {}",
               new Object[]{$$0.g(), this.f.k().b(), this.f.k().d(), $$0.k().b(), $$0.k().d()}
            );
            return false;
         } else {
            return true;
         }
      }

      private boolean b(xt $$0) {
         if (this.e.getAsBoolean()) {
            a.error("Received message from player with expired profile public key: {}", $$0);
            return false;
         } else if (!$$0.a(this.d)) {
            a.error("Received message with invalid signature from {}", $$0.g());
            return false;
         } else {
            return this.a($$0);
         }
      }

      @Nullable
      @Override
      public xt updateAndValidate(xt $$0) {
         this.g = this.g && this.b($$0);
         if (!this.g) {
            return null;
         } else {
            this.f = $$0;
            return $$0;
         }
      }
   }
}
