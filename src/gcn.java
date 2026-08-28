import java.util.EnumMap;

public class gcn {
   public static final int a = 5000;
   private final gcj b;
   private final flp c;
   private final EnumMap<bmy, Long> d;

   public gcn(gcj $$0, flp $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(bmy.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(bmy.a);
      }
   }

   private void a(bmy $$0) {
      long $$1 = ae.c();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new aho($$0));
         this.d.put($$0, $$1);
      }
   }
}
