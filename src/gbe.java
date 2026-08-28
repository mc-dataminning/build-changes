import java.util.Arrays;
import java.util.stream.Stream;

public class gbe extends gbh {
   private static final wy a = wy.c("options.mouse_settings.title");

   private static fpc<?>[] a(fpd $$0) {
      return new fpc[]{$$0.d(), $$0.U(), $$0.H(), $$0.V(), $$0.ac()};
   }

   public gbe(fyb $$0, fpd $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      if (fif.a()) {
         this.d.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.I())).toArray(fpc[]::new));
      } else {
         this.d.a(a(this.c));
      }
   }
}
