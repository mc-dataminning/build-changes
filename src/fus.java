import com.google.common.collect.ImmutableList;

public class fus<T extends ces> extends frs<T> {
   private static final String a = "real_head";
   private static final String b = "upper_body";
   private static final String f = "real_tail";
   private final fvb g;
   private final fvb h;
   private final fvb i;
   private final fvb j;
   private final fvb k;
   private final fvb l;
   private final fvb m;
   private final fvb n;
   private final fvb o;
   private final fvb p;
   private static final int q = 8;

   public fus(fvb $$0) {
      this.g = $$0.b("head");
      this.h = this.g.b("real_head");
      this.i = $$0.b("body");
      this.p = $$0.b("upper_body");
      this.j = $$0.b("right_hind_leg");
      this.k = $$0.b("left_hind_leg");
      this.l = $$0.b("right_front_leg");
      this.m = $$0.b("left_front_leg");
      this.n = $$0.b("tail");
      this.o = this.n.b("real_tail");
   }

   public static fvj a(fvf $$0) {
      fvj $$1 = new fvj();
      fvk $$2 = $$1.a();
      float $$3 = 13.5F;
      fvk $$4 = $$2.a("head", fvg.c(), fvd.a(-1.0F, 13.5F, -7.0F));
      $$4.a(
         "real_head",
         fvg.c()
            .a(0, 0)
            .a(-2.0F, -3.0F, -2.0F, 6.0F, 6.0F, 4.0F, $$0)
            .a(16, 14)
            .a(-2.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, $$0)
            .a(16, 14)
            .a(2.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, $$0)
            .a(0, 10)
            .a(-0.5F, -0.001F, -5.0F, 3.0F, 3.0F, 4.0F, $$0),
         fvd.a
      );
      $$2.a("body", fvg.c().a(18, 14).a(-3.0F, -2.0F, -3.0F, 6.0F, 9.0F, 6.0F, $$0), fvd.a(0.0F, 14.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      $$2.a("upper_body", fvg.c().a(21, 0).a(-3.0F, -3.0F, -3.0F, 8.0F, 6.0F, 7.0F, $$0), fvd.a(-1.0F, 14.0F, -3.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      fvg $$5 = fvg.c().a(0, 18).a(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, $$0);
      $$2.a("right_hind_leg", $$5, fvd.a(-2.5F, 16.0F, 7.0F));
      $$2.a("left_hind_leg", $$5, fvd.a(0.5F, 16.0F, 7.0F));
      $$2.a("right_front_leg", $$5, fvd.a(-2.5F, 16.0F, -4.0F));
      $$2.a("left_front_leg", $$5, fvd.a(0.5F, 16.0F, -4.0F));
      fvk $$6 = $$2.a("tail", fvg.c(), fvd.a(-1.0F, 12.0F, 8.0F, (float) (Math.PI / 5), 0.0F, 0.0F));
      $$6.a("real_tail", fvg.c().a(9, 18).a(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, $$0), fvd.a);
      return $$1;
   }

   @Override
   protected Iterable<fvb> a() {
      return ImmutableList.of(this.g);
   }

   @Override
   protected Iterable<fvb> b() {
      return ImmutableList.of(this.i, this.j, this.k, this.l, this.m, this.n, this.p);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      if ($$0.Z_()) {
         this.n.f = 0.0F;
      } else {
         this.n.f = axz.b($$1 * 0.6662F) * 1.4F * $$2;
      }

      if ($$0.y()) {
         this.p.a(-1.0F, 16.0F, -3.0F);
         this.p.e = (float) (Math.PI * 2.0 / 5.0);
         this.p.f = 0.0F;
         this.i.a(0.0F, 18.0F, 0.0F);
         this.i.e = (float) (Math.PI / 4);
         this.n.a(-1.0F, 21.0F, 6.0F);
         this.j.a(-2.5F, 22.7F, 2.0F);
         this.j.e = (float) (Math.PI * 3.0 / 2.0);
         this.k.a(0.5F, 22.7F, 2.0F);
         this.k.e = (float) (Math.PI * 3.0 / 2.0);
         this.l.e = 5.811947F;
         this.l.a(-2.49F, 17.0F, -4.0F);
         this.m.e = 5.811947F;
         this.m.a(0.51F, 17.0F, -4.0F);
      } else {
         this.i.a(0.0F, 14.0F, 2.0F);
         this.i.e = (float) (Math.PI / 2);
         this.p.a(-1.0F, 14.0F, -3.0F);
         this.p.e = this.i.e;
         this.n.a(-1.0F, 12.0F, 8.0F);
         this.j.a(-2.5F, 16.0F, 7.0F);
         this.k.a(0.5F, 16.0F, 7.0F);
         this.l.a(-2.5F, 16.0F, -4.0F);
         this.m.a(0.5F, 16.0F, -4.0F);
         this.j.e = axz.b($$1 * 0.6662F) * 1.4F * $$2;
         this.k.e = axz.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
         this.l.e = axz.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
         this.m.e = axz.b($$1 * 0.6662F) * 1.4F * $$2;
      }

      this.h.g = $$0.H($$3) + $$0.f($$3, 0.0F);
      this.p.g = $$0.f($$3, -0.08F);
      this.i.g = $$0.f($$3, -0.16F);
      this.o.g = $$0.f($$3, -0.2F);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.g.e = $$5 * (float) (Math.PI / 180.0);
      this.g.f = $$4 * (float) (Math.PI / 180.0);
      this.n.e = $$3;
   }
}
