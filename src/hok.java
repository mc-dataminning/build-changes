import java.time.Duration;
import javax.annotation.Nullable;

public class hok {
   private final boolean a;
   @Nullable
   private final Duration b;

   public hok(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(hoa $$0) {
      if (this.b != null) {
         $$0.send(hob.d, $$0x -> {
            $$0x.a(hod.x, (int)this.b.toMillis());
            $$0x.a(hod.y, this.a);
         });
      }
   }
}
