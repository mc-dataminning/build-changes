import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fwv implements aup {
   private Map<fwx, fxf> a = ImmutableMap.of();

   public fwz a(fwx $$0) {
      fxf $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(auo $$0) {
      this.a = ImmutableMap.copyOf(fww.a());
   }
}
