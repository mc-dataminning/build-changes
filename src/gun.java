import java.time.Duration;
import javax.annotation.Nullable;

public class gun {
   private final boolean a;
   @Nullable
   private final Duration b;

   public gun(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(gud $$0) {
      if (this.b != null) {
         $$0.send(gue.d, $$0x -> {
            $$0x.a(gug.x, (int)this.b.toMillis());
            $$0x.a(gug.y, this.a);
         });
      }
   }
}
