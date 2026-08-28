import java.util.EnumMap;

public class glu {
   public static final int a = 5000;
   private final glp b;
   private final fug c;
   private final EnumMap<bpo, Long> d;

   public glu(glp $$0, fug $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(bpo.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(bpo.a);
      }
   }

   private void a(bpo $$0) {
      long $$1 = ag.c();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new aht($$0));
         this.d.put($$0, $$1);
      }
   }
}
