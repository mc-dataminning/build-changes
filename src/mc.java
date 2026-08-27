import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.Map;

public class mc {
   private final lu a;
   private final cmg b;
   private final cmg c;
   private final cmg d;
   private final Map<String, am<?>> e = new LinkedHashMap<>();
   private final cmm<?> f;

   public mc(cmm<?> $$0, lu $$1, cmg $$2, cmg $$3, cmg $$4) {
      this.a = $$1;
      this.f = $$0;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
   }

   public static mc a(cmg $$0, cmg $$1, cmg $$2, lu $$3) {
      return new mc(cmm.v, $$3, $$0, $$1, $$2);
   }

   public mc a(String $$0, am<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(lv $$0, aex $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cu.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.e.forEach($$2::a);
      $$0.a(new mc.a($$1, this.f, this.b, this.c, this.d, $$2.b($$1.d("recipes/" + this.a.a() + "/"))));
   }

   private void a(aex $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   public static record a(aex a, cmm<?> b, cmg c, cmg d, cmg e, af f) implements ls {
      @Override
      public void a(JsonObject $$0) {
         $$0.add("template", this.c.a(true));
         $$0.add("base", this.d.a(true));
         $$0.add("addition", this.e.a(true));
      }

      @Override
      public aex b() {
         return this.a;
      }

      @Override
      public cmm<?> c() {
         return this.b;
      }

      public cmg e() {
         return this.c;
      }

      public cmg f() {
         return this.d;
      }

      public cmg g() {
         return this.e;
      }

      @Override
      public af d() {
         return this.f;
      }
   }
}
