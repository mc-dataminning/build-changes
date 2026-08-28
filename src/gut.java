import java.time.Duration;
import javax.annotation.Nullable;

public class gut {
   private final boolean a;
   @Nullable
   private final Duration b;

   public gut(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(guj $$0) {
      if (this.b != null) {
         $$0.send(guk.d, $$0x -> {
            $$0x.a(gum.x, (int)this.b.toMillis());
            $$0x.a(gum.y, this.a);
         });
      }
   }
}
