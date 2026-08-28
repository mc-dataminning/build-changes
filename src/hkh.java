import java.time.Duration;
import javax.annotation.Nullable;

public class hkh {
   private final boolean a;
   @Nullable
   private final Duration b;

   public hkh(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(hjx $$0) {
      if (this.b != null) {
         $$0.send(hjy.d, $$0x -> {
            $$0x.a(hka.x, (int)this.b.toMillis());
            $$0x.a(hka.y, this.a);
         });
      }
   }
}
