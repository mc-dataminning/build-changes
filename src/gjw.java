import com.google.common.collect.ImmutableList;
import java.util.function.UnaryOperator;

public class gjw {
   private final gjy a;

   public gjw() {
      this(new gjy(ImmutableList.of(), gjq.a));
   }

   private gjw(gjy $$0) {
      this.a = $$0;
   }

   public gjy a() {
      return this.a;
   }

   public gjw a(UnaryOperator<gjq> $$0) {
      return new gjw(this.a.a($$0));
   }

   public gjw a(gjx $$0) {
      return $$0.apply(this);
   }
}
