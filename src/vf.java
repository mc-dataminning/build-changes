import java.util.HashMap;
import java.util.Map;

public record vf(int a, Map<String, ux<?>> b, Map<String, vf> c) {
   private vf(int $$0) {
      this($$0, new HashMap<>(), new HashMap<>());
   }

   public static vf a() {
      return new vf(1);
   }

   public void a(ve $$0) {
      if (this.a <= $$0.a().size()) {
         this.c.computeIfAbsent($$0.a().get(this.a - 1), $$0x -> new vf(this.a + 1)).a($$0);
      } else {
         this.b.put($$0.c(), $$0.b());
      }
   }

   public boolean a(ux<?> $$0, String $$1) {
      return $$0.equals(this.c().get($$1));
   }

   public int b() {
      return this.a;
   }

   public Map<String, ux<?>> c() {
      return this.b;
   }

   public Map<String, vf> d() {
      return this.c;
   }
}
