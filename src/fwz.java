import java.util.Arrays;
import java.util.stream.Stream;

public class fwz extends fxc {
   private static final xv a = xv.c("options.mouse_settings.title");

   private static fmj<?>[] a(fmk $$0) {
      return new fmj[]{$$0.d(), $$0.U(), $$0.H(), $$0.V(), $$0.ac()};
   }

   public fwz(fty $$0, fmk $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void l() {
      if (ffn.a()) {
         this.d.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.I())).toArray(fmj[]::new));
      } else {
         this.d.a(a(this.c));
      }
   }
}
