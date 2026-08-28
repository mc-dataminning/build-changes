import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class gnw implements gnx {
   public static final String a = "AND";
   private final Iterable<? extends gnx> d;

   public gnw(Iterable<? extends gnx> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dwy> getPredicate(dwz<djn, dwy> $$0) {
      return af.a(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
