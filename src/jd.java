import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface jd {
   Map<String, jd.a> a = new Object2ObjectArrayMap();
   Codec<jd.a> b = atw.a(jd.a::a, a::get);
   jd.a c = a("empty");
   jd.a d = a("water");
   jd.a e = a("lava");
   jd.a f = a("powder_snow");
   jd g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cws.fu.o().a(day.g, Integer.valueOf(3)), ars.cE);
   jd h = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cws.fv.o(), ars.cH);
   jd i = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cws.fw.o().a(day.g, Integer.valueOf(3)), ars.cI);
   jd j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      cwq $$6 = cwq.a($$5.d());
      if (!($$6 instanceof ddo)) {
         return bkb.d;
      } else {
         if (!$$1.B) {
            cmy $$7 = new cmy(cws.kP);
            if ($$5.u()) {
               $$7.c($$5.v().h());
            }

            $$3.a($$4, $$7);
            $$3.a(asc.Z);
            day.d($$0, $$1, $$2);
         }

         return bkb.a($$1.B);
      }
   };
   jd k = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (dgl.c($$5) <= 0) {
         return bkb.d;
      } else {
         if (!$$1.B) {
            cmy $$6 = $$5.c(1);
            dgl.d($$6);
            if (!$$3.fT().d) {
               $$5.h(1);
            }

            if ($$5.b()) {
               $$3.a($$4, $$6);
            } else if ($$3.fS().e($$6)) {
               $$3.bR.b();
            } else {
               $$3.a($$6, false);
            }

            $$3.a(asc.Y);
            day.d($$0, $$1, $$2);
         }

         return bkb.a($$1.B);
      }
   };
   jd l = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!($$5.d() instanceof clq $$7)) {
         return bkb.d;
      } else if (!$$7.a($$5)) {
         return bkb.d;
      } else {
         if (!$$1.B) {
            $$7.f_($$5);
            $$3.a(asc.X);
            day.d($$0, $$1, $$2);
         }

         return bkb.a($$1.B);
      }
   };

   static jd.a a(String $$0) {
      Object2ObjectOpenHashMap<cmt, jd> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((jd)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bkb.d);
      jd.a $$2 = new jd.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bkb interact(djh var1, ctp var2, hx var3, cfi var4, bka var5, cmy var6);

   static void a() {
      Map<cmt, jd> $$0 = c.b();
      a($$0);
      $$0.put(cnb.sh, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (coy.d($$5) != coz.c) {
            return bkb.d;
         } else {
            if (!$$1x.B) {
               cmt $$6 = $$5.d();
               $$3x.a($$4, cna.a($$5, $$3x, new cmy(cnb.si)));
               $$3x.a(asc.W);
               $$3x.b(asc.c.b($$6));
               $$1x.b($$2x, cws.fu.o());
               $$1x.a(null, $$2x, ars.ch, art.e, 1.0F, 1.0F);
               $$1x.a(null, dnr.z, $$2x);
            }

            return bkb.a($$1x.B);
         }
      });
      Map<cmt, jd> $$1 = d.b();
      a($$1);
      $$1.put(cnb.qv, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cmy(cnb.qw), $$0xx -> $$0xx.c(day.g) == 3, ars.cK));
      $$1.put(cnb.si, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.B) {
            cmt $$6 = $$5.d();
            $$3x.a($$4, cna.a($$5, $$3x, coy.a(new cmy(cnb.sh), coz.c)));
            $$3x.a(asc.W);
            $$3x.b(asc.c.b($$6));
            day.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, ars.ci, art.e, 1.0F, 1.0F);
            $$1x.a(null, dnr.y, $$2x);
         }

         return bkb.a($$1x.B);
      });
      $$1.put(cnb.sh, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(day.g) != 3 && coy.d($$5) == coz.c) {
            if (!$$1x.B) {
               $$3x.a($$4, cna.a($$5, $$3x, new cmy(cnb.si)));
               $$3x.a(asc.W);
               $$3x.b(asc.c.b($$5.d()));
               $$1x.b($$2x, $$0x.a(day.g));
               $$1x.a(null, $$2x, ars.ch, art.e, 1.0F, 1.0F);
               $$1x.a(null, dnr.z, $$2x);
            }

            return bkb.a($$1x.B);
         } else {
            return bkb.d;
         }
      });
      $$1.put(cnb.py, l);
      $$1.put(cnb.px, l);
      $$1.put(cnb.pw, l);
      $$1.put(cnb.pv, l);
      $$1.put(cnb.uC, l);
      $$1.put(cnb.uI, k);
      $$1.put(cnb.uP, k);
      $$1.put(cnb.uX, k);
      $$1.put(cnb.uT, k);
      $$1.put(cnb.uU, k);
      $$1.put(cnb.uR, k);
      $$1.put(cnb.uV, k);
      $$1.put(cnb.uL, k);
      $$1.put(cnb.uQ, k);
      $$1.put(cnb.uN, k);
      $$1.put(cnb.uK, k);
      $$1.put(cnb.uJ, k);
      $$1.put(cnb.uO, k);
      $$1.put(cnb.uS, k);
      $$1.put(cnb.uW, k);
      $$1.put(cnb.uM, k);
      $$1.put(cnb.jc, j);
      $$1.put(cnb.jj, j);
      $$1.put(cnb.jr, j);
      $$1.put(cnb.jn, j);
      $$1.put(cnb.jo, j);
      $$1.put(cnb.jl, j);
      $$1.put(cnb.jp, j);
      $$1.put(cnb.jf, j);
      $$1.put(cnb.jk, j);
      $$1.put(cnb.jh, j);
      $$1.put(cnb.je, j);
      $$1.put(cnb.jd, j);
      $$1.put(cnb.ji, j);
      $$1.put(cnb.jm, j);
      $$1.put(cnb.jq, j);
      $$1.put(cnb.jg, j);
      Map<cmt, jd> $$2 = e.b();
      $$2.put(cnb.qv, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cmy(cnb.qx), $$0xx -> true, ars.cN));
      a($$2);
      Map<cmt, jd> $$3 = f.b();
      $$3.put(cnb.qv, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cmy(cnb.qy), $$0xx -> $$0xx.c(day.g) == 3, ars.cO));
      a($$3);
   }

   static void a(Map<cmt, jd> $$0) {
      $$0.put(cnb.qx, h);
      $$0.put(cnb.qw, g);
      $$0.put(cnb.qy, i);
   }

   static bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, cmy $$5, cmy $$6, Predicate<djh> $$7, arr $$8) {
      if (!$$7.test($$0)) {
         return bkb.d;
      } else {
         if (!$$1.B) {
            cmt $$9 = $$5.d();
            $$3.a($$4, cna.a($$5, $$3, $$6));
            $$3.a(asc.W);
            $$3.b(asc.c.b($$9));
            $$1.b($$2, cws.ft.o());
            $$1.a(null, $$2, $$8, art.e, 1.0F, 1.0F);
            $$1.a(null, dnr.y, $$2);
         }

         return bkb.a($$1.B);
      }
   }

   static bkb a(ctp $$0, hx $$1, cfi $$2, bka $$3, cmy $$4, djh $$5, arr $$6) {
      if (!$$0.B) {
         cmt $$7 = $$4.d();
         $$2.a($$3, cna.a($$4, $$2, new cmy(cnb.qv)));
         $$2.a(asc.V);
         $$2.b(asc.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, art.e, 1.0F, 1.0F);
         $$0.a(null, dnr.z, $$1);
      }

      return bkb.a($$0.B);
   }

   public static record a(String a, Map<cmt, jd> b) {
   }
}
