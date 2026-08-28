import com.google.common.base.MoreObjects;
import java.util.List;

public class gdr {
   public static final int a = -1;
   private final List<gdp> b;
   private final int c;

   public gdr(List<gdp> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public gdp a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (gdp)MoreObjects.firstNonNull(this.b.get($$0), gdn.a) : gdn.a;
   }

   public int a() {
      return this.c;
   }
}
