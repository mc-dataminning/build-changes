public class gax extends gba {
   private final fuu a;
   private final gdu b = gdu.i(gio.a);

   gax(fxt $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fuf(ffd.Q().aR().a(fwx.V));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public gbe b() {
      return gbe.e;
   }

   @Override
   public void a(faa $$0, feo $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * ayx.a($$3 * (float) Math.PI);
      ezw $$5 = new ezw();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      gdm.a $$6 = ffd.Q().aQ().c();
      faa $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, goo.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements gbd<lm> {
      public gba a(lm $$0, fxt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gax($$1, $$2, $$3, $$4);
      }
   }
}
