import java.time.Duration;
import javax.annotation.Nullable;

public class gmc {
   private final boolean a;
   @Nullable
   private final Duration b;

   public gmc(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(gls $$0) {
      if (this.b != null) {
         $$0.send(glt.d, $$0x -> {
            $$0x.a(glv.x, (int)this.b.toMillis());
            $$0x.a(glv.y, this.a);
         });
      }
   }
}
