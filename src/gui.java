import java.time.Duration;
import javax.annotation.Nullable;

public class gui {
   private final boolean a;
   @Nullable
   private final Duration b;

   public gui(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(gty $$0) {
      if (this.b != null) {
         $$0.send(gtz.d, $$0x -> {
            $$0x.a(gub.x, (int)this.b.toMillis());
            $$0x.a(gub.y, this.a);
         });
      }
   }
}
