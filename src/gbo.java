import java.util.Set;

public class gbo<T extends gyb> extends gbm<T> {
   public static final gex b = new gan(true, 10.0F, 4.0F, Set.of("head"));
   public static final gex c = gex.scaling(0.8F);
   private static final float a = 0.0F;
   private static final float p = 16.0F;
   private static final float q = -9.0F;
   protected static final float d = 18.0F;
   protected static final float e = 5.0F;
   protected static final float f = 14.1F;
   private static final float r = -5.0F;
   private static final String s = "tail1";
   private static final String t = "tail2";
   protected final geo g;
   protected final geo i;
   protected final geo j;
   protected final geo k;
   protected final geo l;
   protected final geo m;
   protected final geo n;
   protected final geo o;

   public gbo(geo $$0) {
      super($$0);
      this.n = $$0.b("head");
      this.o = $$0.b("body");
      this.l = $$0.b("tail1");
      this.m = $$0.b("tail2");
      this.g = $$0.b("left_hind_leg");
      this.i = $$0.b("right_hind_leg");
      this.j = $$0.b("left_front_leg");
      this.k = $$0.b("right_front_leg");
   }

   public static gew a(ges $$0) {
      gew $$1 = new gew();
      gey $$2 = $$1.a();
      ges $$3 = new ges(-0.02F);
      $$2.a(
         "head",
         get.c()
            .a("main", -2.5F, -2.0F, -3.0F, 5.0F, 4.0F, 5.0F, $$0)
            .a("nose", -1.5F, -0.001F, -4.0F, 3, 2, 2, $$0, 0, 24)
            .a("ear1", -2.0F, -3.0F, 0.0F, 1, 1, 2, $$0, 0, 10)
            .a("ear2", 1.0F, -3.0F, 0.0F, 1, 1, 2, $$0, 6, 10),
         geq.a(0.0F, 15.0F, -9.0F)
      );
      $$2.a("body", get.c().a(20, 0).a(-2.0F, 3.0F, -8.0F, 4.0F, 16.0F, 6.0F, $$0), geq.a(0.0F, 12.0F, -10.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      $$2.a("tail1", get.c().a(0, 15).a(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, $$0), geq.a(0.0F, 15.0F, 8.0F, 0.9F, 0.0F, 0.0F));
      $$2.a("tail2", get.c().a(4, 15).a(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, $$3), geq.a(0.0F, 20.0F, 14.0F));
      get $$4 = get.c().a(8, 13).a(-1.0F, 0.0F, 1.0F, 2.0F, 6.0F, 2.0F, $$0);
      $$2.a("left_hind_leg", $$4, geq.a(1.1F, 18.0F, 5.0F));
      $$2.a("right_hind_leg", $$4, geq.a(-1.1F, 18.0F, 5.0F));
      get $$5 = get.c().a(40, 0).a(-1.0F, 0.0F, 0.0F, 2.0F, 10.0F, 2.0F, $$0);
      $$2.a("left_front_leg", $$5, geq.a(1.2F, 14.1F, -5.0F));
      $$2.a("right_front_leg", $$5, geq.a(-1.2F, 14.1F, -5.0F));
      return $$1;
   }

   public void a(T $$0) {
      super.a($$0);
      if ($$0.d) {
         this.o.c++;
         this.n.c += 2.0F;
         this.l.c++;
         this.m.c += -4.0F;
         this.m.d += 2.0F;
         this.l.e = (float) (Math.PI / 2);
         this.m.e = (float) (Math.PI / 2);
      } else if ($$0.e) {
         this.m.c = this.l.c;
         this.m.d += 2.0F;
         this.l.e = (float) (Math.PI / 2);
         this.m.e = (float) (Math.PI / 2);
      }

      this.n.e = $$0.V * (float) (Math.PI / 180.0);
      this.n.f = $$0.U * (float) (Math.PI / 180.0);
      if (!$$0.f) {
         this.o.e = (float) (Math.PI / 2);
         float $$1 = $$0.Y;
         float $$2 = $$0.X;
         if ($$0.e) {
            this.g.e = bae.b($$2 * 0.6662F) * $$1;
            this.i.e = bae.b($$2 * 0.6662F + 0.3F) * $$1;
            this.j.e = bae.b($$2 * 0.6662F + (float) Math.PI + 0.3F) * $$1;
            this.k.e = bae.b($$2 * 0.6662F + (float) Math.PI) * $$1;
            this.m.e = 1.7278761F + (float) (Math.PI / 10) * bae.b($$2) * $$1;
         } else {
            this.g.e = bae.b($$2 * 0.6662F) * $$1;
            this.i.e = bae.b($$2 * 0.6662F + (float) Math.PI) * $$1;
            this.j.e = bae.b($$2 * 0.6662F + (float) Math.PI) * $$1;
            this.k.e = bae.b($$2 * 0.6662F) * $$1;
            if (!$$0.d) {
               this.m.e = 1.7278761F + (float) (Math.PI / 4) * bae.b($$2) * $$1;
            } else {
               this.m.e = 1.7278761F + 0.47123894F * bae.b($$2) * $$1;
            }
         }
      }

      float $$3 = $$0.ab;
      if ($$0.f) {
         this.o.e = (float) (Math.PI / 4);
         this.o.c += -4.0F * $$3;
         this.o.d += 5.0F * $$3;
         this.n.c += -3.3F * $$3;
         this.n.d += 1.0F * $$3;
         this.l.c += 8.0F * $$3;
         this.l.d += -2.0F * $$3;
         this.m.c += 2.0F * $$3;
         this.m.d += -0.8F * $$3;
         this.l.e = 1.7278761F;
         this.m.e = 2.670354F;
         this.j.e = (float) (-Math.PI / 20);
         this.j.c += 2.0F * $$3;
         this.j.d -= 2.0F * $$3;
         this.k.e = (float) (-Math.PI / 20);
         this.k.c += 2.0F * $$3;
         this.k.d -= 2.0F * $$3;
         this.g.e = (float) (-Math.PI / 2);
         this.g.c += 3.0F * $$3;
         this.g.d -= 4.0F * $$3;
         this.i.e = (float) (-Math.PI / 2);
         this.i.c += 3.0F * $$3;
         this.i.d -= 4.0F * $$3;
      }

      if ($$0.g > 0.0F) {
         this.n.g = bae.i($$0.g, this.n.g, -1.2707963F);
         this.n.f = bae.i($$0.g, this.n.f, 1.2707963F);
         this.j.e = -1.2707963F;
         this.k.e = -0.47079635F;
         this.k.g = -0.2F;
         this.k.b += $$3;
         this.g.e = -0.4F;
         this.i.e = 0.5F;
         this.i.g = -0.5F;
         this.i.b += 0.8F * $$3;
         this.i.c += 2.0F * $$3;
         this.l.e = bae.i($$0.h, this.l.e, 0.8F);
         this.m.e = bae.i($$0.h, this.m.e, -0.4F);
      }

      if ($$0.i > 0.0F) {
         this.n.e = bae.i($$0.i, this.n.e, -0.58177644F);
      }
   }
}
