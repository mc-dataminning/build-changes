import java.util.Arrays;
import java.util.stream.Stream;

public class fwx extends fxa {
   private static final xv a = xv.c("options.mouse_settings.title");

   private static fmh<?>[] a(fmi $$0) {
      return new fmh[]{$$0.d(), $$0.U(), $$0.H(), $$0.V(), $$0.ac()};
   }

   public fwx(ftw $$0, fmi $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void l() {
      if (ffl.a()) {
         this.d.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.I())).toArray(fmh[]::new));
      } else {
         this.d.a(a(this.c));
      }
   }
}
