import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fxm implements atx {
   private Map<fxo, fxw> a = ImmutableMap.of();

   public fxq a(fxo $$0) {
      fxw $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(atw $$0) {
      this.a = ImmutableMap.copyOf(fxn.a());
   }
}
