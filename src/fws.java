import java.util.Arrays;
import java.util.stream.Stream;

public class fws extends fwv {
   private static final xv a = xv.c("options.mouse_settings.title");

   private static fmc<?>[] a(fmd $$0) {
      return new fmc[]{$$0.d(), $$0.U(), $$0.H(), $$0.V(), $$0.ac()};
   }

   public fws(ftr $$0, fmd $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void l() {
      if (ffg.a()) {
         this.d.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.I())).toArray(fmc[]::new));
      } else {
         this.d.a(a(this.c));
      }
   }
}
