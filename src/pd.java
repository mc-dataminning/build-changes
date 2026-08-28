import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class pd {
   private final dbr a;
   private final dbr b;
   private final dbr c;
   private final ow d;
   private final cxc e;
   private final Map<String, ap<?>> f = new LinkedHashMap<>();

   public pd(dbr $$0, dbr $$1, dbr $$2, ow $$3, cxc $$4) {
      this.d = $$3;
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.e = $$4;
   }

   public static pd a(dbr $$0, dbr $$1, dbr $$2, ow $$3, cxc $$4) {
      return new pd($$0, $$1, $$2, $$3, $$4);
   }

   public pd a(String $$0, ap<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(ox $$0, String $$1) {
      this.a($$0, alo.a(mb.bk, alp.a($$1)));
   }

   public void a(ox $$0, alo<dbv<?>> $$1) {
      this.a($$1);
      ag.a $$2 = $$0.a().a("has_the_recipe", dv.a($$1)).a(al.a.c($$1)).a(ak.a.b);
      this.f.forEach($$2::a);
      dcs $$3 = new dcs(Optional.of(this.a), Optional.of(this.b), Optional.of(this.c), new cxg(this.e));
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.d.a() + "/")));
   }

   private void a(alo<dbv<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
