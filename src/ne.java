import java.util.LinkedHashMap;
import java.util.Map;

public class ne {
   private final cpy a;
   private final cpy b;
   private final cpy c;
   private final mx d;
   private final cms e;
   private final Map<String, an<?>> f = new LinkedHashMap<>();

   public ne(cpy $$0, cpy $$1, cpy $$2, mx $$3, cms $$4) {
      this.d = $$3;
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.e = $$4;
   }

   public static ne a(cpy $$0, cpy $$1, cpy $$2, mx $$3, cms $$4) {
      return new ne($$0, $$1, $$2, $$3, $$4);
   }

   public ne a(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(my $$0, String $$1) {
      this.a($$0, new ahg($$1));
   }

   public void a(my $$0, ahg $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", ct.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      cqs $$3 = new cqs(this.a, this.b, this.c, new cmx(this.e));
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.d.a() + "/")));
   }

   private void a(ahg $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
