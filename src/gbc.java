import java.util.EnumMap;

public class gbc {
   public static final int a = 5000;
   private final gay b;
   private final fki c;
   private final EnumMap<bml, Long> d;

   public gbc(gay $$0, fki $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(bml.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(bml.a);
      }
   }

   private void a(bml $$0) {
      long $$1 = ad.c();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new ahj($$0));
         this.d.put($$0, $$1);
      }
   }
}
