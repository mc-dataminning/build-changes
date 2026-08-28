import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class hms {
   private static final ebr<dno, ebq> a = b();
   private static final ebr<dno, ebq> b = b();
   private static final alr c = alr.b("glow_item_frame");
   private static final alr d = alr.b("item_frame");
   private static final Map<alr, ebr<dno, ebq>> e = Map.of(d, a, c, b);

   private static ebr<dno, ebq> b() {
      return new ebr.a<dno, ebq>(dnq.a).a(ecg.bG).a(dno::m, ebq::new);
   }

   public static ebq a(boolean $$0, boolean $$1) {
      return ($$0 ? b : a).b().b(ecg.bG, Boolean.valueOf($$1));
   }

   static Function<alr, ebr<dno, ebq>> a() {
      Map<alr, ebr<dno, ebq>> $$0 = new HashMap<>(e);

      for (dno $$1 : mh.e) {
         $$0.put($$1.p().h().a(), $$1.l());
      }

      return $$0::get;
   }
}
