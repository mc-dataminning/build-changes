import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class lx implements lr {
   private final ls b;
   private final cls c;
   private final civ d;
   private final cmb e;
   private final float f;
   private final int g;
   private final Map<String, am<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final cmh<? extends clm> j;

   private lx(ls $$0, cls $$1, cpp $$2, cmb $$3, float $$4, int $$5, cmh<? extends clm> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.k();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static lx a(cmb $$0, ls $$1, cpp $$2, float $$3, int $$4, cmh<? extends clm> $$5) {
      return new lx($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$5);
   }

   public static lx a(cmb $$0, ls $$1, cpp $$2, float $$3, int $$4) {
      return new lx($$1, cls.a, $$2, $$0, $$3, $$4, cmh.s);
   }

   public static lx b(cmb $$0, ls $$1, cpp $$2, float $$3, int $$4) {
      return new lx($$1, c($$2), $$2, $$0, $$3, $$4, cmh.q);
   }

   public static lx c(cmb $$0, ls $$1, cpp $$2, float $$3, int $$4) {
      return new lx($$1, b($$2), $$2, $$0, $$3, $$4, cmh.p);
   }

   public static lx d(cmb $$0, ls $$1, cpp $$2, float $$3, int $$4) {
      return new lx($$1, cls.a, $$2, $$0, $$3, $$4, cmh.r);
   }

   public lx b(String $$0, am<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public lx b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public civ a() {
      return this.d;
   }

   @Override
   public void a(lt $$0, aeu $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cu.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.h.forEach($$2::a);
      $$0.a(new lx.a($$1, this.i == null ? "" : this.i, this.c, this.e, this.d, this.f, this.g, $$2.b($$1.d("recipes/" + this.b.a() + "/")), this.j));
   }

   private static cls b(cpp $$0) {
      if ($$0.k().u()) {
         return cls.a;
      } else {
         return $$0.k() instanceof cgt ? cls.b : cls.c;
      }
   }

   private static cls c(cpp $$0) {
      return $$0.k() instanceof cgt ? cls.b : cls.c;
   }

   private static cls a(cmh<? extends clm> $$0, cpp $$1) {
      if ($$0 == cmh.p) {
         return b($$1);
      } else if ($$0 == cmh.q) {
         return c($$1);
      } else if ($$0 != cmh.r && $$0 != cmh.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return cls.a;
      }
   }

   private void a(aeu $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   static record a(aeu a, String b, cls c, cmb d, civ e, float f, int g, af h, cmh<? extends clm> i) implements lq {
      @Override
      public void a(JsonObject $$0) {
         if (!this.b.isEmpty()) {
            $$0.addProperty("group", this.b);
         }

         $$0.addProperty("category", this.c.c());
         $$0.add("ingredient", this.d.a(false));
         $$0.addProperty("result", jd.i.b(this.e).toString());
         $$0.addProperty("experience", this.f);
         $$0.addProperty("cookingtime", this.g);
      }

      @Override
      public aeu b() {
         return this.a;
      }

      public String e() {
         return this.b;
      }

      public cls f() {
         return this.c;
      }

      public cmb g() {
         return this.d;
      }

      public civ h() {
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
      public cmh<? extends clm> c() {
         return this.i;
      }
   }
}
