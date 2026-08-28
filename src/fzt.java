import com.google.common.base.MoreObjects;
import java.util.List;

public class fzt {
   public static final int a = -1;
   private final List<fzr> b;
   private final int c;

   public fzt(List<fzr> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fzr a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fzr)MoreObjects.firstNonNull(this.b.get($$0), fzp.a) : fzp.a;
   }

   public int a() {
      return this.c;
   }
}
