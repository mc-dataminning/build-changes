import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class glp implements aue {
   public static final akt a = new akt("textures/misc/enchanted_glint_entity.png");
   public static final akt b = new akt("textures/misc/enchanted_glint_item.png");
   private static final Set<cuc> k = Sets.newHashSet(new cuc[]{cuk.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final gtg l = gtg.c("trident", "inventory");
   public static final gtg i = gtg.c("trident_in_hand", "inventory");
   private static final gtg m = gtg.c("spyglass", "inventory");
   public static final gtg j = gtg.c("spyglass_in_hand", "inventory");
   private final fgj n;
   private final gfd o;
   private final gqz p;
   private final fhr q;
   private final get r;

   public glp(fgj $$0, gqz $$1, gtf $$2, fhr $$3, get $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new gfd($$2);
      this.r = $$4;

      for (cuc $$5 : lh.h) {
         if (!k.contains($$5)) {
            this.o.a($$5, new gtg(lh.h.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public gfd a() {
      return this.o;
   }

   private void a(gsz $$0, cuh $$1, int $$2, int $$3, fbc $$4, fbg $$5) {
      ayt $$6 = ayt.a();
      long $$7 = 42L;

      for (iw $$8 : iw.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cuh $$0, cue $$1, boolean $$2, fbc $$3, gfg $$4, int $$5, int $$6, gsz $$7) {
      if (!$$0.d()) {
         $$3.a();
         boolean $$8 = $$1 == cue.g || $$1 == cue.h || $$1 == cue.i;
         if ($$8) {
            if ($$0.a(cuk.xA)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(cuk.su)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(cuk.xA) || $$8)) {
            boolean $$10;
            if ($$1 != cue.g && !$$1.b() && $$0.f() instanceof csc) {
               dfc $$9 = ((csc)$$0.f()).d();
               $$10 = !($$9 instanceof diw) && !($$9 instanceof dnj);
            } else {
               $$10 = true;
            }

            gfo $$12 = gfb.a($$0, $$10);
            fbg $$14;
            if (a($$0) && $$0.x()) {
               fbc.a $$13 = $$3.c().c();
               if ($$1 == cue.g) {
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
               $$14 = c($$4, $$12, true, $$0.x());
            } else {
               $$14 = b($$4, $$12, true, $$0.x());
            }

            this.a($$7, $$0, $$5, $$6, $$3, $$14);
         } else {
            this.r.a($$0, $$1, $$3, $$4, $$5, $$6);
         }

         $$3.b();
      }
   }

   private static boolean a(cuh $$0) {
      return $$0.a(awm.be) || $$0.a(cuk.st);
   }

   public static fbg a(gfg $$0, gfo $$1, boolean $$2, boolean $$3) {
      return $$3 ? fbj.a($$0.getBuffer($$2 ? gfo.j() : gfo.k()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static fbg a(gfg $$0, gfo $$1, fbc.a $$2) {
      return fbj.a(new fbd($$0.getBuffer(gfo.m()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static fbg b(gfg $$0, gfo $$1, fbc.a $$2) {
      return fbj.a(new fbd($$0.getBuffer(gfo.n()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static fbg b(gfg $$0, gfo $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return fgj.O() && $$1 == gfv.j()
            ? fbj.a($$0.getBuffer(gfo.l()), $$0.getBuffer($$1))
            : fbj.a($$0.getBuffer($$2 ? gfo.m() : gfo.o()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static fbg c(gfg $$0, gfo $$1, boolean $$2, boolean $$3) {
      return $$3 ? fbj.a($$0.getBuffer($$2 ? gfo.n() : gfo.p()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(fbc $$0, fbg $$1, List<ggd> $$2, cuh $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.d();
      fbc.a $$7 = $$0.c();

      for (ggd $$8 : $$2) {
         int $$9 = -1;
         if ($$6 && $$8.c()) {
            $$9 = this.q.a($$3, $$8.d());
         }

         float $$10 = (float)axw.b.a($$9) / 255.0F;
         float $$11 = (float)axw.b.b($$9) / 255.0F;
         float $$12 = (float)axw.b.c($$9) / 255.0F;
         float $$13 = (float)axw.b.d($$9) / 255.0F;
         $$1.a($$7, $$8, $$11, $$12, $$13, $$10, $$4, $$5);
      }
   }

   public gsz a(cuh $$0, @Nullable dca $$1, @Nullable bso $$2, int $$3) {
      gsz $$4;
      if ($$0.a(cuk.xA)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(cuk.su)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fzn $$7 = $$1 instanceof fzn ? (fzn)$$1 : null;
      gsz $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(cuh $$0, cue $$1, int $$2, int $$3, fbc $$4, gfg $$5, @Nullable dca $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bso $$0, cuh $$1, cue $$2, boolean $$3, fbc $$4, gfg $$5, @Nullable dca $$6, int $$7, int $$8, int $$9) {
      if (!$$1.d()) {
         gsz $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(aud $$0) {
      this.o.b();
   }
}
