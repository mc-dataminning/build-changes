import java.util.Arrays;
import java.util.stream.Stream;

public class fup extends fus {
   private static final xl a = xl.c("options.mouse_settings.title");

   private static fka<?>[] a(fkb $$0) {
      return new fka[]{$$0.d(), $$0.T(), $$0.G(), $$0.U(), $$0.ab()};
   }

   public fup(frp $$0, fkb $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      if (fdf.a()) {
         this.d.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.H())).toArray(fka[]::new));
      } else {
         this.d.a(a(this.c));
      }
   }
}
