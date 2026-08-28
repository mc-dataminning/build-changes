import com.google.common.collect.ImmutableList;
import java.util.function.UnaryOperator;

public class gkb {
   private final gkd a;

   public gkb() {
      this(new gkd(ImmutableList.of(), gjv.a));
   }

   private gkb(gkd $$0) {
      this.a = $$0;
   }

   public gkd a() {
      return this.a;
   }

   public gkb a(UnaryOperator<gjv> $$0) {
      return new gkb(this.a.a($$0));
   }

   public gkb a(gkc $$0) {
      return $$0.apply(this);
   }
}
