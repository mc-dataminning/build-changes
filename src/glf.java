import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class glf {
   private final fmf a;
   private final dhh b;
   private final glg c;
   private final Map<jh, hfh> d = new HashMap<>();

   public glf(fmf $$0, dhh $$1, glg $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a(int $$0, jh $$1, int $$2) {
      switch ($$0) {
         case 1023:
         case 1028:
         case 1038:
            flo $$3 = this.a.j.k();
            if ($$3.h()) {
               fbx $$4 = fbx.b($$1).d($$3.b()).d();
               fbx $$5 = $$3.b().e($$4.c(2.0));
               if ($$0 == 1023) {
                  this.b.a($$5.d, $$5.e, $$5.f, axf.Dg, axg.f, 1.0F, 1.0F, false);
               } else if ($$0 == 1038) {
                  this.b.a($$5.d, $$5.e, $$5.f, axf.iQ, axg.f, 1.0F, 1.0F, false);
               } else {
                  this.b.a($$5.d, $$5.e, $$5.f, axf.iv, axg.f, 5.0F, 1.0F, false);
               }
            }
      }
   }

   public void b(int $$0, jh $$1, int $$2) {
      bam $$3 = this.b.A;
      switch ($$0) {
         case 1000:
            this.b.a($$1, axf.hm, axg.e, 1.0F, 1.0F, false);
            break;
         case 1001:
            this.b.a($$1, axf.hn, axg.e, 1.0F, 1.2F, false);
            break;
         case 1002:
            this.b.a($$1, axf.ho, axg.e, 1.0F, 1.2F, false);
            break;
         case 1004:
            this.b.a($$1, axf.jk, axg.g, 1.0F, 1.2F, false);
            break;
         case 1009:
            if ($$2 == 0) {
               this.b.a($$1, axf.jo, axg.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);
            } else if ($$2 == 1) {
               this.b.a($$1, axf.kz, axg.e, 0.7F, 1.6F + ($$3.i() - $$3.i()) * 0.4F, false);
            }
            break;
         case 1010:
            this.b.K_().e(mb.L).c($$2).ifPresent($$1x -> this.a($$1x, $$1));
            break;
         case 1011:
            this.b($$1);
            break;
         case 1015:
            this.b.a($$1, axf.kJ, axg.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1016:
            this.b.a($$1, axf.kI, axg.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1017:
            this.b.a($$1, axf.iA, axg.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1018:
            this.b.a($$1, axf.ck, axg.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1019:
            this.b.a($$1, axf.DT, axg.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1020:
            this.b.a($$1, axf.DU, axg.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1021:
            this.b.a($$1, axf.DV, axg.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1022:
            this.b.a($$1, axf.CY, axg.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1024:
            this.b.a($$1, axf.Db, axg.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1025:
            this.b.a($$1, axf.bJ, axg.g, 0.05F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1026:
            this.b.a($$1, axf.Ed, axg.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1027:
            this.b.a($$1, axf.Ek, axg.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1029:
            this.b.a($$1, axf.V, axg.e, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 1030:
            this.b.a($$1, axf.ab, axg.e, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 1031:
            this.b.a($$1, axf.Y, axg.e, 0.3F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1032:
            this.a.ak().a(hfc.b(axf.vc, $$3.i() * 0.4F + 0.8F, 0.25F));
            break;
         case 1033:
            this.b.a($$1, axf.fi, axg.e, 1.0F, 1.0F, false);
            break;
         case 1034:
            this.b.a($$1, axf.fh, axg.e, 1.0F, 1.0F, false);
            break;
         case 1035:
            this.b.a($$1, axf.cR, axg.e, 1.0F, 1.0F, false);
            break;
         case 1039:
            this.b.a($$1, axf.tP, axg.f, 0.3F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1040:
            this.b.a($$1, axf.DW, axg.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1041:
            this.b.a($$1, axf.ns, axg.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1042:
            this.b.a($$1, axf.lG, axg.e, 1.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1043:
            this.b.a($$1, axf.cy, axg.e, 1.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1044:
            this.b.a($$1, axf.yI, axg.e, 1.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1045:
            this.b.a($$1, axf.hQ, axg.e, 2.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1046:
            this.b.a($$1, axf.hT, axg.e, 2.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1047:
            this.b.a($$1, axf.hU, axg.e, 2.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1048:
            this.b.a($$1, axf.xw, axg.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1049:
            this.b.a($$1, axf.gi, axg.e, 1.0F, 1.0F, false);
            break;
         case 1050:
            this.b.a($$1, axf.gj, axg.e, 1.0F, 1.0F, false);
            break;
         case 1051:
            this.b.a($$1, axf.CQ, axg.e, 0.5F, 0.4F / (this.b.H_().i() * 0.4F + 0.8F), false);
            break;
         case 1500:
            dlx.a(this.b, $$1, $$2 > 0);
            break;
         case 1501:
            this.b.a($$1, axf.oi, axg.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);

            for (int $$60 = 0; $$60 < 8; $$60++) {
               this.b.a(ls.Y, (double)$$1.u() + $$3.j(), (double)$$1.v() + 1.2, (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
            }
            break;
         case 1502:
            this.b.a($$1, axf.vP, axg.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);

            for (int $$61 = 0; $$61 < 5; $$61++) {
               double $$62 = (double)$$1.u() + $$3.j() * 0.6 + 0.2;
               double $$63 = (double)$$1.v() + $$3.j() * 0.6 + 0.2;
               double $$64 = (double)$$1.w() + $$3.j() * 0.6 + 0.2;
               this.b.a(ls.af, $$62, $$63, $$64, 0.0, 0.0, 0.0);
            }
            break;
         case 1503:
            this.b.a($$1, axf.iP, axg.e, 1.0F, 1.0F, false);

            for (int $$65 = 0; $$65 < 16; $$65++) {
               double $$66 = (double)$$1.u() + (5.0 + $$3.j() * 6.0) / 16.0;
               double $$67 = (double)$$1.v() + 0.8125;
               double $$68 = (double)$$1.w() + (5.0 + $$3.j() * 6.0) / 16.0;
               this.b.a(ls.af, $$66, $$67, $$68, 0.0, 0.0, 0.0);
            }
            break;
         case 1504:
            dqf.a(this.b, $$1, this.b.a_($$1));
            break;
         case 1505:
            cvw.a(this.b, $$1, $$2);
            this.b.a($$1, axf.cx, axg.e, 1.0F, 1.0F, false);
            break;
         case 2000:
            this.a($$2, $$1, $$3, ls.af);
            break;
         case 2001:
            dxu $$23 = dkl.a($$2);
            if (!$$23.l()) {
               dsb $$24 = $$23.A();
               this.b.a($$1, $$24.c(), axg.e, ($$24.a() + 1.0F) / 2.0F, $$24.b() * 0.8F, false);
            }

            this.b.a($$1, $$23);
            break;
         case 2002:
         case 2007:
            fbx $$9 = fbx.c($$1);

            for (int $$10 = 0; $$10 < 8; $$10++) {
               this.c.a(new lo(ls.S, new cxo(cxs.we)), $$9.d, $$9.e, $$9.f, $$3.k() * 0.15, $$3.j() * 0.2, $$3.k() * 0.15);
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
               gir $$21 = this.c.b($$14, $$14.a().b(), $$9.d + $$18 * 0.1, $$9.e + 0.3, $$9.f + $$20 * 0.1, $$18, $$19, $$20);
               if ($$21 != null) {
                  float $$22 = 0.75F + $$3.i() * 0.25F;
                  $$21.a($$11 * $$22, $$12 * $$22, $$13 * $$22);
                  $$21.c((float)$$16);
               }
            }

            this.b.a($$1, axf.zo, axg.g, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 2003:
            double $$4 = (double)$$1.u() + 0.5;
            double $$5 = (double)$$1.v();
            double $$6 = (double)$$1.w() + 0.5;

            for (int $$7 = 0; $$7 < 8; $$7++) {
               this.c.a(new lo(ls.S, new cxo(cxs.tg)), $$4, $$5, $$6, $$3.k() * 0.15, $$3.j() * 0.2, $$3.k() * 0.15);
            }

            for (double $$8 = 0.0; $$8 < Math.PI * 2; $$8 += Math.PI / 20) {
               this.c.a(ls.ad, $$4 + Math.cos($$8) * 5.0, $$5 - 0.4, $$6 + Math.sin($$8) * 5.0, Math.cos($$8) * -5.0, 0.0, Math.sin($$8) * -5.0);
               this.c.a(ls.ad, $$4 + Math.cos($$8) * 5.0, $$5 - 0.4, $$6 + Math.sin($$8) * 5.0, Math.cos($$8) * -7.0, 0.0, Math.sin($$8) * -7.0);
            }
            break;
         case 2004:
            for (int $$27 = 0; $$27 < 20; $$27++) {
               double $$28 = (double)$$1.u() + 0.5 + ($$3.j() - 0.5) * 2.0;
               double $$29 = (double)$$1.v() + 0.5 + ($$3.j() - 0.5) * 2.0;
               double $$30 = (double)$$1.w() + 0.5 + ($$3.j() - 0.5) * 2.0;
               this.b.a(ls.af, $$28, $$29, $$30, 0.0, 0.0, 0.0);
               this.b.a(ls.F, $$28, $$29, $$30, 0.0, 0.0, 0.0);
            }
            break;
         case 2006:
            for (int $$69 = 0; $$69 < 200; $$69++) {
               float $$70 = $$3.i() * 4.0F;
               float $$71 = $$3.i() * (float) (Math.PI * 2);
               double $$72 = (double)(bae.b($$71) * $$70);
               double $$73 = 0.01 + $$3.j() * 0.5;
               double $$74 = (double)(bae.a($$71) * $$70);
               gir $$75 = this.c.b(ls.h, false, (double)$$1.u() + $$72 * 0.1, (double)$$1.v() + 0.3, (double)$$1.w() + $$74 * 0.1, $$72, $$73, $$74);
               if ($$75 != null) {
                  $$75.c($$70);
               }
            }

            if ($$2 == 1) {
               this.b.a($$1, axf.iw, axg.f, 1.0F, $$3.i() * 0.1F + 0.9F, false);
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
            this.a($$2, $$1, $$3, ls.ag);
            break;
         case 2011:
            bai.a(this.b, $$1, $$2, ls.O);
            break;
         case 2012:
            bai.a(this.b, $$1, $$2, ls.O);
            break;
         case 2013:
            bai.a(this.b, $$1, $$2);
            break;
         case 3000:
            this.b.a(ls.v, true, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            this.b.a($$1, axf.iO, axg.e, 10.0F, (1.0F + (this.b.A.i() - this.b.A.i()) * 0.2F) * 0.7F, false);
            break;
         case 3001:
            this.b.a($$1, axf.iy, axg.f, 64.0F, 0.8F + this.b.A.i() * 0.3F, false);
            break;
         case 3002:
            if ($$2 >= 0 && $$2 < jm.a.d.length) {
               bai.a(jm.a.d[$$2], this.b, $$1, 0.125, ls.aU, bst.a(10, 19));
            } else {
               bai.a(this.b, $$1, ls.aU, bst.a(3, 5));
            }
            break;
         case 3003:
            bai.a(this.b, $$1, ls.aS, bst.a(3, 5));
            this.b.a($$1, axf.mU, axg.e, 1.0F, 1.0F, false);
            break;
         case 3004:
            bai.a(this.b, $$1, ls.aT, bst.a(3, 5));
            break;
         case 3005:
            bai.a(this.b, $$1, ls.aV, bst.a(3, 5));
            break;
         case 3006:
            int $$36 = $$2 >> 6;
            if ($$36 > 0) {
               if ($$3.i() < 0.3F + (float)$$36 * 0.1F) {
                  float $$37 = 0.15F + 0.02F * (float)$$36 * (float)$$36 * $$3.i();
                  float $$38 = 0.4F + 0.3F * (float)$$36 * $$3.i();
                  this.b.a($$1, axf.wo, axg.e, $$37, $$38, false);
               }

               byte $$39 = (byte)($$2 & 63);
               bsn $$40 = bst.a(0, $$36);
               float $$41 = 0.005F;
               Supplier<fbx> $$42 = () -> new fbx(bae.a($$3, -0.005F, 0.005F), bae.a($$3, -0.005F, 0.005F), bae.a($$3, -0.005F, 0.005F));
               if ($$39 == 0) {
                  for (jm $$43 : jm.values()) {
                     float $$44 = $$43 == jm.a ? (float) Math.PI : 0.0F;
                     double $$45 = $$43.o() == jm.a.b ? 0.65 : 0.57;
                     bai.a(this.b, $$1, new lu($$44), $$40, $$43, $$42, $$45);
                  }
               } else {
                  for (jm $$46 : dpn.a($$39)) {
                     float $$47 = $$46 == jm.b ? (float) Math.PI : 0.0F;
                     double $$48 = 0.35;
                     bai.a(this.b, $$1, new lu($$47), $$40, $$46, $$42, 0.35);
                  }
               }
            } else {
               this.b.a($$1, axf.wo, axg.e, 1.0F, 1.0F, false);
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
               this.b.a(new lv($$57 * 5), false, (double)$$1.u() + 0.5, (double)$$1.v() + dri.f, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            }

            dxu $$58 = this.b.a_($$1);
            boolean $$59 = $$58.b(dyk.D) && $$58.c(dyk.D);
            if (!$$59) {
               this.b.a((double)$$1.u() + 0.5, (double)$$1.v() + dri.f, (double)$$1.w() + 0.5, axf.wL, axg.e, 2.0F, 0.6F + this.b.A.i() * 0.4F, false);
            }
            break;
         case 3008:
            dxu $$25 = dkl.a($$2);
            if ($$25.b() instanceof dkr $$26) {
               this.b.a($$1, $$26.d(), axg.h, 1.0F, 1.0F, false);
            }

            this.b.a($$1, $$25);
            break;
         case 3009:
            bai.a(this.b, $$1, ls.aX, bst.a(3, 6));
            break;
         case 3011:
            dww.a(this.b, $$1, $$3, dww.a.a($$2).c);
            break;
         case 3012:
            this.b.a($$1, axf.mu, axg.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dww.a(this.b, $$1, $$3, dww.a.a($$2).c);
            break;
         case 3013:
            this.b.a($$1, axf.my, axg.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dww.a(this.b, $$1, $$3, $$2, ls.aZ);
            break;
         case 3014:
            this.b.a($$1, axf.mE, axg.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dww.b(this.b, $$1, $$3);
            break;
         case 3015:
            if (this.b.c_($$1) instanceof dxc $$31) {
               dxc.a.a(this.b, $$31.aB_(), $$31.m(), $$31.c(), $$2 == 0 ? ls.aK : ls.L);
               this.b.a($$1, axf.AZ, axg.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            }
            break;
         case 3016:
            dxc.a.a(this.b, $$1, $$2 == 0 ? ls.aK : ls.L);
            this.b.a($$1, axf.Bd, axg.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            break;
         case 3017:
            dww.b(this.b, $$1, $$3);
            break;
         case 3018:
            for (int $$32 = 0; $$32 < 10; $$32++) {
               double $$33 = $$3.k() * 0.02;
               double $$34 = $$3.k() * 0.02;
               double $$35 = $$3.k() * 0.02;
               this.b.a(ls.ac, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), $$33, $$34, $$35);
            }

            this.b.a($$1, axf.fm, axg.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            break;
         case 3019:
            this.b.a($$1, axf.my, axg.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dww.a(this.b, $$1, $$3, $$2, ls.ba);
            break;
         case 3020:
            this.b.a($$1, axf.mz, axg.e, $$2 == 0 ? 0.3F : 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dww.a(this.b, $$1, $$3, 0, ls.ba);
            dww.a(this.b, $$1, $$3);
            break;
         case 3021:
            this.b.a($$1, axf.mw, axg.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dww.a(this.b, $$1, $$3, dww.a.a($$2).c);
      }
   }

   private void a(int $$0, jh $$1, bam $$2, lw $$3) {
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

   private void a(jq<cxu> $$0, jh $$1) {
      this.a($$1);
      cxu $$2 = $$0.a();
      axe $$3 = $$2.b().a();
      hfh $$4 = hfc.a($$3, fbx.b($$1));
      this.d.put($$1, $$4);
      this.a.ak().a($$4);
      this.a.m.a($$2.c());
      this.a(this.b, $$1, true);
   }

   private void a(jh $$0) {
      hfh $$1 = this.d.remove($$0);
      if ($$1 != null) {
         this.a.ak().b($$1);
      }
   }

   private void b(jh $$0) {
      this.a($$0);
      this.a(this.b, $$0, false);
   }

   private void a(dhh $$0, jh $$1, boolean $$2) {
      for (bwf $$4 : $$0.a(bwf.class, new fbs($$1).g(3.0))) {
         $$4.a($$1, $$2);
      }
   }
}
