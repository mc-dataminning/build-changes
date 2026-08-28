import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gbi implements avc {
   private Map<gbk, gbs> a = ImmutableMap.of();

   public gbm a(gbk $$0) {
      gbs $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(avb $$0) {
      this.a = ImmutableMap.copyOf(gbj.a());
   }
}
