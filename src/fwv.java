import com.google.common.collect.ImmutableList;

public class fwv<T extends cfy> extends fvk<T> {
   private static final float a = 50.0F;
   private static final float b = -40.0F;
   private static final String f = "left_haunch";
   private static final String g = "right_haunch";
   private final fyk h;
   private final fyk i;
   private final fyk j;
   private final fyk k;
   private final fyk l;
   private final fyk m;
   private final fyk n;
   private final fyk o;
   private final fyk p;
   private final fyk q;
   private final fyk r;
   private final fyk s;
   private float t;
   private static final float u = 0.6F;

   public fwv(fyk $$0) {
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

   public static fyq a() {
      fys $$0 = new fys();
      fyt $$1 = $$0.a();
      $$1.a("left_hind_foot", fyp.c().a(26, 24).a(-1.0F, 5.5F, -3.7F, 2.0F, 1.0F, 7.0F), fym.a(3.0F, 17.5F, 3.7F));
      $$1.a("right_hind_foot", fyp.c().a(8, 24).a(-1.0F, 5.5F, -3.7F, 2.0F, 1.0F, 7.0F), fym.a(-3.0F, 17.5F, 3.7F));
      $$1.a("left_haunch", fyp.c().a(30, 15).a(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 5.0F), fym.a(3.0F, 17.5F, 3.7F, (float) (-Math.PI / 9), 0.0F, 0.0F));
      $$1.a("right_haunch", fyp.c().a(16, 15).a(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 5.0F), fym.a(-3.0F, 17.5F, 3.7F, (float) (-Math.PI / 9), 0.0F, 0.0F));
      $$1.a("body", fyp.c().a(0, 0).a(-3.0F, -2.0F, -10.0F, 6.0F, 5.0F, 10.0F), fym.a(0.0F, 19.0F, 8.0F, (float) (-Math.PI / 9), 0.0F, 0.0F));
      $$1.a("left_front_leg", fyp.c().a(8, 15).a(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F), fym.a(3.0F, 17.0F, -1.0F, (float) (-Math.PI / 18), 0.0F, 0.0F));
      $$1.a("right_front_leg", fyp.c().a(0, 15).a(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F), fym.a(-3.0F, 17.0F, -1.0F, (float) (-Math.PI / 18), 0.0F, 0.0F));
      $$1.a("head", fyp.c().a(32, 0).a(-2.5F, -4.0F, -5.0F, 5.0F, 4.0F, 5.0F), fym.a(0.0F, 16.0F, -1.0F));
      $$1.a("right_ear", fyp.c().a(52, 0).a(-2.5F, -9.0F, -1.0F, 2.0F, 5.0F, 1.0F), fym.a(0.0F, 16.0F, -1.0F, 0.0F, (float) (-Math.PI / 12), 0.0F));
      $$1.a("left_ear", fyp.c().a(58, 0).a(0.5F, -9.0F, -1.0F, 2.0F, 5.0F, 1.0F), fym.a(0.0F, 16.0F, -1.0F, 0.0F, (float) (Math.PI / 12), 0.0F));
      $$1.a("tail", fyp.c().a(52, 6).a(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 2.0F), fym.a(0.0F, 20.0F, 7.0F, -0.3490659F, 0.0F, 0.0F));
      $$1.a("nose", fyp.c().a(32, 9).a(-0.5F, -2.5F, -5.5F, 1.0F, 1.0F, 1.0F), fym.a(0.0F, 16.0F, -1.0F));
      return fyq.a($$0, 64, 32);
   }

   @Override
   public void a(fbi $$0, fbm $$1, int $$2, int $$3, int $$4) {
      if (this.e) {
         float $$5 = 1.5F;
         $$0.a();
         $$0.b(0.56666666F, 0.56666666F, 0.56666666F);
         $$0.a(0.0F, 1.375F, 0.125F);
         ImmutableList.of(this.o, this.q, this.p, this.s).forEach($$5x -> $$5x.a($$0, $$1, $$2, $$3, $$4));
         $$0.b();
         $$0.a();
         $$0.b(0.4F, 0.4F, 0.4F);
         $$0.a(0.0F, 2.25F, 0.0F);
         ImmutableList.of(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.r).forEach($$5x -> $$5x.a($$0, $$1, $$2, $$3, $$4));
         $$0.b();
      } else {
         $$0.a();
         $$0.b(0.6F, 0.6F, 0.6F);
         $$0.a(0.0F, 1.0F, 0.0F);
         ImmutableList.of(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, new fyk[0])
            .forEach($$5x -> $$5x.a($$0, $$1, $$2, $$3, $$4));
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
      this.t = ayo.a($$0.H($$6) * (float) Math.PI);
      this.j.e = (this.t * 50.0F - 21.0F) * (float) (Math.PI / 180.0);
      this.k.e = (this.t * 50.0F - 21.0F) * (float) (Math.PI / 180.0);
      this.h.e = this.t * 50.0F * (float) (Math.PI / 180.0);
      this.i.e = this.t * 50.0F * (float) (Math.PI / 180.0);
      this.m.e = (this.t * -40.0F - 11.0F) * (float) (Math.PI / 180.0);
      this.n.e = (this.t * -40.0F - 11.0F) * (float) (Math.PI / 180.0);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.t = ayo.a($$0.H($$3) * (float) Math.PI);
   }
}
