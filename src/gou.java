import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class gou implements gov {
   public static final String a = "AND";
   private final Iterable<? extends gov> d;

   public gou(Iterable<? extends gov> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dxq> getPredicate(dxr<dke, dxq> $$0) {
      return af.a(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
