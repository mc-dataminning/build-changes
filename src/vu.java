import java.util.HashMap;
import java.util.Map;

public record vu(int a, Map<String, vm<?>> b, Map<String, vu> c) {
   private vu(int $$0) {
      this($$0, new HashMap<>(), new HashMap<>());
   }

   public static vu a() {
      return new vu(1);
   }

   public void a(vt $$0) {
      if (this.a <= $$0.a().size()) {
         this.c.computeIfAbsent($$0.a().get(this.a - 1), $$0x -> new vu(this.a + 1)).a($$0);
      } else {
         this.b.put($$0.c(), $$0.b());
      }
   }

   public boolean a(vm<?> $$0, String $$1) {
      return $$0.equals(this.c().get($$1));
   }

   public int b() {
      return this.a;
   }

   public Map<String, vm<?>> c() {
      return this.b;
   }

   public Map<String, vu> d() {
      return this.c;
   }
}
