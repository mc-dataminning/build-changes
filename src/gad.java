import com.google.common.base.MoreObjects;
import java.util.List;

public class gad {
   public static final int a = -1;
   private final List<gab> b;
   private final int c;

   public gad(List<gab> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public gab a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (gab)MoreObjects.firstNonNull(this.b.get($$0), fzz.a) : fzz.a;
   }

   public int a() {
      return this.c;
   }
}
