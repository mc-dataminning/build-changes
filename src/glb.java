import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class glb {
   private final flz a;
   private final dgz b;
   private final glc c;
   private final Map<jh, hfd> d = new HashMap<>();

   public glb(flz $$0, dgz $$1, glc $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a(int $$0, jh $$1, int $$2) {
      switch ($$0) {
         case 1023:
         case 1028:
         case 1038:
            fli $$3 = this.a.j.k();
            if ($$3.h()) {
               fbr $$4 = fbr.b($$1).d($$3.b()).d();
               fbr $$5 = $$3.b().e($$4.c(2.0));
               if ($$0 == 1023) {
                  this.b.a($$5.d, $$5.e, $$5.f, awv.Dw, aww.f, 1.0F, 1.0F, false);
               } else if ($$0 == 1038) {
                  this.b.a($$5.d, $$5.e, $$5.f, awv.iR, aww.f, 1.0F, 1.0F, false);
               } else {
                  this.b.a($$5.d, $$5.e, $$5.f, awv.iw, aww.f, 5.0F, 1.0F, false);
               }
            }
      }
   }

   public void b(int $$0, jh $$1, int $$2) {
      bac $$3 = this.b.A;
      switch ($$0) {
         case 1000:
            this.b.a($$1, awv.hn, aww.e, 1.0F, 1.0F, false);
            break;
         case 1001:
            this.b.a($$1, awv.ho, aww.e, 1.0F, 1.2F, false);
            break;
         case 1002:
            this.b.a($$1, awv.hp, aww.e, 1.0F, 1.2F, false);
            break;
         case 1004:
            this.b.a($$1, awv.jq, aww.g, 1.0F, 1.2F, false);
            break;
         case 1009:
            if ($$2 == 0) {
               this.b.a($$1, awv.ju, aww.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);
            } else if ($$2 == 1) {
               this.b.a($$1, awv.kF, aww.e, 0.7F, 1.6F + ($$3.i() - $$3.i()) * 0.4F, false);
            }
            break;
         case 1010:
            this.b.K_().e(mb.L).c($$2).ifPresent($$1x -> this.a($$1x, $$1));
            break;
         case 1011:
            this.b($$1);
            break;
         case 1015:
            this.b.a($$1, awv.kP, aww.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1016:
            this.b.a($$1, awv.kO, aww.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1017:
            this.b.a($$1, awv.iB, aww.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1018:
            this.b.a($$1, awv.ck, aww.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1019:
            this.b.a($$1, awv.Ej, aww.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1020:
            this.b.a($$1, awv.Ek, aww.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1021:
            this.b.a($$1, awv.El, aww.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1022:
            this.b.a($$1, awv.Do, aww.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1024:
            this.b.a($$1, awv.Dr, aww.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1025:
            this.b.a($$1, awv.bJ, aww.g, 0.05F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1026:
            this.b.a($$1, awv.Et, aww.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1027:
            this.b.a($$1, awv.EA, aww.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1029:
            this.b.a($$1, awv.V, aww.e, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 1030:
            this.b.a($$1, awv.ab, aww.e, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 1031:
            this.b.a($$1, awv.Y, aww.e, 0.3F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1032:
            this.a.ak().a(hey.b(awv.vi, $$3.i() * 0.4F + 0.8F, 0.25F));
            break;
         case 1033:
            this.b.a($$1, awv.fi, aww.e, 1.0F, 1.0F, false);
            break;
         case 1034:
            this.b.a($$1, awv.fh, aww.e, 1.0F, 1.0F, false);
            break;
         case 1035:
            this.b.a($$1, awv.cR, aww.e, 1.0F, 1.0F, false);
            break;
         case 1039:
            this.b.a($$1, awv.tV, aww.f, 0.3F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1040:
            this.b.a($$1, awv.Em, aww.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1041:
            this.b.a($$1, awv.ny, aww.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1042:
            this.b.a($$1, awv.lM, aww.e, 1.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1043:
            this.b.a($$1, awv.cy, aww.e, 1.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1044:
            this.b.a($$1, awv.yY, aww.e, 1.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1045:
            this.b.a($$1, awv.hR, aww.e, 2.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1046:
            this.b.a($$1, awv.hU, aww.e, 2.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1047:
            this.b.a($$1, awv.hV, aww.e, 2.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1048:
            this.b.a($$1, awv.xC, aww.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1049:
            this.b.a($$1, awv.gi, aww.e, 1.0F, 1.0F, false);
            break;
         case 1050:
            this.b.a($$1, awv.gj, aww.e, 1.0F, 1.0F, false);
            break;
         case 1051:
            this.b.a($$1, awv.Dg, aww.e, 0.5F, 0.4F / (this.b.H_().i() * 0.4F + 0.8F), false);
            break;
         case 1500:
            dlo.a(this.b, $$1, $$2 > 0);
            break;
         case 1501:
            this.b.a($$1, awv.oo, aww.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);

            for (int $$60 = 0; $$60 < 8; $$60++) {
               this.b.a(ls.Z, (double)$$1.u() + $$3.j(), (double)$$1.v() + 1.2, (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
            }
            break;
         case 1502:
            this.b.a($$1, awv.vV, aww.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);

            for (int $$61 = 0; $$61 < 5; $$61++) {
               double $$62 = (double)$$1.u() + $$3.j() * 0.6 + 0.2;
               double $$63 = (double)$$1.v() + $$3.j() * 0.6 + 0.2;
               double $$64 = (double)$$1.w() + $$3.j() * 0.6 + 0.2;
               this.b.a(ls.ag, $$62, $$63, $$64, 0.0, 0.0, 0.0);
            }
            break;
         case 1503:
            this.b.a($$1, awv.iQ, aww.e, 1.0F, 1.0F, false);

            for (int $$65 = 0; $$65 < 16; $$65++) {
               double $$66 = (double)$$1.u() + (5.0 + $$3.j() * 6.0) / 16.0;
               double $$67 = (double)$$1.v() + 0.8125;
               double $$68 = (double)$$1.w() + (5.0 + $$3.j() * 6.0) / 16.0;
               this.b.a(ls.ag, $$66, $$67, $$68, 0.0, 0.0, 0.0);
            }
            break;
         case 1504:
            dpz.a(this.b, $$1, this.b.a_($$1));
            break;
         case 1505:
            cvo.a(this.b, $$1, $$2);
            this.b.a($$1, awv.cx, aww.e, 1.0F, 1.0F, false);
            break;
         case 2000:
            this.a($$2, $$1, $$3, ls.ag);
            break;
         case 2001:
            dxo $$23 = dkd.a($$2);
            if (!$$23.l()) {
               drv $$24 = $$23.A();
               this.b.a($$1, $$24.c(), aww.e, ($$24.a() + 1.0F) / 2.0F, $$24.b() * 0.8F, false);
            }

            this.b.a($$1, $$23);
            break;
         case 2002:
         case 2007:
            fbr $$9 = fbr.c($$1);

            for (int $$10 = 0; $$10 < 8; $$10++) {
               this.c.a(new lo(ls.T, new cxg(cxk.wo)), $$9.d, $$9.e, $$9.f, $$3.k() * 0.15, $$3.j() * 0.2, $$3.k() * 0.15);
            }

            float $$11 = (float)($$2 >> 16 & 0xFF) / 255.0F;
            float $$12 = (float)($$2 >> 8 & 0xFF) / 255.0F;
            float $$13 = (float)($$2 >> 0 & 0xFF) / 255.0F;
            lq $$14 = $$0 == 2007 ? ls.S : ls.p;

            for (int $$15 = 0; $$15 < 100; $$15++) {
               double $$16 = $$3.j() * 4.0;
               double $$17 = $$3.j() * Math.PI * 2.0;
               double $$18 = Math.cos($$17) * $$16;
               double $$19 = 0.01 + $$3.j() * 0.5;
               double $$20 = Math.sin($$17) * $$16;
               gin $$21 = this.c.b($$14, $$14.a().b(), $$9.d + $$18 * 0.1, $$9.e + 0.3, $$9.f + $$20 * 0.1, $$18, $$19, $$20);
               if ($$21 != null) {
                  float $$22 = 0.75F + $$3.i() * 0.25F;
                  $$21.a($$11 * $$22, $$12 * $$22, $$13 * $$22);
                  $$21.c((float)$$16);
               }
            }

            this.b.a($$1, awv.zE, aww.g, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 2003:
            double $$4 = (double)$$1.u() + 0.5;
            double $$5 = (double)$$1.v();
            double $$6 = (double)$$1.w() + 0.5;

            for (int $$7 = 0; $$7 < 8; $$7++) {
               this.c.a(new lo(ls.T, new cxg(cxk.tp)), $$4, $$5, $$6, $$3.k() * 0.15, $$3.j() * 0.2, $$3.k() * 0.15);
            }

            for (double $$8 = 0.0; $$8 < Math.PI * 2; $$8 += Math.PI / 20) {
               this.c.a(ls.ae, $$4 + Math.cos($$8) * 5.0, $$5 - 0.4, $$6 + Math.sin($$8) * 5.0, Math.cos($$8) * -5.0, 0.0, Math.sin($$8) * -5.0);
               this.c.a(ls.ae, $$4 + Math.cos($$8) * 5.0, $$5 - 0.4, $$6 + Math.sin($$8) * 5.0, Math.cos($$8) * -7.0, 0.0, Math.sin($$8) * -7.0);
            }
            break;
         case 2004:
            for (int $$27 = 0; $$27 < 20; $$27++) {
               double $$28 = (double)$$1.u() + 0.5 + ($$3.j() - 0.5) * 2.0;
               double $$29 = (double)$$1.v() + 0.5 + ($$3.j() - 0.5) * 2.0;
               double $$30 = (double)$$1.w() + 0.5 + ($$3.j() - 0.5) * 2.0;
               this.b.a(ls.ag, $$28, $$29, $$30, 0.0, 0.0, 0.0);
               this.b.a(ls.F, $$28, $$29, $$30, 0.0, 0.0, 0.0);
            }
            break;
         case 2006:
            for (int $$69 = 0; $$69 < 200; $$69++) {
               float $$70 = $$3.i() * 4.0F;
               float $$71 = $$3.i() * (float) (Math.PI * 2);
               double $$72 = (double)(azu.b($$71) * $$70);
               double $$73 = 0.01 + $$3.j() * 0.5;
               double $$74 = (double)(azu.a($$71) * $$70);
               gin $$75 = this.c.b(ls.h, false, (double)$$1.u() + $$72 * 0.1, (double)$$1.v() + 0.3, (double)$$1.w() + $$74 * 0.1, $$72, $$73, $$74);
               if ($$75 != null) {
                  $$75.c($$70);
               }
            }

            if ($$2 == 1) {
               this.b.a($$1, awv.ix, aww.f, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            }
            break;
         case 2008:
            this.b.a(ls.w, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            break;
         case 2009:
            for (int $$76 = 0; $$76 < 8; $$76++) {
               this.b.a(ls.e, (double)$$1.u() + $$3.j(), (double)$$1.v() + 1.2, (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
            }
            break;
         case 2010:
            this.a($$2, $$1, $$3, ls.ah);
            break;
         case 2011:
            azy.a(this.b, $$1, $$2, ls.P);
            break;
         case 2012:
            azy.a(this.b, $$1, $$2, ls.P);
            break;
         case 2013:
            azy.a(this.b, $$1, $$2);
            break;
         case 3000:
            this.b.a(ls.v, true, true, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            this.b.a($$1, awv.iP, aww.e, 10.0F, (1.0F + (this.b.A.i() - this.b.A.i()) * 0.2F) * 0.7F, false);
            break;
         case 3001:
            this.b.a($$1, awv.iz, aww.f, 64.0F, 0.8F + this.b.A.i() * 0.3F, false);
            break;
         case 3002:
            if ($$2 >= 0 && $$2 < jm.a.d.length) {
               azy.a(jm.a.d[$$2], this.b, $$1, 0.125, ls.aV, bsl.a(10, 19));
            } else {
               azy.a(this.b, $$1, ls.aV, bsl.a(3, 5));
            }
            break;
         case 3003:
            azy.a(this.b, $$1, ls.aT, bsl.a(3, 5));
            this.b.a($$1, awv.na, aww.e, 1.0F, 1.0F, false);
            break;
         case 3004:
            azy.a(this.b, $$1, ls.aU, bsl.a(3, 5));
            break;
         case 3005:
            azy.a(this.b, $$1, ls.aW, bsl.a(3, 5));
            break;
         case 3006:
            int $$36 = $$2 >> 6;
            if ($$36 > 0) {
               if ($$3.i() < 0.3F + (float)$$36 * 0.1F) {
                  float $$37 = 0.15F + 0.02F * (float)$$36 * (float)$$36 * $$3.i();
                  float $$38 = 0.4F + 0.3F * (float)$$36 * $$3.i();
                  this.b.a($$1, awv.wu, aww.e, $$37, $$38, false);
               }

               byte $$39 = (byte)($$2 & 63);
               bsf $$40 = bsl.a(0, $$36);
               float $$41 = 0.005F;
               Supplier<fbr> $$42 = () -> new fbr(azu.a($$3, -0.005F, 0.005F), azu.a($$3, -0.005F, 0.005F), azu.a($$3, -0.005F, 0.005F));
               if ($$39 == 0) {
                  for (jm $$43 : jm.values()) {
                     float $$44 = $$43 == jm.a ? (float) Math.PI : 0.0F;
                     double $$45 = $$43.o() == jm.a.b ? 0.65 : 0.57;
                     azy.a(this.b, $$1, new lu($$44), $$40, $$43, $$42, $$45);
                  }
               } else {
                  for (jm $$46 : dpf.a($$39)) {
                     float $$47 = $$46 == jm.b ? (float) Math.PI : 0.0F;
                     double $$48 = 0.35;
                     azy.a(this.b, $$1, new lu($$47), $$40, $$46, $$42, 0.35);
                  }
               }
            } else {
               this.b.a($$1, awv.wu, aww.e, 1.0F, 1.0F, false);
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
                        ls.L,
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
               this.b.a(new lv($$57 * 5), (double)$$1.u() + 0.5, (double)$$1.v() + drc.f, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            }

            dxo $$58 = this.b.a_($$1);
            boolean $$59 = $$58.b(dye.J) && $$58.c(dye.J);
            if (!$$59) {
               this.b.a((double)$$1.u() + 0.5, (double)$$1.v() + drc.f, (double)$$1.w() + 0.5, awv.wR, aww.e, 2.0F, 0.6F + this.b.A.i() * 0.4F, false);
            }
            break;
         case 3008:
            dxo $$25 = dkd.a($$2);
            if ($$25.b() instanceof dkj $$26) {
               this.b.a($$1, $$26.d(), aww.h, 1.0F, 1.0F, false);
            }

            this.b.a($$1, $$25);
            break;
         case 3009:
            azy.a(this.b, $$1, ls.aY, bsl.a(3, 6));
            break;
         case 3011:
            dwq.a(this.b, $$1, $$3, dwq.a.a($$2).c);
            break;
         case 3012:
            this.b.a($$1, awv.mA, aww.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dwq.a(this.b, $$1, $$3, dwq.a.a($$2).c);
            break;
         case 3013:
            this.b.a($$1, awv.mE, aww.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dwq.a(this.b, $$1, $$3, $$2, ls.ba);
            break;
         case 3014:
            this.b.a($$1, awv.mK, aww.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dwq.b(this.b, $$1, $$3);
            break;
         case 3015:
            if (this.b.c_($$1) instanceof dww $$31) {
               dww.a.a(this.b, $$31.aB_(), $$31.m(), $$31.c(), $$2 == 0 ? ls.aL : ls.M);
               this.b.a($$1, awv.Bp, aww.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            }
            break;
         case 3016:
            dww.a.a(this.b, $$1, $$2 == 0 ? ls.aL : ls.M);
            this.b.a($$1, awv.Bt, aww.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            break;
         case 3017:
            dwq.b(this.b, $$1, $$3);
            break;
         case 3018:
            for (int $$32 = 0; $$32 < 10; $$32++) {
               double $$33 = $$3.k() * 0.02;
               double $$34 = $$3.k() * 0.02;
               double $$35 = $$3.k() * 0.02;
               this.b.a(ls.ad, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), $$33, $$34, $$35);
            }

            this.b.a($$1, awv.fm, aww.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            break;
         case 3019:
            this.b.a($$1, awv.mE, aww.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dwq.a(this.b, $$1, $$3, $$2, ls.bb);
            break;
         case 3020:
            this.b.a($$1, awv.mF, aww.e, $$2 == 0 ? 0.3F : 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dwq.a(this.b, $$1, $$3, 0, ls.bb);
            dwq.a(this.b, $$1, $$3);
            break;
         case 3021:
            this.b.a($$1, awv.mC, aww.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dwq.a(this.b, $$1, $$3, dwq.a.a($$2).c);
      }
   }

   private void a(int $$0, jh $$1, bac $$2, lw $$3) {
      jm $$4 = jm.a($$0);
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

   private void a(jq<cxm> $$0, jh $$1) {
      this.a($$1);
      cxm $$2 = $$0.a();
      awu $$3 = $$2.b().a();
      hfd $$4 = hey.a($$3, fbr.b($$1));
      this.d.put($$1, $$4);
      this.a.ak().a($$4);
      this.a.m.a($$2.c());
      this.a(this.b, $$1, true);
   }

   private void a(jh $$0) {
      hfd $$1 = this.d.remove($$0);
      if ($$1 != null) {
         this.a.ak().b($$1);
      }
   }

   private void b(jh $$0) {
      this.a($$0);
      this.a(this.b, $$0, false);
   }

   private void a(dgz $$0, jh $$1, boolean $$2) {
      for (bvx $$4 : $$0.a(bvx.class, new fbm($$1).g(3.0))) {
         $$4.a($$1, $$2);
      }
   }
}
