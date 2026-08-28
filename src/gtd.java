import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import org.joml.Matrix4f;

public class gtd {
   public static final alk a = alk.b("textures/misc/forcefield.png");
   private boolean b = true;
   private double c;
   private double d;
   private double e;
   private double f;
   private double g;
   private double h;
   private final fii i = RenderSystem.getDevice().a(() -> "World border vertex buffer", fig.a, fih.a, 16 * flo.i.b());
   private final RenderSystem.a j = RenderSystem.getSequentialBuffer(flu.c.h);

   private void a(ecy $$0, double $$1, double $$2, double $$3, float $$4, float $$5, float $$6) {
      try (fln $$7 = new fln(flo.i.b() * 4)) {
         double $$8 = $$0.e();
         double $$9 = $$0.g();
         double $$10 = $$0.f();
         double $$11 = $$0.h();
         double $$12 = Math.max((double)azq.a($$2 - $$1), $$10);
         double $$13 = Math.min((double)azq.c($$2 + $$1), $$11);
         float $$14 = (float)(azq.a($$12) & 1) * 0.5F;
         float $$15 = (float)($$13 - $$12) / 2.0F;
         double $$16 = Math.max((double)azq.a($$3 - $$1), $$8);
         double $$17 = Math.min((double)azq.c($$3 + $$1), $$9);
         float $$18 = (float)(azq.a($$16) & 1) * 0.5F;
         float $$19 = (float)($$17 - $$16) / 2.0F;
         flm $$20 = new flm($$7, flu.c.h, flo.i);
         $$20.a(0.0F, -$$4, (float)($$11 - $$12)).a($$18, $$5);
         $$20.a((float)($$17 - $$16), -$$4, (float)($$11 - $$12)).a($$19 + $$18, $$5);
         $$20.a((float)($$17 - $$16), $$4, (float)($$11 - $$12)).a($$19 + $$18, $$6);
         $$20.a(0.0F, $$4, (float)($$11 - $$12)).a($$18, $$6);
         $$20.a(0.0F, -$$4, 0.0F).a($$14, $$5);
         $$20.a(0.0F, -$$4, (float)($$13 - $$12)).a($$15 + $$14, $$5);
         $$20.a(0.0F, $$4, (float)($$13 - $$12)).a($$15 + $$14, $$6);
         $$20.a(0.0F, $$4, 0.0F).a($$14, $$6);
         $$20.a((float)($$17 - $$16), -$$4, 0.0F).a($$18, $$5);
         $$20.a(0.0F, -$$4, 0.0F).a($$19 + $$18, $$5);
         $$20.a(0.0F, $$4, 0.0F).a($$19 + $$18, $$6);
         $$20.a((float)($$17 - $$16), $$4, 0.0F).a($$18, $$6);
         $$20.a((float)($$9 - $$16), -$$4, (float)($$13 - $$12)).a($$14, $$5);
         $$20.a((float)($$9 - $$16), -$$4, 0.0F).a($$15 + $$14, $$5);
         $$20.a((float)($$9 - $$16), $$4, 0.0F).a($$15 + $$14, $$6);
         $$20.a((float)($$9 - $$16), $$4, (float)($$13 - $$12)).a($$14, $$6);

         try (flp $$21 = $$20.b()) {
            RenderSystem.getDevice().b().a(this.i, $$21.a(), 0);
         }

         this.e = $$8;
         this.f = $$9;
         this.g = $$10;
         this.h = $$11;
         this.c = $$16;
         this.d = $$12;
         this.b = false;
      }
   }

   public void a(ecy $$0, ffs $$1, double $$2, double $$3) {
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
         $$8 = azq.a($$8, 0.0, 1.0);
         double $$9 = $$1.d;
         double $$10 = $$1.f;
         float $$11 = (float)$$3;
         int $$12 = $$0.d().a();
         float $$13 = (float)aya.b($$12) / 255.0F;
         float $$14 = (float)aya.c($$12) / 255.0F;
         float $$15 = (float)aya.d($$12) / 255.0F;
         RenderSystem.setShaderColor($$13, $$14, $$15, (float)$$8);
         float $$16 = (float)(ag.c() % 3000L) / 3000.0F;
         RenderSystem.setTextureMatrix(new Matrix4f().translation($$16, $$16, 0.0F));
         float $$17 = (float)(-azq.e($$1.e * 0.5));
         float $$18 = $$17 + $$11;
         if (this.a($$0)) {
            this.a($$0, $$2, $$10, $$9, $$11, $$18, $$17);
         }

         RenderSystem.setModelOffset((float)(this.c - $$9), (float)(-$$1.e), (float)(this.d - $$10));
         hle $$19 = frf.Q().aa();
         hkn $$20 = $$19.b(a);
         $$20.a(baw.b, false);
         fjr $$21 = gsl.af;
         fjs $$22 = frf.Q().h();
         fjs $$23 = frf.Q().f.t();
         flj $$24;
         flj $$25;
         if ($$23 != null) {
            $$24 = $$23.d();
            $$25 = $$23.e();
         } else {
            $$24 = $$22.d();
            $$25 = $$22.e();
         }

         try (fld $$28 = RenderSystem.getDevice().b().a($$24, OptionalInt.empty(), $$25, OptionalDouble.empty())) {
            $$28.a($$21);
            $$28.a(this.j.b(6), this.j.a());
            $$28.a("Sampler0", $$20.a());
            $$28.a(0, this.i);
            ArrayList<fld.a> $$29 = new ArrayList<>();

            for (ecy.b $$30 : $$0.c($$9, $$10)) {
               if ($$30.b() < $$2) {
                  int $$31 = $$30.a().e();
                  $$29.add(new fld.a(0, this.i, this.j.b(0), this.j.a(), 6 * $$31, 6));
               }
            }

            $$28.a($$29);
         }

         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.resetTextureMatrix();
         RenderSystem.resetModelOffset();
      }
   }

   public void a() {
      this.b = true;
   }

   private boolean a(ecy $$0) {
      return this.b || $$0.e() != this.e || $$0.f() != this.g || $$0.g() != this.f || $$0.h() != this.h;
   }
}
