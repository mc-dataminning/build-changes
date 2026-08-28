import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class pi {
   private final pa a;
   private final dbv b;
   private final dbv c;
   private final dbv d;
   private final Map<String, ap<?>> e = new LinkedHashMap<>();

   public pi(pa $$0, dbv $$1, dbv $$2, dbv $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static pi a(dbv $$0, dbv $$1, dbv $$2, pa $$3) {
      return new pi($$3, $$0, $$1, $$2);
   }

   public pi a(String $$0, ap<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(pb $$0, aly<dbz<?>> $$1) {
      this.a($$1);
      ag.a $$2 = $$0.a().a("has_the_recipe", dv.a($$1)).a(al.a.c($$1)).a(ak.a.b);
      this.e.forEach($$2::a);
      dcw $$3 = new dcw(Optional.of(this.b), Optional.of(this.c), Optional.of(this.d));
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.a.a() + "/")));
   }

   private void a(aly<dbz<?>> $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
