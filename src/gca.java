import java.util.Arrays;

public class gca extends gby {
   private static final wy a = wy.c("options.sounds.title");

   private static fpw<?>[] a(fpx $$0) {
      return new fpw[]{$$0.Z(), $$0.aa()};
   }

   public gca(fys $$0, fpx $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d.a(this.c.b(awo.a));
      this.d.a(this.H());
      this.d.a(this.c.aw());
      this.d.a(a(this.c));
   }

   private fpw<?>[] H() {
      return Arrays.stream(awo.values()).filter($$0 -> $$0 != awo.a).map($$0 -> this.c.b($$0)).toArray(fpw[]::new);
   }
}
