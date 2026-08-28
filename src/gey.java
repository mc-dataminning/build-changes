import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class gey extends fut<gew> {
   private final gez a;
   private final List<gew> m = Lists.newArrayList();
   @Nullable
   private String n;

   public gey(gez $$0, frf $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$1, $$2, $$3, $$4, $$5);
      this.a = $$0;
   }

   @Override
   protected void c(ftz $$0) {
   }

   @Override
   protected void b(ftz $$0) {
   }

   @Override
   protected void d(ftz $$0) {
      $$0.c(this.F(), this.G() + 4, this.H(), this.I());
   }

   public void a(Collection<UUID> $$0, double $$1, boolean $$2) {
      Map<UUID, gew> $$3 = new HashMap<>();
      this.a($$0, $$3);
      this.a($$3, $$2);
      this.a($$3.values(), $$1);
   }

   private void a(Collection<UUID> $$0, Map<UUID, gew> $$1) {
      gme $$2 = this.c.t.j;

      for (UUID $$3 : $$0) {
         gmp $$4 = $$2.a($$3);
         if ($$4 != null) {
            boolean $$5 = $$4.d();
            $$1.put($$3, new gew(this.c, this.a, $$3, $$4.a().getName(), $$4::g, $$5));
         }
      }
   }

   private void a(Map<UUID, gew> $$0, boolean $$1) {
      for (GameProfile $$3 : a(this.c.ba().b())) {
         gew $$4;
         if ($$1) {
            $$4 = $$0.computeIfAbsent($$3.getId(), $$1x -> {
               gew $$2 = new gew(this.c, this.a, $$3.getId(), $$3.getName(), this.c.an().a($$3), true);
               $$2.c(true);
               return $$2;
            });
         } else {
            $$4 = $$0.get($$3.getId());
            if ($$4 == null) {
               continue;
            }
         }

         $$4.d(true);
      }
   }

   private static Collection<GameProfile> a(gmy $$0) {
      Set<GameProfile> $$1 = new ObjectLinkedOpenHashSet();

      for (int $$2 = $$0.b(); $$2 >= $$0.a(); $$2--) {
         gna $$3 = $$0.b($$2);
         if ($$3 instanceof gnb.a) {
            gnb.a $$4 = (gnb.a)$$3;
            if ($$4.g().i()) {
               $$1.add($$4.f());
            }
         }
      }

      return $$1;
   }

   private void c() {
      this.m.sort(Comparator.<gew, Integer>comparing($$0 -> {
         if (this.c.b($$0.g())) {
            return 0;
         } else if (this.c.ba().a($$0.g())) {
            return 1;
         } else if ($$0.g().version() == 2) {
            return 4;
         } else {
            return $$0.k() ? 2 : 3;
         }
      }).thenComparing($$0 -> {
         if (!$$0.c().isBlank()) {
            int $$1 = $$0.c().codePointAt(0);
            if ($$1 == 95 || $$1 >= 97 && $$1 <= 122 || $$1 >= 65 && $$1 <= 90 || $$1 >= 48 && $$1 <= 57) {
               return 0;
            }
         }

         return 1;
      }).thenComparing(gew::c, String::compareToIgnoreCase));
   }

   private void a(Collection<gew> $$0, double $$1) {
      this.m.clear();
      this.m.addAll($$0);
      this.c();
      this.M();
      this.a(this.m);
      this.a($$1);
   }

   private void M() {
      if (this.n != null) {
         this.m.removeIf($$0 -> !$$0.c().toLowerCase(Locale.ROOT).contains(this.n));
         this.a(this.m);
      }
   }

   public void a(String $$0) {
      this.n = $$0;
   }

   public boolean b() {
      return this.m.isEmpty();
   }

   public void a(gmp $$0, gez.a $$1) {
      UUID $$2 = $$0.a().getId();

      for (gew $$3 : this.m) {
         if ($$3.g().equals($$2)) {
            $$3.c(false);
            return;
         }
      }

      if (($$1 == gez.a.a || this.c.aN().c($$2)) && (Strings.isNullOrEmpty(this.n) || $$0.a().getName().toLowerCase(Locale.ROOT).contains(this.n))) {
         boolean $$4 = $$0.d();
         gew $$5 = new gew(this.c, this.a, $$0.a().getId(), $$0.a().getName(), $$0::g, $$4);
         this.b((gew)$$5);
         this.m.add($$5);
      }
   }

   public void a(UUID $$0) {
      for (gew $$1 : this.m) {
         if ($$1.g().equals($$0)) {
            $$1.c(true);
            return;
         }
      }
   }
}
