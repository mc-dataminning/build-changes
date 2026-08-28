import java.time.Duration;
import javax.annotation.Nullable;

public class hlm {
   private final boolean a;
   @Nullable
   private final Duration b;

   public hlm(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(hlc $$0) {
      if (this.b != null) {
         $$0.send(hld.d, $$0x -> {
            $$0x.a(hlf.x, (int)this.b.toMillis());
            $$0x.a(hlf.y, this.a);
         });
      }
   }
}
