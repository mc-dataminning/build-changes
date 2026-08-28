import com.google.common.base.MoreObjects;
import java.util.List;

public class fvx {
   public static final int a = -1;
   private final List<fvv> b;
   private final int c;

   public fvx(List<fvv> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fvv a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fvv)MoreObjects.firstNonNull(this.b.get($$0), fvt.a) : fvt.a;
   }

   public int a() {
      return this.c;
   }
}
