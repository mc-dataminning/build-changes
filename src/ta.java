import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class ta {
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "gameteststructures";
   public static String b = "gameteststructures";

   public static dit a(int $$0) {
      switch ($$0) {
         case 0:
            return dit.a;
         case 1:
            return dit.b;
         case 2:
            return dit.c;
         case 3:
            return dit.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(dit $$0) {
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

   public static ese a(dod $$0) {
      return ese.a(b($$0));
   }

   public static efi b(dod $$0) {
      id $$1 = c($$0);
      id $$2 = a($$1, $$0.j(), $$0.l());
      return efi.a($$1, $$2);
   }

   public static id c(dod $$0) {
      return $$0.az_().a((ji)$$0.f());
   }

   public static void a(id $$0, id $$1, dit $$2, apu $$3) {
      id $$4 = ejq.a($$0.a((ji)$$1), dhd.a, $$2, $$0);
      $$3.b($$4, dcj.fN.n());
      dmy $$5 = (dmy)$$3.c_($$4);
      $$5.b().a("test runclosest");
      id $$6 = ejq.a($$4.b(0, 0, -1), dhd.a, $$2, $$4);
      $$3.b($$6, dcj.dM.n().a($$2));
   }

   public static void a(String $$0, id $$1, ji $$2, dit $$3, apu $$4) {
      efi $$5 = b($$1.c(), $$2, $$3);
      a($$5, $$4);
      $$4.b($$1, dcj.pa.n());
      dod $$6 = (dod)$$4.c_($$1);
      $$6.a(false);
      $$6.a(new ajv($$0));
      $$6.a($$2);
      $$6.a(dqs.a);
      $$6.e(true);
   }

   public static dod a(sk $$0, id $$1, dit $$2, apu $$3) {
      ji $$4 = $$3.q().b(new ajv($$0.s())).orElseThrow(() -> new IllegalStateException("Missing test structure: " + $$0.s())).a();
      efi $$5 = b($$1, $$4, $$2);
      id $$6;
      if ($$2 == dit.a) {
         $$6 = $$1;
      } else if ($$2 == dit.b) {
         $$6 = $$1.b($$4.w() - 1, 0, 0);
      } else if ($$2 == dit.c) {
         $$6 = $$1.b($$4.u() - 1, 0, $$4.w() - 1);
      } else {
         if ($$2 != dit.d) {
            throw new IllegalArgumentException("Invalid rotation: " + $$2);
         }

         $$6 = $$1.b(0, 0, $$4.u() - 1);
      }

      b($$5, $$3);
      a($$5, $$3);
      return b($$0, $$6.d(), $$2, $$3);
   }

   public static void a(ese $$0, apu $$1, boolean $$2) {
      id $$3 = id.a($$0.a, $$0.b, $$0.c).b(-1, 1, -1);
      id $$4 = id.a($$0.d, $$0.e, $$0.f);
      id.b($$3, $$4).forEach($$4x -> {
         boolean $$5 = $$4x.u() == $$3.u() || $$4x.u() == $$4.u() || $$4x.w() == $$3.w() || $$4x.w() == $$4.w();
         boolean $$6 = $$4x.v() == $$4.v();
         if ($$5 || $$6 && $$2) {
            $$1.b($$4x, dcj.hW.n());
         }
      });
   }

   public static void a(ese $$0, apu $$1) {
      id $$2 = id.a($$0.a, $$0.b, $$0.c).b(-1, 1, -1);
      id $$3 = id.a($$0.d, $$0.e, $$0.f);
      id.b($$2, $$3).forEach($$3x -> {
         boolean $$4 = $$3x.u() == $$2.u() || $$3x.u() == $$3.u() || $$3x.w() == $$2.w() || $$3x.w() == $$3.w();
         boolean $$5 = $$3x.v() == $$3.v();
         if ($$1.a_($$3x).a(dcj.hW) && ($$4 || $$5)) {
            $$1.b($$3x, dcj.a.n());
         }
      });
   }

   private static void b(efi $$0, apu $$1) {
      $$0.b().forEach($$1x -> $$1.a($$1x.e, $$1x.f, true));
   }

   public static void a(efi $$0, apu $$1) {
      int $$2 = $$0.i() - 1;
      efi $$3 = new efi($$0.h() - 2, $$0.i() - 3, $$0.j() - 3, $$0.k() + 3, $$0.l() + 20, $$0.m() + 3);
      id.a($$3).forEach($$2x -> a($$2, $$2x, $$1));
      $$1.m().a($$3);
      $$1.a($$3);
      ese $$4 = new ese((double)$$3.h(), (double)$$3.i(), (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), (double)$$3.m());
      List<bqa> $$5 = $$1.a(bqa.class, $$4, $$0x -> !($$0x instanceof cka));
      $$5.forEach(bqa::am);
   }

   public static id a(id $$0, ji $$1, dit $$2) {
      id $$3 = $$0.a($$1).b(-1, -1, -1);
      return ejq.a($$3, dhd.a, $$2, $$0);
   }

   public static efi b(id $$0, ji $$1, dit $$2) {
      id $$3 = a($$0, $$1, $$2);
      efi $$4 = efi.a($$0, $$3);
      int $$5 = Math.min($$4.h(), $$4.k());
      int $$6 = Math.min($$4.j(), $$4.m());
      return $$4.a($$0.u() - $$5, 0, $$0.w() - $$6);
   }

   public static Optional<id> a(id $$0, int $$1, apu $$2) {
      return c($$0, $$1, $$2).filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   public static Optional<id> b(id $$0, int $$1, apu $$2) {
      Comparator<id> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      return c($$0, $$1, $$2).min($$3);
   }

   public static Stream<id> c(id $$0, int $$1, apu $$2) {
      efi $$3 = new efi($$0).a($$1);
      return id.a($$3).filter($$1x -> $$2.a_($$1x).a(dcj.pa)).map(id::i);
   }

   private static dod b(sk $$0, id $$1, dit $$2, apu $$3) {
      $$3.b($$1, dcj.pa.n());
      dod $$4 = (dod)$$3.c_($$1);
      $$4.a(dqs.b);
      $$4.a($$2);
      $$4.a(false);
      $$4.a(new ajv($$0.s()));
      $$4.b($$0.b());
      if (!$$4.b($$3)) {
         throw new RuntimeException("Failed to load structure info for test: " + $$0.b() + ". Structure name: " + $$0.s());
      } else {
         return $$4;
      }
   }

   public static Stream<id> a(int $$0, esj $$1, apu $$2) {
      id $$3 = id.a($$1.c, (double)$$2.a(dva.a.b, id.a($$1)).v(), $$1.e);
      id $$4 = $$3.b(-$$0, 0, -$$0);
      id $$5 = $$3.b($$0, 0, $$0);
      return id.b($$4, $$5).filter($$1x -> $$2.a_($$1x).a(dcj.pa));
   }

   public static Stream<id> a(id $$0, bqa $$1, apu $$2) {
      int $$3 = 200;
      esj $$4 = $$1.bu();
      esj $$5 = $$4.e($$1.bI().a(200.0));
      return c($$0, 200, $$2)
         .map($$1x -> $$2.a($$1x, dmq.u))
         .flatMap(Optional::stream)
         .filter($$2x -> a($$2x).b($$4, $$5).isPresent())
         .map(dmo::az_)
         .sorted(Comparator.comparing($$0::j))
         .limit(1L);
   }

   private static void a(int $$0, id $$1, apu $$2) {
      dpi $$3;
      if ($$1.v() < $$0) {
         $$3 = dcj.b.n();
      } else {
         $$3 = dcj.a.n();
      }

      fl $$5 = new fl($$3, Collections.emptySet(), null);
      $$5.a($$2, $$1, 2);
      $$2.b($$1, $$3.b());
   }

   private static boolean a(id $$0, id $$1, apu $$2) {
      dod $$3 = (dod)$$2.c_($$0);
      return b($$3).b($$1);
   }
}
