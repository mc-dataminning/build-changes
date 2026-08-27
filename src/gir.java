import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class gir implements aty {
   public static final akn a = new akn("textures/misc/enchanted_glint_entity.png");
   public static final akn b = new akn("textures/misc/enchanted_glint_item.png");
   private static final Set<ctl> k = Sets.newHashSet(new ctl[]{ctt.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final gqd l = gqd.c("trident", "inventory");
   public static final gqd i = gqd.c("trident_in_hand", "inventory");
   private static final gqd m = gqd.c("spyglass", "inventory");
   public static final gqd j = gqd.c("spyglass_in_hand", "inventory");
   private final feb n;
   private final gch o;
   private final gnw p;
   private final ffi q;
   private final gbx r;

   public gir(feb $$0, gnw $$1, gqc $$2, ffi $$3, gbx $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new gch($$2);
      this.r = $$4;

      for (ctl $$5 : le.h) {
         if (!k.contains($$5)) {
            this.o.a($$5, new gqd(le.h.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public gch a() {
      return this.o;
   }

   private void a(gpw $$0, ctq $$1, int $$2, int $$3, eyu $$4, eyy $$5) {
      aym $$6 = aym.a();
      long $$7 = 42L;

      for (it $$8 : it.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(ctq $$0, ctn $$1, boolean $$2, eyu $$3, gck $$4, int $$5, int $$6, gpw $$7) {
      if (!$$0.e()) {
         $$3.a();
         boolean $$8 = $$1 == ctn.g || $$1 == ctn.h || $$1 == ctn.i;
         if ($$8) {
            if ($$0.a(ctt.vP)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(ctt.qX)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(ctt.vP) || $$8)) {
            boolean $$10;
            if ($$1 != ctn.g && !$$1.b() && $$0.g() instanceof cro) {
               dea $$9 = ((cro)$$0.g()).d();
               $$10 = !($$9 instanceof dhq) && !($$9 instanceof dlt);
            } else {
               $$10 = true;
            }

            gcs $$12 = gcf.a($$0, $$10);
            eyy $$14;
            if (a($$0) && $$0.y()) {
               eyu.a $$13 = $$3.c().c();
               if ($$1 == ctn.g) {
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
               $$14 = c($$4, $$12, true, $$0.y());
            } else {
               $$14 = b($$4, $$12, true, $$0.y());
            }

            this.a($$7, $$0, $$5, $$6, $$3, $$14);
         } else {
            this.r.a($$0, $$1, $$3, $$4, $$5, $$6);
         }

         $$3.b();
      }
   }

   private static boolean a(ctq $$0) {
      return $$0.a(awf.bd) || $$0.a(ctt.qW);
   }

   public static eyy a(gck $$0, gcs $$1, boolean $$2, boolean $$3) {
      return $$3 ? ezb.a($$0.getBuffer($$2 ? gcs.j() : gcs.k()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static eyy a(gck $$0, gcs $$1, eyu.a $$2) {
      return ezb.a(new eyv($$0.getBuffer(gcs.m()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static eyy b(gck $$0, gcs $$1, eyu.a $$2) {
      return ezb.a(new eyv($$0.getBuffer(gcs.n()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static eyy b(gck $$0, gcs $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return feb.O() && $$1 == gcz.j()
            ? ezb.a($$0.getBuffer(gcs.l()), $$0.getBuffer($$1))
            : ezb.a($$0.getBuffer($$2 ? gcs.m() : gcs.o()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static eyy c(gck $$0, gcs $$1, boolean $$2, boolean $$3) {
      return $$3 ? ezb.a($$0.getBuffer($$2 ? gcs.n() : gcs.p()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(eyu $$0, eyy $$1, List<gdh> $$2, ctq $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.e();
      eyu.a $$7 = $$0.c();

      for (gdh $$8 : $$2) {
         int $$9 = -1;
         if ($$6 && $$8.c()) {
            $$9 = this.q.a($$3, $$8.d());
         }

         float $$10 = (float)axp.b.a($$9) / 255.0F;
         float $$11 = (float)axp.b.b($$9) / 255.0F;
         float $$12 = (float)axp.b.c($$9) / 255.0F;
         float $$13 = (float)axp.b.d($$9) / 255.0F;
         $$1.a($$7, $$8, $$11, $$12, $$13, $$10, $$4, $$5);
      }
   }

   public gpw a(ctq $$0, @Nullable daz $$1, @Nullable bsq $$2, int $$3) {
      gpw $$4;
      if ($$0.a(ctt.vP)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(ctt.qX)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fwr $$7 = $$1 instanceof fwr ? (fwr)$$1 : null;
      gpw $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(ctq $$0, ctn $$1, int $$2, int $$3, eyu $$4, gck $$5, @Nullable daz $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bsq $$0, ctq $$1, ctn $$2, boolean $$3, eyu $$4, gck $$5, @Nullable daz $$6, int $$7, int $$8, int $$9) {
      if (!$$1.e()) {
         gpw $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(atx $$0) {
      this.o.b();
   }
}
