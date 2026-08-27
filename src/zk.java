public class zk implements yp<zg> {
   public static final yg<vi, zk> a = yp.a(zk::a, zk::new);
   private final int b;

   public zk(int $$0) {
      this.b = $$0;
   }

   private zk(vi $$0) {
      this.b = $$0.readInt();
   }

   private void a(vi $$0) {
      $$0.p(this.b);
   }

   @Override
   public yr<zk> a() {
      return zf.m;
   }

   public void a(zg $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }
}
