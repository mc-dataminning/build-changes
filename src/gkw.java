import java.util.EnumMap;

public class gkw {
   public static final int a = 5000;
   private final gkr b;
   private final fti c;
   private final EnumMap<bpb, Long> d;

   public gkw(gkr $$0, fti $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(bpb.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(bpb.a);
      }
   }

   private void a(bpb $$0) {
      long $$1 = ag.c();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new ahi($$0));
         this.d.put($$0, $$1);
      }
   }
}
