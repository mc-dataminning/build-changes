import java.util.Map;

public class xq implements xg<xj> {
   private final Map<ahg<? extends it<?>>, ata.a> a;

   public xq(Map<ahg<? extends it<?>>, ata.a> $$0) {
      this.a = $$0;
   }

   public xq(uj $$0) {
      this.a = $$0.a(uj::u, ata.a::b);
   }

   @Override
   public void a(uj $$0) {
      $$0.a(this.a, uj::b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(xj $$0) {
      $$0.a(this);
   }

   public Map<ahg<? extends it<?>>, ata.a> a() {
      return this.a;
   }
}
