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

public class qe {
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "gameteststructures";
   public static String b = "gameteststructures";
   private static final int d = 4;

   public static cyy a(int $$0) {
      switch ($$0) {
         case 0:
            return cyy.a;
         case 1:
            return cyy.b;
         case 2:
            return cyy.c;
         case 3:
            return cyy.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(cyy $$0) {
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

   public static void a(String[] $$0) throws IOException {
      aet.a();
      Files.walk(Paths.get(b)).filter($$0x -> $$0x.toString().endsWith(".snbt")).forEach($$0x -> {
         try {
            String $$1 = Files.readString($$0x);
            qr $$2 = rd.a($$1);
            qr $$3 = mi.a($$0x.toString(), $$2);
            mg.a(jg.a, $$0x, rd.c($$3));
         } catch (IOException | CommandSyntaxException var4) {
            c.error("Something went wrong upgrading: {}", $$0x, var4);
         }
      });
   }

   public static egz a(ddz $$0) {
      gu $$1 = $$0.p();
      gu $$2 = $$1.a($$0.j().c(-1, -1, -1));
      gu $$3 = dys.a($$2, cxh.a, $$0.w(), $$1);
      return new egz($$1, $$3);
   }

   public static dur b(ddz $$0) {
      gu $$1 = $$0.p();
      gu $$2 = $$1.a($$0.j().c(-1, -1, -1));
      gu $$3 = dys.a($$2, cxh.a, $$0.w(), $$1);
      return dur.a($$1, $$3);
   }

   public static void a(gu $$0, gu $$1, cyy $$2, akk $$3) {
      gu $$4 = dys.a($$0.a((hz)$$1), cxh.a, $$2, $$0);
      $$3.b($$4, csn.fN.n());
      dcw $$5 = (dcw)$$3.c_($$4);
      $$5.c().a("test runthis");
      gu $$6 = dys.a($$4.b(0, 0, -1), cxh.a, $$2, $$4);
      $$3.b($$6, csn.dM.n().a($$2));
   }

   public static void a(String $$0, gu $$1, hz $$2, cyy $$3, akk $$4) {
      dur $$5 = a($$1, $$2, $$3);
      a($$5, $$1.v(), $$4);
      $$4.b($$1, csn.pa.n());
      ddz $$6 = (ddz)$$4.c_($$1);
      $$6.a(false);
      $$6.a(new aer($$0));
      $$6.a($$2);
      $$6.a(dgk.a);
      $$6.e(true);
   }

   public static ddz a(String $$0, gu $$1, cyy $$2, int $$3, akk $$4, boolean $$5) {
      hz $$6 = a($$0, $$4).a();
      dur $$7 = a($$1, $$6, $$2);
      gu $$8;
      if ($$2 == cyy.a) {
         $$8 = $$1;
      } else if ($$2 == cyy.b) {
         $$8 = $$1.b($$6.w() - 1, 0, 0);
      } else if ($$2 == cyy.c) {
         $$8 = $$1.b($$6.u() - 1, 0, $$6.w() - 1);
      } else {
         if ($$2 != cyy.d) {
            throw new IllegalArgumentException("Invalid rotation: " + $$2);
         }

         $$8 = $$1.b(0, 0, $$6.u() - 1);
      }

      a($$1, $$4);
      a($$7, $$1.v(), $$4);
      ddz $$13 = a($$0, $$8, $$2, $$4, $$5);
      $$4.l().a($$7);
      $$4.a($$7);
      return $$13;
   }

   private static void a(gu $$0, akk $$1) {
      cot $$2 = new cot($$0);

      for (int $$3 = -1; $$3 < 4; $$3++) {
         for (int $$4 = -1; $$4 < 4; $$4++) {
            int $$5 = $$2.e + $$3;
            int $$6 = $$2.f + $$4;
            $$1.a($$5, $$6, true);
         }
      }
   }

   public static void a(dur $$0, int $$1, akk $$2) {
      dur $$3 = new dur($$0.g() - 2, $$0.h() - 3, $$0.i() - 3, $$0.j() + 3, $$0.k() + 20, $$0.l() + 3);
      gu.a($$3).forEach($$2x -> a($$1, $$2x, $$2));
      $$2.l().a($$3);
      $$2.a($$3);
      egz $$4 = new egz((double)$$3.g(), (double)$$3.h(), (double)$$3.i(), (double)$$3.j(), (double)$$3.k(), (double)$$3.l());
      List<bii> $$5 = $$2.a(bii.class, $$4, $$0x -> !($$0x instanceof cbn));
      $$5.forEach(bii::ak);
   }

   public static dur a(gu $$0, hz $$1, cyy $$2) {
      gu $$3 = $$0.a($$1).b(-1, -1, -1);
      gu $$4 = dys.a($$3, cxh.a, $$2, $$0);
      dur $$5 = dur.a($$0, $$4);
      int $$6 = Math.min($$5.g(), $$5.j());
      int $$7 = Math.min($$5.i(), $$5.l());
      return $$5.a($$0.u() - $$6, 0, $$0.w() - $$7);
   }

   public static Optional<gu> a(gu $$0, int $$1, akk $$2) {
      return c($$0, $$1, $$2).stream().filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   @Nullable
   public static gu b(gu $$0, int $$1, akk $$2) {
      Comparator<gu> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      Collection<gu> $$4 = c($$0, $$1, $$2);
      Optional<gu> $$5 = $$4.stream().min($$3);
      return $$5.orElse(null);
   }

   public static Collection<gu> c(gu $$0, int $$1, akk $$2) {
      Collection<gu> $$3 = Lists.newArrayList();
      egz $$4 = new egz($$0);
      $$4 = $$4.g((double)$$1);

      for (int $$5 = (int)$$4.a; $$5 <= (int)$$4.d; $$5++) {
         for (int $$6 = (int)$$4.b; $$6 <= (int)$$4.e; $$6++) {
            for (int $$7 = (int)$$4.c; $$7 <= (int)$$4.f; $$7++) {
               gu $$8 = new gu($$5, $$6, $$7);
               dfa $$9 = $$2.a_($$8);
               if ($$9.a(csn.pa)) {
                  $$3.add($$8);
               }
            }
         }
      }

      return $$3;
   }

   private static dys a(String $$0, akk $$1) {
      dyt $$2 = $$1.p();
      Optional<dys> $$3 = $$2.b(new aer($$0));
      if ($$3.isPresent()) {
         return $$3.get();
      } else {
         String $$4 = $$0 + ".snbt";
         Path $$5 = Paths.get(b, $$4);
         qr $$6 = a($$5);
         if ($$6 == null) {
            throw new RuntimeException("Could not find structure file " + $$5 + ", and the structure is not available in the world structures either.");
         } else {
            return $$2.a($$6);
         }
      }
   }

   private static ddz a(String $$0, gu $$1, cyy $$2, akk $$3, boolean $$4) {
      $$3.b($$1, csn.pa.n());
      ddz $$5 = (ddz)$$3.c_($$1);
      $$5.a(dgk.b);
      $$5.a($$2);
      $$5.a(false);
      $$5.a(new aer($$0));
      $$5.a($$3, $$4);
      if ($$5.j() != hz.g) {
         return $$5;
      } else {
         dys $$6 = a($$0, $$3);
         $$5.a($$3, $$4, $$6);
         if ($$5.j() == hz.g) {
            throw new RuntimeException("Failed to load structure " + $$0);
         } else {
            return $$5;
         }
      }
   }

   @Nullable
   private static qr a(Path $$0) {
      try {
         BufferedReader $$1 = Files.newBufferedReader($$0);
         String $$2 = IOUtils.toString($$1);
         return rd.a($$2);
      } catch (IOException var3) {
         return null;
      } catch (CommandSyntaxException var4) {
         throw new RuntimeException("Error while trying to load structure " + $$0, var4);
      }
   }

   private static void a(int $$0, gu $$1, akk $$2) {
      dfa $$3 = null;
      hs $$4 = $$2.B_();
      dtc $$5 = dtc.a($$4.b(jc.ap), $$4.b(jc.aB), $$4.b(jc.ay));
      List<dfa> $$6 = $$5.f();
      int $$7 = $$1.v() - $$2.C_();
      if ($$1.v() < $$0 && $$7 > 0 && $$7 <= $$6.size()) {
         $$3 = $$6.get($$7 - 1);
      }

      if ($$3 == null) {
         $$3 = csn.a.n();
      }

      fd $$8 = new fd($$3, Collections.emptySet(), null);
      $$8.a($$2, $$1, 2);
      $$2.b($$1, $$3.b());
   }

   private static boolean a(gu $$0, gu $$1, akk $$2) {
      ddz $$3 = (ddz)$$2.c_($$0);
      egz $$4 = a($$3).g(1.0);
      return $$4.d(ehe.b($$1));
   }
}
