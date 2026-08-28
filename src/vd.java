import java.util.HashMap;
import java.util.Map;

public record vd(int a, Map<String, uv<?>> b, Map<String, vd> c) {
   private vd(int $$0) {
      this($$0, new HashMap<>(), new HashMap<>());
   }

   public static vd a() {
      return new vd(1);
   }

   public void a(vc $$0) {
      if (this.a <= $$0.a().size()) {
         this.c.computeIfAbsent($$0.a().get(this.a - 1), $$0x -> new vd(this.a + 1)).a($$0);
      } else {
         this.b.put($$0.c(), $$0.b());
      }
   }

   public boolean a(uv<?> $$0, String $$1) {
      return $$0.equals(this.c().get($$1));
   }

   public int b() {
      return this.a;
   }

   public Map<String, uv<?>> c() {
      return this.b;
   }

   public Map<String, vd> d() {
      return this.c;
   }
}
