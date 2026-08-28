import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class gke implements atv {
   public static final akk a = new akk("textures/misc/enchanted_glint_entity.png");
   public static final akk b = new akk("textures/misc/enchanted_glint_item.png");
   private static final Set<ctv> k = Sets.newHashSet(new ctv[]{cud.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final grq l = grq.c("trident", "inventory");
   public static final grq i = grq.c("trident_in_hand", "inventory");
   private static final grq m = grq.c("spyglass", "inventory");
   public static final grq j = grq.c("spyglass_in_hand", "inventory");
   private final ffn n;
   private final gdu o;
   private final gpj p;
   private final fgu q;
   private final gdk r;

   public gke(ffn $$0, gpj $$1, grp $$2, fgu $$3, gdk $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new gdu($$2);
      this.r = $$4;

      for (ctv $$5 : lq.g) {
         if (!k.contains($$5)) {
            this.o.a($$5, new grq(lq.g.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public gdu a() {
      return this.o;
   }

   private void a(grj $$0, cua $$1, int $$2, int $$3, fag $$4, fak $$5) {
      aym $$6 = aym.a();
      long $$7 = 42L;

      for (jf $$8 : jf.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cua $$0, ctx $$1, boolean $$2, fag $$3, gdx $$4, int $$5, int $$6, grj $$7) {
      if (!$$0.e()) {
         $$3.a();
         boolean $$8 = $$1 == ctx.g || $$1 == ctx.h || $$1 == ctx.i;
         if ($$8) {
            if ($$0.a(cud.vS)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(cud.qX)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(cud.vS) || $$8)) {
            boolean $$10;
            if ($$1 != ctx.g && !$$1.b() && $$0.g() instanceof cry) {
               dff $$9 = ((cry)$$0.g()).d();
               $$10 = !($$9 instanceof div) && !($$9 instanceof dmy);
            } else {
               $$10 = true;
            }

            gef $$12 = gds.a($$0, $$10);
            fak $$14;
            if (a($$0) && $$0.x()) {
               fag.a $$13 = $$3.c().c();
               if ($$1 == ctx.g) {
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

   private static boolean a(cua $$0) {
      return $$0.a(awd.bd) || $$0.a(cud.qW);
   }

   public static fak a(gdx $$0, gef $$1, boolean $$2, boolean $$3) {
      return $$3 ? fan.a($$0.getBuffer($$2 ? gef.j() : gef.k()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static fak a(gdx $$0, gef $$1, fag.a $$2) {
      return fan.a(new fah($$0.getBuffer(gef.m()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static fak b(gdx $$0, gef $$1, fag.a $$2) {
      return fan.a(new fah($$0.getBuffer(gef.n()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static fak b(gdx $$0, gef $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return ffn.O() && $$1 == gem.j()
            ? fan.a($$0.getBuffer(gef.l()), $$0.getBuffer($$1))
            : fan.a($$0.getBuffer($$2 ? gef.m() : gef.o()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static fak c(gdx $$0, gef $$1, boolean $$2, boolean $$3) {
      return $$3 ? fan.a($$0.getBuffer($$2 ? gef.n() : gef.p()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(fag $$0, fak $$1, List<geu> $$2, cua $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.e();
      fag.a $$7 = $$0.c();

      for (geu $$8 : $$2) {
         int $$9 = -1;
         if ($$6 && $$8.c()) {
            $$9 = this.q.a($$3, $$8.d());
         }

         float $$10 = (float)axo.b.a($$9) / 255.0F;
         float $$11 = (float)axo.b.b($$9) / 255.0F;
         float $$12 = (float)axo.b.c($$9) / 255.0F;
         float $$13 = (float)axo.b.d($$9) / 255.0F;
         $$1.a($$7, $$8, $$11, $$12, $$13, $$10, $$4, $$5);
      }
   }

   public grj a(cua $$0, @Nullable dcd $$1, @Nullable bsy $$2, int $$3) {
      grj $$4;
      if ($$0.a(cud.vS)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(cud.qX)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fyd $$7 = $$1 instanceof fyd ? (fyd)$$1 : null;
      grj $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(cua $$0, ctx $$1, int $$2, int $$3, fag $$4, gdx $$5, @Nullable dcd $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bsy $$0, cua $$1, ctx $$2, boolean $$3, fag $$4, gdx $$5, @Nullable dcd $$6, int $$7, int $$8, int $$9) {
      if (!$$1.e()) {
         grj $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(atu $$0) {
      this.o.b();
   }
}
