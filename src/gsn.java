import java.util.List;
import javax.annotation.Nullable;

public class gsn implements avw {
   public static final alz a = alz.b("textures/misc/enchanted_glint_entity.png");
   public static final alz b = alz.b("textures/misc/enchanted_glint_item.png");
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   public static final hea i = hea.a(alz.b("trident"));
   public static final hea j = hea.a(alz.b("spyglass"));
   private final hdz k;
   private final gle l;
   private final fnl m;
   private final gkr n;

   public gsn(hdz $$0, fnl $$1, gkr $$2) {
      this.k = $$0;
      this.l = new gle($$0);
      this.n = $$2;
      this.m = $$1;
   }

   private void a(hdm $$0, cxo $$1, int $$2, int $$3, fgr $$4, fgv $$5) {
      bam $$6 = bam.a();
      long $$7 = 42L;

      for (jm $$8 : jm.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cxo $$0, cxm $$1, boolean $$2, fgr $$3, glk $$4, int $$5, int $$6, hdm $$7) {
      if (!$$0.f()) {
         this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, a($$1));
      }
   }

   public void a(cxo $$0, cxm $$1, boolean $$2, fgr $$3, glk $$4, int $$5, int $$6, hdm $$7, @Nullable dhh $$8, @Nullable bwf $$9, int $$10) {
      if ($$0.h() instanceof cwb $$11) {
         if (cwb.g($$0)) {
            boolean $$13 = a($$1);
            hdm $$14 = this.a(this.l.a($$11.c()), $$0, $$8, $$9, $$10);
            this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$14, $$13, -1.5F);
            cxo $$15 = cwb.i($$0);
            hdm $$16 = this.a($$15, $$8, $$9, $$10);
            this.a($$15, $$1, $$2, $$3, $$4, $$5, $$6, $$16, $$13);
            hdm $$17 = this.a(this.l.a($$11.b()), $$0, $$8, $$9, $$10);
            this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$17, $$13, 0.5F);
         } else {
            this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
         }
      }
   }

   private void a(cxo $$0, cxm $$1, boolean $$2, fgr $$3, glk $$4, int $$5, int $$6, hdm $$7, boolean $$8) {
      if ($$8) {
         if ($$0.a(cxs.wI)) {
            $$7 = this.k.a(i);
         } else if ($$0.a(cxs.rL)) {
            $$7 = this.k.a(j);
         }
      }

      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, -0.5F);
   }

   private void a(cxo $$0, cxm $$1, boolean $$2, fgr $$3, glk $$4, int $$5, int $$6, hdm $$7, boolean $$8, float $$9) {
      $$3.a();
      $$7.f().a($$1).a($$2, $$3);
      $$3.a(-0.5F, -0.5F, $$9);
      this.a($$0, $$1, $$3, $$4, $$5, $$6, $$7, $$8);
      $$3.b();
   }

   private void a(cxo $$0, cxm $$1, fgr $$2, glk $$3, int $$4, int $$5, hdm $$6, boolean $$7) {
      if (!$$6.d() && (!$$0.a(cxs.wI) || $$7)) {
         glu $$8 = glc.a($$0);
         fgv $$10;
         if (a($$0) && $$0.B()) {
            fgr.a $$9 = $$2.c().c();
            if ($$1 == cxm.g) {
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

   private static boolean a(cxm $$0) {
      return $$0 == cxm.g || $$0 == cxm.h || $$0 == cxm.i;
   }

   private static boolean a(cxo $$0) {
      return $$0.a(ayd.bv) || $$0.a(cxs.rK);
   }

   public static fgv a(glk $$0, glu $$1, boolean $$2) {
      return $$2 ? fgy.a($$0.getBuffer(glu.j()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static fgv a(glk $$0, glu $$1, fgr.a $$2) {
      return fgy.a(new fgs($$0.getBuffer(glu.l()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static fgv a(glk $$0, glu $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return fmf.O() && $$1 == gmf.j()
            ? fgy.a($$0.getBuffer(glu.k()), $$0.getBuffer($$1))
            : fgy.a($$0.getBuffer($$2 ? glu.l() : glu.m()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   private void a(fgr $$0, fgv $$1, List<gmr> $$2, cxo $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.f();
      fgr.a $$7 = $$0.c();

      for (gmr $$8 : $$2) {
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

   public hdm a(cxo $$0, @Nullable dhh $$1, @Nullable bwf $$2, int $$3) {
      hdm $$4 = this.l.a($$0);
      return this.a($$4, $$0, $$1, $$2, $$3);
   }

   public void a(cxo $$0, cxm $$1, int $$2, int $$3, fgr $$4, glk $$5, @Nullable dhh $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bwf $$0, cxo $$1, cxm $$2, boolean $$3, fgr $$4, glk $$5, @Nullable dhh $$6, int $$7, int $$8, int $$9) {
      if (!$$1.f()) {
         hdm $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(avv $$0) {
      this.l.a();
   }

   @Nullable
   public hdm a(cxo $$0, bwf $$1, cxm $$2) {
      return $$0.f() ? null : this.a($$0, $$1.dW(), $$1, $$1.ar() + $$2.ordinal());
   }

   private hdm a(hdm $$0, cxo $$1, @Nullable dhh $$2, @Nullable bwf $$3, int $$4) {
      gfj $$5 = $$2 instanceof gfj ? (gfj)$$2 : null;
      hdm $$6 = $$0.g().a($$1, $$5, $$3, $$4);
      return $$6 == null ? $$0 : $$6;
   }
}
