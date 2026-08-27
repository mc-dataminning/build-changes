public class gfv extends ght<ccw, frc<ccw>> {
   public gfv(ggn.a $$0) {
      super($$0, new frc<>($$0.a(fuq.t)), 0.4F);
      this.a(new gka(this, $$0.f()));
   }

   public akf a(ccw $$0) {
      return $$0.gv();
   }

   protected void a(ccw $$0, exn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b(0.8F, 0.8F, 0.8F);
   }

   protected void a(ccw $$0, exn $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.G($$4);
      if ($$6 > 0.0F) {
         $$1.a(0.4F * $$6, 0.15F * $$6, 0.1F * $$6);
         $$1.a(a.f.rotationDegrees(axw.j($$6, 0.0F, 90.0F)));
         im $$7 = $$0.dn();

         for (ckl $$9 : $$0.dN().a(ckl.class, new eta($$7).c(2.0, 2.0, 2.0))) {
            if ($$9.fJ()) {
               $$1.a(0.15F * $$6, 0.0F, 0.0F);
               break;
            }
         }
      }
   }
}
