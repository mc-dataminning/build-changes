import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class lz implements lt {
   private final lu b;
   private final clz c;
   private final cjc d;
   private final cmi e;
   private final float f;
   private final int g;
   private final Map<String, am<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final cmo<? extends clt> j;

   private lz(lu $$0, clz $$1, cpw $$2, cmi $$3, float $$4, int $$5, cmo<? extends clt> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.k();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static lz a(cmi $$0, lu $$1, cpw $$2, float $$3, int $$4, cmo<? extends clt> $$5) {
      return new lz($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$5);
   }

   public static lz a(cmi $$0, lu $$1, cpw $$2, float $$3, int $$4) {
      return new lz($$1, clz.a, $$2, $$0, $$3, $$4, cmo.s);
   }

   public static lz b(cmi $$0, lu $$1, cpw $$2, float $$3, int $$4) {
      return new lz($$1, c($$2), $$2, $$0, $$3, $$4, cmo.q);
   }

   public static lz c(cmi $$0, lu $$1, cpw $$2, float $$3, int $$4) {
      return new lz($$1, b($$2), $$2, $$0, $$3, $$4, cmo.p);
   }

   public static lz d(cmi $$0, lu $$1, cpw $$2, float $$3, int $$4) {
      return new lz($$1, clz.a, $$2, $$0, $$3, $$4, cmo.r);
   }

   public lz b(String $$0, am<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public lz b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cjc a() {
      return this.d;
   }

   @Override
   public void a(lv $$0, aey $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cu.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.h.forEach($$2::a);
      $$0.a(new lz.a($$1, this.i == null ? "" : this.i, this.c, this.e, this.d, this.f, this.g, $$2.b($$1.d("recipes/" + this.b.a() + "/")), this.j));
   }

   private static clz b(cpw $$0) {
      if ($$0.k().u()) {
         return clz.a;
      } else {
         return $$0.k() instanceof cha ? clz.b : clz.c;
      }
   }

   private static clz c(cpw $$0) {
      return $$0.k() instanceof cha ? clz.b : clz.c;
   }

   private static clz a(cmo<? extends clt> $$0, cpw $$1) {
      if ($$0 == cmo.p) {
         return b($$1);
      } else if ($$0 == cmo.q) {
         return c($$1);
      } else if ($$0 != cmo.r && $$0 != cmo.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return clz.a;
      }
   }

   private void a(aey $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   static record a(aey a, String b, clz c, cmi d, cjc e, float f, int g, af h, cmo<? extends clt> i) implements ls {
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
      public aey b() {
         return this.a;
      }

      public String e() {
         return this.b;
      }

      public clz f() {
         return this.c;
      }

      public cmi g() {
         return this.d;
      }

      public cjc h() {
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
      public cmo<? extends clt> c() {
         return this.i;
      }
   }
}
