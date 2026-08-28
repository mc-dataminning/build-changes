import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class hca extends hbk {
   private final bqs<hbg> b;

   public hca(bqs<hbg> $$0) {
      super($$0.e().getFirst().b());
      this.b = $$0;
   }

   @Override
   public List<gkn> a(@Nullable dvv $$0, @Nullable jm $$1, azu $$2) {
      return this.b.a($$2).map($$3 -> $$3.a($$0, $$1, $$2)).orElse(Collections.emptyList());
   }
}
