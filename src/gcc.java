import com.google.common.base.MoreObjects;
import java.util.List;

public class gcc {
   public static final int a = -1;
   private final List<gca> b;
   private final int c;

   public gcc(List<gca> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public gca a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (gca)MoreObjects.firstNonNull(this.b.get($$0), gby.a) : gby.a;
   }

   public int a() {
      return this.c;
   }
}
