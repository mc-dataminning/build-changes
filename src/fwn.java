import java.util.function.Function;

public abstract class fwn {
   protected final Function<akt, gfo> v;

   public fwn(Function<akt, gfo> $$0) {
      this.v = $$0;
   }

   public final gfo a(akt $$0) {
      return this.v.apply($$0);
   }

   public abstract void a(fbc var1, fbg var2, int var3, int var4, float var5, float var6, float var7, float var8);
}
