import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fwu implements aup {
   private Map<fww, fxe> a = ImmutableMap.of();

   public fwy a(fww $$0) {
      fxe $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(auo $$0) {
      this.a = ImmutableMap.copyOf(fwv.a());
   }
}
