import java.util.Arrays;
import java.util.stream.Stream;

public class gdi extends gdl {
   private static final xc a = xc.c("options.mouse_settings.title");

   private static fri<?>[] a(frj $$0) {
      return new fri[]{$$0.d(), $$0.U(), $$0.H(), $$0.V(), $$0.ac()};
   }

   public gdi(gaf $$0, frj $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      if (fkc.a()) {
         this.d.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.I())).toArray(fri[]::new));
      } else {
         this.d.a(a(this.c));
      }
   }
}
