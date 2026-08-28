import java.util.EnumMap;

public class gfl {
   public static final int a = 5000;
   private final gfg b;
   private final fog c;
   private final EnumMap<bnu, Long> d;

   public gfl(gfg $$0, fog $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(bnu.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(bnu.a);
      }
   }

   private void a(bnu $$0) {
      long $$1 = ae.c();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new ahu($$0));
         this.d.put($$0, $$1);
      }
   }
}
