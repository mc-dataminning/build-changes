import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class lx implements lr {
   private final ls b;
   private final cmd c;
   private final cjg d;
   private final cmm e;
   private final float f;
   private final int g;
   private final Map<String, am<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final cms<? extends clx> j;

   private lx(ls $$0, cmd $$1, cqa $$2, cmm $$3, float $$4, int $$5, cms<? extends clx> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.k();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static lx a(cmm $$0, ls $$1, cqa $$2, float $$3, int $$4, cms<? extends clx> $$5) {
      return new lx($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$5);
   }

   public static lx a(cmm $$0, ls $$1, cqa $$2, float $$3, int $$4) {
      return new lx($$1, cmd.a, $$2, $$0, $$3, $$4, cms.s);
   }

   public static lx b(cmm $$0, ls $$1, cqa $$2, float $$3, int $$4) {
      return new lx($$1, c($$2), $$2, $$0, $$3, $$4, cms.q);
   }

   public static lx c(cmm $$0, ls $$1, cqa $$2, float $$3, int $$4) {
      return new lx($$1, b($$2), $$2, $$0, $$3, $$4, cms.p);
   }

   public static lx d(cmm $$0, ls $$1, cqa $$2, float $$3, int $$4) {
      return new lx($$1, cmd.a, $$2, $$0, $$3, $$4, cms.r);
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
   public cjg a() {
      return this.d;
   }

   @Override
   public void a(lt $$0, aez $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cu.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.h.forEach($$2::a);
      $$0.a(new lx.a($$1, this.i == null ? "" : this.i, this.c, this.e, this.d, this.f, this.g, $$2.b($$1.d("recipes/" + this.b.a() + "/")), this.j));
   }

   private static cmd b(cqa $$0) {
      if ($$0.k().u()) {
         return cmd.a;
      } else {
         return $$0.k() instanceof che ? cmd.b : cmd.c;
      }
   }

   private static cmd c(cqa $$0) {
      return $$0.k() instanceof che ? cmd.b : cmd.c;
   }

   private static cmd a(cms<? extends clx> $$0, cqa $$1) {
      if ($$0 == cms.p) {
         return b($$1);
      } else if ($$0 == cms.q) {
         return c($$1);
      } else if ($$0 != cms.r && $$0 != cms.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return cmd.a;
      }
   }

   private void a(aez $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   static record a(aez a, String b, cmd c, cmm d, cjg e, float f, int g, af h, cms<? extends clx> i) implements lq {
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
      public aez b() {
         return this.a;
      }

      public String e() {
         return this.b;
      }

      public cmd f() {
         return this.c;
      }

      public cmm g() {
         return this.d;
      }

      public cjg h() {
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
      public cms<? extends clx> c() {
         return this.i;
      }
   }
}
