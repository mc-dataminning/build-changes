import com.google.common.base.MoreObjects;
import java.util.List;

public class fzm {
   public static final int a = -1;
   private final List<fzk> b;
   private final int c;

   public fzm(List<fzk> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fzk a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fzk)MoreObjects.firstNonNull(this.b.get($$0), fzi.a) : fzi.a;
   }

   public int a() {
      return this.c;
   }
}
