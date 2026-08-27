import java.util.EnumMap;

public class fum {
   public static final int a = 5000;
   private final fui b;
   private final fdx c;
   private final EnumMap<bjv, Long> d;

   public fum(fui $$0, fdx $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(bjv.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(bjv.a);
      }
   }

   private void a(bjv $$0) {
      long $$1 = ac.b();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new agc($$0));
         this.d.put($$0, $$1);
      }
   }
}
