import com.google.common.base.MoreObjects;
import java.util.List;

public class fwi {
   public static final int a = -1;
   private final List<fwg> b;
   private final int c;

   public fwi(List<fwg> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fwg a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fwg)MoreObjects.firstNonNull(this.b.get($$0), fwe.a) : fwe.a;
   }

   public int a() {
      return this.c;
   }
}
