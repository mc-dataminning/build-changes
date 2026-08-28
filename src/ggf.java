import java.util.EnumMap;

public class ggf {
   public static final int a = 5000;
   private final gga b;
   private final fpb c;
   private final EnumMap<bne, Long> d;

   public ggf(gga $$0, fpb $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(bne.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(bne.a);
      }
   }

   private void a(bne $$0) {
      long $$1 = af.c();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new agz($$0));
         this.d.put($$0, $$1);
      }
   }
}
