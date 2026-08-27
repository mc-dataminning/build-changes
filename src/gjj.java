import java.time.Duration;
import javax.annotation.Nullable;

public class gjj {
   private final boolean a;
   @Nullable
   private final Duration b;

   public gjj(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(giz $$0) {
      if (this.b != null) {
         $$0.send(gja.d, $$0x -> {
            $$0x.a(gjc.x, (int)this.b.toMillis());
            $$0x.a(gjc.y, this.a);
         });
      }
   }
}
