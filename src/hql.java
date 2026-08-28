import java.time.Duration;
import javax.annotation.Nullable;

public class hql {
   private final boolean a;
   @Nullable
   private final Duration b;

   public hql(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(hqb $$0) {
      if (this.b != null) {
         $$0.send(hqc.d, $$0x -> {
            $$0x.a(hqe.x, (int)this.b.toMillis());
            $$0x.a(hqe.y, this.a);
         });
      }
   }
}
