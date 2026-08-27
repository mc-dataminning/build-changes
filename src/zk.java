public class zk implements zb<zh> {
   public static final ys<vu, zk> a = zb.a(zk::a, zk::new);
   private final long b;

   public zk(long $$0) {
      this.b = $$0;
   }

   private zk(vu $$0) {
      this.b = $$0.readLong();
   }

   private void a(vu $$0) {
      $$0.b(this.b);
   }

   @Override
   public zd<zk> a() {
      return zr.c;
   }

   public void a(zh $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }
}
