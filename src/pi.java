import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class pi {
   private final pa a;
   private final dbz b;
   private final dbz c;
   private final dbz d;
   private final Map<String, ap<?>> e = new LinkedHashMap<>();

   public pi(pa $$0, dbz $$1, dbz $$2, dbz $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static pi a(dbz $$0, dbz $$1, dbz $$2, pa $$3) {
      return new pi($$3, $$0, $$1, $$2);
   }

   public pi a(String $$0, ap<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(pb $$0, aly<dcd<?>> $$1) {
      this.a($$1);
      ag.a $$2 = $$0.a().a("has_the_recipe", dv.a($$1)).a(al.a.c($$1)).a(ak.a.b);
      this.e.forEach($$2::a);
      ddb $$3 = new ddb(Optional.of(this.b), Optional.of(this.c), Optional.of(this.d));
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.a.a() + "/")));
   }

   private void a(aly<dcd<?>> $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
