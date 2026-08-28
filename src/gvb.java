import java.time.Duration;
import javax.annotation.Nullable;

public class gvb {
   private final boolean a;
   @Nullable
   private final Duration b;

   public gvb(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(gur $$0) {
      if (this.b != null) {
         $$0.send(gus.d, $$0x -> {
            $$0x.a(guu.x, (int)this.b.toMillis());
            $$0x.a(guu.y, this.a);
         });
      }
   }
}
