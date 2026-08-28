import java.time.Duration;
import javax.annotation.Nullable;

public class hkg {
   private final boolean a;
   @Nullable
   private final Duration b;

   public hkg(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(hjw $$0) {
      if (this.b != null) {
         $$0.send(hjx.d, $$0x -> {
            $$0x.a(hjz.x, (int)this.b.toMillis());
            $$0x.a(hjz.y, this.a);
         });
      }
   }
}
