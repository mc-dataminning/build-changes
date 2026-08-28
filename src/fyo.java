import java.util.EnumMap;

public class fyo {
   public static final int a = 5000;
   private final fyk b;
   private final fia c;
   private final EnumMap<blh, Long> d;

   public fyo(fyk $$0, fia $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(blh.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(blh.a);
      }
   }

   private void a(blh $$0) {
      long $$1 = ac.c();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new agt($$0));
         this.d.put($$0, $$1);
      }
   }
}
