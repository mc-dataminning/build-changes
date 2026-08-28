import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class goa implements gnx {
   public static final String a = "OR";
   private final Iterable<? extends gnx> d;

   public goa(Iterable<? extends gnx> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dwy> getPredicate(dwz<djn, dwy> $$0) {
      return af.b(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
