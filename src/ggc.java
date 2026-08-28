import com.google.common.base.MoreObjects;
import java.util.List;

public class ggc {
   public static final int a = -1;
   private final List<gga> b;
   private final int c;

   public ggc(List<gga> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public gga a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (gga)MoreObjects.firstNonNull(this.b.get($$0), gfy.a) : gfy.a;
   }

   public int a() {
      return this.c;
   }
}
