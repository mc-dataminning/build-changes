import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class grt implements grq {
   public static final String a = "OR";
   private final Iterable<? extends grq> d;

   public grt(Iterable<? extends grq> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dzz> getPredicate(eaa<dma, dzz> $$0) {
      return af.b(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
