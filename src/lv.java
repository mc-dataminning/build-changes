import com.google.gson.JsonObject;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class lv implements lq {
   private final lr b;
   private final clo c;
   private final cir d;
   private final clw e;
   private final float f;
   private final int g;
   private final ae.a h = ae.a.b();
   @Nullable
   private String i;
   private final cmb<? extends cli> j;

   private lv(lr $$0, clo $$1, cpj $$2, clw $$3, float $$4, int $$5, cmb<? extends cli> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.k();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static lv a(clw $$0, lr $$1, cpj $$2, float $$3, int $$4, cmb<? extends cli> $$5) {
      return new lv($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$5);
   }

   public static lv a(clw $$0, lr $$1, cpj $$2, float $$3, int $$4) {
      return new lv($$1, clo.a, $$2, $$0, $$3, $$4, cmb.s);
   }

   public static lv b(clw $$0, lr $$1, cpj $$2, float $$3, int $$4) {
      return new lv($$1, c($$2), $$2, $$0, $$3, $$4, cmb.q);
   }

   public static lv c(clw $$0, lr $$1, cpj $$2, float $$3, int $$4) {
      return new lv($$1, b($$2), $$2, $$0, $$3, $$4, cmb.p);
   }

   public static lv d(clw $$0, lr $$1, cpj $$2, float $$3, int $$4) {
      return new lv($$1, clo.a, $$2, $$0, $$3, $$4, cmb.r);
   }

   public lv b(String $$0, am $$1) {
      this.h.a($$0, $$1);
      return this;
   }

   public lv b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cir a() {
      return this.d;
   }

   @Override
   public void a(Consumer<lp> $$0, aep $$1) {
      this.a($$1);
      this.h.a(a).a("has_the_recipe", cs.a($$1)).a(ah.a.c($$1)).a(ap.b);
      $$0.accept(new lv.a($$1, this.i == null ? "" : this.i, this.c, this.e, this.d, this.f, this.g, this.h, $$1.d("recipes/" + this.b.a() + "/"), this.j));
   }

   private static clo b(cpj $$0) {
      if ($$0.k().u()) {
         return clo.a;
      } else {
         return $$0.k() instanceof cgp ? clo.b : clo.c;
      }
   }

   private static clo c(cpj $$0) {
      return $$0.k() instanceof cgp ? clo.b : clo.c;
   }

   private static clo a(cmb<? extends cli> $$0, cpj $$1) {
      if ($$0 == cmb.p) {
         return b($$1);
      } else if ($$0 == cmb.q) {
         return c($$1);
      } else if ($$0 != cmb.r && $$0 != cmb.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return clo.a;
      }
   }

   private void a(aep $$0) {
      if (this.h.d().isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   static class a implements lp {
      private final aep a;
      private final String b;
      private final clo c;
      private final clw d;
      private final cir e;
      private final float f;
      private final int g;
      private final ae.a h;
      private final aep i;
      private final cmb<? extends cli> j;

      public a(aep $$0, String $$1, clo $$2, clw $$3, cir $$4, float $$5, int $$6, ae.a $$7, aep $$8, cmb<? extends cli> $$9) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
         this.g = $$6;
         this.h = $$7;
         this.i = $$8;
         this.j = $$9;
      }

      @Override
      public void a(JsonObject $$0) {
         if (!this.b.isEmpty()) {
            $$0.addProperty("group", this.b);
         }

         $$0.addProperty("category", this.c.c());
         $$0.add("ingredient", this.d.c());
         $$0.addProperty("result", jc.i.b(this.e).toString());
         $$0.addProperty("experience", this.f);
         $$0.addProperty("cookingtime", this.g);
      }

      @Override
      public cmb<?> c() {
         return this.j;
      }

      @Override
      public aep b() {
         return this.a;
      }

      @Nullable
      @Override
      public JsonObject d() {
         return this.h.c();
      }

      @Nullable
      @Override
      public aep e() {
         return this.i;
      }
   }
}
