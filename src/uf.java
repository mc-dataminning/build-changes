import java.util.HashMap;
import java.util.Map;

public record uf(int a, Map<String, tx<?>> b, Map<String, uf> c) {
   private uf(int $$0) {
      this($$0, new HashMap<>(), new HashMap<>());
   }

   public static uf a() {
      return new uf(1);
   }

   public void a(ue $$0) {
      if (this.a <= $$0.a().size()) {
         this.c.computeIfAbsent($$0.a().get(this.a - 1), $$0x -> new uf(this.a + 1)).a($$0);
      } else {
         this.b.put($$0.c(), $$0.b());
      }
   }

   public boolean a(tx<?> $$0, String $$1) {
      return $$0.equals(this.c().get($$1));
   }

   public int b() {
      return this.a;
   }

   public Map<String, tx<?>> c() {
      return this.b;
   }

   public Map<String, uf> d() {
      return this.c;
   }
}
