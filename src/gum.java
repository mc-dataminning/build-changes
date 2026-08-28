import java.time.Duration;
import javax.annotation.Nullable;

public class gum {
   private final boolean a;
   @Nullable
   private final Duration b;

   public gum(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(guc $$0) {
      if (this.b != null) {
         $$0.send(gud.d, $$0x -> {
            $$0x.a(guf.x, (int)this.b.toMillis());
            $$0x.a(guf.y, this.a);
         });
      }
   }
}
