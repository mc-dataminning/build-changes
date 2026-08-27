import java.util.HashMap;
import java.util.Map;

public record tg(int a, Map<String, sy<?>> b, Map<String, tg> c) {
   private tg(int $$0) {
      this($$0, new HashMap<>(), new HashMap<>());
   }

   public static tg a() {
      return new tg(1);
   }

   public void a(tf $$0) {
      if (this.a <= $$0.a().size()) {
         this.c.computeIfAbsent($$0.a().get(this.a - 1), $$0x -> new tg(this.a + 1)).a($$0);
      } else {
         this.b.put($$0.c(), $$0.b());
      }
   }

   public boolean a(sy<?> $$0, String $$1) {
      return $$0.equals(this.c().get($$1));
   }

   public int b() {
      return this.a;
   }

   public Map<String, sy<?>> c() {
      return this.b;
   }

   public Map<String, tg> d() {
      return this.c;
   }
}
