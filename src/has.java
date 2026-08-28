public class has extends hav<hdz, ghe> {
   private final ggx a;
   private final hdv b = new hdv();

   public has(gye<hdz, ghe> $$0, giy $$1) {
      super($$0);
      this.a = new ggx($$1.a(gjb.cb));
      this.b.c = ggx.a.e;
   }

   public void a(fjj $$0, gqa $$1, int $$2, hdz $$3, float $$4, float $$5) {
      cjo.b $$6 = $$3.aE;
      if ($$6 != null) {
         this.a($$0, $$1, $$2, $$3, $$6, $$4, $$5, true);
      }

      cjo.b $$7 = $$3.aF;
      if ($$7 != null) {
         this.a($$0, $$1, $$2, $$3, $$7, $$4, $$5, false);
      }
   }

   private void a(fjj $$0, gqa $$1, int $$2, hdz $$3, cjo.b $$4, float $$5, float $$6, boolean $$7) {
      $$0.a();
      $$0.a($$7 ? 0.4F : -0.4F, $$3.N ? -1.3F : -1.5F, 0.0F);
      this.b.u = $$3.u;
      this.b.ad = $$3.ad;
      this.b.ae = $$3.ae;
      this.b.aa = $$5;
      this.b.ab = $$6;
      this.a.a(this.b);
      this.a.a($$0, $$1.getBuffer(this.a.a(gxu.a($$4))), $$2, hin.d);
      $$0.b();
   }
}
