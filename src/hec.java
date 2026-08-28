import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class hec extends hdm {
   private final bri<hdi> b;

   public hec(bri<hdi> $$0) {
      super($$0.e().getFirst().b());
      this.b = $$0;
   }

   @Override
   public List<gmn> a(@Nullable dxo $$0, @Nullable jm $$1, bac $$2) {
      return this.b.a($$2).map($$3 -> $$3.a($$0, $$1, $$2)).orElse(Collections.emptyList());
   }
}
