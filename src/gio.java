import com.google.common.collect.ImmutableList;
import java.util.function.UnaryOperator;

public class gio {
   private final giq a;

   public gio() {
      this(new giq(ImmutableList.of(), gii.a));
   }

   private gio(giq $$0) {
      this.a = $$0;
   }

   public giq a() {
      return this.a;
   }

   public gio a(UnaryOperator<gii> $$0) {
      return new gio(this.a.a($$0));
   }

   public gio a(gip $$0) {
      return $$0.apply(this);
   }
}
