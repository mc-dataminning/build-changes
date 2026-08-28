import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class gjx implements gju {
   public static final String a = "OR";
   private final Iterable<? extends gju> d;

   public gjx(Iterable<? extends gju> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dvd> getPredicate(dve<dhy, dvd> $$0) {
      return ad.b(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
