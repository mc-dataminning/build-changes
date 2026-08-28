import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gqr implements gqy.a {
   private static final boolean a = true;
   private static final boolean b = true;
   private static final boolean c = true;
   private static final boolean d = true;
   private static final boolean e = true;
   private static final boolean f = false;
   private static final boolean g = true;
   private static final boolean h = true;
   private static final boolean i = true;
   private static final boolean j = true;
   private static final boolean k = true;
   private static final boolean l = true;
   private static final boolean m = true;
   private static final boolean n = true;
   private static final int o = 30;
   private static final int p = 30;
   private static final int q = 8;
   private static final int r = 20;
   private static final float s = 0.02F;
   private static final int t = -23296;
   private static final int u = -3355444;
   private static final int v = -98404;
   private final fmg w;
   private final Map<ji, gqr.a> x = new HashMap<>();
   private final Map<UUID, zv.a> y = new HashMap<>();
   @Nullable
   private UUID z;

   public gqr(fmg $$0) {
      this.w = $$0;
   }

   @Override
   public void a() {
      this.x.clear();
      this.y.clear();
      this.z = null;
   }

   public void a(aag.a $$0, long $$1) {
      this.x.put($$0.a(), new gqr.a($$0, $$1));
   }

   public void a(zv.a $$0) {
      this.y.put($$0.b(), $$0);
   }

   public void a(int $$0) {
      this.y.values().removeIf($$1 -> $$1.c() == $$0);
   }

   @Override
   public void a(fgr $$0, gmx $$1, double $$2, double $$3, double $$4) {
      this.c();
      this.b();
      this.a($$0, $$1);
      if (!this.w.t.U_()) {
         this.g();
      }
   }

   private void b() {
      this.y.entrySet().removeIf($$0 -> this.w.s.a($$0.getValue().c()) == null);
   }

   private void c() {
      long $$0 = this.w.s.ae() - 20L;
      this.x.entrySet().removeIf($$1 -> $$1.getValue().b() < $$0);
   }

   private void a(fgr $$0, gmx $$1) {
      ji $$2 = this.e().c();
      this.y.values().forEach($$2x -> {
         if (this.c($$2x)) {
            this.b($$0, $$1, $$2x);
         }
      });
      this.b($$0, $$1);

      for (ji $$3 : this.x.keySet()) {
         if ($$2.a($$3, 30.0)) {
            a($$0, $$1, $$3);
         }
      }

      Map<ji, Set<UUID>> $$4 = this.d();
      this.x.values().forEach($$4x -> {
         if ($$2.a($$4x.a.a(), 30.0)) {
            Set<UUID> $$5 = $$4.get($$4x.a.a());
            this.a($$0, $$1, $$4x.a, (Collection<UUID>)($$5 == null ? Sets.newHashSet() : $$5));
         }
      });
      this.f().forEach(($$3x, $$4x) -> {
         if ($$2.a($$3x, 30.0)) {
            this.a($$0, $$1, $$3x, (List<String>)$$4x);
         }
      });
   }

   private Map<ji, Set<UUID>> d() {
      Map<ji, Set<UUID>> $$0 = Maps.newHashMap();
      this.y.values().forEach($$1 -> $$1.j().forEach($$2 -> $$0.computeIfAbsent($$2, $$0xxx -> Sets.newHashSet()).add($$1.b())));
      return $$0;
   }

   private void b(fgr $$0, gmx $$1) {
      Map<ji, Set<UUID>> $$2 = Maps.newHashMap();
      this.y.values().forEach($$1x -> {
         if ($$1x.g() != null) {
            $$2.computeIfAbsent($$1x.g(), $$0xx -> new HashSet<>()).add($$1x.b());
         }
      });
      $$2.forEach(($$2x, $$3) -> {
         Set<String> $$4 = $$3.stream().map(agb::a).collect(Collectors.toSet());
         int $$5 = 1;
         a($$0, $$1, $$4.toString(), $$2x, $$5++, -256);
         a($$0, $$1, "Flower", $$2x, $$5++, -1);
         float $$6 = 0.05F;
         gqy.a($$0, $$1, $$2x, 0.05F, 0.8F, 0.8F, 0.0F, 0.3F);
      });
   }

   private static String a(Collection<UUID> $$0) {
      if ($$0.isEmpty()) {
         return "-";
      } else {
         return $$0.size() > 3 ? $$0.size() + " bees" : $$0.stream().map(agb::a).collect(Collectors.toSet()).toString();
      }
   }

   private static void a(fgr $$0, gmx $$1, ji $$2) {
      float $$3 = 0.05F;
      gqy.a($$0, $$1, $$2, 0.05F, 0.2F, 0.2F, 1.0F, 0.3F);
   }

   private void a(fgr $$0, gmx $$1, ji $$2, List<String> $$3) {
      float $$4 = 0.05F;
      gqy.a($$0, $$1, $$2, 0.05F, 0.2F, 0.2F, 1.0F, 0.3F);
      a($$0, $$1, $$3 + "", $$2, 0, -256);
      a($$0, $$1, "Ghost Hive", $$2, 1, -65536);
   }

   private void a(fgr $$0, gmx $$1, aag.a $$2, Collection<UUID> $$3) {
      int $$4 = 0;
      if (!$$3.isEmpty()) {
         a($$0, $$1, "Blacklisted by " + a($$3), $$2, $$4++, -65536);
      }

      a($$0, $$1, "Out: " + a(this.a($$2.a())), $$2, $$4++, -3355444);
      if ($$2.c() == 0) {
         a($$0, $$1, "In: -", $$2, $$4++, -256);
      } else if ($$2.c() == 1) {
         a($$0, $$1, "In: 1 bee", $$2, $$4++, -256);
      } else {
         a($$0, $$1, "In: " + $$2.c() + " bees", $$2, $$4++, -256);
      }

      a($$0, $$1, "Honey: " + $$2.d(), $$2, $$4++, -23296);
      a($$0, $$1, $$2.b() + ($$2.e() ? " (sedated)" : ""), $$2, $$4++, -1);
   }

   private void a(fgr $$0, gmx $$1, zv.a $$2) {
      if ($$2.e() != null) {
         grh.a($$0, $$1, $$2.e(), 0.5F, false, false, this.e().b().a(), this.e().b().b(), this.e().b().c());
      }
   }

   private void b(fgr $$0, gmx $$1, zv.a $$2) {
      boolean $$3 = this.b($$2);
      int $$4 = 0;
      a($$0, $$1, $$2.d(), $$4++, $$2.toString(), -1, 0.03F);
      if ($$2.f() == null) {
         a($$0, $$1, $$2.d(), $$4++, "No hive", -98404, 0.02F);
      } else {
         a($$0, $$1, $$2.d(), $$4++, "Hive: " + this.a($$2, $$2.f()), -256, 0.02F);
      }

      if ($$2.g() == null) {
         a($$0, $$1, $$2.d(), $$4++, "No flower", -98404, 0.02F);
      } else {
         a($$0, $$1, $$2.d(), $$4++, "Flower: " + this.a($$2, $$2.g()), -256, 0.02F);
      }

      for (String $$5 : $$2.i()) {
         a($$0, $$1, $$2.d(), $$4++, $$5, -16711936, 0.02F);
      }

      if ($$3) {
         this.a($$0, $$1, $$2);
      }

      if ($$2.h() > 0) {
         int $$6 = $$2.h() < 2400 ? -3355444 : -23296;
         a($$0, $$1, $$2.d(), $$4++, "Travelling: " + $$2.h() + " ticks", $$6, 0.02F);
      }
   }

   private static void a(fgr $$0, gmx $$1, String $$2, aag.a $$3, int $$4, int $$5) {
      a($$0, $$1, $$2, $$3.a(), $$4, $$5);
   }

   private static void a(fgr $$0, gmx $$1, String $$2, ji $$3, int $$4, int $$5) {
      double $$6 = 1.3;
      double $$7 = 0.2;
      double $$8 = (double)$$3.u() + 0.5;
      double $$9 = (double)$$3.v() + 1.3 + (double)$$4 * 0.2;
      double $$10 = (double)$$3.w() + 0.5;
      gqy.a($$0, $$1, $$2, $$8, $$9, $$10, $$5, 0.02F, true, 0.0F, true);
   }

   private static void a(fgr $$0, gmx $$1, kb $$2, int $$3, String $$4, int $$5, float $$6) {
      double $$7 = 2.4;
      double $$8 = 0.25;
      ji $$9 = ji.a($$2);
      double $$10 = (double)$$9.u() + 0.5;
      double $$11 = $$2.b() + 2.4 + (double)$$3 * 0.25;
      double $$12 = (double)$$9.w() + 0.5;
      float $$13 = 0.5F;
      gqy.a($$0, $$1, $$4, $$10, $$11, $$12, $$5, $$6, false, 0.5F, true);
   }

   private flo e() {
      return this.w.j.k();
   }

   private Set<String> a(aag.a $$0) {
      return this.a($$0.a()).stream().map(agb::a).collect(Collectors.toSet());
   }

   private String a(zv.a $$0, ji $$1) {
      double $$2 = Math.sqrt($$1.b($$0.d()));
      double $$3 = (double)Math.round($$2 * 10.0) / 10.0;
      return $$1.x() + " (dist " + $$3 + ")";
   }

   private boolean b(zv.a $$0) {
      return Objects.equals(this.z, $$0.b());
   }

   private boolean c(zv.a $$0) {
      cpr $$1 = this.w.t;
      ji $$2 = ji.a($$1.dz(), $$0.d().b(), $$1.dF());
      ji $$3 = ji.a((kb)$$0.d());
      return $$2.a($$3, 30.0);
   }

   private Collection<UUID> a(ji $$0) {
      return this.y.values().stream().filter($$1 -> $$1.a($$0)).map(zv.a::b).collect(Collectors.toSet());
   }

   private Map<ji, List<String>> f() {
      Map<ji, List<String>> $$0 = Maps.newHashMap();

      for (zv.a $$1 : this.y.values()) {
         if ($$1.f() != null && !this.x.containsKey($$1.f())) {
            $$0.computeIfAbsent($$1.f(), $$0x -> Lists.newArrayList()).add($$1.a());
         }
      }

      return $$0;
   }

   private void g() {
      gqy.a(this.w.ao(), 8).ifPresent($$0 -> this.z = $$0.cF());
   }

   static record a(aag.a a, long b) {
   }
}
