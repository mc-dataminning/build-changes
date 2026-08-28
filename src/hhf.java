import java.time.Duration;
import javax.annotation.Nullable;

public class hhf {
   private final boolean a;
   @Nullable
   private final Duration b;

   public hhf(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(hgv $$0) {
      if (this.b != null) {
         $$0.send(hgw.d, $$0x -> {
            $$0x.a(hgy.x, (int)this.b.toMillis());
            $$0x.a(hgy.y, this.a);
         });
      }
   }
}
