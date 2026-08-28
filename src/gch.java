import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gch implements ave {
   private Map<gcj, gcr> a = ImmutableMap.of();

   public gcl a(gcj $$0) {
      gcr $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(avd $$0) {
      this.a = ImmutableMap.copyOf(gci.a());
   }
}
