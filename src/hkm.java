import java.time.Duration;
import javax.annotation.Nullable;

public class hkm {
   private final boolean a;
   @Nullable
   private final Duration b;

   public hkm(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(hkc $$0) {
      if (this.b != null) {
         $$0.send(hkd.d, $$0x -> {
            $$0x.a(hkf.x, (int)this.b.toMillis());
            $$0x.a(hkf.y, this.a);
         });
      }
   }
}
