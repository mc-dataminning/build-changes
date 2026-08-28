import com.google.common.base.MoreObjects;
import java.util.List;

public class fxr {
   public static final int a = -1;
   private final List<fxp> b;
   private final int c;

   public fxr(List<fxp> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fxp a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fxp)MoreObjects.firstNonNull(this.b.get($$0), fxn.a) : fxn.a;
   }

   public int a() {
      return this.c;
   }
}
