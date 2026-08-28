import com.google.common.collect.Queues;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class fwy {
   private static final int a = 5;
   private static final int b = -1;
   final frf c;
   private final List<fwy.a<?>> d = new ArrayList<>();
   private final BitSet e = new BitSet(5);
   private final Deque<fwx> f = Queues.newArrayDeque();
   private final Set<awq> g = new HashSet<>();

   public fwy(frf $$0) {
      this.c = $$0;
   }

   public void a() {
      MutableBoolean $$0 = new MutableBoolean(false);
      this.d.removeIf($$1 -> {
         fwx.a $$2 = $$1.h;
         $$1.c();
         if ($$1.h != $$2 && $$0.isFalse()) {
            $$0.setTrue();
            $$1.h.a(this.c.ak());
         }

         if ($$1.b()) {
            this.e.clear($$1.d, $$1.d + $$1.e);
            return true;
         } else {
            return false;
         }
      });
      if (!this.f.isEmpty() && this.e() > 0) {
         this.f.removeIf($$0x -> {
            int $$1 = $$0x.h();
            int $$2 = this.a($$1);
            if ($$2 == -1) {
               return false;
            } else {
               this.d.add(new fwy.a<>($$0x, $$2, $$1));
               this.e.set($$2, $$2 + $$1);
               awq $$3 = $$0x.b();
               if ($$3 != null && this.g.add($$3)) {
                  this.c.ak().a(hou.a($$3, 1.0F, 1.0F));
               }

               return true;
            }
         });
      }

      this.g.clear();
   }

   public void a(ftz $$0) {
      if (!this.c.n.X) {
         int $$1 = $$0.a();

         for (fwy.a<?> $$2 : this.d) {
            $$2.a($$0, $$1);
         }
      }
   }

   private int a(int $$0) {
      if (this.e() >= $$0) {
         int $$1 = 0;

         for (int $$2 = 0; $$2 < 5; $$2++) {
            if (this.e.get($$2)) {
               $$1 = 0;
            } else if (++$$1 == $$0) {
               return $$2 + 1 - $$1;
            }
         }
      }

      return -1;
   }

   private int e() {
      return 5 - this.e.cardinality();
   }

   @Nullable
   public <T extends fwx> T a(Class<? extends T> $$0, Object $$1) {
      for (fwy.a<?> $$2 : this.d) {
         if ($$2 != null && $$0.isAssignableFrom($$2.a().getClass()) && $$2.a().g().equals($$1)) {
            return (T)$$2.a();
         }
      }

      for (fwx $$3 : this.f) {
         if ($$0.isAssignableFrom($$3.getClass()) && $$3.g().equals($$1)) {
            return (T)$$3;
         }
      }

      return null;
   }

   public void b() {
      this.e.clear();
      this.d.clear();
      this.f.clear();
   }

   public void a(fwx $$0) {
      this.f.add($$0);
   }

   public frf c() {
      return this.c;
   }

   public double d() {
      return this.c.n.D().c();
   }

   class a<T extends fwx> {
      private static final long b = 600L;
      private final T c;
      final int d;
      final int e;
      private long f = -1L;
      private long g = -1L;
      fwx.a h = fwx.a.b;
      private long i;
      private float j;
      private boolean k;

      a(final T $$0, final int $$1, final int $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      public T a() {
         return this.c;
      }

      public boolean b() {
         return this.k;
      }

      private void a(long $$0) {
         float $$1 = azq.a((float)($$0 - this.f) / 600.0F, 0.0F, 1.0F);
         $$1 *= $$1;
         if (this.h == fwx.a.b) {
            this.j = 1.0F - $$1;
         } else {
            this.j = $$1;
         }
      }

      public void c() {
         long $$0 = ag.c();
         if (this.f == -1L) {
            this.f = $$0;
            this.h = fwx.a.a;
         }

         if (this.h == fwx.a.a && $$0 - this.f <= 600L) {
            this.g = $$0;
         }

         this.i = $$0 - this.g;
         this.a($$0);
         this.c.a(fwy.this, this.i);
         fwx.a $$1 = this.c.a();
         if ($$1 != this.h) {
            this.f = $$0 - (long)((int)((1.0F - this.j) * 600.0F));
            this.h = $$1;
         }

         this.k = this.h == fwx.a.b && $$0 - this.f > 600L;
      }

      public void a(ftz $$0, int $$1) {
         $$0.c().a();
         $$0.c().a((float)$$1 - (float)this.c.c() * this.j, (float)(this.d * 32), 800.0F);
         this.c.a($$0, fwy.this.c.h, this.i);
         $$0.c().b();
      }
   }
}
