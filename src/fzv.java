public class fzv extends fzy {
   private final fts a;
   private final gcs b = gcs.i(ghm.a);

   fzv(fwr $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new ftd(fdz.Q().aS().a(fvv.V));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public gac b() {
      return gac.e;
   }

   @Override
   public void a(eyw $$0, fdk $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * ayd.a($$3 * (float) Math.PI);
      eys $$5 = new eys();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      gck.a $$6 = fdz.Q().aR().c();
      eyw $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, gnm.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements gab<lb> {
      public fzy a(lb $$0, fwr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fzv($$1, $$2, $$3, $$4);
      }
   }
}
