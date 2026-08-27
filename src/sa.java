import java.util.HashMap;
import java.util.Map;

public record sa(int a, Map<String, rs<?>> b, Map<String, sa> c) {
   private sa(int $$0) {
      this($$0, new HashMap<>(), new HashMap<>());
   }

   public static sa a() {
      return new sa(1);
   }

   public void a(rz $$0) {
      if (this.a <= $$0.a().size()) {
         this.c.computeIfAbsent($$0.a().get(this.a - 1), $$0x -> new sa(this.a + 1)).a($$0);
      } else {
         this.b.put($$0.c(), $$0.b());
      }
   }

   public boolean a(rs<?> $$0, String $$1) {
      return $$0.equals(this.c().get($$1));
   }

   public int b() {
      return this.a;
   }

   public Map<String, rs<?>> c() {
      return this.b;
   }

   public Map<String, sa> d() {
      return this.c;
   }
}
