import java.util.EnumMap;

public class fww {
   public static final int a = 5000;
   private final fws b;
   private final fgh c;
   private final EnumMap<bkv, Long> d;

   public fww(fws $$0, fgh $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(bkv.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(bkv.a);
      }
   }

   private void a(bkv $$0) {
      long $$1 = ac.c();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new agv($$0));
         this.d.put($$0, $$1);
      }
   }
}
