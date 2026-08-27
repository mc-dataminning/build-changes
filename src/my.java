import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.Map;

public class my {
   private final cok a;
   private final cok b;
   private final cok c;
   private final mr d;
   private final cle e;
   private final Map<String, am<?>> f = new LinkedHashMap<>();
   private final cos<?> g;

   public my(cos<?> $$0, cok $$1, cok $$2, cok $$3, mr $$4, cle $$5) {
      this.d = $$4;
      this.g = $$0;
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.e = $$5;
   }

   public static my a(cok $$0, cok $$1, cok $$2, mr $$3, cle $$4) {
      return new my(cos.u, $$0, $$1, $$2, $$3, $$4);
   }

   public my a(String $$0, am<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(ms $$0, String $$1) {
      this.a($$0, new agi($$1));
   }

   public void a(ms $$0, agi $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cu.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      $$0.a(new my.a($$1, this.g, this.a, this.b, this.c, this.e, $$2.b($$1.d("recipes/" + this.d.a() + "/"))));
   }

   private void a(agi $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   public static record a(agi a, cos<?> b, cok c, cok d, cok e, cle f, af g) implements mp {
      @Override
      public void a(JsonObject $$0) {
         $$0.add("template", this.c.a(true));
         $$0.add("base", this.d.a(true));
         $$0.add("addition", this.e.a(true));
         JsonObject $$1 = new JsonObject();
         $$1.addProperty("item", jy.i.b(this.f).toString());
         $$0.add("result", $$1);
      }

      @Override
      public agi b() {
         return this.a;
      }

      @Override
      public cos<?> c() {
         return this.b;
      }

      public cok e() {
         return this.c;
      }

      public cok f() {
         return this.d;
      }

      public cok g() {
         return this.e;
      }

      public cle h() {
         return this.f;
      }

      @Override
      public af d() {
         return this.g;
      }
   }
}
