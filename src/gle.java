import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class gle {
   private final Map<alz, hdm> a = new HashMap<>();
   private final Supplier<hdm> b;
   private final Function<alz, hdm> c;

   public gle(hdz $$0) {
      this.b = $$0::a;
      this.c = $$1 -> $$0.a(hea.a($$1));
   }

   public hdm a(cxo $$0) {
      alz $$1 = $$0.a(ku.i);
      return $$1 == null ? this.b.get() : this.a($$1);
   }

   public hdm a(alz $$0) {
      return this.a.computeIfAbsent($$0, this.c);
   }

   public void a() {
      this.a.clear();
   }
}
