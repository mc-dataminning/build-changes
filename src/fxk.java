import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fxk implements atx {
   private Map<fxm, fxu> a = ImmutableMap.of();

   public fxo a(fxm $$0) {
      fxu $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(atw $$0) {
      this.a = ImmutableMap.copyOf(fxl.a());
   }
}
