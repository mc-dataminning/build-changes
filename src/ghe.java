import java.util.EnumMap;

public class ghe {
   public static final int a = 5000;
   private final ggz b;
   private final fpy c;
   private final EnumMap<bnu, Long> d;

   public ghe(ggz $$0, fpy $$1) {
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
      long $$1 = af.c();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new agy($$0));
         this.d.put($$0, $$1);
      }
   }
}
