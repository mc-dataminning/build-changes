import java.util.HashMap;
import java.util.Map;

public record tq(int a, Map<String, ti<?>> b, Map<String, tq> c) {
   private tq(int $$0) {
      this($$0, new HashMap<>(), new HashMap<>());
   }

   public static tq a() {
      return new tq(1);
   }

   public void a(tp $$0) {
      if (this.a <= $$0.a().size()) {
         this.c.computeIfAbsent($$0.a().get(this.a - 1), $$0x -> new tq(this.a + 1)).a($$0);
      } else {
         this.b.put($$0.c(), $$0.b());
      }
   }

   public boolean a(ti<?> $$0, String $$1) {
      return $$0.equals(this.c().get($$1));
   }

   public int b() {
      return this.a;
   }

   public Map<String, ti<?>> c() {
      return this.b;
   }

   public Map<String, tq> d() {
      return this.c;
   }
}
