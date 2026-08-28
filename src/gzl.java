import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public abstract class gzl<T extends bxw, S extends hfr, M extends gic<? super S>> extends gyj<T, S> implements hah<S, M> {
   private static final float a = 0.1F;
   protected M g;
   protected final hhs h;
   protected final List<hcy<S, M>> i = Lists.newArrayList();

   public gzl(gyk.a $$0, M $$1, float $$2) {
      super($$0);
      this.h = $$0.b();
      this.g = $$1;
      this.e = $$2;
   }

   protected final boolean a(hcy<S, M> $$0) {
      return this.i.add($$0);
   }

   @Override
   public M c() {
      return this.g;
   }

   protected ffn a(T $$0) {
      ffn $$1 = super.a($$0);
      if ($$0.a(bxf.f).a(dae.vA)) {
         float $$2 = 0.5F;
         return $$1.c(0.5, 0.5, 0.5);
      } else {
         return $$1;
      }
   }

   public void a(S $$0, flq $$1, gsc $$2, int $$3) {
      $$1.a();
      if ($$0.a(byi.c)) {
         jc $$4 = $$0.ap;
         if ($$4 != null) {
            float $$5 = $$0.x - 0.1F;
            $$1.a((float)(-$$4.j()) * $$5, 0.0F, (float)(-$$4.l()) * $$5);
         }
      }

      float $$6 = $$0.af;
      $$1.b($$6, $$6, $$6);
      this.a($$0, $$1, $$0.Z, $$6);
      $$1.b(-1.0F, -1.0F, 1.0F);
      this.a($$0, $$1);
      $$1.a(0.0F, -1.501F, 0.0F);
      this.g.a($$0);
      boolean $$7 = this.d($$0);
      boolean $$8 = !$$7 && !$$0.an;
      gsn $$9 = this.a($$0, $$7, $$8, $$0.ao);
      if ($$9 != null) {
         flt $$10 = $$2.getBuffer($$9);
         int $$11 = a($$0, this.c($$0));
         int $$12 = $$8 ? 654311423 : -1;
         int $$13 = aya.a($$12, this.f($$0));
         this.g.a($$1, $$10, $$3, $$11, $$13);
      }

      if (this.e($$0)) {
         for (hcy<S, M> $$14 : this.i) {
            $$14.a($$1, $$2, $$3, $$0, $$0.aa, $$0.ab);
         }
      }

      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   protected boolean e(S $$0) {
      return true;
   }

   protected int f(S $$0) {
      return -1;
   }

   public abstract alk b(S var1);

   @Nullable
   protected gsn a(S $$0, boolean $$1, boolean $$2, boolean $$3) {
      alk $$4 = this.b($$0);
      if ($$2) {
         return gsn.i($$4);
      } else if ($$1) {
         return this.g.a($$4);
      } else {
         return $$3 ? gsn.s($$4) : null;
      }
   }

   public static int a(hfr $$0, float $$1) {
      return hks.a(hks.a($$1), hks.a($$0.am));
   }

   protected boolean d(S $$0) {
      return !$$0.z;
   }

   private static float a(jc $$0) {
      switch ($$0) {
         case d:
            return 90.0F;
         case e:
            return 0.0F;
         case c:
            return 270.0F;
         case f:
            return 180.0F;
         default:
            return 0.0F;
      }
   }

   protected boolean a(S $$0) {
      return $$0.ai;
   }

   protected void a(S $$0, flq $$1, float $$2, float $$3) {
      if (this.a($$0)) {
         $$2 += (float)(Math.cos((double)((float)azq.d($$0.u) * 3.25F)) * Math.PI * 0.4F);
      }

      if (!$$0.a(byi.c)) {
         $$1.a(a.d.rotationDegrees(180.0F - $$2));
      }

      if ($$0.ac > 0.0F) {
         float $$4 = ($$0.ac - 1.0F) / 20.0F * 1.6F;
         $$4 = azq.c($$4);
         if ($$4 > 1.0F) {
            $$4 = 1.0F;
         }

         $$1.a(a.f.rotationDegrees($$4 * this.aW_()));
      } else if ($$0.al) {
         $$1.a(a.b.rotationDegrees(-90.0F - $$0.ab));
         $$1.a(a.d.rotationDegrees($$0.u * -75.0F));
      } else if ($$0.a(byi.c)) {
         jc $$5 = $$0.ap;
         float $$6 = $$5 != null ? a($$5) : $$2;
         $$1.a(a.d.rotationDegrees($$6));
         $$1.a(a.f.rotationDegrees(this.aW_()));
         $$1.a(a.d.rotationDegrees(270.0F));
      } else if ($$0.ah) {
         $$1.a(0.0F, ($$0.w + 0.1F) / $$3, 0.0F);
         $$1.a(a.f.rotationDegrees(180.0F));
      }
   }

   protected float aW_() {
      return 90.0F;
   }

   protected float c(S $$0) {
      return 0.0F;
   }

   protected void a(S $$0, flq $$1) {
   }

   protected boolean a(T $$0, double $$1) {
      if ($$0.cf()) {
         float $$2 = 32.0F;
         if ($$1 >= 1024.0) {
            return false;
         }
      }

      frf $$3 = frf.Q();
      grb $$4 = $$3.t;
      boolean $$5 = !$$0.d($$4);
      if ($$0 != $$4) {
         fgz $$6 = $$0.cq();
         fgz $$7 = $$4.cq();
         if ($$6 != null) {
            fgz.b $$8 = $$6.k();
            switch ($$8) {
               case a:
                  return $$5;
               case b:
                  return false;
               case c:
                  return $$7 == null ? $$5 : $$6.a($$7) && ($$6.j() || $$5);
               case d:
                  return $$7 == null ? $$5 : !$$6.a($$7) && $$5;
               default:
                  return true;
            }
         }
      }

      return frf.M() && $$0 != $$3.ao() && $$5 && !$$0.bZ();
   }

   public static boolean b(bxw $$0) {
      if ($$0 instanceof crz || $$0.h_()) {
         String $$1 = o.a($$0.ai().getString());
         if ("Dinnerbone".equals($$1) || "Grumm".equals($$1)) {
            if ($$0 instanceof crz $$2 && !$$2.a(csb.a)) {
               return false;
            }

            return true;
         }
      }

      return false;
   }

   protected float g(S $$0) {
      return super.c($$0) * $$0.af;
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      float $$3 = azq.i($$2, $$0.aY, $$0.aX);
      $$1.Z = a($$0, $$3, $$2);
      $$1.aa = azq.h($$3 - $$1.Z);
      $$1.ab = $$0.k($$2);
      $$1.aq = $$0.ak();
      $$1.ah = b($$0);
      if ($$1.ah) {
         $$1.ab *= -1.0F;
         $$1.aa *= -1.0F;
      }

      if (!$$0.bY() && $$0.bJ()) {
         $$1.ad = $$0.aT.c($$2);
         $$1.ae = $$0.aT.b($$2);
      } else {
         $$1.ad = 0.0F;
         $$1.ae = 0.0F;
      }

      if ($$0.dk() instanceof bxw $$4) {
         $$1.at = $$4.aT.c($$2);
      } else {
         $$1.at = $$1.ad;
      }

      $$1.af = $$0.el();
      $$1.ag = $$0.ek();
      $$1.ar = $$0.at();
      $$1.ap = $$0.fT();
      if ($$1.ap != null) {
         $$1.x = $$0.d(byi.a);
      }

      label48: {
         $$1.ai = $$0.cw();
         $$1.aj = $$0.n_();
         $$1.ak = $$0.bi();
         $$1.al = $$0.fv();
         $$1.am = $$0.aN > 0 || $$0.aP > 0;
         daa $$5 = $$0.a(bxf.f);
         if ($$5.h() instanceof cyi $$6 && $$6.c() instanceof dma $$7) {
            $$1.au = $$7.b();
            $$1.av = $$5.a(kl.ak);
            $$1.as.b();
            break label48;
         }

         $$1.au = null;
         $$1.av = null;
         if (!hcn.a($$5, bxf.f)) {
            this.h.a($$1.as, $$5, czy.f, $$0);
         } else {
            $$1.as.b();
         }
      }

      $$1.ac = $$0.aP > 0 ? (float)$$0.aP + $$2 : 0.0F;
      frf $$8 = frf.Q();
      $$1.an = $$1.z && $$0.d($$8.t);
      $$1.ao = $$8.b($$0);
   }

   private static float a(bxw $$0, float $$1, float $$2) {
      if ($$0.dk() instanceof bxw $$3) {
         float $$4 = azq.i($$2, $$3.aW, $$3.aV);
         float $$5 = 85.0F;
         float $$6 = azq.a(azq.h($$1 - $$4), -85.0F, 85.0F);
         $$4 = $$1 - $$6;
         if (Math.abs($$6) > 50.0F) {
            $$4 += $$6 * 0.2F;
         }

         return $$4;
      } else {
         return azq.i($$2, $$0.aW, $$0.aV);
      }
   }
}
