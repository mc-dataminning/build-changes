import com.google.common.base.MoreObjects;
import java.util.List;

public class gaf {
   public static final int a = -1;
   private final List<gad> b;
   private final int c;

   public gaf(List<gad> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public gad a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (gad)MoreObjects.firstNonNull(this.b.get($$0), gab.a) : gab.a;
   }

   public int a() {
      return this.c;
   }
}
