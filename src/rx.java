import java.util.HashMap;
import java.util.Map;

public record rx(int a, Map<String, rp<?>> b, Map<String, rx> c) {
   private rx(int $$0) {
      this($$0, new HashMap<>(), new HashMap<>());
   }

   public static rx a() {
      return new rx(1);
   }

   public void a(rw $$0) {
      if (this.a <= $$0.a().size()) {
         this.c.computeIfAbsent($$0.a().get(this.a - 1), $$0x -> new rx(this.a + 1)).a($$0);
      } else {
         this.b.put($$0.c(), $$0.b());
      }
   }

   public boolean a(rp<?> $$0, String $$1) {
      return $$0.equals(this.c().get($$1));
   }

   public int b() {
      return this.a;
   }

   public Map<String, rp<?>> c() {
      return this.b;
   }

   public Map<String, rx> d() {
      return this.c;
   }
}
