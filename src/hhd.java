import java.time.Duration;
import javax.annotation.Nullable;

public class hhd {
   private final boolean a;
   @Nullable
   private final Duration b;

   public hhd(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(hgt $$0) {
      if (this.b != null) {
         $$0.send(hgu.d, $$0x -> {
            $$0x.a(hgw.x, (int)this.b.toMillis());
            $$0x.a(hgw.y, this.a);
         });
      }
   }
}
