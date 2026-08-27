import java.util.HashMap;
import java.util.Map;

public record tu(int a, Map<String, tm<?>> b, Map<String, tu> c) {
   private tu(int $$0) {
      this($$0, new HashMap<>(), new HashMap<>());
   }

   public static tu a() {
      return new tu(1);
   }

   public void a(tt $$0) {
      if (this.a <= $$0.a().size()) {
         this.c.computeIfAbsent($$0.a().get(this.a - 1), $$0x -> new tu(this.a + 1)).a($$0);
      } else {
         this.b.put($$0.c(), $$0.b());
      }
   }

   public boolean a(tm<?> $$0, String $$1) {
      return $$0.equals(this.c().get($$1));
   }

   public int b() {
      return this.a;
   }

   public Map<String, tm<?>> c() {
      return this.b;
   }

   public Map<String, tu> d() {
      return this.c;
   }
}
