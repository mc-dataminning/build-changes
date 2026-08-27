import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class mt extends mm implements mo {
   private final mp b;
   private final cke c;
   private final int d;
   private final List<cnk> e = Lists.newArrayList();
   private final Map<String, am<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   public mt(mp $$0, cqy $$1, int $$2) {
      this.b = $$0;
      this.c = $$1.k();
      this.d = $$2;
   }

   public static mt a(mp $$0, cqy $$1) {
      return new mt($$0, $$1, 1);
   }

   public static mt a(mp $$0, cqy $$1, int $$2) {
      return new mt($$0, $$1, $$2);
   }

   public mt a(arh<cke> $$0) {
      return this.a(cnk.a($$0));
   }

   public mt b(cqy $$0) {
      return this.a($$0, 1);
   }

   public mt a(cqy $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.a(cnk.a($$0));
      }

      return this;
   }

   public mt a(cnk $$0) {
      return this.a($$0, 1);
   }

   public mt a(cnk $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.e.add($$0);
      }

      return this;
   }

   public mt b(String $$0, am<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public mt b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cke a() {
      return this.c;
   }

   @Override
   public void a(mq $$0, afw $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cu.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      $$0.a(new mt.a($$1, this.c, this.d, this.g == null ? "" : this.g, a(this.b), this.e, $$2.b($$1.d("recipes/" + this.b.a() + "/"))));
   }

   private void a(afw $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   public static class a extends mm.a {
      private final afw a;
      private final cke b;
      private final int c;
      private final String d;
      private final List<cnk> e;
      private final af f;

      public a(afw $$0, cke $$1, int $$2, String $$3, cnc $$4, List<cnk> $$5, af $$6) {
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

         for (cnk $$2 : this.e) {
            $$1.add($$2.a(false));
         }

         $$0.add("ingredients", $$1);
         JsonObject $$3 = new JsonObject();
         $$3.addProperty("item", jy.i.b(this.b).toString());
         if (this.c > 1) {
            $$3.addProperty("count", this.c);
         }

         $$0.add("result", $$3);
      }

      @Override
      public cnq<?> c() {
         return cnq.b;
      }

      @Override
      public afw b() {
         return this.a;
      }

      @Override
      public af d() {
         return this.f;
      }
   }
}
