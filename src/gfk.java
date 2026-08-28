public class gfk implements gfn<dpc> {
   private final fwz a;
   private final fwz b;

   public gfk(gfo.a $$0) {
      this.a = $$0.a(fwy.j);
      this.b = $$0.a(fwy.i);
   }

   public static fxf b() {
      fxh $$0 = new fxh();
      fxi $$1 = $$0.a();
      $$1.a("main", fxe.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fxb.a);
      $$1.a("left_leg", fxe.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fxb.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fxe.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fxb.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fxf.a($$0, 64, 64);
   }

   public static fxf c() {
      fxh $$0 = new fxh();
      fxi $$1 = $$0.a();
      $$1.a("main", fxe.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fxb.a);
      $$1.a("left_leg", fxe.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fxb.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fxe.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fxb.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fxf.a($$0, 64, 64);
   }

   public void a(dpc $$0, float $$1, ezx $$2, gdn $$3, int $$4, int $$5) {
      grc $$6 = gec.p[$$0.c().a()];
      dbx $$7 = $$0.i();
      if ($$7 != null) {
         dsb $$8 = $$0.n();
         dhf.c<? extends dpc> $$9 = dhf.a(dpi.y, der::h, der::g, dgb.c, $$8, $$7, $$0.ay_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new gfq<>()).get($$4);
         this.a($$2, $$3, $$8.c(der.b) == dso.a ? this.a : this.b, $$8.c(der.aE), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, je.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, je.d, $$6, $$4, $$5, true);
      }
   }

   private void a(ezx $$0, gdn $$1, fwz $$2, je $$3, grc $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      fab $$8 = $$4.a($$1, gdv::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
