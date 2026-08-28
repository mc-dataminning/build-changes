import com.google.common.collect.ImmutableList;
import java.util.function.UnaryOperator;

public class gfm {
   private final gfo a;

   public gfm() {
      this(new gfo(ImmutableList.of(), gfg.a));
   }

   private gfm(gfo $$0) {
      this.a = $$0;
   }

   public gfo a() {
      return this.a;
   }

   public gfm a(UnaryOperator<gfg> $$0) {
      return new gfm(this.a.a($$0));
   }
}
