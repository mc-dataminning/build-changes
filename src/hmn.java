import java.time.Duration;
import javax.annotation.Nullable;

public class hmn {
   private final boolean a;
   @Nullable
   private final Duration b;

   public hmn(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(hmd $$0) {
      if (this.b != null) {
         $$0.send(hme.d, $$0x -> {
            $$0x.a(hmg.x, (int)this.b.toMillis());
            $$0x.a(hmg.y, this.a);
         });
      }
   }
}
