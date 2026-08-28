import java.util.List;
import javax.annotation.Nullable;

public class gsj implements avm {
   public static final alp a = alp.b("textures/misc/enchanted_glint_entity.png");
   public static final alp b = alp.b("textures/misc/enchanted_glint_item.png");
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   public static final hdw i = hdw.a(alp.b("trident"));
   public static final hdw j = hdw.a(alp.b("spyglass"));
   private final hdv k;
   private final gla l;
   private final fnf m;
   private final gkn n;

   public gsj(hdv $$0, fnf $$1, gkn $$2) {
      this.k = $$0;
      this.l = new gla($$0);
      this.n = $$2;
      this.m = $$1;
   }

   private void a(hdi $$0, cxg $$1, int $$2, int $$3, fgl $$4, fgp $$5) {
      bac $$6 = bac.a();
      long $$7 = 42L;

      for (jm $$8 : jm.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cxg $$0, cxe $$1, boolean $$2, fgl $$3, glg $$4, int $$5, int $$6, hdi $$7) {
      if (!$$0.f()) {
         this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, a($$1));
      }
   }

   public void a(cxg $$0, cxe $$1, boolean $$2, fgl $$3, glg $$4, int $$5, int $$6, hdi $$7, @Nullable dgz $$8, @Nullable bvx $$9, int $$10) {
      if ($$0.h() instanceof cvt $$11) {
         if (cvt.g($$0)) {
            boolean $$13 = a($$1);
            hdi $$14 = this.a(this.l.a($$11.c()), $$0, $$8, $$9, $$10);
            this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$14, $$13, -1.5F);
            cxg $$15 = cvt.i($$0);
            hdi $$16 = this.a($$15, $$8, $$9, $$10);
            this.a($$15, $$1, $$2, $$3, $$4, $$5, $$6, $$16, $$13);
            hdi $$17 = this.a(this.l.a($$11.b()), $$0, $$8, $$9, $$10);
            this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$17, $$13, 0.5F);
         } else {
            this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
         }
      }
   }

   private void a(cxg $$0, cxe $$1, boolean $$2, fgl $$3, glg $$4, int $$5, int $$6, hdi $$7, boolean $$8) {
      if ($$8) {
         if ($$0.a(cxk.wS)) {
            $$7 = this.k.a(i);
         } else if ($$0.a(cxk.rU)) {
            $$7 = this.k.a(j);
         }
      }

      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, -0.5F);
   }

   private void a(cxg $$0, cxe $$1, boolean $$2, fgl $$3, glg $$4, int $$5, int $$6, hdi $$7, boolean $$8, float $$9) {
      $$3.a();
      $$7.f().a($$1).a($$2, $$3);
      $$3.a(-0.5F, -0.5F, $$9);
      this.a($$0, $$1, $$3, $$4, $$5, $$6, $$7, $$8);
      $$3.b();
   }

   private void a(cxg $$0, cxe $$1, fgl $$2, glg $$3, int $$4, int $$5, hdi $$6, boolean $$7) {
      if (!$$6.d() && (!$$0.a(cxk.wS) || $$7)) {
         glq $$8 = gky.a($$0);
         fgp $$10;
         if (a($$0) && $$0.C()) {
            fgl.a $$9 = $$2.c().c();
            if ($$1 == cxe.g) {
               f.a($$9.a(), 0.5F);
            } else if ($$1.b()) {
               f.a($$9.a(), 0.75F);
            }

            $$10 = a($$3, $$8, $$9);
         } else {
            $$10 = a($$3, $$8, true, $$0.C());
         }

         this.a($$6, $$0, $$4, $$5, $$2, $$10);
      } else {
         this.n.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static boolean a(cxe $$0) {
      return $$0 == cxe.g || $$0 == cxe.h || $$0 == cxe.i;
   }

   private static boolean a(cxg $$0) {
      return $$0.a(axt.bv) || $$0.a(cxk.rT);
   }

   public static fgp a(glg $$0, glq $$1, boolean $$2) {
      return $$2 ? fgs.a($$0.getBuffer(glq.j()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static fgp a(glg $$0, glq $$1, fgl.a $$2) {
      return fgs.a(new fgm($$0.getBuffer(glq.l()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static fgp a(glg $$0, glq $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return flz.O() && $$1 == gmb.j()
            ? fgs.a($$0.getBuffer(glq.k()), $$0.getBuffer($$1))
            : fgs.a($$0.getBuffer($$2 ? glq.l() : glq.m()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   private void a(fgl $$0, fgp $$1, List<gmn> $$2, cxg $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.f();
      fgl.a $$7 = $$0.c();

      for (gmn $$8 : $$2) {
         int $$9 = -1;
         if ($$6 && $$8.c()) {
            $$9 = this.m.a($$3, $$8.d());
         }

         float $$10 = (float)ayf.a($$9) / 255.0F;
         float $$11 = (float)ayf.b($$9) / 255.0F;
         float $$12 = (float)ayf.c($$9) / 255.0F;
         float $$13 = (float)ayf.d($$9) / 255.0F;
         $$1.a($$7, $$8, $$11, $$12, $$13, $$10, $$4, $$5);
      }
   }

   public hdi a(cxg $$0, @Nullable dgz $$1, @Nullable bvx $$2, int $$3) {
      hdi $$4 = this.l.a($$0);
      return this.a($$4, $$0, $$1, $$2, $$3);
   }

   public void a(cxg $$0, cxe $$1, int $$2, int $$3, fgl $$4, glg $$5, @Nullable dgz $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bvx $$0, cxg $$1, cxe $$2, boolean $$3, fgl $$4, glg $$5, @Nullable dgz $$6, int $$7, int $$8, int $$9) {
      if (!$$1.f()) {
         hdi $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(avl $$0) {
      this.l.a();
   }

   @Nullable
   public hdi a(cxg $$0, bvx $$1, cxe $$2) {
      return $$0.f() ? null : this.a($$0, $$1.dW(), $$1, $$1.ar() + $$2.ordinal());
   }

   private hdi a(hdi $$0, cxg $$1, @Nullable dgz $$2, @Nullable bvx $$3, int $$4) {
      gff $$5 = $$2 instanceof gff ? (gff)$$2 : null;
      hdi $$6 = $$0.g().a($$1, $$5, $$3, $$4);
      return $$6 == null ? $$0 : $$6;
   }
}
