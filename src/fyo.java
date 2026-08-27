import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fyo implements aue {
   private Map<fyq, fyy> a = ImmutableMap.of();

   public fys a(fyq $$0) {
      fyy $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(aud $$0) {
      this.a = ImmutableMap.copyOf(fyp.a());
   }
}
