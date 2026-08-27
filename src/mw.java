import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class mw implements mq {
   private final mr b;
   private final cnt c;
   private final ckw d;
   private final coc e;
   private final float f;
   private final int g;
   private final Map<String, am<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final coj<? extends cnn> j;

   private mw(mr $$0, cnt $$1, crr $$2, coc $$3, float $$4, int $$5, coj<? extends cnn> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.k();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static mw a(coc $$0, mr $$1, crr $$2, float $$3, int $$4, coj<? extends cnn> $$5) {
      return new mw($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$5);
   }

   public static mw a(coc $$0, mr $$1, crr $$2, float $$3, int $$4) {
      return new mw($$1, cnt.a, $$2, $$0, $$3, $$4, coj.s);
   }

   public static mw b(coc $$0, mr $$1, crr $$2, float $$3, int $$4) {
      return new mw($$1, c($$2), $$2, $$0, $$3, $$4, coj.q);
   }

   public static mw c(coc $$0, mr $$1, crr $$2, float $$3, int $$4) {
      return new mw($$1, b($$2), $$2, $$0, $$3, $$4, coj.p);
   }

   public static mw d(coc $$0, mr $$1, crr $$2, float $$3, int $$4) {
      return new mw($$1, cnt.a, $$2, $$0, $$3, $$4, coj.r);
   }

   public mw b(String $$0, am<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public mw b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public ckw a() {
      return this.d;
   }

   @Override
   public void a(ms $$0, agg $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cu.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.h.forEach($$2::a);
      $$0.a(new mw.a($$1, this.i == null ? "" : this.i, this.c, this.e, this.d, this.f, this.g, $$2.b($$1.d("recipes/" + this.b.a() + "/")), this.j));
   }

   private static cnt b(crr $$0) {
      if ($$0.k().u()) {
         return cnt.a;
      } else {
         return $$0.k() instanceof ciu ? cnt.b : cnt.c;
      }
   }

   private static cnt c(crr $$0) {
      return $$0.k() instanceof ciu ? cnt.b : cnt.c;
   }

   private static cnt a(coj<? extends cnn> $$0, crr $$1) {
      if ($$0 == coj.p) {
         return b($$1);
      } else if ($$0 == coj.q) {
         return c($$1);
      } else if ($$0 != coj.r && $$0 != coj.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return cnt.a;
      }
   }

   private void a(agg $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   static record a(agg a, String b, cnt c, coc d, ckw e, float f, int g, af h, coj<? extends cnn> i) implements mp {
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
      public agg b() {
         return this.a;
      }

      public String e() {
         return this.b;
      }

      public cnt f() {
         return this.c;
      }

      public coc g() {
         return this.d;
      }

      public ckw h() {
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
      public coj<? extends cnn> c() {
         return this.i;
      }
   }
}
