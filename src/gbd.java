import com.google.common.base.MoreObjects;
import java.util.List;

public class gbd {
   public static final int a = -1;
   private final List<gbb> b;
   private final int c;

   public gbd(List<gbb> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public gbb a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (gbb)MoreObjects.firstNonNull(this.b.get($$0), gaz.a) : gaz.a;
   }

   public int a() {
      return this.c;
   }
}
