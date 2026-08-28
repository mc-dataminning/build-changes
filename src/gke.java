import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class gke implements gkf {
   public static final String a = "AND";
   private final Iterable<? extends gkf> d;

   public gke(Iterable<? extends gkf> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dvj> getPredicate(dvk<die, dvj> $$0) {
      return ae.a(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
