import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class ol {
   private final ddf a;
   private final ddf b;
   private final ddf c;
   private final oe d;
   private final cyo e;
   private final Map<String, aq<?>> f = new LinkedHashMap<>();

   public ol(ddf $$0, ddf $$1, ddf $$2, oe $$3, cyo $$4) {
      this.d = $$3;
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.e = $$4;
   }

   public static ol a(ddf $$0, ddf $$1, ddf $$2, oe $$3, cyo $$4) {
      return new ol($$0, $$1, $$2, $$3, $$4);
   }

   public ol a(String $$0, aq<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(of $$0, String $$1) {
      this.a($$0, ald.a(mg.bs, ale.a($$1)));
   }

   public void a(of $$0, ald<ddj<?>> $$1) {
      this.a($$1);
      ah.a $$2 = $$0.a().a("has_the_recipe", dg.a($$1)).a(am.a.c($$1)).a(al.a.b);
      this.f.forEach($$2::a);
      deg $$3 = new deg(Optional.of(this.a), this.b, Optional.of(this.c), new dem(this.e));
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.d.a() + "/")));
   }

   private void a(ald<ddj<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
