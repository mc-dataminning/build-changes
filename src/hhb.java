import java.time.Duration;
import javax.annotation.Nullable;

public class hhb {
   private final boolean a;
   @Nullable
   private final Duration b;

   public hhb(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(hgr $$0) {
      if (this.b != null) {
         $$0.send(hgs.d, $$0x -> {
            $$0x.a(hgu.x, (int)this.b.toMillis());
            $$0x.a(hgu.y, this.a);
         });
      }
   }
}
