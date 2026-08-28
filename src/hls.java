import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class hls {
   private static final eau<dmr, eat> a = b();
   private static final eau<dmr, eat> b = b();
   private static final alg c = alg.b("glow_item_frame");
   private static final alg d = alg.b("item_frame");
   private static final Map<alg, eau<dmr, eat>> e = Map.of(d, a, c, b);

   private static eau<dmr, eat> b() {
      return new eau.a<dmr, eat>(dmt.a).a(ebj.bG).a(dmr::m, eat::new);
   }

   public static eat a(boolean $$0, boolean $$1) {
      return ($$0 ? b : a).b().b(ebj.bG, Boolean.valueOf($$1));
   }

   static Function<alg, eau<dmr, eat>> a() {
      Map<alg, eau<dmr, eat>> $$0 = new HashMap<>(e);

      for (dmr $$1 : mg.e) {
         $$0.put($$1.p().h().a(), $$1.l());
      }

      return $$0::get;
   }
}
