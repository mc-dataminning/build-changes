import java.util.HashMap;
import java.util.Map;

public record sx(int a, Map<String, sp<?>> b, Map<String, sx> c) {
   private sx(int $$0) {
      this($$0, new HashMap<>(), new HashMap<>());
   }

   public static sx a() {
      return new sx(1);
   }

   public void a(sw $$0) {
      if (this.a <= $$0.a().size()) {
         this.c.computeIfAbsent($$0.a().get(this.a - 1), $$0x -> new sx(this.a + 1)).a($$0);
      } else {
         this.b.put($$0.c(), $$0.b());
      }
   }

   public boolean a(sp<?> $$0, String $$1) {
      return $$0.equals(this.c().get($$1));
   }

   public int b() {
      return this.a;
   }

   public Map<String, sp<?>> c() {
      return this.b;
   }

   public Map<String, sx> d() {
      return this.c;
   }
}
