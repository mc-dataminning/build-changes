import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class gnw implements gnt {
   public static final String a = "OR";
   private final Iterable<? extends gnt> d;

   public gnw(Iterable<? extends gnt> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dwv> getPredicate(dww<djk, dwv> $$0) {
      return af.b(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
