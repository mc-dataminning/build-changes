import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class gjb {
   private final fke a;
   private final dfm b;
   private final gjc c;
   private final Map<jh, hdb> d = new HashMap<>();

   public gjb(fke $$0, dfm $$1, gjc $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a(int $$0, jh $$1, int $$2) {
      switch ($$0) {
         case 1023:
         case 1028:
         case 1038:
            fjn $$3 = this.a.j.k();
            if ($$3.h()) {
               ezy $$4 = ezy.b($$1).d($$3.b()).d();
               ezy $$5 = $$3.b().e($$4.c(2.0));
               if ($$0 == 1023) {
                  this.b.a($$5.d, $$5.e, $$5.f, awn.CL, awo.f, 1.0F, 1.0F, false);
               } else if ($$0 == 1038) {
                  this.b.a($$5.d, $$5.e, $$5.f, awn.ix, awo.f, 1.0F, 1.0F, false);
               } else {
                  this.b.a($$5.d, $$5.e, $$5.f, awn.ic, awo.f, 5.0F, 1.0F, false);
               }
            }
      }
   }

   public void b(int $$0, jh $$1, int $$2) {
      azu $$3 = this.b.A;
      switch ($$0) {
         case 1000:
            this.b.a($$1, awn.gT, awo.e, 1.0F, 1.0F, false);
            break;
         case 1001:
            this.b.a($$1, awn.gU, awo.e, 1.0F, 1.2F, false);
            break;
         case 1002:
            this.b.a($$1, awn.gV, awo.e, 1.0F, 1.2F, false);
            break;
         case 1004:
            this.b.a($$1, awn.iR, awo.g, 1.0F, 1.2F, false);
            break;
         case 1009:
            if ($$2 == 0) {
               this.b.a($$1, awn.iV, awo.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);
            } else if ($$2 == 1) {
               this.b.a($$1, awn.kg, awo.e, 0.7F, 1.6F + ($$3.i() - $$3.i()) * 0.4F, false);
            }
            break;
         case 1010:
            this.b.J_().e(ma.L).c($$2).ifPresent($$1x -> this.a($$1x, $$1));
            break;
         case 1011:
            this.b($$1);
            break;
         case 1015:
            this.b.a($$1, awn.kq, awo.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1016:
            this.b.a($$1, awn.kp, awo.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1017:
            this.b.a($$1, awn.ih, awo.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1018:
            this.b.a($$1, awn.ck, awo.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1019:
            this.b.a($$1, awn.Dy, awo.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1020:
            this.b.a($$1, awn.Dz, awo.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1021:
            this.b.a($$1, awn.DA, awo.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1022:
            this.b.a($$1, awn.CD, awo.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1024:
            this.b.a($$1, awn.CG, awo.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1025:
            this.b.a($$1, awn.bJ, awo.g, 0.05F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1026:
            this.b.a($$1, awn.DI, awo.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1027:
            this.b.a($$1, awn.DP, awo.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1029:
            this.b.a($$1, awn.V, awo.e, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 1030:
            this.b.a($$1, awn.ab, awo.e, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 1031:
            this.b.a($$1, awn.Y, awo.e, 0.3F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1032:
            this.a.ak().a(hcw.b(awn.uH, $$3.i() * 0.4F + 0.8F, 0.25F));
            break;
         case 1033:
            this.b.a($$1, awn.fh, awo.e, 1.0F, 1.0F, false);
            break;
         case 1034:
            this.b.a($$1, awn.fg, awo.e, 1.0F, 1.0F, false);
            break;
         case 1035:
            this.b.a($$1, awn.cR, awo.e, 1.0F, 1.0F, false);
            break;
         case 1039:
            this.b.a($$1, awn.tu, awo.f, 0.3F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1040:
            this.b.a($$1, awn.DB, awo.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1041:
            this.b.a($$1, awn.mZ, awo.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1042:
            this.b.a($$1, awn.ln, awo.e, 1.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1043:
            this.b.a($$1, awn.cy, awo.e, 1.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1044:
            this.b.a($$1, awn.yn, awo.e, 1.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1045:
            this.b.a($$1, awn.hx, awo.e, 2.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1046:
            this.b.a($$1, awn.hA, awo.e, 2.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1047:
            this.b.a($$1, awn.hB, awo.e, 2.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1048:
            this.b.a($$1, awn.xb, awo.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1049:
            this.b.a($$1, awn.gh, awo.e, 1.0F, 1.0F, false);
            break;
         case 1050:
            this.b.a($$1, awn.gi, awo.e, 1.0F, 1.0F, false);
            break;
         case 1051:
            this.b.a($$1, awn.Cv, awo.e, 0.5F, 0.4F / (this.b.G_().i() * 0.4F + 0.8F), false);
            break;
         case 1500:
            dkb.a(this.b, $$1, $$2 > 0);
            break;
         case 1501:
            this.b.a($$1, awn.nP, awo.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);

            for (int $$60 = 0; $$60 < 8; $$60++) {
               this.b.a(ls.X, (double)$$1.u() + $$3.j(), (double)$$1.v() + 1.2, (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
            }
            break;
         case 1502:
            this.b.a($$1, awn.vu, awo.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);

            for (int $$61 = 0; $$61 < 5; $$61++) {
               double $$62 = (double)$$1.u() + $$3.j() * 0.6 + 0.2;
               double $$63 = (double)$$1.v() + $$3.j() * 0.6 + 0.2;
               double $$64 = (double)$$1.w() + $$3.j() * 0.6 + 0.2;
               this.b.a(ls.ae, $$62, $$63, $$64, 0.0, 0.0, 0.0);
            }
            break;
         case 1503:
            this.b.a($$1, awn.iw, awo.e, 1.0F, 1.0F, false);

            for (int $$65 = 0; $$65 < 16; $$65++) {
               double $$66 = (double)$$1.u() + (5.0 + $$3.j() * 6.0) / 16.0;
               double $$67 = (double)$$1.v() + 0.8125;
               double $$68 = (double)$$1.w() + (5.0 + $$3.j() * 6.0) / 16.0;
               this.b.a(ls.ae, $$66, $$67, $$68, 0.0, 0.0, 0.0);
            }
            break;
         case 1504:
            doh.a(this.b, $$1, this.b.a_($$1));
            break;
         case 1505:
            cuu.a(this.b, $$1, $$2);
            this.b.a($$1, awn.cx, awo.e, 1.0F, 1.0F, false);
            break;
         case 2000:
            this.a($$2, $$1, $$3, ls.ae);
            break;
         case 2001:
            dvv $$23 = diq.a($$2);
            if (!$$23.l()) {
               dqd $$24 = $$23.A();
               this.b.a($$1, $$24.c(), awo.e, ($$24.a() + 1.0F) / 2.0F, $$24.b() * 0.8F, false);
            }

            this.b.a($$1, $$23);
            break;
         case 2002:
         case 2007:
            ezy $$9 = ezy.c($$1);

            for (int $$10 = 0; $$10 < 8; $$10++) {
               this.c.a(new lo(ls.S, new cwm(cwq.vG)), $$9.d, $$9.e, $$9.f, $$3.k() * 0.15, $$3.j() * 0.2, $$3.k() * 0.15);
            }

            float $$11 = (float)($$2 >> 16 & 0xFF) / 255.0F;
            float $$12 = (float)($$2 >> 8 & 0xFF) / 255.0F;
            float $$13 = (float)($$2 >> 0 & 0xFF) / 255.0F;
            lq $$14 = $$0 == 2007 ? ls.R : ls.p;

            for (int $$15 = 0; $$15 < 100; $$15++) {
               double $$16 = $$3.j() * 4.0;
               double $$17 = $$3.j() * Math.PI * 2.0;
               double $$18 = Math.cos($$17) * $$16;
               double $$19 = 0.01 + $$3.j() * 0.5;
               double $$20 = Math.sin($$17) * $$16;
               ggo $$21 = this.c.b($$14, $$14.a().b(), $$9.d + $$18 * 0.1, $$9.e + 0.3, $$9.f + $$20 * 0.1, $$18, $$19, $$20);
               if ($$21 != null) {
                  float $$22 = 0.75F + $$3.i() * 0.25F;
                  $$21.a($$11 * $$22, $$12 * $$22, $$13 * $$22);
                  $$21.c((float)$$16);
               }
            }

            this.b.a($$1, awn.yT, awo.g, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 2003:
            double $$4 = (double)$$1.u() + 0.5;
            double $$5 = (double)$$1.v();
            double $$6 = (double)$$1.w() + 0.5;

            for (int $$7 = 0; $$7 < 8; $$7++) {
               this.c.a(new lo(ls.S, new cwm(cwq.sJ)), $$4, $$5, $$6, $$3.k() * 0.15, $$3.j() * 0.2, $$3.k() * 0.15);
            }

            for (double $$8 = 0.0; $$8 < Math.PI * 2; $$8 += Math.PI / 20) {
               this.c.a(ls.ac, $$4 + Math.cos($$8) * 5.0, $$5 - 0.4, $$6 + Math.sin($$8) * 5.0, Math.cos($$8) * -5.0, 0.0, Math.sin($$8) * -5.0);
               this.c.a(ls.ac, $$4 + Math.cos($$8) * 5.0, $$5 - 0.4, $$6 + Math.sin($$8) * 5.0, Math.cos($$8) * -7.0, 0.0, Math.sin($$8) * -7.0);
            }
            break;
         case 2004:
            for (int $$27 = 0; $$27 < 20; $$27++) {
               double $$28 = (double)$$1.u() + 0.5 + ($$3.j() - 0.5) * 2.0;
               double $$29 = (double)$$1.v() + 0.5 + ($$3.j() - 0.5) * 2.0;
               double $$30 = (double)$$1.w() + 0.5 + ($$3.j() - 0.5) * 2.0;
               this.b.a(ls.ae, $$28, $$29, $$30, 0.0, 0.0, 0.0);
               this.b.a(ls.F, $$28, $$29, $$30, 0.0, 0.0, 0.0);
            }
            break;
         case 2006:
            for (int $$69 = 0; $$69 < 200; $$69++) {
               float $$70 = $$3.i() * 4.0F;
               float $$71 = $$3.i() * (float) (Math.PI * 2);
               double $$72 = (double)(azm.b($$71) * $$70);
               double $$73 = 0.01 + $$3.j() * 0.5;
               double $$74 = (double)(azm.a($$71) * $$70);
               ggo $$75 = this.c.b(ls.h, false, (double)$$1.u() + $$72 * 0.1, (double)$$1.v() + 0.3, (double)$$1.w() + $$74 * 0.1, $$72, $$73, $$74);
               if ($$75 != null) {
                  $$75.c($$70);
               }
            }

            if ($$2 == 1) {
               this.b.a($$1, awn.id, awo.f, 1.0F, $$3.i() * 0.1F + 0.9F, false);
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
            this.a($$2, $$1, $$3, ls.af);
            break;
         case 2011:
            azq.a(this.b, $$1, $$2, ls.O);
            break;
         case 2012:
            azq.a(this.b, $$1, $$2, ls.O);
            break;
         case 2013:
            azq.a(this.b, $$1, $$2);
            break;
         case 3000:
            this.b.a(ls.v, true, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            this.b.a($$1, awn.iv, awo.e, 10.0F, (1.0F + (this.b.A.i() - this.b.A.i()) * 0.2F) * 0.7F, false);
            break;
         case 3001:
            this.b.a($$1, awn.if, awo.f, 64.0F, 0.8F + this.b.A.i() * 0.3F, false);
            break;
         case 3002:
            if ($$2 >= 0 && $$2 < jm.a.d.length) {
               azq.a(jm.a.d[$$2], this.b, $$1, 0.125, ls.aT, brv.a(10, 19));
            } else {
               azq.a(this.b, $$1, ls.aT, brv.a(3, 5));
            }
            break;
         case 3003:
            azq.a(this.b, $$1, ls.aR, brv.a(3, 5));
            this.b.a($$1, awn.mB, awo.e, 1.0F, 1.0F, false);
            break;
         case 3004:
            azq.a(this.b, $$1, ls.aS, brv.a(3, 5));
            break;
         case 3005:
            azq.a(this.b, $$1, ls.aU, brv.a(3, 5));
            break;
         case 3006:
            int $$36 = $$2 >> 6;
            if ($$36 > 0) {
               if ($$3.i() < 0.3F + (float)$$36 * 0.1F) {
                  float $$37 = 0.15F + 0.02F * (float)$$36 * (float)$$36 * $$3.i();
                  float $$38 = 0.4F + 0.3F * (float)$$36 * $$3.i();
                  this.b.a($$1, awn.vT, awo.e, $$37, $$38, false);
               }

               byte $$39 = (byte)($$2 & 63);
               brp $$40 = brv.a(0, $$36);
               float $$41 = 0.005F;
               Supplier<ezy> $$42 = () -> new ezy(azm.a($$3, -0.005F, 0.005F), azm.a($$3, -0.005F, 0.005F), azm.a($$3, -0.005F, 0.005F));
               if ($$39 == 0) {
                  for (jm $$43 : jm.values()) {
                     float $$44 = $$43 == jm.a ? (float) Math.PI : 0.0F;
                     double $$45 = $$43.o() == jm.a.b ? 0.65 : 0.57;
                     azq.a(this.b, $$1, new lu($$44), $$40, $$43, $$42, $$45);
                  }
               } else {
                  for (jm $$46 : dnp.a($$39)) {
                     float $$47 = $$46 == jm.b ? (float) Math.PI : 0.0F;
                     double $$48 = 0.35;
                     azq.a(this.b, $$1, new lu($$47), $$40, $$46, $$42, 0.35);
                  }
               }
            } else {
               this.b.a($$1, awn.vT, awo.e, 1.0F, 1.0F, false);
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
                        ls.K,
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
               this.b.a(new lv($$57 * 5), false, (double)$$1.u() + 0.5, (double)$$1.v() + dpk.f, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            }

            dvv $$58 = this.b.a_($$1);
            boolean $$59 = $$58.b(dwl.C) && $$58.c(dwl.C);
            if (!$$59) {
               this.b.a((double)$$1.u() + 0.5, (double)$$1.v() + dpk.f, (double)$$1.w() + 0.5, awn.wq, awo.e, 2.0F, 0.6F + this.b.A.i() * 0.4F, false);
            }
            break;
         case 3008:
            dvv $$25 = diq.a($$2);
            if ($$25.b() instanceof div $$26) {
               this.b.a($$1, $$26.d(), awo.h, 1.0F, 1.0F, false);
            }

            this.b.a($$1, $$25);
            break;
         case 3009:
            azq.a(this.b, $$1, ls.aW, brv.a(3, 6));
            break;
         case 3011:
            dux.a(this.b, $$1, $$3, dux.a.a($$2).c);
            break;
         case 3012:
            this.b.a($$1, awn.mb, awo.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dux.a(this.b, $$1, $$3, dux.a.a($$2).c);
            break;
         case 3013:
            this.b.a($$1, awn.mf, awo.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dux.a(this.b, $$1, $$3, $$2, ls.aY);
            break;
         case 3014:
            this.b.a($$1, awn.ml, awo.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dux.b(this.b, $$1, $$3);
            break;
         case 3015:
            if (this.b.c_($$1) instanceof dvd $$31) {
               dvd.a.a(this.b, $$31.aA_(), $$31.m(), $$31.c(), $$2 == 0 ? ls.aJ : ls.L);
               this.b.a($$1, awn.AE, awo.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            }
            break;
         case 3016:
            dvd.a.a(this.b, $$1, $$2 == 0 ? ls.aJ : ls.L);
            this.b.a($$1, awn.AI, awo.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            break;
         case 3017:
            dux.b(this.b, $$1, $$3);
            break;
         case 3018:
            for (int $$32 = 0; $$32 < 10; $$32++) {
               double $$33 = $$3.k() * 0.02;
               double $$34 = $$3.k() * 0.02;
               double $$35 = $$3.k() * 0.02;
               this.b.a(ls.ab, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), $$33, $$34, $$35);
            }

            this.b.a($$1, awn.fl, awo.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            break;
         case 3019:
            this.b.a($$1, awn.mf, awo.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dux.a(this.b, $$1, $$3, $$2, ls.aZ);
            break;
         case 3020:
            this.b.a($$1, awn.mg, awo.e, $$2 == 0 ? 0.3F : 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dux.a(this.b, $$1, $$3, 0, ls.aZ);
            dux.a(this.b, $$1, $$3);
            break;
         case 3021:
            this.b.a($$1, awn.md, awo.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dux.a(this.b, $$1, $$3, dux.a.a($$2).c);
      }
   }

   private void a(int $$0, jh $$1, azu $$2, lw $$3) {
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

   private void a(jq<cws> $$0, jh $$1) {
      this.a($$1);
      cws $$2 = $$0.a();
      awm $$3 = $$2.b().a();
      hdb $$4 = hcw.a($$3, ezy.b($$1));
      this.d.put($$1, $$4);
      this.a.ak().a($$4);
      this.a.m.a($$2.c());
      this.a(this.b, $$1, true);
   }

   private void a(jh $$0) {
      hdb $$1 = this.d.remove($$0);
      if ($$1 != null) {
         this.a.ak().b($$1);
      }
   }

   private void b(jh $$0) {
      this.a($$0);
      this.a(this.b, $$0, false);
   }

   private void a(dfm $$0, jh $$1, boolean $$2) {
      for (bvh $$4 : $$0.a(bvh.class, new ezt($$1).g(3.0))) {
         $$4.a($$1, $$2);
      }
   }
}
