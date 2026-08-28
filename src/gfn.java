import com.google.common.base.MoreObjects;
import java.util.List;

public class gfn {
   public static final int a = -1;
   private final List<gfl> b;
   private final int c;

   public gfn(List<gfl> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public gfl a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (gfl)MoreObjects.firstNonNull(this.b.get($$0), gfj.a) : gfj.a;
   }

   public int a() {
      return this.c;
   }
}
