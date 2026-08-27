import java.util.Map;

public class vg implements ux<va> {
   private final Map<aeq<? extends hr<?>>, aqd.a> a;

   public vg(Map<aeq<? extends hr<?>>, aqd.a> $$0) {
      this.a = $$0;
   }

   public vg(si $$0) {
      this.a = $$0.a(si::t, aqd.a::b);
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.a, si::b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(va $$0) {
      $$0.a(this);
   }

   public Map<aeq<? extends hr<?>>, aqd.a> a() {
      return this.a;
   }
}
