import java.util.EnumMap;

public class fxz {
   public static final int a = 5000;
   private final fxv b;
   private final fhl c;
   private final EnumMap<blu, Long> d;

   public fxz(fxv $$0, fhl $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(blu.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(blu.a);
      }
   }

   private void a(blu $$0) {
      long $$1 = ac.c();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new ahn($$0));
         this.d.put($$0, $$1);
      }
   }
}
