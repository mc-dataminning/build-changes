import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gam implements auw {
   private Map<gao, gaw> a = ImmutableMap.of();

   public gaq a(gao $$0) {
      gaw $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(auv $$0) {
      this.a = ImmutableMap.copyOf(gan.a());
   }
}
