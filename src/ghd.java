import java.time.Duration;
import javax.annotation.Nullable;

public class ghd {
   private final boolean a;
   @Nullable
   private final Duration b;

   public ghd(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(ggt $$0) {
      if (this.b != null) {
         $$0.send(ggu.d, $$0x -> {
            $$0x.a(ggw.x, (int)this.b.toMillis());
            $$0x.a(ggw.y, this.a);
         });
      }
   }
}
