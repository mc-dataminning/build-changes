import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class hnc {
   private static final ebf<dnc, ebe> a = b();
   private static final ebf<dnc, ebe> b = b();
   private static final ali c = ali.b("glow_item_frame");
   private static final ali d = ali.b("item_frame");
   private static final Map<ali, ebf<dnc, ebe>> e = Map.of(d, a, c, b);

   private static ebf<dnc, ebe> b() {
      return new ebf.a<dnc, ebe>(dne.a).a(ebu.bG).a(dnc::m, ebe::new);
   }

   public static ebe a(boolean $$0, boolean $$1) {
      return ($$0 ? b : a).b().b(ebu.bG, Boolean.valueOf($$1));
   }

   static Function<ali, ebf<dnc, ebe>> a() {
      Map<ali, ebf<dnc, ebe>> $$0 = new HashMap<>(e);

      for (dnc $$1 : mg.e) {
         $$0.put($$1.p().h().a(), $$1.l());
      }

      return $$0::get;
   }
}
