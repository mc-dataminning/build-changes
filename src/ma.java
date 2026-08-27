import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.Map;

public class ma {
   private final ls a;
   private final cmg b;
   private final cmg c;
   private final cmg d;
   private final Map<String, am<?>> e = new LinkedHashMap<>();
   private final cmm<?> f;

   public ma(cmm<?> $$0, ls $$1, cmg $$2, cmg $$3, cmg $$4) {
      this.a = $$1;
      this.f = $$0;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
   }

   public static ma a(cmg $$0, cmg $$1, cmg $$2, ls $$3) {
      return new ma(cmm.v, $$3, $$0, $$1, $$2);
   }

   public ma a(String $$0, am<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(lt $$0, aew $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cu.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.e.forEach($$2::a);
      $$0.a(new ma.a($$1, this.f, this.b, this.c, this.d, $$2.b($$1.d("recipes/" + this.a.a() + "/"))));
   }

   private void a(aew $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   public static record a(aew a, cmm<?> b, cmg c, cmg d, cmg e, af f) implements lq {
      @Override
      public void a(JsonObject $$0) {
         $$0.add("template", this.c.a(true));
         $$0.add("base", this.d.a(true));
         $$0.add("addition", this.e.a(true));
      }

      @Override
      public aew b() {
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
