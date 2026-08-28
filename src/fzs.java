import com.google.common.base.MoreObjects;
import java.util.List;

public class fzs {
   public static final int a = -1;
   private final List<fzq> b;
   private final int c;

   public fzs(List<fzq> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fzq a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fzq)MoreObjects.firstNonNull(this.b.get($$0), fzo.a) : fzo.a;
   }

   public int a() {
      return this.c;
   }
}
