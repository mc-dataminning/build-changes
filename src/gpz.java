import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class gpz implements gpw {
   public static final String a = "OR";
   private final Iterable<? extends gpw> d;

   public gpz(Iterable<? extends gpw> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dym> getPredicate(dyn<dku, dym> $$0) {
      return af.b(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
