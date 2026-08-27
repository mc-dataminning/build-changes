import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class na implements mu {
   private final mv b;
   private final cog c;
   private final clj d;
   private final coq e;
   private final float f;
   private final int g;
   private final Map<String, am<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final cox<? extends coa> j;

   private na(mv $$0, cog $$1, cse $$2, coq $$3, float $$4, int $$5, cox<? extends coa> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.k();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static na a(coq $$0, mv $$1, cse $$2, float $$3, int $$4, cox<? extends coa> $$5) {
      return new na($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$5);
   }

   public static na a(coq $$0, mv $$1, cse $$2, float $$3, int $$4) {
      return new na($$1, cog.a, $$2, $$0, $$3, $$4, cox.s);
   }

   public static na b(coq $$0, mv $$1, cse $$2, float $$3, int $$4) {
      return new na($$1, c($$2), $$2, $$0, $$3, $$4, cox.q);
   }

   public static na c(coq $$0, mv $$1, cse $$2, float $$3, int $$4) {
      return new na($$1, b($$2), $$2, $$0, $$3, $$4, cox.p);
   }

   public static na d(coq $$0, mv $$1, cse $$2, float $$3, int $$4) {
      return new na($$1, cog.a, $$2, $$0, $$3, $$4, cox.r);
   }

   public na b(String $$0, am<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public na b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public clj a() {
      return this.d;
   }

   @Override
   public void a(mw $$0, agm $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cu.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.h.forEach($$2::a);
      $$0.a(new na.a($$1, this.i == null ? "" : this.i, this.c, this.e, this.d, this.f, this.g, $$2.b($$1.d("recipes/" + this.b.a() + "/")), this.j));
   }

   private static cog b(cse $$0) {
      if ($$0.k().u()) {
         return cog.a;
      } else {
         return $$0.k() instanceof cjh ? cog.b : cog.c;
      }
   }

   private static cog c(cse $$0) {
      return $$0.k() instanceof cjh ? cog.b : cog.c;
   }

   private static cog a(cox<? extends coa> $$0, cse $$1) {
      if ($$0 == cox.p) {
         return b($$1);
      } else if ($$0 == cox.q) {
         return c($$1);
      } else if ($$0 != cox.r && $$0 != cox.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return cog.a;
      }
   }

   private void a(agm $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   static record a(agm a, String b, cog c, coq d, clj e, float f, int g, af h, cox<? extends coa> i) implements mt {
      @Override
      public void a(JsonObject $$0) {
         if (!this.b.isEmpty()) {
            $$0.addProperty("group", this.b);
         }

         $$0.addProperty("category", this.c.c());
         $$0.add("ingredient", this.d.a(false));
         $$0.addProperty("result", kc.i.b(this.e).toString());
         $$0.addProperty("experience", this.f);
         $$0.addProperty("cookingtime", this.g);
      }

      @Override
      public agm b() {
         return this.a;
      }

      public String e() {
         return this.b;
      }

      public cog f() {
         return this.c;
      }

      public coq g() {
         return this.d;
      }

      public clj h() {
         return this.e;
      }

      public float i() {
         return this.f;
      }

      public int j() {
         return this.g;
      }

      @Override
      public af d() {
         return this.h;
      }

      @Override
      public cox<? extends coa> c() {
         return this.i;
      }
   }
}
