import java.time.Duration;
import javax.annotation.Nullable;

public class gvq {
   private final boolean a;
   @Nullable
   private final Duration b;

   public gvq(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(gvg $$0) {
      if (this.b != null) {
         $$0.send(gvh.d, $$0x -> {
            $$0x.a(gvj.x, (int)this.b.toMillis());
            $$0x.a(gvj.y, this.a);
         });
      }
   }
}
