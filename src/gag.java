import com.google.common.collect.Queues;
import com.mojang.authlib.GameProfile;
import java.time.Instant;
import java.util.Deque;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class gag {
   private static final xe a = xe.c("chat.validation_error").a(n.m, n.u);
   private final fgj b;
   private final Deque<gag.a> c = Queues.newArrayDeque();
   private long d;
   private long e;

   public gag(fgj $$0) {
      this.b = $$0;
   }

   public void a() {
      if (this.d != 0L) {
         if (ad.b() >= this.e + this.d) {
            gag.a $$0 = this.c.poll();

            while ($$0 != null && !$$0.a()) {
               $$0 = this.c.poll();
            }
         }
      }
   }

   public void a(double $$0) {
      long $$1 = (long)($$0 * 1000.0);
      if ($$1 == 0L && this.d > 0L) {
         this.c.forEach(gag.a::a);
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
      this.c.forEach(gag.a::a);
      this.c.clear();
   }

   public boolean a(xq $$0) {
      return this.c.removeIf($$1 -> $$0.equals($$1.b()));
   }

   private boolean e() {
      return this.d > 0L && ad.b() < this.e + this.d;
   }

   private void a(@Nullable xq $$0, BooleanSupplier $$1) {
      if (this.e()) {
         this.c.add(new gag.a($$0, $$1));
      } else {
         $$1.getAsBoolean();
      }
   }

   public void a(xu $$0, GameProfile $$1, xa.a $$2) {
      boolean $$3 = this.b.m.ag().c();
      xu $$4 = $$3 ? $$0.a() : $$0;
      xe $$5 = $$2.a($$4.d());
      Instant $$6 = Instant.now();
      this.a($$0.l(), () -> {
         boolean $$6x = this.a($$2, $$0, $$5, $$1, $$3, $$6);
         fzo $$7 = this.b.L();
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
            this.b.l.d().a($$2, null, fge.d());
            this.e = ad.b();
            return true;
         }
      });
   }

   public void a(xe $$0, xa.a $$1) {
      Instant $$2 = Instant.now();
      this.a(null, () -> {
         xe $$3 = $$1.a($$0);
         this.b.l.d().a($$3);
         this.a($$1, $$0);
         this.a($$3, $$2);
         this.e = ad.b();
         return true;
      });
   }

   private boolean a(xa.a $$0, xu $$1, xe $$2, GameProfile $$3, boolean $$4, Instant $$5) {
      gai $$6 = this.a($$1, $$2, $$5);
      if ($$4 && $$6.a()) {
         return false;
      } else if (!this.b.a($$1.g()) && !$$1.j()) {
         fge $$7 = $$6.a($$1);
         xq $$8 = $$1.l();
         xi $$9 = $$1.o();
         if ($$9.a()) {
            this.b.l.d().a($$2, $$8, $$7);
            this.a($$0, $$1.d());
         } else {
            xe $$10 = $$9.b($$1.c());
            if ($$10 != null) {
               this.b.l.d().a($$0.a($$10), $$8, $$7);
               this.a($$0, $$10);
            }
         }

         this.a($$1, $$0, $$3, $$6);
         this.e = ad.b();
         return true;
      } else {
         return false;
      }
   }

   private void a(xa.a $$0, xe $$1) {
      this.b.aZ().a($$0.b($$1));
   }

   private gai a(xu $$0, xe $$1, Instant $$2) {
      return this.a($$0.g()) ? gai.a : gai.a($$0, $$1, $$2);
   }

   private void a(xu $$0, xa.a $$1, GameProfile $$2, gai $$3) {
      gah $$4 = this.b.bb().b();
      $$4.a(gak.a($$2, $$0, $$3));
   }

   private void a(xe $$0, Instant $$1) {
      gah $$2 = this.b.bb().b();
      $$2.a(gak.a($$0, $$1));
   }

   public void a(xe $$0, boolean $$1) {
      if (!this.b.m.ae().c() || !this.b.a(this.a($$0))) {
         if ($$1) {
            this.b.l.a($$0, false);
         } else {
            this.b.l.d().a($$0);
            this.a($$0, Instant.now());
         }

         this.b.aZ().b($$0);
      }
   }

   private UUID a(xe $$0) {
      String $$1 = azf.a($$0);
      String $$2 = StringUtils.substringBetween($$1, "<", ">");
      return $$2 == null ? ad.e : this.b.aN().a($$2);
   }

   private boolean a(UUID $$0) {
      if (this.b.T() && this.b.s != null) {
         UUID $$1 = this.b.s.gk().getId();
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
