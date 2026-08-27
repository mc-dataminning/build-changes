import java.util.LinkedHashMap;
import java.util.Map;

public class ne {
   private final cqh a;
   private final cqh b;
   private final cqh c;
   private final mx d;
   private final cnb e;
   private final Map<String, an<?>> f = new LinkedHashMap<>();

   public ne(cqh $$0, cqh $$1, cqh $$2, mx $$3, cnb $$4) {
      this.d = $$3;
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.e = $$4;
   }

   public static ne a(cqh $$0, cqh $$1, cqh $$2, mx $$3, cnb $$4) {
      return new ne($$0, $$1, $$2, $$3, $$4);
   }

   public ne a(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(my $$0, String $$1) {
      this.a($$0, new ahh($$1));
   }

   public void a(my $$0, ahh $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", ct.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      crb $$3 = new crb(this.a, this.b, this.c, new cng(this.e));
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.d.a() + "/")));
   }

   private void a(ahh $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
