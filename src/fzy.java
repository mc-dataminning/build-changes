import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fzy implements aqk {
   public static final ahh a = new ahh("textures/misc/enchanted_glint_entity.png");
   public static final ahh b = new ahh("textures/misc/enchanted_glint_item.png");
   private static final Set<cnb> k = Sets.newHashSet(new cnb[]{cnj.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final ghi l = ghi.c("trident", "inventory");
   public static final ghi i = ghi.c("trident_in_hand", "inventory");
   private static final ghi m = ghi.c("spyglass", "inventory");
   public static final ghi j = ghi.c("spyglass_in_hand", "inventory");
   private final evr n;
   private final ftq o;
   private final gfc p;
   private final ewz q;
   private final ftg r;

   public fzy(evr $$0, gfc $$1, ghh $$2, ewz $$3, ftg $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new ftq($$2);
      this.r = $$4;

      for (cnb $$5 : kd.h) {
         if (!k.contains($$5)) {
            this.o.a($$5, new ghi(kd.h.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public ftq a() {
      return this.o;
   }

   private void a(ghb $$0, cng $$1, int $$2, int $$3, eqk $$4, eqo $$5) {
      auw $$6 = auw.a();
      long $$7 = 42L;

      for (ic $$8 : ic.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cng $$0, cnd $$1, boolean $$2, eqk $$3, ftt $$4, int $$5, int $$6, ghb $$7) {
      if (!$$0.b()) {
         $$3.a();
         boolean $$8 = $$1 == cnd.g || $$1 == cnd.h || $$1 == cnd.i;
         if ($$8) {
            if ($$0.a(cnj.vL)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(cnj.qW)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(cnj.vL) || $$8)) {
            boolean $$10;
            if ($$1 != cnd.g && !$$1.b() && $$0.d() instanceof cla) {
               cwy $$9 = ((cla)$$0.d()).e();
               $$10 = !($$9 instanceof dao) && !($$9 instanceof deq);
            } else {
               $$10 = true;
            }

            fub $$12 = fto.a($$0, $$10);
            eqo $$14;
            if (a($$0) && $$0.B()) {
               $$3.a();
               eqk.a $$13 = $$3.c();
               if ($$1 == cnd.g) {
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

   private static boolean a(cng $$0) {
      return $$0.a(asq.aD) || $$0.a(cnj.qV);
   }

   public static eqo a(ftt $$0, fub $$1, boolean $$2, boolean $$3) {
      return $$3 ? eqr.a($$0.getBuffer($$2 ? fub.j() : fub.k()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static eqo a(ftt $$0, fub $$1, eqk.a $$2) {
      return eqr.a(new eql($$0.getBuffer(fub.m()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static eqo b(ftt $$0, fub $$1, eqk.a $$2) {
      return eqr.a(new eql($$0.getBuffer(fub.n()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static eqo b(ftt $$0, fub $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return evr.M() && $$1 == fui.j()
            ? eqr.a($$0.getBuffer(fub.l()), $$0.getBuffer($$1))
            : eqr.a($$0.getBuffer($$2 ? fub.m() : fub.o()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static eqo c(ftt $$0, fub $$1, boolean $$2, boolean $$3) {
      return $$3 ? eqr.a($$0.getBuffer($$2 ? fub.n() : fub.p()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(eqk $$0, eqo $$1, List<fuq> $$2, cng $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.b();
      eqk.a $$7 = $$0.c();

      for (fuq $$8 : $$2) {
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

   public ghb a(cng $$0, @Nullable ctx $$1, @Nullable bmo $$2, int $$3) {
      ghb $$4;
      if ($$0.a(cnj.vL)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(cnj.qW)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      foe $$7 = $$1 instanceof foe ? (foe)$$1 : null;
      ghb $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(cng $$0, cnd $$1, int $$2, int $$3, eqk $$4, ftt $$5, @Nullable ctx $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bmo $$0, cng $$1, cnd $$2, boolean $$3, eqk $$4, ftt $$5, @Nullable ctx $$6, int $$7, int $$8, int $$9) {
      if (!$$1.b()) {
         ghb $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(aqj $$0) {
      this.o.b();
   }
}
