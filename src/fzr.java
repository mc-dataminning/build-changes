import com.google.common.base.MoreObjects;
import java.util.List;

public class fzr {
   public static final int a = -1;
   private final List<fzp> b;
   private final int c;

   public fzr(List<fzp> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fzp a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fzp)MoreObjects.firstNonNull(this.b.get($$0), fzn.a) : fzn.a;
   }

   public int a() {
      return this.c;
   }
}
