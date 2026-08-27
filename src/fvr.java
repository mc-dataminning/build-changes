import java.util.EnumMap;

public class fvr {
   public static final int a = 5000;
   private final fvn b;
   private final ffc c;
   private final EnumMap<bkl, Long> d;

   public fvr(fvn $$0, ffc $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(bkl.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(bkl.a);
      }
   }

   private void a(bkl $$0) {
      long $$1 = ac.b();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new ago($$0));
         this.d.put($$0, $$1);
      }
   }
}
