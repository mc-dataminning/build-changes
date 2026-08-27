import java.util.HashMap;
import java.util.Map;

public record uv(int a, Map<String, un<?>> b, Map<String, uv> c) {
   private uv(int $$0) {
      this($$0, new HashMap<>(), new HashMap<>());
   }

   public static uv a() {
      return new uv(1);
   }

   public void a(uu $$0) {
      if (this.a <= $$0.a().size()) {
         this.c.computeIfAbsent($$0.a().get(this.a - 1), $$0x -> new uv(this.a + 1)).a($$0);
      } else {
         this.b.put($$0.c(), $$0.b());
      }
   }

   public boolean a(un<?> $$0, String $$1) {
      return $$0.equals(this.c().get($$1));
   }

   public int b() {
      return this.a;
   }

   public Map<String, un<?>> c() {
      return this.b;
   }

   public Map<String, uv> d() {
      return this.c;
   }
}
