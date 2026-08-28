import java.util.Arrays;
import java.util.stream.Stream;

public class gdg extends gdj {
   private static final xa a = xa.c("options.mouse_settings.title");

   private static frg<?>[] a(frh $$0) {
      return new frg[]{$$0.d(), $$0.U(), $$0.H(), $$0.V(), $$0.ac()};
   }

   public gdg(gad $$0, frh $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      if (fka.a()) {
         this.d.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.I())).toArray(frg[]::new));
      } else {
         this.d.a(a(this.c));
      }
   }
}
