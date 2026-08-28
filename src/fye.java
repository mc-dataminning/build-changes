import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fye implements auf {
   private Map<fyg, fyo> a = ImmutableMap.of();

   public fyi a(fyg $$0) {
      fyo $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(aue $$0) {
      this.a = ImmutableMap.copyOf(fyf.a());
   }
}
