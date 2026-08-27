import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class lt extends ln implements lp {
   private final lq b;
   private final cis c;
   private final int d;
   private final List<clx> e = Lists.newArrayList();
   private final ae.a f = ae.a.b();
   @Nullable
   private String g;

   public lt(lq $$0, cpk $$1, int $$2) {
      this.b = $$0;
      this.c = $$1.k();
      this.d = $$2;
   }

   public static lt a(lq $$0, cpk $$1) {
      return new lt($$0, $$1, 1);
   }

   public static lt a(lq $$0, cpk $$1, int $$2) {
      return new lt($$0, $$1, $$2);
   }

   public lt a(aqa<cis> $$0) {
      return this.a(clx.a($$0));
   }

   public lt b(cpk $$0) {
      return this.a($$0, 1);
   }

   public lt a(cpk $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.a(clx.a($$0));
      }

      return this;
   }

   public lt a(clx $$0) {
      return this.a($$0, 1);
   }

   public lt a(clx $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.e.add($$0);
      }

      return this;
   }

   public lt b(String $$0, am $$1) {
      this.f.a($$0, $$1);
      return this;
   }

   public lt b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cis a() {
      return this.c;
   }

   @Override
   public void a(Consumer<lo> $$0, aer $$1) {
      this.a($$1);
      this.f.a(a).a("has_the_recipe", cs.a($$1)).a(ah.a.c($$1)).a(ap.b);
      $$0.accept(new lt.a($$1, this.c, this.d, this.g == null ? "" : this.g, a(this.b), this.e, this.f, $$1.d("recipes/" + this.b.a() + "/")));
   }

   private void a(aer $$0) {
      if (this.f.d().isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   public static class a extends ln.a {
      private final aer a;
      private final cis b;
      private final int c;
      private final String d;
      private final List<clx> e;
      private final ae.a f;
      private final aer g;

      public a(aer $$0, cis $$1, int $$2, String $$3, clq $$4, List<clx> $$5, ae.a $$6, aer $$7) {
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

         for (clx $$2 : this.e) {
            $$1.add($$2.c());
         }

         $$0.add("ingredients", $$1);
         JsonObject $$3 = new JsonObject();
         $$3.addProperty("item", jb.i.b(this.b).toString());
         if (this.c > 1) {
            $$3.addProperty("count", this.c);
         }

         $$0.add("result", $$3);
      }

      @Override
      public cmc<?> c() {
         return cmc.b;
      }

      @Override
      public aer b() {
         return this.a;
      }

      @Nullable
      @Override
      public JsonObject d() {
         return this.f.c();
      }

      @Nullable
      @Override
      public aer e() {
         return this.g;
      }
   }
}
