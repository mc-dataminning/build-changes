import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class haz extends haj {
   private final bql<haf> b;

   public haz(bql<haf> $$0) {
      super($$0.e().getFirst().b());
      this.b = $$0;
   }

   @Override
   public List<gjo> a(@Nullable dvj $$0, @Nullable jm $$1, azs $$2) {
      return this.b.a($$2).map($$3 -> $$3.a($$0, $$1, $$2)).orElse(Collections.emptyList());
   }
}
