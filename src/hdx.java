import java.time.Duration;
import javax.annotation.Nullable;

public class hdx {
   private final boolean a;
   @Nullable
   private final Duration b;

   public hdx(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(hdn $$0) {
      if (this.b != null) {
         $$0.send(hdo.d, $$0x -> {
            $$0x.a(hdq.x, (int)this.b.toMillis());
            $$0x.a(hdq.y, this.a);
         });
      }
   }
}
