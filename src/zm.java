import java.util.Map;

public class zm implements yv<zb> {
   public static final ym<vl, zm> a = yv.a(zm::a, zm::new);
   private final Map<akt<? extends ke<?>>, axg.a> b;

   public zm(Map<akt<? extends ke<?>>, axg.a> $$0) {
      this.b = $$0;
   }

   private zm(vl $$0) {
      this.b = $$0.a(vl::r, axg.a::b);
   }

   private void a(vl $$0) {
      $$0.a(this.b, vl::b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public yx<zm> a() {
      return zn.k;
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public Map<akt<? extends ke<?>>, axg.a> b() {
      return this.b;
   }
}
