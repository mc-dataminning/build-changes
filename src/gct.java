import java.util.Arrays;
import java.util.stream.Stream;

public class gct extends gcw {
   private static final xg a = xg.c("options.mouse_settings.title");

   private static fqt<?>[] a(fqu $$0) {
      return new fqt[]{$$0.d(), $$0.U(), $$0.H(), $$0.V(), $$0.ac()};
   }

   public gct(fzq $$0, fqu $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      if (fka.a()) {
         this.d.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.I())).toArray(fqt[]::new));
      } else {
         this.d.a(a(this.c));
      }
   }
}
