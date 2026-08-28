import java.time.Duration;
import javax.annotation.Nullable;

public class hqx {
   private final boolean a;
   @Nullable
   private final Duration b;

   public hqx(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(hqn $$0) {
      if (this.b != null) {
         $$0.send(hqo.d, $$0x -> {
            $$0x.a(hqq.x, (int)this.b.toMillis());
            $$0x.a(hqq.y, this.a);
         });
      }
   }
}
