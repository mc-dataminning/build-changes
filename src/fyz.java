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

public class fyz extends fow<fyx> {
   private final fza a;
   private final List<fyx> m = Lists.newArrayList();
   @Nullable
   private String n;

   public fyz(fza $$0, flh $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$1, $$2, $$3, $$4, $$5);
      this.a = $$0;
   }

   @Override
   protected void c(fob $$0) {
   }

   @Override
   protected void b(fob $$0) {
   }

   @Override
   protected void d(fob $$0) {
      $$0.c(this.F(), this.G() + 4, this.H(), this.I());
   }

   public void a(Collection<UUID> $$0, double $$1, boolean $$2) {
      Map<UUID, fyx> $$3 = new HashMap<>();
      this.a($$0, $$3);
      this.a($$3, $$2);
      this.a($$3.values(), $$1);
   }

   private void a(Collection<UUID> $$0, Map<UUID, fyx> $$1) {
      gfx $$2 = this.c.t.j;

      for (UUID $$3 : $$0) {
         ggi $$4 = $$2.a($$3);
         if ($$4 != null) {
            boolean $$5 = $$4.d();
            $$1.put($$3, new fyx(this.c, this.a, $$3, $$4.a().getName(), $$4::g, $$5));
         }
      }
   }

   private void a(Map<UUID, fyx> $$0, boolean $$1) {
      for (GameProfile $$3 : a(this.c.ba().b())) {
         fyx $$4;
         if ($$1) {
            $$4 = $$0.computeIfAbsent($$3.getId(), $$1x -> {
               fyx $$2 = new fyx(this.c, this.a, $$3.getId(), $$3.getName(), this.c.an().a($$3), true);
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

   private static Collection<GameProfile> a(ggr $$0) {
      Set<GameProfile> $$1 = new ObjectLinkedOpenHashSet();

      for (int $$2 = $$0.b(); $$2 >= $$0.a(); $$2--) {
         ggt $$3 = $$0.b($$2);
         if ($$3 instanceof ggu.a) {
            ggu.a $$4 = (ggu.a)$$3;
            if ($$4.g().i()) {
               $$1.add($$4.f());
            }
         }
      }

      return $$1;
   }

   private void c() {
      this.m.sort(Comparator.<fyx, Integer>comparing($$0 -> {
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
      }).thenComparing(fyx::c, String::compareToIgnoreCase));
   }

   private void a(Collection<fyx> $$0, double $$1) {
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

   public void a(ggi $$0, fza.a $$1) {
      UUID $$2 = $$0.a().getId();

      for (fyx $$3 : this.m) {
         if ($$3.g().equals($$2)) {
            $$3.c(false);
            return;
         }
      }

      if (($$1 == fza.a.a || this.c.aN().c($$2)) && (Strings.isNullOrEmpty(this.n) || $$0.a().getName().toLowerCase(Locale.ROOT).contains(this.n))) {
         boolean $$4 = $$0.d();
         fyx $$5 = new fyx(this.c, this.a, $$0.a().getId(), $$0.a().getName(), $$0::g, $$4);
         this.b((fyx)$$5);
         this.m.add($$5);
      }
   }

   public void a(UUID $$0) {
      for (fyx $$1 : this.m) {
         if ($$1.g().equals($$0)) {
            $$1.c(true);
            return;
         }
      }
   }
}
