import com.google.common.collect.Queues;
import com.mojang.authlib.GameProfile;
import java.time.Instant;
import java.util.Deque;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class fzx {
   private static final wz a = wz.c("chat.validation_error").a(n.m, n.u);
   private final fgm b;
   private final Deque<fzx.a> c = Queues.newArrayDeque();
   private long d;
   private long e;

   public fzx(fgm $$0) {
      this.b = $$0;
   }

   public void a() {
      if (this.d != 0L) {
         if (ad.c() >= this.e + this.d) {
            fzx.a $$0 = this.c.poll();

            while ($$0 != null && !$$0.a()) {
               $$0 = this.c.poll();
            }
         }
      }
   }

   public void a(double $$0) {
      long $$1 = (long)($$0 * 1000.0);
      if ($$1 == 0L && this.d > 0L) {
         this.c.forEach(fzx.a::a);
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
      this.c.forEach(fzx.a::a);
      this.c.clear();
   }

   public boolean a(xl $$0) {
      return this.c.removeIf($$1 -> $$0.equals($$1.b()));
   }

   private boolean e() {
      return this.d > 0L && ad.c() < this.e + this.d;
   }

   private void a(@Nullable xl $$0, BooleanSupplier $$1) {
      if (this.e()) {
         this.c.add(new fzx.a($$0, $$1));
      } else {
         $$1.getAsBoolean();
      }
   }

   public void a(xp $$0, GameProfile $$1, wv.a $$2) {
      boolean $$3 = this.b.m.ag().c();
      xp $$4 = $$3 ? $$0.a() : $$0;
      wz $$5 = $$2.a($$4.d());
      Instant $$6 = Instant.now();
      this.a($$0.l(), () -> {
         boolean $$6x = this.a($$2, $$0, $$5, $$1, $$3, $$6);
         fze $$7 = this.b.L();
         if ($$7 != null) {
            $$7.a($$0, $$6x);
         }

         return $$6x;
      });
   }

   public void a(UUID $$0, wv.a $$1) {
      this.a(null, () -> {
         if (this.b.a($$0)) {
            return false;
         } else {
            wz $$2 = $$1.a(a);
            this.b.l.d().a($$2, null, fgh.d());
            this.e = ad.c();
            return true;
         }
      });
   }

   public void a(wz $$0, wv.a $$1) {
      Instant $$2 = Instant.now();
      this.a(null, () -> {
         wz $$3 = $$1.a($$0);
         this.b.l.d().a($$3);
         this.a($$1, $$0);
         this.a($$3, $$2);
         this.e = ad.c();
         return true;
      });
   }

   private boolean a(wv.a $$0, xp $$1, wz $$2, GameProfile $$3, boolean $$4, Instant $$5) {
      fzz $$6 = this.a($$1, $$2, $$5);
      if ($$4 && $$6.a()) {
         return false;
      } else if (!this.b.a($$1.g()) && !$$1.j()) {
         fgh $$7 = $$6.a($$1);
         xl $$8 = $$1.l();
         xd $$9 = $$1.o();
         if ($$9.a()) {
            this.b.l.d().a($$2, $$8, $$7);
            this.a($$0, $$1.d());
         } else {
            wz $$10 = $$9.b($$1.c());
            if ($$10 != null) {
               this.b.l.d().a($$0.a($$10), $$8, $$7);
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

   private void a(wv.a $$0, wz $$1) {
      this.b.aV().a($$0.b($$1));
   }

   private fzz a(xp $$0, wz $$1, Instant $$2) {
      return this.a($$0.g()) ? fzz.a : fzz.a($$0, $$1, $$2);
   }

   private void a(xp $$0, wv.a $$1, GameProfile $$2, fzz $$3) {
      fzy $$4 = this.b.aX().b();
      $$4.a(gab.a($$2, $$0, $$3));
   }

   private void a(wz $$0, Instant $$1) {
      fzy $$2 = this.b.aX().b();
      $$2.a(gab.a($$0, $$1));
   }

   public void a(wz $$0, boolean $$1) {
      if (!this.b.m.ae().c() || !this.b.a(this.a($$0))) {
         if ($$1) {
            this.b.l.a($$0, false);
         } else {
            this.b.l.d().a($$0);
            this.a($$0, Instant.now());
         }

         this.b.aV().b($$0);
      }
   }

   private UUID a(wz $$0) {
      String $$1 = azj.a($$0);
      String $$2 = StringUtils.substringBetween($$1, "<", ">");
      return $$2 == null ? ad.e : this.b.aL().a($$2);
   }

   private boolean a(UUID $$0) {
      if (this.b.T() && this.b.s != null) {
         UUID $$1 = this.b.s.fY().getId();
         return $$1.equals($$0);
      } else {
         return false;
      }
   }

   static record a(@Nullable xl a, BooleanSupplier b) {
      public boolean a() {
         return this.b.getAsBoolean();
      }

      @Nullable
      public xl b() {
         return this.a;
      }

      public BooleanSupplier c() {
         return this.b;
      }
   }
}
