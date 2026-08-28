import com.google.common.base.MoreObjects;
import java.util.List;

public class fxj {
   public static final int a = -1;
   private final List<fxh> b;
   private final int c;

   public fxj(List<fxh> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fxh a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fxh)MoreObjects.firstNonNull(this.b.get($$0), fxf.a) : fxf.a;
   }

   public int a() {
      return this.c;
   }
}
