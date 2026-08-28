import java.util.function.Function;

public abstract class fwa {
   protected final Function<akq, gfb> v;

   public fwa(Function<akq, gfb> $$0) {
      this.v = $$0;
   }

   public final gfb a(akq $$0) {
      return this.v.apply($$0);
   }

   public abstract void a(fbc var1, fbg var2, int var3, int var4, int var5);

   public final void a(fbc $$0, fbg $$1, int $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, -1);
   }
}
