import com.mojang.blaze3d.systems.RenderSystem;
import org.joml.Matrix4f;

public class grs {
   public static final alg a = alg.b("textures/misc/forcefield.png");
   private boolean b = true;
   private double c;
   private double d;
   private double e;
   private double f;
   private double g;
   private double h;
   private fkg[] i = new fkg[4];

   public grs() {
      for (jb $$0 : jb.c.a) {
         this.i[$$0.e()] = new fkg(fhr.b);
      }
   }

   private void a(ecl $$0, double $$1, double $$2, double $$3, float $$4, float $$5, float $$6) {
      try (fka $$7 = new fka(fkb.i.b() * 4)) {
         double $$8 = $$0.e();
         double $$9 = $$0.g();
         double $$10 = $$0.f();
         double $$11 = $$0.h();
         double $$12 = Math.max((double)azm.a($$2 - $$1), $$10);
         double $$13 = Math.min((double)azm.c($$2 + $$1), $$11);
         float $$14 = (float)(azm.a($$12) & 1) * 0.5F;
         float $$15 = (float)($$13 - $$12) / 2.0F;
         double $$16 = Math.max((double)azm.a($$3 - $$1), $$8);
         double $$17 = Math.min((double)azm.c($$3 + $$1), $$9);
         float $$18 = (float)(azm.a($$16) & 1) * 0.5F;
         float $$19 = (float)($$17 - $$16) / 2.0F;

         for (jb $$20 : jb.c.a) {
            fjz $$21 = new fjz($$7, fki.c.h, fkb.i);
            switch ($$20) {
               case f:
                  $$21.a((float)($$9 - $$16), -$$4, (float)($$13 - $$12)).a($$14, $$5);
                  $$21.a((float)($$9 - $$16), -$$4, 0.0F).a($$15 + $$14, $$5);
                  $$21.a((float)($$9 - $$16), $$4, 0.0F).a($$15 + $$14, $$6);
                  $$21.a((float)($$9 - $$16), $$4, (float)($$13 - $$12)).a($$14, $$6);
                  break;
               case e:
                  $$21.a(0.0F, -$$4, 0.0F).a($$14, $$5);
                  $$21.a(0.0F, -$$4, (float)($$13 - $$12)).a($$15 + $$14, $$5);
                  $$21.a(0.0F, $$4, (float)($$13 - $$12)).a($$15 + $$14, $$6);
                  $$21.a(0.0F, $$4, 0.0F).a($$14, $$6);
                  break;
               case d:
                  $$21.a(0.0F, -$$4, (float)($$11 - $$12)).a($$18, $$5);
                  $$21.a((float)($$17 - $$16), -$$4, (float)($$11 - $$12)).a($$19 + $$18, $$5);
                  $$21.a((float)($$17 - $$16), $$4, (float)($$11 - $$12)).a($$19 + $$18, $$6);
                  $$21.a(0.0F, $$4, (float)($$11 - $$12)).a($$18, $$6);
                  break;
               case c:
                  $$21.a((float)($$17 - $$16), -$$4, 0.0F).a($$18, $$5);
                  $$21.a(0.0F, -$$4, 0.0F).a($$19 + $$18, $$5);
                  $$21.a(0.0F, $$4, 0.0F).a($$19 + $$18, $$6);
                  $$21.a((float)($$17 - $$16), $$4, 0.0F).a($$18, $$6);
            }

            this.i[$$20.e()].a();
            this.i[$$20.e()].a($$21.b());
         }

         fkg.b();
         this.e = $$8;
         this.f = $$9;
         this.g = $$10;
         this.h = $$11;
         this.c = $$16;
         this.d = $$12;
         this.b = false;
      }
   }

   public void a(ecl $$0, ffc $$1, double $$2, double $$3) {
      double $$4 = $$0.e();
      double $$5 = $$0.g();
      double $$6 = $$0.f();
      double $$7 = $$0.h();
      if ((!($$1.d < $$5 - $$2) || !($$1.d > $$4 + $$2) || !($$1.f < $$7 - $$2) || !($$1.f > $$6 + $$2))
         && !($$1.d < $$4 - $$2)
         && !($$1.d > $$5 + $$2)
         && !($$1.f < $$6 - $$2)
         && !($$1.f > $$7 + $$2)) {
         double $$8 = 1.0 - $$0.b($$1.d, $$1.f) / $$2;
         $$8 = Math.pow($$8, 4.0);
         $$8 = azm.a($$8, 0.0, 1.0);
         double $$9 = $$1.d;
         double $$10 = $$1.f;
         float $$11 = (float)$$3;
         grc $$12 = grc.G();
         int $$13 = $$0.d().a();
         float $$14 = (float)axw.b($$13) / 255.0F;
         float $$15 = (float)axw.c($$13) / 255.0F;
         float $$16 = (float)axw.d($$13) / 255.0F;
         RenderSystem.setShaderColor($$14, $$15, $$16, (float)$$8);
         float $$17 = (float)(ag.c() % 3000L) / 3000.0F;
         RenderSystem.setTextureMatrix(new Matrix4f().translation($$17, $$17, 0.0F));
         float $$18 = (float)(-azm.e($$1.e * 0.5));
         float $$19 = $$18 + $$11;
         if (this.a($$0)) {
            this.a($$0, $$2, $$10, $$9, $$11, $$19, $$18);
         }

         RenderSystem.setModelOffset((float)(this.c - $$9), (float)(-$$1.e), (float)(this.d - $$10));

         for (ecl.b $$20 : $$0.c($$9, $$10)) {
            if ($$20.b() < $$2) {
               this.i[$$20.a().e()].a($$12);
            }
         }

         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.resetTextureMatrix();
         RenderSystem.resetModelOffset();
      }
   }

   public void a() {
      this.b = true;
   }

   private boolean a(ecl $$0) {
      return this.b || $$0.e() != this.e || $$0.f() != this.g || $$0.g() != this.f || $$0.h() != this.h;
   }
}
