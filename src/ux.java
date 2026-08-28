import java.util.HashMap;
import java.util.Map;

public record ux(int a, Map<String, up<?>> b, Map<String, ux> c) {
   private ux(int $$0) {
      this($$0, new HashMap<>(), new HashMap<>());
   }

   public static ux a() {
      return new ux(1);
   }

   public void a(uw $$0) {
      if (this.a <= $$0.a().size()) {
         this.c.computeIfAbsent($$0.a().get(this.a - 1), $$0x -> new ux(this.a + 1)).a($$0);
      } else {
         this.b.put($$0.c(), $$0.b());
      }
   }

   public boolean a(up<?> $$0, String $$1) {
      return $$0.equals(this.c().get($$1));
   }

   public int b() {
      return this.a;
   }

   public Map<String, up<?>> c() {
      return this.b;
   }

   public Map<String, ux> d() {
      return this.c;
   }
}
