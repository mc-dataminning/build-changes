import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class gji implements gjj {
   public static final String a = "AND";
   private final Iterable<? extends gjj> d;

   public gji(Iterable<? extends gjj> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dus> getPredicate(dut<dhm, dus> $$0) {
      return ad.a(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
