import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class gib {
   private final Map<ali, haf> a = new HashMap<>();
   private final Supplier<haf> b;
   private final Function<ali, haf> c;

   public gib(has $$0) {
      this.b = $$0::a;
      this.c = $$1 -> $$0.a(hat.a($$1));
   }

   public haf a(cwb $$0) {
      ali $$1 = $$0.a(ku.i);
      return $$1 == null ? this.b.get() : this.a($$1);
   }

   public haf a(ali $$0) {
      return this.a.computeIfAbsent($$0, this.c);
   }

   public void a() {
      this.a.clear();
   }
}
