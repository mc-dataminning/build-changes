import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class gdw implements asp {
   public static final ajh a = new ajh("textures/misc/enchanted_glint_entity.png");
   public static final ajh b = new ajh("textures/misc/enchanted_glint_item.png");
   private static final Set<cqf> k = Sets.newHashSet(new cqf[]{cqn.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final glg l = glg.c("trident", "inventory");
   public static final glg i = glg.c("trident_in_hand", "inventory");
   private static final glg m = glg.c("spyglass", "inventory");
   public static final glg j = glg.c("spyglass_in_hand", "inventory");
   private final ezg n;
   private final fxn o;
   private final gja p;
   private final fao q;
   private final fxd r;

   public gdw(ezg $$0, gja $$1, glf $$2, fao $$3, fxd $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new fxn($$2);
      this.r = $$4;

      for (cqf $$5 : ki.h) {
         if (!k.contains($$5)) {
            this.o.a($$5, new glg(ki.h.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public fxn a() {
      return this.o;
   }

   private void a(gkz $$0, cqk $$1, int $$2, int $$3, etz $$4, eud $$5) {
      axd $$6 = axd.a();
      long $$7 = 42L;

      for (ih $$8 : ih.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cqk $$0, cqh $$1, boolean $$2, etz $$3, fxq $$4, int $$5, int $$6, gkz $$7) {
      if (!$$0.b()) {
         $$3.a();
         boolean $$8 = $$1 == cqh.g || $$1 == cqh.h || $$1 == cqh.i;
         if ($$8) {
            if ($$0.a(cqn.vM)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(cqn.qW)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(cqn.vM) || $$8)) {
            boolean $$10;
            if ($$1 != cqh.g && !$$1.b() && $$0.d() instanceof cof) {
               daa $$9 = ((cof)$$0.d()).d();
               $$10 = !($$9 instanceof ddq) && !($$9 instanceof dhs);
            } else {
               $$10 = true;
            }

            fxy $$12 = fxl.a($$0, $$10);
            eud $$14;
            if (a($$0) && $$0.C()) {
               etz.a $$13 = $$3.c().c();
               if ($$1 == cqh.g) {
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

   private static boolean a(cqk $$0) {
      return $$0.a(auv.aD) || $$0.a(cqn.qV);
   }

   public static eud a(fxq $$0, fxy $$1, boolean $$2, boolean $$3) {
      return $$3 ? eug.a($$0.getBuffer($$2 ? fxy.j() : fxy.k()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static eud a(fxq $$0, fxy $$1, etz.a $$2) {
      return eug.a(new eua($$0.getBuffer(fxy.m()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static eud b(fxq $$0, fxy $$1, etz.a $$2) {
      return eug.a(new eua($$0.getBuffer(fxy.n()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static eud b(fxq $$0, fxy $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return ezg.O() && $$1 == fyf.j()
            ? eug.a($$0.getBuffer(fxy.l()), $$0.getBuffer($$1))
            : eug.a($$0.getBuffer($$2 ? fxy.m() : fxy.o()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static eud c(fxq $$0, fxy $$1, boolean $$2, boolean $$3) {
      return $$3 ? eug.a($$0.getBuffer($$2 ? fxy.n() : fxy.p()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(etz $$0, eud $$1, List<fyn> $$2, cqk $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.b();
      etz.a $$7 = $$0.c();

      for (fyn $$8 : $$2) {
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

   public gkz a(cqk $$0, @Nullable cwz $$1, @Nullable bpo $$2, int $$3) {
      gkz $$4;
      if ($$0.a(cqn.vM)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(cqn.qW)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fry $$7 = $$1 instanceof fry ? (fry)$$1 : null;
      gkz $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(cqk $$0, cqh $$1, int $$2, int $$3, etz $$4, fxq $$5, @Nullable cwz $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bpo $$0, cqk $$1, cqh $$2, boolean $$3, etz $$4, fxq $$5, @Nullable cwz $$6, int $$7, int $$8, int $$9) {
      if (!$$1.b()) {
         gkz $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(aso $$0) {
      this.o.b();
   }
}
