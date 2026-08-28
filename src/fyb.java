import java.util.EnumMap;

public class fyb {
   public static final int a = 5000;
   private final fxx b;
   private final fhn c;
   private final EnumMap<blw, Long> d;

   public fyb(fxx $$0, fhn $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(blw.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(blw.a);
      }
   }

   private void a(blw $$0) {
      long $$1 = ac.c();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new aho($$0));
         this.d.put($$0, $$1);
      }
   }
}
