import com.google.common.collect.Queues;
import com.mojang.authlib.GameProfile;
import java.time.Instant;
import java.util.Deque;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class gmx {
   private static final xc a = xc.c("chat.validation_error").a(o.m, o.u);
   private final frf b;
   private final Deque<gmx.a> c = Queues.newArrayDeque();
   private long d;
   private long e;

   public gmx(frf $$0) {
      this.b = $$0;
   }

   public void a() {
      if (this.d != 0L) {
         if (ag.c() >= this.e + this.d) {
            gmx.a $$0 = this.c.poll();

            while ($$0 != null && !$$0.a()) {
               $$0 = this.c.poll();
            }
         }
      }
   }

   public void a(double $$0) {
      long $$1 = (long)($$0 * 1000.0);
      if ($$1 == 0L && this.d > 0L) {
         this.c.forEach(gmx.a::a);
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
      this.c.forEach(gmx.a::a);
      this.c.clear();
   }

   public boolean a(xo $$0) {
      return this.c.removeIf($$1 -> $$0.equals($$1.b()));
   }

   private boolean e() {
      return this.d > 0L && ag.c() < this.e + this.d;
   }

   private void a(@Nullable xo $$0, BooleanSupplier $$1) {
      if (this.e()) {
         this.c.add(new gmx.a($$0, $$1));
      } else {
         $$1.getAsBoolean();
      }
   }

   public void a(xs $$0, GameProfile $$1, wy.a $$2) {
      boolean $$3 = this.b.n.aj().c();
      xs $$4 = $$3 ? $$0.a() : $$0;
      xc $$5 = $$2.a($$4.d());
      Instant $$6 = Instant.now();
      this.a($$0.l(), () -> {
         boolean $$6x = this.a($$2, $$0, $$5, $$1, $$3, $$6);
         gme $$7 = this.b.L();
         if ($$7 != null && $$0.l() != null) {
            $$7.a($$0.l(), $$6x);
         }

         return $$6x;
      });
   }

   public void a(UUID $$0, @Nullable xo $$1, wy.a $$2) {
      this.a(null, () -> {
         gme $$3 = this.b.L();
         if ($$3 != null && $$1 != null) {
            $$3.a($$1, false);
         }

         if (this.b.a($$0)) {
            return false;
         } else {
            xc $$4 = $$2.a(a);
            this.b.m.d().a($$4, null, fqz.d());
            this.e = ag.c();
            return true;
         }
      });
   }

   public void a(xc $$0, wy.a $$1) {
      Instant $$2 = Instant.now();
      this.a(null, () -> {
         xc $$3 = $$1.a($$0);
         this.b.m.d().a($$3);
         this.a($$1, $$0);
         this.a($$3, $$2);
         this.e = ag.c();
         return true;
      });
   }

   private boolean a(wy.a $$0, xs $$1, xc $$2, GameProfile $$3, boolean $$4, Instant $$5) {
      gmz $$6 = this.a($$1, $$2, $$5);
      if ($$4 && $$6.a()) {
         return false;
      } else if (!this.b.a($$1.g()) && !$$1.j()) {
         fqz $$7 = $$6.a($$1);
         xo $$8 = $$1.l();
         xg $$9 = $$1.o();
         if ($$9.a()) {
            this.b.m.d().a($$2, $$8, $$7);
            this.a($$0, $$1.d());
         } else {
            xc $$10 = $$9.b($$1.c());
            if ($$10 != null) {
               this.b.m.d().a($$0.a($$10), $$8, $$7);
               this.a($$0, $$10);
            }
         }

         this.a($$1, $$0, $$3, $$6);
         this.e = ag.c();
         return true;
      } else {
         return false;
      }
   }

   private void a(wy.a $$0, xc $$1) {
      this.b.aY().a($$0.b($$1));
   }

   private gmz a(xs $$0, xc $$1, Instant $$2) {
      return this.a($$0.g()) ? gmz.a : gmz.a($$0, $$1, $$2);
   }

   private void a(xs $$0, wy.a $$1, GameProfile $$2, gmz $$3) {
      gmy $$4 = this.b.ba().b();
      $$4.a(gnb.a($$2, $$0, $$3));
   }

   private void a(xc $$0, Instant $$1) {
      gmy $$2 = this.b.ba().b();
      $$2.a(gnb.a($$0, $$1));
   }

   public void a(xc $$0, boolean $$1) {
      if (!this.b.n.ah().c() || !this.b.a(this.a($$0))) {
         if ($$1) {
            this.b.m.a($$0, false);
         } else {
            this.b.m.d().a($$0);
            this.a($$0, Instant.now());
         }

         this.b.aY().b($$0);
      }
   }

   private UUID a(xc $$0) {
      String $$1 = ban.a($$0);
      String $$2 = StringUtils.substringBetween($$1, "<", ">");
      return $$2 == null ? ag.e : this.b.aN().a($$2);
   }

   private boolean a(UUID $$0) {
      if (this.b.T() && this.b.t != null) {
         UUID $$1 = this.b.t.gi().getId();
         return $$1.equals($$0);
      } else {
         return false;
      }
   }

   static record a(@Nullable xo a, BooleanSupplier b) {
      public boolean a() {
         return this.b.getAsBoolean();
      }

      @Nullable
      public xo b() {
         return this.a;
      }

      public BooleanSupplier c() {
         return this.b;
      }
   }
}
