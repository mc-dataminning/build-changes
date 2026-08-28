import java.util.List;
import javax.annotation.Nullable;

public class gqi implements ave {
   public static final alj a = alj.b("textures/misc/enchanted_glint_entity.png");
   public static final alj b = alj.b("textures/misc/enchanted_glint_item.png");
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   public static final hbu i = hbu.a(alj.b("trident"));
   public static final hbu j = hbu.a(alj.b("spyglass"));
   private final hbt k;
   private final gja l;
   private final flk m;
   private final gin n;

   public gqi(hbt $$0, flk $$1, gin $$2) {
      this.k = $$0;
      this.l = new gja($$0);
      this.n = $$2;
      this.m = $$1;
   }

   private void a(hbg $$0, cwm $$1, int $$2, int $$3, fer $$4, fev $$5) {
      azu $$6 = azu.a();
      long $$7 = 42L;

      for (jm $$8 : jm.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cwm $$0, cwk $$1, boolean $$2, fer $$3, gjg $$4, int $$5, int $$6, hbg $$7) {
      if (!$$0.f()) {
         this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, a($$1));
      }
   }

   public void a(cwm $$0, cwk $$1, boolean $$2, fer $$3, gjg $$4, int $$5, int $$6, hbg $$7, @Nullable dfm $$8, @Nullable bvh $$9, int $$10) {
      if ($$0.h() instanceof cuz $$11) {
         if (cuz.g($$0)) {
            boolean $$13 = a($$1);
            hbg $$14 = this.a(this.l.a($$11.c()), $$0, $$8, $$9, $$10);
            this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$14, $$13, -1.5F);
            cwm $$15 = cuz.i($$0);
            hbg $$16 = this.a($$15, $$8, $$9, $$10);
            this.a($$15, $$1, $$2, $$3, $$4, $$5, $$6, $$16, $$13);
            hbg $$17 = this.a(this.l.a($$11.b()), $$0, $$8, $$9, $$10);
            this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$17, $$13, 0.5F);
         } else {
            this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
         }
      }
   }

   private void a(cwm $$0, cwk $$1, boolean $$2, fer $$3, gjg $$4, int $$5, int $$6, hbg $$7, boolean $$8) {
      if ($$8) {
         if ($$0.a(cwq.wk)) {
            $$7 = this.k.a(i);
         } else if ($$0.a(cwq.ro)) {
            $$7 = this.k.a(j);
         }
      }

      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, -0.5F);
   }

   private void a(cwm $$0, cwk $$1, boolean $$2, fer $$3, gjg $$4, int $$5, int $$6, hbg $$7, boolean $$8, float $$9) {
      $$3.a();
      $$7.f().a($$1).a($$2, $$3);
      $$3.a(-0.5F, -0.5F, $$9);
      this.a($$0, $$1, $$3, $$4, $$5, $$6, $$7, $$8);
      $$3.b();
   }

   private void a(cwm $$0, cwk $$1, fer $$2, gjg $$3, int $$4, int $$5, hbg $$6, boolean $$7) {
      if (!$$6.d() && (!$$0.a(cwq.wk) || $$7)) {
         gjq $$8 = giy.a($$0);
         fev $$10;
         if (a($$0) && $$0.B()) {
            fer.a $$9 = $$2.c().c();
            if ($$1 == cwk.g) {
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

   private static boolean a(cwk $$0) {
      return $$0 == cwk.g || $$0 == cwk.h || $$0 == cwk.i;
   }

   private static boolean a(cwm $$0) {
      return $$0.a(axl.bu) || $$0.a(cwq.rn);
   }

   public static fev a(gjg $$0, gjq $$1, boolean $$2) {
      return $$2 ? fey.a($$0.getBuffer(gjq.j()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static fev a(gjg $$0, gjq $$1, fer.a $$2) {
      return fey.a(new fes($$0.getBuffer(gjq.l()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static fev a(gjg $$0, gjq $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return fke.O() && $$1 == gkb.j()
            ? fey.a($$0.getBuffer(gjq.k()), $$0.getBuffer($$1))
            : fey.a($$0.getBuffer($$2 ? gjq.l() : gjq.m()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   private void a(fer $$0, fev $$1, List<gkn> $$2, cwm $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.f();
      fer.a $$7 = $$0.c();

      for (gkn $$8 : $$2) {
         int $$9 = -1;
         if ($$6 && $$8.c()) {
            $$9 = this.m.a($$3, $$8.d());
         }

         float $$10 = (float)axx.a($$9) / 255.0F;
         float $$11 = (float)axx.b($$9) / 255.0F;
         float $$12 = (float)axx.c($$9) / 255.0F;
         float $$13 = (float)axx.d($$9) / 255.0F;
         $$1.a($$7, $$8, $$11, $$12, $$13, $$10, $$4, $$5);
      }
   }

   public hbg a(cwm $$0, @Nullable dfm $$1, @Nullable bvh $$2, int $$3) {
      hbg $$4 = this.l.a($$0);
      return this.a($$4, $$0, $$1, $$2, $$3);
   }

   public void a(cwm $$0, cwk $$1, int $$2, int $$3, fer $$4, gjg $$5, @Nullable dfm $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bvh $$0, cwm $$1, cwk $$2, boolean $$3, fer $$4, gjg $$5, @Nullable dfm $$6, int $$7, int $$8, int $$9) {
      if (!$$1.f()) {
         hbg $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(avd $$0) {
      this.l.a();
   }

   @Nullable
   public hbg a(cwm $$0, bvh $$1, cwk $$2) {
      return $$0.f() ? null : this.a($$0, $$1.dV(), $$1, $$1.ar() + $$2.ordinal());
   }

   private hbg a(hbg $$0, cwm $$1, @Nullable dfm $$2, @Nullable bvh $$3, int $$4) {
      gdh $$5 = $$2 instanceof gdh ? (gdh)$$2 : null;
      hbg $$6 = $$0.g().a($$1, $$5, $$3, $$4);
      return $$6 == null ? $$0 : $$6;
   }
}
