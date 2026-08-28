import java.time.Duration;
import javax.annotation.Nullable;

public class hgy {
   private final boolean a;
   @Nullable
   private final Duration b;

   public hgy(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(hgo $$0) {
      if (this.b != null) {
         $$0.send(hgp.d, $$0x -> {
            $$0x.a(hgr.x, (int)this.b.toMillis());
            $$0x.a(hgr.y, this.a);
         });
      }
   }
}
