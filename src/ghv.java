import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class ghv implements ats {
   public static final akh a = new akh("textures/misc/enchanted_glint_entity.png");
   public static final akh b = new akh("textures/misc/enchanted_glint_item.png");
   private static final Set<csu> k = Sets.newHashSet(new csu[]{ctc.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final gpg l = gpg.c("trident", "inventory");
   public static final gpg i = gpg.c("trident_in_hand", "inventory");
   private static final gpg m = gpg.c("spyglass", "inventory");
   public static final gpg j = gpg.c("spyglass_in_hand", "inventory");
   private final fde n;
   private final gbl o;
   private final gmz p;
   private final fem q;
   private final gbb r;

   public ghv(fde $$0, gmz $$1, gpf $$2, fem $$3, gbb $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new gbl($$2);
      this.r = $$4;

      for (csu $$5 : ld.h) {
         if (!k.contains($$5)) {
            this.o.a($$5, new gpg(ld.h.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public gbl a() {
      return this.o;
   }

   private void a(goz $$0, csz $$1, int $$2, int $$3, exx $$4, eyb $$5) {
      ayg $$6 = ayg.a();
      long $$7 = 42L;

      for (is $$8 : is.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(csz $$0, csw $$1, boolean $$2, exx $$3, gbo $$4, int $$5, int $$6, goz $$7) {
      if (!$$0.d()) {
         $$3.a();
         boolean $$8 = $$1 == csw.g || $$1 == csw.h || $$1 == csw.i;
         if ($$8) {
            if ($$0.a(ctc.vP)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(ctc.qX)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(ctc.vP) || $$8)) {
            boolean $$10;
            if ($$1 != csw.g && !$$1.b() && $$0.f() instanceof cqx) {
               dde $$9 = ((cqx)$$0.f()).d();
               $$10 = !($$9 instanceof dgu) && !($$9 instanceof dkx);
            } else {
               $$10 = true;
            }

            gbw $$12 = gbj.a($$0, $$10);
            eyb $$14;
            if (a($$0) && $$0.x()) {
               exx.a $$13 = $$3.c().c();
               if ($$1 == csw.g) {
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

   private static boolean a(csz $$0) {
      return $$0.a(avz.bd) || $$0.a(ctc.qW);
   }

   public static eyb a(gbo $$0, gbw $$1, boolean $$2, boolean $$3) {
      return $$3 ? eye.a($$0.getBuffer($$2 ? gbw.j() : gbw.k()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static eyb a(gbo $$0, gbw $$1, exx.a $$2) {
      return eye.a(new exy($$0.getBuffer(gbw.m()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static eyb b(gbo $$0, gbw $$1, exx.a $$2) {
      return eye.a(new exy($$0.getBuffer(gbw.n()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static eyb b(gbo $$0, gbw $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return fde.O() && $$1 == gcd.j()
            ? eye.a($$0.getBuffer(gbw.l()), $$0.getBuffer($$1))
            : eye.a($$0.getBuffer($$2 ? gbw.m() : gbw.o()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static eyb c(gbo $$0, gbw $$1, boolean $$2, boolean $$3) {
      return $$3 ? eye.a($$0.getBuffer($$2 ? gbw.n() : gbw.p()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(exx $$0, eyb $$1, List<gcl> $$2, csz $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.d();
      exx.a $$7 = $$0.c();

      for (gcl $$8 : $$2) {
         int $$9 = -1;
         if ($$6 && $$8.c()) {
            $$9 = this.q.a($$3, $$8.d());
         }

         float $$10 = (float)axj.b.a($$9) / 255.0F;
         float $$11 = (float)axj.b.b($$9) / 255.0F;
         float $$12 = (float)axj.b.c($$9) / 255.0F;
         float $$13 = (float)axj.b.d($$9) / 255.0F;
         $$1.a($$7, $$8, $$11, $$12, $$13, $$10, $$4, $$5);
      }
   }

   public goz a(csz $$0, @Nullable dad $$1, @Nullable bsa $$2, int $$3) {
      goz $$4;
      if ($$0.a(ctc.vP)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(ctc.qX)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fvw $$7 = $$1 instanceof fvw ? (fvw)$$1 : null;
      goz $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(csz $$0, csw $$1, int $$2, int $$3, exx $$4, gbo $$5, @Nullable dad $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bsa $$0, csz $$1, csw $$2, boolean $$3, exx $$4, gbo $$5, @Nullable dad $$6, int $$7, int $$8, int $$9) {
      if (!$$1.d()) {
         goz $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(atr $$0) {
      this.o.b();
   }
}
