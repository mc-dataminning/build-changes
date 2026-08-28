import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class gop {
   private static final Map<akk, goq> a = Maps.newHashMap();
   private static final akk b = new akk("damaged");
   private static final akk c = new akk("damage");
   private static final gon d = ($$0x, $$1, $$2, $$3) -> $$0x.m() ? 1.0F : 0.0F;
   private static final gon e = ($$0x, $$1, $$2, $$3) -> aye.a((float)$$0x.n() / (float)$$0x.o(), 0.0F, 1.0F);
   private static final Map<ctv, Map<akk, goq>> f = Maps.newHashMap();

   private static gon a(akk $$0, gon $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(goq $$0) {
      a.put(new akk("custom_model_data"), $$0);
   }

   private static void a(ctv $$0, akk $$1, gon $$2) {
      f.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static goq a(cua $$0, akk $$1) {
      if ($$0.o() > 0) {
         if (c.equals($$1)) {
            return e;
         }

         if (b.equals($$1)) {
            return d;
         }
      }

      goq $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<akk, goq> $$3 = f.get($$0.g());
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(new akk("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fq() != bss.b ? 1.0F : 0.0F);
      a(new akk("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof cmh ? ((cmh)$$2).gt().a($$0x.g(), 0.0F) : 0.0F);
      gon $$0 = ($$0x, $$1, $$2, $$3) -> {
         cwe $$4 = $$0x.a(kn.K);
         return $$4 != null ? $$4.b().a().c() : Float.NEGATIVE_INFINITY;
      };
      a(nl.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> (float)$$0x.a(kn.o, cwp.a).a());
      a(cud.ou, new akk("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.ft() != $$0x ? 0.0F : (float)($$0x.a($$2) - $$2.fu()) / 20.0F;
         }
      });
      a(cud.xu, new akk("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.ft() == $$0x ? (float)($$2.fu() % 10) / 10.0F : 0.0F);
      a(cud.ou, new akk("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fr() && $$2.ft() == $$0x ? 1.0F : 0.0F);
      a(cud.qU, new akk("filled"), ($$0x, $$1, $$2, $$3) -> csh.c($$0x));
      a(cud.qW, new akk("time"), new gon() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cua $$0, @Nullable fyd $$1, @Nullable bsy $$2, int $$3) {
            bsd $$4 = (bsd)($$2 != null ? $$2 : $$0.E());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dP() instanceof fyd) {
                  $$1 = (fyd)$$4.dP();
               }

               if ($$1 == null) {
                  return 0.0F;
               } else {
                  double $$5;
                  if ($$1.D_().j()) {
                     $$5 = (double)$$1.f(1.0F);
                  } else {
                     $$5 = Math.random();
                  }

                  $$5 = this.a($$1, $$5);
                  return (float)$$5;
               }
            }
         }

         private double a(dcd $$0, double $$1) {
            if ($$0.Z() != this.c) {
               this.c = $$0.Z();
               double $$2 = $$1 - this.a;
               $$2 = aye.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = aye.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(cud.qS, new akk("angle"), new goo(($$0x, $$1, $$2) -> {
         cwx $$3 = $$1.a(kn.S);
         return $$3 != null ? $$3.a().orElse(null) : csj.a($$0x);
      }));
      a(cud.qT, new akk("angle"), new goo(($$0x, $$1, $$2) -> $$2 instanceof cmh $$3 ? $$3.gx().orElse(null) : null));
      a(cud.vW, new akk("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return csn.i($$0x) ? 0.0F : (float)($$0x.a($$2) - $$2.fu()) / (float)csn.b($$0x, $$2);
         }
      });
      a(cud.vW, new akk("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fr() && $$2.ft() == $$0x && !csn.i($$0x) ? 1.0F : 0.0F);
      a(cud.vW, new akk("charged"), ($$0x, $$1, $$2, $$3) -> csn.i($$0x) ? 1.0F : 0.0F);
      a(cud.vW, new akk("firework"), ($$0x, $$1, $$2, $$3) -> {
         cwn $$4 = $$0x.a(kn.E);
         return $$4 != null && $$4.a(cud.uu) ? 1.0F : 0.0F;
      });
      a(cud.nT, new akk("broken"), ($$0x, $$1, $$2, $$3) -> csw.i($$0x) ? 0.0F : 1.0F);
      a(cud.qV, new akk("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eT() == $$0x;
            boolean $$5 = $$2.eU() == $$0x;
            if ($$2.eT().g() instanceof cth) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cmh && ((cmh)$$2).cv != null ? 1.0F : 0.0F;
         }
      });
      a(cud.vs, new akk("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fr() && $$2.ft() == $$0x ? 1.0F : 0.0F);
      a(cud.vS, new akk("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fr() && $$2.ft() == $$0x ? 1.0F : 0.0F);
      a(cud.hC, new akk("level"), ($$0x, $$1, $$2, $$3) -> {
         cwk $$4 = $$0x.a(kn.ab, cwk.a);
         Integer $$5 = $$4.a(djt.c);
         return $$5 != null ? (float)$$5.intValue() / 16.0F : 1.0F;
      });
      a(cud.wh, new akk("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fr() && $$2.ft() == $$0x ? 1.0F : 0.0F);
   }
}
