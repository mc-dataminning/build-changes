import java.time.Duration;
import javax.annotation.Nullable;

public class hhe {
   private final boolean a;
   @Nullable
   private final Duration b;

   public hhe(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(hgu $$0) {
      if (this.b != null) {
         $$0.send(hgv.d, $$0x -> {
            $$0x.a(hgx.x, (int)this.b.toMillis());
            $$0x.a(hgx.y, this.a);
         });
      }
   }
}
