import java.time.Duration;
import javax.annotation.Nullable;

public class hkn {
   private final boolean a;
   @Nullable
   private final Duration b;

   public hkn(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(hkd $$0) {
      if (this.b != null) {
         $$0.send(hke.d, $$0x -> {
            $$0x.a(hkg.x, (int)this.b.toMillis());
            $$0x.a(hkg.y, this.a);
         });
      }
   }
}
