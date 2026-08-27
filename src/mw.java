import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.Map;

public class mw {
   private final cnk a;
   private final cnk b;
   private final cnk c;
   private final mp d;
   private final cke e;
   private final Map<String, am<?>> f = new LinkedHashMap<>();
   private final cnq<?> g;

   public mw(cnq<?> $$0, cnk $$1, cnk $$2, cnk $$3, mp $$4, cke $$5) {
      this.d = $$4;
      this.g = $$0;
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.e = $$5;
   }

   public static mw a(cnk $$0, cnk $$1, cnk $$2, mp $$3, cke $$4) {
      return new mw(cnq.u, $$0, $$1, $$2, $$3, $$4);
   }

   public mw a(String $$0, am<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(mq $$0, String $$1) {
      this.a($$0, new afw($$1));
   }

   public void a(mq $$0, afw $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cu.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      $$0.a(new mw.a($$1, this.g, this.a, this.b, this.c, this.e, $$2.b($$1.d("recipes/" + this.d.a() + "/"))));
   }

   private void a(afw $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   public static record a(afw a, cnq<?> b, cnk c, cnk d, cnk e, cke f, af g) implements mn {
      @Override
      public void a(JsonObject $$0) {
         $$0.add("template", this.c.a(true));
         $$0.add("base", this.d.a(true));
         $$0.add("addition", this.e.a(true));
         JsonObject $$1 = new JsonObject();
         $$1.addProperty("item", jy.i.b(this.f).toString());
         $$0.add("result", $$1);
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

      public cke h() {
         return this.f;
      }

      @Override
      public af d() {
         return this.g;
      }
   }
}
