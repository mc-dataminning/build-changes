import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class gnh implements gne {
   public static final String a = "OR";
   private final Iterable<? extends gne> d;

   public gnh(Iterable<? extends gne> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dxo> getPredicate(dxp<dkd, dxo> $$0) {
      return ae.b(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
