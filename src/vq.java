import java.util.HashMap;
import java.util.Map;

public record vq(int a, Map<String, vi<?>> b, Map<String, vq> c) {
   private vq(int $$0) {
      this($$0, new HashMap<>(), new HashMap<>());
   }

   public static vq a() {
      return new vq(1);
   }

   public void a(vp $$0) {
      if (this.a <= $$0.a().size()) {
         this.c.computeIfAbsent($$0.a().get(this.a - 1), $$0x -> new vq(this.a + 1)).a($$0);
      } else {
         this.b.put($$0.c(), $$0.b());
      }
   }

   public boolean a(vi<?> $$0, String $$1) {
      return $$0.equals(this.c().get($$1));
   }

   public int b() {
      return this.a;
   }

   public Map<String, vi<?>> c() {
      return this.b;
   }

   public Map<String, vq> d() {
      return this.c;
   }
}
