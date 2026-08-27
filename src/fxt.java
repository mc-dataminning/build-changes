public class fxt extends fxw {
   private final frr a;
   private final gaq b = gaq.i(gfk.a);

   fxt(fuq $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new frc(fby.Q().aR().a(ftu.V));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public fya b() {
      return fya.e;
   }

   @Override
   public void a(ewv $$0, fbj $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * axm.a($$3 * (float) Math.PI);
      ewr $$5 = new ewr();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      gai.a $$6 = fby.Q().aQ().c();
      ewv $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, glj.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements fxz<kq> {
      public fxw a(kq $$0, fuq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fxt($$1, $$2, $$3, $$4);
      }
   }
}
