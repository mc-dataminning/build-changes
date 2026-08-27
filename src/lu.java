import com.google.gson.JsonObject;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class lu implements lp {
   private final lq b;
   private final clq c;
   private final cit d;
   private final cly e;
   private final float f;
   private final int g;
   private final ae.a h = ae.a.b();
   @Nullable
   private String i;
   private final cmd<? extends clk> j;

   private lu(lq $$0, clq $$1, cpl $$2, cly $$3, float $$4, int $$5, cmd<? extends clk> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.k();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static lu a(cly $$0, lq $$1, cpl $$2, float $$3, int $$4, cmd<? extends clk> $$5) {
      return new lu($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$5);
   }

   public static lu a(cly $$0, lq $$1, cpl $$2, float $$3, int $$4) {
      return new lu($$1, clq.a, $$2, $$0, $$3, $$4, cmd.s);
   }

   public static lu b(cly $$0, lq $$1, cpl $$2, float $$3, int $$4) {
      return new lu($$1, c($$2), $$2, $$0, $$3, $$4, cmd.q);
   }

   public static lu c(cly $$0, lq $$1, cpl $$2, float $$3, int $$4) {
      return new lu($$1, b($$2), $$2, $$0, $$3, $$4, cmd.p);
   }

   public static lu d(cly $$0, lq $$1, cpl $$2, float $$3, int $$4) {
      return new lu($$1, clq.a, $$2, $$0, $$3, $$4, cmd.r);
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
   public cit a() {
      return this.d;
   }

   @Override
   public void a(Consumer<lo> $$0, aer $$1) {
      this.a($$1);
      this.h.a(a).a("has_the_recipe", cs.a($$1)).a(ah.a.c($$1)).a(ap.b);
      $$0.accept(new lu.a($$1, this.i == null ? "" : this.i, this.c, this.e, this.d, this.f, this.g, this.h, $$1.d("recipes/" + this.b.a() + "/"), this.j));
   }

   private static clq b(cpl $$0) {
      if ($$0.k().u()) {
         return clq.a;
      } else {
         return $$0.k() instanceof cgr ? clq.b : clq.c;
      }
   }

   private static clq c(cpl $$0) {
      return $$0.k() instanceof cgr ? clq.b : clq.c;
   }

   private static clq a(cmd<? extends clk> $$0, cpl $$1) {
      if ($$0 == cmd.p) {
         return b($$1);
      } else if ($$0 == cmd.q) {
         return c($$1);
      } else if ($$0 != cmd.r && $$0 != cmd.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return clq.a;
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
      private final clq c;
      private final cly d;
      private final cit e;
      private final float f;
      private final int g;
      private final ae.a h;
      private final aer i;
      private final cmd<? extends clk> j;

      public a(aer $$0, String $$1, clq $$2, cly $$3, cit $$4, float $$5, int $$6, ae.a $$7, aer $$8, cmd<? extends clk> $$9) {
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
      public cmd<?> c() {
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
