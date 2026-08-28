import java.util.EnumMap;

public class ggc {
   public static final int a = 5000;
   private final gfx b;
   private final foy c;
   private final EnumMap<bnc, Long> d;

   public ggc(gfx $$0, foy $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(bnc.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(bnc.a);
      }
   }

   private void a(bnc $$0) {
      long $$1 = af.c();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new agy($$0));
         this.d.put($$0, $$1);
      }
   }
}
