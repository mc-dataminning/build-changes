import java.util.EnumMap;

public class fya {
   public static final int a = 5000;
   private final fxw b;
   private final fhm c;
   private final EnumMap<blv, Long> d;

   public fya(fxw $$0, fhm $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(blv.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(blv.a);
      }
   }

   private void a(blv $$0) {
      long $$1 = ac.c();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new aho($$0));
         this.d.put($$0, $$1);
      }
   }
}
