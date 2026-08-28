import com.google.common.base.MoreObjects;
import java.util.List;

public class gek {
   public static final int a = -1;
   private final List<gei> b;
   private final int c;

   public gek(List<gei> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public gei a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (gei)MoreObjects.firstNonNull(this.b.get($$0), geg.a) : geg.a;
   }

   public int a() {
      return this.c;
   }
}
