import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class ly extends lr implements lt {
   private final lu b;
   private final cjc c;
   private final int d;
   private final List<cmi> e = Lists.newArrayList();
   private final Map<String, am<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   public ly(lu $$0, cpw $$1, int $$2) {
      this.b = $$0;
      this.c = $$1.k();
      this.d = $$2;
   }

   public static ly a(lu $$0, cpw $$1) {
      return new ly($$0, $$1, 1);
   }

   public static ly a(lu $$0, cpw $$1, int $$2) {
      return new ly($$0, $$1, $$2);
   }

   public ly a(aqj<cjc> $$0) {
      return this.a(cmi.a($$0));
   }

   public ly b(cpw $$0) {
      return this.a($$0, 1);
   }

   public ly a(cpw $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.a(cmi.a($$0));
      }

      return this;
   }

   public ly a(cmi $$0) {
      return this.a($$0, 1);
   }

   public ly a(cmi $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.e.add($$0);
      }

      return this;
   }

   public ly b(String $$0, am<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public ly b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cjc a() {
      return this.c;
   }

   @Override
   public void a(lv $$0, aey $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cu.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      $$0.a(new ly.a($$1, this.c, this.d, this.g == null ? "" : this.g, a(this.b), this.e, $$2.b($$1.d("recipes/" + this.b.a() + "/"))));
   }

   private void a(aey $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   public static class a extends lr.a {
      private final aey a;
      private final cjc b;
      private final int c;
      private final String d;
      private final List<cmi> e;
      private final af f;

      public a(aey $$0, cjc $$1, int $$2, String $$3, cma $$4, List<cmi> $$5, af $$6) {
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

         for (cmi $$2 : this.e) {
            $$1.add($$2.a(false));
         }

         $$0.add("ingredients", $$1);
         JsonObject $$3 = new JsonObject();
         $$3.addProperty("item", jd.i.b(this.b).toString());
         if (this.c > 1) {
            $$3.addProperty("count", this.c);
         }

         $$0.add("result", $$3);
      }

      @Override
      public cmo<?> c() {
         return cmo.b;
      }

      @Override
      public aey b() {
         return this.a;
      }

      @Override
      public af d() {
         return this.f;
      }
   }
}
