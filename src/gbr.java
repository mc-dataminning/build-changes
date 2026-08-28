import java.util.EnumMap;

public class gbr {
   public static final int a = 5000;
   private final gbn b;
   private final fkw c;
   private final EnumMap<bms, Long> d;

   public gbr(gbn $$0, fkw $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(bms.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(bms.a);
      }
   }

   private void a(bms $$0) {
      long $$1 = ad.c();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new ahk($$0));
         this.d.put($$0, $$1);
      }
   }
}
