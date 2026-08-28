import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class gnk implements gnh {
   public static final String a = "OR";
   private final Iterable<? extends gnh> d;

   public gnk(Iterable<? extends gnh> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dxu> getPredicate(dxv<dkl, dxu> $$0) {
      return ae.b(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
