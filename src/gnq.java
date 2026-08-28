import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class gnq implements aut {
   public static final alb a = alb.b("textures/misc/enchanted_glint_entity.png");
   public static final alb b = alb.b("textures/misc/enchanted_glint_item.png");
   private static final Set<cvg> k = Sets.newHashSet(new cvg[]{cvo.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final gyx l = gyx.a(alb.b("trident"));
   public static final gyx i = gyx.a(alb.b("trident_in_hand"));
   private static final gyx m = gyx.a(alb.b("spyglass"));
   public static final gyx j = gyx.a(alb.b("spyglass_in_hand"));
   private final fib n;
   private final ggp o;
   private final gwl p;
   private final fjh q;
   private final ggd r;

   public gnq(fib $$0, gwl $$1, gyw $$2, fjh $$3, ggd $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new ggp($$2);
      this.r = $$4;

      for (cvg $$5 : lu.g) {
         if (!k.contains($$5)) {
            this.o.a($$5, gyx.a(lu.g.b($$5)));
         }
      }

      this.q = $$3;
   }

   public ggp a() {
      return this.o;
   }

   private void a(gym $$0, cvl $$1, int $$2, int $$3, fcu $$4, fcy $$5) {
      azk $$6 = azk.a();
      long $$7 = 42L;

      for (jj $$8 : jj.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cvl $$0, cvi $$1, boolean $$2, fcu $$3, ggv $$4, int $$5, int $$6, gym $$7) {
      if (!$$0.f()) {
         $$3.a();
         boolean $$8 = $$1 == cvi.g || $$1 == cvi.h || $$1 == cvi.i;
         if ($$8) {
            if ($$0.a(cvo.vU)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(cvo.qY)) {
               $$7 = this.o.a().a(m);
            } else if ($$0.a(cvo.qV) && cts.g($$0)) {
               this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
               $$3.b();
               return;
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         this.a($$0, $$1, $$3, $$4, $$5, $$6, $$7, $$8);
         $$3.b();
      }
   }

   private void a(cvl $$0, cvi $$1, boolean $$2, fcu $$3, ggv $$4, int $$5, int $$6, boolean $$7) {
      if ($$0.h() instanceof cts $$8) {
         $$3.a();
         gym $$9 = this.o.a().a(b($$8));
         $$9.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -1.5F);
         this.a($$0, $$1, $$3, $$4, $$5, $$6, $$9, $$7);
         $$3.b();
         $$3.a();
         cvl $$10 = cts.i($$0);
         gym $$11 = this.o.a($$10);
         $$11.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         this.a($$10, $$1, $$3, $$4, $$5, $$6, $$11, $$7);
         $$3.b();
         $$3.a();
         gym $$12 = this.o.a().a(a($$8));
         $$12.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, 0.5F);
         this.a($$0, $$1, $$3, $$4, $$5, $$6, $$12, $$7);
         $$3.b();
      }
   }

   private void a(cvl $$0, cvi $$1, fcu $$2, ggv $$3, int $$4, int $$5, gym $$6, boolean $$7) {
      if (!$$6.d() && (!$$0.a(cvo.vU) || $$7)) {
         boolean $$10;
         if ($$1 != cvi.g && !$$1.b() && $$0.h() instanceof ctl $$8) {
            dgv $$9 = $$8.d();
            $$10 = !($$9 instanceof dkl) && !($$9 instanceof dop);
         } else {
            $$10 = true;
         }

         ghe $$12 = ggn.a($$0, $$10);
         fcy $$14;
         if (a($$0) && $$0.z()) {
            fcu.a $$13 = $$2.c().c();
            if ($$1 == cvi.g) {
               f.a($$13.a(), 0.5F);
            } else if ($$1.b()) {
               f.a($$13.a(), 0.75F);
            }

            $$14 = a($$3, $$12, $$13);
         } else if ($$10) {
            $$14 = b($$3, $$12, true, $$0.z());
         } else {
            $$14 = a($$3, $$12, true, $$0.z());
         }

         this.a($$6, $$0, $$4, $$5, $$2, $$14);
      } else {
         this.r.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static boolean a(cvl $$0) {
      return $$0.a(axb.bh) || $$0.a(cvo.qX);
   }

   public static fcy a(ggv $$0, ghe $$1, boolean $$2) {
      return $$2 ? fdb.a($$0.getBuffer(ghe.j()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static fcy a(ggv $$0, ghe $$1, fcu.a $$2) {
      return fdb.a(new fcv($$0.getBuffer(ghe.l()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static fcy a(ggv $$0, ghe $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return fib.O() && $$1 == ghm.j()
            ? fdb.a($$0.getBuffer(ghe.k()), $$0.getBuffer($$1))
            : fdb.a($$0.getBuffer($$2 ? ghe.l() : ghe.m()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static fcy b(ggv $$0, ghe $$1, boolean $$2, boolean $$3) {
      return $$3 ? fdb.a($$0.getBuffer($$2 ? ghe.l() : ghe.n()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(fcu $$0, fcy $$1, List<ghx> $$2, cvl $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.f();
      fcu.a $$7 = $$0.c();

      for (ghx $$8 : $$2) {
         int $$9 = -1;
         if ($$6 && $$8.c()) {
            $$9 = this.q.a($$3, $$8.d());
         }

         float $$10 = (float)axn.a($$9) / 255.0F;
         float $$11 = (float)axn.b($$9) / 255.0F;
         float $$12 = (float)axn.c($$9) / 255.0F;
         float $$13 = (float)axn.d($$9) / 255.0F;
         $$1.a($$7, $$8, $$11, $$12, $$13, $$10, $$4, $$5);
      }
   }

   public gym a(cvl $$0, @Nullable dds $$1, @Nullable buf $$2, int $$3) {
      gym $$4;
      if ($$0.a(cvo.vU)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(cvo.qY)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      gax $$7 = $$1 instanceof gax ? (gax)$$1 : null;
      gym $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public static gyx a(cts $$0) {
      return gyx.a(alb.b($$0.b()));
   }

   public static gyx b(cts $$0) {
      return gyx.a(alb.b($$0.c()));
   }

   public void a(cvl $$0, cvi $$1, int $$2, int $$3, fcu $$4, ggv $$5, @Nullable dds $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable buf $$0, cvl $$1, cvi $$2, boolean $$3, fcu $$4, ggv $$5, @Nullable dds $$6, int $$7, int $$8, int $$9) {
      if (!$$1.f()) {
         gym $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(aus $$0) {
      this.o.b();
   }

   @Nullable
   public gym a(cvl $$0, buf $$1, cvi $$2) {
      return $$0.f() ? null : this.a($$0, $$1.dS(), $$1, $$1.ap() + $$2.ordinal());
   }
}
