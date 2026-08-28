import java.util.HashMap;
import java.util.Map;

public record vy(int a, Map<String, vq<?>> b, Map<String, vy> c) {
   private vy(int $$0) {
      this($$0, new HashMap<>(), new HashMap<>());
   }

   public static vy a() {
      return new vy(1);
   }

   public void a(vx $$0) {
      if (this.a <= $$0.a().size()) {
         this.c.computeIfAbsent($$0.a().get(this.a - 1), $$0x -> new vy(this.a + 1)).a($$0);
      } else {
         this.b.put($$0.c(), $$0.b());
      }
   }

   public boolean a(vq<?> $$0, String $$1) {
      return $$0.equals(this.c().get($$1));
   }

   public int b() {
      return this.a;
   }

   public Map<String, vq<?>> c() {
      return this.b;
   }

   public Map<String, vy> d() {
      return this.c;
   }
}
