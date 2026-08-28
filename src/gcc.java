import java.util.EnumMap;

public class gcc {
   public static final int a = 5000;
   private final gby b;
   private final flh c;
   private final EnumMap<bmw, Long> d;

   public gcc(gby $$0, flh $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(bmw.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(bmw.a);
      }
   }

   private void a(bmw $$0) {
      long $$1 = ad.c();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new ahn($$0));
         this.d.put($$0, $$1);
      }
   }
}
