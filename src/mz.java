import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class mz extends ms implements mu {
   private final mv b;
   private final clj c;
   private final int d;
   private final List<coq> e = Lists.newArrayList();
   private final Map<String, am<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   public mz(mv $$0, cse $$1, int $$2) {
      this.b = $$0;
      this.c = $$1.k();
      this.d = $$2;
   }

   public static mz a(mv $$0, cse $$1) {
      return new mz($$0, $$1, 1);
   }

   public static mz a(mv $$0, cse $$1, int $$2) {
      return new mz($$0, $$1, $$2);
   }

   public mz a(arz<clj> $$0) {
      return this.a(coq.a($$0));
   }

   public mz b(cse $$0) {
      return this.a($$0, 1);
   }

   public mz a(cse $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.a(coq.a($$0));
      }

      return this;
   }

   public mz a(coq $$0) {
      return this.a($$0, 1);
   }

   public mz a(coq $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.e.add($$0);
      }

      return this;
   }

   public mz b(String $$0, am<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public mz b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public clj a() {
      return this.c;
   }

   @Override
   public void a(mw $$0, agm $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cu.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      $$0.a(new mz.a($$1, this.c, this.d, this.g == null ? "" : this.g, a(this.b), this.e, $$2.b($$1.d("recipes/" + this.b.a() + "/"))));
   }

   private void a(agm $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   public static class a extends ms.a {
      private final agm a;
      private final clj b;
      private final int c;
      private final String d;
      private final List<coq> e;
      private final af f;

      public a(agm $$0, clj $$1, int $$2, String $$3, coh $$4, List<coq> $$5, af $$6) {
         super($$4);
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$5;
         this.f = $$6;
      }

      @Override
      public void a(JsonObject $$0) {
         super.a($$0);
         if (!this.d.isEmpty()) {
            $$0.addProperty("group", this.d);
         }

         JsonArray $$1 = new JsonArray();

         for (coq $$2 : this.e) {
            $$1.add($$2.a(false));
         }

         $$0.add("ingredients", $$1);
         JsonObject $$3 = new JsonObject();
         $$3.addProperty("item", kc.i.b(this.b).toString());
         if (this.c > 1) {
            $$3.addProperty("count", this.c);
         }

         $$0.add("result", $$3);
      }

      @Override
      public cox<?> c() {
         return cox.b;
      }

      @Override
      public agm b() {
         return this.a;
      }

      @Override
      public af d() {
         return this.f;
      }
   }
}
