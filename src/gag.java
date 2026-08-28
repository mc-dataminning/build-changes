import com.google.common.base.MoreObjects;
import java.util.List;

public class gag {
   public static final int a = -1;
   private final List<gae> b;
   private final int c;

   public gag(List<gae> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public gae a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (gae)MoreObjects.firstNonNull(this.b.get($$0), gac.a) : gac.a;
   }

   public int a() {
      return this.c;
   }
}
