import it.unimi.dsi.fastutil.ints.IntCollection;
import it.unimi.dsi.fastutil.ints.IntRBTreeSet;
import it.unimi.dsi.fastutil.ints.IntSortedSet;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class gcj {
   final int a;
   private final List<gcj.a> b = new ArrayList<>();

   public gcj(int $$0) {
      this.a = $$0;
   }

   public void a(gcb $$0, IntCollection $$1, gcj.b $$2) {
      IntSortedSet $$3 = new IntRBTreeSet($$1);

      for (int $$4 = $$3.lastInt(); $$4 >= $$0.a() && (this.a() || !$$3.isEmpty()); $$4--) {
         gcd $$6 = $$0.b($$4);
         if ($$6 instanceof gce.a) {
            gce.a $$5 = (gce.a)$$6;
            boolean $$6x = this.b($$5.g());
            if ($$3.remove($$4)) {
               this.a($$5.g());
               $$2.accept($$4, $$5);
            } else if ($$6x) {
               $$2.accept($$4, $$5);
            }
         }
      }
   }

   public void a(xt $$0) {
      this.b.add(new gcj.a($$0));
   }

   public boolean b(xt $$0) {
      boolean $$1 = false;
      Iterator<gcj.a> $$2 = this.b.iterator();

      while ($$2.hasNext()) {
         gcj.a $$3 = $$2.next();
         if ($$3.a($$0)) {
            $$1 = true;
            if ($$3.a()) {
               $$2.remove();
            }
         }
      }

      return $$1;
   }

   public boolean a() {
      return !this.b.isEmpty();
   }

   class a {
      private final Set<xp> b;
      private xt c;
      private boolean d = true;
      private int e;

      a(final xt $$0) {
         this.b = new ObjectOpenHashSet($$0.m().d().a());
         this.c = $$0;
      }

      boolean a(xt $$0) {
         if ($$0.equals(this.c)) {
            return false;
         } else {
            boolean $$1 = this.b.remove($$0.l());
            if (this.d && this.c.g().equals($$0.g())) {
               if (this.c.k().a($$0.k())) {
                  $$1 = true;
                  this.c = $$0;
               } else {
                  this.d = false;
               }
            }

            if ($$1) {
               this.e++;
            }

            return $$1;
         }
      }

      boolean a() {
         return this.e >= gcj.this.a || !this.d && this.b.isEmpty();
      }
   }

   public interface b {
      void accept(int var1, gce.a var2);
   }
}
