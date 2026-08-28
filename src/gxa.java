import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public abstract class gxa<T extends bxc, S extends hdf, M extends gfq<? super S>> extends gvy<T, S> implements gxw<S, M> {
   private static final float a = 0.1F;
   protected M g;
   protected final hfg h;
   protected final List<han<S, M>> i = Lists.newArrayList();

   public gxa(gvz.a $$0, M $$1, float $$2) {
      super($$0);
      this.h = $$0.b();
      this.g = $$1;
      this.e = $$2;
   }

   protected final boolean a(han<S, M> $$0) {
      return this.i.add($$0);
   }

   @Override
   public M c() {
      return this.g;
   }

   protected fed a(T $$0) {
      fed $$1 = super.a($$0);
      if ($$0.a(bwn.f).a(czc.vv)) {
         float $$2 = 0.5F;
         return $$1.c(0.5, 0.5, 0.5);
      } else {
         return $$1;
      }
   }

   public void a(S $$0, fjc $$1, gps $$2, int $$3) {
      $$1.a();
      if ($$0.a(bxo.c)) {
         ja $$4 = $$0.ap;
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
      gqc $$9 = this.a($$0, $$7, $$8, $$0.ao);
      if ($$9 != null) {
         fjg $$10 = $$2.getBuffer($$9);
         int $$11 = a($$0, this.c($$0));
         int $$12 = $$8 ? 654311423 : -1;
         int $$13 = axw.a($$12, this.f($$0));
         this.g.a($$1, $$10, $$3, $$11, $$13);
      }

      if (this.e($$0)) {
         for (han<S, M> $$14 : this.i) {
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

   public abstract alg b(S var1);

   @Nullable
   protected gqc a(S $$0, boolean $$1, boolean $$2, boolean $$3) {
      alg $$4 = this.b($$0);
      if ($$2) {
         return gqc.i($$4);
      } else if ($$1) {
         return this.g.a($$4);
      } else {
         return $$3 ? gqc.s($$4) : null;
      }
   }

   public static int a(hdf $$0, float $$1) {
      return hif.a(hif.a($$1), hif.a($$0.am));
   }

   protected boolean d(S $$0) {
      return !$$0.z;
   }

   private static float a(ja $$0) {
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

   protected void a(S $$0, fjc $$1, float $$2, float $$3) {
      if (this.a($$0)) {
         $$2 += (float)(Math.cos((double)((float)azm.d($$0.u) * 3.25F)) * Math.PI * 0.4F);
      }

      if (!$$0.a(bxo.c)) {
         $$1.a(a.d.rotationDegrees(180.0F - $$2));
      }

      if ($$0.ac > 0.0F) {
         float $$4 = ($$0.ac - 1.0F) / 20.0F * 1.6F;
         $$4 = azm.c($$4);
         if ($$4 > 1.0F) {
            $$4 = 1.0F;
         }

         $$1.a(a.f.rotationDegrees($$4 * this.aR_()));
      } else if ($$0.al) {
         $$1.a(a.b.rotationDegrees(-90.0F - $$0.ab));
         $$1.a(a.d.rotationDegrees($$0.u * -75.0F));
      } else if ($$0.a(bxo.c)) {
         ja $$5 = $$0.ap;
         float $$6 = $$5 != null ? a($$5) : $$2;
         $$1.a(a.d.rotationDegrees($$6));
         $$1.a(a.f.rotationDegrees(this.aR_()));
         $$1.a(a.d.rotationDegrees(270.0F));
      } else if ($$0.ah) {
         $$1.a(0.0F, ($$0.w + 0.1F) / $$3, 0.0F);
         $$1.a(a.f.rotationDegrees(180.0F));
      }
   }

   protected float aR_() {
      return 90.0F;
   }

   protected float c(S $$0) {
      return 0.0F;
   }

   protected void a(S $$0, fjc $$1) {
   }

   protected boolean a(T $$0, double $$1) {
      if ($$0.cg()) {
         float $$2 = 32.0F;
         if ($$1 >= 1024.0) {
            return false;
         }
      }

      fos $$3 = fos.Q();
      gop $$4 = $$3.t;
      boolean $$5 = !$$0.d($$4);
      if ($$0 != $$4) {
         ffp $$6 = $$0.cr();
         ffp $$7 = $$4.cr();
         if ($$6 != null) {
            ffp.b $$8 = $$6.k();
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

      return fos.M() && $$0 != $$3.ao() && $$5 && !$$0.ca();
   }

   public static boolean b(bxc $$0) {
      if ($$0 instanceof cqy || $$0.h_()) {
         String $$1 = n.a($$0.al().getString());
         if ("Dinnerbone".equals($$1) || "Grumm".equals($$1)) {
            if ($$0 instanceof cqy $$2 && !$$2.a(cqz.a)) {
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
      float $$3 = azm.i($$2, $$0.aY, $$0.aX);
      $$1.Z = a($$0, $$3, $$2);
      $$1.aa = azm.h($$3 - $$1.Z);
      $$1.ab = $$0.k($$2);
      $$1.aq = $$0.an();
      $$1.ah = b($$0);
      if ($$1.ah) {
         $$1.ab *= -1.0F;
         $$1.aa *= -1.0F;
      }

      if (!$$0.bZ() && $$0.bK()) {
         $$1.ad = $$0.aT.c($$2);
         $$1.ae = $$0.aT.b($$2);
      } else {
         $$1.ad = 0.0F;
         $$1.ae = 0.0F;
      }

      if ($$0.dk() instanceof bxc $$4) {
         $$1.at = $$4.aT.c($$2);
      } else {
         $$1.at = $$1.ad;
      }

      $$1.af = $$0.ek();
      $$1.ag = $$0.ej();
      $$1.ar = $$0.aw();
      $$1.ap = $$0.fS();
      if ($$1.ap != null) {
         $$1.x = $$0.d(bxo.a);
      }

      label48: {
         $$1.ai = $$0.cw();
         $$1.aj = $$0.n_();
         $$1.ak = $$0.bj();
         $$1.al = $$0.fu();
         $$1.am = $$0.aN > 0 || $$0.aP > 0;
         cyy $$5 = $$0.a(bwn.f);
         if ($$5.h() instanceof cxg $$6 && $$6.c() instanceof dkw $$7) {
            $$1.au = $$7.b();
            $$1.av = $$5.a(kj.ak);
            $$1.as.b();
            break label48;
         }

         $$1.au = null;
         $$1.av = null;
         if (!hac.a($$5, bwn.f)) {
            this.h.a($$1.as, $$5, cyw.f, false, $$0);
         } else {
            $$1.as.b();
         }
      }

      $$1.ac = $$0.aP > 0 ? (float)$$0.aP + $$2 : 0.0F;
      fos $$8 = fos.Q();
      $$1.an = $$1.z && $$0.d($$8.t);
      $$1.ao = $$8.b($$0);
   }

   private static float a(bxc $$0, float $$1, float $$2) {
      if ($$0.dk() instanceof bxc $$3) {
         float $$4 = azm.i($$2, $$3.aW, $$3.aV);
         float $$5 = 85.0F;
         float $$6 = azm.a(azm.h($$1 - $$4), -85.0F, 85.0F);
         $$4 = $$1 - $$6;
         if (Math.abs($$6) > 50.0F) {
            $$4 += $$6 * 0.2F;
         }

         return $$4;
      } else {
         return azm.i($$2, $$0.aW, $$0.aV);
      }
   }
}
