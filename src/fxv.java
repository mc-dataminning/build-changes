import java.util.EnumMap;

public class fxv {
   public static final int a = 5000;
   private final fxr b;
   private final fhh c;
   private final EnumMap<blq, Long> d;

   public fxv(fxr $$0, fhh $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(blq.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(blq.a);
      }
   }

   private void a(blq $$0) {
      long $$1 = ac.c();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new ahk($$0));
         this.d.put($$0, $$1);
      }
   }
}
