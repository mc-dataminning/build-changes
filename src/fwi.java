import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fwi implements ape {
   public static final agg a = new agg("textures/misc/enchanted_glint_entity.png");
   public static final agg b = new agg("textures/misc/enchanted_glint_item.png");
   private static final Set<ckw> k = Sets.newHashSet(new ckw[]{cle.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final gdp l = gdp.c("trident", "inventory");
   public static final gdp i = gdp.c("trident_in_hand", "inventory");
   private static final gdp m = gdp.c("spyglass", "inventory");
   public static final gdp j = gdp.c("spyglass_in_hand", "inventory");
   private final esr n;
   private final fqe o;
   private final gbi p;
   private final etw q;
   private final fpu r;

   public fwi(esr $$0, gbi $$1, gdo $$2, etw $$3, fpu $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new fqe($$2);
      this.r = $$4;

      for (ckw $$5 : jy.i) {
         if (!k.contains($$5)) {
            this.o.a($$5, new gdp(jy.i.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public fqe a() {
      return this.o;
   }

   private void a(gdi $$0, clb $$1, int $$2, int $$3, enk $$4, eno $$5) {
      ato $$6 = ato.a();
      long $$7 = 42L;

      for (hx $$8 : hx.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(clb $$0, cky $$1, boolean $$2, enk $$3, fqh $$4, int $$5, int $$6, gdi $$7) {
      if (!$$0.b()) {
         $$3.a();
         boolean $$8 = $$1 == cky.g || $$1 == cky.h || $$1 == cky.i;
         if ($$8) {
            if ($$0.a(cle.uW)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(cle.qj)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(cle.uW) || $$8)) {
            boolean $$10;
            if ($$1 != cky.g && !$$1.b() && $$0.d() instanceof ciu) {
               cut $$9 = ((ciu)$$0.d()).e();
               $$10 = !($$9 instanceof cyj) && !($$9 instanceof dcl);
            } else {
               $$10 = true;
            }

            fqp $$12 = fqc.a($$0, $$10);
            eno $$14;
            if (a($$0) && $$0.B()) {
               $$3.a();
               enk.a $$13 = $$3.c();
               if ($$1 == cky.g) {
                  f.a($$13.a(), 0.5F);
               } else if ($$1.b()) {
                  f.a($$13.a(), 0.75F);
               }

               if ($$10) {
                  $$14 = b($$4, $$12, $$13);
               } else {
                  $$14 = a($$4, $$12, $$13);
               }

               $$3.b();
            } else if ($$10) {
               $$14 = c($$4, $$12, true, $$0.B());
            } else {
               $$14 = b($$4, $$12, true, $$0.B());
            }

            this.a($$7, $$0, $$5, $$6, $$3, $$14);
         } else {
            this.r.a($$0, $$1, $$3, $$4, $$5, $$6);
         }

         $$3.b();
      }
   }

   private static boolean a(clb $$0) {
      return $$0.a(ark.aD) || $$0.a(cle.qi);
   }

   public static eno a(fqh $$0, fqp $$1, boolean $$2, boolean $$3) {
      return $$3 ? enr.a($$0.getBuffer($$2 ? fqp.j() : fqp.k()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static eno a(fqh $$0, fqp $$1, enk.a $$2) {
      return enr.a(new enl($$0.getBuffer(fqp.m()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static eno b(fqh $$0, fqp $$1, enk.a $$2) {
      return enr.a(new enl($$0.getBuffer(fqp.n()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static eno b(fqh $$0, fqp $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return esr.L() && $$1 == fqw.j()
            ? enr.a($$0.getBuffer(fqp.l()), $$0.getBuffer($$1))
            : enr.a($$0.getBuffer($$2 ? fqp.m() : fqp.o()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static eno c(fqh $$0, fqp $$1, boolean $$2, boolean $$3) {
      return $$3 ? enr.a($$0.getBuffer($$2 ? fqp.n() : fqp.p()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(enk $$0, eno $$1, List<fre> $$2, clb $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.b();
      enk.a $$7 = $$0.c();

      for (fre $$8 : $$2) {
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

   public gdi a(clb $$0, @Nullable crs $$1, @Nullable bky $$2, int $$3) {
      gdi $$4;
      if ($$0.a(cle.uW)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(cle.qj)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fkw $$7 = $$1 instanceof fkw ? (fkw)$$1 : null;
      gdi $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(clb $$0, cky $$1, int $$2, int $$3, enk $$4, fqh $$5, @Nullable crs $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bky $$0, clb $$1, cky $$2, boolean $$3, enk $$4, fqh $$5, @Nullable crs $$6, int $$7, int $$8, int $$9) {
      if (!$$1.b()) {
         gdi $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(apd $$0) {
      this.o.b();
   }
}
