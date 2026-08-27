import java.util.HashMap;
import java.util.Map;

public record uh(int a, Map<String, tz<?>> b, Map<String, uh> c) {
   private uh(int $$0) {
      this($$0, new HashMap<>(), new HashMap<>());
   }

   public static uh a() {
      return new uh(1);
   }

   public void a(ug $$0) {
      if (this.a <= $$0.a().size()) {
         this.c.computeIfAbsent($$0.a().get(this.a - 1), $$0x -> new uh(this.a + 1)).a($$0);
      } else {
         this.b.put($$0.c(), $$0.b());
      }
   }

   public boolean a(tz<?> $$0, String $$1) {
      return $$0.equals(this.c().get($$1));
   }

   public int b() {
      return this.a;
   }

   public Map<String, tz<?>> c() {
      return this.b;
   }

   public Map<String, uh> d() {
      return this.c;
   }
}
