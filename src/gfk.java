import com.google.common.collect.ImmutableList;
import java.util.function.UnaryOperator;

public class gfk {
   private final gfm a;

   public gfk() {
      this(new gfm(ImmutableList.of(), gfe.a));
   }

   private gfk(gfm $$0) {
      this.a = $$0;
   }

   public gfm a() {
      return this.a;
   }

   public gfk a(UnaryOperator<gfe> $$0) {
      return new gfk(this.a.a($$0));
   }
}
