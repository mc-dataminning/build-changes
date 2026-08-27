import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.Map;

public class nd {
   private final mv a;
   private final coq b;
   private final coq c;
   private final coq d;
   private final Map<String, am<?>> e = new LinkedHashMap<>();
   private final cox<?> f;

   public nd(cox<?> $$0, mv $$1, coq $$2, coq $$3, coq $$4) {
      this.a = $$1;
      this.f = $$0;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
   }

   public static nd a(coq $$0, coq $$1, coq $$2, mv $$3) {
      return new nd(cox.v, $$3, $$0, $$1, $$2);
   }

   public nd a(String $$0, am<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(mw $$0, agm $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cu.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.e.forEach($$2::a);
      $$0.a(new nd.a($$1, this.f, this.b, this.c, this.d, $$2.b($$1.d("recipes/" + this.a.a() + "/"))));
   }

   private void a(agm $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   public static record a(agm a, cox<?> b, coq c, coq d, coq e, af f) implements mt {
      @Override
      public void a(JsonObject $$0) {
         $$0.add("template", this.c.a(true));
         $$0.add("base", this.d.a(true));
         $$0.add("addition", this.e.a(true));
      }

      @Override
      public agm b() {
         return this.a;
      }

      @Override
      public cox<?> c() {
         return this.b;
      }

      public coq e() {
         return this.c;
      }

      public coq f() {
         return this.d;
      }

      public coq g() {
         return this.e;
      }

      @Override
      public af d() {
         return this.f;
      }
   }
}
