import java.util.Arrays;
import java.util.stream.Stream;

public class gal extends gao {
   private static final ww a = ww.c("options.mouse_settings.title");

   private static foi<?>[] a(foj $$0) {
      return new foi[]{$$0.d(), $$0.U(), $$0.H(), $$0.V(), $$0.ac()};
   }

   public gal(fxi $$0, foj $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      if (fhl.a()) {
         this.d.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.I())).toArray(foi[]::new));
      } else {
         this.d.a(a(this.c));
      }
   }
}
