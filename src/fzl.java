import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fzl implements aqj {
   public static final ahg a = new ahg("textures/misc/enchanted_glint_entity.png");
   public static final ahg b = new ahg("textures/misc/enchanted_glint_item.png");
   private static final Set<cmt> k = Sets.newHashSet(new cmt[]{cnb.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final ggu l = ggu.c("trident", "inventory");
   public static final ggu i = ggu.c("trident_in_hand", "inventory");
   private static final ggu m = ggu.c("spyglass", "inventory");
   public static final ggu j = ggu.c("spyglass_in_hand", "inventory");
   private final evi n;
   private final fte o;
   private final geo p;
   private final ewp q;
   private final fsu r;

   public fzl(evi $$0, geo $$1, ggt $$2, ewp $$3, fsu $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new fte($$2);
      this.r = $$4;

      for (cmt $$5 : kd.h) {
         if (!k.contains($$5)) {
            this.o.a($$5, new ggu(kd.h.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public fte a() {
      return this.o;
   }

   private void a(ggn $$0, cmy $$1, int $$2, int $$3, eqb $$4, eqf $$5) {
      auv $$6 = auv.a();
      long $$7 = 42L;

      for (ic $$8 : ic.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cmy $$0, cmv $$1, boolean $$2, eqb $$3, fth $$4, int $$5, int $$6, ggn $$7) {
      if (!$$0.b()) {
         $$3.a();
         boolean $$8 = $$1 == cmv.g || $$1 == cmv.h || $$1 == cmv.i;
         if ($$8) {
            if ($$0.a(cnb.vI)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(cnb.qU)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(cnb.vI) || $$8)) {
            boolean $$10;
            if ($$1 != cmv.g && !$$1.b() && $$0.d() instanceof ckr) {
               cwq $$9 = ((ckr)$$0.d()).e();
               $$10 = !($$9 instanceof dag) && !($$9 instanceof dei);
            } else {
               $$10 = true;
            }

            ftp $$12 = ftc.a($$0, $$10);
            eqf $$14;
            if (a($$0) && $$0.B()) {
               $$3.a();
               eqb.a $$13 = $$3.c();
               if ($$1 == cmv.g) {
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

   private static boolean a(cmy $$0) {
      return $$0.a(asp.aD) || $$0.a(cnb.qT);
   }

   public static eqf a(fth $$0, ftp $$1, boolean $$2, boolean $$3) {
      return $$3 ? eqi.a($$0.getBuffer($$2 ? ftp.j() : ftp.k()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static eqf a(fth $$0, ftp $$1, eqb.a $$2) {
      return eqi.a(new eqc($$0.getBuffer(ftp.m()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static eqf b(fth $$0, ftp $$1, eqb.a $$2) {
      return eqi.a(new eqc($$0.getBuffer(ftp.n()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static eqf b(fth $$0, ftp $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return evi.M() && $$1 == ftw.j()
            ? eqi.a($$0.getBuffer(ftp.l()), $$0.getBuffer($$1))
            : eqi.a($$0.getBuffer($$2 ? ftp.m() : ftp.o()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static eqf c(fth $$0, ftp $$1, boolean $$2, boolean $$3) {
      return $$3 ? eqi.a($$0.getBuffer($$2 ? ftp.n() : ftp.p()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(eqb $$0, eqf $$1, List<fue> $$2, cmy $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.b();
      eqb.a $$7 = $$0.c();

      for (fue $$8 : $$2) {
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

   public ggn a(cmy $$0, @Nullable ctp $$1, @Nullable bml $$2, int $$3) {
      ggn $$4;
      if ($$0.a(cnb.vI)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(cnb.qU)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fns $$7 = $$1 instanceof fns ? (fns)$$1 : null;
      ggn $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(cmy $$0, cmv $$1, int $$2, int $$3, eqb $$4, fth $$5, @Nullable ctp $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bml $$0, cmy $$1, cmv $$2, boolean $$3, eqb $$4, fth $$5, @Nullable ctp $$6, int $$7, int $$8, int $$9) {
      if (!$$1.b()) {
         ggn $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(aqi $$0) {
      this.o.b();
   }
}
