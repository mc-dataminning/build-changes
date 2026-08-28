import java.util.EnumMap;

public class gmh {
   public static final int a = 5000;
   private final gmc b;
   private final fut c;
   private final EnumMap<bpd, Long> d;

   public gmh(gmc $$0, fut $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(bpd.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(bpd.a);
      }
   }

   private void a(bpd $$0) {
      long $$1 = ag.c();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new ahk($$0));
         this.d.put($$0, $$1);
      }
   }
}
