import com.google.common.base.MoreObjects;
import java.util.List;

public class fwt {
   public static final int a = -1;
   private final List<fwr> b;
   private final int c;

   public fwt(List<fwr> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fwr a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fwr)MoreObjects.firstNonNull(this.b.get($$0), fwp.a) : fwp.a;
   }

   public int a() {
      return this.c;
   }
}
