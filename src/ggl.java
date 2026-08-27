import java.time.Duration;
import javax.annotation.Nullable;

public class ggl {
   private final boolean a;
   @Nullable
   private final Duration b;

   public ggl(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(ggb $$0) {
      if (this.b != null) {
         $$0.send(ggc.d, $$0x -> {
            $$0x.a(gge.x, (int)this.b.toMillis());
            $$0x.a(gge.y, this.a);
         });
      }
   }
}
