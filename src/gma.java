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

public class gma implements gmh.a {
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
   private final fji w;
   private final Map<jh, gma.a> x = new HashMap<>();
   private final Map<UUID, aao.a> y = new HashMap<>();
   @Nullable
   private UUID z;

   public gma(fji $$0) {
      this.w = $$0;
   }

   @Override
   public void a() {
      this.x.clear();
      this.y.clear();
      this.z = null;
   }

   public void a(aaz.a $$0, long $$1) {
      this.x.put($$0.a(), new gma.a($$0, $$1));
   }

   public void a(aao.a $$0) {
      this.y.put($$0.b(), $$0);
   }

   public void a(int $$0) {
      this.y.values().removeIf($$1 -> $$1.c() == $$0);
   }

   @Override
   public void a(feb $$0, gih $$1, double $$2, double $$3, double $$4) {
      this.c();
      this.b();
      this.a($$0, $$1);
      if (!this.w.t.R_()) {
         this.g();
      }
   }

   private void b() {
      this.y.entrySet().removeIf($$0 -> this.w.s.a($$0.getValue().c()) == null);
   }

   private void c() {
      long $$0 = this.w.s.aa() - 20L;
      this.x.entrySet().removeIf($$1 -> $$1.getValue().b() < $$0);
   }

   private void a(feb $$0, gih $$1) {
      jh $$2 = this.e().c();
      this.y.values().forEach($$2x -> {
         if (this.c($$2x)) {
            this.b($$0, $$1, $$2x);
         }
      });
      this.b($$0, $$1);

      for (jh $$3 : this.x.keySet()) {
         if ($$2.a($$3, 30.0)) {
            a($$0, $$1, $$3);
         }
      }

      Map<jh, Set<UUID>> $$4 = this.d();
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

   private Map<jh, Set<UUID>> d() {
      Map<jh, Set<UUID>> $$0 = Maps.newHashMap();
      this.y.values().forEach($$1 -> $$1.j().forEach($$2 -> $$0.computeIfAbsent($$2, $$0xxx -> Sets.newHashSet()).add($$1.b())));
      return $$0;
   }

   private void b(feb $$0, gih $$1) {
      Map<jh, Set<UUID>> $$2 = Maps.newHashMap();
      this.y.values().forEach($$1x -> {
         if ($$1x.g() != null) {
            $$2.computeIfAbsent($$1x.g(), $$0xx -> new HashSet<>()).add($$1x.b());
         }
      });
      $$2.forEach(($$2x, $$3) -> {
         Set<String> $$4 = $$3.stream().map(agr::a).collect(Collectors.toSet());
         int $$5 = 1;
         a($$0, $$1, $$4.toString(), $$2x, $$5++, -256);
         a($$0, $$1, "Flower", $$2x, $$5++, -1);
         float $$6 = 0.05F;
         gmh.a($$0, $$1, $$2x, 0.05F, 0.8F, 0.8F, 0.0F, 0.3F);
      });
   }

   private static String a(Collection<UUID> $$0) {
      if ($$0.isEmpty()) {
         return "-";
      } else {
         return $$0.size() > 3 ? $$0.size() + " bees" : $$0.stream().map(agr::a).collect(Collectors.toSet()).toString();
      }
   }

   private static void a(feb $$0, gih $$1, jh $$2) {
      float $$3 = 0.05F;
      gmh.a($$0, $$1, $$2, 0.05F, 0.2F, 0.2F, 1.0F, 0.3F);
   }

   private void a(feb $$0, gih $$1, jh $$2, List<String> $$3) {
      float $$4 = 0.05F;
      gmh.a($$0, $$1, $$2, 0.05F, 0.2F, 0.2F, 1.0F, 0.3F);
      a($$0, $$1, $$3 + "", $$2, 0, -256);
      a($$0, $$1, "Ghost Hive", $$2, 1, -65536);
   }

   private void a(feb $$0, gih $$1, aaz.a $$2, Collection<UUID> $$3) {
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

   private void a(feb $$0, gih $$1, aao.a $$2) {
      if ($$2.e() != null) {
         gmq.a($$0, $$1, $$2.e(), 0.5F, false, false, this.e().b().a(), this.e().b().b(), this.e().b().c());
      }
   }

   private void b(feb $$0, gih $$1, aao.a $$2) {
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

   private static void a(feb $$0, gih $$1, String $$2, aaz.a $$3, int $$4, int $$5) {
      a($$0, $$1, $$2, $$3.a(), $$4, $$5);
   }

   private static void a(feb $$0, gih $$1, String $$2, jh $$3, int $$4, int $$5) {
      double $$6 = 1.3;
      double $$7 = 0.2;
      double $$8 = (double)$$3.u() + 0.5;
      double $$9 = (double)$$3.v() + 1.3 + (double)$$4 * 0.2;
      double $$10 = (double)$$3.w() + 0.5;
      gmh.a($$0, $$1, $$2, $$8, $$9, $$10, $$5, 0.02F, true, 0.0F, true);
   }

   private static void a(feb $$0, gih $$1, ka $$2, int $$3, String $$4, int $$5, float $$6) {
      double $$7 = 2.4;
      double $$8 = 0.25;
      jh $$9 = jh.a($$2);
      double $$10 = (double)$$9.u() + 0.5;
      double $$11 = $$2.b() + 2.4 + (double)$$3 * 0.25;
      double $$12 = (double)$$9.w() + 0.5;
      float $$13 = 0.5F;
      gmh.a($$0, $$1, $$4, $$10, $$11, $$12, $$5, $$6, false, 0.5F, true);
   }

   private fir e() {
      return this.w.j.k();
   }

   private Set<String> a(aaz.a $$0) {
      return this.a($$0.a()).stream().map(agr::a).collect(Collectors.toSet());
   }

   private String a(aao.a $$0, jh $$1) {
      double $$2 = Math.sqrt($$1.b($$0.d()));
      double $$3 = (double)Math.round($$2 * 10.0) / 10.0;
      return $$1.x() + " (dist " + $$3 + ")";
   }

   private boolean b(aao.a $$0) {
      return Objects.equals(this.z, $$0.b());
   }

   private boolean c(aao.a $$0) {
      com $$1 = this.w.t;
      jh $$2 = jh.a($$1.dC(), $$0.d().b(), $$1.dI());
      jh $$3 = jh.a((ka)$$0.d());
      return $$2.a($$3, 30.0);
   }

   private Collection<UUID> a(jh $$0) {
      return this.y.values().stream().filter($$1 -> $$1.a($$0)).map(aao.a::b).collect(Collectors.toSet());
   }

   private Map<jh, List<String>> f() {
      Map<jh, List<String>> $$0 = Maps.newHashMap();

      for (aao.a $$1 : this.y.values()) {
         if ($$1.f() != null && !this.x.containsKey($$1.f())) {
            $$0.computeIfAbsent($$1.f(), $$0x -> Lists.newArrayList()).add($$1.a());
         }
      }

      return $$0;
   }

   private void g() {
      gmh.a(this.w.ao(), 8).ifPresent($$0 -> this.z = $$0.cH());
   }

   static record a(aaz.a a, long b) {
   }
}
