import java.util.HashMap;
import java.util.Map;

public record rv(int a, Map<String, rn<?>> b, Map<String, rv> c) {
   private rv(int $$0) {
      this($$0, new HashMap<>(), new HashMap<>());
   }

   public static rv a() {
      return new rv(1);
   }

   public void a(ru $$0) {
      if (this.a <= $$0.a().size()) {
         this.c.computeIfAbsent($$0.a().get(this.a - 1), $$0x -> new rv(this.a + 1)).a($$0);
      } else {
         this.b.put($$0.c(), $$0.b());
      }
   }

   public boolean a(rn<?> $$0, String $$1) {
      return $$0.equals(this.c().get($$1));
   }

   public int b() {
      return this.a;
   }

   public Map<String, rn<?>> c() {
      return this.b;
   }

   public Map<String, rv> d() {
      return this.c;
   }
}
