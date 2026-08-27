import com.google.gson.JsonObject;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class lu implements lp {
   private final lq b;
   private final clp c;
   private final cis d;
   private final clx e;
   private final float f;
   private final int g;
   private final ae.a h = ae.a.b();
   @Nullable
   private String i;
   private final cmc<? extends clj> j;

   private lu(lq $$0, clp $$1, cpk $$2, clx $$3, float $$4, int $$5, cmc<? extends clj> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.k();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static lu a(clx $$0, lq $$1, cpk $$2, float $$3, int $$4, cmc<? extends clj> $$5) {
      return new lu($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$5);
   }

   public static lu a(clx $$0, lq $$1, cpk $$2, float $$3, int $$4) {
      return new lu($$1, clp.a, $$2, $$0, $$3, $$4, cmc.s);
   }

   public static lu b(clx $$0, lq $$1, cpk $$2, float $$3, int $$4) {
      return new lu($$1, c($$2), $$2, $$0, $$3, $$4, cmc.q);
   }

   public static lu c(clx $$0, lq $$1, cpk $$2, float $$3, int $$4) {
      return new lu($$1, b($$2), $$2, $$0, $$3, $$4, cmc.p);
   }

   public static lu d(clx $$0, lq $$1, cpk $$2, float $$3, int $$4) {
      return new lu($$1, clp.a, $$2, $$0, $$3, $$4, cmc.r);
   }

   public lu b(String $$0, am $$1) {
      this.h.a($$0, $$1);
      return this;
   }

   public lu b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cis a() {
      return this.d;
   }

   @Override
   public void a(Consumer<lo> $$0, aer $$1) {
      this.a($$1);
      this.h.a(a).a("has_the_recipe", cs.a($$1)).a(ah.a.c($$1)).a(ap.b);
      $$0.accept(new lu.a($$1, this.i == null ? "" : this.i, this.c, this.e, this.d, this.f, this.g, this.h, $$1.d("recipes/" + this.b.a() + "/"), this.j));
   }

   private static clp b(cpk $$0) {
      if ($$0.k().u()) {
         return clp.a;
      } else {
         return $$0.k() instanceof cgq ? clp.b : clp.c;
      }
   }

   private static clp c(cpk $$0) {
      return $$0.k() instanceof cgq ? clp.b : clp.c;
   }

   private static clp a(cmc<? extends clj> $$0, cpk $$1) {
      if ($$0 == cmc.p) {
         return b($$1);
      } else if ($$0 == cmc.q) {
         return c($$1);
      } else if ($$0 != cmc.r && $$0 != cmc.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return clp.a;
      }
   }

   private void a(aer $$0) {
      if (this.h.d().isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   static class a implements lo {
      private final aer a;
      private final String b;
      private final clp c;
      private final clx d;
      private final cis e;
      private final float f;
      private final int g;
      private final ae.a h;
      private final aer i;
      private final cmc<? extends clj> j;

      public a(aer $$0, String $$1, clp $$2, clx $$3, cis $$4, float $$5, int $$6, ae.a $$7, aer $$8, cmc<? extends clj> $$9) {
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
         $$0.addProperty("result", jb.i.b(this.e).toString());
         $$0.addProperty("experience", this.f);
         $$0.addProperty("cookingtime", this.g);
      }

      @Override
      public cmc<?> c() {
         return this.j;
      }

      @Override
      public aer b() {
         return this.a;
      }

      @Nullable
      @Override
      public JsonObject d() {
         return this.h.c();
      }

      @Nullable
      @Override
      public aer e() {
         return this.i;
      }
   }
}
