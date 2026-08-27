import java.time.Duration;
import javax.annotation.Nullable;

public class ged {
   private final boolean a;
   @Nullable
   private final Duration b;

   public ged(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(gdt $$0) {
      if (this.b != null) {
         $$0.send(gdu.d, $$0x -> {
            $$0x.a(gdw.x, (int)this.b.toMillis());
            $$0x.a(gdw.y, this.a);
         });
      }
   }
}
