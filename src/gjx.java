import java.util.EnumMap;

public class gjx {
   public static final int a = 5000;
   private final gjs b;
   private final fsk c;
   private final EnumMap<box, Long> d;

   public gjx(gjs $$0, fsk $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(box.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(box.a);
      }
   }

   private void a(box $$0) {
      long $$1 = af.c();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new ahi($$0));
         this.d.put($$0, $$1);
      }
   }
}
