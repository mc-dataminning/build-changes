import java.util.HashMap;
import java.util.Map;

public record sc(int a, Map<String, ru<?>> b, Map<String, sc> c) {
   private sc(int $$0) {
      this($$0, new HashMap<>(), new HashMap<>());
   }

   public static sc a() {
      return new sc(1);
   }

   public void a(sb $$0) {
      if (this.a <= $$0.a().size()) {
         this.c.computeIfAbsent($$0.a().get(this.a - 1), $$0x -> new sc(this.a + 1)).a($$0);
      } else {
         this.b.put($$0.c(), $$0.b());
      }
   }

   public boolean a(ru<?> $$0, String $$1) {
      return $$0.equals(this.c().get($$1));
   }

   public int b() {
      return this.a;
   }

   public Map<String, ru<?>> c() {
      return this.b;
   }

   public Map<String, sc> d() {
      return this.c;
   }
}
