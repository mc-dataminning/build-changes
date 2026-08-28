import com.google.common.base.MoreObjects;
import java.util.List;

public class fvj {
   public static final int a = -1;
   private final List<fvh> b;
   private final int c;

   public fvj(List<fvh> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fvh a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fvh)MoreObjects.firstNonNull(this.b.get($$0), fvf.a) : fvf.a;
   }

   public int a() {
      return this.c;
   }
}
