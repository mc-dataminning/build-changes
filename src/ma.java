import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.Map;

public class ma {
   private final ls a;
   private final cmm b;
   private final cmm c;
   private final cmm d;
   private final Map<String, am<?>> e = new LinkedHashMap<>();
   private final cms<?> f;

   public ma(cms<?> $$0, ls $$1, cmm $$2, cmm $$3, cmm $$4) {
      this.a = $$1;
      this.f = $$0;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
   }

   public static ma a(cmm $$0, cmm $$1, cmm $$2, ls $$3) {
      return new ma(cms.v, $$3, $$0, $$1, $$2);
   }

   public ma a(String $$0, am<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(lt $$0, aez $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cu.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.e.forEach($$2::a);
      $$0.a(new ma.a($$1, this.f, this.b, this.c, this.d, $$2.b($$1.d("recipes/" + this.a.a() + "/"))));
   }

   private void a(aez $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   public static record a(aez a, cms<?> b, cmm c, cmm d, cmm e, af f) implements lq {
      @Override
      public void a(JsonObject $$0) {
         $$0.add("template", this.c.a(true));
         $$0.add("base", this.d.a(true));
         $$0.add("addition", this.e.a(true));
      }

      @Override
      public aez b() {
         return this.a;
      }

      @Override
      public cms<?> c() {
         return this.b;
      }

      public cmm e() {
         return this.c;
      }

      public cmm f() {
         return this.d;
      }

      public cmm g() {
         return this.e;
      }

      @Override
      public af d() {
         return this.f;
      }
   }
}
