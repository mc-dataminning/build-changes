import java.time.Duration;
import javax.annotation.Nullable;

public class gsi {
   private final boolean a;
   @Nullable
   private final Duration b;

   public gsi(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(gry $$0) {
      if (this.b != null) {
         $$0.send(grz.d, $$0x -> {
            $$0x.a(gsb.x, (int)this.b.toMillis());
            $$0x.a(gsb.y, this.a);
         });
      }
   }
}
