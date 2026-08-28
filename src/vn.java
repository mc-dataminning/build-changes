import java.util.HashMap;
import java.util.Map;

public record vn(int a, Map<String, vf<?>> b, Map<String, vn> c) {
   private vn(int $$0) {
      this($$0, new HashMap<>(), new HashMap<>());
   }

   public static vn a() {
      return new vn(1);
   }

   public void a(vm $$0) {
      if (this.a <= $$0.a().size()) {
         this.c.computeIfAbsent($$0.a().get(this.a - 1), $$0x -> new vn(this.a + 1)).a($$0);
      } else {
         this.b.put($$0.c(), $$0.b());
      }
   }

   public boolean a(vf<?> $$0, String $$1) {
      return $$0.equals(this.c().get($$1));
   }

   public int b() {
      return this.a;
   }

   public Map<String, vf<?>> c() {
      return this.b;
   }

   public Map<String, vn> d() {
      return this.c;
   }
}
