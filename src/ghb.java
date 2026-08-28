import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ghb {
   private final fil a;
   private final deg b;
   private final ghc c;
   private final Map<je, hav> d = new HashMap<>();

   public ghb(fil $$0, deg $$1, ghc $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a(int $$0, je $$1, int $$2) {
      switch ($$0) {
         case 1023:
         case 1028:
         case 1038:
            fhu $$3 = this.a.j.k();
            if ($$3.h()) {
               eys $$4 = eys.b($$1).d($$3.b()).d();
               eys $$5 = $$3.b().e($$4.c(2.0));
               if ($$0 == 1023) {
                  this.b.a($$5.d, $$5.e, $$5.f, awe.CN, awf.f, 1.0F, 1.0F, false);
               } else if ($$0 == 1038) {
                  this.b.a($$5.d, $$5.e, $$5.f, awe.ix, awf.f, 1.0F, 1.0F, false);
               } else {
                  this.b.a($$5.d, $$5.e, $$5.f, awe.ic, awf.f, 5.0F, 1.0F, false);
               }
            }
      }
   }

   public void b(int $$0, je $$1, int $$2) {
      azl $$3 = this.b.z;
      switch ($$0) {
         case 1000:
            this.b.a($$1, awe.gT, awf.e, 1.0F, 1.0F, false);
            break;
         case 1001:
            this.b.a($$1, awe.gU, awf.e, 1.0F, 1.2F, false);
            break;
         case 1002:
            this.b.a($$1, awe.gV, awf.e, 1.0F, 1.2F, false);
            break;
         case 1004:
            this.b.a($$1, awe.iR, awf.g, 1.0F, 1.2F, false);
            break;
         case 1009:
            if ($$2 == 0) {
               this.b.a($$1, awe.iV, awf.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);
            } else if ($$2 == 1) {
               this.b.a($$1, awe.kg, awf.e, 0.7F, 1.6F + ($$3.i() - $$3.i()) * 0.4F, false);
            }
            break;
         case 1010:
            this.b.F_().d(lv.L).c($$2).ifPresent($$1x -> this.a($$1x, $$1));
            break;
         case 1011:
            this.b($$1);
            break;
         case 1015:
            this.b.a($$1, awe.kq, awf.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1016:
            this.b.a($$1, awe.kp, awf.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1017:
            this.b.a($$1, awe.ih, awf.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1018:
            this.b.a($$1, awe.ck, awf.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1019:
            this.b.a($$1, awe.DA, awf.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1020:
            this.b.a($$1, awe.DB, awf.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1021:
            this.b.a($$1, awe.DC, awf.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1022:
            this.b.a($$1, awe.CF, awf.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1024:
            this.b.a($$1, awe.CI, awf.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1025:
            this.b.a($$1, awe.bJ, awf.g, 0.05F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1026:
            this.b.a($$1, awe.DK, awf.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1027:
            this.b.a($$1, awe.DR, awf.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1029:
            this.b.a($$1, awe.V, awf.e, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 1030:
            this.b.a($$1, awe.ab, awf.e, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 1031:
            this.b.a($$1, awe.Y, awf.e, 0.3F, this.b.z.i() * 0.1F + 0.9F, false);
            break;
         case 1032:
            this.a.ak().a(haq.b(awe.uJ, $$3.i() * 0.4F + 0.8F, 0.25F));
            break;
         case 1033:
            this.b.a($$1, awe.fh, awf.e, 1.0F, 1.0F, false);
            break;
         case 1034:
            this.b.a($$1, awe.fg, awf.e, 1.0F, 1.0F, false);
            break;
         case 1035:
            this.b.a($$1, awe.cR, awf.e, 1.0F, 1.0F, false);
            break;
         case 1039:
            this.b.a($$1, awe.tw, awf.f, 0.3F, this.b.z.i() * 0.1F + 0.9F, false);
            break;
         case 1040:
            this.b.a($$1, awe.DD, awf.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1041:
            this.b.a($$1, awe.nb, awf.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1042:
            this.b.a($$1, awe.lp, awf.e, 1.0F, this.b.z.i() * 0.1F + 0.9F, false);
            break;
         case 1043:
            this.b.a($$1, awe.cy, awf.e, 1.0F, this.b.z.i() * 0.1F + 0.9F, false);
            break;
         case 1044:
            this.b.a($$1, awe.yp, awf.e, 1.0F, this.b.z.i() * 0.1F + 0.9F, false);
            break;
         case 1045:
            this.b.a($$1, awe.hx, awf.e, 2.0F, this.b.z.i() * 0.1F + 0.9F, false);
            break;
         case 1046:
            this.b.a($$1, awe.hA, awf.e, 2.0F, this.b.z.i() * 0.1F + 0.9F, false);
            break;
         case 1047:
            this.b.a($$1, awe.hB, awf.e, 2.0F, this.b.z.i() * 0.1F + 0.9F, false);
            break;
         case 1048:
            this.b.a($$1, awe.xd, awf.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1049:
            this.b.a($$1, awe.gh, awf.e, 1.0F, 1.0F, false);
            break;
         case 1050:
            this.b.a($$1, awe.gi, awf.e, 1.0F, 1.0F, false);
            break;
         case 1051:
            this.b.a($$1, awe.Cx, awf.e, 0.5F, 0.4F / (this.b.C_().i() * 0.4F + 0.8F), false);
            break;
         case 1500:
            diu.a(this.b, $$1, $$2 > 0);
            break;
         case 1501:
            this.b.a($$1, awe.nR, awf.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);

            for (int $$60 = 0; $$60 < 8; $$60++) {
               this.b.a(ln.X, (double)$$1.u() + $$3.j(), (double)$$1.v() + 1.2, (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
            }
            break;
         case 1502:
            this.b.a($$1, awe.vw, awf.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);

            for (int $$61 = 0; $$61 < 5; $$61++) {
               double $$62 = (double)$$1.u() + $$3.j() * 0.6 + 0.2;
               double $$63 = (double)$$1.v() + $$3.j() * 0.6 + 0.2;
               double $$64 = (double)$$1.w() + $$3.j() * 0.6 + 0.2;
               this.b.a(ln.ae, $$62, $$63, $$64, 0.0, 0.0, 0.0);
            }
            break;
         case 1503:
            this.b.a($$1, awe.iw, awf.e, 1.0F, 1.0F, false);

            for (int $$65 = 0; $$65 < 16; $$65++) {
               double $$66 = (double)$$1.u() + (5.0 + $$3.j() * 6.0) / 16.0;
               double $$67 = (double)$$1.v() + 0.8125;
               double $$68 = (double)$$1.w() + (5.0 + $$3.j() * 6.0) / 16.0;
               this.b.a(ln.ae, $$66, $$67, $$68, 0.0, 0.0, 0.0);
            }
            break;
         case 1504:
            dnb.a(this.b, $$1, this.b.a_($$1));
            break;
         case 1505:
            ctt.a(this.b, $$1, $$2);
            this.b.a($$1, awe.cx, awf.e, 1.0F, 1.0F, false);
            break;
         case 2000:
            this.a($$2, $$1, $$3, ln.ae);
            break;
         case 2001:
            duo $$23 = dhj.a($$2);
            if (!$$23.l()) {
               dox $$24 = $$23.A();
               this.b.a($$1, $$24.c(), awf.e, ($$24.a() + 1.0F) / 2.0F, $$24.b() * 0.8F, false);
            }

            this.b.a($$1, $$23);
            break;
         case 2002:
         case 2007:
            eys $$9 = eys.c($$1);

            for (int $$10 = 0; $$10 < 8; $$10++) {
               this.c.a(new lj(ln.S, new cvp(cvt.vq)), $$9.d, $$9.e, $$9.f, $$3.k() * 0.15, $$3.j() * 0.2, $$3.k() * 0.15);
            }

            float $$11 = (float)($$2 >> 16 & 0xFF) / 255.0F;
            float $$12 = (float)($$2 >> 8 & 0xFF) / 255.0F;
            float $$13 = (float)($$2 >> 0 & 0xFF) / 255.0F;
            ll $$14 = $$0 == 2007 ? ln.R : ln.p;

            for (int $$15 = 0; $$15 < 100; $$15++) {
               double $$16 = $$3.j() * 4.0;
               double $$17 = $$3.j() * Math.PI * 2.0;
               double $$18 = Math.cos($$17) * $$16;
               double $$19 = 0.01 + $$3.j() * 0.5;
               double $$20 = Math.sin($$17) * $$16;
               geo $$21 = this.c.b($$14, $$14.a().b(), $$9.d + $$18 * 0.1, $$9.e + 0.3, $$9.f + $$20 * 0.1, $$18, $$19, $$20);
               if ($$21 != null) {
                  float $$22 = 0.75F + $$3.i() * 0.25F;
                  $$21.a($$11 * $$22, $$12 * $$22, $$13 * $$22);
                  $$21.c((float)$$16);
               }
            }

            this.b.a($$1, awe.yV, awf.g, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 2003:
            double $$4 = (double)$$1.u() + 0.5;
            double $$5 = (double)$$1.v();
            double $$6 = (double)$$1.w() + 0.5;

            for (int $$7 = 0; $$7 < 8; $$7++) {
               this.c.a(new lj(ln.S, new cvp(cvt.st)), $$4, $$5, $$6, $$3.k() * 0.15, $$3.j() * 0.2, $$3.k() * 0.15);
            }

            for (double $$8 = 0.0; $$8 < Math.PI * 2; $$8 += Math.PI / 20) {
               this.c.a(ln.ac, $$4 + Math.cos($$8) * 5.0, $$5 - 0.4, $$6 + Math.sin($$8) * 5.0, Math.cos($$8) * -5.0, 0.0, Math.sin($$8) * -5.0);
               this.c.a(ln.ac, $$4 + Math.cos($$8) * 5.0, $$5 - 0.4, $$6 + Math.sin($$8) * 5.0, Math.cos($$8) * -7.0, 0.0, Math.sin($$8) * -7.0);
            }
            break;
         case 2004:
            for (int $$27 = 0; $$27 < 20; $$27++) {
               double $$28 = (double)$$1.u() + 0.5 + ($$3.j() - 0.5) * 2.0;
               double $$29 = (double)$$1.v() + 0.5 + ($$3.j() - 0.5) * 2.0;
               double $$30 = (double)$$1.w() + 0.5 + ($$3.j() - 0.5) * 2.0;
               this.b.a(ln.ae, $$28, $$29, $$30, 0.0, 0.0, 0.0);
               this.b.a(ln.F, $$28, $$29, $$30, 0.0, 0.0, 0.0);
            }
            break;
         case 2006:
            for (int $$69 = 0; $$69 < 200; $$69++) {
               float $$70 = $$3.i() * 4.0F;
               float $$71 = $$3.i() * (float) (Math.PI * 2);
               double $$72 = (double)(azd.b($$71) * $$70);
               double $$73 = 0.01 + $$3.j() * 0.5;
               double $$74 = (double)(azd.a($$71) * $$70);
               geo $$75 = this.c.b(ln.h, false, (double)$$1.u() + $$72 * 0.1, (double)$$1.v() + 0.3, (double)$$1.w() + $$74 * 0.1, $$72, $$73, $$74);
               if ($$75 != null) {
                  $$75.c($$70);
               }
            }

            if ($$2 == 1) {
               this.b.a($$1, awe.id, awf.f, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            }
            break;
         case 2008:
            this.b.a(ln.w, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            break;
         case 2009:
            for (int $$76 = 0; $$76 < 8; $$76++) {
               this.b.a(ln.e, (double)$$1.u() + $$3.j(), (double)$$1.v() + 1.2, (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
            }
            break;
         case 2010:
            this.a($$2, $$1, $$3, ln.af);
            break;
         case 2011:
            azh.a(this.b, $$1, $$2, ln.O);
            break;
         case 2012:
            azh.a(this.b, $$1, $$2, ln.O);
            break;
         case 2013:
            azh.a(this.b, $$1, $$2);
            break;
         case 3000:
            this.b.a(ln.v, true, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            this.b.a($$1, awe.iv, awf.e, 10.0F, (1.0F + (this.b.z.i() - this.b.z.i()) * 0.2F) * 0.7F, false);
            break;
         case 3001:
            this.b.a($$1, awe.if, awf.f, 64.0F, 0.8F + this.b.z.i() * 0.3F, false);
            break;
         case 3002:
            if ($$2 >= 0 && $$2 < jj.a.d.length) {
               azh.a(jj.a.d[$$2], this.b, $$1, 0.125, ln.aT, bra.a(10, 19));
            } else {
               azh.a(this.b, $$1, ln.aT, bra.a(3, 5));
            }
            break;
         case 3003:
            azh.a(this.b, $$1, ln.aR, bra.a(3, 5));
            this.b.a($$1, awe.mD, awf.e, 1.0F, 1.0F, false);
            break;
         case 3004:
            azh.a(this.b, $$1, ln.aS, bra.a(3, 5));
            break;
         case 3005:
            azh.a(this.b, $$1, ln.aU, bra.a(3, 5));
            break;
         case 3006:
            int $$36 = $$2 >> 6;
            if ($$36 > 0) {
               if ($$3.i() < 0.3F + (float)$$36 * 0.1F) {
                  float $$37 = 0.15F + 0.02F * (float)$$36 * (float)$$36 * $$3.i();
                  float $$38 = 0.4F + 0.3F * (float)$$36 * $$3.i();
                  this.b.a($$1, awe.vV, awf.e, $$37, $$38, false);
               }

               byte $$39 = (byte)($$2 & 63);
               bqu $$40 = bra.a(0, $$36);
               float $$41 = 0.005F;
               Supplier<eys> $$42 = () -> new eys(azd.a($$3, -0.005F, 0.005F), azd.a($$3, -0.005F, 0.005F), azd.a($$3, -0.005F, 0.005F));
               if ($$39 == 0) {
                  for (jj $$43 : jj.values()) {
                     float $$44 = $$43 == jj.a ? (float) Math.PI : 0.0F;
                     double $$45 = $$43.o() == jj.a.b ? 0.65 : 0.57;
                     azh.a(this.b, $$1, new lp($$44), $$40, $$43, $$42, $$45);
                  }
               } else {
                  for (jj $$46 : dmj.a($$39)) {
                     float $$47 = $$46 == jj.b ? (float) Math.PI : 0.0F;
                     double $$48 = 0.35;
                     azh.a(this.b, $$1, new lp($$47), $$40, $$46, $$42, 0.35);
                  }
               }
            } else {
               this.b.a($$1, awe.vV, awf.e, 1.0F, 1.0F, false);
               boolean $$49 = this.b.a_($$1).m(this.b, $$1);
               int $$50 = $$49 ? 40 : 20;
               float $$51 = $$49 ? 0.45F : 0.25F;
               float $$52 = 0.07F;

               for (int $$53 = 0; $$53 < $$50; $$53++) {
                  float $$54 = 2.0F * $$3.i() - 1.0F;
                  float $$55 = 2.0F * $$3.i() - 1.0F;
                  float $$56 = 2.0F * $$3.i() - 1.0F;
                  this.b
                     .a(
                        ln.K,
                        (double)$$1.u() + 0.5 + (double)($$54 * $$51),
                        (double)$$1.v() + 0.5 + (double)($$55 * $$51),
                        (double)$$1.w() + 0.5 + (double)($$56 * $$51),
                        (double)($$54 * 0.07F),
                        (double)($$55 * 0.07F),
                        (double)($$56 * 0.07F)
                     );
               }
            }
            break;
         case 3007:
            for (int $$57 = 0; $$57 < 10; $$57++) {
               this.b.a(new lq($$57 * 5), false, (double)$$1.u() + 0.5, (double)$$1.v() + doe.f, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            }

            duo $$58 = this.b.a_($$1);
            boolean $$59 = $$58.b(dve.C) && $$58.c(dve.C);
            if (!$$59) {
               this.b.a((double)$$1.u() + 0.5, (double)$$1.v() + doe.f, (double)$$1.w() + 0.5, awe.ws, awf.e, 2.0F, 0.6F + this.b.z.i() * 0.4F, false);
            }
            break;
         case 3008:
            duo $$25 = dhj.a($$2);
            if ($$25.b() instanceof dho $$26) {
               this.b.a($$1, $$26.d(), awf.h, 1.0F, 1.0F, false);
            }

            this.b.a($$1, $$25);
            break;
         case 3009:
            azh.a(this.b, $$1, ln.aW, bra.a(3, 6));
            break;
         case 3011:
            dtr.a(this.b, $$1, $$3, dtr.a.a($$2).c);
            break;
         case 3012:
            this.b.a($$1, awe.md, awf.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dtr.a(this.b, $$1, $$3, dtr.a.a($$2).c);
            break;
         case 3013:
            this.b.a($$1, awe.mh, awf.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dtr.a(this.b, $$1, $$3, $$2, ln.aY);
            break;
         case 3014:
            this.b.a($$1, awe.mn, awf.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dtr.b(this.b, $$1, $$3);
            break;
         case 3015:
            if (this.b.c_($$1) instanceof dtw $$31) {
               dtw.a.a(this.b, $$31.aB_(), $$31.m(), $$31.c(), $$2 == 0 ? ln.aJ : ln.L);
               this.b.a($$1, awe.AG, awf.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            }
            break;
         case 3016:
            dtw.a.a(this.b, $$1, $$2 == 0 ? ln.aJ : ln.L);
            this.b.a($$1, awe.AK, awf.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            break;
         case 3017:
            dtr.b(this.b, $$1, $$3);
            break;
         case 3018:
            for (int $$32 = 0; $$32 < 10; $$32++) {
               double $$33 = $$3.k() * 0.02;
               double $$34 = $$3.k() * 0.02;
               double $$35 = $$3.k() * 0.02;
               this.b.a(ln.ab, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), $$33, $$34, $$35);
            }

            this.b.a($$1, awe.fl, awf.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            break;
         case 3019:
            this.b.a($$1, awe.mh, awf.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dtr.a(this.b, $$1, $$3, $$2, ln.aZ);
            break;
         case 3020:
            this.b.a($$1, awe.mi, awf.e, $$2 == 0 ? 0.3F : 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dtr.a(this.b, $$1, $$3, 0, ln.aZ);
            dtr.a(this.b, $$1, $$3);
            break;
         case 3021:
            this.b.a($$1, awe.mf, awf.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dtr.a(this.b, $$1, $$3, dtr.a.a($$2).c);
      }
   }

   private void a(int $$0, je $$1, azl $$2, lr $$3) {
      jj $$4 = jj.a($$0);
      int $$5 = $$4.j();
      int $$6 = $$4.k();
      int $$7 = $$4.l();

      for (int $$8 = 0; $$8 < 10; $$8++) {
         double $$9 = $$2.j() * 0.2 + 0.01;
         double $$10 = (double)$$1.u() + (double)$$5 * 0.6 + 0.5 + (double)$$5 * 0.01 + ($$2.j() - 0.5) * (double)$$7 * 0.5;
         double $$11 = (double)$$1.v() + (double)$$6 * 0.6 + 0.5 + (double)$$6 * 0.01 + ($$2.j() - 0.5) * (double)$$6 * 0.5;
         double $$12 = (double)$$1.w() + (double)$$7 * 0.6 + 0.5 + (double)$$7 * 0.01 + ($$2.j() - 0.5) * (double)$$5 * 0.5;
         double $$13 = (double)$$5 * $$9 + $$2.k() * 0.01;
         double $$14 = (double)$$6 * $$9 + $$2.k() * 0.01;
         double $$15 = (double)$$7 * $$9 + $$2.k() * 0.01;
         this.c.a($$3, $$10, $$11, $$12, $$13, $$14, $$15);
      }
   }

   private void a(jn<cvv> $$0, je $$1) {
      this.a($$1);
      cvv $$2 = $$0.a();
      awd $$3 = $$2.b().a();
      hav $$4 = haq.a($$3, eys.b($$1));
      this.d.put($$1, $$4);
      this.a.ak().a($$4);
      this.a.m.a($$2.c());
      this.a(this.b, $$1, true);
   }

   private void a(je $$0) {
      hav $$1 = this.d.remove($$0);
      if ($$1 != null) {
         this.a.ak().b($$1);
      }
   }

   private void b(je $$0) {
      this.a($$0);
      this.a(this.b, $$0, false);
   }

   private void a(deg $$0, je $$1, boolean $$2) {
      for (buk $$4 : $$0.a(buk.class, new eyn($$1).g(3.0))) {
         $$4.a($$1, $$2);
      }
   }
}
