import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface ji {
   Map<String, ji.a> a = new Object2ObjectArrayMap();
   Codec<ji.a> b = awe.a(ji.a::a, a::get);
   ji.a c = a("empty");
   ji.a d = a("water");
   ji.a e = a("lava");
   ji.a f = a("powder_snow");
   ji g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dae.fu.o().a(dek.g, Integer.valueOf(3)), aty.db);
   ji h = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dae.fv.o(), aty.de);
   ji i = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dae.fw.o().a(dek.g, Integer.valueOf(3)), aty.df);
   ji j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      dac $$6 = dac.a($$5.d());
      if (!($$6 instanceof dha)) {
         return bnf.d;
      } else {
         if (!$$1.B) {
            $$3.a($$4, $$5.a(dae.kP, 1));
            $$3.a(aui.Z);
            dek.d($$0, $$1, $$2);
         }

         return bnf.a($$1.B);
      }
   };
   ji k = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (djy.c($$5) <= 0) {
         return bnf.d;
      } else {
         if (!$$1.B) {
            cqm $$6 = $$5.c(1);
            djy.d($$6);
            $$5.a(1, $$3);
            if ($$5.b()) {
               $$3.a($$4, $$6);
            } else if ($$3.fZ().e($$6)) {
               $$3.bY.b();
            } else {
               $$3.a($$6, false);
            }

            $$3.a(aui.Y);
            dek.d($$0, $$1, $$2);
         }

         return bnf.a($$1.B);
      }
   };
   ji l = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!$$5.a(auv.ba)) {
         return bnf.d;
      } else if (!cpf.a($$5)) {
         return bnf.d;
      } else {
         if (!$$1.B) {
            cpf.c($$5);
            $$3.a(aui.X);
            dek.d($$0, $$1, $$2);
         }

         return bnf.a($$1.B);
      }
   };

   static ji.a a(String $$0) {
      Object2ObjectOpenHashMap<cqh, ji> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((ji)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bnf.d);
      ji.a $$2 = new ji.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bnf interact(dnb var1, cxb var2, ib var3, ciu var4, bnc var5, cqm var6);

   static void a() {
      Map<cqh, ji> $$0 = c.b();
      a($$0);
      $$0.put(cqp.sj, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!csl.d($$5).a(csm.c)) {
            return bnf.d;
         } else {
            if (!$$1x.B) {
               cqh $$6 = $$5.d();
               $$3x.a($$4, cqo.a($$5, $$3x, new cqm(cqp.sk)));
               $$3x.a(aui.W);
               $$3x.b(aui.c.b($$6));
               $$1x.b($$2x, dae.fu.o());
               $$1x.a(null, $$2x, aty.cA, atz.e, 1.0F, 1.0F);
               $$1x.a(null, drp.z, $$2x);
            }

            return bnf.a($$1x.B);
         }
      });
      Map<cqh, ji> $$1 = d.b();
      a($$1);
      $$1.put(cqp.qx, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cqm(cqp.qy), $$0xx -> $$0xx.c(dek.g) == 3, aty.dh));
      $$1.put(cqp.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.B) {
            cqh $$6 = $$5.d();
            $$3x.a($$4, cqo.a($$5, $$3x, csl.a(new cqm(cqp.sj), csm.c)));
            $$3x.a(aui.W);
            $$3x.b(aui.c.b($$6));
            dek.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, aty.cB, atz.e, 1.0F, 1.0F);
            $$1x.a(null, drp.y, $$2x);
         }

         return bnf.a($$1x.B);
      });
      $$1.put(cqp.sj, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dek.g) != 3 && csl.d($$5).a(csm.c)) {
            if (!$$1x.B) {
               $$3x.a($$4, cqo.a($$5, $$3x, new cqm(cqp.sk)));
               $$3x.a(aui.W);
               $$3x.b(aui.c.b($$5.d()));
               $$1x.b($$2x, $$0x.a(dek.g));
               $$1x.a(null, $$2x, aty.cA, atz.e, 1.0F, 1.0F);
               $$1x.a(null, drp.z, $$2x);
            }

            return bnf.a($$1x.B);
         } else {
            return bnf.d;
         }
      });
      $$1.put(cqp.pA, l);
      $$1.put(cqp.pz, l);
      $$1.put(cqp.py, l);
      $$1.put(cqp.px, l);
      $$1.put(cqp.uH, l);
      $$1.put(cqp.uN, k);
      $$1.put(cqp.uU, k);
      $$1.put(cqp.vc, k);
      $$1.put(cqp.uY, k);
      $$1.put(cqp.uZ, k);
      $$1.put(cqp.uW, k);
      $$1.put(cqp.va, k);
      $$1.put(cqp.uQ, k);
      $$1.put(cqp.uV, k);
      $$1.put(cqp.uS, k);
      $$1.put(cqp.uP, k);
      $$1.put(cqp.uO, k);
      $$1.put(cqp.uT, k);
      $$1.put(cqp.uX, k);
      $$1.put(cqp.vb, k);
      $$1.put(cqp.uR, k);
      $$1.put(cqp.jc, j);
      $$1.put(cqp.jj, j);
      $$1.put(cqp.jr, j);
      $$1.put(cqp.jn, j);
      $$1.put(cqp.jo, j);
      $$1.put(cqp.jl, j);
      $$1.put(cqp.jp, j);
      $$1.put(cqp.jf, j);
      $$1.put(cqp.jk, j);
      $$1.put(cqp.jh, j);
      $$1.put(cqp.je, j);
      $$1.put(cqp.jd, j);
      $$1.put(cqp.ji, j);
      $$1.put(cqp.jm, j);
      $$1.put(cqp.jq, j);
      $$1.put(cqp.jg, j);
      Map<cqh, ji> $$2 = e.b();
      $$2.put(cqp.qx, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cqm(cqp.qz), $$0xx -> true, aty.dk));
      a($$2);
      Map<cqh, ji> $$3 = f.b();
      $$3.put(cqp.qx, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cqm(cqp.qA), $$0xx -> $$0xx.c(dek.g) == 3, aty.dl));
      a($$3);
   }

   static void a(Map<cqh, ji> $$0) {
      $$0.put(cqp.qz, h);
      $$0.put(cqp.qy, g);
      $$0.put(cqp.qA, i);
   }

   static bnf a(dnb $$0, cxb $$1, ib $$2, ciu $$3, bnc $$4, cqm $$5, cqm $$6, Predicate<dnb> $$7, atx $$8) {
      if (!$$7.test($$0)) {
         return bnf.d;
      } else {
         if (!$$1.B) {
            cqh $$9 = $$5.d();
            $$3.a($$4, cqo.a($$5, $$3, $$6));
            $$3.a(aui.W);
            $$3.b(aui.c.b($$9));
            $$1.b($$2, dae.ft.o());
            $$1.a(null, $$2, $$8, atz.e, 1.0F, 1.0F);
            $$1.a(null, drp.y, $$2);
         }

         return bnf.a($$1.B);
      }
   }

   static bnf a(cxb $$0, ib $$1, ciu $$2, bnc $$3, cqm $$4, dnb $$5, atx $$6) {
      if (!$$0.B) {
         cqh $$7 = $$4.d();
         $$2.a($$3, cqo.a($$4, $$2, new cqm(cqp.qx)));
         $$2.a(aui.V);
         $$2.b(aui.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, atz.e, 1.0F, 1.0F);
         $$0.a(null, drp.z, $$1);
      }

      return bnf.a($$0.B);
   }

   public static record a(String a, Map<cqh, ji> b) {
   }
}
