import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fwx implements auq {
   private Map<fwz, fxh> a = ImmutableMap.of();

   public fxb a(fwz $$0) {
      fxh $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(aup $$0) {
      this.a = ImmutableMap.copyOf(fwy.a());
   }
}
