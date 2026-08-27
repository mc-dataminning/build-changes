import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class nb implements mu {
   private final mv b;
   private final clj c;
   private final coq d;
   private final int e;
   private final Map<String, am<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final cox<?> h;

   public nb(mv $$0, cox<?> $$1, coq $$2, cse $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.k();
      this.d = $$2;
      this.e = $$4;
   }

   public static nb a(coq $$0, mv $$1, cse $$2) {
      return new nb($$1, cox.t, $$0, $$2, 1);
   }

   public static nb a(coq $$0, mv $$1, cse $$2, int $$3) {
      return new nb($$1, cox.t, $$0, $$2, $$3);
   }

   public nb b(String $$0, am<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public nb b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public clj a() {
      return this.c;
   }

   @Override
   public void a(mw $$0, agm $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cu.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      $$0.a(new nb.a($$1, this.h, this.g == null ? "" : this.g, this.d, this.c, this.e, $$2.b($$1.d("recipes/" + this.b.a() + "/"))));
   }

   private void a(agm $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   public static record a(agm a, cox<?> b, String c, coq d, clj e, int f, af g) implements mt {
      @Override
      public void a(JsonObject $$0) {
         if (!this.c.isEmpty()) {
            $$0.addProperty("group", this.c);
         }

         $$0.add("ingredient", this.d.a(false));
         $$0.addProperty("result", kc.i.b(this.e).toString());
         $$0.addProperty("count", this.f);
      }

      @Override
      public agm b() {
         return this.a;
      }

      @Override
      public cox<?> c() {
         return this.b;
      }

      public String e() {
         return this.c;
      }

      public coq f() {
         return this.d;
      }

      public clj g() {
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
