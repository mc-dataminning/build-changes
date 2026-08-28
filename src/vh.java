import java.util.HashMap;
import java.util.Map;

public record vh(int a, Map<String, uz<?>> b, Map<String, vh> c) {
   private vh(int $$0) {
      this($$0, new HashMap<>(), new HashMap<>());
   }

   public static vh a() {
      return new vh(1);
   }

   public void a(vg $$0) {
      if (this.a <= $$0.a().size()) {
         this.c.computeIfAbsent($$0.a().get(this.a - 1), $$0x -> new vh(this.a + 1)).a($$0);
      } else {
         this.b.put($$0.c(), $$0.b());
      }
   }

   public boolean a(uz<?> $$0, String $$1) {
      return $$0.equals(this.c().get($$1));
   }

   public int b() {
      return this.a;
   }

   public Map<String, uz<?>> c() {
      return this.b;
   }

   public Map<String, vh> d() {
      return this.c;
   }
}
