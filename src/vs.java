import java.util.HashMap;
import java.util.Map;

public record vs(int a, Map<String, vk<?>> b, Map<String, vs> c) {
   private vs(int $$0) {
      this($$0, new HashMap<>(), new HashMap<>());
   }

   public static vs a() {
      return new vs(1);
   }

   public void a(vr $$0) {
      if (this.a <= $$0.a().size()) {
         this.c.computeIfAbsent($$0.a().get(this.a - 1), $$0x -> new vs(this.a + 1)).a($$0);
      } else {
         this.b.put($$0.c(), $$0.b());
      }
   }

   public boolean a(vk<?> $$0, String $$1) {
      return $$0.equals(this.c().get($$1));
   }

   public int b() {
      return this.a;
   }

   public Map<String, vk<?>> c() {
      return this.b;
   }

   public Map<String, vs> d() {
      return this.c;
   }
}
