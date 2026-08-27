import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.Map;

public class lz {
   private final cmg a;
   private final cmg b;
   private final cmg c;
   private final ls d;
   private final cja e;
   private final Map<String, am<?>> f = new LinkedHashMap<>();
   private final cmm<?> g;

   public lz(cmm<?> $$0, cmg $$1, cmg $$2, cmg $$3, ls $$4, cja $$5) {
      this.d = $$4;
      this.g = $$0;
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.e = $$5;
   }

   public static lz a(cmg $$0, cmg $$1, cmg $$2, ls $$3, cja $$4) {
      return new lz(cmm.u, $$0, $$1, $$2, $$3, $$4);
   }

   public lz a(String $$0, am<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(lt $$0, String $$1) {
      this.a($$0, new aew($$1));
   }

   public void a(lt $$0, aew $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cu.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      $$0.a(new lz.a($$1, this.g, this.a, this.b, this.c, this.e, $$2.b($$1.d("recipes/" + this.d.a() + "/"))));
   }

   private void a(aew $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   public static record a(aew a, cmm<?> b, cmg c, cmg d, cmg e, cja f, af g) implements lq {
      @Override
      public void a(JsonObject $$0) {
         $$0.add("template", this.c.a(true));
         $$0.add("base", this.d.a(true));
         $$0.add("addition", this.e.a(true));
         JsonObject $$1 = new JsonObject();
         $$1.addProperty("item", jb.i.b(this.f).toString());
         $$0.add("result", $$1);
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

      public cja h() {
         return this.f;
      }

      @Override
      public af d() {
         return this.g;
      }
   }
}
