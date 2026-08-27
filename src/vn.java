import com.mojang.logging.LogUtils;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

@FunctionalInterface
public interface vn {
   Logger a = LogUtils.getLogger();
   vn b = $$0 -> {
      if ($$0.h()) {
         a.error("Received chat message with signature from {}, but they have no chat session initialized", $$0.f());
         return false;
      } else {
         return true;
      }
   };
   vn c = $$0 -> {
      a.error("Received chat message from {}, but they have no chat session initialized and secure chat is enforced", $$0.f());
      return false;
   };

   boolean updateAndValidate(vh var1);

   public static class a implements vn {
      private final aty d;
      private final BooleanSupplier e;
      @Nullable
      private vh f;
      private boolean g = true;

      public a(aty $$0, BooleanSupplier $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      private boolean a(vh $$0) {
         if ($$0.equals(this.f)) {
            return true;
         } else if (this.f != null && !$$0.j().a(this.f.j())) {
            a.error(
               "Received out-of-order chat message from {}: expected index > {} for session {}, but was {} for session {}",
               new Object[]{$$0.f(), this.f.j().b(), this.f.j().d(), $$0.j().b(), $$0.j().d()}
            );
            return false;
         } else {
            return true;
         }
      }

      private boolean b(vh $$0) {
         if (this.e.getAsBoolean()) {
            a.error("Received message from player with expired profile public key: {}", $$0);
            return false;
         } else if (!$$0.a(this.d)) {
            a.error("Received message with invalid signature from {}", $$0.f());
            return false;
         } else {
            return this.a($$0);
         }
      }

      @Override
      public boolean updateAndValidate(vh $$0) {
         this.g = this.g && this.b($$0);
         if (!this.g) {
            return false;
         } else {
            this.f = $$0;
            return true;
         }
      }
   }
}
