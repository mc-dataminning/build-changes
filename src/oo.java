import java.util.LinkedHashMap;
import java.util.Map;

public class oo {
   private final og a;
   private final dex b;
   private final dex c;
   private final dex d;
   private final jg<diz> e;
   private final Map<String, ar<?>> f = new LinkedHashMap<>();

   public oo(og $$0, dex $$1, dex $$2, dex $$3, jg<diz> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public static oo a(dex $$0, dex $$1, dex $$2, jg<diz> $$3, og $$4) {
      return new oo($$4, $$0, $$1, $$2, $$3);
   }

   public oo a(String $$0, ar<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(oh $$0, alq<dfb<?>> $$1) {
      this.a($$1);
      ai.a $$2 = $$0.a().a("has_the_recipe", di.a($$1)).a(an.a.c($$1)).a(am.a.b);
      this.f.forEach($$2::a);
      dfz $$3 = new dfz(this.b, this.c, this.d, this.e);
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.a.a() + "/")));
   }

   private void a(alq<dfb<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
