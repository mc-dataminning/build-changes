import java.util.EnumMap;

public class gif {
   public static final int a = 5000;
   private final gia b;
   private final fqv c;
   private final EnumMap<bom, Long> d;

   public gif(gia $$0, fqv $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(bom.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(bom.a);
      }
   }

   private void a(bom $$0) {
      long $$1 = af.c();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new ahf($$0));
         this.d.put($$0, $$1);
      }
   }
}
