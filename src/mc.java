import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.Map;

public class mc {
   private final lu a;
   private final cmi b;
   private final cmi c;
   private final cmi d;
   private final Map<String, am<?>> e = new LinkedHashMap<>();
   private final cmo<?> f;

   public mc(cmo<?> $$0, lu $$1, cmi $$2, cmi $$3, cmi $$4) {
      this.a = $$1;
      this.f = $$0;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
   }

   public static mc a(cmi $$0, cmi $$1, cmi $$2, lu $$3) {
      return new mc(cmo.v, $$3, $$0, $$1, $$2);
   }

   public mc a(String $$0, am<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(lv $$0, aey $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cu.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.e.forEach($$2::a);
      $$0.a(new mc.a($$1, this.f, this.b, this.c, this.d, $$2.b($$1.d("recipes/" + this.a.a() + "/"))));
   }

   private void a(aey $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   public static record a(aey a, cmo<?> b, cmi c, cmi d, cmi e, af f) implements ls {
      @Override
      public void a(JsonObject $$0) {
         $$0.add("template", this.c.a(true));
         $$0.add("base", this.d.a(true));
         $$0.add("addition", this.e.a(true));
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

      @Override
      public af d() {
         return this.f;
      }
   }
}
