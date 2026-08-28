import java.util.EnumMap;

public class gge {
   public static final int a = 5000;
   private final gfz b;
   private final fpa c;
   private final EnumMap<bnd, Long> d;

   public gge(gfz $$0, fpa $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(bnd.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(bnd.a);
      }
   }

   private void a(bnd $$0) {
      long $$1 = af.c();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new agy($$0));
         this.d.put($$0, $$1);
      }
   }
}
