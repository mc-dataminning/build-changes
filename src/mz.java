import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.Map;

public class mz {
   private final mr a;
   private final coc b;
   private final coc c;
   private final coc d;
   private final Map<String, am<?>> e = new LinkedHashMap<>();
   private final coj<?> f;

   public mz(coj<?> $$0, mr $$1, coc $$2, coc $$3, coc $$4) {
      this.a = $$1;
      this.f = $$0;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
   }

   public static mz a(coc $$0, coc $$1, coc $$2, mr $$3) {
      return new mz(coj.v, $$3, $$0, $$1, $$2);
   }

   public mz a(String $$0, am<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(ms $$0, agg $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cu.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.e.forEach($$2::a);
      $$0.a(new mz.a($$1, this.f, this.b, this.c, this.d, $$2.b($$1.d("recipes/" + this.a.a() + "/"))));
   }

   private void a(agg $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   public static record a(agg a, coj<?> b, coc c, coc d, coc e, af f) implements mp {
      @Override
      public void a(JsonObject $$0) {
         $$0.add("template", this.c.a(true));
         $$0.add("base", this.d.a(true));
         $$0.add("addition", this.e.a(true));
      }

      @Override
      public agg b() {
         return this.a;
      }

      @Override
      public coj<?> c() {
         return this.b;
      }

      public coc e() {
         return this.c;
      }

      public coc f() {
         return this.d;
      }

      public coc g() {
         return this.e;
      }

      @Override
      public af d() {
         return this.f;
      }
   }
}
