import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class glq {
   private final flh a;
   private final dgg b;
   private final glr c;
   private final Map<ji, hij> d = new HashMap<>();

   public glq(flh $$0, dgg $$1, glr $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a(int $$0, ji $$1, int $$2) {
      switch ($$0) {
         case 1023:
         case 1028:
         case 1038:
            fkp $$3 = this.a.j.k();
            if ($$3.h()) {
               fay $$4 = fay.b($$1).d($$3.b()).d();
               fay $$5 = $$3.b().e($$4.c(2.0));
               if ($$0 == 1023) {
                  this.b.a($$5.d, $$5.e, $$5.f, avz.Dv, awa.f, 1.0F, 1.0F, false);
               } else if ($$0 == 1038) {
                  this.b.a($$5.d, $$5.e, $$5.f, avz.iR, awa.f, 1.0F, 1.0F, false);
               } else {
                  this.b.a($$5.d, $$5.e, $$5.f, avz.iw, awa.f, 5.0F, 1.0F, false);
               }
            }
      }
   }

   public void b(int $$0, ji $$1, int $$2) {
      azg $$3 = this.b.A;
      switch ($$0) {
         case 1000:
            this.b.a($$1, avz.hn, awa.e, 1.0F, 1.0F, false);
            break;
         case 1001:
            this.b.a($$1, avz.ho, awa.e, 1.0F, 1.2F, false);
            break;
         case 1002:
            this.b.a($$1, avz.hp, awa.e, 1.0F, 1.2F, false);
            break;
         case 1004:
            this.b.a($$1, avz.jq, awa.g, 1.0F, 1.2F, false);
            break;
         case 1009:
            if ($$2 == 0) {
               this.b.a($$1, avz.ju, awa.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);
            } else if ($$2 == 1) {
               this.b.a($$1, avz.kF, awa.e, 0.7F, 1.6F + ($$3.i() - $$3.i()) * 0.4F, false);
            }
            break;
         case 1010:
            this.b.K_().e(mc.L).c($$2).ifPresent($$1x -> this.a($$1x, $$1));
            break;
         case 1011:
            this.b($$1);
            break;
         case 1015:
            this.b.a($$1, avz.kP, awa.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1016:
            this.b.a($$1, avz.kO, awa.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1017:
            this.b.a($$1, avz.iB, awa.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1018:
            this.b.a($$1, avz.ck, awa.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1019:
            this.b.a($$1, avz.Ei, awa.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1020:
            this.b.a($$1, avz.Ej, awa.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1021:
            this.b.a($$1, avz.Ek, awa.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1022:
            this.b.a($$1, avz.Dn, awa.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1024:
            this.b.a($$1, avz.Dq, awa.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1025:
            this.b.a($$1, avz.bJ, awa.g, 0.05F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1026:
            this.b.a($$1, avz.Es, awa.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1027:
            this.b.a($$1, avz.Ez, awa.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1029:
            this.b.a($$1, avz.V, awa.e, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 1030:
            this.b.a($$1, avz.ab, awa.e, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 1031:
            this.b.a($$1, avz.Y, awa.e, 0.3F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1032:
            this.a.ak().a(hie.b(avz.vi, $$3.i() * 0.4F + 0.8F, 0.25F));
            break;
         case 1033:
            this.b.a($$1, avz.fi, awa.e, 1.0F, 1.0F, false);
            break;
         case 1034:
            this.b.a($$1, avz.fh, awa.e, 1.0F, 1.0F, false);
            break;
         case 1035:
            this.b.a($$1, avz.cR, awa.e, 1.0F, 1.0F, false);
            break;
         case 1039:
            this.b.a($$1, avz.tV, awa.f, 0.3F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1040:
            this.b.a($$1, avz.El, awa.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1041:
            this.b.a($$1, avz.ny, awa.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1042:
            this.b.a($$1, avz.lM, awa.e, 1.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1043:
            this.b.a($$1, avz.cy, awa.e, 1.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1044:
            this.b.a($$1, avz.yX, awa.e, 1.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1045:
            this.b.a($$1, avz.hR, awa.e, 2.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1046:
            this.b.a($$1, avz.hU, awa.e, 2.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1047:
            this.b.a($$1, avz.hV, awa.e, 2.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1048:
            this.b.a($$1, avz.xC, awa.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1049:
            this.b.a($$1, avz.gi, awa.e, 1.0F, 1.0F, false);
            break;
         case 1050:
            this.b.a($$1, avz.gj, awa.e, 1.0F, 1.0F, false);
            break;
         case 1051:
            this.b.a($$1, avz.Df, awa.e, 0.5F, 0.4F / (this.b.H_().i() * 0.4F + 0.8F), false);
            break;
         case 1500:
            dkv.a(this.b, $$1, $$2 > 0);
            break;
         case 1501:
            this.b.a($$1, avz.oo, awa.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);

            for (int $$60 = 0; $$60 < 8; $$60++) {
               this.b.a(lt.Z, (double)$$1.u() + $$3.j(), (double)$$1.v() + 1.2, (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
            }
            break;
         case 1502:
            this.b.a($$1, avz.vV, awa.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);

            for (int $$61 = 0; $$61 < 5; $$61++) {
               double $$62 = (double)$$1.u() + $$3.j() * 0.6 + 0.2;
               double $$63 = (double)$$1.v() + $$3.j() * 0.6 + 0.2;
               double $$64 = (double)$$1.w() + $$3.j() * 0.6 + 0.2;
               this.b.a(lt.ag, $$62, $$63, $$64, 0.0, 0.0, 0.0);
            }
            break;
         case 1503:
            this.b.a($$1, avz.iQ, awa.e, 1.0F, 1.0F, false);

            for (int $$65 = 0; $$65 < 16; $$65++) {
               double $$66 = (double)$$1.u() + (5.0 + $$3.j() * 6.0) / 16.0;
               double $$67 = (double)$$1.v() + 0.8125;
               double $$68 = (double)$$1.w() + (5.0 + $$3.j() * 6.0) / 16.0;
               this.b.a(lt.ag, $$66, $$67, $$68, 0.0, 0.0, 0.0);
            }
            break;
         case 1504:
            dpg.a(this.b, $$1, this.b.a_($$1));
            break;
         case 1505:
            cuv.a(this.b, $$1, $$2);
            this.b.a($$1, avz.cx, awa.e, 1.0F, 1.0F, false);
            break;
         case 2000:
            this.a($$2, $$1, $$3, lt.ag);
            break;
         case 2001:
            dwv $$23 = djk.a($$2);
            if (!$$23.l()) {
               drc $$24 = $$23.A();
               this.b.a($$1, $$24.c(), awa.e, ($$24.a() + 1.0F) / 2.0F, $$24.b() * 0.8F, false);
            }

            this.b.a($$1, $$23);
            break;
         case 2002:
         case 2007:
            fay $$9 = fay.c($$1);

            for (int $$10 = 0; $$10 < 8; $$10++) {
               this.c.a(new lp(lt.T, new cwn(cwr.wo)), $$9.d, $$9.e, $$9.f, $$3.k() * 0.15, $$3.j() * 0.2, $$3.k() * 0.15);
            }

            float $$11 = (float)($$2 >> 16 & 0xFF) / 255.0F;
            float $$12 = (float)($$2 >> 8 & 0xFF) / 255.0F;
            float $$13 = (float)($$2 >> 0 & 0xFF) / 255.0F;
            lr $$14 = $$0 == 2007 ? lt.S : lt.p;

            for (int $$15 = 0; $$15 < 100; $$15++) {
               double $$16 = $$3.j() * 4.0;
               double $$17 = $$3.j() * Math.PI * 2.0;
               double $$18 = Math.cos($$17) * $$16;
               double $$19 = 0.01 + $$3.j() * 0.5;
               double $$20 = Math.sin($$17) * $$16;
               gje $$21 = this.c.b($$14, $$14.a().b(), $$9.d + $$18 * 0.1, $$9.e + 0.3, $$9.f + $$20 * 0.1, $$18, $$19, $$20);
               if ($$21 != null) {
                  float $$22 = 0.75F + $$3.i() * 0.25F;
                  $$21.a($$11 * $$22, $$12 * $$22, $$13 * $$22);
                  $$21.c((float)$$16);
               }
            }

            this.b.a($$1, avz.zD, awa.g, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 2003:
            double $$4 = (double)$$1.u() + 0.5;
            double $$5 = (double)$$1.v();
            double $$6 = (double)$$1.w() + 0.5;

            for (int $$7 = 0; $$7 < 8; $$7++) {
               this.c.a(new lp(lt.T, new cwn(cwr.tp)), $$4, $$5, $$6, $$3.k() * 0.15, $$3.j() * 0.2, $$3.k() * 0.15);
            }

            for (double $$8 = 0.0; $$8 < Math.PI * 2; $$8 += Math.PI / 20) {
               this.c.a(lt.ae, $$4 + Math.cos($$8) * 5.0, $$5 - 0.4, $$6 + Math.sin($$8) * 5.0, Math.cos($$8) * -5.0, 0.0, Math.sin($$8) * -5.0);
               this.c.a(lt.ae, $$4 + Math.cos($$8) * 5.0, $$5 - 0.4, $$6 + Math.sin($$8) * 5.0, Math.cos($$8) * -7.0, 0.0, Math.sin($$8) * -7.0);
            }
            break;
         case 2004:
            for (int $$27 = 0; $$27 < 20; $$27++) {
               double $$28 = (double)$$1.u() + 0.5 + ($$3.j() - 0.5) * 2.0;
               double $$29 = (double)$$1.v() + 0.5 + ($$3.j() - 0.5) * 2.0;
               double $$30 = (double)$$1.w() + 0.5 + ($$3.j() - 0.5) * 2.0;
               this.b.a(lt.ag, $$28, $$29, $$30, 0.0, 0.0, 0.0);
               this.b.a(lt.F, $$28, $$29, $$30, 0.0, 0.0, 0.0);
            }
            break;
         case 2006:
            for (int $$69 = 0; $$69 < 200; $$69++) {
               float $$70 = $$3.i() * 4.0F;
               float $$71 = $$3.i() * (float) (Math.PI * 2);
               double $$72 = (double)(ayy.b($$71) * $$70);
               double $$73 = 0.01 + $$3.j() * 0.5;
               double $$74 = (double)(ayy.a($$71) * $$70);
               gje $$75 = this.c.b(lt.h, false, (double)$$1.u() + $$72 * 0.1, (double)$$1.v() + 0.3, (double)$$1.w() + $$74 * 0.1, $$72, $$73, $$74);
               if ($$75 != null) {
                  $$75.c($$70);
               }
            }

            if ($$2 == 1) {
               this.b.a($$1, avz.ix, awa.f, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            }
            break;
         case 2008:
            this.b.a(lt.w, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            break;
         case 2009:
            for (int $$76 = 0; $$76 < 8; $$76++) {
               this.b.a(lt.e, (double)$$1.u() + $$3.j(), (double)$$1.v() + 1.2, (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
            }
            break;
         case 2010:
            this.a($$2, $$1, $$3, lt.ah);
            break;
         case 2011:
            azc.a(this.b, $$1, $$2, lt.P);
            break;
         case 2012:
            azc.a(this.b, $$1, $$2, lt.P);
            break;
         case 2013:
            azc.a(this.b, $$1, $$2);
            break;
         case 3000:
            this.b.a(lt.v, true, true, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            this.b.a($$1, avz.iP, awa.e, 10.0F, (1.0F + (this.b.A.i() - this.b.A.i()) * 0.2F) * 0.7F, false);
            break;
         case 3001:
            this.b.a($$1, avz.iz, awa.f, 64.0F, 0.8F + this.b.A.i() * 0.3F, false);
            break;
         case 3002:
            if ($$2 >= 0 && $$2 < jn.a.d.length) {
               azc.a(jn.a.d[$$2], this.b, $$1, 0.125, lt.aV, brt.a(10, 19));
            } else {
               azc.a(this.b, $$1, lt.aV, brt.a(3, 5));
            }
            break;
         case 3003:
            azc.a(this.b, $$1, lt.aT, brt.a(3, 5));
            this.b.a($$1, avz.na, awa.e, 1.0F, 1.0F, false);
            break;
         case 3004:
            azc.a(this.b, $$1, lt.aU, brt.a(3, 5));
            break;
         case 3005:
            azc.a(this.b, $$1, lt.aW, brt.a(3, 5));
            break;
         case 3006:
            int $$36 = $$2 >> 6;
            if ($$36 > 0) {
               if ($$3.i() < 0.3F + (float)$$36 * 0.1F) {
                  float $$37 = 0.15F + 0.02F * (float)$$36 * (float)$$36 * $$3.i();
                  float $$38 = 0.4F + 0.3F * (float)$$36 * $$3.i();
                  this.b.a($$1, avz.wu, awa.e, $$37, $$38, false);
               }

               byte $$39 = (byte)($$2 & 63);
               brn $$40 = brt.a(0, $$36);
               float $$41 = 0.005F;
               Supplier<fay> $$42 = () -> new fay(ayy.a($$3, -0.005F, 0.005F), ayy.a($$3, -0.005F, 0.005F), ayy.a($$3, -0.005F, 0.005F));
               if ($$39 == 0) {
                  for (jn $$43 : jn.values()) {
                     float $$44 = $$43 == jn.a ? (float) Math.PI : 0.0F;
                     double $$45 = $$43.o() == jn.a.b ? 0.65 : 0.57;
                     azc.a(this.b, $$1, new lv($$44), $$40, $$43, $$42, $$45);
                  }
               } else {
                  for (jn $$46 : dom.a($$39)) {
                     float $$47 = $$46 == jn.b ? (float) Math.PI : 0.0F;
                     double $$48 = 0.35;
                     azc.a(this.b, $$1, new lv($$47), $$40, $$46, $$42, 0.35);
                  }
               }
            } else {
               this.b.a($$1, avz.wu, awa.e, 1.0F, 1.0F, false);
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
                        lt.L,
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
               this.b.a(new lw($$57 * 5), (double)$$1.u() + 0.5, (double)$$1.v() + dqj.f, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            }

            dwv $$58 = this.b.a_($$1);
            boolean $$59 = $$58.b(dxl.J) && $$58.c(dxl.J);
            if (!$$59) {
               this.b.a((double)$$1.u() + 0.5, (double)$$1.v() + dqj.f, (double)$$1.w() + 0.5, avz.wR, awa.e, 2.0F, 0.6F + this.b.A.i() * 0.4F, false);
            }
            break;
         case 3008:
            dwv $$25 = djk.a($$2);
            if ($$25.b() instanceof djq $$26) {
               this.b.a($$1, $$26.d(), awa.h, 1.0F, 1.0F, false);
            }

            this.b.a($$1, $$25);
            break;
         case 3009:
            azc.a(this.b, $$1, lt.aY, brt.a(3, 6));
            break;
         case 3011:
            dvx.a(this.b, $$1, $$3, dvx.a.a($$2).c);
            break;
         case 3012:
            this.b.a($$1, avz.mA, awa.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dvx.a(this.b, $$1, $$3, dvx.a.a($$2).c);
            break;
         case 3013:
            this.b.a($$1, avz.mE, awa.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dvx.a(this.b, $$1, $$3, $$2, lt.ba);
            break;
         case 3014:
            this.b.a($$1, avz.mK, awa.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dvx.b(this.b, $$1, $$3);
            break;
         case 3015:
            if (this.b.c_($$1) instanceof dwd $$31) {
               dwd.a.a(this.b, $$31.aA_(), $$31.m(), $$31.c(), $$2 == 0 ? lt.aL : lt.M);
               this.b.a($$1, avz.Bo, awa.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            }
            break;
         case 3016:
            dwd.a.a(this.b, $$1, $$2 == 0 ? lt.aL : lt.M);
            this.b.a($$1, avz.Bs, awa.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            break;
         case 3017:
            dvx.b(this.b, $$1, $$3);
            break;
         case 3018:
            for (int $$32 = 0; $$32 < 10; $$32++) {
               double $$33 = $$3.k() * 0.02;
               double $$34 = $$3.k() * 0.02;
               double $$35 = $$3.k() * 0.02;
               this.b.a(lt.ad, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), $$33, $$34, $$35);
            }

            this.b.a($$1, avz.fm, awa.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            break;
         case 3019:
            this.b.a($$1, avz.mE, awa.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dvx.a(this.b, $$1, $$3, $$2, lt.bb);
            break;
         case 3020:
            this.b.a($$1, avz.mF, awa.e, $$2 == 0 ? 0.3F : 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dvx.a(this.b, $$1, $$3, 0, lt.bb);
            dvx.a(this.b, $$1, $$3);
            break;
         case 3021:
            this.b.a($$1, avz.mC, awa.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dvx.a(this.b, $$1, $$3, dvx.a.a($$2).c);
      }
   }

   private void a(int $$0, ji $$1, azg $$2, lx $$3) {
      jn $$4 = jn.a($$0);
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

   private void a(jr<cwt> $$0, ji $$1) {
      this.a($$1);
      cwt $$2 = $$0.a();
      avy $$3 = $$2.b().a();
      hij $$4 = hie.a($$3, fay.b($$1));
      this.d.put($$1, $$4);
      this.a.ak().a($$4);
      this.a.m.a($$2.c());
      this.a(this.b, $$1, true);
   }

   private void a(ji $$0) {
      hij $$1 = this.d.remove($$0);
      if ($$1 != null) {
         this.a.ak().b($$1);
      }
   }

   private void b(ji $$0) {
      this.a($$0);
      this.a(this.b, $$0, false);
   }

   private void a(dgg $$0, ji $$1, boolean $$2) {
      for (bvf $$4 : $$0.a(bvf.class, new fat($$1).g(3.0))) {
         $$4.a($$1, $$2);
      }
   }
}
