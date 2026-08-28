import java.time.Duration;
import javax.annotation.Nullable;

public class hqv {
   private final boolean a;
   @Nullable
   private final Duration b;

   public hqv(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(hql $$0) {
      if (this.b != null) {
         $$0.send(hqm.d, $$0x -> {
            $$0x.a(hqo.x, (int)this.b.toMillis());
            $$0x.a(hqo.y, this.a);
         });
      }
   }
}
