import java.util.EnumMap;

public class gfp {
   public static final int a = 5000;
   private final gfk b;
   private final fom c;
   private final EnumMap<bod, Long> d;

   public gfp(gfk $$0, fom $$1) {
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
