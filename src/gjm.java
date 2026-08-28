import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class gjm implements gjj {
   public static final String a = "OR";
   private final Iterable<? extends gjj> d;

   public gjm(Iterable<? extends gjj> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dus> getPredicate(dut<dhm, dus> $$0) {
      return ad.b(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
