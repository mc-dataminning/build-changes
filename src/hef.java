import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class hef extends hdp {
   private final brq<hdl> b;

   public hef(brq<hdl> $$0) {
      super($$0.e().getFirst().b());
      this.b = $$0;
   }

   @Override
   public List<gmq> a(@Nullable dxu $$0, @Nullable jm $$1, bam $$2) {
      return this.b.a($$2).map($$3 -> $$3.a($$0, $$1, $$2)).orElse(Collections.emptyList());
   }
}
