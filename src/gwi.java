import java.time.Duration;
import javax.annotation.Nullable;

public class gwi {
   private final boolean a;
   @Nullable
   private final Duration b;

   public gwi(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(gvy $$0) {
      if (this.b != null) {
         $$0.send(gvz.d, $$0x -> {
            $$0x.a(gwb.x, (int)this.b.toMillis());
            $$0x.a(gwb.y, this.a);
         });
      }
   }
}
