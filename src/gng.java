import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class gng implements gnh {
   public static final String a = "AND";
   private final Iterable<? extends gnh> d;

   public gng(Iterable<? extends gnh> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dxu> getPredicate(dxv<dkl, dxu> $$0) {
      return ae.a(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
