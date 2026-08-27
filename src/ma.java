import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class ma implements lt {
   private final lu b;
   private final cjc c;
   private final cmi d;
   private final int e;
   private final Map<String, am<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final cmo<?> h;

   public ma(lu $$0, cmo<?> $$1, cmi $$2, cpw $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.k();
      this.d = $$2;
      this.e = $$4;
   }

   public static ma a(cmi $$0, lu $$1, cpw $$2) {
      return new ma($$1, cmo.t, $$0, $$2, 1);
   }

   public static ma a(cmi $$0, lu $$1, cpw $$2, int $$3) {
      return new ma($$1, cmo.t, $$0, $$2, $$3);
   }

   public ma b(String $$0, am<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public ma b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cjc a() {
      return this.c;
   }

   @Override
   public void a(lv $$0, aey $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cu.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      $$0.a(new ma.a($$1, this.h, this.g == null ? "" : this.g, this.d, this.c, this.e, $$2.b($$1.d("recipes/" + this.b.a() + "/"))));
   }

   private void a(aey $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   public static record a(aey a, cmo<?> b, String c, cmi d, cjc e, int f, af g) implements ls {
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
      public aey b() {
         return this.a;
      }

      @Override
      public cmo<?> c() {
         return this.b;
      }

      public String e() {
         return this.c;
      }

      public cmi f() {
         return this.d;
      }

      public cjc g() {
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
