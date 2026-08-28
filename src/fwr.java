import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fwr implements aum {
   private Map<fwt, fxb> a = ImmutableMap.of();

   public fwv a(fwt $$0) {
      fxb $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(aul $$0) {
      this.a = ImmutableMap.copyOf(fws.a());
   }
}
