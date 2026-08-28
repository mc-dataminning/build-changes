import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class hhi extends hgp {
   private final bqq<hgm> b;

   public hhi(bqq<hgm> $$0) {
      super($$0.e().getFirst().b());
      this.b = $$0;
   }

   @Override
   public List<gnc> a(@Nullable dwv $$0, @Nullable jn $$1, azg $$2) {
      return this.b.a($$2).map($$3 -> $$3.a($$0, $$1, $$2)).orElse(Collections.emptyList());
   }
}
