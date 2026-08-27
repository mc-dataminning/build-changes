import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.Map;

public class nc {
   private final coq a;
   private final coq b;
   private final coq c;
   private final mv d;
   private final clj e;
   private final Map<String, am<?>> f = new LinkedHashMap<>();
   private final cox<?> g;

   public nc(cox<?> $$0, coq $$1, coq $$2, coq $$3, mv $$4, clj $$5) {
      this.d = $$4;
      this.g = $$0;
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.e = $$5;
   }

   public static nc a(coq $$0, coq $$1, coq $$2, mv $$3, clj $$4) {
      return new nc(cox.u, $$0, $$1, $$2, $$3, $$4);
   }

   public nc a(String $$0, am<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(mw $$0, String $$1) {
      this.a($$0, new agm($$1));
   }

   public void a(mw $$0, agm $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cu.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      $$0.a(new nc.a($$1, this.g, this.a, this.b, this.c, this.e, $$2.b($$1.d("recipes/" + this.d.a() + "/"))));
   }

   private void a(agm $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   public static record a(agm a, cox<?> b, coq c, coq d, coq e, clj f, af g) implements mt {
      @Override
      public void a(JsonObject $$0) {
         $$0.add("template", this.c.a(true));
         $$0.add("base", this.d.a(true));
         $$0.add("addition", this.e.a(true));
         JsonObject $$1 = new JsonObject();
         $$1.addProperty("item", kc.i.b(this.f).toString());
         $$0.add("result", $$1);
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

      public clj h() {
         return this.f;
      }

      @Override
      public af d() {
         return this.g;
      }
   }
}
