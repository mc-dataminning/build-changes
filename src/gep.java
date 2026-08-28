import com.google.common.base.MoreObjects;
import java.util.List;

public class gep {
   public static final int a = -1;
   private final List<gen> b;
   private final int c;

   public gep(List<gen> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public gen a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (gen)MoreObjects.firstNonNull(this.b.get($$0), gel.a) : gel.a;
   }

   public int a() {
      return this.c;
   }
}
