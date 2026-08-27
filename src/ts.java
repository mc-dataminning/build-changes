import java.util.HashMap;
import java.util.Map;

public record ts(int a, Map<String, tk<?>> b, Map<String, ts> c) {
   private ts(int $$0) {
      this($$0, new HashMap<>(), new HashMap<>());
   }

   public static ts a() {
      return new ts(1);
   }

   public void a(tr $$0) {
      if (this.a <= $$0.a().size()) {
         this.c.computeIfAbsent($$0.a().get(this.a - 1), $$0x -> new ts(this.a + 1)).a($$0);
      } else {
         this.b.put($$0.c(), $$0.b());
      }
   }

   public boolean a(tk<?> $$0, String $$1) {
      return $$0.equals(this.c().get($$1));
   }

   public int b() {
      return this.a;
   }

   public Map<String, tk<?>> c() {
      return this.b;
   }

   public Map<String, ts> d() {
      return this.c;
   }
}
