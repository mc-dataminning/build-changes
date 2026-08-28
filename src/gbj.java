import com.google.common.collect.ImmutableList;
import java.util.function.UnaryOperator;

public class gbj {
   private final gbl a;

   public gbj() {
      this(new gbl(ImmutableList.of(), gbd.a));
   }

   private gbj(gbl $$0) {
      this.a = $$0;
   }

   public gbl a() {
      return this.a;
   }

   public gbj a(UnaryOperator<gbd> $$0) {
      return new gbj(this.a.a($$0));
   }
}
