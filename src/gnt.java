import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class gnt {
   private final fnd a;
   private final dhp b;
   private final gnu c;
   private final Map<jj, hkp> d = new HashMap<>();

   public gnt(fnd $$0, dhp $$1, gnu $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a(int $$0, jj $$1, int $$2) {
      switch ($$0) {
         case 1023:
         case 1028:
         case 1038:
            fml $$3 = this.a.j.k();
            if ($$3.h()) {
               fcu $$4 = fcu.b($$1).d($$3.b()).d();
               fcu $$5 = $$3.b().e($$4.c(2.0));
               if ($$0 == 1023) {
                  this.b.a($$5.d, $$5.e, $$5.f, awk.DF, awl.f, 1.0F, 1.0F, false);
               } else if ($$0 == 1038) {
                  this.b.a($$5.d, $$5.e, $$5.f, awk.iR, awl.f, 1.0F, 1.0F, false);
               } else {
                  this.b.a($$5.d, $$5.e, $$5.f, awk.iw, awl.f, 5.0F, 1.0F, false);
               }
            }
      }
   }

   public void b(int $$0, jj $$1, int $$2) {
      azs $$3 = this.b.A;
      switch ($$0) {
         case 1000:
            this.b.a($$1, awk.hn, awl.e, 1.0F, 1.0F, false);
            break;
         case 1001:
            this.b.a($$1, awk.ho, awl.e, 1.0F, 1.2F, false);
            break;
         case 1002:
            this.b.a($$1, awk.hp, awl.e, 1.0F, 1.2F, false);
            break;
         case 1004:
            this.b.a($$1, awk.jq, awl.g, 1.0F, 1.2F, false);
            break;
         case 1009:
            if ($$2 == 0) {
               this.b.a($$1, awk.ju, awl.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);
            } else if ($$2 == 1) {
               this.b.a($$1, awk.kF, awl.e, 0.7F, 1.6F + ($$3.i() - $$3.i()) * 0.4F, false);
            }
            break;
         case 1010:
            this.b.F_().f(me.L).c($$2).ifPresent($$1x -> this.a($$1x, $$1));
            break;
         case 1011:
            this.b($$1);
            break;
         case 1015:
            this.b.a($$1, awk.kP, awl.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1016:
            this.b.a($$1, awk.kO, awl.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1017:
            this.b.a($$1, awk.iB, awl.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1018:
            this.b.a($$1, awk.ck, awl.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1019:
            this.b.a($$1, awk.Es, awl.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1020:
            this.b.a($$1, awk.Et, awl.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1021:
            this.b.a($$1, awk.Eu, awl.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1022:
            this.b.a($$1, awk.Dx, awl.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1024:
            this.b.a($$1, awk.DA, awl.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1025:
            this.b.a($$1, awk.bJ, awl.g, 0.05F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1026:
            this.b.a($$1, awk.EC, awl.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1027:
            this.b.a($$1, awk.EJ, awl.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1029:
            this.b.a($$1, awk.V, awl.e, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 1030:
            this.b.a($$1, awk.ab, awl.e, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 1031:
            this.b.a($$1, awk.Y, awl.e, 0.3F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1032:
            this.a.ak().a(hkk.b(awk.vs, $$3.i() * 0.4F + 0.8F, 0.25F));
            break;
         case 1033:
            this.b.a($$1, awk.fi, awl.e, 1.0F, 1.0F, false);
            break;
         case 1034:
            this.b.a($$1, awk.fh, awl.e, 1.0F, 1.0F, false);
            break;
         case 1035:
            this.b.a($$1, awk.cR, awl.e, 1.0F, 1.0F, false);
            break;
         case 1039:
            this.b.a($$1, awk.uf, awl.f, 0.3F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1040:
            this.b.a($$1, awk.Ev, awl.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1041:
            this.b.a($$1, awk.ny, awl.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1042:
            this.b.a($$1, awk.lM, awl.e, 1.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1043:
            this.b.a($$1, awk.cy, awl.e, 1.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1044:
            this.b.a($$1, awk.zh, awl.e, 1.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1045:
            this.b.a($$1, awk.hR, awl.e, 2.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1046:
            this.b.a($$1, awk.hU, awl.e, 2.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1047:
            this.b.a($$1, awk.hV, awl.e, 2.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1048:
            this.b.a($$1, awk.xM, awl.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1049:
            this.b.a($$1, awk.gi, awl.e, 1.0F, 1.0F, false);
            break;
         case 1050:
            this.b.a($$1, awk.gj, awl.e, 1.0F, 1.0F, false);
            break;
         case 1051:
            this.b.a($$1, awk.Dp, awl.e, 0.5F, 0.4F / (this.b.C_().i() * 0.4F + 0.8F), false);
            break;
         case 1500:
            dmf.a(this.b, $$1, $$2 > 0);
            break;
         case 1501:
            this.b.a($$1, awk.ot, awl.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);

            for (int $$60 = 0; $$60 < 8; $$60++) {
               this.b.a(lv.aa, (double)$$1.u() + $$3.j(), (double)$$1.v() + 1.2, (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
            }
            break;
         case 1502:
            this.b.a($$1, awk.wf, awl.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);

            for (int $$61 = 0; $$61 < 5; $$61++) {
               double $$62 = (double)$$1.u() + $$3.j() * 0.6 + 0.2;
               double $$63 = (double)$$1.v() + $$3.j() * 0.6 + 0.2;
               double $$64 = (double)$$1.w() + $$3.j() * 0.6 + 0.2;
               this.b.a(lv.ah, $$62, $$63, $$64, 0.0, 0.0, 0.0);
            }
            break;
         case 1503:
            this.b.a($$1, awk.iQ, awl.e, 1.0F, 1.0F, false);

            for (int $$65 = 0; $$65 < 16; $$65++) {
               double $$66 = (double)$$1.u() + (5.0 + $$3.j() * 6.0) / 16.0;
               double $$67 = (double)$$1.v() + 0.8125;
               double $$68 = (double)$$1.w() + (5.0 + $$3.j() * 6.0) / 16.0;
               this.b.a(lv.ah, $$66, $$67, $$68, 0.0, 0.0, 0.0);
            }
            break;
         case 1504:
            dqq.a(this.b, $$1, this.b.a_($$1));
            break;
         case 1505:
            cwh.a(this.b, $$1, $$2);
            this.b.a($$1, awk.cx, awl.e, 1.0F, 1.0F, false);
            break;
         case 2000:
            this.a($$2, $$1, $$3, lv.ah);
            break;
         case 2001:
            dym $$23 = dku.a($$2);
            if (!$$23.l()) {
               dsn $$24 = $$23.A();
               this.b.a($$1, $$24.c(), awl.e, ($$24.a() + 1.0F) / 2.0F, $$24.b() * 0.8F, false);
            }

            this.b.a($$1, $$23);
            break;
         case 2002:
         case 2007:
            fcu $$9 = fcu.c($$1);

            for (int $$10 = 0; $$10 < 8; $$10++) {
               this.c.a(new lr(lv.U, new cxy(cyc.ws)), $$9.d, $$9.e, $$9.f, $$3.k() * 0.15, $$3.j() * 0.2, $$3.k() * 0.15);
            }

            float $$11 = (float)($$2 >> 16 & 0xFF) / 255.0F;
            float $$12 = (float)($$2 >> 8 & 0xFF) / 255.0F;
            float $$13 = (float)($$2 >> 0 & 0xFF) / 255.0F;
            lt $$14 = $$0 == 2007 ? lv.T : lv.p;

            for (int $$15 = 0; $$15 < 100; $$15++) {
               double $$16 = $$3.j() * 4.0;
               double $$17 = $$3.j() * Math.PI * 2.0;
               double $$18 = Math.cos($$17) * $$16;
               double $$19 = 0.01 + $$3.j() * 0.5;
               double $$20 = Math.sin($$17) * $$16;
               glh $$21 = this.c.b($$14, $$14.a().b(), $$9.d + $$18 * 0.1, $$9.e + 0.3, $$9.f + $$20 * 0.1, $$18, $$19, $$20);
               if ($$21 != null) {
                  float $$22 = 0.75F + $$3.i() * 0.25F;
                  $$21.a($$11 * $$22, $$12 * $$22, $$13 * $$22);
                  $$21.c((float)$$16);
               }
            }

            this.b.a($$1, awk.zN, awl.g, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 2003:
            double $$4 = (double)$$1.u() + 0.5;
            double $$5 = (double)$$1.v();
            double $$6 = (double)$$1.w() + 0.5;

            for (int $$7 = 0; $$7 < 8; $$7++) {
               this.c.a(new lr(lv.U, new cxy(cyc.tt)), $$4, $$5, $$6, $$3.k() * 0.15, $$3.j() * 0.2, $$3.k() * 0.15);
            }

            for (double $$8 = 0.0; $$8 < Math.PI * 2; $$8 += Math.PI / 20) {
               this.c.a(lv.af, $$4 + Math.cos($$8) * 5.0, $$5 - 0.4, $$6 + Math.sin($$8) * 5.0, Math.cos($$8) * -5.0, 0.0, Math.sin($$8) * -5.0);
               this.c.a(lv.af, $$4 + Math.cos($$8) * 5.0, $$5 - 0.4, $$6 + Math.sin($$8) * 5.0, Math.cos($$8) * -7.0, 0.0, Math.sin($$8) * -7.0);
            }
            break;
         case 2004:
            for (int $$27 = 0; $$27 < 20; $$27++) {
               double $$28 = (double)$$1.u() + 0.5 + ($$3.j() - 0.5) * 2.0;
               double $$29 = (double)$$1.v() + 0.5 + ($$3.j() - 0.5) * 2.0;
               double $$30 = (double)$$1.w() + 0.5 + ($$3.j() - 0.5) * 2.0;
               this.b.a(lv.ah, $$28, $$29, $$30, 0.0, 0.0, 0.0);
               this.b.a(lv.F, $$28, $$29, $$30, 0.0, 0.0, 0.0);
            }
            break;
         case 2006:
            for (int $$69 = 0; $$69 < 200; $$69++) {
               float $$70 = $$3.i() * 4.0F;
               float $$71 = $$3.i() * (float) (Math.PI * 2);
               double $$72 = (double)(azk.b($$71) * $$70);
               double $$73 = 0.01 + $$3.j() * 0.5;
               double $$74 = (double)(azk.a($$71) * $$70);
               glh $$75 = this.c.b(lv.h, false, (double)$$1.u() + $$72 * 0.1, (double)$$1.v() + 0.3, (double)$$1.w() + $$74 * 0.1, $$72, $$73, $$74);
               if ($$75 != null) {
                  $$75.c($$70);
               }
            }

            if ($$2 == 1) {
               this.b.a($$1, awk.ix, awl.f, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            }
            break;
         case 2008:
            this.b.a(lv.w, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            break;
         case 2009:
            for (int $$76 = 0; $$76 < 8; $$76++) {
               this.b.a(lv.e, (double)$$1.u() + $$3.j(), (double)$$1.v() + 1.2, (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
            }
            break;
         case 2010:
            this.a($$2, $$1, $$3, lv.ai);
            break;
         case 2011:
            azo.a(this.b, $$1, $$2, lv.Q);
            break;
         case 2012:
            azo.a(this.b, $$1, $$2, lv.Q);
            break;
         case 2013:
            azo.a(this.b, $$1, $$2);
            break;
         case 3000:
            this.b.a(lv.v, true, true, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            this.b.a($$1, awk.iP, awl.e, 10.0F, (1.0F + (this.b.A.i() - this.b.A.i()) * 0.2F) * 0.7F, false);
            break;
         case 3001:
            this.b.a($$1, awk.iz, awl.f, 64.0F, 0.8F + this.b.A.i() * 0.3F, false);
            break;
         case 3002:
            if ($$2 >= 0 && $$2 < jo.a.d.length) {
               azo.a(jo.a.d[$$2], this.b, $$1, 0.125, lv.aW, btb.a(10, 19));
            } else {
               azo.a(this.b, $$1, lv.aW, btb.a(3, 5));
            }
            break;
         case 3003:
            azo.a(this.b, $$1, lv.aU, btb.a(3, 5));
            this.b.a($$1, awk.na, awl.e, 1.0F, 1.0F, false);
            break;
         case 3004:
            azo.a(this.b, $$1, lv.aV, btb.a(3, 5));
            break;
         case 3005:
            azo.a(this.b, $$1, lv.aX, btb.a(3, 5));
            break;
         case 3006:
            int $$36 = $$2 >> 6;
            if ($$36 > 0) {
               if ($$3.i() < 0.3F + (float)$$36 * 0.1F) {
                  float $$37 = 0.15F + 0.02F * (float)$$36 * (float)$$36 * $$3.i();
                  float $$38 = 0.4F + 0.3F * (float)$$36 * $$3.i();
                  this.b.a($$1, awk.wE, awl.e, $$37, $$38, false);
               }

               byte $$39 = (byte)($$2 & 63);
               bsv $$40 = btb.a(0, $$36);
               float $$41 = 0.005F;
               Supplier<fcu> $$42 = () -> new fcu(azk.a($$3, -0.005F, 0.005F), azk.a($$3, -0.005F, 0.005F), azk.a($$3, -0.005F, 0.005F));
               if ($$39 == 0) {
                  for (jo $$43 : jo.values()) {
                     float $$44 = $$43 == jo.a ? (float) Math.PI : 0.0F;
                     double $$45 = $$43.o() == jo.a.b ? 0.65 : 0.57;
                     azo.a(this.b, $$1, new lx($$44), $$40, $$43, $$42, $$45);
                  }
               } else {
                  for (jo $$46 : dpy.a($$39)) {
                     float $$47 = $$46 == jo.b ? (float) Math.PI : 0.0F;
                     double $$48 = 0.35;
                     azo.a(this.b, $$1, new lx($$47), $$40, $$46, $$42, 0.35);
                  }
               }
            } else {
               this.b.a($$1, awk.wE, awl.e, 1.0F, 1.0F, false);
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
                        lv.M,
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
               this.b.a(new ly($$57 * 5), (double)$$1.u() + 0.5, (double)$$1.v() + drt.e, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            }

            dym $$58 = this.b.a_($$1);
            boolean $$59 = $$58.b(dzc.I) && $$58.c(dzc.I);
            if (!$$59) {
               this.b.a((double)$$1.u() + 0.5, (double)$$1.v() + drt.e, (double)$$1.w() + 0.5, awk.xb, awl.e, 2.0F, 0.6F + this.b.A.i() * 0.4F, false);
            }
            break;
         case 3008:
            dym $$25 = dku.a($$2);
            if ($$25.b() instanceof dla $$26) {
               this.b.a($$1, $$26.d(), awl.h, 1.0F, 1.0F, false);
            }

            this.b.a($$1, $$25);
            break;
         case 3009:
            azo.a(this.b, $$1, lv.aZ, btb.a(3, 6));
            break;
         case 3011:
            dxo.a(this.b, $$1, $$3, dxo.a.a($$2).c);
            break;
         case 3012:
            this.b.a($$1, awk.mA, awl.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dxo.a(this.b, $$1, $$3, dxo.a.a($$2).c);
            break;
         case 3013:
            this.b.a($$1, awk.mE, awl.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dxo.a(this.b, $$1, $$3, $$2, lv.bb);
            break;
         case 3014:
            this.b.a($$1, awk.mK, awl.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dxo.b(this.b, $$1, $$3);
            break;
         case 3015:
            if (this.b.c_($$1) instanceof dxu $$31) {
               dxu.a.a(this.b, $$31.aw_(), $$31.m(), $$31.c(), $$2 == 0 ? lv.aM : lv.N);
               this.b.a($$1, awk.By, awl.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            }
            break;
         case 3016:
            dxu.a.a(this.b, $$1, $$2 == 0 ? lv.aM : lv.N);
            this.b.a($$1, awk.BC, awl.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            break;
         case 3017:
            dxo.b(this.b, $$1, $$3);
            break;
         case 3018:
            for (int $$32 = 0; $$32 < 10; $$32++) {
               double $$33 = $$3.k() * 0.02;
               double $$34 = $$3.k() * 0.02;
               double $$35 = $$3.k() * 0.02;
               this.b.a(lv.ae, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), $$33, $$34, $$35);
            }

            this.b.a($$1, awk.fm, awl.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            break;
         case 3019:
            this.b.a($$1, awk.mE, awl.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dxo.a(this.b, $$1, $$3, $$2, lv.bc);
            break;
         case 3020:
            this.b.a($$1, awk.mF, awl.e, $$2 == 0 ? 0.3F : 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dxo.a(this.b, $$1, $$3, 0, lv.bc);
            dxo.a(this.b, $$1, $$3);
            break;
         case 3021:
            this.b.a($$1, awk.mC, awl.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dxo.a(this.b, $$1, $$3, dxo.a.a($$2).c);
      }
   }

   private void a(int $$0, jj $$1, azs $$2, lz $$3) {
      jo $$4 = jo.a($$0);
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

   private void a(js<cye> $$0, jj $$1) {
      this.a($$1);
      cye $$2 = $$0.a();
      awj $$3 = $$2.b().a();
      hkp $$4 = hkk.a($$3, fcu.b($$1));
      this.d.put($$1, $$4);
      this.a.ak().a($$4);
      this.a.m.a($$2.c());
      this.a(this.b, $$1, true);
   }

   private void a(jj $$0) {
      hkp $$1 = this.d.remove($$0);
      if ($$1 != null) {
         this.a.ak().b($$1);
      }
   }

   private void b(jj $$0) {
      this.a($$0);
      this.a(this.b, $$0, false);
   }

   private void a(dhp $$0, jj $$1, boolean $$2) {
      for (bwr $$4 : $$0.a(bwr.class, new fcp($$1).g(3.0))) {
         $$4.a($$1, $$2);
      }
   }
}
