import java.time.Duration;
import javax.annotation.Nullable;

public class gju {
   private final boolean a;
   @Nullable
   private final Duration b;

   public gju(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(gjk $$0) {
      if (this.b != null) {
         $$0.send(gjl.d, $$0x -> {
            $$0x.a(gjn.x, (int)this.b.toMillis());
            $$0x.a(gjn.y, this.a);
         });
      }
   }
}
