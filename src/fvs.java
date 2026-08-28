public class fvs<T extends btd> extends fvt<T> {
   public final fxo a = this.k.b("right_ear");
   private final fxo A = this.k.b("left_ear");
   private final fxq B = this.m.a();
   private final fxq C = this.k.a();
   private final fxq D = this.o.a();
   private final fxq E = this.n.a();

   public fvs(fxo $$0) {
      super($$0, false);
   }

   public static fxw a(fxs $$0) {
      fxw $$1 = fvt.a($$0, false);
      fxx $$2 = $$1.a();
      $$2.a("body", fxt.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0), fxq.a);
      a($$0, $$1);
      $$2.a("hat", fxt.c(), fxq.a);
      return $$1;
   }

   public static void a(fxs $$0, fxw $$1) {
      fxx $$2 = $$1.a();
      fxx $$3 = $$2.a(
         "head",
         fxt.c()
            .a(0, 0)
            .a(-5.0F, -8.0F, -4.0F, 10.0F, 8.0F, 8.0F, $$0)
            .a(31, 1)
            .a(-2.0F, -4.0F, -5.0F, 4.0F, 4.0F, 1.0F, $$0)
            .a(2, 4)
            .a(2.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, $$0)
            .a(2, 0)
            .a(-3.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, $$0),
         fxq.a
      );
      $$3.a("left_ear", fxt.c().a(51, 6).a(0.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, $$0), fxq.a(4.5F, -6.0F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 6)));
      $$3.a("right_ear", fxt.c().a(39, 6).a(-1.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, $$0), fxq.a(-4.5F, -6.0F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 6)));
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.m.b(this.B);
      this.k.b(this.C);
      this.o.b(this.D);
      this.n.b(this.E);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = (float) (Math.PI / 6);
      float $$7 = $$3 * 0.1F + $$1 * 0.5F;
      float $$8 = 0.08F + $$2 * 0.4F;
      this.A.g = (float) (-Math.PI / 6) - ayg.b($$7 * 1.2F) * $$8;
      this.a.g = (float) (Math.PI / 6) + ayg.b($$7) * $$8;
      if ($$0 instanceof ckz $$9) {
         clc $$10 = $$9.gq();
         if ($$10 == clc.e) {
            float $$11 = $$3 / 60.0F;
            this.a.g = (float) (Math.PI / 6) + (float) (Math.PI / 180.0) * ayg.a($$11 * 30.0F) * 10.0F;
            this.A.g = (float) (-Math.PI / 6) - (float) (Math.PI / 180.0) * ayg.b($$11 * 30.0F) * 10.0F;
            this.k.b = ayg.a($$11 * 10.0F);
            this.k.c = ayg.a($$11 * 40.0F) + 0.4F;
            this.n.g = (float) (Math.PI / 180.0) * (70.0F + ayg.b($$11 * 40.0F) * 10.0F);
            this.o.g = this.n.g * -1.0F;
            this.n.c = ayg.a($$11 * 40.0F) * 0.5F + 1.5F;
            this.o.c = ayg.a($$11 * 40.0F) * 0.5F + 1.5F;
            this.m.c = ayg.a($$11 * 40.0F) * 0.35F;
         } else if ($$10 == clc.a && this.c == 0.0F) {
            this.a($$0);
         } else if ($$10 == clc.b) {
            ftl.a(this.n, this.o, this.k, !$$0.ge());
         } else if ($$10 == clc.c) {
            ftl.a(this.n, this.o, $$0, !$$0.ge());
         } else if ($$10 == clc.d) {
            this.k.e = 0.5F;
            this.k.f = 0.0F;
            if ($$0.ge()) {
               this.n.f = -0.5F;
               this.n.e = -0.9F;
            } else {
               this.o.f = 0.5F;
               this.o.e = -0.9F;
            }
         }
      } else if ($$0.al() == bsm.bx) {
         ftl.a(this.o, this.n, $$0.gf(), this.c, $$3);
      }

      this.x.a(this.q);
      this.y.a(this.p);
      this.b.a(this.o);
      this.w.a(this.n);
      this.z.a(this.m);
      this.l.a(this.k);
   }

   protected void a(T $$0, float $$1) {
      if (this.c > 0.0F && $$0 instanceof cla && ((cla)$$0).gq() == clc.a) {
         ftl.a(this.n, this.o, $$0, this.c, $$1);
      } else {
         super.a($$0, $$1);
      }
   }

   private void a(T $$0) {
      if ($$0.ge()) {
         this.o.e = -1.8F;
      } else {
         this.n.e = -1.8F;
      }
   }
}
