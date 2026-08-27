import java.util.HashMap;
import java.util.Map;

public record vr(int a, Map<String, vj<?>> b, Map<String, vr> c) {
   private vr(int $$0) {
      this($$0, new HashMap<>(), new HashMap<>());
   }

   public static vr a() {
      return new vr(1);
   }

   public void a(vq $$0) {
      if (this.a <= $$0.a().size()) {
         this.c.computeIfAbsent($$0.a().get(this.a - 1), $$0x -> new vr(this.a + 1)).a($$0);
      } else {
         this.b.put($$0.c(), $$0.b());
      }
   }

   public boolean a(vj<?> $$0, String $$1) {
      return $$0.equals(this.c().get($$1));
   }

   public int b() {
      return this.a;
   }

   public Map<String, vj<?>> c() {
      return this.b;
   }

   public Map<String, vr> d() {
      return this.c;
   }
}
