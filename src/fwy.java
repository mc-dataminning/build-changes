import java.util.Arrays;
import java.util.stream.Stream;

public class fwy extends fxb {
   private static final xv a = xv.c("options.mouse_settings.title");

   private static fmi<?>[] a(fmj $$0) {
      return new fmi[]{$$0.d(), $$0.U(), $$0.H(), $$0.V(), $$0.ac()};
   }

   public fwy(ftx $$0, fmj $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void l() {
      if (ffm.a()) {
         this.d.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.I())).toArray(fmi[]::new));
      } else {
         this.d.a(a(this.c));
      }
   }
}
