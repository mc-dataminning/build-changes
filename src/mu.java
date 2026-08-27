import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class mu implements mo {
   private final mp b;
   private final cnb c;
   private final cke d;
   private final cnk e;
   private final float f;
   private final int g;
   private final Map<String, am<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final cnq<? extends cmv> j;

   private mu(mp $$0, cnb $$1, cqy $$2, cnk $$3, float $$4, int $$5, cnq<? extends cmv> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.k();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static mu a(cnk $$0, mp $$1, cqy $$2, float $$3, int $$4, cnq<? extends cmv> $$5) {
      return new mu($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$5);
   }

   public static mu a(cnk $$0, mp $$1, cqy $$2, float $$3, int $$4) {
      return new mu($$1, cnb.a, $$2, $$0, $$3, $$4, cnq.s);
   }

   public static mu b(cnk $$0, mp $$1, cqy $$2, float $$3, int $$4) {
      return new mu($$1, c($$2), $$2, $$0, $$3, $$4, cnq.q);
   }

   public static mu c(cnk $$0, mp $$1, cqy $$2, float $$3, int $$4) {
      return new mu($$1, b($$2), $$2, $$0, $$3, $$4, cnq.p);
   }

   public static mu d(cnk $$0, mp $$1, cqy $$2, float $$3, int $$4) {
      return new mu($$1, cnb.a, $$2, $$0, $$3, $$4, cnq.r);
   }

   public mu b(String $$0, am<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public mu b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cke a() {
      return this.d;
   }

   @Override
   public void a(mq $$0, afw $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cu.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.h.forEach($$2::a);
      $$0.a(new mu.a($$1, this.i == null ? "" : this.i, this.c, this.e, this.d, this.f, this.g, $$2.b($$1.d("recipes/" + this.b.a() + "/")), this.j));
   }

   private static cnb b(cqy $$0) {
      if ($$0.k().u()) {
         return cnb.a;
      } else {
         return $$0.k() instanceof cic ? cnb.b : cnb.c;
      }
   }

   private static cnb c(cqy $$0) {
      return $$0.k() instanceof cic ? cnb.b : cnb.c;
   }

   private static cnb a(cnq<? extends cmv> $$0, cqy $$1) {
      if ($$0 == cnq.p) {
         return b($$1);
      } else if ($$0 == cnq.q) {
         return c($$1);
      } else if ($$0 != cnq.r && $$0 != cnq.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return cnb.a;
      }
   }

   private void a(afw $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   static record a(afw a, String b, cnb c, cnk d, cke e, float f, int g, af h, cnq<? extends cmv> i) implements mn {
      @Override
      public void a(JsonObject $$0) {
         if (!this.b.isEmpty()) {
            $$0.addProperty("group", this.b);
         }

         $$0.addProperty("category", this.c.c());
         $$0.add("ingredient", this.d.a(false));
         $$0.addProperty("result", jy.i.b(this.e).toString());
         $$0.addProperty("experience", this.f);
         $$0.addProperty("cookingtime", this.g);
      }

      @Override
      public afw b() {
         return this.a;
      }

      public String e() {
         return this.b;
      }

      public cnb f() {
         return this.c;
      }

      public cnk g() {
         return this.d;
      }

      public cke h() {
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
      public cnq<? extends cmv> c() {
         return this.i;
      }
   }
}
