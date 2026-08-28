import java.util.EnumMap;

public class fze {
   public static final int a = 5000;
   private final fza b;
   private final fio c;
   private final EnumMap<blr, Long> d;

   public fze(fza $$0, fio $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(blr.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(blr.a);
      }
   }

   private void a(blr $$0) {
      long $$1 = ad.c();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new agz($$0));
         this.d.put($$0, $$1);
      }
   }
}
