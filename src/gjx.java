import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class gjx implements auq {
   public static final alf a = new alf("textures/misc/enchanted_glint_entity.png");
   public static final alf b = new alf("textures/misc/enchanted_glint_item.png");
   private static final Set<cum> k = Sets.newHashSet(new cum[]{cuu.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final grj l = grj.c("trident", "inventory");
   public static final grj i = grj.c("trident_in_hand", "inventory");
   private static final grj m = grj.c("spyglass", "inventory");
   public static final grj j = grj.c("spyglass_in_hand", "inventory");
   private final ffh n;
   private final gdn o;
   private final gpc p;
   private final fgo q;
   private final gdd r;

   public gjx(ffh $$0, gpc $$1, gri $$2, fgo $$3, gdd $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new gdn($$2);
      this.r = $$4;

      for (cum $$5 : lp.h) {
         if (!k.contains($$5)) {
            this.o.a($$5, new grj(lp.h.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public gdn a() {
      return this.o;
   }

   private void a(grc $$0, cur $$1, int $$2, int $$3, faa $$4, fae $$5) {
      azh $$6 = azh.a();
      long $$7 = 42L;

      for (je $$8 : je.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cur $$0, cuo $$1, boolean $$2, faa $$3, gdq $$4, int $$5, int $$6, grc $$7) {
      if (!$$0.e()) {
         $$3.a();
         boolean $$8 = $$1 == cuo.g || $$1 == cuo.h || $$1 == cuo.i;
         if ($$8) {
            if ($$0.a(cuu.vP)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(cuu.qX)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(cuu.vP) || $$8)) {
            boolean $$10;
            if ($$1 != cuo.g && !$$1.b() && $$0.g() instanceof csp) {
               dfb $$9 = ((csp)$$0.g()).d();
               $$10 = !($$9 instanceof dir) && !($$9 instanceof dmu);
            } else {
               $$10 = true;
            }

            gdy $$12 = gdl.a($$0, $$10);
            fae $$14;
            if (a($$0) && $$0.y()) {
               faa.a $$13 = $$3.c().c();
               if ($$1 == cuo.g) {
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

   private static boolean a(cur $$0) {
      return $$0.a(awy.bd) || $$0.a(cuu.qW);
   }

   public static fae a(gdq $$0, gdy $$1, boolean $$2, boolean $$3) {
      return $$3 ? fah.a($$0.getBuffer($$2 ? gdy.j() : gdy.k()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static fae a(gdq $$0, gdy $$1, faa.a $$2) {
      return fah.a(new fab($$0.getBuffer(gdy.m()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static fae b(gdq $$0, gdy $$1, faa.a $$2) {
      return fah.a(new fab($$0.getBuffer(gdy.n()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static fae b(gdq $$0, gdy $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return ffh.O() && $$1 == gef.j()
            ? fah.a($$0.getBuffer(gdy.l()), $$0.getBuffer($$1))
            : fah.a($$0.getBuffer($$2 ? gdy.m() : gdy.o()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static fae c(gdq $$0, gdy $$1, boolean $$2, boolean $$3) {
      return $$3 ? fah.a($$0.getBuffer($$2 ? gdy.n() : gdy.p()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(faa $$0, fae $$1, List<gen> $$2, cur $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.e();
      faa.a $$7 = $$0.c();

      for (gen $$8 : $$2) {
         int $$9 = -1;
         if ($$6 && $$8.c()) {
            $$9 = this.q.a($$3, $$8.d());
         }

         float $$10 = (float)ayj.b.a($$9) / 255.0F;
         float $$11 = (float)ayj.b.b($$9) / 255.0F;
         float $$12 = (float)ayj.b.c($$9) / 255.0F;
         float $$13 = (float)ayj.b.d($$9) / 255.0F;
         $$1.a($$7, $$8, $$11, $$12, $$13, $$10, $$4, $$5);
      }
   }

   public grc a(cur $$0, @Nullable dca $$1, @Nullable btr $$2, int $$3) {
      grc $$4;
      if ($$0.a(cuu.vP)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(cuu.qX)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fxx $$7 = $$1 instanceof fxx ? (fxx)$$1 : null;
      grc $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(cur $$0, cuo $$1, int $$2, int $$3, faa $$4, gdq $$5, @Nullable dca $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable btr $$0, cur $$1, cuo $$2, boolean $$3, faa $$4, gdq $$5, @Nullable dca $$6, int $$7, int $$8, int $$9) {
      if (!$$1.e()) {
         grc $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(aup $$0) {
      this.o.b();
   }
}
