import java.util.LinkedHashMap;
import java.util.Map;

public class om {
   private final oe a;
   private final ddl b;
   private final ddl c;
   private final ddl d;
   private final je<dhn> e;
   private final Map<String, aq<?>> f = new LinkedHashMap<>();

   public om(oe $$0, ddl $$1, ddl $$2, ddl $$3, je<dhn> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public static om a(ddl $$0, ddl $$1, ddl $$2, je<dhn> $$3, oe $$4) {
      return new om($$4, $$0, $$1, $$2, $$3);
   }

   public om a(String $$0, aq<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(of $$0, alf<ddp<?>> $$1) {
      this.a($$1);
      ah.a $$2 = $$0.a().a("has_the_recipe", dg.a($$1)).a(am.a.c($$1)).a(al.a.b);
      this.f.forEach($$2::a);
      den $$3 = new den(this.b, this.c, this.d, this.e);
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.a.a() + "/")));
   }

   private void a(alf<ddp<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
