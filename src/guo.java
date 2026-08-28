import java.time.Duration;
import javax.annotation.Nullable;

public class guo {
   private final boolean a;
   @Nullable
   private final Duration b;

   public guo(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(gue $$0) {
      if (this.b != null) {
         $$0.send(guf.d, $$0x -> {
            $$0x.a(guh.x, (int)this.b.toMillis());
            $$0x.a(guh.y, this.a);
         });
      }
   }
}
