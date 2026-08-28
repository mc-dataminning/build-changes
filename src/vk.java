import java.util.HashMap;
import java.util.Map;

public record vk(int a, Map<String, vc<?>> b, Map<String, vk> c) {
   private vk(int $$0) {
      this($$0, new HashMap<>(), new HashMap<>());
   }

   public static vk a() {
      return new vk(1);
   }

   public void a(vj $$0) {
      if (this.a <= $$0.a().size()) {
         this.c.computeIfAbsent($$0.a().get(this.a - 1), $$0x -> new vk(this.a + 1)).a($$0);
      } else {
         this.b.put($$0.c(), $$0.b());
      }
   }

   public boolean a(vc<?> $$0, String $$1) {
      return $$0.equals(this.c().get($$1));
   }

   public int b() {
      return this.a;
   }

   public Map<String, vc<?>> c() {
      return this.b;
   }

   public Map<String, vk> d() {
      return this.c;
   }
}
