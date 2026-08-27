import java.time.Duration;
import javax.annotation.Nullable;

public class gfe {
   private final boolean a;
   @Nullable
   private final Duration b;

   public gfe(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(geu $$0) {
      if (this.b != null) {
         $$0.send(gev.d, $$0x -> {
            $$0x.a(gex.x, (int)this.b.toMillis());
            $$0x.a(gex.y, this.a);
         });
      }
   }
}
