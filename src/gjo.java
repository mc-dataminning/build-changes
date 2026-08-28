public class gjo implements gjr<dro> {
   private final fyf a;
   private final fyf b;

   public gjo(gjs.a $$0) {
      this.a = new fyf.a($$0.a(gak.p), ghq::c);
      this.b = new fyf.a($$0.a(gak.o), ghq::c);
   }

   public static gar b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      $$1.a("main", gaq.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gan.a);
      $$1.a("left_leg", gaq.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gan.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", gaq.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gan.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return gar.a($$0, 64, 64);
   }

   public static gar c() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      $$1.a("main", gaq.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gan.a);
      $$1.a("left_leg", gaq.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gan.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", gaq.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gan.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return gar.a($$0, 64, 64);
   }

   public void a(dro $$0, float $$1, fde $$2, ghg $$3, int $$4, int $$5) {
      gzh $$6 = gib.r[$$0.c().a()];
      deg $$7 = $$0.i();
      if ($$7 != null) {
         duo $$8 = $$0.m();
         djq.c<? extends dro> $$9 = djq.a(dru.y, dhc::i, dhc::h, dim.c, $$8, $$7, $$0.aB_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new gju<>()).get($$4);
         this.a($$2, $$3, $$8.c(dhc.b) == dvb.a ? this.a : this.b, $$8.c(dhc.aF), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, jj.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, jj.d, $$6, $$4, $$5, true);
      }
   }

   private void a(fde $$0, ghg $$1, fyf $$2, jj $$3, gzh $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      fdi $$8 = $$4.a($$1, ghq::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
