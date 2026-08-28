import java.util.EnumMap;

public class gkf {
   public static final int a = 5000;
   private final gka b;
   private final fsr c;
   private final EnumMap<boz, Long> d;

   public gkf(gka $$0, fsr $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(boz.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(boz.a);
      }
   }

   private void a(boz $$0) {
      long $$1 = af.c();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new ahi($$0));
         this.d.put($$0, $$1);
      }
   }
}
