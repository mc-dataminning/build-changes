import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class ol {
   private final ddl a;
   private final ddl b;
   private final ddl c;
   private final oe d;
   private final cyu e;
   private final Map<String, aq<?>> f = new LinkedHashMap<>();

   public ol(ddl $$0, ddl $$1, ddl $$2, oe $$3, cyu $$4) {
      this.d = $$3;
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.e = $$4;
   }

   public static ol a(ddl $$0, ddl $$1, ddl $$2, oe $$3, cyu $$4) {
      return new ol($$0, $$1, $$2, $$3, $$4);
   }

   public ol a(String $$0, aq<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(of $$0, String $$1) {
      this.a($$0, alf.a(mg.bt, alg.a($$1)));
   }

   public void a(of $$0, alf<ddp<?>> $$1) {
      this.a($$1);
      ah.a $$2 = $$0.a().a("has_the_recipe", dg.a($$1)).a(am.a.c($$1)).a(al.a.b);
      this.f.forEach($$2::a);
      dem $$3 = new dem(Optional.of(this.a), this.b, Optional.of(this.c), new des(this.e));
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.d.a() + "/")));
   }

   private void a(alf<ddp<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
