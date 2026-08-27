import java.time.Duration;
import javax.annotation.Nullable;

public class gjw {
   private final boolean a;
   @Nullable
   private final Duration b;

   public gjw(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(gjm $$0) {
      if (this.b != null) {
         $$0.send(gjn.d, $$0x -> {
            $$0x.a(gjp.x, (int)this.b.toMillis());
            $$0x.a(gjp.y, this.a);
         });
      }
   }
}
