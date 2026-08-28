import com.mojang.logging.LogUtils;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

@FunctionalInterface
public interface yc {
   Logger a = LogUtils.getLogger();
   yc b = xw::b;
   yc c = $$0 -> {
      a.error("Received chat message from {}, but they have no chat session initialized and secure chat is enforced", $$0.g());
      return null;
   };

   @Nullable
   xw updateAndValidate(xw var1);

   public static class a implements yc {
      private final bao d;
      private final BooleanSupplier e;
      @Nullable
      private xw f;
      private boolean g = true;

      public a(bao $$0, BooleanSupplier $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      private boolean a(xw $$0) {
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

      private boolean b(xw $$0) {
         if (this.e.getAsBoolean()) {
            a.error("Received message with expired profile public key from {} with session {}", $$0.g(), $$0.k().d());
            return false;
         } else if (!$$0.a(this.d)) {
            a.error("Received message with invalid signature (is the session wrong, or signature cache out of sync?): {}", xw.a($$0));
            return false;
         } else {
            return this.a($$0);
         }
      }

      @Nullable
      @Override
      public xw updateAndValidate(xw $$0) {
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
