import java.util.Map;

public class zt implements ze<zk> {
   public static final yv<vx, zt> a = ze.a(zt::a, zt::new);
   private final Map<akl<? extends jk<?>>, awo.a> b;

   public zt(Map<akl<? extends jk<?>>, awo.a> $$0) {
      this.b = $$0;
   }

   private zt(vx $$0) {
      this.b = $$0.a(vx::r, awo.a::b);
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

   public Map<akl<? extends jk<?>>, awo.a> b() {
      return this.b;
   }
}
