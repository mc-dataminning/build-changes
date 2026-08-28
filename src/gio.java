import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class gio implements gip {
   public static final String a = "AND";
   private final Iterable<? extends gip> d;

   public gio(Iterable<? extends gip> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dua> getPredicate(dub<dgv, dua> $$0) {
      return ad.a(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
