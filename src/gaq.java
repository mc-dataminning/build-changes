import java.util.Arrays;

public class gaq extends gao {
   private static final ww a = ww.c("options.sounds.title");

   private static foi<?>[] a(foj $$0) {
      return new foi[]{$$0.Z(), $$0.aa()};
   }

   public gaq(fxi $$0, foj $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d.a(this.c.b(awm.a));
      this.d.a(this.H());
      this.d.a(this.c.aw());
      this.d.a(a(this.c));
   }

   private foi<?>[] H() {
      return Arrays.stream(awm.values()).filter($$0 -> $$0 != awm.a).map($$0 -> this.c.b($$0)).toArray(foi[]::new);
   }
}
