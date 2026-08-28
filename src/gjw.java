import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class gjw implements auq {
   public static final alf a = new alf("textures/misc/enchanted_glint_entity.png");
   public static final alf b = new alf("textures/misc/enchanted_glint_item.png");
   private static final Set<cul> k = Sets.newHashSet(new cul[]{cut.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final gri l = gri.c("trident", "inventory");
   public static final gri i = gri.c("trident_in_hand", "inventory");
   private static final gri m = gri.c("spyglass", "inventory");
   public static final gri j = gri.c("spyglass_in_hand", "inventory");
   private final ffg n;
   private final gdm o;
   private final gpb p;
   private final fgn q;
   private final gdc r;

   public gjw(ffg $$0, gpb $$1, grh $$2, fgn $$3, gdc $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new gdm($$2);
      this.r = $$4;

      for (cul $$5 : lp.h) {
         if (!k.contains($$5)) {
            this.o.a($$5, new gri(lp.h.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public gdm a() {
      return this.o;
   }

   private void a(grb $$0, cuq $$1, int $$2, int $$3, ezz $$4, fad $$5) {
      azh $$6 = azh.a();
      long $$7 = 42L;

      for (je $$8 : je.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cuq $$0, cun $$1, boolean $$2, ezz $$3, gdp $$4, int $$5, int $$6, grb $$7) {
      if (!$$0.e()) {
         $$3.a();
         boolean $$8 = $$1 == cun.g || $$1 == cun.h || $$1 == cun.i;
         if ($$8) {
            if ($$0.a(cut.vP)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(cut.qX)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(cut.vP) || $$8)) {
            boolean $$10;
            if ($$1 != cun.g && !$$1.b() && $$0.g() instanceof cso) {
               dfa $$9 = ((cso)$$0.g()).d();
               $$10 = !($$9 instanceof diq) && !($$9 instanceof dmt);
            } else {
               $$10 = true;
            }

            gdx $$12 = gdk.a($$0, $$10);
            fad $$14;
            if (a($$0) && $$0.y()) {
               ezz.a $$13 = $$3.c().c();
               if ($$1 == cun.g) {
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

   private static boolean a(cuq $$0) {
      return $$0.a(awy.bd) || $$0.a(cut.qW);
   }

   public static fad a(gdp $$0, gdx $$1, boolean $$2, boolean $$3) {
      return $$3 ? fag.a($$0.getBuffer($$2 ? gdx.j() : gdx.k()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static fad a(gdp $$0, gdx $$1, ezz.a $$2) {
      return fag.a(new faa($$0.getBuffer(gdx.m()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static fad b(gdp $$0, gdx $$1, ezz.a $$2) {
      return fag.a(new faa($$0.getBuffer(gdx.n()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static fad b(gdp $$0, gdx $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return ffg.O() && $$1 == gee.j()
            ? fag.a($$0.getBuffer(gdx.l()), $$0.getBuffer($$1))
            : fag.a($$0.getBuffer($$2 ? gdx.m() : gdx.o()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static fad c(gdp $$0, gdx $$1, boolean $$2, boolean $$3) {
      return $$3 ? fag.a($$0.getBuffer($$2 ? gdx.n() : gdx.p()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(ezz $$0, fad $$1, List<gem> $$2, cuq $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.e();
      ezz.a $$7 = $$0.c();

      for (gem $$8 : $$2) {
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

   public grb a(cuq $$0, @Nullable dbz $$1, @Nullable btq $$2, int $$3) {
      grb $$4;
      if ($$0.a(cut.vP)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(cut.qX)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fxw $$7 = $$1 instanceof fxw ? (fxw)$$1 : null;
      grb $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(cuq $$0, cun $$1, int $$2, int $$3, ezz $$4, gdp $$5, @Nullable dbz $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable btq $$0, cuq $$1, cun $$2, boolean $$3, ezz $$4, gdp $$5, @Nullable dbz $$6, int $$7, int $$8, int $$9) {
      if (!$$1.e()) {
         grb $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(aup $$0) {
      this.o.b();
   }
}
