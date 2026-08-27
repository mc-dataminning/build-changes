import java.util.Map;

public class yy implements uo<ur> {
   private final Map<acp<? extends hr<?>>, ano.a> a;

   public yy(Map<acp<? extends hr<?>>, ano.a> $$0) {
      this.a = $$0;
   }

   public yy(sf $$0) {
      this.a = $$0.a($$0x -> acp.a($$0x.t()), ano.a::b);
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$0x.a($$1.a()), ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public Map<acp<? extends hr<?>>, ano.a> a() {
      return this.a;
   }
}
