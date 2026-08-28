import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class gnh implements gni {
   public static final String a = "AND";
   private final Iterable<? extends gni> d;

   public gnh(Iterable<? extends gni> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dxu> getPredicate(dxv<dkl, dxu> $$0) {
      return ae.a(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
