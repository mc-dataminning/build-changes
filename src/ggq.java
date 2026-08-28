import com.google.common.collect.Queues;
import com.mojang.authlib.GameProfile;
import java.time.Instant;
import java.util.Deque;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class ggq {
   private static final wo a = wo.c("chat.validation_error").a(n.m, n.u);
   private final flh b;
   private final Deque<ggq.a> c = Queues.newArrayDeque();
   private long d;
   private long e;

   public ggq(flh $$0) {
      this.b = $$0;
   }

   public void a() {
      if (this.d != 0L) {
         if (af.c() >= this.e + this.d) {
            ggq.a $$0 = this.c.poll();

            while ($$0 != null && !$$0.a()) {
               $$0 = this.c.poll();
            }
         }
      }
   }

   public void a(double $$0) {
      long $$1 = (long)($$0 * 1000.0);
      if ($$1 == 0L && this.d > 0L) {
         this.c.forEach(ggq.a::a);
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
      this.c.forEach(ggq.a::a);
      this.c.clear();
   }

   public boolean a(xa $$0) {
      return this.c.removeIf($$1 -> $$0.equals($$1.b()));
   }

   private boolean e() {
      return this.d > 0L && af.c() < this.e + this.d;
   }

   private void a(@Nullable xa $$0, BooleanSupplier $$1) {
      if (this.e()) {
         this.c.add(new ggq.a($$0, $$1));
      } else {
         $$1.getAsBoolean();
      }
   }

   public void a(xe $$0, GameProfile $$1, wk.a $$2) {
      boolean $$3 = this.b.n.aj().c();
      xe $$4 = $$3 ? $$0.a() : $$0;
      wo $$5 = $$2.a($$4.d());
      Instant $$6 = Instant.now();
      this.a($$0.l(), () -> {
         boolean $$6x = this.a($$2, $$0, $$5, $$1, $$3, $$6);
         gfx $$7 = this.b.L();
         if ($$7 != null) {
            $$7.a($$0, $$6x);
         }

         return $$6x;
      });
   }

   public void a(UUID $$0, wk.a $$1) {
      this.a(null, () -> {
         if (this.b.a($$0)) {
            return false;
         } else {
            wo $$2 = $$1.a(a);
            this.b.m.d().a($$2, null, flb.d());
            this.e = af.c();
            return true;
         }
      });
   }

   public void a(wo $$0, wk.a $$1) {
      Instant $$2 = Instant.now();
      this.a(null, () -> {
         wo $$3 = $$1.a($$0);
         this.b.m.d().a($$3);
         this.a($$1, $$0);
         this.a($$3, $$2);
         this.e = af.c();
         return true;
      });
   }

   private boolean a(wk.a $$0, xe $$1, wo $$2, GameProfile $$3, boolean $$4, Instant $$5) {
      ggs $$6 = this.a($$1, $$2, $$5);
      if ($$4 && $$6.a()) {
         return false;
      } else if (!this.b.a($$1.g()) && !$$1.j()) {
         flb $$7 = $$6.a($$1);
         xa $$8 = $$1.l();
         ws $$9 = $$1.o();
         if ($$9.a()) {
            this.b.m.d().a($$2, $$8, $$7);
            this.a($$0, $$1.d());
         } else {
            wo $$10 = $$9.b($$1.c());
            if ($$10 != null) {
               this.b.m.d().a($$0.a($$10), $$8, $$7);
               this.a($$0, $$10);
            }
         }

         this.a($$1, $$0, $$3, $$6);
         this.e = af.c();
         return true;
      } else {
         return false;
      }
   }

   private void a(wk.a $$0, wo $$1) {
      this.b.aY().a($$0.b($$1));
   }

   private ggs a(xe $$0, wo $$1, Instant $$2) {
      return this.a($$0.g()) ? ggs.a : ggs.a($$0, $$1, $$2);
   }

   private void a(xe $$0, wk.a $$1, GameProfile $$2, ggs $$3) {
      ggr $$4 = this.b.ba().b();
      $$4.a(ggu.a($$2, $$0, $$3));
   }

   private void a(wo $$0, Instant $$1) {
      ggr $$2 = this.b.ba().b();
      $$2.a(ggu.a($$0, $$1));
   }

   public void a(wo $$0, boolean $$1) {
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

   private UUID a(wo $$0) {
      String $$1 = azt.a($$0);
      String $$2 = StringUtils.substringBetween($$1, "<", ">");
      return $$2 == null ? af.e : this.b.aN().a($$2);
   }

   private boolean a(UUID $$0) {
      if (this.b.T() && this.b.t != null) {
         UUID $$1 = this.b.t.gh().getId();
         return $$1.equals($$0);
      } else {
         return false;
      }
   }

   static record a(@Nullable xa a, BooleanSupplier b) {
      public boolean a() {
         return this.b.getAsBoolean();
      }

      @Nullable
      public xa b() {
         return this.a;
      }

      public BooleanSupplier c() {
         return this.b;
      }
   }
}
