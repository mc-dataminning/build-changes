import java.util.Arrays;

public class fvc extends fva {
   private static final xj a = xj.c("options.sounds.title");

   private static fkh<?>[] a(fki $$0) {
      return new fkh[]{$$0.Y(), $$0.Z()};
   }

   public fvc(frw $$0, fki $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d.a(this.c.b(awo.a));
      this.d.a(this.K());
      this.d.a(this.c.av());
      this.d.a(a(this.c));
   }

   private fkh<?>[] K() {
      return Arrays.stream(awo.values()).filter($$0 -> $$0 != awo.a).map($$0 -> this.c.b($$0)).toArray(fkh[]::new);
   }
}
