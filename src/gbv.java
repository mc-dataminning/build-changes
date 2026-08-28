import java.util.Arrays;
import java.util.stream.Stream;

public class gbv extends gby {
   private static final wy a = wy.c("options.mouse_settings.title");

   private static fpw<?>[] a(fpx $$0) {
      return new fpw[]{$$0.d(), $$0.U(), $$0.H(), $$0.V(), $$0.ac()};
   }

   public gbv(fys $$0, fpx $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      if (fiu.a()) {
         this.d.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.I())).toArray(fpw[]::new));
      } else {
         this.d.a(a(this.c));
      }
   }
}
