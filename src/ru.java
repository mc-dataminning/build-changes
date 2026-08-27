import java.util.HashMap;
import java.util.Map;

public record ru(int a, Map<String, rm<?>> b, Map<String, ru> c) {
   private ru(int $$0) {
      this($$0, new HashMap<>(), new HashMap<>());
   }

   public static ru a() {
      return new ru(1);
   }

   public void a(rt $$0) {
      if (this.a <= $$0.a().size()) {
         this.c.computeIfAbsent($$0.a().get(this.a - 1), $$0x -> new ru(this.a + 1)).a($$0);
      } else {
         this.b.put($$0.c(), $$0.b());
      }
   }

   public boolean a(rm<?> $$0, String $$1) {
      return $$0.equals(this.c().get($$1));
   }

   public int b() {
      return this.a;
   }

   public Map<String, rm<?>> c() {
      return this.b;
   }

   public Map<String, ru> d() {
      return this.c;
   }
}
