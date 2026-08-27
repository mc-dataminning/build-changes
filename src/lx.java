import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class lx implements lr {
   private final ls b;
   private final clx c;
   private final cja d;
   private final cmg e;
   private final float f;
   private final int g;
   private final Map<String, am<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final cmm<? extends clr> j;

   private lx(ls $$0, clx $$1, cpu $$2, cmg $$3, float $$4, int $$5, cmm<? extends clr> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.k();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static lx a(cmg $$0, ls $$1, cpu $$2, float $$3, int $$4, cmm<? extends clr> $$5) {
      return new lx($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$5);
   }

   public static lx a(cmg $$0, ls $$1, cpu $$2, float $$3, int $$4) {
      return new lx($$1, clx.a, $$2, $$0, $$3, $$4, cmm.s);
   }

   public static lx b(cmg $$0, ls $$1, cpu $$2, float $$3, int $$4) {
      return new lx($$1, c($$2), $$2, $$0, $$3, $$4, cmm.q);
   }

   public static lx c(cmg $$0, ls $$1, cpu $$2, float $$3, int $$4) {
      return new lx($$1, b($$2), $$2, $$0, $$3, $$4, cmm.p);
   }

   public static lx d(cmg $$0, ls $$1, cpu $$2, float $$3, int $$4) {
      return new lx($$1, clx.a, $$2, $$0, $$3, $$4, cmm.r);
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
   public cja a() {
      return this.d;
   }

   @Override
   public void a(lt $$0, aew $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cu.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.h.forEach($$2::a);
      $$0.a(new lx.a($$1, this.i == null ? "" : this.i, this.c, this.e, this.d, this.f, this.g, $$2.b($$1.d("recipes/" + this.b.a() + "/")), this.j));
   }

   private static clx b(cpu $$0) {
      if ($$0.k().u()) {
         return clx.a;
      } else {
         return $$0.k() instanceof cgy ? clx.b : clx.c;
      }
   }

   private static clx c(cpu $$0) {
      return $$0.k() instanceof cgy ? clx.b : clx.c;
   }

   private static clx a(cmm<? extends clr> $$0, cpu $$1) {
      if ($$0 == cmm.p) {
         return b($$1);
      } else if ($$0 == cmm.q) {
         return c($$1);
      } else if ($$0 != cmm.r && $$0 != cmm.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return clx.a;
      }
   }

   private void a(aew $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   static record a(aew a, String b, clx c, cmg d, cja e, float f, int g, af h, cmm<? extends clr> i) implements lq {
      @Override
      public void a(JsonObject $$0) {
         if (!this.b.isEmpty()) {
            $$0.addProperty("group", this.b);
         }

         $$0.addProperty("category", this.c.c());
         $$0.add("ingredient", this.d.a(false));
         $$0.addProperty("result", jb.i.b(this.e).toString());
         $$0.addProperty("experience", this.f);
         $$0.addProperty("cookingtime", this.g);
      }

      @Override
      public aew b() {
         return this.a;
      }

      public String e() {
         return this.b;
      }

      public clx f() {
         return this.c;
      }

      public cmg g() {
         return this.d;
      }

      public cja h() {
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
      public cmm<? extends clr> c() {
         return this.i;
      }
   }
}
