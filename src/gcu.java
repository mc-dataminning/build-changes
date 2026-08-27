import com.google.common.collect.Streams;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class gcu implements gcr {
   public static final String a = "OR";
   private final Iterable<? extends gcr> d;

   public gcu(Iterable<? extends gcr> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dpy> getPredicate(dpz<dcv, dpy> $$0) {
      List<Predicate<dpy>> $$1 = Streams.stream(this.d).map($$1x -> $$1x.getPredicate($$0)).collect(Collectors.toList());
      return $$1x -> $$1.stream().anyMatch($$1xx -> $$1xx.test($$1x));
   }
}
