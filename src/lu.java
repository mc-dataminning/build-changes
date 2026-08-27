import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class lu extends lo implements lq {
   private final lr b;
   private final cir c;
   private final int d;
   private final List<clw> e = Lists.newArrayList();
   private final ae.a f = ae.a.b();
   @Nullable
   private String g;

   public lu(lr $$0, cpj $$1, int $$2) {
      this.b = $$0;
      this.c = $$1.k();
      this.d = $$2;
   }

   public static lu a(lr $$0, cpj $$1) {
      return new lu($$0, $$1, 1);
   }

   public static lu a(lr $$0, cpj $$1, int $$2) {
      return new lu($$0, $$1, $$2);
   }

   public lu a(apy<cir> $$0) {
      return this.a(clw.a($$0));
   }

   public lu b(cpj $$0) {
      return this.a($$0, 1);
   }

   public lu a(cpj $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.a(clw.a($$0));
      }

      return this;
   }

   public lu a(clw $$0) {
      return this.a($$0, 1);
   }

   public lu a(clw $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.e.add($$0);
      }

      return this;
   }

   public lu b(String $$0, am $$1) {
      this.f.a($$0, $$1);
      return this;
   }

   public lu b(@Nullable String $$0) {
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
      $$0.accept(new lu.a($$1, this.c, this.d, this.g == null ? "" : this.g, a(this.b), this.e, this.f, $$1.d("recipes/" + this.b.a() + "/")));
   }

   private void a(aep $$0) {
      if (this.f.d().isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   public static class a extends lo.a {
      private final aep a;
      private final cir b;
      private final int c;
      private final String d;
      private final List<clw> e;
      private final ae.a f;
      private final aep g;

      public a(aep $$0, cir $$1, int $$2, String $$3, clp $$4, List<clw> $$5, ae.a $$6, aep $$7) {
         super($$4);
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$5;
         this.f = $$6;
         this.g = $$7;
      }

      @Override
      public void a(JsonObject $$0) {
         super.a($$0);
         if (!this.d.isEmpty()) {
            $$0.addProperty("group", this.d);
         }

         JsonArray $$1 = new JsonArray();

         for (clw $$2 : this.e) {
            $$1.add($$2.c());
         }

         $$0.add("ingredients", $$1);
         JsonObject $$3 = new JsonObject();
         $$3.addProperty("item", jc.i.b(this.b).toString());
         if (this.c > 1) {
            $$3.addProperty("count", this.c);
         }

         $$0.add("result", $$3);
      }

      @Override
      public cmb<?> c() {
         return cmb.b;
      }

      @Override
      public aep b() {
         return this.a;
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
