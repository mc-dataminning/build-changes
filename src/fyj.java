import com.google.common.collect.Queues;
import com.mojang.authlib.GameProfile;
import java.time.Instant;
import java.util.Deque;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class fyj {
   private static final xl a = xl.c("chat.validation_error").a(n.m, n.u);
   private final ffa b;
   private final Deque<fyj.a> c = Queues.newArrayDeque();
   private long d;
   private long e;

   public fyj(ffa $$0) {
      this.b = $$0;
   }

   public void a() {
      if (this.d != 0L) {
         if (ac.c() >= this.e + this.d) {
            fyj.a $$0 = this.c.poll();

            while ($$0 != null && !$$0.a()) {
               $$0 = this.c.poll();
            }
         }
      }
   }

   public void a(double $$0) {
      long $$1 = (long)($$0 * 1000.0);
      if ($$1 == 0L && this.d > 0L) {
         this.c.forEach(fyj.a::a);
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
      this.c.forEach(fyj.a::a);
      this.c.clear();
   }

   public boolean a(xx $$0) {
      return this.c.removeIf($$1 -> $$0.equals($$1.b()));
   }

   private boolean e() {
      return this.d > 0L && ac.c() < this.e + this.d;
   }

   private void a(@Nullable xx $$0, BooleanSupplier $$1) {
      if (this.e()) {
         this.c.add(new fyj.a($$0, $$1));
      } else {
         $$1.getAsBoolean();
      }
   }

   public void a(yb $$0, GameProfile $$1, xh.a $$2) {
      boolean $$3 = this.b.m.ag().c();
      yb $$4 = $$3 ? $$0.a() : $$0;
      xl $$5 = $$2.a($$4.d());
      Instant $$6 = Instant.now();
      this.a($$0.l(), () -> {
         boolean $$6x = this.a($$2, $$0, $$5, $$1, $$3, $$6);
         fxr $$7 = this.b.L();
         if ($$7 != null) {
            $$7.a($$0, $$6x);
         }

         return $$6x;
      });
   }

   public void a(UUID $$0, xh.a $$1) {
      this.a(null, () -> {
         if (this.b.a($$0)) {
            return false;
         } else {
            xl $$2 = $$1.a(a);
            this.b.l.d().a($$2, null, fev.d());
            this.e = ac.c();
            return true;
         }
      });
   }

   public void a(xl $$0, xh.a $$1) {
      Instant $$2 = Instant.now();
      this.a(null, () -> {
         xl $$3 = $$1.a($$0);
         this.b.l.d().a($$3);
         this.a($$1, $$0);
         this.a($$3, $$2);
         this.e = ac.c();
         return true;
      });
   }

   private boolean a(xh.a $$0, yb $$1, xl $$2, GameProfile $$3, boolean $$4, Instant $$5) {
      fyl $$6 = this.a($$1, $$2, $$5);
      if ($$4 && $$6.a()) {
         return false;
      } else if (!this.b.a($$1.g()) && !$$1.j()) {
         fev $$7 = $$6.a($$1);
         xx $$8 = $$1.l();
         xp $$9 = $$1.o();
         if ($$9.a()) {
            this.b.l.d().a($$2, $$8, $$7);
            this.a($$0, $$1.d());
         } else {
            xl $$10 = $$9.b($$1.c());
            if ($$10 != null) {
               this.b.l.d().a($$0.a($$10), $$8, $$7);
               this.a($$0, $$10);
            }
         }

         this.a($$1, $$0, $$3, $$6);
         this.e = ac.c();
         return true;
      } else {
         return false;
      }
   }

   private void a(xh.a $$0, xl $$1) {
      this.b.aX().a($$0.b($$1));
   }

   private fyl a(yb $$0, xl $$1, Instant $$2) {
      return this.a($$0.g()) ? fyl.a : fyl.a($$0, $$1, $$2);
   }

   private void a(yb $$0, xh.a $$1, GameProfile $$2, fyl $$3) {
      fyk $$4 = this.b.aZ().b();
      $$4.a(fyn.a($$2, $$0, $$3));
   }

   private void a(xl $$0, Instant $$1) {
      fyk $$2 = this.b.aZ().b();
      $$2.a(fyn.a($$0, $$1));
   }

   public void a(xl $$0, boolean $$1) {
      if (!this.b.m.ae().c() || !this.b.a(this.a($$0))) {
         if ($$1) {
            this.b.l.a($$0, false);
         } else {
            this.b.l.d().a($$0);
            this.a($$0, Instant.now());
         }

         this.b.aX().b($$0);
      }
   }

   private UUID a(xl $$0) {
      String $$1 = azo.a($$0);
      String $$2 = StringUtils.substringBetween($$1, "<", ">");
      return $$2 == null ? ac.e : this.b.aM().a($$2);
   }

   private boolean a(UUID $$0) {
      if (this.b.T() && this.b.s != null) {
         UUID $$1 = this.b.s.gb().getId();
         return $$1.equals($$0);
      } else {
         return false;
      }
   }

   static record a(@Nullable xx a, BooleanSupplier b) {
      public boolean a() {
         return this.b.getAsBoolean();
      }

      @Nullable
      public xx b() {
         return this.a;
      }

      public BooleanSupplier c() {
         return this.b;
      }
   }
}
