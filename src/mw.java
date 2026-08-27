import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class mw implements mq {
   private final mr b;
   private final cob c;
   private final cle d;
   private final cok e;
   private final float f;
   private final int g;
   private final Map<String, am<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final cos<? extends cnv> j;

   private mw(mr $$0, cob $$1, crz $$2, cok $$3, float $$4, int $$5, cos<? extends cnv> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.k();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static mw a(cok $$0, mr $$1, crz $$2, float $$3, int $$4, cos<? extends cnv> $$5) {
      return new mw($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$5);
   }

   public static mw a(cok $$0, mr $$1, crz $$2, float $$3, int $$4) {
      return new mw($$1, cob.a, $$2, $$0, $$3, $$4, cos.s);
   }

   public static mw b(cok $$0, mr $$1, crz $$2, float $$3, int $$4) {
      return new mw($$1, c($$2), $$2, $$0, $$3, $$4, cos.q);
   }

   public static mw c(cok $$0, mr $$1, crz $$2, float $$3, int $$4) {
      return new mw($$1, b($$2), $$2, $$0, $$3, $$4, cos.p);
   }

   public static mw d(cok $$0, mr $$1, crz $$2, float $$3, int $$4) {
      return new mw($$1, cob.a, $$2, $$0, $$3, $$4, cos.r);
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
   public cle a() {
      return this.d;
   }

   @Override
   public void a(ms $$0, agi $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cu.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.h.forEach($$2::a);
      $$0.a(new mw.a($$1, this.i == null ? "" : this.i, this.c, this.e, this.d, this.f, this.g, $$2.b($$1.d("recipes/" + this.b.a() + "/")), this.j));
   }

   private static cob b(crz $$0) {
      if ($$0.k().u()) {
         return cob.a;
      } else {
         return $$0.k() instanceof cjc ? cob.b : cob.c;
      }
   }

   private static cob c(crz $$0) {
      return $$0.k() instanceof cjc ? cob.b : cob.c;
   }

   private static cob a(cos<? extends cnv> $$0, crz $$1) {
      if ($$0 == cos.p) {
         return b($$1);
      } else if ($$0 == cos.q) {
         return c($$1);
      } else if ($$0 != cos.r && $$0 != cos.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return cob.a;
      }
   }

   private void a(agi $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   static record a(agi a, String b, cob c, cok d, cle e, float f, int g, af h, cos<? extends cnv> i) implements mp {
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
      public agi b() {
         return this.a;
      }

      public String e() {
         return this.b;
      }

      public cob f() {
         return this.c;
      }

      public cok g() {
         return this.d;
      }

      public cle h() {
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
      public cos<? extends cnv> c() {
         return this.i;
      }
   }
}
