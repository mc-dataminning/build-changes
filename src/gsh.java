import java.util.List;
import javax.annotation.Nullable;

public class gsh implements avw {
   public static final alz a = alz.b("textures/misc/enchanted_glint_entity.png");
   public static final alz b = alz.b("textures/misc/enchanted_glint_item.png");
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   public static final hdu i = hdu.a(alz.b("trident"));
   public static final hdu j = hdu.a(alz.b("spyglass"));
   private final hdt k;
   private final gky l;
   private final fnf m;
   private final gkl n;

   public gsh(hdt $$0, fnf $$1, gkl $$2) {
      this.k = $$0;
      this.l = new gky($$0);
      this.n = $$2;
      this.m = $$1;
   }

   private void a(hdg $$0, cxk $$1, int $$2, int $$3, fgl $$4, fgp $$5) {
      bam $$6 = bam.a();
      long $$7 = 42L;

      for (jm $$8 : jm.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cxk $$0, cxi $$1, boolean $$2, fgl $$3, gle $$4, int $$5, int $$6, hdg $$7) {
      if (!$$0.f()) {
         this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, a($$1));
      }
   }

   public void a(cxk $$0, cxi $$1, boolean $$2, fgl $$3, gle $$4, int $$5, int $$6, hdg $$7, @Nullable dha $$8, @Nullable bwb $$9, int $$10) {
      if ($$0.h() instanceof cvx $$11) {
         if (cvx.g($$0)) {
            boolean $$13 = a($$1);
            hdg $$14 = this.a(this.l.a($$11.c()), $$0, $$8, $$9, $$10);
            this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$14, $$13, -1.5F);
            cxk $$15 = cvx.i($$0);
            hdg $$16 = this.a($$15, $$8, $$9, $$10);
            this.a($$15, $$1, $$2, $$3, $$4, $$5, $$6, $$16, $$13);
            hdg $$17 = this.a(this.l.a($$11.b()), $$0, $$8, $$9, $$10);
            this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$17, $$13, 0.5F);
         } else {
            this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
         }
      }
   }

   private void a(cxk $$0, cxi $$1, boolean $$2, fgl $$3, gle $$4, int $$5, int $$6, hdg $$7, boolean $$8) {
      if ($$8) {
         if ($$0.a(cxo.wI)) {
            $$7 = this.k.a(i);
         } else if ($$0.a(cxo.rL)) {
            $$7 = this.k.a(j);
         }
      }

      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, -0.5F);
   }

   private void a(cxk $$0, cxi $$1, boolean $$2, fgl $$3, gle $$4, int $$5, int $$6, hdg $$7, boolean $$8, float $$9) {
      $$3.a();
      $$7.f().a($$1).a($$2, $$3);
      $$3.a(-0.5F, -0.5F, $$9);
      this.a($$0, $$1, $$3, $$4, $$5, $$6, $$7, $$8);
      $$3.b();
   }

   private void a(cxk $$0, cxi $$1, fgl $$2, gle $$3, int $$4, int $$5, hdg $$6, boolean $$7) {
      if (!$$6.d() && (!$$0.a(cxo.wI) || $$7)) {
         glo $$8 = gkw.a($$0);
         fgp $$10;
         if (a($$0) && $$0.B()) {
            fgl.a $$9 = $$2.c().c();
            if ($$1 == cxi.g) {
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

   private static boolean a(cxi $$0) {
      return $$0 == cxi.g || $$0 == cxi.h || $$0 == cxi.i;
   }

   private static boolean a(cxk $$0) {
      return $$0.a(ayd.bv) || $$0.a(cxo.rK);
   }

   public static fgp a(gle $$0, glo $$1, boolean $$2) {
      return $$2 ? fgs.a($$0.getBuffer(glo.j()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static fgp a(gle $$0, glo $$1, fgl.a $$2) {
      return fgs.a(new fgm($$0.getBuffer(glo.l()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static fgp a(gle $$0, glo $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return flz.O() && $$1 == glz.j()
            ? fgs.a($$0.getBuffer(glo.k()), $$0.getBuffer($$1))
            : fgs.a($$0.getBuffer($$2 ? glo.l() : glo.m()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   private void a(fgl $$0, fgp $$1, List<gml> $$2, cxk $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.f();
      fgl.a $$7 = $$0.c();

      for (gml $$8 : $$2) {
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

   public hdg a(cxk $$0, @Nullable dha $$1, @Nullable bwb $$2, int $$3) {
      hdg $$4 = this.l.a($$0);
      return this.a($$4, $$0, $$1, $$2, $$3);
   }

   public void a(cxk $$0, cxi $$1, int $$2, int $$3, fgl $$4, gle $$5, @Nullable dha $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bwb $$0, cxk $$1, cxi $$2, boolean $$3, fgl $$4, gle $$5, @Nullable dha $$6, int $$7, int $$8, int $$9) {
      if (!$$1.f()) {
         hdg $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(avv $$0) {
      this.l.a();
   }

   @Nullable
   public hdg a(cxk $$0, bwb $$1, cxi $$2) {
      return $$0.f() ? null : this.a($$0, $$1.dV(), $$1, $$1.ar() + $$2.ordinal());
   }

   private hdg a(hdg $$0, cxk $$1, @Nullable dha $$2, @Nullable bwb $$3, int $$4) {
      gfd $$5 = $$2 instanceof gfd ? (gfd)$$2 : null;
      hdg $$6 = $$0.g().a($$1, $$5, $$3, $$4);
      return $$6 == null ? $$0 : $$6;
   }
}
