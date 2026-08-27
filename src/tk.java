import java.util.HashMap;
import java.util.Map;

public record tk(int a, Map<String, tc<?>> b, Map<String, tk> c) {
   private tk(int $$0) {
      this($$0, new HashMap<>(), new HashMap<>());
   }

   public static tk a() {
      return new tk(1);
   }

   public void a(tj $$0) {
      if (this.a <= $$0.a().size()) {
         this.c.computeIfAbsent($$0.a().get(this.a - 1), $$0x -> new tk(this.a + 1)).a($$0);
      } else {
         this.b.put($$0.c(), $$0.b());
      }
   }

   public boolean a(tc<?> $$0, String $$1) {
      return $$0.equals(this.c().get($$1));
   }

   public int b() {
      return this.a;
   }

   public Map<String, tc<?>> c() {
      return this.b;
   }

   public Map<String, tk> d() {
      return this.c;
   }
}
