import java.util.EnumMap;

public class gfo {
   public static final int a = 5000;
   private final gfj b;
   private final fol c;
   private final EnumMap<bod, Long> d;

   public gfo(gfj $$0, fol $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(bod.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(bod.a);
      }
   }

   private void a(bod $$0) {
      long $$1 = ae.c();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new aif($$0));
         this.d.put($$0, $$1);
      }
   }
}
