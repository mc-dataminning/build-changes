import java.util.Map;

public class zt implements ze<zk> {
   public static final yv<vx, zt> a = ze.a(zt::a, zt::new);
   private final Map<akm<? extends jk<?>>, awp.a> b;

   public zt(Map<akm<? extends jk<?>>, awp.a> $$0) {
      this.b = $$0;
   }

   private zt(vx $$0) {
      this.b = $$0.a(vx::r, awp.a::b);
   }

   private void a(vx $$0) {
      $$0.a(this.b, vx::b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zg<zt> a() {
      return zu.i;
   }

   public void a(zk $$0) {
      $$0.a(this);
   }

   public Map<akm<? extends jk<?>>, awp.a> b() {
      return this.b;
   }
}
