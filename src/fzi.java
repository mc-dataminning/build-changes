import java.util.Arrays;
import java.util.stream.Stream;

public class fzi extends fzl {
   private static final wv a = wv.c("options.mouse_settings.title");

   private static fng<?>[] a(fnh $$0) {
      return new fng[]{$$0.d(), $$0.U(), $$0.H(), $$0.V(), $$0.ac()};
   }

   public fzi(fwf $$0, fnh $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      if (fgj.a()) {
         this.d.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.I())).toArray(fng[]::new));
      } else {
         this.d.a(a(this.c));
      }
   }
}
