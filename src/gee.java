import java.time.Duration;
import javax.annotation.Nullable;

public class gee {
   private final boolean a;
   @Nullable
   private final Duration b;

   public gee(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(gdu $$0) {
      if (this.b != null) {
         $$0.send(gdv.d, $$0x -> {
            $$0x.a(gdx.x, (int)this.b.toMillis());
            $$0x.a(gdx.y, this.a);
         });
      }
   }
}
