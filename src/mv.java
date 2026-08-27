import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class mv implements mo {
   private final mp b;
   private final cke c;
   private final cnk d;
   private final int e;
   private final Map<String, am<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final cnq<?> h;

   public mv(mp $$0, cnq<?> $$1, cnk $$2, cqy $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.k();
      this.d = $$2;
      this.e = $$4;
   }

   public static mv a(cnk $$0, mp $$1, cqy $$2) {
      return new mv($$1, cnq.t, $$0, $$2, 1);
   }

   public static mv a(cnk $$0, mp $$1, cqy $$2, int $$3) {
      return new mv($$1, cnq.t, $$0, $$2, $$3);
   }

   public mv b(String $$0, am<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public mv b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cke a() {
      return this.c;
   }

   @Override
   public void a(mq $$0, afw $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cu.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      $$0.a(new mv.a($$1, this.h, this.g == null ? "" : this.g, this.d, this.c, this.e, $$2.b($$1.d("recipes/" + this.b.a() + "/"))));
   }

   private void a(afw $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   public static record a(afw a, cnq<?> b, String c, cnk d, cke e, int f, af g) implements mn {
      @Override
      public void a(JsonObject $$0) {
         if (!this.c.isEmpty()) {
            $$0.addProperty("group", this.c);
         }

         $$0.add("ingredient", this.d.a(false));
         $$0.addProperty("result", jy.i.b(this.e).toString());
         $$0.addProperty("count", this.f);
      }

      @Override
      public afw b() {
         return this.a;
      }

      @Override
      public cnq<?> c() {
         return this.b;
      }

      public String e() {
         return this.c;
      }

      public cnk f() {
         return this.d;
      }

      public cke g() {
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
