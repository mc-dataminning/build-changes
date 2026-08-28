import java.time.Duration;
import javax.annotation.Nullable;

public class hnu {
   private final boolean a;
   @Nullable
   private final Duration b;

   public hnu(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(hnk $$0) {
      if (this.b != null) {
         $$0.send(hnl.d, $$0x -> {
            $$0x.a(hnn.x, (int)this.b.toMillis());
            $$0x.a(hnn.y, this.a);
         });
      }
   }
}
