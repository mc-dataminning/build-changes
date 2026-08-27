import java.time.Duration;
import javax.annotation.Nullable;

public class fzu {
   private final boolean a;
   @Nullable
   private final Duration b;

   public fzu(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(fzk $$0) {
      if (this.b != null) {
         $$0.send(fzl.d, $$0x -> {
            $$0x.a(fzn.x, (int)this.b.toMillis());
            $$0x.a(fzn.y, this.a);
         });
      }
   }
}
