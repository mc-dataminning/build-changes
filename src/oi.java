import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class oi {
   private final oa a;
   private final day b;
   private final day c;
   private final day d;
   private final Map<String, aq<?>> e = new LinkedHashMap<>();

   public oi(oa $$0, day $$1, day $$2, day $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static oi a(day $$0, day $$1, day $$2, oa $$3) {
      return new oi($$3, $$0, $$1, $$2);
   }

   public oi a(String $$0, aq<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(ob $$0, akt<dbc<?>> $$1) {
      this.a($$1);
      ah.a $$2 = $$0.a().a("has_the_recipe", dw.a($$1)).a(am.a.c($$1)).a(al.a.b);
      this.e.forEach($$2::a);
      dca $$3 = new dca(Optional.of(this.b), Optional.of(this.c), Optional.of(this.d));
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.a.a() + "/")));
   }

   private void a(akt<dbc<?>> $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
