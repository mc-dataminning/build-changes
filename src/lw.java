import com.google.gson.JsonObject;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class lw implements lq {
   private final lr b;
   private final cir c;
   private final clw d;
   private final int e;
   private final ae.a f = ae.a.b();
   @Nullable
   private String g;
   private final cmb<?> h;

   public lw(lr $$0, cmb<?> $$1, clw $$2, cpj $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.k();
      this.d = $$2;
      this.e = $$4;
   }

   public static lw a(clw $$0, lr $$1, cpj $$2) {
      return new lw($$1, cmb.t, $$0, $$2, 1);
   }

   public static lw a(clw $$0, lr $$1, cpj $$2, int $$3) {
      return new lw($$1, cmb.t, $$0, $$2, $$3);
   }

   public lw b(String $$0, am $$1) {
      this.f.a($$0, $$1);
      return this;
   }

   public lw b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cir a() {
      return this.c;
   }

   @Override
   public void a(Consumer<lp> $$0, aep $$1) {
      this.a($$1);
      this.f.a(a).a("has_the_recipe", cs.a($$1)).a(ah.a.c($$1)).a(ap.b);
      $$0.accept(new lw.a($$1, this.h, this.g == null ? "" : this.g, this.d, this.c, this.e, this.f, $$1.d("recipes/" + this.b.a() + "/")));
   }

   private void a(aep $$0) {
      if (this.f.d().isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   public static class a implements lp {
      private final aep a;
      private final String b;
      private final clw c;
      private final cir d;
      private final int e;
      private final ae.a f;
      private final aep g;
      private final cmb<?> h;

      public a(aep $$0, cmb<?> $$1, String $$2, clw $$3, cir $$4, int $$5, ae.a $$6, aep $$7) {
         this.a = $$0;
         this.h = $$1;
         this.b = $$2;
         this.c = $$3;
         this.d = $$4;
         this.e = $$5;
         this.f = $$6;
         this.g = $$7;
      }

      @Override
      public void a(JsonObject $$0) {
         if (!this.b.isEmpty()) {
            $$0.addProperty("group", this.b);
         }

         $$0.add("ingredient", this.c.c());
         $$0.addProperty("result", jc.i.b(this.d).toString());
         $$0.addProperty("count", this.e);
      }

      @Override
      public aep b() {
         return this.a;
      }

      @Override
      public cmb<?> c() {
         return this.h;
      }

      @Nullable
      @Override
      public JsonObject d() {
         return this.f.c();
      }

      @Nullable
      @Override
      public aep e() {
         return this.g;
      }
   }
}
