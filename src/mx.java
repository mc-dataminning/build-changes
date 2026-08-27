import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.Map;

public class mx {
   private final mp a;
   private final cnk b;
   private final cnk c;
   private final cnk d;
   private final Map<String, am<?>> e = new LinkedHashMap<>();
   private final cnq<?> f;

   public mx(cnq<?> $$0, mp $$1, cnk $$2, cnk $$3, cnk $$4) {
      this.a = $$1;
      this.f = $$0;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
   }

   public static mx a(cnk $$0, cnk $$1, cnk $$2, mp $$3) {
      return new mx(cnq.v, $$3, $$0, $$1, $$2);
   }

   public mx a(String $$0, am<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(mq $$0, afw $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cu.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.e.forEach($$2::a);
      $$0.a(new mx.a($$1, this.f, this.b, this.c, this.d, $$2.b($$1.d("recipes/" + this.a.a() + "/"))));
   }

   private void a(afw $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   public static record a(afw a, cnq<?> b, cnk c, cnk d, cnk e, af f) implements mn {
      @Override
      public void a(JsonObject $$0) {
         $$0.add("template", this.c.a(true));
         $$0.add("base", this.d.a(true));
         $$0.add("addition", this.e.a(true));
      }

      @Override
      public afw b() {
         return this.a;
      }

      @Override
      public cnq<?> c() {
         return this.b;
      }

      public cnk e() {
         return this.c;
      }

      public cnk f() {
         return this.d;
      }

      public cnk g() {
         return this.e;
      }

      @Override
      public af d() {
         return this.f;
      }
   }
}
