import java.util.EnumMap;

public class gbm {
   public static final int a = 5000;
   private final gbi b;
   private final fks c;
   private final EnumMap<bmp, Long> d;

   public gbm(gbi $$0, fks $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(bmp.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(bmp.a);
      }
   }

   private void a(bmp $$0) {
      long $$1 = ad.c();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new ahj($$0));
         this.d.put($$0, $$1);
      }
   }
}
