import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class gjt implements aup {
   public static final ale a = new ale("textures/misc/enchanted_glint_entity.png");
   public static final ale b = new ale("textures/misc/enchanted_glint_item.png");
   private static final Set<cui> k = Sets.newHashSet(new cui[]{cuq.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final grf l = grf.c("trident", "inventory");
   public static final grf i = grf.c("trident_in_hand", "inventory");
   private static final grf m = grf.c("spyglass", "inventory");
   public static final grf j = grf.c("spyglass_in_hand", "inventory");
   private final ffd n;
   private final gdj o;
   private final goy p;
   private final fgk q;
   private final gcz r;

   public gjt(ffd $$0, goy $$1, gre $$2, fgk $$3, gcz $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new gdj($$2);
      this.r = $$4;

      for (cui $$5 : lp.h) {
         if (!k.contains($$5)) {
            this.o.a($$5, new grf(lp.h.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public gdj a() {
      return this.o;
   }

   private void a(gqy $$0, cun $$1, int $$2, int $$3, ezw $$4, faa $$5) {
      azf $$6 = azf.a();
      long $$7 = 42L;

      for (je $$8 : je.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cun $$0, cuk $$1, boolean $$2, ezw $$3, gdm $$4, int $$5, int $$6, gqy $$7) {
      if (!$$0.e()) {
         $$3.a();
         boolean $$8 = $$1 == cuk.g || $$1 == cuk.h || $$1 == cuk.i;
         if ($$8) {
            if ($$0.a(cuq.vP)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(cuq.qX)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(cuq.vP) || $$8)) {
            boolean $$10;
            if ($$1 != cuk.g && !$$1.b() && $$0.g() instanceof csl) {
               dex $$9 = ((csl)$$0.g()).d();
               $$10 = !($$9 instanceof din) && !($$9 instanceof dmq);
            } else {
               $$10 = true;
            }

            gdu $$12 = gdh.a($$0, $$10);
            faa $$14;
            if (a($$0) && $$0.y()) {
               ezw.a $$13 = $$3.c().c();
               if ($$1 == cuk.g) {
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
               $$14 = c($$4, $$12, true, $$0.y());
            } else {
               $$14 = b($$4, $$12, true, $$0.y());
            }

            this.a($$7, $$0, $$5, $$6, $$3, $$14);
         } else {
            this.r.a($$0, $$1, $$3, $$4, $$5, $$6);
         }

         $$3.b();
      }
   }

   private static boolean a(cun $$0) {
      return $$0.a(awx.bd) || $$0.a(cuq.qW);
   }

   public static faa a(gdm $$0, gdu $$1, boolean $$2, boolean $$3) {
      return $$3 ? fad.a($$0.getBuffer($$2 ? gdu.j() : gdu.k()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static faa a(gdm $$0, gdu $$1, ezw.a $$2) {
      return fad.a(new ezx($$0.getBuffer(gdu.m()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static faa b(gdm $$0, gdu $$1, ezw.a $$2) {
      return fad.a(new ezx($$0.getBuffer(gdu.n()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static faa b(gdm $$0, gdu $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return ffd.O() && $$1 == geb.j()
            ? fad.a($$0.getBuffer(gdu.l()), $$0.getBuffer($$1))
            : fad.a($$0.getBuffer($$2 ? gdu.m() : gdu.o()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static faa c(gdm $$0, gdu $$1, boolean $$2, boolean $$3) {
      return $$3 ? fad.a($$0.getBuffer($$2 ? gdu.n() : gdu.p()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(ezw $$0, faa $$1, List<gej> $$2, cun $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.e();
      ezw.a $$7 = $$0.c();

      for (gej $$8 : $$2) {
         int $$9 = -1;
         if ($$6 && $$8.c()) {
            $$9 = this.q.a($$3, $$8.d());
         }

         float $$10 = (float)ayh.b.a($$9) / 255.0F;
         float $$11 = (float)ayh.b.b($$9) / 255.0F;
         float $$12 = (float)ayh.b.c($$9) / 255.0F;
         float $$13 = (float)ayh.b.d($$9) / 255.0F;
         $$1.a($$7, $$8, $$11, $$12, $$13, $$10, $$4, $$5);
      }
   }

   public gqy a(cun $$0, @Nullable dbw $$1, @Nullable btn $$2, int $$3) {
      gqy $$4;
      if ($$0.a(cuq.vP)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(cuq.qX)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fxt $$7 = $$1 instanceof fxt ? (fxt)$$1 : null;
      gqy $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(cun $$0, cuk $$1, int $$2, int $$3, ezw $$4, gdm $$5, @Nullable dbw $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable btn $$0, cun $$1, cuk $$2, boolean $$3, ezw $$4, gdm $$5, @Nullable dbw $$6, int $$7, int $$8, int $$9) {
      if (!$$1.e()) {
         gqy $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(auo $$0) {
      this.o.b();
   }
}
