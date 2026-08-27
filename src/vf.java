import java.util.Map;

public class vf implements uw<uz> {
   private final Map<aeo<? extends hs<?>>, aqb.a> a;

   public vf(Map<aeo<? extends hs<?>>, aqb.a> $$0) {
      this.a = $$0;
   }

   public vf(sh $$0) {
      this.a = $$0.a(sh::t, aqb.a::b);
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.a, sh::b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(uz $$0) {
      $$0.a(this);
   }

   public Map<aeo<? extends hs<?>>, aqb.a> a() {
      return this.a;
   }
}
