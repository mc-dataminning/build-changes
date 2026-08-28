import java.util.Arrays;
import java.util.stream.Stream;

public class fxl extends fxo {
   private static final wp a = wp.c("options.mouse_settings.title");

   private static fll<?>[] a(flm $$0) {
      return new fll[]{$$0.d(), $$0.U(), $$0.H(), $$0.V(), $$0.ac()};
   }

   public fxl(fuk $$0, flm $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      if (feo.a()) {
         this.d.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.I())).toArray(fll[]::new));
      } else {
         this.d.a(a(this.c));
      }
   }
}
