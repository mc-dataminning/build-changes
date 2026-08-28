import java.time.Duration;
import javax.annotation.Nullable;

public class hpf {
   private final boolean a;
   @Nullable
   private final Duration b;

   public hpf(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(hov $$0) {
      if (this.b != null) {
         $$0.send(how.d, $$0x -> {
            $$0x.a(hoy.x, (int)this.b.toMillis());
            $$0x.a(hoy.y, this.a);
         });
      }
   }
}
