import com.google.common.collect.ImmutableList;
import java.util.function.UnaryOperator;

public class glo {
   private final glq a;

   public glo() {
      this(new glq(ImmutableList.of(), gli.a));
   }

   private glo(glq $$0) {
      this.a = $$0;
   }

   public glq a() {
      return this.a;
   }

   public glo a(UnaryOperator<gli> $$0) {
      return new glo(this.a.a($$0));
   }

   public glo a(glp $$0) {
      return $$0.apply(this);
   }
}
