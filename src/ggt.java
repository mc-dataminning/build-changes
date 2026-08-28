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

public class ggt implements ggy.a {
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
   private static final int B = -1;
   private static final int C = -256;
   private static final int D = -16711681;
   private static final int E = -16711936;
   private static final int F = -3355444;
   private static final int G = -98404;
   private static final int H = -65536;
   private static final int I = -23296;
   private final ffd J;
   private final Map<iz, ggt.a> K = Maps.newHashMap();
   private final Map<UUID, aat.a> L = Maps.newHashMap();
   @Nullable
   private UUID M;

   public ggt(ffd $$0) {
      this.J = $$0;
   }

   @Override
   public void a() {
      this.K.clear();
      this.L.clear();
      this.M = null;
   }

   public void a(ggt.a $$0) {
      this.K.put($$0.a, $$0);
   }

   public void a(iz $$0) {
      this.K.remove($$0);
   }

   public void a(iz $$0, int $$1) {
      ggt.a $$2 = this.K.get($$0);
      if ($$2 == null) {
         a.warn("Strange, setFreeTicketCount was called for an unknown POI: {}", $$0);
      } else {
         $$2.c = $$1;
      }
   }

   public void a(aat.a $$0) {
      this.L.put($$0.a(), $$0);
   }

   public void a(int $$0) {
      this.L.values().removeIf($$1 -> $$1.b() == $$0);
   }

   @Override
   public void a(ezw $$0, gdm $$1, double $$2, double $$3, double $$4) {
      this.b();
      this.b($$0, $$1, $$2, $$3, $$4);
      if (!this.J.s.N_()) {
         this.d();
      }
   }

   private void b() {
      this.L.entrySet().removeIf($$0 -> {
         bss $$1 = this.J.r.a($$0.getValue().b());
         return $$1 == null || $$1.dK();
      });
   }

   private void b(ezw $$0, gdm $$1, double $$2, double $$3, double $$4) {
      iz $$5 = iz.a($$2, $$3, $$4);
      this.L.values().forEach($$5x -> {
         if (this.c($$5x)) {
            this.b($$0, $$1, $$5x, $$2, $$3, $$4);
         }
      });

      for (iz $$6 : this.K.keySet()) {
         if ($$5.a($$6, 30.0)) {
            a($$0, $$1, $$6);
         }
      }

      this.K.values().forEach($$3x -> {
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

   private static void a(ezw $$0, gdm $$1, iz $$2) {
      float $$3 = 0.05F;
      ggy.a($$0, $$1, $$2, 0.05F, 0.2F, 0.2F, 1.0F, 0.3F);
   }

   private void a(ezw $$0, gdm $$1, iz $$2, List<String> $$3) {
      float $$4 = 0.05F;
      ggy.a($$0, $$1, $$2, 0.05F, 0.2F, 0.2F, 1.0F, 0.3F);
      a($$0, $$1, $$3 + "", $$2, 0, -256);
      a($$0, $$1, "Ghost POI", $$2, 1, -65536);
   }

   private void a(ezw $$0, gdm $$1, ggt.a $$2) {
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

   private void a(ezw $$0, gdm $$1, aat.a $$2, double $$3, double $$4, double $$5) {
      if ($$2.j() != null) {
         ghg.a($$0, $$1, $$2.j(), 0.5F, false, false, $$3, $$4, $$5);
      }
   }

   private void b(ezw $$0, gdm $$1, aat.a $$2, double $$3, double $$4, double $$5) {
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

   private static void a(ezw $$0, gdm $$1, String $$2, ggt.a $$3, int $$4, int $$5) {
      a($$0, $$1, $$2, $$3.a, $$4, $$5);
   }

   private static void a(ezw $$0, gdm $$1, String $$2, iz $$3, int $$4, int $$5) {
      double $$6 = 1.3;
      double $$7 = 0.2;
      double $$8 = (double)$$3.u() + 0.5;
      double $$9 = (double)$$3.v() + 1.3 + (double)$$4 * 0.2;
      double $$10 = (double)$$3.w() + 0.5;
      ggy.a($$0, $$1, $$2, $$8, $$9, $$10, $$5, 0.02F, true, 0.0F, true);
   }

   private static void a(ezw $$0, gdm $$1, js $$2, int $$3, String $$4, int $$5, float $$6) {
      double $$7 = 2.4;
      double $$8 = 0.25;
      iz $$9 = iz.a($$2);
      double $$10 = (double)$$9.u() + 0.5;
      double $$11 = $$2.b() + 2.4 + (double)$$3 * 0.25;
      double $$12 = (double)$$9.w() + 0.5;
      float $$13 = 0.5F;
      ggy.a($$0, $$1, $$4, $$10, $$11, $$12, $$5, $$6, false, 0.5F, true);
   }

   private Set<String> b(ggt.a $$0) {
      return this.b($$0.a).stream().map(agr::a).collect(Collectors.toSet());
   }

   private Set<String> c(ggt.a $$0) {
      return this.c($$0.a).stream().map(agr::a).collect(Collectors.toSet());
   }

   private boolean b(aat.a $$0) {
      return Objects.equals(this.M, $$0.a());
   }

   private boolean c(aat.a $$0) {
      cmv $$1 = this.J.s;
      iz $$2 = iz.a($$1.du(), $$0.h().b(), $$1.dA());
      iz $$3 = iz.a($$0.h());
      return $$2.a($$3, 30.0);
   }

   private Collection<UUID> b(iz $$0) {
      return this.L.values().stream().filter($$1 -> $$1.a($$0)).map(aat.a::a).collect(Collectors.toSet());
   }

   private Collection<UUID> c(iz $$0) {
      return this.L.values().stream().filter($$1 -> $$1.b($$0)).map(aat.a::a).collect(Collectors.toSet());
   }

   private Map<iz, List<String>> c() {
      Map<iz, List<String>> $$0 = Maps.newHashMap();

      for (aat.a $$1 : this.L.values()) {
         for (iz $$2 : Iterables.concat($$1.q(), $$1.r())) {
            if (!this.K.containsKey($$2)) {
               $$0.computeIfAbsent($$2, $$0x -> Lists.newArrayList()).add($$1.c());
            }
         }
      }

      return $$0;
   }

   private void d() {
      ggy.a(this.J.an(), 8).ifPresent($$0 -> this.M = $$0.cz());
   }

   public static class a {
      public final iz a;
      public final String b;
      public int c;

      public a(iz $$0, String $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
