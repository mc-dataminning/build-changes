import java.time.Duration;
import javax.annotation.Nullable;

public class gkk {
   private final boolean a;
   @Nullable
   private final Duration b;

   public gkk(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(gka $$0) {
      if (this.b != null) {
         $$0.send(gkb.d, $$0x -> {
            $$0x.a(gkd.x, (int)this.b.toMillis());
            $$0x.a(gkd.y, this.a);
         });
      }
   }
}
