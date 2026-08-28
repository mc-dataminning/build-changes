import java.util.Arrays;
import java.util.stream.Stream;

public class gbq extends gbt {
   private static final wy a = wy.c("options.mouse_settings.title");

   private static fpr<?>[] a(fps $$0) {
      return new fpr[]{$$0.d(), $$0.U(), $$0.H(), $$0.V(), $$0.ac()};
   }

   public gbq(fyn $$0, fps $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      if (fip.a()) {
         this.d.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.I())).toArray(fpr[]::new));
      } else {
         this.d.a(a(this.c));
      }
   }
}
