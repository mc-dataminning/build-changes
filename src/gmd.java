import java.time.Duration;
import javax.annotation.Nullable;

public class gmd {
   private final boolean a;
   @Nullable
   private final Duration b;

   public gmd(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(glt $$0) {
      if (this.b != null) {
         $$0.send(glu.d, $$0x -> {
            $$0x.a(glw.x, (int)this.b.toMillis());
            $$0x.a(glw.y, this.a);
         });
      }
   }
}
