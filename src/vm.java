import java.util.Map;

public class vm implements vd<vg> {
   private final Map<aev<? extends hq<?>>, aqk.a> a;

   public vm(Map<aev<? extends hq<?>>, aqk.a> $$0) {
      this.a = $$0;
   }

   public vm(so $$0) {
      this.a = $$0.a(so::t, aqk.a::b);
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a, so::b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(vg $$0) {
      $$0.a(this);
   }

   public Map<aev<? extends hq<?>>, aqk.a> a() {
      return this.a;
   }
}
