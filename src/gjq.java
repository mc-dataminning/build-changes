import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class gjq implements aum {
   public static final alb a = new alb("textures/misc/enchanted_glint_entity.png");
   public static final alb b = new alb("textures/misc/enchanted_glint_item.png");
   private static final Set<cuf> k = Sets.newHashSet(new cuf[]{cun.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final grc l = grc.c("trident", "inventory");
   public static final grc i = grc.c("trident_in_hand", "inventory");
   private static final grc m = grc.c("spyglass", "inventory");
   public static final grc j = grc.c("spyglass_in_hand", "inventory");
   private final ffa n;
   private final gdg o;
   private final gov p;
   private final fgh q;
   private final gcw r;

   public gjq(ffa $$0, gov $$1, grb $$2, fgh $$3, gcw $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new gdg($$2);
      this.r = $$4;

      for (cuf $$5 : lp.h) {
         if (!k.contains($$5)) {
            this.o.a($$5, new grc(lp.h.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public gdg a() {
      return this.o;
   }

   private void a(gqv $$0, cuk $$1, int $$2, int $$3, ezt $$4, ezx $$5) {
      azc $$6 = azc.a();
      long $$7 = 42L;

      for (je $$8 : je.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cuk $$0, cuh $$1, boolean $$2, ezt $$3, gdj $$4, int $$5, int $$6, gqv $$7) {
      if (!$$0.e()) {
         $$3.a();
         boolean $$8 = $$1 == cuh.g || $$1 == cuh.h || $$1 == cuh.i;
         if ($$8) {
            if ($$0.a(cun.vP)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(cun.qX)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(cun.vP) || $$8)) {
            boolean $$10;
            if ($$1 != cuh.g && !$$1.b() && $$0.g() instanceof csi) {
               deu $$9 = ((csi)$$0.g()).d();
               $$10 = !($$9 instanceof dik) && !($$9 instanceof dmn);
            } else {
               $$10 = true;
            }

            gdr $$12 = gde.a($$0, $$10);
            ezx $$14;
            if (a($$0) && $$0.y()) {
               ezt.a $$13 = $$3.c().c();
               if ($$1 == cuh.g) {
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

   private static boolean a(cuk $$0) {
      return $$0.a(awu.bd) || $$0.a(cun.qW);
   }

   public static ezx a(gdj $$0, gdr $$1, boolean $$2, boolean $$3) {
      return $$3 ? faa.a($$0.getBuffer($$2 ? gdr.j() : gdr.k()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static ezx a(gdj $$0, gdr $$1, ezt.a $$2) {
      return faa.a(new ezu($$0.getBuffer(gdr.m()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static ezx b(gdj $$0, gdr $$1, ezt.a $$2) {
      return faa.a(new ezu($$0.getBuffer(gdr.n()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static ezx b(gdj $$0, gdr $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return ffa.O() && $$1 == gdy.j()
            ? faa.a($$0.getBuffer(gdr.l()), $$0.getBuffer($$1))
            : faa.a($$0.getBuffer($$2 ? gdr.m() : gdr.o()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static ezx c(gdj $$0, gdr $$1, boolean $$2, boolean $$3) {
      return $$3 ? faa.a($$0.getBuffer($$2 ? gdr.n() : gdr.p()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(ezt $$0, ezx $$1, List<geg> $$2, cuk $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.e();
      ezt.a $$7 = $$0.c();

      for (geg $$8 : $$2) {
         int $$9 = -1;
         if ($$6 && $$8.c()) {
            $$9 = this.q.a($$3, $$8.d());
         }

         float $$10 = (float)aye.b.a($$9) / 255.0F;
         float $$11 = (float)aye.b.b($$9) / 255.0F;
         float $$12 = (float)aye.b.c($$9) / 255.0F;
         float $$13 = (float)aye.b.d($$9) / 255.0F;
         $$1.a($$7, $$8, $$11, $$12, $$13, $$10, $$4, $$5);
      }
   }

   public gqv a(cuk $$0, @Nullable dbt $$1, @Nullable btk $$2, int $$3) {
      gqv $$4;
      if ($$0.a(cun.vP)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(cun.qX)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fxq $$7 = $$1 instanceof fxq ? (fxq)$$1 : null;
      gqv $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(cuk $$0, cuh $$1, int $$2, int $$3, ezt $$4, gdj $$5, @Nullable dbt $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable btk $$0, cuk $$1, cuh $$2, boolean $$3, ezt $$4, gdj $$5, @Nullable dbt $$6, int $$7, int $$8, int $$9) {
      if (!$$1.e()) {
         gqv $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(aul $$0) {
      this.o.b();
   }
}
