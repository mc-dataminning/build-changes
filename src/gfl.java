import com.google.common.collect.ImmutableList;
import java.util.function.UnaryOperator;

public class gfl {
   private final gfn a;

   public gfl() {
      this(new gfn(ImmutableList.of(), gff.a));
   }

   private gfl(gfn $$0) {
      this.a = $$0;
   }

   public gfn a() {
      return this.a;
   }

   public gfl a(UnaryOperator<gff> $$0) {
      return new gfl(this.a.a($$0));
   }
}
