import java.util.EnumMap;

public class fuv {
   public static final int a = 5000;
   private final fur b;
   private final feg c;
   private final EnumMap<bka, Long> d;

   public fuv(fur $$0, feg $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(bka.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(bka.a);
      }
   }

   private void a(bka $$0) {
      long $$1 = ac.b();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new age($$0));
         this.d.put($$0, $$1);
      }
   }
}
