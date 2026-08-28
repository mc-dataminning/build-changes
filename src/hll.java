import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class hll {
   private static final eap<dmm, eao> a = b();
   private static final eap<dmm, eao> b = b();
   private static final alg c = alg.b("glow_item_frame");
   private static final alg d = alg.b("item_frame");
   private static final Map<alg, eap<dmm, eao>> e = Map.of(d, a, c, b);

   private static eap<dmm, eao> b() {
      return new eap.a<dmm, eao>(dmo.a).a(ebe.bG).a(dmm::m, eao::new);
   }

   public static eao a(boolean $$0, boolean $$1) {
      return ($$0 ? b : a).b().b(ebe.bG, Boolean.valueOf($$1));
   }

   static Function<alg, eap<dmm, eao>> a() {
      Map<alg, eap<dmm, eao>> $$0 = new HashMap<>(e);

      for (dmm $$1 : mg.e) {
         $$0.put($$1.p().h().a(), $$1.l());
      }

      return $$0::get;
   }
}
