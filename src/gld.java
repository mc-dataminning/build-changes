import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class gld {
   private final Map<alz, hdl> a = new HashMap<>();
   private final Supplier<hdl> b;
   private final Function<alz, hdl> c;

   public gld(hdy $$0) {
      this.b = $$0::a;
      this.c = $$1 -> $$0.a(hdz.a($$1));
   }

   public hdl a(cxo $$0) {
      alz $$1 = $$0.a(ku.i);
      return $$1 == null ? this.b.get() : this.a($$1);
   }

   public hdl a(alz $$0) {
      return this.a.computeIfAbsent($$0, this.c);
   }

   public void a() {
      this.a.clear();
   }
}
