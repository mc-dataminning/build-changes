import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class tw {
   private static final Logger d = LogUtils.getLogger();
   public static final int a = 10;
   public static final String b = "gameteststructures";
   public static String c = "gameteststructures";

   public static dpd a(int $$0) {
      switch ($$0) {
         case 0:
            return dpd.a;
         case 1:
            return dpd.b;
         case 2:
            return dpd.c;
         case 3:
            return dpd.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(dpd $$0) {
      switch ($$0) {
         case a:
            return 0;
         case b:
            return 1;
         case c:
            return 2;
         case d:
            return 3;
         default:
            throw new IllegalArgumentException("Unknown rotation value, don't know how many steps it represents: " + $$0);
      }
   }

   public static ezt a(dup $$0) {
      return ezt.a(b($$0));
   }

   public static ema b(dup $$0) {
      jh $$1 = c($$0);
      jh $$2 = a($$1, $$0.j(), $$0.t());
      return ema.a($$1, $$2);
   }

   public static jh c(dup $$0) {
      return $$0.aA_().a((kl)$$0.f());
   }

   public static void a(jh $$0, jh $$1, dpd $$2, arp $$3) {
      jh $$4 = eqk.a($$0.a((kl)$$1), dnm.a, $$2, $$0);
      $$3.b($$4, dis.fN.m());
      dti $$5 = (dti)$$3.c_($$4);
      $$5.b().a("test runclosest");
      jh $$6 = eqk.a($$4.b(0, 0, -1), dnm.a, $$2, $$4);
      $$3.b($$6, dis.dM.m().a($$2));
   }

   public static void a(String $$0, jh $$1, kl $$2, dpd $$3, arp $$4) {
      ema $$5 = b($$1.d(), $$2, $$3);
      a($$5, $$4);
      $$4.b($$1, dis.pa.m());
      dup $$6 = (dup)$$4.c_($$1);
      $$6.a(false);
      $$6.a(alj.a($$0));
      $$6.b($$0);
      $$6.a($$2);
      $$6.a(dxe.a);
      $$6.e(true);
   }

   public static jh a(tg $$0, jh $$1, dpd $$2, arp $$3) {
      kl $$4 = $$3.r().b(alj.a($$0.t())).orElseThrow(() -> new IllegalStateException("Missing test structure: " + $$0.t())).a();
      jh $$5;
      if ($$2 == dpd.a) {
         $$5 = $$1;
      } else if ($$2 == dpd.b) {
         $$5 = $$1.b($$4.w() - 1, 0, 0);
      } else if ($$2 == dpd.c) {
         $$5 = $$1.b($$4.u() - 1, 0, $$4.w() - 1);
      } else {
         if ($$2 != dpd.d) {
            throw new IllegalArgumentException("Invalid rotation: " + $$2);
         }

         $$5 = $$1.b(0, 0, $$4.u() - 1);
      }

      return $$5;
   }

   public static dup b(tg $$0, jh $$1, dpd $$2, arp $$3) {
      kl $$4 = $$3.r().b(alj.a($$0.t())).orElseThrow(() -> new IllegalStateException("Missing test structure: " + $$0.t())).a();
      ema $$5 = b($$1, $$4, $$2);
      jh $$6 = a($$0, $$1, $$2, $$3);
      b($$5, $$3);
      a($$5, $$3);
      return c($$0, $$6.e(), $$2, $$3);
   }

   public static void a(ezt $$0, arp $$1, boolean $$2) {
      jh $$3 = jh.a($$0.a, $$0.b, $$0.c).b(-1, 0, -1);
      jh $$4 = jh.a($$0.d, $$0.e, $$0.f);
      jh.d($$3, $$4).forEach($$4x -> {
         boolean $$5 = $$4x.u() == $$3.u() || $$4x.u() == $$4.u() || $$4x.w() == $$3.w() || $$4x.w() == $$4.w();
         boolean $$6 = $$4x.v() == $$4.v();
         if ($$5 || $$6 && $$2) {
            $$1.b($$4x, dis.hW.m());
         }
      });
   }

   public static void a(ezt $$0, arp $$1) {
      jh $$2 = jh.a($$0.a, $$0.b, $$0.c).b(-1, 0, -1);
      jh $$3 = jh.a($$0.d, $$0.e, $$0.f);
      jh.d($$2, $$3).forEach($$3x -> {
         boolean $$4 = $$3x.u() == $$2.u() || $$3x.u() == $$3.u() || $$3x.w() == $$2.w() || $$3x.w() == $$3.w();
         boolean $$5 = $$3x.v() == $$3.v();
         if ($$1.a_($$3x).a(dis.hW) && ($$4 || $$5)) {
            $$1.b($$3x, dis.a.m());
         }
      });
   }

   private static void b(ema $$0, arp $$1) {
      $$0.b().forEach($$1x -> $$1.a($$1x.g, $$1x.h, true));
   }

   public static void a(ema $$0, arp $$1) {
      int $$2 = $$0.i() - 1;
      ema $$3 = new ema($$0.h() - 2, $$0.i() - 3, $$0.j() - 3, $$0.k() + 3, $$0.l() + 20, $$0.m() + 3);
      jh.a($$3).forEach($$2x -> a($$2, $$2x, $$1));
      $$1.n().a($$3);
      $$1.a($$3);
      ezt $$4 = ezt.a($$3);
      List<bul> $$5 = $$1.a(bul.class, $$4, $$0x -> !($$0x instanceof cou));
      $$5.forEach(bul::at);
   }

   public static jh a(jh $$0, kl $$1, dpd $$2) {
      jh $$3 = $$0.a($$1).b(-1, -1, -1);
      return eqk.a($$3, dnm.a, $$2, $$0);
   }

   public static ema b(jh $$0, kl $$1, dpd $$2) {
      jh $$3 = a($$0, $$1, $$2);
      ema $$4 = ema.a($$0, $$3);
      int $$5 = Math.min($$4.h(), $$4.k());
      int $$6 = Math.min($$4.j(), $$4.m());
      return $$4.a($$0.u() - $$5, 0, $$0.w() - $$6);
   }

   public static Optional<jh> a(jh $$0, int $$1, arp $$2) {
      return c($$0, $$1, $$2).filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   public static Optional<jh> b(jh $$0, int $$1, arp $$2) {
      Comparator<jh> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      return c($$0, $$1, $$2).min($$3);
   }

   public static Stream<jh> a(jh $$0, int $$1, arp $$2, String $$3) {
      return c($$0, $$1, $$2).map($$1x -> (dup)$$2.c_($$1x)).filter(Objects::nonNull).filter($$1x -> Objects.equals($$1x.c(), $$3)).map(dsy::aA_).map(jh::j);
   }

   public static Stream<jh> c(jh $$0, int $$1, arp $$2) {
      ema $$3 = d($$0, $$1, $$2);
      return jh.a($$3).filter($$1x -> $$2.a_($$1x).a(dis.pa)).map(jh::j);
   }

   private static dup c(tg $$0, jh $$1, dpd $$2, arp $$3) {
      $$3.b($$1, dis.pa.m());
      dup $$4 = (dup)$$3.c_($$1);
      $$4.a(dxe.b);
      $$4.a($$2);
      $$4.a(false);
      $$4.a(alj.a($$0.t()));
      $$4.b($$0.b());
      if (!$$4.b($$3)) {
         throw new RuntimeException("Failed to load structure info for test: " + $$0.b() + ". Structure name: " + $$0.t());
      } else {
         return $$4;
      }
   }

   private static ema d(jh $$0, int $$1, arp $$2) {
      jh $$3 = jh.a((double)$$0.u(), (double)$$2.a(ebq.a.b, $$0).v(), (double)$$0.w());
      return new ema($$3).c($$1, 10, $$1);
   }

   public static Stream<jh> a(jh $$0, bul $$1, arp $$2) {
      int $$3 = 200;
      ezy $$4 = $$1.bF();
      ezy $$5 = $$4.e($$1.bT().c(200.0));
      return c($$0, 200, $$2)
         .map($$1x -> $$2.a($$1x, dta.u))
         .flatMap(Optional::stream)
         .filter($$2x -> a($$2x).b($$4, $$5).isPresent())
         .map(dsy::aA_)
         .sorted(Comparator.comparing($$0::j))
         .limit(1L);
   }

   private static void a(int $$0, jh $$1, arp $$2) {
      dvv $$3;
      if ($$1.v() < $$0) {
         $$3 = dis.b.m();
      } else {
         $$3 = dis.a.m();
      }

      gn $$5 = new gn($$3, Collections.emptySet(), null);
      $$5.a($$2, $$1, 2);
      $$2.b($$1, $$3.b());
   }

   private static boolean a(jh $$0, jh $$1, arp $$2) {
      dup $$3 = (dup)$$2.c_($$0);
      return b($$3).b($$1);
   }
}
