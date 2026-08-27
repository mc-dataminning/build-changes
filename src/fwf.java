import com.google.common.collect.Queues;
import com.mojang.authlib.GameProfile;
import java.time.Instant;
import java.util.Deque;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class fwf {
   private static final ws a = ws.c("chat.validation_error").a(n.m, n.u);
   private final fcu b;
   private final Deque<fwf.a> c = Queues.newArrayDeque();
   private long d;
   private long e;

   public fwf(fcu $$0) {
      this.b = $$0;
   }

   public void a() {
      if (this.d != 0L) {
         if (ac.b() >= this.e + this.d) {
            fwf.a $$0 = this.c.poll();

            while ($$0 != null && !$$0.a()) {
               $$0 = this.c.poll();
            }
         }
      }
   }

   public void a(double $$0) {
      long $$1 = (long)($$0 * 1000.0);
      if ($$1 == 0L && this.d > 0L) {
         this.c.forEach(fwf.a::a);
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
      this.c.forEach(fwf.a::a);
      this.c.clear();
   }

   public boolean a(xe $$0) {
      return this.c.removeIf($$1 -> $$0.equals($$1.b()));
   }

   private boolean e() {
      return this.d > 0L && ac.b() < this.e + this.d;
   }

   private void a(@Nullable xe $$0, BooleanSupplier $$1) {
      if (this.e()) {
         this.c.add(new fwf.a($$0, $$1));
      } else {
         $$1.getAsBoolean();
      }
   }

   public void a(xi $$0, GameProfile $$1, wo.a $$2) {
      boolean $$3 = this.b.m.ag().c();
      xi $$4 = $$3 ? $$0.a() : $$0;
      ws $$5 = $$2.a($$4.d());
      Instant $$6 = Instant.now();
      this.a($$0.l(), () -> {
         boolean $$6x = this.a($$2, $$0, $$5, $$1, $$3, $$6);
         fvn $$7 = this.b.L();
         if ($$7 != null) {
            $$7.a($$0, $$6x);
         }

         return $$6x;
      });
   }

   public void a(UUID $$0, wo.a $$1) {
      this.a(null, () -> {
         if (this.b.a($$0)) {
            return false;
         } else {
            ws $$2 = $$1.a(a);
            this.b.l.d().a($$2, null, fcp.d());
            this.e = ac.b();
            return true;
         }
      });
   }

   public void a(ws $$0, wo.a $$1) {
      Instant $$2 = Instant.now();
      this.a(null, () -> {
         ws $$3 = $$1.a($$0);
         this.b.l.d().a($$3);
         this.a($$1, $$0);
         this.a($$3, $$2);
         this.e = ac.b();
         return true;
      });
   }

   private boolean a(wo.a $$0, xi $$1, ws $$2, GameProfile $$3, boolean $$4, Instant $$5) {
      fwh $$6 = this.a($$1, $$2, $$5);
      if ($$4 && $$6.a()) {
         return false;
      } else if (!this.b.a($$1.g()) && !$$1.j()) {
         fcp $$7 = $$6.a($$1);
         xe $$8 = $$1.l();
         ww $$9 = $$1.o();
         if ($$9.a()) {
            this.b.l.d().a($$2, $$8, $$7);
            this.a($$0, $$1.d());
         } else {
            ws $$10 = $$9.b($$1.c());
            if ($$10 != null) {
               this.b.l.d().a($$0.a($$10), $$8, $$7);
               this.a($$0, $$10);
            }
         }

         this.a($$1, $$0, $$3, $$6);
         this.e = ac.b();
         return true;
      } else {
         return false;
      }
   }

   private void a(wo.a $$0, ws $$1) {
      this.b.aY().a($$0.b($$1));
   }

   private fwh a(xi $$0, ws $$1, Instant $$2) {
      return this.a($$0.g()) ? fwh.a : fwh.a($$0, $$1, $$2);
   }

   private void a(xi $$0, wo.a $$1, GameProfile $$2, fwh $$3) {
      fwg $$4 = this.b.ba().b();
      $$4.a(fwj.a($$2, $$0, $$3));
   }

   private void a(ws $$0, Instant $$1) {
      fwg $$2 = this.b.ba().b();
      $$2.a(fwj.a($$0, $$1));
   }

   public void a(ws $$0, boolean $$1) {
      if (!this.b.m.ae().c() || !this.b.a(this.a($$0))) {
         if ($$1) {
            this.b.l.a($$0, false);
         } else {
            this.b.l.d().a($$0);
            this.a($$0, Instant.now());
         }

         this.b.aY().b($$0);
      }
   }

   private UUID a(ws $$0) {
      String $$1 = ayp.a($$0);
      String $$2 = StringUtils.substringBetween($$1, "<", ">");
      return $$2 == null ? ac.e : this.b.aM().a($$2);
   }

   private boolean a(UUID $$0) {
      if (this.b.T() && this.b.s != null) {
         UUID $$1 = this.b.s.fZ().getId();
         return $$1.equals($$0);
      } else {
         return false;
      }
   }

   static record a(@Nullable xe a, BooleanSupplier b) {
      public boolean a() {
         return this.b.getAsBoolean();
      }

      @Nullable
      public xe b() {
         return this.a;
      }

      public BooleanSupplier c() {
         return this.b;
      }
   }
}
