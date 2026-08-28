import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class ph {
   private final dbv a;
   private final dbv b;
   private final dbv c;
   private final pa d;
   private final cxg e;
   private final Map<String, ap<?>> f = new LinkedHashMap<>();

   public ph(dbv $$0, dbv $$1, dbv $$2, pa $$3, cxg $$4) {
      this.d = $$3;
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.e = $$4;
   }

   public static ph a(dbv $$0, dbv $$1, dbv $$2, pa $$3, cxg $$4) {
      return new ph($$0, $$1, $$2, $$3, $$4);
   }

   public ph a(String $$0, ap<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(pb $$0, String $$1) {
      this.a($$0, aly.a(mb.bj, alz.a($$1)));
   }

   public void a(pb $$0, aly<dbz<?>> $$1) {
      this.a($$1);
      ag.a $$2 = $$0.a().a("has_the_recipe", dv.a($$1)).a(al.a.c($$1)).a(ak.a.b);
      this.f.forEach($$2::a);
      dcv $$3 = new dcv(Optional.of(this.a), Optional.of(this.b), Optional.of(this.c), new cxk(this.e));
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.d.a() + "/")));
   }

   private void a(aly<dbz<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
