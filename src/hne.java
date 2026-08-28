import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class hne {
   private static final ebh<dne, ebg> a = b();
   private static final ebh<dne, ebg> b = b();
   private static final alk c = alk.b("glow_item_frame");
   private static final alk d = alk.b("item_frame");
   private static final Map<alk, ebh<dne, ebg>> e = Map.of(d, a, c, b);

   private static ebh<dne, ebg> b() {
      return new ebh.a<dne, ebg>(dng.a).a(ebw.bG).a(dne::m, ebg::new);
   }

   public static ebg a(boolean $$0, boolean $$1) {
      return ($$0 ? b : a).b().b(ebw.bG, Boolean.valueOf($$1));
   }

   static Function<alk, ebh<dne, ebg>> a() {
      Map<alk, ebh<dne, ebg>> $$0 = new HashMap<>(e);

      for (dne $$1 : mh.e) {
         $$0.put($$1.p().h().a(), $$1.l());
      }

      return $$0::get;
   }
}
