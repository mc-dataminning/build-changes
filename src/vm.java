import java.util.Map;

public class vm implements vd<vg> {
   private final Map<aew<? extends ht<?>>, aql.a> a;

   public vm(Map<aew<? extends ht<?>>, aql.a> $$0) {
      this.a = $$0;
   }

   public vm(so $$0) {
      this.a = $$0.a(so::t, aql.a::b);
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a, so::b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(vg $$0) {
      $$0.a(this);
   }

   public Map<aew<? extends ht<?>>, aql.a> a() {
      return this.a;
   }
}
