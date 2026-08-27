import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.Map;

public class mz {
   private final mr a;
   private final cok b;
   private final cok c;
   private final cok d;
   private final Map<String, am<?>> e = new LinkedHashMap<>();
   private final cos<?> f;

   public mz(cos<?> $$0, mr $$1, cok $$2, cok $$3, cok $$4) {
      this.a = $$1;
      this.f = $$0;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
   }

   public static mz a(cok $$0, cok $$1, cok $$2, mr $$3) {
      return new mz(cos.v, $$3, $$0, $$1, $$2);
   }

   public mz a(String $$0, am<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(ms $$0, agi $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cu.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.e.forEach($$2::a);
      $$0.a(new mz.a($$1, this.f, this.b, this.c, this.d, $$2.b($$1.d("recipes/" + this.a.a() + "/"))));
   }

   private void a(agi $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   public static record a(agi a, cos<?> b, cok c, cok d, cok e, af f) implements mp {
      @Override
      public void a(JsonObject $$0) {
         $$0.add("template", this.c.a(true));
         $$0.add("base", this.d.a(true));
         $$0.add("addition", this.e.a(true));
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

      @Override
      public af d() {
         return this.f;
      }
   }
}
