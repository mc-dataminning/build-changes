import java.util.HashMap;
import java.util.Map;

public record ud(int a, Map<String, tv<?>> b, Map<String, ud> c) {
   private ud(int $$0) {
      this($$0, new HashMap<>(), new HashMap<>());
   }

   public static ud a() {
      return new ud(1);
   }

   public void a(uc $$0) {
      if (this.a <= $$0.a().size()) {
         this.c.computeIfAbsent($$0.a().get(this.a - 1), $$0x -> new ud(this.a + 1)).a($$0);
      } else {
         this.b.put($$0.c(), $$0.b());
      }
   }

   public boolean a(tv<?> $$0, String $$1) {
      return $$0.equals(this.c().get($$1));
   }

   public int b() {
      return this.a;
   }

   public Map<String, tv<?>> c() {
      return this.b;
   }

   public Map<String, ud> d() {
      return this.c;
   }
}
