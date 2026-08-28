import java.time.Duration;
import javax.annotation.Nullable;

public class gvx {
   private final boolean a;
   @Nullable
   private final Duration b;

   public gvx(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(gvn $$0) {
      if (this.b != null) {
         $$0.send(gvo.d, $$0x -> {
            $$0x.a(gvq.x, (int)this.b.toMillis());
            $$0x.a(gvq.y, this.a);
         });
      }
   }
}
