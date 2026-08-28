import com.google.common.base.MoreObjects;
import java.util.List;

public class gah {
   public static final int a = -1;
   private final List<gaf> b;
   private final int c;

   public gah(List<gaf> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public gaf a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (gaf)MoreObjects.firstNonNull(this.b.get($$0), gad.a) : gad.a;
   }

   public int a() {
      return this.c;
   }
}
