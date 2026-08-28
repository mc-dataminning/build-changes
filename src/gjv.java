import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class gjv implements auq {
   public static final alf a = new alf("textures/misc/enchanted_glint_entity.png");
   public static final alf b = new alf("textures/misc/enchanted_glint_item.png");
   private static final Set<cuk> k = Sets.newHashSet(new cuk[]{cus.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final grh l = grh.c("trident", "inventory");
   public static final grh i = grh.c("trident_in_hand", "inventory");
   private static final grh m = grh.c("spyglass", "inventory");
   public static final grh j = grh.c("spyglass_in_hand", "inventory");
   private final fff n;
   private final gdl o;
   private final gpa p;
   private final fgm q;
   private final gdb r;

   public gjv(fff $$0, gpa $$1, grg $$2, fgm $$3, gdb $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new gdl($$2);
      this.r = $$4;

      for (cuk $$5 : lp.h) {
         if (!k.contains($$5)) {
            this.o.a($$5, new grh(lp.h.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public gdl a() {
      return this.o;
   }

   private void a(gra $$0, cup $$1, int $$2, int $$3, ezy $$4, fac $$5) {
      azh $$6 = azh.a();
      long $$7 = 42L;

      for (je $$8 : je.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cup $$0, cum $$1, boolean $$2, ezy $$3, gdo $$4, int $$5, int $$6, gra $$7) {
      if (!$$0.e()) {
         $$3.a();
         boolean $$8 = $$1 == cum.g || $$1 == cum.h || $$1 == cum.i;
         if ($$8) {
            if ($$0.a(cus.vP)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(cus.qX)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(cus.vP) || $$8)) {
            boolean $$10;
            if ($$1 != cum.g && !$$1.b() && $$0.g() instanceof csn) {
               dez $$9 = ((csn)$$0.g()).d();
               $$10 = !($$9 instanceof dip) && !($$9 instanceof dms);
            } else {
               $$10 = true;
            }

            gdw $$12 = gdj.a($$0, $$10);
            fac $$14;
            if (a($$0) && $$0.y()) {
               ezy.a $$13 = $$3.c().c();
               if ($$1 == cum.g) {
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

   private static boolean a(cup $$0) {
      return $$0.a(awy.bd) || $$0.a(cus.qW);
   }

   public static fac a(gdo $$0, gdw $$1, boolean $$2, boolean $$3) {
      return $$3 ? faf.a($$0.getBuffer($$2 ? gdw.j() : gdw.k()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static fac a(gdo $$0, gdw $$1, ezy.a $$2) {
      return faf.a(new ezz($$0.getBuffer(gdw.m()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static fac b(gdo $$0, gdw $$1, ezy.a $$2) {
      return faf.a(new ezz($$0.getBuffer(gdw.n()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static fac b(gdo $$0, gdw $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return fff.O() && $$1 == ged.j()
            ? faf.a($$0.getBuffer(gdw.l()), $$0.getBuffer($$1))
            : faf.a($$0.getBuffer($$2 ? gdw.m() : gdw.o()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static fac c(gdo $$0, gdw $$1, boolean $$2, boolean $$3) {
      return $$3 ? faf.a($$0.getBuffer($$2 ? gdw.n() : gdw.p()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(ezy $$0, fac $$1, List<gel> $$2, cup $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.e();
      ezy.a $$7 = $$0.c();

      for (gel $$8 : $$2) {
         int $$9 = -1;
         if ($$6 && $$8.c()) {
            $$9 = this.q.a($$3, $$8.d());
         }

         float $$10 = (float)ayj.b.a($$9) / 255.0F;
         float $$11 = (float)ayj.b.b($$9) / 255.0F;
         float $$12 = (float)ayj.b.c($$9) / 255.0F;
         float $$13 = (float)ayj.b.d($$9) / 255.0F;
         $$1.a($$7, $$8, $$11, $$12, $$13, $$10, $$4, $$5);
      }
   }

   public gra a(cup $$0, @Nullable dby $$1, @Nullable btp $$2, int $$3) {
      gra $$4;
      if ($$0.a(cus.vP)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(cus.qX)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fxv $$7 = $$1 instanceof fxv ? (fxv)$$1 : null;
      gra $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(cup $$0, cum $$1, int $$2, int $$3, ezy $$4, gdo $$5, @Nullable dby $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable btp $$0, cup $$1, cum $$2, boolean $$3, ezy $$4, gdo $$5, @Nullable dby $$6, int $$7, int $$8, int $$9) {
      if (!$$1.e()) {
         gra $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(aup $$0) {
      this.o.b();
   }
}
