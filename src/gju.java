import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class gju implements aup {
   public static final ale a = new ale("textures/misc/enchanted_glint_entity.png");
   public static final ale b = new ale("textures/misc/enchanted_glint_item.png");
   private static final Set<cuj> k = Sets.newHashSet(new cuj[]{cur.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final grg l = grg.c("trident", "inventory");
   public static final grg i = grg.c("trident_in_hand", "inventory");
   private static final grg m = grg.c("spyglass", "inventory");
   public static final grg j = grg.c("spyglass_in_hand", "inventory");
   private final ffe n;
   private final gdk o;
   private final goz p;
   private final fgl q;
   private final gda r;

   public gju(ffe $$0, goz $$1, grf $$2, fgl $$3, gda $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new gdk($$2);
      this.r = $$4;

      for (cuj $$5 : lp.h) {
         if (!k.contains($$5)) {
            this.o.a($$5, new grg(lp.h.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public gdk a() {
      return this.o;
   }

   private void a(gqz $$0, cuo $$1, int $$2, int $$3, ezx $$4, fab $$5) {
      azg $$6 = azg.a();
      long $$7 = 42L;

      for (je $$8 : je.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cuo $$0, cul $$1, boolean $$2, ezx $$3, gdn $$4, int $$5, int $$6, gqz $$7) {
      if (!$$0.e()) {
         $$3.a();
         boolean $$8 = $$1 == cul.g || $$1 == cul.h || $$1 == cul.i;
         if ($$8) {
            if ($$0.a(cur.vP)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(cur.qX)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(cur.vP) || $$8)) {
            boolean $$10;
            if ($$1 != cul.g && !$$1.b() && $$0.g() instanceof csm) {
               dey $$9 = ((csm)$$0.g()).d();
               $$10 = !($$9 instanceof dio) && !($$9 instanceof dmr);
            } else {
               $$10 = true;
            }

            gdv $$12 = gdi.a($$0, $$10);
            fab $$14;
            if (a($$0) && $$0.y()) {
               ezx.a $$13 = $$3.c().c();
               if ($$1 == cul.g) {
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

   private static boolean a(cuo $$0) {
      return $$0.a(awx.bd) || $$0.a(cur.qW);
   }

   public static fab a(gdn $$0, gdv $$1, boolean $$2, boolean $$3) {
      return $$3 ? fae.a($$0.getBuffer($$2 ? gdv.j() : gdv.k()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static fab a(gdn $$0, gdv $$1, ezx.a $$2) {
      return fae.a(new ezy($$0.getBuffer(gdv.m()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static fab b(gdn $$0, gdv $$1, ezx.a $$2) {
      return fae.a(new ezy($$0.getBuffer(gdv.n()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static fab b(gdn $$0, gdv $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return ffe.O() && $$1 == gec.j()
            ? fae.a($$0.getBuffer(gdv.l()), $$0.getBuffer($$1))
            : fae.a($$0.getBuffer($$2 ? gdv.m() : gdv.o()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static fab c(gdn $$0, gdv $$1, boolean $$2, boolean $$3) {
      return $$3 ? fae.a($$0.getBuffer($$2 ? gdv.n() : gdv.p()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(ezx $$0, fab $$1, List<gek> $$2, cuo $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.e();
      ezx.a $$7 = $$0.c();

      for (gek $$8 : $$2) {
         int $$9 = -1;
         if ($$6 && $$8.c()) {
            $$9 = this.q.a($$3, $$8.d());
         }

         float $$10 = (float)ayi.b.a($$9) / 255.0F;
         float $$11 = (float)ayi.b.b($$9) / 255.0F;
         float $$12 = (float)ayi.b.c($$9) / 255.0F;
         float $$13 = (float)ayi.b.d($$9) / 255.0F;
         $$1.a($$7, $$8, $$11, $$12, $$13, $$10, $$4, $$5);
      }
   }

   public gqz a(cuo $$0, @Nullable dbx $$1, @Nullable bto $$2, int $$3) {
      gqz $$4;
      if ($$0.a(cur.vP)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(cur.qX)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fxu $$7 = $$1 instanceof fxu ? (fxu)$$1 : null;
      gqz $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(cuo $$0, cul $$1, int $$2, int $$3, ezx $$4, gdn $$5, @Nullable dbx $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bto $$0, cuo $$1, cul $$2, boolean $$3, ezx $$4, gdn $$5, @Nullable dbx $$6, int $$7, int $$8, int $$9) {
      if (!$$1.e()) {
         gqz $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(auo $$0) {
      this.o.b();
   }
}
