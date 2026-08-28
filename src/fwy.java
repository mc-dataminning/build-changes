import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fwy implements auq {
   private Map<fxa, fxi> a = ImmutableMap.of();

   public fxc a(fxa $$0) {
      fxi $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(aup $$0) {
      this.a = ImmutableMap.copyOf(fwz.a());
   }
}
