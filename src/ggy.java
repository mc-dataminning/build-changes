import java.time.Duration;
import javax.annotation.Nullable;

public class ggy {
   private final boolean a;
   @Nullable
   private final Duration b;

   public ggy(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(ggo $$0) {
      if (this.b != null) {
         $$0.send(ggp.d, $$0x -> {
            $$0x.a(ggr.x, (int)this.b.toMillis());
            $$0x.a(ggr.y, this.a);
         });
      }
   }
}
