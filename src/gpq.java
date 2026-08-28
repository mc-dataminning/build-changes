import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gpq implements gpw.a {
   private static final Logger a = LogUtils.getLogger();
   private static final boolean b = true;
   private static final boolean c = false;
   private static final boolean d = false;
   private static final boolean e = false;
   private static final boolean f = false;
   private static final boolean g = false;
   private static final boolean h = false;
   private static final boolean i = false;
   private static final boolean j = true;
   private static final boolean k = false;
   private static final boolean l = true;
   private static final boolean m = true;
   private static final boolean n = true;
   private static final boolean o = true;
   private static final boolean p = true;
   private static final boolean q = true;
   private static final boolean r = true;
   private static final boolean s = true;
   private static final boolean t = true;
   private static final boolean u = true;
   private static final boolean v = true;
   private static final boolean w = true;
   private static final int x = 30;
   private static final int y = 30;
   private static final int z = 8;
   private static final float A = 0.02F;
   private static final int B = -16711681;
   private static final int C = -3355444;
   private static final int D = -98404;
   private static final int E = -23296;
   private final flh F;
   private final Map<ji, gpq.a> G = Maps.newHashMap();
   private final Map<UUID, zv.a> H = Maps.newHashMap();
   @Nullable
   private UUID I;

   public gpq(flh $$0) {
      this.F = $$0;
   }

   @Override
   public void a() {
      this.G.clear();
      this.H.clear();
      this.I = null;
   }

   public void a(gpq.a $$0) {
      this.G.put($$0.a, $$0);
   }

   public void a(ji $$0) {
      this.G.remove($$0);
   }

   public void a(ji $$0, int $$1) {
      gpq.a $$2 = this.G.get($$0);
      if ($$2 == null) {
         a.warn("Strange, setFreeTicketCount was called for an unknown POI: {}", $$0);
      } else {
         $$2.c = $$1;
      }
   }

   public void a(zv.a $$0) {
      this.H.put($$0.a(), $$0);
   }

   public void a(int $$0) {
      this.H.values().removeIf($$1 -> $$1.b() == $$0);
   }

   @Override
   public void a(ffs $$0, glv $$1, double $$2, double $$3, double $$4) {
      this.b();
      this.b($$0, $$1, $$2, $$3, $$4);
      if (!this.F.t.Z_()) {
         this.d();
      }
   }

   private void b() {
      this.H.entrySet().removeIf($$0 -> {
         buj $$1 = this.F.s.a($$0.getValue().b());
         return $$1 == null || $$1.dR();
      });
   }

   private void b(ffs $$0, glv $$1, double $$2, double $$3, double $$4) {
      ji $$5 = ji.a($$2, $$3, $$4);
      this.H.values().forEach($$5x -> {
         if (this.c($$5x)) {
            this.b($$0, $$1, $$5x, $$2, $$3, $$4);
         }
      });

      for (ji $$6 : this.G.keySet()) {
         if ($$5.a($$6, 30.0)) {
            a($$0, $$1, $$6);
         }
      }

      this.G.values().forEach($$3x -> {
         if ($$5.a($$3x.a, 30.0)) {
            this.a($$0, $$1, $$3x);
         }
      });
      this.c().forEach(($$3x, $$4x) -> {
         if ($$5.a($$3x, 30.0)) {
            this.a($$0, $$1, $$3x, $$4x);
         }
      });
   }

   private static void a(ffs $$0, glv $$1, ji $$2) {
      float $$3 = 0.05F;
      gpw.a($$0, $$1, $$2, 0.05F, 0.2F, 0.2F, 1.0F, 0.3F);
   }

   private void a(ffs $$0, glv $$1, ji $$2, List<String> $$3) {
      float $$4 = 0.05F;
      gpw.a($$0, $$1, $$2, 0.05F, 0.2F, 0.2F, 1.0F, 0.3F);
      a($$0, $$1, $$3 + "", $$2, 0, -256);
      a($$0, $$1, "Ghost POI", $$2, 1, -65536);
   }

   private void a(ffs $$0, glv $$1, gpq.a $$2) {
      int $$3 = 0;
      Set<String> $$4 = this.b($$2);
      if ($$4.size() < 4) {
         a($$0, $$1, "Owners: " + $$4, $$2, $$3, -256);
      } else {
         a($$0, $$1, $$4.size() + " ticket holders", $$2, $$3, -256);
      }

      $$3++;
      Set<String> $$5 = this.c($$2);
      if ($$5.size() < 4) {
         a($$0, $$1, "Candidates: " + $$5, $$2, $$3, -23296);
      } else {
         a($$0, $$1, $$5.size() + " potential owners", $$2, $$3, -23296);
      }

      a($$0, $$1, "Free tickets: " + $$2.c, $$2, ++$$3, -256);
      a($$0, $$1, $$2.b, $$2, ++$$3, -1);
   }

   private void a(ffs $$0, glv $$1, zv.a $$2, double $$3, double $$4, double $$5) {
      if ($$2.j() != null) {
         gqf.a($$0, $$1, $$2.j(), 0.5F, false, false, $$3, $$4, $$5);
      }
   }

   private void b(ffs $$0, glv $$1, zv.a $$2, double $$3, double $$4, double $$5) {
      boolean $$6 = this.b($$2);
      int $$7 = 0;
      a($$0, $$1, $$2.h(), $$7, $$2.c(), -1, 0.03F);
      $$7++;
      if ($$6) {
         a($$0, $$1, $$2.h(), $$7, $$2.d() + " " + $$2.e() + " xp", -1, 0.02F);
         $$7++;
      }

      if ($$6) {
         int $$8 = $$2.f() < $$2.g() ? -23296 : -1;
         a($$0, $$1, $$2.h(), $$7, "health: " + String.format(Locale.ROOT, "%.1f", $$2.f()) + " / " + String.format(Locale.ROOT, "%.1f", $$2.g()), $$8, 0.02F);
         $$7++;
      }

      if ($$6 && !$$2.i().equals("")) {
         a($$0, $$1, $$2.h(), $$7, $$2.i(), -98404, 0.02F);
         $$7++;
      }

      if ($$6) {
         for (String $$9 : $$2.n()) {
            a($$0, $$1, $$2.h(), $$7, $$9, -16711681, 0.02F);
            $$7++;
         }
      }

      if ($$6) {
         for (String $$10 : $$2.m()) {
            a($$0, $$1, $$2.h(), $$7, $$10, -16711936, 0.02F);
            $$7++;
         }
      }

      if ($$2.k()) {
         a($$0, $$1, $$2.h(), $$7, "Wants Golem", -23296, 0.02F);
         $$7++;
      }

      if ($$6 && $$2.l() != -1) {
         a($$0, $$1, $$2.h(), $$7, "Anger Level: " + $$2.l(), -98404, 0.02F);
         $$7++;
      }

      if ($$6) {
         for (String $$11 : $$2.p()) {
            if ($$11.startsWith($$2.c())) {
               a($$0, $$1, $$2.h(), $$7, $$11, -1, 0.02F);
            } else {
               a($$0, $$1, $$2.h(), $$7, $$11, -23296, 0.02F);
            }

            $$7++;
         }
      }

      if ($$6) {
         for (String $$12 : Lists.reverse($$2.o())) {
            a($$0, $$1, $$2.h(), $$7, $$12, -3355444, 0.02F);
            $$7++;
         }
      }

      if ($$6) {
         this.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static void a(ffs $$0, glv $$1, String $$2, gpq.a $$3, int $$4, int $$5) {
      a($$0, $$1, $$2, $$3.a, $$4, $$5);
   }

   private static void a(ffs $$0, glv $$1, String $$2, ji $$3, int $$4, int $$5) {
      double $$6 = 1.3;
      double $$7 = 0.2;
      double $$8 = (double)$$3.u() + 0.5;
      double $$9 = (double)$$3.v() + 1.3 + (double)$$4 * 0.2;
      double $$10 = (double)$$3.w() + 0.5;
      gpw.a($$0, $$1, $$2, $$8, $$9, $$10, $$5, 0.02F, true, 0.0F, true);
   }

   private static void a(ffs $$0, glv $$1, kb $$2, int $$3, String $$4, int $$5, float $$6) {
      double $$7 = 2.4;
      double $$8 = 0.25;
      ji $$9 = ji.a($$2);
      double $$10 = (double)$$9.u() + 0.5;
      double $$11 = $$2.b() + 2.4 + (double)$$3 * 0.25;
      double $$12 = (double)$$9.w() + 0.5;
      float $$13 = 0.5F;
      gpw.a($$0, $$1, $$4, $$10, $$11, $$12, $$5, $$6, false, 0.5F, true);
   }

   private Set<String> b(gpq.a $$0) {
      return this.b($$0.a).stream().map(agb::a).collect(Collectors.toSet());
   }

   private Set<String> c(gpq.a $$0) {
      return this.c($$0.a).stream().map(agb::a).collect(Collectors.toSet());
   }

   private boolean b(zv.a $$0) {
      return Objects.equals(this.I, $$0.a());
   }

   private boolean c(zv.a $$0) {
      cov $$1 = this.F.t;
      ji $$2 = ji.a($$1.dB(), $$0.h().b(), $$1.dH());
      ji $$3 = ji.a((kb)$$0.h());
      return $$2.a($$3, 30.0);
   }

   private Collection<UUID> b(ji $$0) {
      return this.H.values().stream().filter($$1 -> $$1.a($$0)).map(zv.a::a).collect(Collectors.toSet());
   }

   private Collection<UUID> c(ji $$0) {
      return this.H.values().stream().filter($$1 -> $$1.b($$0)).map(zv.a::a).collect(Collectors.toSet());
   }

   private Map<ji, List<String>> c() {
      Map<ji, List<String>> $$0 = Maps.newHashMap();

      for (zv.a $$1 : this.H.values()) {
         for (ji $$2 : Iterables.concat($$1.q(), $$1.r())) {
            if (!this.G.containsKey($$2)) {
               $$0.computeIfAbsent($$2, $$0x -> Lists.newArrayList()).add($$1.c());
            }
         }
      }

      return $$0;
   }

   private void d() {
      gpw.a(this.F.ao(), 8).ifPresent($$0 -> this.I = $$0.cG());
   }

   public static class a {
      public final ji a;
      public final String b;
      public int c;

      public a(ji $$0, String $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
