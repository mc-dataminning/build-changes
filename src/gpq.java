import org.joml.Matrix4f;

public class gpq {
   private static final float a = -0.01F;
   private static final float b = -0.001F;
   private static final int c = 128;
   private static final int d = 128;
   private final hjn e;
   private final hjm f;

   public gpq(hjm $$0, hjn $$1) {
      this.f = $$0;
      this.e = $$1;
   }

   public void a(hhy $$0, fjc $$1, gps $$2, boolean $$3, int $$4) {
      Matrix4f $$5 = $$1.c().a();
      fjg $$6 = $$2.getBuffer(gqc.u($$0.a));
      $$6.a($$5, 0.0F, 128.0F, -0.01F).a(-1).a(0.0F, 1.0F).c($$4);
      $$6.a($$5, 128.0F, 128.0F, -0.01F).a(-1).a(1.0F, 1.0F).c($$4);
      $$6.a($$5, 128.0F, 0.0F, -0.01F).a(-1).a(1.0F, 0.0F).c($$4);
      $$6.a($$5, 0.0F, 0.0F, -0.01F).a(-1).a(0.0F, 0.0F).c($$4);
      int $$7 = 0;

      for (hhy.a $$8 : $$0.b) {
         if (!$$3 || $$8.e) {
            $$1.a();
            $$1.a((float)$$8.b / 2.0F + 64.0F, (float)$$8.c / 2.0F + 64.0F, -0.02F);
            $$1.a(a.f.rotationDegrees((float)($$8.d * 360) / 16.0F));
            $$1.b(4.0F, 4.0F, 3.0F);
            $$1.a(-0.125F, 0.125F, 0.0F);
            Matrix4f $$9 = $$1.c().a();
            hip $$10 = $$8.a;
            if ($$10 != null) {
               fjg $$11 = $$2.getBuffer(gqc.u($$10.i()));
               $$11.a($$9, -1.0F, 1.0F, (float)$$7 * -0.001F).a(-1).a($$10.c(), $$10.g()).c($$4);
               $$11.a($$9, 1.0F, 1.0F, (float)$$7 * -0.001F).a(-1).a($$10.d(), $$10.g()).c($$4);
               $$11.a($$9, 1.0F, -1.0F, (float)$$7 * -0.001F).a(-1).a($$10.d(), $$10.h()).c($$4);
               $$11.a($$9, -1.0F, -1.0F, (float)$$7 * -0.001F).a(-1).a($$10.c(), $$10.h()).c($$4);
               $$1.b();
            }

            if ($$8.f != null) {
               frm $$12 = fos.Q().h;
               float $$13 = (float)$$12.a($$8.f);
               float $$14 = azm.a(25.0F / $$13, 0.0F, 6.0F / 9.0F);
               $$1.a();
               $$1.a((float)$$8.b / 2.0F + 64.0F - $$13 * $$14 / 2.0F, (float)$$8.c / 2.0F + 64.0F + 4.0F, -0.025F);
               $$1.b($$14, $$14, 1.0F);
               $$1.a(0.0F, 0.0F, -0.1F);
               $$12.a($$8.f, 0.0F, 0.0F, -1, false, $$1.c().a(), $$2, frm.a.a, Integer.MIN_VALUE, $$4, false);
               $$1.b();
            }

            $$7++;
         }
      }
   }

   public void a(exz $$0, eyb $$1, hhy $$2) {
      $$2.a = this.e.b($$0, $$1);
      $$2.b.clear();

      for (exv $$3 : $$1.e()) {
         $$2.b.add(this.a($$3));
      }
   }

   private hhy.a a(exv $$0) {
      hhy.a $$1 = new hhy.a();
      $$1.a = this.f.a($$0);
      $$1.b = $$0.d();
      $$1.c = $$0.e();
      $$1.d = $$0.f();
      $$1.f = $$0.g().orElse(null);
      $$1.e = $$0.b();
      return $$1;
   }
}
