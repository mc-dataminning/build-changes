import com.google.common.collect.ImmutableList;
import java.util.function.UnaryOperator;

public class ghl {
   private final ghn a;

   public ghl() {
      this(new ghn(ImmutableList.of(), ghf.a));
   }

   private ghl(ghn $$0) {
      this.a = $$0;
   }

   public ghn a() {
      return this.a;
   }

   public ghl a(UnaryOperator<ghf> $$0) {
      return new ghl(this.a.a($$0));
   }

   public ghl a(ghm $$0) {
      return $$0.apply(this);
   }
}
