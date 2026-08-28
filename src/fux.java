import java.util.Arrays;
import java.util.stream.Stream;

public class fux extends fva {
   private static final xj a = xj.c("options.mouse_settings.title");

   private static fkh<?>[] a(fki $$0) {
      return new fkh[]{$$0.d(), $$0.T(), $$0.G(), $$0.U(), $$0.ab()};
   }

   public fux(frw $$0, fki $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      if (fdm.a()) {
         this.d.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.H())).toArray(fkh[]::new));
      } else {
         this.d.a(a(this.c));
      }
   }
}
