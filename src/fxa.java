import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fxa implements apm {
   public static final agm a = new agm("textures/misc/enchanted_glint_entity.png");
   public static final agm b = new agm("textures/misc/enchanted_glint_item.png");
   private static final Set<clj> k = Sets.newHashSet(new clj[]{clr.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final geh l = geh.c("trident", "inventory");
   public static final geh i = geh.c("trident_in_hand", "inventory");
   private static final geh m = geh.c("spyglass", "inventory");
   public static final geh j = geh.c("spyglass_in_hand", "inventory");
   private final eti n;
   private final fqw o;
   private final gca p;
   private final euo q;
   private final fqm r;

   public fxa(eti $$0, gca $$1, geg $$2, euo $$3, fqm $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new fqw($$2);
      this.r = $$4;

      for (clj $$5 : kc.i) {
         if (!k.contains($$5)) {
            this.o.a($$5, new geh(kc.i.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public fqw a() {
      return this.o;
   }

   private void a(gea $$0, clo $$1, int $$2, int $$3, eob $$4, eof $$5) {
      atw $$6 = atw.a();
      long $$7 = 42L;

      for (ib $$8 : ib.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(clo $$0, cll $$1, boolean $$2, eob $$3, fqz $$4, int $$5, int $$6, gea $$7) {
      if (!$$0.b()) {
         $$3.a();
         boolean $$8 = $$1 == cll.g || $$1 == cll.h || $$1 == cll.i;
         if ($$8) {
            if ($$0.a(clr.vH)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(clr.qU)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(clr.vH) || $$8)) {
            boolean $$10;
            if ($$1 != cll.g && !$$1.b() && $$0.d() instanceof cjh) {
               cvf $$9 = ((cjh)$$0.d()).e();
               $$10 = !($$9 instanceof cyv) && !($$9 instanceof dcx);
            } else {
               $$10 = true;
            }

            frh $$12 = fqu.a($$0, $$10);
            eof $$14;
            if (a($$0) && $$0.B()) {
               $$3.a();
               eob.a $$13 = $$3.c();
               if ($$1 == cll.g) {
                  f.a($$13.a(), 0.5F);
               } else if ($$1.b()) {
                  f.a($$13.a(), 0.75F);
               }

               if ($$10) {
                  $$14 = b($$4, $$12, $$13);
               } else {
                  $$14 = a($$4, $$12, $$13);
               }

               $$3.b();
            } else if ($$10) {
               $$14 = c($$4, $$12, true, $$0.B());
            } else {
               $$14 = b($$4, $$12, true, $$0.B());
            }

            this.a($$7, $$0, $$5, $$6, $$3, $$14);
         } else {
            this.r.a($$0, $$1, $$3, $$4, $$5, $$6);
         }

         $$3.b();
      }
   }

   private static boolean a(clo $$0) {
      return $$0.a(ars.aD) || $$0.a(clr.qT);
   }

   public static eof a(fqz $$0, frh $$1, boolean $$2, boolean $$3) {
      return $$3 ? eoi.a($$0.getBuffer($$2 ? frh.j() : frh.k()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static eof a(fqz $$0, frh $$1, eob.a $$2) {
      return eoi.a(new eoc($$0.getBuffer(frh.m()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static eof b(fqz $$0, frh $$1, eob.a $$2) {
      return eoi.a(new eoc($$0.getBuffer(frh.n()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static eof b(fqz $$0, frh $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return eti.L() && $$1 == fro.j()
            ? eoi.a($$0.getBuffer(frh.l()), $$0.getBuffer($$1))
            : eoi.a($$0.getBuffer($$2 ? frh.m() : frh.o()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static eof c(fqz $$0, frh $$1, boolean $$2, boolean $$3) {
      return $$3 ? eoi.a($$0.getBuffer($$2 ? frh.n() : frh.p()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(eob $$0, eof $$1, List<frw> $$2, clo $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.b();
      eob.a $$7 = $$0.c();

      for (frw $$8 : $$2) {
         int $$9 = -1;
         if ($$6 && $$8.c()) {
            $$9 = this.q.a($$3, $$8.d());
         }

         float $$10 = (float)($$9 >> 16 & 0xFF) / 255.0F;
         float $$11 = (float)($$9 >> 8 & 0xFF) / 255.0F;
         float $$12 = (float)($$9 & 0xFF) / 255.0F;
         $$1.a($$7, $$8, $$10, $$11, $$12, $$4, $$5);
      }
   }

   public gea a(clo $$0, @Nullable csf $$1, @Nullable bll $$2, int $$3) {
      gea $$4;
      if ($$0.a(clr.vH)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(clr.qU)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      flo $$7 = $$1 instanceof flo ? (flo)$$1 : null;
      gea $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(clo $$0, cll $$1, int $$2, int $$3, eob $$4, fqz $$5, @Nullable csf $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bll $$0, clo $$1, cll $$2, boolean $$3, eob $$4, fqz $$5, @Nullable csf $$6, int $$7, int $$8, int $$9) {
      if (!$$1.b()) {
         gea $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(apl $$0) {
      this.o.b();
   }
}
