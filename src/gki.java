import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class gki implements gkf {
   public static final String a = "OR";
   private final Iterable<? extends gkf> d;

   public gki(Iterable<? extends gkf> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dvj> getPredicate(dvk<die, dvj> $$0) {
      return ae.b(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
