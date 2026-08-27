import java.time.Duration;
import javax.annotation.Nullable;

public class gdk {
   private final boolean a;
   @Nullable
   private final Duration b;

   public gdk(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(gda $$0) {
      if (this.b != null) {
         $$0.send(gdb.d, $$0x -> {
            $$0x.a(gdd.x, (int)this.b.toMillis());
            $$0x.a(gdd.y, this.a);
         });
      }
   }
}
