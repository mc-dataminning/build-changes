import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class ggg implements atd {
   public static final ajt a = new ajt("textures/misc/enchanted_glint_entity.png");
   public static final ajt b = new ajt("textures/misc/enchanted_glint_item.png");
   private static final Set<cre> k = Sets.newHashSet(new cre[]{crm.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final gnq l = gnq.c("trident", "inventory");
   public static final gnq i = gnq.c("trident_in_hand", "inventory");
   private static final gnq m = gnq.c("spyglass", "inventory");
   public static final gnq j = gnq.c("spyglass_in_hand", "inventory");
   private final fbp n;
   private final fzw o;
   private final glk p;
   private final fcx q;
   private final fzm r;

   public ggg(fbp $$0, glk $$1, gnp $$2, fcx $$3, fzm $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new fzw($$2);
      this.r = $$4;

      for (cre $$5 : kr.h) {
         if (!k.contains($$5)) {
            this.o.a($$5, new gnq(kr.h.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public fzw a() {
      return this.o;
   }

   private void a(gnj $$0, crj $$1, int $$2, int $$3, ewi $$4, ewm $$5) {
      axr $$6 = axr.a();
      long $$7 = 42L;

      for (ih $$8 : ih.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(crj $$0, crg $$1, boolean $$2, ewi $$3, fzz $$4, int $$5, int $$6, gnj $$7) {
      if (!$$0.d()) {
         $$3.a();
         boolean $$8 = $$1 == crg.g || $$1 == crg.h || $$1 == crg.i;
         if ($$8) {
            if ($$0.a(crm.vN)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(crm.qW)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(crm.vN) || $$8)) {
            boolean $$10;
            if ($$1 != crg.g && !$$1.b() && $$0.f() instanceof cph) {
               dby $$9 = ((cph)$$0.f()).d();
               $$10 = !($$9 instanceof dfo) && !($$9 instanceof djq);
            } else {
               $$10 = true;
            }

            gah $$12 = fzu.a($$0, $$10);
            ewm $$14;
            if (a($$0) && $$0.x()) {
               ewi.a $$13 = $$3.c().c();
               if ($$1 == crg.g) {
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

   private static boolean a(crj $$0) {
      return $$0.a(avk.aD) || $$0.a(crm.qV);
   }

   public static ewm a(fzz $$0, gah $$1, boolean $$2, boolean $$3) {
      return $$3 ? ewp.a($$0.getBuffer($$2 ? gah.j() : gah.k()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static ewm a(fzz $$0, gah $$1, ewi.a $$2) {
      return ewp.a(new ewj($$0.getBuffer(gah.m()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static ewm b(fzz $$0, gah $$1, ewi.a $$2) {
      return ewp.a(new ewj($$0.getBuffer(gah.n()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static ewm b(fzz $$0, gah $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return fbp.O() && $$1 == gao.j()
            ? ewp.a($$0.getBuffer(gah.l()), $$0.getBuffer($$1))
            : ewp.a($$0.getBuffer($$2 ? gah.m() : gah.o()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static ewm c(fzz $$0, gah $$1, boolean $$2, boolean $$3) {
      return $$3 ? ewp.a($$0.getBuffer($$2 ? gah.n() : gah.p()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(ewi $$0, ewm $$1, List<gaw> $$2, crj $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.d();
      ewi.a $$7 = $$0.c();

      for (gaw $$8 : $$2) {
         int $$9 = -1;
         if ($$6 && $$8.c()) {
            $$9 = this.q.a($$3, $$8.d());
         }

         float $$10 = (float)awu.b.a($$9) / 255.0F;
         float $$11 = (float)awu.b.b($$9) / 255.0F;
         float $$12 = (float)awu.b.c($$9) / 255.0F;
         float $$13 = (float)awu.b.d($$9) / 255.0F;
         $$1.a($$7, $$8, $$11, $$12, $$13, $$10, $$4, $$5);
      }
   }

   public gnj a(crj $$0, @Nullable cyx $$1, @Nullable bqo $$2, int $$3) {
      gnj $$4;
      if ($$0.a(crm.vN)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(crm.qW)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fuh $$7 = $$1 instanceof fuh ? (fuh)$$1 : null;
      gnj $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(crj $$0, crg $$1, int $$2, int $$3, ewi $$4, fzz $$5, @Nullable cyx $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bqo $$0, crj $$1, crg $$2, boolean $$3, ewi $$4, fzz $$5, @Nullable cyx $$6, int $$7, int $$8, int $$9) {
      if (!$$1.d()) {
         gnj $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(atc $$0) {
      this.o.b();
   }
}
