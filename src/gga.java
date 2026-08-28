import com.google.common.base.MoreObjects;
import java.util.List;

public class gga {
   public static final int a = -1;
   private final List<gfy> b;
   private final int c;

   public gga(List<gfy> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public gfy a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (gfy)MoreObjects.firstNonNull(this.b.get($$0), gfw.a) : gfw.a;
   }

   public int a() {
      return this.c;
   }
}
