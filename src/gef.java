import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gef implements avm {
   private Map<geh, gep> a = ImmutableMap.of();

   public gej a(geh $$0) {
      gep $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(avl $$0) {
      this.a = ImmutableMap.copyOf(geg.a());
   }
}
