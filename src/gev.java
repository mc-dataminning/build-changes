import com.google.common.collect.ImmutableList;
import java.util.function.UnaryOperator;

public class gev {
   private final gex a;

   public gev() {
      this(new gex(ImmutableList.of(), gep.a));
   }

   private gev(gex $$0) {
      this.a = $$0;
   }

   public gex a() {
      return this.a;
   }

   public gev a(UnaryOperator<gep> $$0) {
      return new gev(this.a.a($$0));
   }
}
