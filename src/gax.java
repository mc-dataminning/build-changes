import java.util.Arrays;
import java.util.stream.Stream;

public class gax extends gba {
   private static final wy a = wy.c("options.mouse_settings.title");

   private static fov<?>[] a(fow $$0) {
      return new fov[]{$$0.d(), $$0.U(), $$0.H(), $$0.V(), $$0.ac()};
   }

   public gax(fxu $$0, fow $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      if (fhx.a()) {
         this.d.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.I())).toArray(fov[]::new));
      } else {
         this.d.a(a(this.c));
      }
   }
}
