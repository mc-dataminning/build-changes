import java.time.Duration;
import javax.annotation.Nullable;

public class gtf {
   private final boolean a;
   @Nullable
   private final Duration b;

   public gtf(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(gsv $$0) {
      if (this.b != null) {
         $$0.send(gsw.d, $$0x -> {
            $$0x.a(gsy.x, (int)this.b.toMillis());
            $$0x.a(gsy.y, this.a);
         });
      }
   }
}
