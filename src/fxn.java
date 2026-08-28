import java.util.Arrays;
import java.util.stream.Stream;

public class fxn extends fxq {
   private static final wp a = wp.c("options.mouse_settings.title");

   private static fln<?>[] a(flo $$0) {
      return new fln[]{$$0.d(), $$0.U(), $$0.H(), $$0.V(), $$0.ac()};
   }

   public fxn(fum $$0, flo $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      if (feq.a()) {
         this.d.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.I())).toArray(fln[]::new));
      } else {
         this.d.a(a(this.c));
      }
   }
}
