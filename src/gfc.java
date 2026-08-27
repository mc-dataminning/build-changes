public class gfc extends gfd<dpy> {
   private static final akn c = new akn("textures/entity/end_gateway_beam.png");

   public gfc(gel.a $$0) {
      super($$0);
   }

   public void a(dpy $$0, float $$1, eyu $$2, gck $$3, int $$4, int $$5) {
      if ($$0.b() || $$0.c()) {
         float $$6 = $$0.b() ? $$0.a($$1) : $$0.b($$1);
         double $$7 = $$0.b() ? (double)$$0.i().al() : 50.0;
         $$6 = ayf.a($$6 * (float) Math.PI);
         int $$8 = ayf.a((double)$$6 * $$7);
         float[] $$9 = $$0.b() ? csj.c.d() : csj.k.d();
         long $$10 = $$0.i().Y();
         geg.a($$2, $$3, c, $$1, $$6, $$10, -$$8, $$8 * 2, $$9, 0.15F, 0.175F);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected float b() {
      return 1.0F;
   }

   @Override
   protected float c() {
      return 0.0F;
   }

   @Override
   protected gcs d() {
      return gcs.v();
   }

   @Override
   public int aQ_() {
      return 256;
   }
}
