import java.time.Duration;
import javax.annotation.Nullable;

public class hcx {
   private final boolean a;
   @Nullable
   private final Duration b;

   public hcx(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(hcn $$0) {
      if (this.b != null) {
         $$0.send(hco.d, $$0x -> {
            $$0x.a(hcq.x, (int)this.b.toMillis());
            $$0x.a(hcq.y, this.a);
         });
      }
   }
}
