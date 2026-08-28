public class fur<T extends cgl> extends fux<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final fxo g;
   private final fxo h;
   private final fxo i;
   private final fxo j;
   private final fxo k;
   private final fxo l;
   private final fxo m;
   private final fxo n;
   private final fxo o;
   private final fxo p;

   public fur(fxo $$0) {
      this.g = $$0.b("root");
      this.h = this.g.b("body");
      this.i = this.h.b("head");
      this.j = this.i.b("eyes");
      this.k = this.h.b("tongue");
      this.l = this.h.b("left_arm");
      this.m = this.h.b("right_arm");
      this.n = this.g.b("left_leg");
      this.o = this.g.b("right_leg");
      this.p = this.h.b("croaking_body");
   }

   public static fxu b() {
      fxw $$0 = new fxw();
      fxx $$1 = $$0.a();
      fxx $$2 = $$1.a("root", fxt.c(), fxq.a(0.0F, 24.0F, 0.0F));
      fxx $$3 = $$2.a(
         "body", fxt.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), fxq.a(0.0F, -2.0F, 4.0F)
      );
      fxx $$4 = $$3.a(
         "head", fxt.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), fxq.a(0.0F, -2.0F, -1.0F)
      );
      fxx $$5 = $$4.a("eyes", fxt.c(), fxq.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", fxt.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fxq.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", fxt.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fxq.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", fxt.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new fxs(-0.1F)), fxq.a(0.0F, -1.0F, -5.0F));
      fxx $$6 = $$3.a("tongue", fxt.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), fxq.a(0.0F, -1.01F, 1.0F));
      fxx $$7 = $$3.a("left_arm", fxt.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fxq.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", fxt.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fxq.a(0.0F, 3.0F, -1.0F));
      fxx $$8 = $$3.a("right_arm", fxt.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fxq.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", fxt.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), fxq.a(0.0F, 3.0F, 0.0F));
      fxx $$9 = $$2.a("left_leg", fxt.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fxq.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", fxt.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fxq.a(2.0F, 3.0F, 0.0F));
      fxx $$10 = $$2.a("right_leg", fxt.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fxq.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", fxt.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fxq.a(-2.0F, 3.0F, 0.0F));
      return fxu.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fxo::c);
      this.a($$0.ce, fgq.c, $$3);
      this.a($$0.cf, fgq.a, $$3);
      this.a($$0.cg, fgq.d, $$3);
      if ($$0.bi()) {
         this.a(fgq.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(fgq.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.ch, fgq.f, $$3);
      this.p.k = $$0.cf.c();
   }

   @Override
   public fxo a() {
      return this.g;
   }
}
