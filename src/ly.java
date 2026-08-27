import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class ly implements lr {
   private final ls b;
   private final civ c;
   private final cmb d;
   private final int e;
   private final Map<String, am<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final cmh<?> h;

   public ly(ls $$0, cmh<?> $$1, cmb $$2, cpp $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.k();
      this.d = $$2;
      this.e = $$4;
   }

   public static ly a(cmb $$0, ls $$1, cpp $$2) {
      return new ly($$1, cmh.t, $$0, $$2, 1);
   }

   public static ly a(cmb $$0, ls $$1, cpp $$2, int $$3) {
      return new ly($$1, cmh.t, $$0, $$2, $$3);
   }

   public ly b(String $$0, am<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public ly b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public civ a() {
      return this.c;
   }

   @Override
   public void a(lt $$0, aeu $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cu.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      $$0.a(new ly.a($$1, this.h, this.g == null ? "" : this.g, this.d, this.c, this.e, $$2.b($$1.d("recipes/" + this.b.a() + "/"))));
   }

   private void a(aeu $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   public static record a(aeu a, cmh<?> b, String c, cmb d, civ e, int f, af g) implements lq {
      @Override
      public void a(JsonObject $$0) {
         if (!this.c.isEmpty()) {
            $$0.addProperty("group", this.c);
         }

         $$0.add("ingredient", this.d.a(false));
         $$0.addProperty("result", jd.i.b(this.e).toString());
         $$0.addProperty("count", this.f);
      }

      @Override
      public aeu b() {
         return this.a;
      }

      @Override
      public cmh<?> c() {
         return this.b;
      }

      public String e() {
         return this.c;
      }

      public cmb f() {
         return this.d;
      }

      public civ g() {
         return this.e;
      }

      public int h() {
         return this.f;
      }

      @Override
      public af d() {
         return this.g;
      }
   }
}
