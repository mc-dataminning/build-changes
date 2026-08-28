import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class fvx {
   private final ke a;
   private final List<dbc<?>> b;
   private final boolean c;
   private final Set<dbc<?>> d = Sets.newHashSet();
   private final Set<dbc<?>> e = Sets.newHashSet();
   private final Set<dbc<?>> f = Sets.newHashSet();

   public fvx(ke $$0, List<dbc<?>> $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
      if ($$1.size() <= 1) {
         this.c = true;
      } else {
         this.c = a($$0, $$1);
      }
   }

   private static boolean a(ke $$0, List<dbc<?>> $$1) {
      int $$2 = $$1.size();
      cwm $$3 = $$1.get(0).b().a($$0);

      for (int $$4 = 1; $$4 < $$2; $$4++) {
         cwm $$5 = $$1.get($$4).b().a($$0);
         if (!cwm.c($$3, $$5)) {
            return false;
         }
      }

      return true;
   }

   public ke a() {
      return this.a;
   }

   public boolean b() {
      return !this.f.isEmpty();
   }

   public void a(awq $$0) {
      for (dbc<?> $$1 : this.b) {
         if ($$0.b($$1)) {
            this.f.add($$1);
         }
      }
   }

   public void a(coz $$0, int $$1, int $$2, awq $$3) {
      for (dbc<?> $$4 : this.b) {
         boolean $$5 = $$4.b().a($$1, $$2) && $$3.b($$4);
         if ($$5) {
            this.e.add($$4);
         } else {
            this.e.remove($$4);
         }

         if ($$5 && $$0.a($$4.b(), null)) {
            this.d.add($$4);
         } else {
            this.d.remove($$4);
         }
      }
   }

   public boolean a(dbc<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean c() {
      return !this.d.isEmpty();
   }

   public boolean d() {
      return !this.e.isEmpty();
   }

   public List<dbc<?>> e() {
      return this.b;
   }

   public List<dbc<?>> a(fvx.a $$0) {
      Predicate<dbc<?>> $$1 = switch ($$0) {
         case a -> this.e::contains;
         case b -> this.d::contains;
         case c -> $$0x -> this.e.contains($$0x) && !this.d.contains($$0x);
      };
      List<dbc<?>> $$2 = new ArrayList<>();

      for (dbc<?> $$3 : this.b) {
         if ($$1.test($$3)) {
            $$2.add($$3);
         }
      }

      return $$2;
   }

   public boolean f() {
      return this.c;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
