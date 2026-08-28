import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class gnb implements gnc {
   public static final String a = "AND";
   private final Iterable<? extends gnc> d;

   public gnb(Iterable<? extends gnc> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dxn> getPredicate(dxo<dke, dxn> $$0) {
      return ae.a(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
