import java.time.Duration;
import javax.annotation.Nullable;

public class hpm {
   private final boolean a;
   @Nullable
   private final Duration b;

   public hpm(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(hpc $$0) {
      if (this.b != null) {
         $$0.send(hpd.d, $$0x -> {
            $$0x.a(hpf.x, (int)this.b.toMillis());
            $$0x.a(hpf.y, this.a);
         });
      }
   }
}
