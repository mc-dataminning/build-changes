import java.util.EnumMap;

public class fzs {
   public static final int a = 5000;
   private final fzo b;
   private final fiv c;
   private final EnumMap<blb, Long> d;

   public fzs(fzo $$0, fiv $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(blb.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(blb.a);
      }
   }

   private void a(blb $$0) {
      long $$1 = ad.b();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new ahc($$0));
         this.d.put($$0, $$1);
      }
   }
}
