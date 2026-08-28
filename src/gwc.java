public class gwc extends gwf<gzg, gcr> {
   private final gck a;
   private final gzc b = new gzc();

   public gwc(gtn<gzg, gcr> $$0, gek $$1) {
      super($$0);
      this.a = new gck($$1.a(gen.bK));
      this.b.c = gck.a.e;
   }

   public void a(fgs $$0, gll $$1, int $$2, gzg $$3, float $$4, float $$5) {
      cin.b $$6 = $$3.aE;
      if ($$6 != null) {
         this.a($$0, $$1, $$2, $$3, $$6, $$4, $$5, true);
      }

      cin.b $$7 = $$3.aF;
      if ($$7 != null) {
         this.a($$0, $$1, $$2, $$3, $$7, $$4, $$5, false);
      }
   }

   private void a(fgs $$0, gll $$1, int $$2, gzg $$3, cin.b $$4, float $$5, float $$6, boolean $$7) {
      $$0.a();
      $$0.a($$7 ? 0.4F : -0.4F, $$3.I ? -1.3F : -1.5F, 0.0F);
      this.b.p = $$3.p;
      this.b.X = $$3.X;
      this.b.Y = $$3.Y;
      this.b.U = $$5;
      this.b.V = $$6;
      this.a.a(this.b);
      this.a.a($$0, $$1.getBuffer(this.a.a(gtd.a($$4))), $$2, hbc.d);
      $$0.b();
   }
}
