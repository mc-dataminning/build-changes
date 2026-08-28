import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class gja {
   private final Map<alj, hbg> a = new HashMap<>();
   private final Supplier<hbg> b;
   private final Function<alj, hbg> c;

   public gja(hbt $$0) {
      this.b = $$0::a;
      this.c = $$1 -> $$0.a(hbu.a($$1));
   }

   public hbg a(cwm $$0) {
      alj $$1 = $$0.a(ku.i);
      return $$1 == null ? this.b.get() : this.a($$1);
   }

   public hbg a(alj $$0) {
      return this.a.computeIfAbsent($$0, this.c);
   }

   public void a() {
      this.a.clear();
   }
}
