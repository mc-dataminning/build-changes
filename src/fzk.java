import java.util.EnumMap;

public class fzk {
   public static final int a = 5000;
   private final fzg b;
   private final fiu c;
   private final EnumMap<bls, Long> d;

   public fzk(fzg $$0, fiu $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(bls.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(bls.a);
      }
   }

   private void a(bls $$0) {
      long $$1 = ad.c();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new aha($$0));
         this.d.put($$0, $$1);
      }
   }
}
