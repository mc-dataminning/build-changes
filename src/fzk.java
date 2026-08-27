import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fzk implements aqi {
   public static final ahg a = new ahg("textures/misc/enchanted_glint_entity.png");
   public static final ahg b = new ahg("textures/misc/enchanted_glint_item.png");
   private static final Set<cms> k = Sets.newHashSet(new cms[]{cna.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final ggt l = ggt.c("trident", "inventory");
   public static final ggt i = ggt.c("trident_in_hand", "inventory");
   private static final ggt m = ggt.c("spyglass", "inventory");
   public static final ggt j = ggt.c("spyglass_in_hand", "inventory");
   private final evh n;
   private final ftd o;
   private final gen p;
   private final ewo q;
   private final fst r;

   public fzk(evh $$0, gen $$1, ggs $$2, ewo $$3, fst $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new ftd($$2);
      this.r = $$4;

      for (cms $$5 : kd.h) {
         if (!k.contains($$5)) {
            this.o.a($$5, new ggt(kd.h.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public ftd a() {
      return this.o;
   }

   private void a(ggm $$0, cmx $$1, int $$2, int $$3, eqa $$4, eqe $$5) {
      auu $$6 = auu.a();
      long $$7 = 42L;

      for (ic $$8 : ic.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cmx $$0, cmu $$1, boolean $$2, eqa $$3, ftg $$4, int $$5, int $$6, ggm $$7) {
      if (!$$0.b()) {
         $$3.a();
         boolean $$8 = $$1 == cmu.g || $$1 == cmu.h || $$1 == cmu.i;
         if ($$8) {
            if ($$0.a(cna.vI)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(cna.qU)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(cna.vI) || $$8)) {
            boolean $$10;
            if ($$1 != cmu.g && !$$1.b() && $$0.d() instanceof ckq) {
               cwp $$9 = ((ckq)$$0.d()).e();
               $$10 = !($$9 instanceof daf) && !($$9 instanceof deh);
            } else {
               $$10 = true;
            }

            fto $$12 = ftb.a($$0, $$10);
            eqe $$14;
            if (a($$0) && $$0.B()) {
               $$3.a();
               eqa.a $$13 = $$3.c();
               if ($$1 == cmu.g) {
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

   private static boolean a(cmx $$0) {
      return $$0.a(aso.aD) || $$0.a(cna.qT);
   }

   public static eqe a(ftg $$0, fto $$1, boolean $$2, boolean $$3) {
      return $$3 ? eqh.a($$0.getBuffer($$2 ? fto.j() : fto.k()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static eqe a(ftg $$0, fto $$1, eqa.a $$2) {
      return eqh.a(new eqb($$0.getBuffer(fto.m()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static eqe b(ftg $$0, fto $$1, eqa.a $$2) {
      return eqh.a(new eqb($$0.getBuffer(fto.n()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static eqe b(ftg $$0, fto $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return evh.M() && $$1 == ftv.j()
            ? eqh.a($$0.getBuffer(fto.l()), $$0.getBuffer($$1))
            : eqh.a($$0.getBuffer($$2 ? fto.m() : fto.o()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static eqe c(ftg $$0, fto $$1, boolean $$2, boolean $$3) {
      return $$3 ? eqh.a($$0.getBuffer($$2 ? fto.n() : fto.p()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(eqa $$0, eqe $$1, List<fud> $$2, cmx $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.b();
      eqa.a $$7 = $$0.c();

      for (fud $$8 : $$2) {
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

   public ggm a(cmx $$0, @Nullable cto $$1, @Nullable bmk $$2, int $$3) {
      ggm $$4;
      if ($$0.a(cna.vI)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(cna.qU)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fnr $$7 = $$1 instanceof fnr ? (fnr)$$1 : null;
      ggm $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(cmx $$0, cmu $$1, int $$2, int $$3, eqa $$4, ftg $$5, @Nullable cto $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bmk $$0, cmx $$1, cmu $$2, boolean $$3, eqa $$4, ftg $$5, @Nullable cto $$6, int $$7, int $$8, int $$9) {
      if (!$$1.b()) {
         ggm $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(aqh $$0) {
      this.o.b();
   }
}
