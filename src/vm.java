import java.util.HashMap;
import java.util.Map;

public record vm(int a, Map<String, ve<?>> b, Map<String, vm> c) {
   private vm(int $$0) {
      this($$0, new HashMap<>(), new HashMap<>());
   }

   public static vm a() {
      return new vm(1);
   }

   public void a(vl $$0) {
      if (this.a <= $$0.a().size()) {
         this.c.computeIfAbsent($$0.a().get(this.a - 1), $$0x -> new vm(this.a + 1)).a($$0);
      } else {
         this.b.put($$0.c(), $$0.b());
      }
   }

   public boolean a(ve<?> $$0, String $$1) {
      return $$0.equals(this.c().get($$1));
   }

   public int b() {
      return this.a;
   }

   public Map<String, ve<?>> c() {
      return this.b;
   }

   public Map<String, vm> d() {
      return this.c;
   }
}
