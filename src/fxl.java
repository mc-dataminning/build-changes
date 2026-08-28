import java.util.Arrays;
import java.util.stream.Stream;

public class fxl extends fxo {
   private static final wo a = wo.c("options.mouse_settings.title");

   private static flm<?>[] a(fln $$0) {
      return new flm[]{$$0.d(), $$0.U(), $$0.H(), $$0.V(), $$0.ac()};
   }

   public fxl(fuk $$0, fln $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      if (fep.a()) {
         this.d.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.I())).toArray(flm[]::new));
      } else {
         this.d.a(a(this.c));
      }
   }
}
