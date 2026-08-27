import java.time.Duration;
import javax.annotation.Nullable;

public class gmk {
   private final boolean a;
   @Nullable
   private final Duration b;

   public gmk(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(gma $$0) {
      if (this.b != null) {
         $$0.send(gmb.d, $$0x -> {
            $$0x.a(gmd.x, (int)this.b.toMillis());
            $$0x.a(gmd.y, this.a);
         });
      }
   }
}
