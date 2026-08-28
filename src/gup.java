import java.time.Duration;
import javax.annotation.Nullable;

public class gup {
   private final boolean a;
   @Nullable
   private final Duration b;

   public gup(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(guf $$0) {
      if (this.b != null) {
         $$0.send(gug.d, $$0x -> {
            $$0x.a(gui.x, (int)this.b.toMillis());
            $$0x.a(gui.y, this.a);
         });
      }
   }
}
