import com.google.common.collect.ImmutableList;
import java.util.function.UnaryOperator;

public class gbu {
   private final gbw a;

   public gbu() {
      this(new gbw(ImmutableList.of(), gbo.a));
   }

   private gbu(gbw $$0) {
      this.a = $$0;
   }

   public gbw a() {
      return this.a;
   }

   public gbu a(UnaryOperator<gbo> $$0) {
      return new gbu(this.a.a($$0));
   }
}
