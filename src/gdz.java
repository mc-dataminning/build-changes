import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class gdz implements asp {
   public static final ajh a = new ajh("textures/misc/enchanted_glint_entity.png");
   public static final ajh b = new ajh("textures/misc/enchanted_glint_item.png");
   private static final Set<cqh> k = Sets.newHashSet(new cqh[]{cqp.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final glj l = glj.c("trident", "inventory");
   public static final glj i = glj.c("trident_in_hand", "inventory");
   private static final glj m = glj.c("spyglass", "inventory");
   public static final glj j = glj.c("spyglass_in_hand", "inventory");
   private final ezi n;
   private final fxp o;
   private final gjd p;
   private final faq q;
   private final fxf r;

   public gdz(ezi $$0, gjd $$1, gli $$2, faq $$3, fxf $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new fxp($$2);
      this.r = $$4;

      for (cqh $$5 : ki.h) {
         if (!k.contains($$5)) {
            this.o.a($$5, new glj(ki.h.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public fxp a() {
      return this.o;
   }

   private void a(glc $$0, cqm $$1, int $$2, int $$3, eub $$4, euf $$5) {
      axd $$6 = axd.a();
      long $$7 = 42L;

      for (ih $$8 : ih.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cqm $$0, cqj $$1, boolean $$2, eub $$3, fxs $$4, int $$5, int $$6, glc $$7) {
      if (!$$0.b()) {
         $$3.a();
         boolean $$8 = $$1 == cqj.g || $$1 == cqj.h || $$1 == cqj.i;
         if ($$8) {
            if ($$0.a(cqp.vN)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(cqp.qW)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(cqp.vN) || $$8)) {
            boolean $$10;
            if ($$1 != cqj.g && !$$1.b() && $$0.d() instanceof coh) {
               dac $$9 = ((coh)$$0.d()).d();
               $$10 = !($$9 instanceof dds) && !($$9 instanceof dhu);
            } else {
               $$10 = true;
            }

            fya $$12 = fxn.a($$0, $$10);
            euf $$14;
            if (a($$0) && $$0.C()) {
               eub.a $$13 = $$3.c().c();
               if ($$1 == cqj.g) {
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
               $$14 = c($$4, $$12, true, $$0.C());
            } else {
               $$14 = b($$4, $$12, true, $$0.C());
            }

            this.a($$7, $$0, $$5, $$6, $$3, $$14);
         } else {
            this.r.a($$0, $$1, $$3, $$4, $$5, $$6);
         }

         $$3.b();
      }
   }

   private static boolean a(cqm $$0) {
      return $$0.a(auv.aD) || $$0.a(cqp.qV);
   }

   public static euf a(fxs $$0, fya $$1, boolean $$2, boolean $$3) {
      return $$3 ? eui.a($$0.getBuffer($$2 ? fya.j() : fya.k()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static euf a(fxs $$0, fya $$1, eub.a $$2) {
      return eui.a(new euc($$0.getBuffer(fya.m()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static euf b(fxs $$0, fya $$1, eub.a $$2) {
      return eui.a(new euc($$0.getBuffer(fya.n()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static euf b(fxs $$0, fya $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return ezi.O() && $$1 == fyh.j()
            ? eui.a($$0.getBuffer(fya.l()), $$0.getBuffer($$1))
            : eui.a($$0.getBuffer($$2 ? fya.m() : fya.o()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static euf c(fxs $$0, fya $$1, boolean $$2, boolean $$3) {
      return $$3 ? eui.a($$0.getBuffer($$2 ? fya.n() : fya.p()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(eub $$0, euf $$1, List<fyp> $$2, cqm $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.b();
      eub.a $$7 = $$0.c();

      for (fyp $$8 : $$2) {
         int $$9 = -1;
         if ($$6 && $$8.c()) {
            $$9 = this.q.a($$3, $$8.d());
         }

         float $$10 = (float)($$9 >> 16 & 0xFF) / 255.0F;
         float $$11 = (float)($$9 >> 8 & 0xFF) / 255.0F;
         float $$12 = (float)($$9 & 0xFF) / 255.0F;
         $$1.a($$7, $$8, $$10, $$11, $$12, $$4, $$5);
      }
   }

   public glc a(cqm $$0, @Nullable cxb $$1, @Nullable bpp $$2, int $$3) {
      glc $$4;
      if ($$0.a(cqp.vN)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(cqp.qW)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fsa $$7 = $$1 instanceof fsa ? (fsa)$$1 : null;
      glc $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(cqm $$0, cqj $$1, int $$2, int $$3, eub $$4, fxs $$5, @Nullable cxb $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bpp $$0, cqm $$1, cqj $$2, boolean $$3, eub $$4, fxs $$5, @Nullable cxb $$6, int $$7, int $$8, int $$9) {
      if (!$$1.b()) {
         glc $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(aso $$0) {
      this.o.b();
   }
}
