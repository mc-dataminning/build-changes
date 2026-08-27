import java.time.Duration;
import javax.annotation.Nullable;

public class gdp {
   private final boolean a;
   @Nullable
   private final Duration b;

   public gdp(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(gdf $$0) {
      if (this.b != null) {
         $$0.send(gdg.d, $$0x -> {
            $$0x.a(gdi.x, (int)this.b.toMillis());
            $$0x.a(gdi.y, this.a);
         });
      }
   }
}
