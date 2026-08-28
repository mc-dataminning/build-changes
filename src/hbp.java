import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class hbp extends haz {
   private final bqp<hav> b;

   public hbp(bqp<hav> $$0) {
      super($$0.e().getFirst().b());
      this.b = $$0;
   }

   @Override
   public List<gke> a(@Nullable dvo $$0, @Nullable jm $$1, azv $$2) {
      return this.b.a($$2).map($$3 -> $$3.a($$0, $$1, $$2)).orElse(Collections.emptyList());
   }
}
