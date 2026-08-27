import java.time.Duration;
import javax.annotation.Nullable;

public class gqs {
   private final boolean a;
   @Nullable
   private final Duration b;

   public gqs(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(gqi $$0) {
      if (this.b != null) {
         $$0.send(gqj.d, $$0x -> {
            $$0x.a(gql.x, (int)this.b.toMillis());
            $$0x.a(gql.y, this.a);
         });
      }
   }
}
