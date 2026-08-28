import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class gkm implements atx {
   public static final akk a = new akk("textures/misc/enchanted_glint_entity.png");
   public static final akk b = new akk("textures/misc/enchanted_glint_item.png");
   private static final Set<cty> k = Sets.newHashSet(new cty[]{cug.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final gry l = gry.c("trident", "inventory");
   public static final gry i = gry.c("trident_in_hand", "inventory");
   private static final gry m = gry.c("spyglass", "inventory");
   public static final gry j = gry.c("spyglass_in_hand", "inventory");
   private final ffw n;
   private final gec o;
   private final gpr p;
   private final fhc q;
   private final gds r;

   public gkm(ffw $$0, gpr $$1, grx $$2, fhc $$3, gds $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new gec($$2);
      this.r = $$4;

      for (cty $$5 : lq.g) {
         if (!k.contains($$5)) {
            this.o.a($$5, new gry(lq.g.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public gec a() {
      return this.o;
   }

   private void a(grr $$0, cud $$1, int $$2, int $$3, fao $$4, fas $$5) {
      ayo $$6 = ayo.a();
      long $$7 = 42L;

      for (jf $$8 : jf.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cud $$0, cua $$1, boolean $$2, fao $$3, gef $$4, int $$5, int $$6, grr $$7) {
      if (!$$0.e()) {
         $$3.a();
         boolean $$8 = $$1 == cua.g || $$1 == cua.h || $$1 == cua.i;
         if ($$8) {
            if ($$0.a(cug.vS)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(cug.qX)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(cug.vS) || $$8)) {
            boolean $$10;
            if ($$1 != cua.g && !$$1.b() && $$0.g() instanceof csc) {
               dfi $$9 = ((csc)$$0.g()).d();
               $$10 = !($$9 instanceof diy) && !($$9 instanceof dnb);
            } else {
               $$10 = true;
            }

            gen $$12 = gea.a($$0, $$10);
            fas $$14;
            if (a($$0) && $$0.x()) {
               fao.a $$13 = $$3.c().c();
               if ($$1 == cua.g) {
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

   private static boolean a(cud $$0) {
      return $$0.a(awf.bd) || $$0.a(cug.qW);
   }

   public static fas a(gef $$0, gen $$1, boolean $$2, boolean $$3) {
      return $$3 ? fav.a($$0.getBuffer($$2 ? gen.j() : gen.k()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static fas a(gef $$0, gen $$1, fao.a $$2) {
      return fav.a(new fap($$0.getBuffer(gen.m()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static fas b(gef $$0, gen $$1, fao.a $$2) {
      return fav.a(new fap($$0.getBuffer(gen.n()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static fas b(gef $$0, gen $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return ffw.O() && $$1 == geu.j()
            ? fav.a($$0.getBuffer(gen.l()), $$0.getBuffer($$1))
            : fav.a($$0.getBuffer($$2 ? gen.m() : gen.o()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static fas c(gef $$0, gen $$1, boolean $$2, boolean $$3) {
      return $$3 ? fav.a($$0.getBuffer($$2 ? gen.n() : gen.p()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(fao $$0, fas $$1, List<gfc> $$2, cud $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.e();
      fao.a $$7 = $$0.c();

      for (gfc $$8 : $$2) {
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

   public grr a(cud $$0, @Nullable dcg $$1, @Nullable btc $$2, int $$3) {
      grr $$4;
      if ($$0.a(cug.vS)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(cug.qX)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fyl $$7 = $$1 instanceof fyl ? (fyl)$$1 : null;
      grr $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(cud $$0, cua $$1, int $$2, int $$3, fao $$4, gef $$5, @Nullable dcg $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable btc $$0, cud $$1, cua $$2, boolean $$3, fao $$4, gef $$5, @Nullable dcg $$6, int $$7, int $$8, int $$9) {
      if (!$$1.e()) {
         grr $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(atw $$0) {
      this.o.b();
   }
}
