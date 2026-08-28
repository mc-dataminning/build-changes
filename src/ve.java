import java.util.HashMap;
import java.util.Map;

public record ve(int a, Map<String, uw<?>> b, Map<String, ve> c) {
   private ve(int $$0) {
      this($$0, new HashMap<>(), new HashMap<>());
   }

   public static ve a() {
      return new ve(1);
   }

   public void a(vd $$0) {
      if (this.a <= $$0.a().size()) {
         this.c.computeIfAbsent($$0.a().get(this.a - 1), $$0x -> new ve(this.a + 1)).a($$0);
      } else {
         this.b.put($$0.c(), $$0.b());
      }
   }

   public boolean a(uw<?> $$0, String $$1) {
      return $$0.equals(this.c().get($$1));
   }

   public int b() {
      return this.a;
   }

   public Map<String, uw<?>> c() {
      return this.b;
   }

   public Map<String, ve> d() {
      return this.c;
   }
}
