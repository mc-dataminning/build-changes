import java.util.EnumMap;

public class fyc {
   public static final int a = 5000;
   private final fxy b;
   private final fho c;
   private final EnumMap<blx, Long> d;

   public fyc(fxy $$0, fho $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(blx.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(blx.a);
      }
   }

   private void a(blx $$0) {
      long $$1 = ac.c();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new aho($$0));
         this.d.put($$0, $$1);
      }
   }
}
