import java.util.Arrays;

public class gdl extends gdj {
   private static final xa a = xa.c("options.sounds.title");

   private static frg<?>[] a(frh $$0) {
      return new frg[]{$$0.Z(), $$0.aa()};
   }

   public gdl(gad $$0, frh $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d.a(this.c.b(awq.a));
      this.d.a(this.H());
      this.d.a(this.c.aw());
      this.d.a(a(this.c));
   }

   private frg<?>[] H() {
      return Arrays.stream(awq.values()).filter($$0 -> $$0 != awq.a).map($$0 -> this.c.b($$0)).toArray(frg[]::new);
   }
}
