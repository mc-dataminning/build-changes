import com.google.common.collect.Queues;
import com.mojang.authlib.GameProfile;
import java.time.Instant;
import java.util.Deque;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class fva {
   private static final wg a = wg.c("chat.validation_error").a(n.m, n.u);
   private final fbp b;
   private final Deque<fva.a> c = Queues.newArrayDeque();
   private long d;
   private long e;

   public fva(fbp $$0) {
      this.b = $$0;
   }

   public void a() {
      if (this.d != 0L) {
         if (ac.b() >= this.e + this.d) {
            fva.a $$0 = this.c.poll();

            while ($$0 != null && !$$0.a()) {
               $$0 = this.c.poll();
            }
         }
      }
   }

   public void a(double $$0) {
      long $$1 = (long)($$0 * 1000.0);
      if ($$1 == 0L && this.d > 0L) {
         this.c.forEach(fva.a::a);
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
      this.c.forEach(fva.a::a);
      this.c.clear();
   }

   public boolean a(ws $$0) {
      return this.c.removeIf($$1 -> $$0.equals($$1.b()));
   }

   private boolean e() {
      return this.d > 0L && ac.b() < this.e + this.d;
   }

   private void a(@Nullable ws $$0, BooleanSupplier $$1) {
      if (this.e()) {
         this.c.add(new fva.a($$0, $$1));
      } else {
         $$1.getAsBoolean();
      }
   }

   public void a(ww $$0, GameProfile $$1, wc.a $$2) {
      boolean $$3 = this.b.m.ag().c();
      ww $$4 = $$3 ? $$0.a() : $$0;
      wg $$5 = $$2.a($$4.d());
      Instant $$6 = Instant.now();
      this.a($$0.l(), () -> {
         boolean $$6x = this.a($$2, $$0, $$5, $$1, $$3, $$6);
         fui $$7 = this.b.L();
         if ($$7 != null) {
            $$7.a($$0, $$6x);
         }

         return $$6x;
      });
   }

   public void a(UUID $$0, wc.a $$1) {
      this.a(null, () -> {
         if (this.b.a($$0)) {
            return false;
         } else {
            wg $$2 = $$1.a(a);
            this.b.l.d().a($$2, null, fbk.d());
            this.e = ac.b();
            return true;
         }
      });
   }

   public void a(wg $$0, wc.a $$1) {
      Instant $$2 = Instant.now();
      this.a(null, () -> {
         wg $$3 = $$1.a($$0);
         this.b.l.d().a($$3);
         this.a($$1, $$0);
         this.a($$3, $$2);
         this.e = ac.b();
         return true;
      });
   }

   private boolean a(wc.a $$0, ww $$1, wg $$2, GameProfile $$3, boolean $$4, Instant $$5) {
      fvc $$6 = this.a($$1, $$2, $$5);
      if ($$4 && $$6.a()) {
         return false;
      } else if (!this.b.a($$1.g()) && !$$1.j()) {
         fbk $$7 = $$6.a($$1);
         ws $$8 = $$1.l();
         wk $$9 = $$1.o();
         if ($$9.a()) {
            this.b.l.d().a($$2, $$8, $$7);
            this.a($$0, $$1.d());
         } else {
            wg $$10 = $$9.b($$1.c());
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

   private void a(wc.a $$0, wg $$1) {
      this.b.aY().a($$0.b($$1));
   }

   private fvc a(ww $$0, wg $$1, Instant $$2) {
      return this.a($$0.g()) ? fvc.a : fvc.a($$0, $$1, $$2);
   }

   private void a(ww $$0, wc.a $$1, GameProfile $$2, fvc $$3) {
      fvb $$4 = this.b.ba().b();
      $$4.a(fve.a($$2, $$0, $$3));
   }

   private void a(wg $$0, Instant $$1) {
      fvb $$2 = this.b.ba().b();
      $$2.a(fve.a($$0, $$1));
   }

   public void a(wg $$0, boolean $$1) {
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

   private UUID a(wg $$0) {
      String $$1 = ayd.a($$0);
      String $$2 = StringUtils.substringBetween($$1, "<", ">");
      return $$2 == null ? ac.e : this.b.aM().a($$2);
   }

   private boolean a(UUID $$0) {
      if (this.b.T() && this.b.s != null) {
         UUID $$1 = this.b.s.fY().getId();
         return $$1.equals($$0);
      } else {
         return false;
      }
   }

   static record a(@Nullable ws a, BooleanSupplier b) {
      public boolean a() {
         return this.b.getAsBoolean();
      }

      @Nullable
      public ws b() {
         return this.a;
      }

      public BooleanSupplier c() {
         return this.b;
      }
   }
}
