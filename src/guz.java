import java.time.Duration;
import javax.annotation.Nullable;

public class guz {
   private final boolean a;
   @Nullable
   private final Duration b;

   public guz(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(gup $$0) {
      if (this.b != null) {
         $$0.send(guq.d, $$0x -> {
            $$0x.a(gus.x, (int)this.b.toMillis());
            $$0x.a(gus.y, this.a);
         });
      }
   }
}
