import org.joml.Matrix4f;

public class glx {
   private static final float a = -0.01F;
   private static final float b = -0.001F;
   private static final int c = 128;
   private static final int d = 128;
   private final hfr e;
   private final hfq f;

   public glx(hfq $$0, hfr $$1) {
      this.f = $$0;
      this.e = $$1;
   }

   public void a(heb $$0, ffu $$1, gly $$2, boolean $$3, int $$4) {
      Matrix4f $$5 = $$1.c().a();
      ffy $$6 = $$2.getBuffer(gmi.u($$0.a));
      $$6.a($$5, 0.0F, 128.0F, -0.01F).a(-1).a(0.0F, 1.0F).c($$4);
      $$6.a($$5, 128.0F, 128.0F, -0.01F).a(-1).a(1.0F, 1.0F).c($$4);
      $$6.a($$5, 128.0F, 0.0F, -0.01F).a(-1).a(1.0F, 0.0F).c($$4);
      $$6.a($$5, 0.0F, 0.0F, -0.01F).a(-1).a(0.0F, 0.0F).c($$4);
      int $$7 = 0;

      for (heb.a $$8 : $$0.b) {
         if (!$$3 || $$8.e) {
            $$1.a();
            $$1.a((float)$$8.b / 2.0F + 64.0F, (float)$$8.c / 2.0F + 64.0F, -0.02F);
            $$1.a(a.f.rotationDegrees((float)($$8.d * 360) / 16.0F));
            $$1.b(4.0F, 4.0F, 3.0F);
            $$1.a(-0.125F, 0.125F, 0.0F);
            Matrix4f $$9 = $$1.c().a();
            hes $$10 = $$8.a;
            if ($$10 != null) {
               ffy $$11 = $$2.getBuffer(gmi.u($$10.i()));
               $$11.a($$9, -1.0F, 1.0F, (float)$$7 * -0.001F).a(-1).a($$10.c(), $$10.g()).c($$4);
               $$11.a($$9, 1.0F, 1.0F, (float)$$7 * -0.001F).a(-1).a($$10.d(), $$10.g()).c($$4);
               $$11.a($$9, 1.0F, -1.0F, (float)$$7 * -0.001F).a(-1).a($$10.d(), $$10.h()).c($$4);
               $$11.a($$9, -1.0F, -1.0F, (float)$$7 * -0.001F).a(-1).a($$10.c(), $$10.h()).c($$4);
               $$1.b();
            }

            if ($$8.f != null) {
               foc $$12 = flj.Q().h;
               float $$13 = (float)$$12.a($$8.f);
               float $$14 = ayz.a(25.0F / $$13, 0.0F, 6.0F / 9.0F);
               $$1.a();
               $$1.a((float)$$8.b / 2.0F + 64.0F - $$13 * $$14 / 2.0F, (float)$$8.c / 2.0F + 64.0F + 4.0F, -0.025F);
               $$1.b($$14, $$14, 1.0F);
               $$1.a(0.0F, 0.0F, -0.1F);
               $$12.a($$8.f, 0.0F, 0.0F, -1, false, $$1.c().a(), $$2, foc.a.a, Integer.MIN_VALUE, $$4, false);
               $$1.b();
            }

            $$7++;
         }
      }
   }

   public void a(eur $$0, eut $$1, heb $$2) {
      $$2.a = this.e.b($$0, $$1);
      $$2.b.clear();

      for (eun $$3 : $$1.h()) {
         $$2.b.add(this.a($$3));
      }
   }

   private heb.a a(eun $$0) {
      heb.a $$1 = new heb.a();
      $$1.a = this.f.a($$0);
      $$1.b = $$0.d();
      $$1.c = $$0.e();
      $$1.d = $$0.f();
      $$1.f = $$0.g().orElse(null);
      $$1.e = $$0.b();
      return $$1;
   }
}
