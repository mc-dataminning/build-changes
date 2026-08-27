import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.Map;

public class mb {
   private final cmi a;
   private final cmi b;
   private final cmi c;
   private final lu d;
   private final cjc e;
   private final Map<String, am<?>> f = new LinkedHashMap<>();
   private final cmo<?> g;

   public mb(cmo<?> $$0, cmi $$1, cmi $$2, cmi $$3, lu $$4, cjc $$5) {
      this.d = $$4;
      this.g = $$0;
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.e = $$5;
   }

   public static mb a(cmi $$0, cmi $$1, cmi $$2, lu $$3, cjc $$4) {
      return new mb(cmo.u, $$0, $$1, $$2, $$3, $$4);
   }

   public mb a(String $$0, am<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(lv $$0, String $$1) {
      this.a($$0, new aey($$1));
   }

   public void a(lv $$0, aey $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cu.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      $$0.a(new mb.a($$1, this.g, this.a, this.b, this.c, this.e, $$2.b($$1.d("recipes/" + this.d.a() + "/"))));
   }

   private void a(aey $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   public static record a(aey a, cmo<?> b, cmi c, cmi d, cmi e, cjc f, af g) implements ls {
      @Override
      public void a(JsonObject $$0) {
         $$0.add("template", this.c.a(true));
         $$0.add("base", this.d.a(true));
         $$0.add("addition", this.e.a(true));
         JsonObject $$1 = new JsonObject();
         $$1.addProperty("item", jd.i.b(this.f).toString());
         $$0.add("result", $$1);
      }

      @Override
      public aey b() {
         return this.a;
      }

      @Override
      public cmo<?> c() {
         return this.b;
      }

      public cmi e() {
         return this.c;
      }

      public cmi f() {
         return this.d;
      }

      public cmi g() {
         return this.e;
      }

      public cjc h() {
         return this.f;
      }

      @Override
      public af d() {
         return this.g;
      }
   }
}
