import java.util.EnumMap;

public class gmj {
   public static final int a = 5000;
   private final gme b;
   private final fuv c;
   private final EnumMap<bpf, Long> d;

   public gmj(gme $$0, fuv $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(bpf.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(bpf.a);
      }
   }

   private void a(bpf $$0) {
      long $$1 = ag.c();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new ahm($$0));
         this.d.put($$0, $$1);
      }
   }
}
