import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class hho extends hgw {
   private final bqs<hgs> b;

   public hho(bqs<hgs> $$0) {
      super($$0.e().getFirst().b());
      this.b = $$0;
   }

   @Override
   public List<gnf> a(@Nullable dwx $$0, @Nullable jn $$1, azh $$2) {
      return this.b.a($$2).map($$3 -> $$3.a($$0, $$1, $$2)).orElse(Collections.emptyList());
   }
}
