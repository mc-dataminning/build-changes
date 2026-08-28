import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class gkk implements atx {
   public static final akk a = new akk("textures/misc/enchanted_glint_entity.png");
   public static final akk b = new akk("textures/misc/enchanted_glint_item.png");
   private static final Set<ctx> k = Sets.newHashSet(new ctx[]{cuf.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final grw l = grw.c("trident", "inventory");
   public static final grw i = grw.c("trident_in_hand", "inventory");
   private static final grw m = grw.c("spyglass", "inventory");
   public static final grw j = grw.c("spyglass_in_hand", "inventory");
   private final fft n;
   private final gea o;
   private final gpp p;
   private final fha q;
   private final gdq r;

   public gkk(fft $$0, gpp $$1, grv $$2, fha $$3, gdq $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new gea($$2);
      this.r = $$4;

      for (ctx $$5 : lq.g) {
         if (!k.contains($$5)) {
            this.o.a($$5, new grw(lq.g.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public gea a() {
      return this.o;
   }

   private void a(grp $$0, cuc $$1, int $$2, int $$3, fam $$4, faq $$5) {
      ayo $$6 = ayo.a();
      long $$7 = 42L;

      for (jf $$8 : jf.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cuc $$0, ctz $$1, boolean $$2, fam $$3, ged $$4, int $$5, int $$6, grp $$7) {
      if (!$$0.e()) {
         $$3.a();
         boolean $$8 = $$1 == ctz.g || $$1 == ctz.h || $$1 == ctz.i;
         if ($$8) {
            if ($$0.a(cuf.vS)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(cuf.qX)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(cuf.vS) || $$8)) {
            boolean $$10;
            if ($$1 != ctz.g && !$$1.b() && $$0.g() instanceof csb) {
               dfh $$9 = ((csb)$$0.g()).d();
               $$10 = !($$9 instanceof dix) && !($$9 instanceof dna);
            } else {
               $$10 = true;
            }

            gel $$12 = gdy.a($$0, $$10);
            faq $$14;
            if (a($$0) && $$0.x()) {
               fam.a $$13 = $$3.c().c();
               if ($$1 == ctz.g) {
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

   private static boolean a(cuc $$0) {
      return $$0.a(awf.bd) || $$0.a(cuf.qW);
   }

   public static faq a(ged $$0, gel $$1, boolean $$2, boolean $$3) {
      return $$3 ? fat.a($$0.getBuffer($$2 ? gel.j() : gel.k()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static faq a(ged $$0, gel $$1, fam.a $$2) {
      return fat.a(new fan($$0.getBuffer(gel.m()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static faq b(ged $$0, gel $$1, fam.a $$2) {
      return fat.a(new fan($$0.getBuffer(gel.n()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static faq b(ged $$0, gel $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return fft.O() && $$1 == ges.j()
            ? fat.a($$0.getBuffer(gel.l()), $$0.getBuffer($$1))
            : fat.a($$0.getBuffer($$2 ? gel.m() : gel.o()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static faq c(ged $$0, gel $$1, boolean $$2, boolean $$3) {
      return $$3 ? fat.a($$0.getBuffer($$2 ? gel.n() : gel.p()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(fam $$0, faq $$1, List<gfa> $$2, cuc $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.e();
      fam.a $$7 = $$0.c();

      for (gfa $$8 : $$2) {
         int $$9 = -1;
         if ($$6 && $$8.c()) {
            $$9 = this.q.a($$3, $$8.d());
         }

         float $$10 = (float)axq.b.a($$9) / 255.0F;
         float $$11 = (float)axq.b.b($$9) / 255.0F;
         float $$12 = (float)axq.b.c($$9) / 255.0F;
         float $$13 = (float)axq.b.d($$9) / 255.0F;
         $$1.a($$7, $$8, $$11, $$12, $$13, $$10, $$4, $$5);
      }
   }

   public grp a(cuc $$0, @Nullable dcf $$1, @Nullable btb $$2, int $$3) {
      grp $$4;
      if ($$0.a(cuf.vS)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(cuf.qX)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fyj $$7 = $$1 instanceof fyj ? (fyj)$$1 : null;
      grp $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(cuc $$0, ctz $$1, int $$2, int $$3, fam $$4, ged $$5, @Nullable dcf $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable btb $$0, cuc $$1, ctz $$2, boolean $$3, fam $$4, ged $$5, @Nullable dcf $$6, int $$7, int $$8, int $$9) {
      if (!$$1.e()) {
         grp $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(atw $$0) {
      this.o.b();
   }
}
