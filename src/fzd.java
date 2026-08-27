import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fzd implements aqd {
   public static final ahd a = new ahd("textures/misc/enchanted_glint_entity.png");
   public static final ahd b = new ahd("textures/misc/enchanted_glint_item.png");
   private static final Set<cmm> k = Sets.newHashSet(new cmm[]{cmu.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final ggn l = ggn.c("trident", "inventory");
   public static final ggn i = ggn.c("trident_in_hand", "inventory");
   private static final ggn m = ggn.c("spyglass", "inventory");
   public static final ggn j = ggn.c("spyglass_in_hand", "inventory");
   private final eva n;
   private final fsw o;
   private final geg p;
   private final ewh q;
   private final fsm r;

   public fzd(eva $$0, geg $$1, ggm $$2, ewh $$3, fsm $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new fsw($$2);
      this.r = $$4;

      for (cmm $$5 : kd.h) {
         if (!k.contains($$5)) {
            this.o.a($$5, new ggn(kd.h.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public fsw a() {
      return this.o;
   }

   private void a(ggg $$0, cmr $$1, int $$2, int $$3, ept $$4, epx $$5) {
      aup $$6 = aup.a();
      long $$7 = 42L;

      for (ic $$8 : ic.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cmr $$0, cmo $$1, boolean $$2, ept $$3, fsz $$4, int $$5, int $$6, ggg $$7) {
      if (!$$0.b()) {
         $$3.a();
         boolean $$8 = $$1 == cmo.g || $$1 == cmo.h || $$1 == cmo.i;
         if ($$8) {
            if ($$0.a(cmu.vI)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(cmu.qU)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(cmu.vI) || $$8)) {
            boolean $$10;
            if ($$1 != cmo.g && !$$1.b() && $$0.d() instanceof ckk) {
               cwj $$9 = ((ckk)$$0.d()).e();
               $$10 = !($$9 instanceof czz) && !($$9 instanceof deb);
            } else {
               $$10 = true;
            }

            fth $$12 = fsu.a($$0, $$10);
            epx $$14;
            if (a($$0) && $$0.B()) {
               $$3.a();
               ept.a $$13 = $$3.c();
               if ($$1 == cmo.g) {
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

   private static boolean a(cmr $$0) {
      return $$0.a(asj.aD) || $$0.a(cmu.qT);
   }

   public static epx a(fsz $$0, fth $$1, boolean $$2, boolean $$3) {
      return $$3 ? eqa.a($$0.getBuffer($$2 ? fth.j() : fth.k()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static epx a(fsz $$0, fth $$1, ept.a $$2) {
      return eqa.a(new epu($$0.getBuffer(fth.m()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static epx b(fsz $$0, fth $$1, ept.a $$2) {
      return eqa.a(new epu($$0.getBuffer(fth.n()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static epx b(fsz $$0, fth $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return eva.L() && $$1 == fto.j()
            ? eqa.a($$0.getBuffer(fth.l()), $$0.getBuffer($$1))
            : eqa.a($$0.getBuffer($$2 ? fth.m() : fth.o()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static epx c(fsz $$0, fth $$1, boolean $$2, boolean $$3) {
      return $$3 ? eqa.a($$0.getBuffer($$2 ? fth.n() : fth.p()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(ept $$0, epx $$1, List<ftw> $$2, cmr $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.b();
      ept.a $$7 = $$0.c();

      for (ftw $$8 : $$2) {
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

   public ggg a(cmr $$0, @Nullable cti $$1, @Nullable bmf $$2, int $$3) {
      ggg $$4;
      if ($$0.a(cmu.vI)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(cmu.qU)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fnk $$7 = $$1 instanceof fnk ? (fnk)$$1 : null;
      ggg $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(cmr $$0, cmo $$1, int $$2, int $$3, ept $$4, fsz $$5, @Nullable cti $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bmf $$0, cmr $$1, cmo $$2, boolean $$3, ept $$4, fsz $$5, @Nullable cti $$6, int $$7, int $$8, int $$9) {
      if (!$$1.b()) {
         ggg $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(aqc $$0) {
      this.o.b();
   }
}
