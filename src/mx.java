import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class mx implements mq {
   private final mr b;
   private final cle c;
   private final cok d;
   private final int e;
   private final Map<String, am<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final cos<?> h;

   public mx(mr $$0, cos<?> $$1, cok $$2, crz $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.k();
      this.d = $$2;
      this.e = $$4;
   }

   public static mx a(cok $$0, mr $$1, crz $$2) {
      return new mx($$1, cos.t, $$0, $$2, 1);
   }

   public static mx a(cok $$0, mr $$1, crz $$2, int $$3) {
      return new mx($$1, cos.t, $$0, $$2, $$3);
   }

   public mx b(String $$0, am<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public mx b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cle a() {
      return this.c;
   }

   @Override
   public void a(ms $$0, agi $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cu.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      $$0.a(new mx.a($$1, this.h, this.g == null ? "" : this.g, this.d, this.c, this.e, $$2.b($$1.d("recipes/" + this.b.a() + "/"))));
   }

   private void a(agi $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   public static record a(agi a, cos<?> b, String c, cok d, cle e, int f, af g) implements mp {
      @Override
      public void a(JsonObject $$0) {
         if (!this.c.isEmpty()) {
            $$0.addProperty("group", this.c);
         }

         $$0.add("ingredient", this.d.a(false));
         $$0.addProperty("result", jy.i.b(this.e).toString());
         $$0.addProperty("count", this.f);
      }

      @Override
      public agi b() {
         return this.a;
      }

      @Override
      public cos<?> c() {
         return this.b;
      }

      public String e() {
         return this.c;
      }

      public cok f() {
         return this.d;
      }

      public cle g() {
         return this.e;
      }

      public int h() {
         return this.f;
      }

      @Override
      public af d() {
         return this.g;
      }
   }
}
