import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gby implements avf {
   private Map<gca, gci> a = ImmutableMap.of();

   public gcc a(gca $$0) {
      gci $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(ave $$0) {
      this.a = ImmutableMap.copyOf(gbz.a());
   }
}
