import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gej implements avw {
   private Map<gel, get> a = ImmutableMap.of();

   public gen a(gel $$0) {
      get $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(avv $$0) {
      this.a = ImmutableMap.copyOf(gek.a());
   }
}
