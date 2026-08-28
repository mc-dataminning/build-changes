import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class gnm implements gnj {
   public static final String a = "OR";
   private final Iterable<? extends gnj> d;

   public gnm(Iterable<? extends gnj> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dxv> getPredicate(dxw<dkm, dxv> $$0) {
      return ae.b(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
