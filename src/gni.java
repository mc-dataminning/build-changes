import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class gni implements gnj {
   public static final String a = "AND";
   private final Iterable<? extends gnj> d;

   public gni(Iterable<? extends gnj> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dxv> getPredicate(dxw<dkm, dxv> $$0) {
      return ae.a(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
