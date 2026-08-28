public class gcp<S extends gzc> extends gcb<S> implements gav, gck {
   private final gfd a;
   private final gfd b;
   private final gfd c;
   private final gfd d;
   private final gfd e;
   private final gfd f;
   private final gfd g;

   public gcp(gfd $$0) {
      super($$0);
      this.a = $$0.b("head");
      this.b = this.a.b("hat");
      this.b.k = false;
      this.c = $$0.b("arms");
      this.d = $$0.b("left_leg");
      this.e = $$0.b("right_leg");
      this.g = $$0.b("left_arm");
      this.f = $$0.b("right_arm");
   }

   public static gfj a() {
      gfl $$0 = new gfl();
      gfn $$1 = $$0.a();
      gfn $$2 = $$1.a("head", gfi.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), gff.a(0.0F, 0.0F, 0.0F));
      $$2.a("hat", gfi.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 12.0F, 8.0F, new gfh(0.45F)), gff.a);
      $$2.a("nose", gfi.c().a(24, 0).a(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F), gff.a(0.0F, -2.0F, 0.0F));
      $$1.a(
         "body",
         gfi.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new gfh(0.5F)),
         gff.a(0.0F, 0.0F, 0.0F)
      );
      gfn $$3 = $$1.a(
         "arms",
         gfi.c().a(44, 22).a(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F).a(40, 38).a(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F),
         gff.a(0.0F, 3.0F, -1.0F, -0.75F, 0.0F, 0.0F)
      );
      $$3.a("left_shoulder", gfi.c().a(44, 22).a().a(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F), gff.a);
      $$1.a("right_leg", gfi.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gff.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", gfi.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gff.a(2.0F, 12.0F, 0.0F));
      $$1.a("right_arm", gfi.c().a(40, 46).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gff.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", gfi.c().a(40, 46).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gff.a(5.0F, 2.0F, 0.0F));
      return gfj.a($$0, 64, 64);
   }

   public void a(S $$0) {
      super.a($$0);
      this.a.f = $$0.aa * (float) (Math.PI / 180.0);
      this.a.e = $$0.ab * (float) (Math.PI / 180.0);
      if ($$0.b) {
         this.f.e = (float) (-Math.PI / 5);
         this.f.f = 0.0F;
         this.f.g = 0.0F;
         this.g.e = (float) (-Math.PI / 5);
         this.g.f = 0.0F;
         this.g.g = 0.0F;
         this.e.e = -1.4137167F;
         this.e.f = (float) (Math.PI / 10);
         this.e.g = 0.07853982F;
         this.d.e = -1.4137167F;
         this.d.f = (float) (-Math.PI / 10);
         this.d.g = -0.07853982F;
      } else {
         float $$1 = $$0.ae;
         float $$2 = $$0.ad;
         this.f.e = ayz.b($$2 * 0.6662F + (float) Math.PI) * 2.0F * $$1 * 0.5F;
         this.f.f = 0.0F;
         this.f.g = 0.0F;
         this.g.e = ayz.b($$2 * 0.6662F) * 2.0F * $$1 * 0.5F;
         this.g.f = 0.0F;
         this.g.g = 0.0F;
         this.e.e = ayz.b($$2 * 0.6662F) * 1.4F * $$1 * 0.5F;
         this.e.f = 0.0F;
         this.e.g = 0.0F;
         this.d.e = ayz.b($$2 * 0.6662F + (float) Math.PI) * 1.4F * $$1 * 0.5F;
         this.d.f = 0.0F;
         this.d.g = 0.0F;
      }

      clf.a $$3 = $$0.j;
      if ($$3 == clf.a.b) {
         if ($$0.aW_().c()) {
            gat.a(this.g, this.f, true, $$0.m, $$0.u);
         } else {
            gat.a(this.f, this.g, $$0.d, $$0.m, $$0.u);
         }
      } else if ($$3 == clf.a.c) {
         this.f.d = 0.0F;
         this.f.b = -5.0F;
         this.g.d = 0.0F;
         this.g.b = 5.0F;
         this.f.e = ayz.b($$0.u * 0.6662F) * 0.25F;
         this.g.e = ayz.b($$0.u * 0.6662F) * 0.25F;
         this.f.g = (float) (Math.PI * 3.0 / 4.0);
         this.g.g = (float) (-Math.PI * 3.0 / 4.0);
         this.f.f = 0.0F;
         this.g.f = 0.0F;
      } else if ($$3 == clf.a.d) {
         this.f.f = -0.1F + this.a.f;
         this.f.e = (float) (-Math.PI / 2) + this.a.e;
         this.g.e = -0.9424779F + this.a.e;
         this.g.f = this.a.f - 0.4F;
         this.g.g = (float) (Math.PI / 2);
      } else if ($$3 == clf.a.e) {
         gat.a(this.f, this.g, this.a, true);
      } else if ($$3 == clf.a.f) {
         gat.a(this.f, this.g, (float)$$0.k, $$0.l, true);
      } else if ($$3 == clf.a.g) {
         this.f.d = 0.0F;
         this.f.b = -5.0F;
         this.f.e = ayz.b($$0.u * 0.6662F) * 0.05F;
         this.f.g = 2.670354F;
         this.f.f = 0.0F;
         this.g.d = 0.0F;
         this.g.b = 5.0F;
         this.g.e = ayz.b($$0.u * 0.6662F) * 0.05F;
         this.g.g = (float) (-Math.PI * 3.0 / 4.0);
         this.g.f = 0.0F;
      }

      boolean $$4 = $$3 == clf.a.a;
      this.c.k = $$4;
      this.g.k = !$$4;
      this.f.k = !$$4;
   }

   private gfd a(bvb $$0) {
      return $$0 == bvb.a ? this.g : this.f;
   }

   public gfd c() {
      return this.b;
   }

   @Override
   public gfd b() {
      return this.a;
   }

   @Override
   public void a(bvb $$0, ffu $$1) {
      this.v.a($$1);
      this.a($$0).a($$1);
   }
}
