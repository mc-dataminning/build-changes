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
   ji g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dac.fu.o().a(dei.g, Integer.valueOf(3)), aty.cX);
   ji h = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dac.fv.o(), aty.da);
   ji i = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dac.fw.o().a(dei.g, Integer.valueOf(3)), aty.db);
   ji j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      daa $$6 = daa.a($$5.d());
      if (!($$6 instanceof dgy)) {
         return bne.d;
      } else {
         if (!$$1.B) {
            $$3.a($$4, $$5.a(dac.kP, 1));
            $$3.a(aui.Z);
            dei.d($$0, $$1, $$2);
         }

         return bne.a($$1.B);
      }
   };
   ji k = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (djw.c($$5) <= 0) {
         return bne.d;
      } else {
         if (!$$1.B) {
            cqk $$6 = $$5.c(1);
            djw.d($$6);
            $$5.a(1, $$3);
            if ($$5.b()) {
               $$3.a($$4, $$6);
            } else if ($$3.fZ().e($$6)) {
               $$3.bY.b();
            } else {
               $$3.a($$6, false);
            }

            $$3.a(aui.Y);
            dei.d($$0, $$1, $$2);
         }

         return bne.a($$1.B);
      }
   };
   ji l = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!$$5.a(auv.ba)) {
         return bne.d;
      } else if (!cpd.a($$5)) {
         return bne.d;
      } else {
         if (!$$1.B) {
            cpd.c($$5);
            $$3.a(aui.X);
            dei.d($$0, $$1, $$2);
         }

         return bne.a($$1.B);
      }
   };

   static ji.a a(String $$0) {
      Object2ObjectOpenHashMap<cqf, ji> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((ji)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bne.d);
      ji.a $$2 = new ji.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bne interact(dmz var1, cwz var2, ib var3, cis var4, bnb var5, cqk var6);

   static void a() {
      Map<cqf, ji> $$0 = c.b();
      a($$0);
      $$0.put(cqn.sj, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!csj.d($$5).a(csk.c)) {
            return bne.d;
         } else {
            if (!$$1x.B) {
               cqf $$6 = $$5.d();
               $$3x.a($$4, cqm.a($$5, $$3x, new cqk(cqn.sk)));
               $$3x.a(aui.W);
               $$3x.b(aui.c.b($$6));
               $$1x.b($$2x, dac.fu.o());
               $$1x.a(null, $$2x, aty.cw, atz.e, 1.0F, 1.0F);
               $$1x.a(null, drn.z, $$2x);
            }

            return bne.a($$1x.B);
         }
      });
      Map<cqf, ji> $$1 = d.b();
      a($$1);
      $$1.put(cqn.qx, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cqk(cqn.qy), $$0xx -> $$0xx.c(dei.g) == 3, aty.dd));
      $$1.put(cqn.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.B) {
            cqf $$6 = $$5.d();
            $$3x.a($$4, cqm.a($$5, $$3x, csj.a(new cqk(cqn.sj), csk.c)));
            $$3x.a(aui.W);
            $$3x.b(aui.c.b($$6));
            dei.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, aty.cx, atz.e, 1.0F, 1.0F);
            $$1x.a(null, drn.y, $$2x);
         }

         return bne.a($$1x.B);
      });
      $$1.put(cqn.sj, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dei.g) != 3 && csj.d($$5).a(csk.c)) {
            if (!$$1x.B) {
               $$3x.a($$4, cqm.a($$5, $$3x, new cqk(cqn.sk)));
               $$3x.a(aui.W);
               $$3x.b(aui.c.b($$5.d()));
               $$1x.b($$2x, $$0x.a(dei.g));
               $$1x.a(null, $$2x, aty.cw, atz.e, 1.0F, 1.0F);
               $$1x.a(null, drn.z, $$2x);
            }

            return bne.a($$1x.B);
         } else {
            return bne.d;
         }
      });
      $$1.put(cqn.pA, l);
      $$1.put(cqn.pz, l);
      $$1.put(cqn.py, l);
      $$1.put(cqn.px, l);
      $$1.put(cqn.uG, l);
      $$1.put(cqn.uM, k);
      $$1.put(cqn.uT, k);
      $$1.put(cqn.vb, k);
      $$1.put(cqn.uX, k);
      $$1.put(cqn.uY, k);
      $$1.put(cqn.uV, k);
      $$1.put(cqn.uZ, k);
      $$1.put(cqn.uP, k);
      $$1.put(cqn.uU, k);
      $$1.put(cqn.uR, k);
      $$1.put(cqn.uO, k);
      $$1.put(cqn.uN, k);
      $$1.put(cqn.uS, k);
      $$1.put(cqn.uW, k);
      $$1.put(cqn.va, k);
      $$1.put(cqn.uQ, k);
      $$1.put(cqn.jc, j);
      $$1.put(cqn.jj, j);
      $$1.put(cqn.jr, j);
      $$1.put(cqn.jn, j);
      $$1.put(cqn.jo, j);
      $$1.put(cqn.jl, j);
      $$1.put(cqn.jp, j);
      $$1.put(cqn.jf, j);
      $$1.put(cqn.jk, j);
      $$1.put(cqn.jh, j);
      $$1.put(cqn.je, j);
      $$1.put(cqn.jd, j);
      $$1.put(cqn.ji, j);
      $$1.put(cqn.jm, j);
      $$1.put(cqn.jq, j);
      $$1.put(cqn.jg, j);
      Map<cqf, ji> $$2 = e.b();
      $$2.put(cqn.qx, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cqk(cqn.qz), $$0xx -> true, aty.dg));
      a($$2);
      Map<cqf, ji> $$3 = f.b();
      $$3.put(cqn.qx, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cqk(cqn.qA), $$0xx -> $$0xx.c(dei.g) == 3, aty.dh));
      a($$3);
   }

   static void a(Map<cqf, ji> $$0) {
      $$0.put(cqn.qz, h);
      $$0.put(cqn.qy, g);
      $$0.put(cqn.qA, i);
   }

   static bne a(dmz $$0, cwz $$1, ib $$2, cis $$3, bnb $$4, cqk $$5, cqk $$6, Predicate<dmz> $$7, atx $$8) {
      if (!$$7.test($$0)) {
         return bne.d;
      } else {
         if (!$$1.B) {
            cqf $$9 = $$5.d();
            $$3.a($$4, cqm.a($$5, $$3, $$6));
            $$3.a(aui.W);
            $$3.b(aui.c.b($$9));
            $$1.b($$2, dac.ft.o());
            $$1.a(null, $$2, $$8, atz.e, 1.0F, 1.0F);
            $$1.a(null, drn.y, $$2);
         }

         return bne.a($$1.B);
      }
   }

   static bne a(cwz $$0, ib $$1, cis $$2, bnb $$3, cqk $$4, dmz $$5, atx $$6) {
      if (!$$0.B) {
         cqf $$7 = $$4.d();
         $$2.a($$3, cqm.a($$4, $$2, new cqk(cqn.qx)));
         $$2.a(aui.V);
         $$2.b(aui.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, atz.e, 1.0F, 1.0F);
         $$0.a(null, drn.z, $$1);
      }

      return bne.a($$0.B);
   }

   public static record a(String a, Map<cqf, ji> b) {
   }
}
