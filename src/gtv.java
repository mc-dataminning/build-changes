public class gtv extends gty<gwz, gao> {
   private final gah a;
   private final gwv b = new gwv();

   public gtv(grh<gwz, gao> $$0, gch $$1) {
      super($$0);
      this.a = new gah($$1.a(gck.bH));
      this.b.c = gah.a.e;
   }

   public void a(fer $$0, gjg $$1, int $$2, gwz $$3, float $$4, float $$5) {
      cho.b $$6 = $$3.aE;
      if ($$6 != null) {
         this.a($$0, $$1, $$2, $$3, $$6, $$4, $$5, true);
      }

      cho.b $$7 = $$3.aF;
      if ($$7 != null) {
         this.a($$0, $$1, $$2, $$3, $$7, $$4, $$5, false);
      }
   }

   private void a(fer $$0, gjg $$1, int $$2, gwz $$3, cho.b $$4, float $$5, float $$6, boolean $$7) {
      $$0.a();
      $$0.a($$7 ? 0.4F : -0.4F, $$3.I ? -1.3F : -1.5F, 0.0F);
      this.b.p = $$3.p;
      this.b.X = $$3.X;
      this.b.Y = $$3.Y;
      this.b.U = $$5;
      this.b.V = $$6;
      this.a.a(this.b);
      this.a.a($$0, $$1.getBuffer(this.a.a(gqx.a($$4))), $$2, gyv.d);
      $$0.b();
   }
}
