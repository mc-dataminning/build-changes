import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.Map;

public class lz {
   private final cmb a;
   private final cmb b;
   private final cmb c;
   private final ls d;
   private final civ e;
   private final Map<String, am<?>> f = new LinkedHashMap<>();
   private final cmh<?> g;

   public lz(cmh<?> $$0, cmb $$1, cmb $$2, cmb $$3, ls $$4, civ $$5) {
      this.d = $$4;
      this.g = $$0;
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.e = $$5;
   }

   public static lz a(cmb $$0, cmb $$1, cmb $$2, ls $$3, civ $$4) {
      return new lz(cmh.u, $$0, $$1, $$2, $$3, $$4);
   }

   public lz a(String $$0, am<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(lt $$0, String $$1) {
      this.a($$0, new aeu($$1));
   }

   public void a(lt $$0, aeu $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cu.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      $$0.a(new lz.a($$1, this.g, this.a, this.b, this.c, this.e, $$2.b($$1.d("recipes/" + this.d.a() + "/"))));
   }

   private void a(aeu $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   public static record a(aeu a, cmh<?> b, cmb c, cmb d, cmb e, civ f, af g) implements lq {
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
      public aeu b() {
         return this.a;
      }

      @Override
      public cmh<?> c() {
         return this.b;
      }

      public cmb e() {
         return this.c;
      }

      public cmb f() {
         return this.d;
      }

      public cmb g() {
         return this.e;
      }

      public civ h() {
         return this.f;
      }

      @Override
      public af d() {
         return this.g;
      }
   }
}
