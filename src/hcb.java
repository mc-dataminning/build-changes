import java.time.Duration;
import javax.annotation.Nullable;

public class hcb {
   private final boolean a;
   @Nullable
   private final Duration b;

   public hcb(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(hbr $$0) {
      if (this.b != null) {
         $$0.send(hbs.d, $$0x -> {
            $$0x.a(hbu.x, (int)this.b.toMillis());
            $$0x.a(hbu.y, this.a);
         });
      }
   }
}
