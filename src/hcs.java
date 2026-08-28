import java.time.Duration;
import javax.annotation.Nullable;

public class hcs {
   private final boolean a;
   @Nullable
   private final Duration b;

   public hcs(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(hci $$0) {
      if (this.b != null) {
         $$0.send(hcj.d, $$0x -> {
            $$0x.a(hcl.x, (int)this.b.toMillis());
            $$0x.a(hcl.y, this.a);
         });
      }
   }
}
