import java.util.List;
import javax.annotation.Nullable;

public class gox implements avb {
   public static final alh a = alh.b("textures/misc/enchanted_glint_entity.png");
   public static final alh b = alh.b("textures/misc/enchanted_glint_item.png");
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   public static final hai i = hai.a(alh.b("trident"));
   public static final hai j = hai.a(alh.b("spyglass"));
   private final hah k;
   private final ghq l;
   private final fkg m;
   private final ghd n;

   public gox(hah $$0, fkg $$1, ghd $$2) {
      this.k = $$0;
      this.l = new ghq($$0);
      this.n = $$2;
      this.m = $$1;
   }

   private void a(gzu $$0, cvx $$1, int $$2, int $$3, fdt $$4, fdx $$5) {
      azr $$6 = azr.a();
      long $$7 = 42L;

      for (jl $$8 : jl.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cvx $$0, cvv $$1, boolean $$2, fdt $$3, ghw $$4, int $$5, int $$6, gzu $$7) {
      if (!$$0.f()) {
         boolean $$8 = $$1 == cvv.g || $$1 == cvv.h || $$1 == cvv.i;
         if ($$8 && $$0.a(cwb.qV) && $$0.h() instanceof cuj $$9 && cuj.f($$0)) {
            this.a($$9, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
         } else {
            $$3.a();
            this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
            $$3.b();
         }
      }
   }

   private void a(cuj $$0, cvx $$1, cvv $$2, boolean $$3, fdt $$4, ghw $$5, int $$6, int $$7, boolean $$8) {
      $$4.a();
      gzu $$9 = this.l.a($$0.c());
      this.a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$9, $$8, -1.5F);
      $$4.b();
      $$4.a();
      cvx $$10 = cuj.h($$1);
      gzu $$11 = this.l.a($$10);
      this.a($$10, $$2, $$3, $$4, $$5, $$6, $$7, $$11, $$8);
      $$4.b();
      $$4.a();
      gzu $$12 = this.l.a($$0.b());
      this.a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$12, $$8, 0.5F);
      $$4.b();
   }

   private void a(cvx $$0, cvv $$1, boolean $$2, fdt $$3, ghw $$4, int $$5, int $$6, gzu $$7, boolean $$8) {
      if ($$8) {
         if ($$0.a(cwb.vU)) {
            $$7 = this.k.a(i);
         } else if ($$0.a(cwb.qY)) {
            $$7 = this.k.a(j);
         }
      }

      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, -0.5F);
   }

   private void a(cvx $$0, cvv $$1, boolean $$2, fdt $$3, ghw $$4, int $$5, int $$6, gzu $$7, boolean $$8, float $$9) {
      $$7.f().a($$1).a($$2, $$3);
      $$3.a(-0.5F, -0.5F, $$9);
      this.a($$0, $$1, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   private void a(cvx $$0, cvv $$1, fdt $$2, ghw $$3, int $$4, int $$5, gzu $$6, boolean $$7) {
      if (!$$6.d() && (!$$0.a(cwb.vU) || $$7)) {
         gig $$8 = gho.a($$0);
         fdx $$10;
         if (a($$0) && $$0.B()) {
            fdt.a $$9 = $$2.c().c();
            if ($$1 == cvv.g) {
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

   private static boolean a(cvx $$0) {
      return $$0.a(axi.bq) || $$0.a(cwb.qX);
   }

   public static fdx a(ghw $$0, gig $$1, boolean $$2) {
      return $$2 ? fea.a($$0.getBuffer(gig.j()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static fdx a(ghw $$0, gig $$1, fdt.a $$2) {
      return fea.a(new fdu($$0.getBuffer(gig.l()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static fdx a(ghw $$0, gig $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return fja.O() && $$1 == gir.j()
            ? fea.a($$0.getBuffer(gig.k()), $$0.getBuffer($$1))
            : fea.a($$0.getBuffer($$2 ? gig.l() : gig.m()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   private void a(fdt $$0, fdx $$1, List<gjd> $$2, cvx $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.f();
      fdt.a $$7 = $$0.c();

      for (gjd $$8 : $$2) {
         int $$9 = -1;
         if ($$6 && $$8.c()) {
            $$9 = this.m.a($$3, $$8.d());
         }

         float $$10 = (float)axu.a($$9) / 255.0F;
         float $$11 = (float)axu.b($$9) / 255.0F;
         float $$12 = (float)axu.c($$9) / 255.0F;
         float $$13 = (float)axu.d($$9) / 255.0F;
         $$1.a($$7, $$8, $$11, $$12, $$13, $$10, $$4, $$5);
      }
   }

   public gzu a(cvx $$0, @Nullable dev $$1, @Nullable buv $$2, int $$3) {
      gzu $$4 = this.l.a($$0);
      gbx $$5 = $$1 instanceof gbx ? (gbx)$$1 : null;
      gzu $$6 = $$4.g().a($$0, $$5, $$2, $$3);
      return $$6 == null ? $$4 : $$6;
   }

   public void a(cvx $$0, cvv $$1, int $$2, int $$3, fdt $$4, ghw $$5, @Nullable dev $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable buv $$0, cvx $$1, cvv $$2, boolean $$3, fdt $$4, ghw $$5, @Nullable dev $$6, int $$7, int $$8, int $$9) {
      if (!$$1.f()) {
         gzu $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(ava $$0) {
      this.l.a();
   }

   @Nullable
   public gzu a(cvx $$0, buv $$1, cvv $$2) {
      return $$0.f() ? null : this.a($$0, $$1.dX(), $$1, $$1.ar() + $$2.ordinal());
   }
}
