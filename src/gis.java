import java.time.Duration;
import javax.annotation.Nullable;

public class gis {
   private final boolean a;
   @Nullable
   private final Duration b;

   public gis(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(gii $$0) {
      if (this.b != null) {
         $$0.send(gij.d, $$0x -> {
            $$0x.a(gil.x, (int)this.b.toMillis());
            $$0x.a(gil.y, this.a);
         });
      }
   }
}
