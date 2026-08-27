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
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class rm {
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "gameteststructures";
   public static String b = "gameteststructures";
   private static final int d = 4;

   public static dbf a(int $$0) {
      switch ($$0) {
         case 0:
            return dbf.a;
         case 1:
            return dbf.b;
         case 2:
            return dbf.c;
         case 3:
            return dbf.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(dbf $$0) {
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

   public static ejd a(dgf $$0) {
      ht $$1 = $$0.p();
      ht $$2 = $$1.a($$0.j().c(-1, -1, -1));
      ht $$3 = eav.a($$2, czp.a, $$0.w(), $$1);
      return new ejd($$1, $$3);
   }

   public static dwn b(dgf $$0) {
      ht $$1 = $$0.p();
      ht $$2 = $$1.a($$0.j().c(-1, -1, -1));
      ht $$3 = eav.a($$2, czp.a, $$0.w(), $$1);
      return dwn.a($$1, $$3);
   }

   public static void a(ht $$0, ht $$1, dbf $$2, ama $$3) {
      ht $$4 = eav.a($$0.a((iw)$$1), czp.a, $$2, $$0);
      $$3.b($$4, cuv.fN.o());
      dfb $$5 = (dfb)$$3.c_($$4);
      $$5.c().a("test runthis");
      ht $$6 = eav.a($$4.b(0, 0, -1), czp.a, $$2, $$4);
      $$3.b($$6, cuv.dM.o().a($$2));
   }

   public static void a(String $$0, ht $$1, iw $$2, dbf $$3, ama $$4) {
      dwn $$5 = a($$1, $$2, $$3);
      a($$5, $$1.v(), $$4);
      $$4.b($$1, cuv.pa.o());
      dgf $$6 = (dgf)$$4.c_($$1);
      $$6.a(false);
      $$6.a(new agg($$0));
      $$6.a($$2);
      $$6.a(dig.a);
      $$6.e(true);
   }

   public static dgf a(String $$0, ht $$1, dbf $$2, int $$3, ama $$4, boolean $$5) {
      iw $$6 = a($$0, $$4).a();
      dwn $$7 = a($$1, $$6, $$2);
      ht $$8;
      if ($$2 == dbf.a) {
         $$8 = $$1;
      } else if ($$2 == dbf.b) {
         $$8 = $$1.b($$6.w() - 1, 0, 0);
      } else if ($$2 == dbf.c) {
         $$8 = $$1.b($$6.u() - 1, 0, $$6.w() - 1);
      } else {
         if ($$2 != dbf.d) {
            throw new IllegalArgumentException("Invalid rotation: " + $$2);
         }

         $$8 = $$1.b(0, 0, $$6.u() - 1);
      }

      a($$1, $$4);
      a($$7, $$1.v(), $$4);
      dgf $$13 = a($$0, $$8, $$2, $$4, $$5);
      $$4.l().a($$7);
      $$4.a($$7);
      return $$13;
   }

   private static void a(ht $$0, ama $$1) {
      cqz $$2 = new cqz($$0);

      for (int $$3 = -1; $$3 < 4; $$3++) {
         for (int $$4 = -1; $$4 < 4; $$4++) {
            int $$5 = $$2.e + $$3;
            int $$6 = $$2.f + $$4;
            $$1.a($$5, $$6, true);
         }
      }
   }

   public static void a(dwn $$0, int $$1, ama $$2) {
      dwn $$3 = new dwn($$0.g() - 2, $$0.h() - 3, $$0.i() - 3, $$0.j() + 3, $$0.k() + 20, $$0.l() + 3);
      ht.a($$3).forEach($$2x -> a($$1, $$2x, $$2));
      $$2.l().a($$3);
      $$2.a($$3);
      ejd $$4 = new ejd((double)$$3.g(), (double)$$3.h(), (double)$$3.i(), (double)$$3.j(), (double)$$3.k(), (double)$$3.l());
      List<bki> $$5 = $$2.a(bki.class, $$4, $$0x -> !($$0x instanceof cdm));
      $$5.forEach(bki::ak);
   }

   public static dwn a(ht $$0, iw $$1, dbf $$2) {
      ht $$3 = $$0.a($$1).b(-1, -1, -1);
      ht $$4 = eav.a($$3, czp.a, $$2, $$0);
      dwn $$5 = dwn.a($$0, $$4);
      int $$6 = Math.min($$5.g(), $$5.j());
      int $$7 = Math.min($$5.i(), $$5.l());
      return $$5.a($$0.u() - $$6, 0, $$0.w() - $$7);
   }

   public static Optional<ht> a(ht $$0, int $$1, ama $$2) {
      return c($$0, $$1, $$2).stream().filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   @Nullable
   public static ht b(ht $$0, int $$1, ama $$2) {
      Comparator<ht> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      Collection<ht> $$4 = c($$0, $$1, $$2);
      Optional<ht> $$5 = $$4.stream().min($$3);
      return $$5.orElse(null);
   }

   public static Collection<ht> c(ht $$0, int $$1, ama $$2) {
      Collection<ht> $$3 = Lists.newArrayList();
      ejd $$4 = new ejd($$0);
      $$4 = $$4.g((double)$$1);

      for (int $$5 = (int)$$4.a; $$5 <= (int)$$4.d; $$5++) {
         for (int $$6 = (int)$$4.b; $$6 <= (int)$$4.e; $$6++) {
            for (int $$7 = (int)$$4.c; $$7 <= (int)$$4.f; $$7++) {
               ht $$8 = new ht($$5, $$6, $$7);
               dgw $$9 = $$2.a_($$8);
               if ($$9.a(cuv.pa)) {
                  $$3.add($$8);
               }
            }
         }
      }

      return $$3;
   }

   private static eav a(String $$0, ama $$1) {
      eaw $$2 = $$1.p();
      Optional<eav> $$3 = $$2.b(new agg($$0));
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

   private static dgf a(String $$0, ht $$1, dbf $$2, ama $$3, boolean $$4) {
      $$3.b($$1, cuv.pa.o());
      dgf $$5 = (dgf)$$3.c_($$1);
      $$5.a(dig.b);
      $$5.a($$2);
      $$5.a(false);
      $$5.a(new agg($$0));
      $$5.a($$3, $$4);
      if ($$5.j() != iw.g) {
         return $$5;
      } else {
         eav $$6 = a($$0, $$3);
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

   private static void a(int $$0, ht $$1, ama $$2) {
      dgw $$3 = null;
      ip $$4 = $$2.H_();
      duy $$5 = duy.a($$4.b(jz.ar), $$4.b(jz.aD), $$4.b(jz.aA));
      List<dgw> $$6 = $$5.f();
      int $$7 = $$1.v() - $$2.I_();
      if ($$1.v() < $$0 && $$7 > 0 && $$7 <= $$6.size()) {
         $$3 = $$6.get($$7 - 1);
      }

      if ($$3 == null) {
         $$3 = cuv.a.o();
      }

      fh $$8 = new fh($$3, Collections.emptySet(), null);
      $$8.a($$2, $$1, 2);
      $$2.b($$1, $$3.b());
   }

   private static boolean a(ht $$0, ht $$1, ama $$2) {
      dgf $$3 = (dgf)$$2.c_($$0);
      ejd $$4 = a($$3).g(1.0);
      return $$4.d(eji.b($$1));
   }
}
