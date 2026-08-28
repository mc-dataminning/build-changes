import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gek implements avw {
   private Map<gem, geu> a = ImmutableMap.of();

   public geo a(gem $$0) {
      geu $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(avv $$0) {
      this.a = ImmutableMap.copyOf(gel.a());
   }
}
