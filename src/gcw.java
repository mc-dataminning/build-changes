import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class gcw implements asg {
   public static final ajc a = new ajc("textures/misc/enchanted_glint_entity.png");
   public static final ajc b = new ajc("textures/misc/enchanted_glint_item.png");
   private static final Set<cpl> k = Sets.newHashSet(new cpl[]{cpt.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final gkg l = gkg.c("trident", "inventory");
   public static final gkg i = gkg.c("trident_in_hand", "inventory");
   private static final gkg m = gkg.c("spyglass", "inventory");
   public static final gkg j = gkg.c("spyglass_in_hand", "inventory");
   private final eyk n;
   private final fwn o;
   private final gia p;
   private final ezs q;
   private final fwd r;

   public gcw(eyk $$0, gia $$1, gkf $$2, ezs $$3, fwd $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new fwn($$2);
      this.r = $$4;

      for (cpl $$5 : kh.h) {
         if (!k.contains($$5)) {
            this.o.a($$5, new gkg(kh.h.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public fwn a() {
      return this.o;
   }

   private void a(gjz $$0, cpq $$1, int $$2, int $$3, etd $$4, eth $$5) {
      awt $$6 = awt.a();
      long $$7 = 42L;

      for (ih $$8 : ih.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cpq $$0, cpn $$1, boolean $$2, etd $$3, fwq $$4, int $$5, int $$6, gjz $$7) {
      if (!$$0.b()) {
         $$3.a();
         boolean $$8 = $$1 == cpn.g || $$1 == cpn.h || $$1 == cpn.i;
         if ($$8) {
            if ($$0.a(cpt.vL)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(cpt.qW)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(cpt.vL) || $$8)) {
            boolean $$10;
            if ($$1 != cpn.g && !$$1.b() && $$0.d() instanceof cnl) {
               czf $$9 = ((cnl)$$0.d()).d();
               $$10 = !($$9 instanceof dcv) && !($$9 instanceof dgx);
            } else {
               $$10 = true;
            }

            fwy $$12 = fwl.a($$0, $$10);
            eth $$14;
            if (a($$0) && $$0.C()) {
               etd.a $$13 = $$3.c().c();
               if ($$1 == cpn.g) {
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
               $$14 = c($$4, $$12, true, $$0.C());
            } else {
               $$14 = b($$4, $$12, true, $$0.C());
            }

            this.a($$7, $$0, $$5, $$6, $$3, $$14);
         } else {
            this.r.a($$0, $$1, $$3, $$4, $$5, $$6);
         }

         $$3.b();
      }
   }

   private static boolean a(cpq $$0) {
      return $$0.a(aum.aD) || $$0.a(cpt.qV);
   }

   public static eth a(fwq $$0, fwy $$1, boolean $$2, boolean $$3) {
      return $$3 ? etk.a($$0.getBuffer($$2 ? fwy.j() : fwy.k()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static eth a(fwq $$0, fwy $$1, etd.a $$2) {
      return etk.a(new ete($$0.getBuffer(fwy.m()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static eth b(fwq $$0, fwy $$1, etd.a $$2) {
      return etk.a(new ete($$0.getBuffer(fwy.n()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static eth b(fwq $$0, fwy $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return eyk.N() && $$1 == fxf.j()
            ? etk.a($$0.getBuffer(fwy.l()), $$0.getBuffer($$1))
            : etk.a($$0.getBuffer($$2 ? fwy.m() : fwy.o()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static eth c(fwq $$0, fwy $$1, boolean $$2, boolean $$3) {
      return $$3 ? etk.a($$0.getBuffer($$2 ? fwy.n() : fwy.p()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(etd $$0, eth $$1, List<fxn> $$2, cpq $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.b();
      etd.a $$7 = $$0.c();

      for (fxn $$8 : $$2) {
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

   public gjz a(cpq $$0, @Nullable cwe $$1, @Nullable box $$2, int $$3) {
      gjz $$4;
      if ($$0.a(cpt.vL)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(cpt.qW)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fra $$7 = $$1 instanceof fra ? (fra)$$1 : null;
      gjz $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(cpq $$0, cpn $$1, int $$2, int $$3, etd $$4, fwq $$5, @Nullable cwe $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable box $$0, cpq $$1, cpn $$2, boolean $$3, etd $$4, fwq $$5, @Nullable cwe $$6, int $$7, int $$8, int $$9) {
      if (!$$1.b()) {
         gjz $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(asf $$0) {
      this.o.b();
   }
}
