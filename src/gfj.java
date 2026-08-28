import java.util.EnumMap;

public class gfj {
   public static final int a = 5000;
   private final gfe b;
   private final fog c;
   private final EnumMap<bnz, Long> d;

   public gfj(gfe $$0, fog $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(bnz.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(bnz.a);
      }
   }

   private void a(bnz $$0) {
      long $$1 = ae.c();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new aif($$0));
         this.d.put($$0, $$1);
      }
   }
}
