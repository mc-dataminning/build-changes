import com.google.common.base.MoreObjects;
import java.util.List;

public class gdf {
   public static final int a = -1;
   private final List<gdd> b;
   private final int c;

   public gdf(List<gdd> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public gdd a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (gdd)MoreObjects.firstNonNull(this.b.get($$0), gdb.a) : gdb.a;
   }

   public int a() {
      return this.c;
   }
}
