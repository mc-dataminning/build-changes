import java.util.EnumMap;

public class fww {
   public static final int a = 5000;
   private final fws b;
   private final fgi c;
   private final EnumMap<bkx, Long> d;

   public fww(fws $$0, fgi $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(bkx.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(bkx.a);
      }
   }

   private void a(bkx $$0) {
      long $$1 = ac.c();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new agw($$0));
         this.d.put($$0, $$1);
      }
   }
}
