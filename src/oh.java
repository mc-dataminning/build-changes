import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class oh {
   private final dba a;
   private final dba b;
   private final dba c;
   private final oa d;
   private final cwl e;
   private final Map<String, aq<?>> f = new LinkedHashMap<>();

   public oh(dba $$0, dba $$1, dba $$2, oa $$3, cwl $$4) {
      this.d = $$3;
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.e = $$4;
   }

   public static oh a(dba $$0, dba $$1, dba $$2, oa $$3, cwl $$4) {
      return new oh($$0, $$1, $$2, $$3, $$4);
   }

   public oh a(String $$0, aq<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(ob $$0, String $$1) {
      this.a($$0, aku.a(mc.bk, akv.a($$1)));
   }

   public void a(ob $$0, aku<dbe<?>> $$1) {
      this.a($$1);
      ah.a $$2 = $$0.a().a("has_the_recipe", dw.a($$1)).a(am.a.c($$1)).a(al.a.b);
      this.f.forEach($$2::a);
      dcb $$3 = new dcb(Optional.of(this.a), Optional.of(this.b), Optional.of(this.c), new cwp(this.e));
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.d.a() + "/")));
   }

   private void a(aku<dbe<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
