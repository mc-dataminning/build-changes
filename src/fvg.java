import com.google.common.collect.ImmutableList;

public class fvg<T extends cfu> extends ftv<T> {
   private static final float a = 50.0F;
   private static final float b = -40.0F;
   private static final String f = "left_haunch";
   private static final String g = "right_haunch";
   private final fwv h;
   private final fwv i;
   private final fwv j;
   private final fwv k;
   private final fwv l;
   private final fwv m;
   private final fwv n;
   private final fwv o;
   private final fwv p;
   private final fwv q;
   private final fwv r;
   private final fwv s;
   private float t;
   private static final float u = 0.6F;

   public fvg(fwv $$0) {
      this.h = $$0.b("left_hind_foot");
      this.i = $$0.b("right_hind_foot");
      this.j = $$0.b("left_haunch");
      this.k = $$0.b("right_haunch");
      this.l = $$0.b("body");
      this.m = $$0.b("left_front_leg");
      this.n = $$0.b("right_front_leg");
      this.o = $$0.b("head");
      this.p = $$0.b("right_ear");
      this.q = $$0.b("left_ear");
      this.r = $$0.b("tail");
      this.s = $$0.b("nose");
   }

   public static fxb a() {
      fxd $$0 = new fxd();
      fxe $$1 = $$0.a();
      $$1.a("left_hind_foot", fxa.c().a(26, 24).a(-1.0F, 5.5F, -3.7F, 2.0F, 1.0F, 7.0F), fwx.a(3.0F, 17.5F, 3.7F));
      $$1.a("right_hind_foot", fxa.c().a(8, 24).a(-1.0F, 5.5F, -3.7F, 2.0F, 1.0F, 7.0F), fwx.a(-3.0F, 17.5F, 3.7F));
      $$1.a("left_haunch", fxa.c().a(30, 15).a(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 5.0F), fwx.a(3.0F, 17.5F, 3.7F, (float) (-Math.PI / 9), 0.0F, 0.0F));
      $$1.a("right_haunch", fxa.c().a(16, 15).a(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 5.0F), fwx.a(-3.0F, 17.5F, 3.7F, (float) (-Math.PI / 9), 0.0F, 0.0F));
      $$1.a("body", fxa.c().a(0, 0).a(-3.0F, -2.0F, -10.0F, 6.0F, 5.0F, 10.0F), fwx.a(0.0F, 19.0F, 8.0F, (float) (-Math.PI / 9), 0.0F, 0.0F));
      $$1.a("left_front_leg", fxa.c().a(8, 15).a(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F), fwx.a(3.0F, 17.0F, -1.0F, (float) (-Math.PI / 18), 0.0F, 0.0F));
      $$1.a("right_front_leg", fxa.c().a(0, 15).a(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F), fwx.a(-3.0F, 17.0F, -1.0F, (float) (-Math.PI / 18), 0.0F, 0.0F));
      $$1.a("head", fxa.c().a(32, 0).a(-2.5F, -4.0F, -5.0F, 5.0F, 4.0F, 5.0F), fwx.a(0.0F, 16.0F, -1.0F));
      $$1.a("right_ear", fxa.c().a(52, 0).a(-2.5F, -9.0F, -1.0F, 2.0F, 5.0F, 1.0F), fwx.a(0.0F, 16.0F, -1.0F, 0.0F, (float) (-Math.PI / 12), 0.0F));
      $$1.a("left_ear", fxa.c().a(58, 0).a(0.5F, -9.0F, -1.0F, 2.0F, 5.0F, 1.0F), fwx.a(0.0F, 16.0F, -1.0F, 0.0F, (float) (Math.PI / 12), 0.0F));
      $$1.a("tail", fxa.c().a(52, 6).a(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 2.0F), fwx.a(0.0F, 20.0F, 7.0F, -0.3490659F, 0.0F, 0.0F));
      $$1.a("nose", fxa.c().a(32, 9).a(-0.5F, -2.5F, -5.5F, 1.0F, 1.0F, 1.0F), fwx.a(0.0F, 16.0F, -1.0F));
      return fxb.a($$0, 64, 32);
   }

   @Override
   public void a(ezt $$0, ezx $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      if (this.e) {
         float $$8 = 1.5F;
         $$0.a();
         $$0.b(0.56666666F, 0.56666666F, 0.56666666F);
         $$0.a(0.0F, 1.375F, 0.125F);
         ImmutableList.of(this.o, this.q, this.p, this.s).forEach($$8x -> $$8x.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
         $$0.b();
         $$0.a();
         $$0.b(0.4F, 0.4F, 0.4F);
         $$0.a(0.0F, 2.25F, 0.0F);
         ImmutableList.of(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.r).forEach($$8x -> $$8x.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
         $$0.b();
      } else {
         $$0.a();
         $$0.b(0.6F, 0.6F, 0.6F);
         $$0.a(0.0F, 1.0F, 0.0F);
         ImmutableList.of(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, new fwv[0])
            .forEach($$8x -> $$8x.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
         $$0.b();
      }
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$3 - (float)$$0.ai;
      this.s.e = $$5 * (float) (Math.PI / 180.0);
      this.o.e = $$5 * (float) (Math.PI / 180.0);
      this.p.e = $$5 * (float) (Math.PI / 180.0);
      this.q.e = $$5 * (float) (Math.PI / 180.0);
      this.s.f = $$4 * (float) (Math.PI / 180.0);
      this.o.f = $$4 * (float) (Math.PI / 180.0);
      this.p.f = this.s.f - (float) (Math.PI / 12);
      this.q.f = this.s.f + (float) (Math.PI / 12);
      this.t = ayu.a($$0.G($$6) * (float) Math.PI);
      this.j.e = (this.t * 50.0F - 21.0F) * (float) (Math.PI / 180.0);
      this.k.e = (this.t * 50.0F - 21.0F) * (float) (Math.PI / 180.0);
      this.h.e = this.t * 50.0F * (float) (Math.PI / 180.0);
      this.i.e = this.t * 50.0F * (float) (Math.PI / 180.0);
      this.m.e = (this.t * -40.0F - 11.0F) * (float) (Math.PI / 180.0);
      this.n.e = (this.t * -40.0F - 11.0F) * (float) (Math.PI / 180.0);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.t = ayu.a($$0.G($$3) * (float) Math.PI);
   }
}
