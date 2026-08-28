import java.util.EnumMap;

public class gfq {
   public static final int a = 5000;
   private final gfl b;
   private final fon c;
   private final EnumMap<boe, Long> d;

   public gfq(gfl $$0, fon $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(boe.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(boe.a);
      }
   }

   private void a(boe $$0) {
      long $$1 = ae.c();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new aif($$0));
         this.d.put($$0, $$1);
      }
   }
}
