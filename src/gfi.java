import com.google.common.collect.ImmutableList;
import java.util.function.UnaryOperator;

public class gfi {
   private final gfk a;

   public gfi() {
      this(new gfk(ImmutableList.of(), gfc.a));
   }

   private gfi(gfk $$0) {
      this.a = $$0;
   }

   public gfk a() {
      return this.a;
   }

   public gfi a(UnaryOperator<gfc> $$0) {
      return new gfi(this.a.a($$0));
   }
}
