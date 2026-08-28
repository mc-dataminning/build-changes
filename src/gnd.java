import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class gnd implements gne {
   public static final String a = "AND";
   private final Iterable<? extends gne> d;

   public gnd(Iterable<? extends gne> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dxo> getPredicate(dxp<dkd, dxo> $$0) {
      return ae.a(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
