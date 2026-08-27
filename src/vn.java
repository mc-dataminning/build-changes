import java.util.Map;

public class vn implements ve<vh> {
   private final Map<aey<? extends hq<?>>, aqn.a> a;

   public vn(Map<aey<? extends hq<?>>, aqn.a> $$0) {
      this.a = $$0;
   }

   public vn(so $$0) {
      this.a = $$0.a(so::u, aqn.a::b);
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a, so::b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(vh $$0) {
      $$0.a(this);
   }

   public Map<aey<? extends hq<?>>, aqn.a> a() {
      return this.a;
   }
}
