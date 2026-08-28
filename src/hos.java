import java.time.Duration;
import javax.annotation.Nullable;

public class hos {
   private final boolean a;
   @Nullable
   private final Duration b;

   public hos(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(hoi $$0) {
      if (this.b != null) {
         $$0.send(hoj.d, $$0x -> {
            $$0x.a(hol.x, (int)this.b.toMillis());
            $$0x.a(hol.y, this.a);
         });
      }
   }
}
