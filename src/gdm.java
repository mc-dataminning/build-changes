import java.util.EnumMap;

public class gdm {
   public static final int a = 5000;
   private final gdi b;
   private final fml c;
   private final EnumMap<bnf, Long> d;

   public gdm(gdi $$0, fml $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(bnf.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(bnf.a);
      }
   }

   private void a(bnf $$0) {
      long $$1 = ae.c();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new ahp($$0));
         this.d.put($$0, $$1);
      }
   }
}
