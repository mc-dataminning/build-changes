import java.util.HashMap;
import java.util.Map;

public record we(int a, Map<String, vw<?>> b, Map<String, we> c) {
   private we(int $$0) {
      this($$0, new HashMap<>(), new HashMap<>());
   }

   public static we a() {
      return new we(1);
   }

   public void a(wd $$0) {
      if (this.a <= $$0.a().size()) {
         this.c.computeIfAbsent($$0.a().get(this.a - 1), $$0x -> new we(this.a + 1)).a($$0);
      } else {
         this.b.put($$0.c(), $$0.b());
      }
   }

   public boolean a(vw<?> $$0, String $$1) {
      return $$0.equals(this.c().get($$1));
   }

   public int b() {
      return this.a;
   }

   public Map<String, vw<?>> c() {
      return this.b;
   }

   public Map<String, we> d() {
      return this.c;
   }
}
