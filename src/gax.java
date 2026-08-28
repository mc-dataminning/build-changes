import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gax implements avb {
   private Map<gaz, gbh> a = ImmutableMap.of();

   public gbb a(gaz $$0) {
      gbh $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(ava $$0) {
      this.a = ImmutableMap.copyOf(gay.a());
   }
}
