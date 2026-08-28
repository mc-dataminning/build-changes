import java.util.List;
import javax.annotation.Nullable;

public class gso implements avw {
   public static final alz a = alz.b("textures/misc/enchanted_glint_entity.png");
   public static final alz b = alz.b("textures/misc/enchanted_glint_item.png");
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   public static final heb i = heb.a(alz.b("trident"));
   public static final heb j = heb.a(alz.b("spyglass"));
   private final hea k;
   private final glf l;
   private final fnm m;
   private final gks n;

   public gso(hea $$0, fnm $$1, gks $$2) {
      this.k = $$0;
      this.l = new glf($$0);
      this.n = $$2;
      this.m = $$1;
   }

   private void a(hdn $$0, cxp $$1, int $$2, int $$3, fgs $$4, fgw $$5) {
      bam $$6 = bam.a();
      long $$7 = 42L;

      for (jm $$8 : jm.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cxp $$0, cxn $$1, boolean $$2, fgs $$3, gll $$4, int $$5, int $$6, hdn $$7) {
      if (!$$0.f()) {
         this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, a($$1));
      }
   }

   public void a(cxp $$0, cxn $$1, boolean $$2, fgs $$3, gll $$4, int $$5, int $$6, hdn $$7, @Nullable dhi $$8, @Nullable bwg $$9, int $$10) {
      if ($$0.h() instanceof cwc $$11) {
         if (cwc.g($$0)) {
            boolean $$13 = a($$1);
            hdn $$14 = this.a(this.l.a($$11.c()), $$0, $$8, $$9, $$10);
            this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$14, $$13, -1.5F);
            cxp $$15 = cwc.i($$0);
            hdn $$16 = this.a($$15, $$8, $$9, $$10);
            this.a($$15, $$1, $$2, $$3, $$4, $$5, $$6, $$16, $$13);
            hdn $$17 = this.a(this.l.a($$11.b()), $$0, $$8, $$9, $$10);
            this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$17, $$13, 0.5F);
         } else {
            this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
         }
      }
   }

   private void a(cxp $$0, cxn $$1, boolean $$2, fgs $$3, gll $$4, int $$5, int $$6, hdn $$7, boolean $$8) {
      if ($$8) {
         if ($$0.a(cxt.wI)) {
            $$7 = this.k.a(i);
         } else if ($$0.a(cxt.rL)) {
            $$7 = this.k.a(j);
         }
      }

      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, -0.5F);
   }

   private void a(cxp $$0, cxn $$1, boolean $$2, fgs $$3, gll $$4, int $$5, int $$6, hdn $$7, boolean $$8, float $$9) {
      $$3.a();
      $$7.f().a($$1).a($$2, $$3);
      $$3.a(-0.5F, -0.5F, $$9);
      this.a($$0, $$1, $$3, $$4, $$5, $$6, $$7, $$8);
      $$3.b();
   }

   private void a(cxp $$0, cxn $$1, fgs $$2, gll $$3, int $$4, int $$5, hdn $$6, boolean $$7) {
      if (!$$6.d() && (!$$0.a(cxt.wI) || $$7)) {
         glv $$8 = gld.a($$0);
         fgw $$10;
         if (a($$0) && $$0.B()) {
            fgs.a $$9 = $$2.c().c();
            if ($$1 == cxn.g) {
               f.a($$9.a(), 0.5F);
            } else if ($$1.b()) {
               f.a($$9.a(), 0.75F);
            }

            $$10 = a($$3, $$8, $$9);
         } else {
            $$10 = a($$3, $$8, true, $$0.B());
         }

         this.a($$6, $$0, $$4, $$5, $$2, $$10);
      } else {
         this.n.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static boolean a(cxn $$0) {
      return $$0 == cxn.g || $$0 == cxn.h || $$0 == cxn.i;
   }

   private static boolean a(cxp $$0) {
      return $$0.a(ayd.bv) || $$0.a(cxt.rK);
   }

   public static fgw a(gll $$0, glv $$1, boolean $$2) {
      return $$2 ? fgz.a($$0.getBuffer(glv.j()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static fgw a(gll $$0, glv $$1, fgs.a $$2) {
      return fgz.a(new fgt($$0.getBuffer(glv.l()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static fgw a(gll $$0, glv $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return fmg.O() && $$1 == gmg.j()
            ? fgz.a($$0.getBuffer(glv.k()), $$0.getBuffer($$1))
            : fgz.a($$0.getBuffer($$2 ? glv.l() : glv.m()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   private void a(fgs $$0, fgw $$1, List<gms> $$2, cxp $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.f();
      fgs.a $$7 = $$0.c();

      for (gms $$8 : $$2) {
         int $$9 = -1;
         if ($$6 && $$8.c()) {
            $$9 = this.m.a($$3, $$8.d());
         }

         float $$10 = (float)ayp.a($$9) / 255.0F;
         float $$11 = (float)ayp.b($$9) / 255.0F;
         float $$12 = (float)ayp.c($$9) / 255.0F;
         float $$13 = (float)ayp.d($$9) / 255.0F;
         $$1.a($$7, $$8, $$11, $$12, $$13, $$10, $$4, $$5);
      }
   }

   public hdn a(cxp $$0, @Nullable dhi $$1, @Nullable bwg $$2, int $$3) {
      hdn $$4 = this.l.a($$0);
      return this.a($$4, $$0, $$1, $$2, $$3);
   }

   public void a(cxp $$0, cxn $$1, int $$2, int $$3, fgs $$4, gll $$5, @Nullable dhi $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bwg $$0, cxp $$1, cxn $$2, boolean $$3, fgs $$4, gll $$5, @Nullable dhi $$6, int $$7, int $$8, int $$9) {
      if (!$$1.f()) {
         hdn $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(avv $$0) {
      this.l.a();
   }

   @Nullable
   public hdn a(cxp $$0, bwg $$1, cxn $$2) {
      return $$0.f() ? null : this.a($$0, $$1.dW(), $$1, $$1.ar() + $$2.ordinal());
   }

   private hdn a(hdn $$0, cxp $$1, @Nullable dhi $$2, @Nullable bwg $$3, int $$4) {
      gfk $$5 = $$2 instanceof gfk ? (gfk)$$2 : null;
      hdn $$6 = $$0.g().a($$1, $$5, $$3, $$4);
      return $$6 == null ? $$0 : $$6;
   }
}
