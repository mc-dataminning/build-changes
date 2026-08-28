import java.util.Map;

public class gsw {
   public static final gsw a = new gsw(Map.of());
   private final Map<dnc, hke<?>> b;

   public gsw(Map<dnc, hke<?>> $$0) {
      this.b = $$0;
   }

   public static gsw a(gla $$0) {
      return new gsw(hkf.a($$0));
   }

   public void a(dnc $$0, czw $$1, flo $$2, gsa $$3, int $$4, int $$5) {
      hke<?> $$6 = this.b.get($$0);
      if ($$6 != null) {
         $$6.a(null, $$1, $$2, $$3, $$4, $$5, false);
      }
   }
}
