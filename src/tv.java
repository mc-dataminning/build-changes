import java.util.HashMap;
import java.util.Map;

public record tv(int a, Map<String, tn<?>> b, Map<String, tv> c) {
   private tv(int $$0) {
      this($$0, new HashMap<>(), new HashMap<>());
   }

   public static tv a() {
      return new tv(1);
   }

   public void a(tu $$0) {
      if (this.a <= $$0.a().size()) {
         this.c.computeIfAbsent($$0.a().get(this.a - 1), $$0x -> new tv(this.a + 1)).a($$0);
      } else {
         this.b.put($$0.c(), $$0.b());
      }
   }

   public boolean a(tn<?> $$0, String $$1) {
      return $$0.equals(this.c().get($$1));
   }

   public int b() {
      return this.a;
   }

   public Map<String, tn<?>> c() {
      return this.b;
   }

   public Map<String, tv> d() {
      return this.c;
   }
}
