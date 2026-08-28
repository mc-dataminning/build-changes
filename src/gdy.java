import com.google.common.base.MoreObjects;
import java.util.List;

public class gdy {
   public static final int a = -1;
   private final List<gdw> b;
   private final int c;

   public gdy(List<gdw> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public gdw a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (gdw)MoreObjects.firstNonNull(this.b.get($$0), gdu.a) : gdu.a;
   }

   public int a() {
      return this.c;
   }
}
