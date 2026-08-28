import java.time.Duration;
import javax.annotation.Nullable;

public class gvv {
   private final boolean a;
   @Nullable
   private final Duration b;

   public gvv(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(gvl $$0) {
      if (this.b != null) {
         $$0.send(gvm.d, $$0x -> {
            $$0x.a(gvo.x, (int)this.b.toMillis());
            $$0x.a(gvo.y, this.a);
         });
      }
   }
}
