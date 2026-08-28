import com.google.common.collect.Queues;
import com.mojang.authlib.GameProfile;
import java.time.Instant;
import java.util.Deque;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class gcq {
   private static final xh a = xh.c("chat.validation_error").a(n.m, n.u);
   private final fja b;
   private final Deque<gcq.a> c = Queues.newArrayDeque();
   private long d;
   private long e;

   public gcq(fja $$0) {
      this.b = $$0;
   }

   public void a() {
      if (this.d != 0L) {
         if (ad.c() >= this.e + this.d) {
            gcq.a $$0 = this.c.poll();

            while ($$0 != null && !$$0.a()) {
               $$0 = this.c.poll();
            }
         }
      }
   }

   public void a(double $$0) {
      long $$1 = (long)($$0 * 1000.0);
      if ($$1 == 0L && this.d > 0L) {
         this.c.forEach(gcq.a::a);
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
      this.c.forEach(gcq.a::a);
      this.c.clear();
   }

   public boolean a(xt $$0) {
      return this.c.removeIf($$1 -> $$0.equals($$1.b()));
   }

   private boolean e() {
      return this.d > 0L && ad.c() < this.e + this.d;
   }

   private void a(@Nullable xt $$0, BooleanSupplier $$1) {
      if (this.e()) {
         this.c.add(new gcq.a($$0, $$1));
      } else {
         $$1.getAsBoolean();
      }
   }

   public void a(xx $$0, GameProfile $$1, xd.a $$2) {
      boolean $$3 = this.b.n.ai().c();
      xx $$4 = $$3 ? $$0.a() : $$0;
      xh $$5 = $$2.a($$4.d());
      Instant $$6 = Instant.now();
      this.a($$0.l(), () -> {
         boolean $$6x = this.a($$2, $$0, $$5, $$1, $$3, $$6);
         gby $$7 = this.b.L();
         if ($$7 != null) {
            $$7.a($$0, $$6x);
         }

         return $$6x;
      });
   }

   public void a(UUID $$0, xd.a $$1) {
      this.a(null, () -> {
         if (this.b.a($$0)) {
            return false;
         } else {
            xh $$2 = $$1.a(a);
            this.b.m.d().a($$2, null, fiu.d());
            this.e = ad.c();
            return true;
         }
      });
   }

   public void a(xh $$0, xd.a $$1) {
      Instant $$2 = Instant.now();
      this.a(null, () -> {
         xh $$3 = $$1.a($$0);
         this.b.m.d().a($$3);
         this.a($$1, $$0);
         this.a($$3, $$2);
         this.e = ad.c();
         return true;
      });
   }

   private boolean a(xd.a $$0, xx $$1, xh $$2, GameProfile $$3, boolean $$4, Instant $$5) {
      gcs $$6 = this.a($$1, $$2, $$5);
      if ($$4 && $$6.a()) {
         return false;
      } else if (!this.b.a($$1.g()) && !$$1.j()) {
         fiu $$7 = $$6.a($$1);
         xt $$8 = $$1.l();
         xl $$9 = $$1.o();
         if ($$9.a()) {
            this.b.m.d().a($$2, $$8, $$7);
            this.a($$0, $$1.d());
         } else {
            xh $$10 = $$9.b($$1.c());
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

   private void a(xd.a $$0, xh $$1) {
      this.b.ba().a($$0.b($$1));
   }

   private gcs a(xx $$0, xh $$1, Instant $$2) {
      return this.a($$0.g()) ? gcs.a : gcs.a($$0, $$1, $$2);
   }

   private void a(xx $$0, xd.a $$1, GameProfile $$2, gcs $$3) {
      gcr $$4 = this.b.bc().b();
      $$4.a(gcu.a($$2, $$0, $$3));
   }

   private void a(xh $$0, Instant $$1) {
      gcr $$2 = this.b.bc().b();
      $$2.a(gcu.a($$0, $$1));
   }

   public void a(xh $$0, boolean $$1) {
      if (!this.b.n.ag().c() || !this.b.a(this.a($$0))) {
         if ($$1) {
            this.b.m.a($$0, false);
         } else {
            this.b.m.d().a($$0);
            this.a($$0, Instant.now());
         }

         this.b.ba().b($$0);
      }
   }

   private UUID a(xh $$0) {
      String $$1 = bae.a($$0);
      String $$2 = StringUtils.substringBetween($$1, "<", ">");
      return $$2 == null ? ad.e : this.b.aO().a($$2);
   }

   private boolean a(UUID $$0) {
      if (this.b.T() && this.b.t != null) {
         UUID $$1 = this.b.t.gj().getId();
         return $$1.equals($$0);
      } else {
         return false;
      }
   }

   static record a(@Nullable xt a, BooleanSupplier b) {
      public boolean a() {
         return this.b.getAsBoolean();
      }

      @Nullable
      public xt b() {
         return this.a;
      }

      public BooleanSupplier c() {
         return this.b;
      }
   }
}
