import com.google.common.collect.ImmutableList;
import java.util.function.UnaryOperator;

public class gkz {
   private final glb a;

   public gkz() {
      this(new glb(ImmutableList.of(), gkt.a));
   }

   private gkz(glb $$0) {
      this.a = $$0;
   }

   public glb a() {
      return this.a;
   }

   public gkz a(UnaryOperator<gkt> $$0) {
      return new gkz(this.a.a($$0));
   }

   public gkz a(gla $$0) {
      return $$0.apply(this);
   }
}
