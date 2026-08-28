import java.util.HashMap;
import java.util.Map;

public record vz(int a, Map<String, vr<?>> b, Map<String, vz> c) {
   private vz(int $$0) {
      this($$0, new HashMap<>(), new HashMap<>());
   }

   public static vz a() {
      return new vz(1);
   }

   public void a(vy $$0) {
      if (this.a <= $$0.a().size()) {
         this.c.computeIfAbsent($$0.a().get(this.a - 1), $$0x -> new vz(this.a + 1)).a($$0);
      } else {
         this.b.put($$0.c(), $$0.b());
      }
   }

   public boolean a(vr<?> $$0, String $$1) {
      return $$0.equals(this.c().get($$1));
   }

   public int b() {
      return this.a;
   }

   public Map<String, vr<?>> c() {
      return this.b;
   }

   public Map<String, vz> d() {
      return this.c;
   }
}
