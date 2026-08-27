import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class ghl implements atp {
   public static final akf a = new akf("textures/misc/enchanted_glint_entity.png");
   public static final akf b = new akf("textures/misc/enchanted_glint_item.png");
   private static final Set<cry> k = Sets.newHashSet(new cry[]{csg.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final gov l = gov.c("trident", "inventory");
   public static final gov i = gov.c("trident_in_hand", "inventory");
   private static final gov m = gov.c("spyglass", "inventory");
   public static final gov j = gov.c("spyglass_in_hand", "inventory");
   private final fcu n;
   private final gbb o;
   private final gmp p;
   private final fec q;
   private final gar r;

   public ghl(fcu $$0, gmp $$1, gou $$2, fec $$3, gar $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new gbb($$2);
      this.r = $$4;

      for (cry $$5 : lc.h) {
         if (!k.contains($$5)) {
            this.o.a($$5, new gov(lc.h.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public gbb a() {
      return this.o;
   }

   private void a(goo $$0, csd $$1, int $$2, int $$3, exn $$4, exr $$5) {
      ayd $$6 = ayd.a();
      long $$7 = 42L;

      for (ir $$8 : ir.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(csd $$0, csa $$1, boolean $$2, exn $$3, gbe $$4, int $$5, int $$6, goo $$7) {
      if (!$$0.d()) {
         $$3.a();
         boolean $$8 = $$1 == csa.g || $$1 == csa.h || $$1 == csa.i;
         if ($$8) {
            if ($$0.a(csg.vP)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(csg.qX)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(csg.vP) || $$8)) {
            boolean $$10;
            if ($$1 != csa.g && !$$1.b() && $$0.f() instanceof cqb) {
               dcv $$9 = ((cqb)$$0.f()).d();
               $$10 = !($$9 instanceof dgl) && !($$9 instanceof dko);
            } else {
               $$10 = true;
            }

            gbm $$12 = gaz.a($$0, $$10);
            exr $$14;
            if (a($$0) && $$0.x()) {
               exn.a $$13 = $$3.c().c();
               if ($$1 == csa.g) {
                  f.a($$13.a(), 0.5F);
               } else if ($$1.b()) {
                  f.a($$13.a(), 0.75F);
               }

               if ($$10) {
                  $$14 = b($$4, $$12, $$13);
               } else {
                  $$14 = a($$4, $$12, $$13);
               }
            } else if ($$10) {
               $$14 = c($$4, $$12, true, $$0.x());
            } else {
               $$14 = b($$4, $$12, true, $$0.x());
            }

            this.a($$7, $$0, $$5, $$6, $$3, $$14);
         } else {
            this.r.a($$0, $$1, $$3, $$4, $$5, $$6);
         }

         $$3.b();
      }
   }

   private static boolean a(csd $$0) {
      return $$0.a(avw.aD) || $$0.a(csg.qW);
   }

   public static exr a(gbe $$0, gbm $$1, boolean $$2, boolean $$3) {
      return $$3 ? exu.a($$0.getBuffer($$2 ? gbm.j() : gbm.k()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static exr a(gbe $$0, gbm $$1, exn.a $$2) {
      return exu.a(new exo($$0.getBuffer(gbm.m()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static exr b(gbe $$0, gbm $$1, exn.a $$2) {
      return exu.a(new exo($$0.getBuffer(gbm.n()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static exr b(gbe $$0, gbm $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return fcu.O() && $$1 == gbt.j()
            ? exu.a($$0.getBuffer(gbm.l()), $$0.getBuffer($$1))
            : exu.a($$0.getBuffer($$2 ? gbm.m() : gbm.o()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static exr c(gbe $$0, gbm $$1, boolean $$2, boolean $$3) {
      return $$3 ? exu.a($$0.getBuffer($$2 ? gbm.n() : gbm.p()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(exn $$0, exr $$1, List<gcb> $$2, csd $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.d();
      exn.a $$7 = $$0.c();

      for (gcb $$8 : $$2) {
         int $$9 = -1;
         if ($$6 && $$8.c()) {
            $$9 = this.q.a($$3, $$8.d());
         }

         float $$10 = (float)axg.b.a($$9) / 255.0F;
         float $$11 = (float)axg.b.b($$9) / 255.0F;
         float $$12 = (float)axg.b.c($$9) / 255.0F;
         float $$13 = (float)axg.b.d($$9) / 255.0F;
         $$1.a($$7, $$8, $$11, $$12, $$13, $$10, $$4, $$5);
      }
   }

   public goo a(csd $$0, @Nullable czu $$1, @Nullable bre $$2, int $$3) {
      goo $$4;
      if ($$0.a(csg.vP)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(csg.qX)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fvm $$7 = $$1 instanceof fvm ? (fvm)$$1 : null;
      goo $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(csd $$0, csa $$1, int $$2, int $$3, exn $$4, gbe $$5, @Nullable czu $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bre $$0, csd $$1, csa $$2, boolean $$3, exn $$4, gbe $$5, @Nullable czu $$6, int $$7, int $$8, int $$9) {
      if (!$$1.d()) {
         goo $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(ato $$0) {
      this.o.b();
   }
}
