import java.time.Duration;
import javax.annotation.Nullable;

public class gni {
   private final boolean a;
   @Nullable
   private final Duration b;

   public gni(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(gmy $$0) {
      if (this.b != null) {
         $$0.send(gmz.d, $$0x -> {
            $$0x.a(gnb.x, (int)this.b.toMillis());
            $$0x.a(gnb.y, this.a);
         });
      }
   }
}
