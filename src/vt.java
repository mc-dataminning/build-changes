import java.util.HashMap;
import java.util.Map;

public record vt(int a, Map<String, vl<?>> b, Map<String, vt> c) {
   private vt(int $$0) {
      this($$0, new HashMap<>(), new HashMap<>());
   }

   public static vt a() {
      return new vt(1);
   }

   public void a(vs $$0) {
      if (this.a <= $$0.a().size()) {
         this.c.computeIfAbsent($$0.a().get(this.a - 1), $$0x -> new vt(this.a + 1)).a($$0);
      } else {
         this.b.put($$0.c(), $$0.b());
      }
   }

   public boolean a(vl<?> $$0, String $$1) {
      return $$0.equals(this.c().get($$1));
   }

   public int b() {
      return this.a;
   }

   public Map<String, vl<?>> c() {
      return this.b;
   }

   public Map<String, vt> d() {
      return this.c;
   }
}
