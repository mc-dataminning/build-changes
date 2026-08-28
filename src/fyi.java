import java.util.EnumMap;

public class fyi {
   public static final int a = 5000;
   private final fye b;
   private final fhu c;
   private final EnumMap<ble, Long> d;

   public fyi(fye $$0, fhu $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(ble.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(ble.a);
      }
   }

   private void a(ble $$0) {
      long $$1 = ac.c();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new agt($$0));
         this.d.put($$0, $$1);
      }
   }
}
