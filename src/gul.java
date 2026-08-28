import java.time.Duration;
import javax.annotation.Nullable;

public class gul {
   private final boolean a;
   @Nullable
   private final Duration b;

   public gul(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(gub $$0) {
      if (this.b != null) {
         $$0.send(guc.d, $$0x -> {
            $$0x.a(gue.x, (int)this.b.toMillis());
            $$0x.a(gue.y, this.a);
         });
      }
   }
}
