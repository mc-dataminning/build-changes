import com.google.common.collect.ImmutableList;
import java.util.function.UnaryOperator;

public class gjk {
   private final gjm a;

   public gjk() {
      this(new gjm(ImmutableList.of(), gje.a));
   }

   private gjk(gjm $$0) {
      this.a = $$0;
   }

   public gjm a() {
      return this.a;
   }

   public gjk a(UnaryOperator<gje> $$0) {
      return new gjk(this.a.a($$0));
   }

   public gjk a(gjl $$0) {
      return $$0.apply(this);
   }
}
