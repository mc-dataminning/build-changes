import java.util.HashMap;
import java.util.Map;

public record sb(int a, Map<String, rt<?>> b, Map<String, sb> c) {
   private sb(int $$0) {
      this($$0, new HashMap<>(), new HashMap<>());
   }

   public static sb a() {
      return new sb(1);
   }

   public void a(sa $$0) {
      if (this.a <= $$0.a().size()) {
         this.c.computeIfAbsent($$0.a().get(this.a - 1), $$0x -> new sb(this.a + 1)).a($$0);
      } else {
         this.b.put($$0.c(), $$0.b());
      }
   }

   public boolean a(rt<?> $$0, String $$1) {
      return $$0.equals(this.c().get($$1));
   }

   public int b() {
      return this.a;
   }

   public Map<String, rt<?>> c() {
      return this.b;
   }

   public Map<String, sb> d() {
      return this.c;
   }
}
