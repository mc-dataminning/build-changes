import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class fwp extends fyu<byp, fib<byp>> {
   private static final Map<byp.d, agt> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (byp.d $$1 : byp.d.values()) {
         $$0.put($$1, new agt(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public fwp(fxo.a $$0) {
      super($$0, new fib<>($$0.a(flx.e)), 0.5F);
   }

   public agt a(byp $$0) {
      return a.get($$0.ge());
   }
}
