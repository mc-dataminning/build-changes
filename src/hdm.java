import java.time.Duration;
import javax.annotation.Nullable;

public class hdm {
   private final boolean a;
   @Nullable
   private final Duration b;

   public hdm(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(hdc $$0) {
      if (this.b != null) {
         $$0.send(hdd.d, $$0x -> {
            $$0x.a(hdf.x, (int)this.b.toMillis());
            $$0x.a(hdf.y, this.a);
         });
      }
   }
}
