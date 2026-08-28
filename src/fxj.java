import java.util.Arrays;
import java.util.stream.Stream;

public class fxj extends fxm {
   private static final wo a = wo.c("options.mouse_settings.title");

   private static flk<?>[] a(fll $$0) {
      return new flk[]{$$0.d(), $$0.U(), $$0.H(), $$0.V(), $$0.ac()};
   }

   public fxj(fui $$0, fll $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      if (fen.a()) {
         this.d.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.I())).toArray(flk[]::new));
      } else {
         this.d.a(a(this.c));
      }
   }
}
