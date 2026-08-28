import java.util.EnumMap;

public class fyq {
   public static final int a = 5000;
   private final fym b;
   private final fic c;
   private final EnumMap<bli, Long> d;

   public fyq(fym $$0, fic $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(bli.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(bli.a);
      }
   }

   private void a(bli $$0) {
      long $$1 = ac.c();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new agt($$0));
         this.d.put($$0, $$1);
      }
   }
}
