import java.util.Set;

public class gcc<T extends gyo> extends gca<T> {
   public static final gfl b = new gaz(true, 10.0F, 4.0F, Set.of("head"));
   private static final float a = 0.0F;
   private static final float o = 16.0F;
   private static final float p = -9.0F;
   protected static final float c = 18.0F;
   protected static final float d = 5.0F;
   protected static final float e = 14.1F;
   private static final float q = -5.0F;
   private static final String r = "tail1";
   private static final String s = "tail2";
   protected final gfc f;
   protected final gfc g;
   protected final gfc i;
   protected final gfc j;
   protected final gfc k;
   protected final gfc l;
   protected final gfc m;
   protected final gfc n;

   public gcc(gfc $$0) {
      super($$0);
      this.m = $$0.b("head");
      this.n = $$0.b("body");
      this.k = $$0.b("tail1");
      this.l = $$0.b("tail2");
      this.f = $$0.b("left_hind_leg");
      this.g = $$0.b("right_hind_leg");
      this.i = $$0.b("left_front_leg");
      this.j = $$0.b("right_front_leg");
   }

   public static gfk a(gfg $$0) {
      gfk $$1 = new gfk();
      gfm $$2 = $$1.a();
      gfg $$3 = new gfg(-0.02F);
      $$2.a(
         "head",
         gfh.c()
            .a("main", -2.5F, -2.0F, -3.0F, 5.0F, 4.0F, 5.0F, $$0)
            .a("nose", -1.5F, -0.001F, -4.0F, 3, 2, 2, $$0, 0, 24)
            .a("ear1", -2.0F, -3.0F, 0.0F, 1, 1, 2, $$0, 0, 10)
            .a("ear2", 1.0F, -3.0F, 0.0F, 1, 1, 2, $$0, 6, 10),
         gfe.a(0.0F, 15.0F, -9.0F)
      );
      $$2.a("body", gfh.c().a(20, 0).a(-2.0F, 3.0F, -8.0F, 4.0F, 16.0F, 6.0F, $$0), gfe.a(0.0F, 12.0F, -10.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      $$2.a("tail1", gfh.c().a(0, 15).a(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, $$0), gfe.a(0.0F, 15.0F, 8.0F, 0.9F, 0.0F, 0.0F));
      $$2.a("tail2", gfh.c().a(4, 15).a(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, $$3), gfe.a(0.0F, 20.0F, 14.0F));
      gfh $$4 = gfh.c().a(8, 13).a(-1.0F, 0.0F, 1.0F, 2.0F, 6.0F, 2.0F, $$0);
      $$2.a("left_hind_leg", $$4, gfe.a(1.1F, 18.0F, 5.0F));
      $$2.a("right_hind_leg", $$4, gfe.a(-1.1F, 18.0F, 5.0F));
      gfh $$5 = gfh.c().a(40, 0).a(-1.0F, 0.0F, 0.0F, 2.0F, 10.0F, 2.0F, $$0);
      $$2.a("left_front_leg", $$5, gfe.a(1.2F, 14.1F, -5.0F));
      $$2.a("right_front_leg", $$5, gfe.a(-1.2F, 14.1F, -5.0F));
      return $$1;
   }

   public void a(T $$0) {
      super.a($$0);
      float $$1 = $$0.ag;
      if ($$0.d) {
         this.n.c += 1.0F * $$1;
         this.m.c += 2.0F * $$1;
         this.k.c += 1.0F * $$1;
         this.l.c += -4.0F * $$1;
         this.l.d += 2.0F * $$1;
         this.k.e = (float) (Math.PI / 2);
         this.l.e = (float) (Math.PI / 2);
      } else if ($$0.e) {
         this.l.c = this.k.c;
         this.l.d += 2.0F * $$1;
         this.k.e = (float) (Math.PI / 2);
         this.l.e = (float) (Math.PI / 2);
      }

      this.m.e = $$0.ab * (float) (Math.PI / 180.0);
      this.m.f = $$0.aa * (float) (Math.PI / 180.0);
      if (!$$0.f) {
         this.n.e = (float) (Math.PI / 2);
         float $$2 = $$0.ae;
         float $$3 = $$0.ad;
         if ($$0.e) {
            this.f.e = ayz.b($$3 * 0.6662F) * $$2;
            this.g.e = ayz.b($$3 * 0.6662F + 0.3F) * $$2;
            this.i.e = ayz.b($$3 * 0.6662F + (float) Math.PI + 0.3F) * $$2;
            this.j.e = ayz.b($$3 * 0.6662F + (float) Math.PI) * $$2;
            this.l.e = 1.7278761F + (float) (Math.PI / 10) * ayz.b($$3) * $$2;
         } else {
            this.f.e = ayz.b($$3 * 0.6662F) * $$2;
            this.g.e = ayz.b($$3 * 0.6662F + (float) Math.PI) * $$2;
            this.i.e = ayz.b($$3 * 0.6662F + (float) Math.PI) * $$2;
            this.j.e = ayz.b($$3 * 0.6662F) * $$2;
            if (!$$0.d) {
               this.l.e = 1.7278761F + (float) (Math.PI / 4) * ayz.b($$3) * $$2;
            } else {
               this.l.e = 1.7278761F + 0.47123894F * ayz.b($$3) * $$2;
            }
         }
      }

      if ($$0.f) {
         this.n.e = (float) (Math.PI / 4);
         this.n.c += -4.0F * $$1;
         this.n.d += 5.0F * $$1;
         this.m.c += -3.3F * $$1;
         this.m.d += 1.0F * $$1;
         this.k.c += 8.0F * $$1;
         this.k.d += -2.0F * $$1;
         this.l.c += 2.0F * $$1;
         this.l.d += -0.8F * $$1;
         this.k.e = 1.7278761F;
         this.l.e = 2.670354F;
         this.i.e = (float) (-Math.PI / 20);
         this.i.c += 2.0F * $$1;
         this.i.d -= 2.0F * $$1;
         this.j.e = (float) (-Math.PI / 20);
         this.j.c += 2.0F * $$1;
         this.j.d -= 2.0F * $$1;
         this.f.e = (float) (-Math.PI / 2);
         this.f.c += 3.0F * $$1;
         this.f.d -= 4.0F * $$1;
         this.g.e = (float) (-Math.PI / 2);
         this.g.c += 3.0F * $$1;
         this.g.d -= 4.0F * $$1;
      }

      if ($$0.g > 0.0F) {
         this.m.g = ayz.i($$0.g, this.m.g, -1.2707963F);
         this.m.f = ayz.i($$0.g, this.m.f, 1.2707963F);
         this.i.e = -1.2707963F;
         this.j.e = -0.47079635F;
         this.j.g = -0.2F;
         this.j.b += $$1;
         this.f.e = -0.4F;
         this.g.e = 0.5F;
         this.g.g = -0.5F;
         this.g.b += 0.8F * $$1;
         this.g.c += 2.0F * $$1;
         this.k.e = ayz.i($$0.h, this.k.e, 0.8F);
         this.l.e = ayz.i($$0.h, this.l.e, -0.4F);
      }

      if ($$0.i > 0.0F) {
         this.m.e = ayz.i($$0.i, this.m.e, -0.58177644F);
      }
   }
}
