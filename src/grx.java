import java.time.Duration;
import javax.annotation.Nullable;

public class grx {
   private final boolean a;
   @Nullable
   private final Duration b;

   public grx(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(grn $$0) {
      if (this.b != null) {
         $$0.send(gro.d, $$0x -> {
            $$0x.a(grq.x, (int)this.b.toMillis());
            $$0x.a(grq.y, this.a);
         });
      }
   }
}
