import java.util.EnumMap;

public class fxy {
   public static final int a = 5000;
   private final fxu b;
   private final fhk c;
   private final EnumMap<blt, Long> d;

   public fxy(fxu $$0, fhk $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(blt.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(blt.a);
      }
   }

   private void a(blt $$0) {
      long $$1 = ac.c();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new ahn($$0));
         this.d.put($$0, $$1);
      }
   }
}
