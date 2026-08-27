import java.time.Duration;
import javax.annotation.Nullable;

public class gdy {
   private final boolean a;
   @Nullable
   private final Duration b;

   public gdy(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(gdo $$0) {
      if (this.b != null) {
         $$0.send(gdp.d, $$0x -> {
            $$0x.a(gdr.x, (int)this.b.toMillis());
            $$0x.a(gdr.y, this.a);
         });
      }
   }
}
