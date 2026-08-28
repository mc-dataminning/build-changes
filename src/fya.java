import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fya implements aue {
   private Map<fyc, fyk> a = ImmutableMap.of();

   public fye a(fyc $$0) {
      fyk $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(aud $$0) {
      this.a = ImmutableMap.copyOf(fyb.a());
   }
}
