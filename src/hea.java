import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class hea extends hdk {
   private final brm<hdg> b;

   public hea(brm<hdg> $$0) {
      super($$0.e().getFirst().b());
      this.b = $$0;
   }

   @Override
   public List<gml> a(@Nullable dxn $$0, @Nullable jm $$1, bam $$2) {
      return this.b.a($$2).map($$3 -> $$3.a($$0, $$1, $$2)).orElse(Collections.emptyList());
   }
}
