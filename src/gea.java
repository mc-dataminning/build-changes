import com.google.common.collect.Queues;
import com.mojang.authlib.GameProfile;
import java.time.Instant;
import java.util.Deque;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class gea {
   private static final xj a = xj.c("chat.validation_error").a(n.m, n.u);
   private final fke b;
   private final Deque<gea.a> c = Queues.newArrayDeque();
   private long d;
   private long e;

   public gea(fke $$0) {
      this.b = $$0;
   }

   public void a() {
      if (this.d != 0L) {
         if (ae.c() >= this.e + this.d) {
            gea.a $$0 = this.c.poll();

            while ($$0 != null && !$$0.a()) {
               $$0 = this.c.poll();
            }
         }
      }
   }

   public void a(double $$0) {
      long $$1 = (long)($$0 * 1000.0);
      if ($$1 == 0L && this.d > 0L) {
         this.c.forEach(gea.a::a);
         this.c.clear();
      }

      this.d = $$1;
   }

   public void b() {
      this.c.remove().a();
   }

   public long c() {
      return (long)this.c.size();
   }

   public void d() {
      this.c.forEach(gea.a::a);
      this.c.clear();
   }

   public boolean a(xv $$0) {
      return this.c.removeIf($$1 -> $$0.equals($$1.b()));
   }

   private boolean e() {
      return this.d > 0L && ae.c() < this.e + this.d;
   }

   private void a(@Nullable xv $$0, BooleanSupplier $$1) {
      if (this.e()) {
         this.c.add(new gea.a($$0, $$1));
      } else {
         $$1.getAsBoolean();
      }
   }

   public void a(xz $$0, GameProfile $$1, xf.a $$2) {
      boolean $$3 = this.b.n.ai().c();
      xz $$4 = $$3 ? $$0.a() : $$0;
      xj $$5 = $$2.a($$4.d());
      Instant $$6 = Instant.now();
      this.a($$0.l(), () -> {
         boolean $$6x = this.a($$2, $$0, $$5, $$1, $$3, $$6);
         gdi $$7 = this.b.L();
         if ($$7 != null) {
            $$7.a($$0, $$6x);
         }

         return $$6x;
      });
   }

   public void a(UUID $$0, xf.a $$1) {
      this.a(null, () -> {
         if (this.b.a($$0)) {
            return false;
         } else {
            xj $$2 = $$1.a(a);
            this.b.m.d().a($$2, null, fjy.d());
            this.e = ae.c();
            return true;
         }
      });
   }

   public void a(xj $$0, xf.a $$1) {
      Instant $$2 = Instant.now();
      this.a(null, () -> {
         xj $$3 = $$1.a($$0);
         this.b.m.d().a($$3);
         this.a($$1, $$0);
         this.a($$3, $$2);
         this.e = ae.c();
         return true;
      });
   }

   private boolean a(xf.a $$0, xz $$1, xj $$2, GameProfile $$3, boolean $$4, Instant $$5) {
      gec $$6 = this.a($$1, $$2, $$5);
      if ($$4 && $$6.a()) {
         return false;
      } else if (!this.b.a($$1.g()) && !$$1.j()) {
         fjy $$7 = $$6.a($$1);
         xv $$8 = $$1.l();
         xn $$9 = $$1.o();
         if ($$9.a()) {
            this.b.m.d().a($$2, $$8, $$7);
            this.a($$0, $$1.d());
         } else {
            xj $$10 = $$9.b($$1.c());
            if ($$10 != null) {
               this.b.m.d().a($$0.a($$10), $$8, $$7);
               this.a($$0, $$10);
            }
         }

         this.a($$1, $$0, $$3, $$6);
         this.e = ae.c();
         return true;
      } else {
         return false;
      }
   }

   private void a(xf.a $$0, xj $$1) {
      this.b.aZ().a($$0.b($$1));
   }

   private gec a(xz $$0, xj $$1, Instant $$2) {
      return this.a($$0.g()) ? gec.a : gec.a($$0, $$1, $$2);
   }

   private void a(xz $$0, xf.a $$1, GameProfile $$2, gec $$3) {
      geb $$4 = this.b.bb().b();
      $$4.a(gee.a($$2, $$0, $$3));
   }

   private void a(xj $$0, Instant $$1) {
      geb $$2 = this.b.bb().b();
      $$2.a(gee.a($$0, $$1));
   }

   public void a(xj $$0, boolean $$1) {
      if (!this.b.n.ag().c() || !this.b.a(this.a($$0))) {
         if ($$1) {
            this.b.m.a($$0, false);
         } else {
            this.b.m.d().a($$0);
            this.a($$0, Instant.now());
         }

         this.b.aZ().b($$0);
      }
   }

   private UUID a(xj $$0) {
      String $$1 = bah.a($$0);
      String $$2 = StringUtils.substringBetween($$1, "<", ">");
      return $$2 == null ? ae.e : this.b.aN().a($$2);
   }

   private boolean a(UUID $$0) {
      if (this.b.T() && this.b.t != null) {
         UUID $$1 = this.b.t.gf().getId();
         return $$1.equals($$0);
      } else {
         return false;
      }
   }

   static record a(@Nullable xv a, BooleanSupplier b) {
      public boolean a() {
         return this.b.getAsBoolean();
      }

      @Nullable
      public xv b() {
         return this.a;
      }

      public BooleanSupplier c() {
         return this.b;
      }
   }
}
