import java.time.Duration;
import javax.annotation.Nullable;

public class hen {
   private final boolean a;
   @Nullable
   private final Duration b;

   public hen(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(hed $$0) {
      if (this.b != null) {
         $$0.send(hee.d, $$0x -> {
            $$0x.a(heg.x, (int)this.b.toMillis());
            $$0x.a(heg.y, this.a);
         });
      }
   }
}
