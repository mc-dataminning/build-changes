public class vr implements vd<vn> {
   private final int a;

   public vr(int $$0) {
      this.a = $$0;
   }

   public vr(so $$0) {
      this.a = $$0.readInt();
   }

   @Override
   public void a(so $$0) {
      $$0.p(this.a);
   }

   public void a(vn $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }
}
