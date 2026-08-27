import java.time.Duration;
import javax.annotation.Nullable;

public class gol {
   private final boolean a;
   @Nullable
   private final Duration b;

   public gol(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(gob $$0) {
      if (this.b != null) {
         $$0.send(goc.d, $$0x -> {
            $$0x.a(goe.x, (int)this.b.toMillis());
            $$0x.a(goe.y, this.a);
         });
      }
   }
}
