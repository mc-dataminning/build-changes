import com.google.common.collect.ImmutableList;
import java.util.function.UnaryOperator;

public class gjc {
   private final gje a;

   public gjc() {
      this(new gje(ImmutableList.of(), giw.a));
   }

   private gjc(gje $$0) {
      this.a = $$0;
   }

   public gje a() {
      return this.a;
   }

   public gjc a(UnaryOperator<giw> $$0) {
      return new gjc(this.a.a($$0));
   }

   public gjc a(gjd $$0) {
      return $$0.apply(this);
   }
}
