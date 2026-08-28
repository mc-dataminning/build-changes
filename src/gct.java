import com.google.common.collect.ImmutableList;
import java.util.function.UnaryOperator;

public class gct {
   private final gcv a;

   public gct() {
      this(new gcv(ImmutableList.of(), gcn.a));
   }

   private gct(gcv $$0) {
      this.a = $$0;
   }

   public gcv a() {
      return this.a;
   }

   public gct a(UnaryOperator<gcn> $$0) {
      return new gct(this.a.a($$0));
   }
}
