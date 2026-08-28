import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class gnf implements gnc {
   public static final String a = "OR";
   private final Iterable<? extends gnc> d;

   public gnf(Iterable<? extends gnc> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dxn> getPredicate(dxo<dke, dxn> $$0) {
      return ae.b(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
