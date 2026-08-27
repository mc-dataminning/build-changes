import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class gby implements asc {
   public static final aiy a = new aiy("textures/misc/enchanted_glint_entity.png");
   public static final aiy b = new aiy("textures/misc/enchanted_glint_item.png");
   private static final Set<coy> k = Sets.newHashSet(new coy[]{cpg.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final gji l = gji.c("trident", "inventory");
   public static final gji i = gji.c("trident_in_hand", "inventory");
   private static final gji m = gji.c("spyglass", "inventory");
   public static final gji j = gji.c("spyglass_in_hand", "inventory");
   private final exo n;
   private final fvq o;
   private final ghc p;
   private final eyw q;
   private final fvg r;

   public gby(exo $$0, ghc $$1, gjh $$2, eyw $$3, fvg $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new fvq($$2);
      this.r = $$4;

      for (coy $$5 : kf.h) {
         if (!k.contains($$5)) {
            this.o.a($$5, new gji(kf.h.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public fvq a() {
      return this.o;
   }

   private void a(gjb $$0, cpd $$1, int $$2, int $$3, esh $$4, esl $$5) {
      awp $$6 = awp.a();
      long $$7 = 42L;

      for (ie $$8 : ie.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cpd $$0, cpa $$1, boolean $$2, esh $$3, fvt $$4, int $$5, int $$6, gjb $$7) {
      if (!$$0.b()) {
         $$3.a();
         boolean $$8 = $$1 == cpa.g || $$1 == cpa.h || $$1 == cpa.i;
         if ($$8) {
            if ($$0.a(cpg.vL)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(cpg.qW)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(cpg.vL) || $$8)) {
            boolean $$10;
            if ($$1 != cpa.g && !$$1.b() && $$0.d() instanceof cmw) {
               cys $$9 = ((cmw)$$0.d()).e();
               $$10 = !($$9 instanceof dci) && !($$9 instanceof dgk);
            } else {
               $$10 = true;
            }

            fwb $$12 = fvo.a($$0, $$10);
            esl $$14;
            if (a($$0) && $$0.C()) {
               $$3.a();
               esh.a $$13 = $$3.c();
               if ($$1 == cpa.g) {
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

   private static boolean a(cpd $$0) {
      return $$0.a(aui.aD) || $$0.a(cpg.qV);
   }

   public static esl a(fvt $$0, fwb $$1, boolean $$2, boolean $$3) {
      return $$3 ? eso.a($$0.getBuffer($$2 ? fwb.j() : fwb.k()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static esl a(fvt $$0, fwb $$1, esh.a $$2) {
      return eso.a(new esi($$0.getBuffer(fwb.m()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static esl b(fvt $$0, fwb $$1, esh.a $$2) {
      return eso.a(new esi($$0.getBuffer(fwb.n()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static esl b(fvt $$0, fwb $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return exo.N() && $$1 == fwi.j()
            ? eso.a($$0.getBuffer(fwb.l()), $$0.getBuffer($$1))
            : eso.a($$0.getBuffer($$2 ? fwb.m() : fwb.o()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static esl c(fvt $$0, fwb $$1, boolean $$2, boolean $$3) {
      return $$3 ? eso.a($$0.getBuffer($$2 ? fwb.n() : fwb.p()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(esh $$0, esl $$1, List<fwq> $$2, cpd $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.b();
      esh.a $$7 = $$0.c();

      for (fwq $$8 : $$2) {
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

   public gjb a(cpd $$0, @Nullable cvr $$1, @Nullable boi $$2, int $$3) {
      gjb $$4;
      if ($$0.a(cpg.vL)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(cpg.qW)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fqe $$7 = $$1 instanceof fqe ? (fqe)$$1 : null;
      gjb $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(cpd $$0, cpa $$1, int $$2, int $$3, esh $$4, fvt $$5, @Nullable cvr $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable boi $$0, cpd $$1, cpa $$2, boolean $$3, esh $$4, fvt $$5, @Nullable cvr $$6, int $$7, int $$8, int $$9) {
      if (!$$1.b()) {
         gjb $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(asb $$0) {
      this.o.b();
   }
}
