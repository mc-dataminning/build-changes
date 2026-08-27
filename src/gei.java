import java.time.Duration;
import javax.annotation.Nullable;

public class gei {
   private final boolean a;
   @Nullable
   private final Duration b;

   public gei(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(gdy $$0) {
      if (this.b != null) {
         $$0.send(gdz.d, $$0x -> {
            $$0x.a(geb.x, (int)this.b.toMillis());
            $$0x.a(geb.y, this.a);
         });
      }
   }
}
