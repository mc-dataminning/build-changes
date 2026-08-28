import java.util.HashMap;
import java.util.Map;

public record vi(int a, Map<String, va<?>> b, Map<String, vi> c) {
   private vi(int $$0) {
      this($$0, new HashMap<>(), new HashMap<>());
   }

   public static vi a() {
      return new vi(1);
   }

   public void a(vh $$0) {
      if (this.a <= $$0.a().size()) {
         this.c.computeIfAbsent($$0.a().get(this.a - 1), $$0x -> new vi(this.a + 1)).a($$0);
      } else {
         this.b.put($$0.c(), $$0.b());
      }
   }

   public boolean a(va<?> $$0, String $$1) {
      return $$0.equals(this.c().get($$1));
   }

   public int b() {
      return this.a;
   }

   public Map<String, va<?>> c() {
      return this.b;
   }

   public Map<String, vi> d() {
      return this.c;
   }
}
