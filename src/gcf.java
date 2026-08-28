import com.google.common.collect.Queues;
import com.mojang.authlib.GameProfile;
import java.time.Instant;
import java.util.Deque;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class gcf {
   private static final xe a = xe.c("chat.validation_error").a(n.m, n.u);
   private final fip b;
   private final Deque<gcf.a> c = Queues.newArrayDeque();
   private long d;
   private long e;

   public gcf(fip $$0) {
      this.b = $$0;
   }

   public void a() {
      if (this.d != 0L) {
         if (ad.c() >= this.e + this.d) {
            gcf.a $$0 = this.c.poll();

            while ($$0 != null && !$$0.a()) {
               $$0 = this.c.poll();
            }
         }
      }
   }

   public void a(double $$0) {
      long $$1 = (long)($$0 * 1000.0);
      if ($$1 == 0L && this.d > 0L) {
         this.c.forEach(gcf.a::a);
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
      this.c.forEach(gcf.a::a);
      this.c.clear();
   }

   public boolean a(xq $$0) {
      return this.c.removeIf($$1 -> $$0.equals($$1.b()));
   }

   private boolean e() {
      return this.d > 0L && ad.c() < this.e + this.d;
   }

   private void a(@Nullable xq $$0, BooleanSupplier $$1) {
      if (this.e()) {
         this.c.add(new gcf.a($$0, $$1));
      } else {
         $$1.getAsBoolean();
      }
   }

   public void a(xu $$0, GameProfile $$1, xa.a $$2) {
      boolean $$3 = this.b.n.ai().c();
      xu $$4 = $$3 ? $$0.a() : $$0;
      xe $$5 = $$2.a($$4.d());
      Instant $$6 = Instant.now();
      this.a($$0.l(), () -> {
         boolean $$6x = this.a($$2, $$0, $$5, $$1, $$3, $$6);
         gbn $$7 = this.b.L();
         if ($$7 != null) {
            $$7.a($$0, $$6x);
         }

         return $$6x;
      });
   }

   public void a(UUID $$0, xa.a $$1) {
      this.a(null, () -> {
         if (this.b.a($$0)) {
            return false;
         } else {
            xe $$2 = $$1.a(a);
            this.b.m.d().a($$2, null, fij.d());
            this.e = ad.c();
            return true;
         }
      });
   }

   public void a(xe $$0, xa.a $$1) {
      Instant $$2 = Instant.now();
      this.a(null, () -> {
         xe $$3 = $$1.a($$0);
         this.b.m.d().a($$3);
         this.a($$1, $$0);
         this.a($$3, $$2);
         this.e = ad.c();
         return true;
      });
   }

   private boolean a(xa.a $$0, xu $$1, xe $$2, GameProfile $$3, boolean $$4, Instant $$5) {
      gch $$6 = this.a($$1, $$2, $$5);
      if ($$4 && $$6.a()) {
         return false;
      } else if (!this.b.a($$1.g()) && !$$1.j()) {
         fij $$7 = $$6.a($$1);
         xq $$8 = $$1.l();
         xi $$9 = $$1.o();
         if ($$9.a()) {
            this.b.m.d().a($$2, $$8, $$7);
            this.a($$0, $$1.d());
         } else {
            xe $$10 = $$9.b($$1.c());
            if ($$10 != null) {
               this.b.m.d().a($$0.a($$10), $$8, $$7);
               this.a($$0, $$10);
            }
         }

         this.a($$1, $$0, $$3, $$6);
         this.e = ad.c();
         return true;
      } else {
         return false;
      }
   }

   private void a(xa.a $$0, xe $$1) {
      this.b.aZ().a($$0.b($$1));
   }

   private gch a(xu $$0, xe $$1, Instant $$2) {
      return this.a($$0.g()) ? gch.a : gch.a($$0, $$1, $$2);
   }

   private void a(xu $$0, xa.a $$1, GameProfile $$2, gch $$3) {
      gcg $$4 = this.b.bb().b();
      $$4.a(gcj.a($$2, $$0, $$3));
   }

   private void a(xe $$0, Instant $$1) {
      gcg $$2 = this.b.bb().b();
      $$2.a(gcj.a($$0, $$1));
   }

   public void a(xe $$0, boolean $$1) {
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

   private UUID a(xe $$0) {
      String $$1 = baa.a($$0);
      String $$2 = StringUtils.substringBetween($$1, "<", ">");
      return $$2 == null ? ad.e : this.b.aO().a($$2);
   }

   private boolean a(UUID $$0) {
      if (this.b.T() && this.b.t != null) {
         UUID $$1 = this.b.t.gc().getId();
         return $$1.equals($$0);
      } else {
         return false;
      }
   }

   static record a(@Nullable xq a, BooleanSupplier b) {
      public boolean a() {
         return this.b.getAsBoolean();
      }

      @Nullable
      public xq b() {
         return this.a;
      }

      public BooleanSupplier c() {
         return this.b;
      }
   }
}
