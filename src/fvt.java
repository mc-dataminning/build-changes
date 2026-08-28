import com.google.common.base.MoreObjects;
import java.util.List;

public class fvt {
   public static final int a = -1;
   private final List<fvr> b;
   private final int c;

   public fvt(List<fvr> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fvr a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fvr)MoreObjects.firstNonNull(this.b.get($$0), fvp.a) : fvp.a;
   }

   public int a() {
      return this.c;
   }
}
