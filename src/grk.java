public class grk extends gsu<cmm, gxs, gbi<gxs>> {
   private static final alz a = alz.b("textures/entity/enderman/enderman.png");
   private final bam b = bam.a();

   public grk(gro.a $$0) {
      super($$0, new gbi<>($$0.a(gel.aE)), 0.5F);
      this.a(new gvl(this));
      this.a(new gvd(this, $$0.d()));
   }

   public fbx a(gxs $$0) {
      fbx $$1 = super.a($$0);
      if ($$0.a) {
         double $$2 = 0.02 * (double)$$0.aa;
         return $$1.b(this.b.k() * $$2, 0.0, this.b.k() * $$2);
      } else {
         return $$1;
      }
   }

   public alz b(gxs $$0) {
      return a;
   }

   public gxs a() {
      return new gxs();
   }

   public void a(cmm $$0, gxs $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gsf.a($$0, $$1, $$2);
      $$1.a = $$0.gm();
      $$1.b = $$0.x();
   }
}
