import java.util.List;
import javax.annotation.Nullable;

public class gsm implements avw {
   public static final alz a = alz.b("textures/misc/enchanted_glint_entity.png");
   public static final alz b = alz.b("textures/misc/enchanted_glint_item.png");
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   public static final hdz i = hdz.a(alz.b("trident"));
   public static final hdz j = hdz.a(alz.b("spyglass"));
   private final hdy k;
   private final gld l;
   private final fnk m;
   private final gkq n;

   public gsm(hdy $$0, fnk $$1, gkq $$2) {
      this.k = $$0;
      this.l = new gld($$0);
      this.n = $$2;
      this.m = $$1;
   }

   private void a(hdl $$0, cxo $$1, int $$2, int $$3, fgq $$4, fgu $$5) {
      bam $$6 = bam.a();
      long $$7 = 42L;

      for (jm $$8 : jm.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cxo $$0, cxm $$1, boolean $$2, fgq $$3, glj $$4, int $$5, int $$6, hdl $$7) {
      if (!$$0.f()) {
         this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, a($$1));
      }
   }

   public void a(cxo $$0, cxm $$1, boolean $$2, fgq $$3, glj $$4, int $$5, int $$6, hdl $$7, @Nullable dhh $$8, @Nullable bwf $$9, int $$10) {
      if ($$0.h() instanceof cwb $$11) {
         if (cwb.g($$0)) {
            boolean $$13 = a($$1);
            hdl $$14 = this.a(this.l.a($$11.c()), $$0, $$8, $$9, $$10);
            this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$14, $$13, -1.5F);
            cxo $$15 = cwb.i($$0);
            hdl $$16 = this.a($$15, $$8, $$9, $$10);
            this.a($$15, $$1, $$2, $$3, $$4, $$5, $$6, $$16, $$13);
            hdl $$17 = this.a(this.l.a($$11.b()), $$0, $$8, $$9, $$10);
            this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$17, $$13, 0.5F);
         } else {
            this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
         }
      }
   }

   private void a(cxo $$0, cxm $$1, boolean $$2, fgq $$3, glj $$4, int $$5, int $$6, hdl $$7, boolean $$8) {
      if ($$8) {
         if ($$0.a(cxs.wI)) {
            $$7 = this.k.a(i);
         } else if ($$0.a(cxs.rL)) {
            $$7 = this.k.a(j);
         }
      }

      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, -0.5F);
   }

   private void a(cxo $$0, cxm $$1, boolean $$2, fgq $$3, glj $$4, int $$5, int $$6, hdl $$7, boolean $$8, float $$9) {
      $$3.a();
      $$7.f().a($$1).a($$2, $$3);
      $$3.a(-0.5F, -0.5F, $$9);
      this.a($$0, $$1, $$3, $$4, $$5, $$6, $$7, $$8);
      $$3.b();
   }

   private void a(cxo $$0, cxm $$1, fgq $$2, glj $$3, int $$4, int $$5, hdl $$6, boolean $$7) {
      if (!$$6.d() && (!$$0.a(cxs.wI) || $$7)) {
         glt $$8 = glb.a($$0);
         fgu $$10;
         if (a($$0) && $$0.B()) {
            fgq.a $$9 = $$2.c().c();
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

   public static fgu a(glj $$0, glt $$1, boolean $$2) {
      return $$2 ? fgx.a($$0.getBuffer(glt.j()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static fgu a(glj $$0, glt $$1, fgq.a $$2) {
      return fgx.a(new fgr($$0.getBuffer(glt.l()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static fgu a(glj $$0, glt $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return fme.O() && $$1 == gme.j()
            ? fgx.a($$0.getBuffer(glt.k()), $$0.getBuffer($$1))
            : fgx.a($$0.getBuffer($$2 ? glt.l() : glt.m()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   private void a(fgq $$0, fgu $$1, List<gmq> $$2, cxo $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.f();
      fgq.a $$7 = $$0.c();

      for (gmq $$8 : $$2) {
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

   public hdl a(cxo $$0, @Nullable dhh $$1, @Nullable bwf $$2, int $$3) {
      hdl $$4 = this.l.a($$0);
      return this.a($$4, $$0, $$1, $$2, $$3);
   }

   public void a(cxo $$0, cxm $$1, int $$2, int $$3, fgq $$4, glj $$5, @Nullable dhh $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bwf $$0, cxo $$1, cxm $$2, boolean $$3, fgq $$4, glj $$5, @Nullable dhh $$6, int $$7, int $$8, int $$9) {
      if (!$$1.f()) {
         hdl $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(avv $$0) {
      this.l.a();
   }

   @Nullable
   public hdl a(cxo $$0, bwf $$1, cxm $$2) {
      return $$0.f() ? null : this.a($$0, $$1.dV(), $$1, $$1.ar() + $$2.ordinal());
   }

   private hdl a(hdl $$0, cxo $$1, @Nullable dhh $$2, @Nullable bwf $$3, int $$4) {
      gfi $$5 = $$2 instanceof gfi ? (gfi)$$2 : null;
      hdl $$6 = $$0.g().a($$1, $$5, $$3, $$4);
      return $$6 == null ? $$0 : $$6;
   }
}
