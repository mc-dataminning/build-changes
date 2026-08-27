import java.util.EnumMap;

public class fwb {
   public static final int a = 5000;
   private final fvx b;
   private final ffm c;
   private final EnumMap<bkn, Long> d;

   public fwb(fvx $$0, ffm $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(bkn.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(bkn.a);
      }
   }

   private void a(bkn $$0) {
      long $$1 = ac.b();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new agq($$0));
         this.d.put($$0, $$1);
      }
   }
}
