import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class hao extends gzy {
   private final bqg<gzu> b;

   public hao(bqg<gzu> $$0) {
      super($$0.e().getFirst().b());
      this.b = $$0;
   }

   @Override
   public List<gjd> a(@Nullable dvd $$0, @Nullable jl $$1, azr $$2) {
      return this.b.a($$2).map($$3 -> $$3.a($$0, $$1, $$2)).orElse(Collections.emptyList());
   }
}
