import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class ghq {
   private final Map<alh, gzu> a = new HashMap<>();
   private final Supplier<gzu> b;
   private final Function<alh, gzu> c;

   public ghq(hah $$0) {
      this.b = $$0::a;
      this.c = $$1 -> $$0.a(hai.a($$1));
   }

   public gzu a(cvx $$0) {
      alh $$1 = $$0.a(kt.i);
      return $$1 == null ? this.b.get() : this.a($$1);
   }

   public gzu a(alh $$0) {
      return this.a.computeIfAbsent($$0, this.c);
   }

   public void a() {
      this.a.clear();
   }
}
