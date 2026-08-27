import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class rn {
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "gameteststructures";
   public static String b = "gameteststructures";

   public static dbm a(int $$0) {
      switch ($$0) {
         case 0:
            return dbm.a;
         case 1:
            return dbm.b;
         case 2:
            return dbm.c;
         case 3:
            return dbm.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(dbm $$0) {
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

   public static ejp a(dgr $$0) {
      return ejp.a(b($$0));
   }

   public static dwz b(dgr $$0) {
      ht $$1 = c($$0);
      ht $$2 = a($$1, $$0.j(), $$0.w());
      return dwz.a($$1, $$2);
   }

   public static ht c(dgr $$0) {
      return $$0.p().a((iw)$$0.i());
   }

   public static void a(ht $$0, ht $$1, dbm $$2, ame $$3) {
      ht $$4 = ebh.a($$0.a((iw)$$1), czw.a, $$2, $$0);
      $$3.b($$4, cvc.fN.o());
      dfn $$5 = (dfn)$$3.c_($$4);
      $$5.c().a("test runthis");
      ht $$6 = ebh.a($$4.b(0, 0, -1), czw.a, $$2, $$4);
      $$3.b($$6, cvc.dM.o().a($$2));
   }

   public static void a(String $$0, ht $$1, iw $$2, dbm $$3, ame $$4) {
      dwz $$5 = b($$1, $$2, $$3);
      a($$5, $$4);
      $$4.b($$1, cvc.pa.o());
      dgr $$6 = (dgr)$$4.c_($$1);
      $$6.a(false);
      $$6.a(new agi($$0));
      $$6.a($$2);
      $$6.a(dis.a);
      $$6.e(true);
   }

   public static dgr a(String $$0, ht $$1, dbm $$2, ame $$3, boolean $$4) {
      iw $$5 = a($$0, $$3).a();
      dwz $$6 = b($$1, $$5, $$2);
      ht $$7;
      if ($$2 == dbm.a) {
         $$7 = $$1;
      } else if ($$2 == dbm.b) {
         $$7 = $$1.b($$5.w() - 1, 0, 0);
      } else if ($$2 == dbm.c) {
         $$7 = $$1.b($$5.u() - 1, 0, $$5.w() - 1);
      } else {
         if ($$2 != dbm.d) {
            throw new IllegalArgumentException("Invalid rotation: " + $$2);
         }

         $$7 = $$1.b(0, 0, $$5.u() - 1);
      }

      b($$6, $$3);
      a($$6, $$3);
      dgr $$12 = b($$0, $$7.d(), $$2, $$3, $$4);
      $$3.l().a($$6);
      $$3.a($$6);
      return $$12;
   }

   private static void b(dwz $$0, ame $$1) {
      a($$0, 0).forEach($$1x -> $$1.a($$1x.e, $$1x.f, true));
      a($$0, 3).forEach($$1x -> $$1.d($$1x.e, $$1x.f));
   }

   private static Stream<crh> a(dwz $$0, int $$1) {
      int $$2 = iu.a($$0.g()) - $$1;
      int $$3 = iu.a($$0.i()) - $$1;
      int $$4 = iu.a($$0.j()) + $$1;
      int $$5 = iu.a($$0.l()) + $$1;
      return crh.a(new crh($$2, $$3), new crh($$4, $$5));
   }

   public static void a(dwz $$0, ame $$1) {
      int $$2 = $$0.h() - 1;
      dwz $$3 = new dwz($$0.g() - 2, $$0.h() - 3, $$0.i() - 3, $$0.j() + 3, $$0.k() + 20, $$0.l() + 3);
      ht.a($$3).forEach($$2x -> a($$2, $$2x, $$1));
      $$1.l().a($$3);
      $$1.a($$3);
      ejp $$4 = new ejp((double)$$3.g(), (double)$$3.h(), (double)$$3.i(), (double)$$3.j(), (double)$$3.k(), (double)$$3.l());
      List<bkq> $$5 = $$1.a(bkq.class, $$4, $$0x -> !($$0x instanceof cdu));
      $$5.forEach(bkq::am);
   }

   public static ht a(ht $$0, iw $$1, dbm $$2) {
      ht $$3 = $$0.a($$1).b(-1, -1, -1);
      return ebh.a($$3, czw.a, $$2, $$0);
   }

   public static dwz b(ht $$0, iw $$1, dbm $$2) {
      ht $$3 = a($$0, $$1, $$2);
      dwz $$4 = dwz.a($$0, $$3);
      int $$5 = Math.min($$4.g(), $$4.j());
      int $$6 = Math.min($$4.i(), $$4.l());
      return $$4.a($$0.u() - $$5, 0, $$0.w() - $$6);
   }

   public static Optional<ht> a(ht $$0, int $$1, ame $$2) {
      return c($$0, $$1, $$2).stream().filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   @Nullable
   public static ht b(ht $$0, int $$1, ame $$2) {
      Comparator<ht> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      Collection<ht> $$4 = c($$0, $$1, $$2);
      Optional<ht> $$5 = $$4.stream().min($$3);
      return $$5.orElse(null);
   }

   public static Collection<ht> c(ht $$0, int $$1, ame $$2) {
      Collection<ht> $$3 = Lists.newArrayList();
      dwz $$4 = new dwz($$0).a($$1);
      ht.a($$4).forEach($$2x -> {
         if ($$2.a_($$2x).a(cvc.pa)) {
            $$3.add($$2x.i());
         }
      });
      return $$3;
   }

   private static ebh a(String $$0, ame $$1) {
      ebi $$2 = $$1.p();
      Optional<ebh> $$3 = $$2.b(new agi($$0));
      if ($$3.isPresent()) {
         return $$3.get();
      } else {
         String $$4 = $$0 + ".snbt";
         Path $$5 = Paths.get(b, $$4);
         rz $$6 = a($$5);
         if ($$6 == null) {
            throw new RuntimeException("Could not find structure file " + $$5 + ", and the structure is not available in the world structures either.");
         } else {
            return $$2.a($$6);
         }
      }
   }

   private static dgr b(String $$0, ht $$1, dbm $$2, ame $$3, boolean $$4) {
      $$3.b($$1, cvc.pa.o());
      dgr $$5 = (dgr)$$3.c_($$1);
      $$5.a(dis.b);
      $$5.a($$2);
      $$5.a(false);
      $$5.a(new agi($$0));
      $$5.a($$3, $$4);
      if ($$5.j() != iw.g) {
         return $$5;
      } else {
         ebh $$6 = a($$0, $$3);
         $$5.a($$3, $$4, $$6);
         if ($$5.j() == iw.g) {
            throw new RuntimeException("Failed to load structure " + $$0);
         } else {
            return $$5;
         }
      }
   }

   @Nullable
   private static rz a(Path $$0) {
      try {
         BufferedReader $$1 = Files.newBufferedReader($$0);
         String $$2 = IOUtils.toString($$1);
         return so.a($$2);
      } catch (IOException var3) {
         return null;
      } catch (CommandSyntaxException var4) {
         throw new RuntimeException("Error while trying to load structure " + $$0, var4);
      }
   }

   private static void a(int $$0, ht $$1, ame $$2) {
      dhi $$3;
      if ($$1.v() < $$0) {
         $$3 = cvc.b.o();
      } else {
         $$3 = cvc.a.o();
      }

      fh $$5 = new fh($$3, Collections.emptySet(), null);
      $$5.a($$2, $$1, 2);
      $$2.b($$1, $$3.b());
   }

   private static boolean a(ht $$0, ht $$1, ame $$2) {
      dgr $$3 = (dgr)$$2.c_($$0);
      return b($$3).b($$1);
   }
}
