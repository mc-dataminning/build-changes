import java.time.Duration;
import javax.annotation.Nullable;

public class gjv {
   private final boolean a;
   @Nullable
   private final Duration b;

   public gjv(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(gjl $$0) {
      if (this.b != null) {
         $$0.send(gjm.d, $$0x -> {
            $$0x.a(gjo.x, (int)this.b.toMillis());
            $$0x.a(gjo.y, this.a);
         });
      }
   }
}
