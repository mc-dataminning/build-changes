import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class oi {
   private final oa a;
   private final dbb b;
   private final dbb c;
   private final dbb d;
   private final Map<String, aq<?>> e = new LinkedHashMap<>();

   public oi(oa $$0, dbb $$1, dbb $$2, dbb $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static oi a(dbb $$0, dbb $$1, dbb $$2, oa $$3) {
      return new oi($$3, $$0, $$1, $$2);
   }

   public oi a(String $$0, aq<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(ob $$0, aku<dbf<?>> $$1) {
      this.a($$1);
      ah.a $$2 = $$0.a().a("has_the_recipe", dw.a($$1)).a(am.a.c($$1)).a(al.a.b);
      this.e.forEach($$2::a);
      dcd $$3 = new dcd(Optional.of(this.b), Optional.of(this.c), Optional.of(this.d));
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.a.a() + "/")));
   }

   private void a(aku<dbf<?>> $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
