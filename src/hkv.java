import java.util.List;
import javax.annotation.Nullable;

public class hkv extends hkd {
   private final bsj<hjz> b;

   public hkv(bsj<hjz> $$0) {
      super($$0.d().getFirst().a());
      this.b = $$0;
   }

   @Override
   public List<gqk> a(@Nullable dzo $$0, @Nullable ja $$1, azt $$2) {
      return this.b.b($$2).a($$0, $$1, $$2);
   }
}
