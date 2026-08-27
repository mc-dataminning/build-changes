import java.time.Duration;
import javax.annotation.Nullable;

public class grb {
   private final boolean a;
   @Nullable
   private final Duration b;

   public grb(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(gqr $$0) {
      if (this.b != null) {
         $$0.send(gqs.d, $$0x -> {
            $$0x.a(gqu.x, (int)this.b.toMillis());
            $$0x.a(gqu.y, this.a);
         });
      }
   }
}
