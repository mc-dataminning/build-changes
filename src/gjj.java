import java.util.EnumMap;

public class gjj {
   public static final int a = 5000;
   private final gje b;
   private final fry c;
   private final EnumMap<bou, Long> d;

   public gjj(gje $$0, fry $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(bou.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(bou.a);
      }
   }

   private void a(bou $$0) {
      long $$1 = af.c();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new ahg($$0));
         this.d.put($$0, $$1);
      }
   }
}
