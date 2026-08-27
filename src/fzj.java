import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fzj implements aqi {
   public static final ahg a = new ahg("textures/misc/enchanted_glint_entity.png");
   public static final ahg b = new ahg("textures/misc/enchanted_glint_item.png");
   private static final Set<cms> k = Sets.newHashSet(new cms[]{cna.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final ggs l = ggs.c("trident", "inventory");
   public static final ggs i = ggs.c("trident_in_hand", "inventory");
   private static final ggs m = ggs.c("spyglass", "inventory");
   public static final ggs j = ggs.c("spyglass_in_hand", "inventory");
   private final evg n;
   private final ftc o;
   private final gem p;
   private final ewn q;
   private final fss r;

   public fzj(evg $$0, gem $$1, ggr $$2, ewn $$3, fss $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new ftc($$2);
      this.r = $$4;

      for (cms $$5 : kd.h) {
         if (!k.contains($$5)) {
            this.o.a($$5, new ggs(kd.h.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public ftc a() {
      return this.o;
   }

   private void a(ggl $$0, cmx $$1, int $$2, int $$3, epz $$4, eqd $$5) {
      auu $$6 = auu.a();
      long $$7 = 42L;

      for (ic $$8 : ic.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cmx $$0, cmu $$1, boolean $$2, epz $$3, ftf $$4, int $$5, int $$6, ggl $$7) {
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

            ftn $$12 = fta.a($$0, $$10);
            eqd $$14;
            if (a($$0) && $$0.B()) {
               $$3.a();
               epz.a $$13 = $$3.c();
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

   public static eqd a(ftf $$0, ftn $$1, boolean $$2, boolean $$3) {
      return $$3 ? eqg.a($$0.getBuffer($$2 ? ftn.j() : ftn.k()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static eqd a(ftf $$0, ftn $$1, epz.a $$2) {
      return eqg.a(new eqa($$0.getBuffer(ftn.m()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static eqd b(ftf $$0, ftn $$1, epz.a $$2) {
      return eqg.a(new eqa($$0.getBuffer(ftn.n()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static eqd b(ftf $$0, ftn $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return evg.M() && $$1 == ftu.j()
            ? eqg.a($$0.getBuffer(ftn.l()), $$0.getBuffer($$1))
            : eqg.a($$0.getBuffer($$2 ? ftn.m() : ftn.o()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static eqd c(ftf $$0, ftn $$1, boolean $$2, boolean $$3) {
      return $$3 ? eqg.a($$0.getBuffer($$2 ? ftn.n() : ftn.p()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(epz $$0, eqd $$1, List<fuc> $$2, cmx $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.b();
      epz.a $$7 = $$0.c();

      for (fuc $$8 : $$2) {
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

   public ggl a(cmx $$0, @Nullable cto $$1, @Nullable bmk $$2, int $$3) {
      ggl $$4;
      if ($$0.a(cna.vI)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(cna.qU)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fnq $$7 = $$1 instanceof fnq ? (fnq)$$1 : null;
      ggl $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(cmx $$0, cmu $$1, int $$2, int $$3, epz $$4, ftf $$5, @Nullable cto $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bmk $$0, cmx $$1, cmu $$2, boolean $$3, epz $$4, ftf $$5, @Nullable cto $$6, int $$7, int $$8, int $$9) {
      if (!$$1.b()) {
         ggl $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(aqh $$0) {
      this.o.b();
   }
}
