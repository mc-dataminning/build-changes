import java.time.Duration;
import java.time.Instant;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Vector4f;

public class gsg implements gsa.a {
   private static final Duration a = Duration.ofMillis(500L);
   private static final int b = 10;
   private static final Vector4f c = new Vector4f(1.0F, 1.0F, 0.0F, 0.25F);
   private static final Vector4f d = new Vector4f(0.25F, 0.125F, 0.0F, 0.125F);
   private final fnd e;
   private final dhy f;
   private Instant g = Instant.now();
   @Nullable
   private gsg.a h;

   public gsg(fnd $$0, dhy $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public void a(fho $$0, gny $$1, double $$2, double $$3, double $$4) {
      Instant $$5 = Instant.now();
      if (this.h == null || Duration.between(this.g, $$5).compareTo(a) > 0) {
         this.g = $$5;
         this.h = new gsg.a(this.e.s.x_(), kl.a(this.e.t.dv()), 10, this.f);
      }

      a($$0, this.h.a, this.h.c, $$1, $$2, $$3, $$4, c);
      a($$0, this.h.b, this.h.c, $$1, $$2, $$3, $$4, d);
      fhs $$6 = $$1.getBuffer(goi.F());
      a($$0, this.h.a, this.h.c, $$6, $$2, $$3, $$4, c);
      a($$0, this.h.b, this.h.c, $$6, $$2, $$3, $$4, d);
   }

   private static void a(fho $$0, fdd $$1, kl $$2, fhs $$3, double $$4, double $$5, double $$6, Vector4f $$7) {
      $$1.a(($$7x, $$8, $$9, $$10) -> {
         int $$11 = $$8 + $$2.u();
         int $$12 = $$9 + $$2.v();
         int $$13 = $$10 + $$2.w();
         a($$0, $$3, $$7x, $$4, $$5, $$6, $$11, $$12, $$13, $$7);
      });
   }

   private static void a(fho $$0, fdd $$1, kl $$2, gny $$3, double $$4, double $$5, double $$6, Vector4f $$7) {
      $$1.a(($$7x, $$8, $$9, $$10, $$11, $$12) -> {
         int $$13 = $$7x + $$2.u();
         int $$14 = $$8 + $$2.v();
         int $$15 = $$9 + $$2.w();
         int $$16 = $$10 + $$2.u();
         int $$17 = $$11 + $$2.v();
         int $$18 = $$12 + $$2.w();
         fhs $$19 = $$3.getBuffer(goi.a(1.0));
         a($$0, $$19, $$4, $$5, $$6, $$13, $$14, $$15, $$16, $$17, $$18, $$7);
      }, true);
   }

   private static void a(fho $$0, fhs $$1, jo $$2, double $$3, double $$4, double $$5, int $$6, int $$7, int $$8, Vector4f $$9) {
      float $$10 = (float)((double)kl.c($$6) - $$3);
      float $$11 = (float)((double)kl.c($$7) - $$4);
      float $$12 = (float)((double)kl.c($$8) - $$5);
      gos.a($$0, $$1, $$2, $$10, $$11, $$12, $$10 + 16.0F, $$11 + 16.0F, $$12 + 16.0F, $$9.x(), $$9.y(), $$9.z(), $$9.w());
   }

   private static void a(fho $$0, fhs $$1, double $$2, double $$3, double $$4, int $$5, int $$6, int $$7, int $$8, int $$9, int $$10, Vector4f $$11) {
      float $$12 = (float)((double)kl.c($$5) - $$2);
      float $$13 = (float)((double)kl.c($$6) - $$3);
      float $$14 = (float)((double)kl.c($$7) - $$4);
      float $$15 = (float)((double)kl.c($$8) - $$2);
      float $$16 = (float)((double)kl.c($$9) - $$3);
      float $$17 = (float)((double)kl.c($$10) - $$4);
      Matrix4f $$18 = $$0.c().a();
      $$1.a($$18, $$12, $$13, $$14).a($$11.x(), $$11.y(), $$11.z(), 1.0F);
      $$1.a($$18, $$15, $$16, $$17).a($$11.x(), $$11.y(), $$11.z(), 1.0F);
   }

   static final class a {
      final fdd a;
      final fdd b;
      final kl c;

      a(eui $$0, kl $$1, int $$2, dhy $$3) {
         int $$4 = $$2 * 2 + 1;
         this.a = new fcx($$4, $$4, $$4);
         this.b = new fcx($$4, $$4, $$4);

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            for (int $$6 = 0; $$6 < $$4; $$6++) {
               for (int $$7 = 0; $$7 < $$4; $$7++) {
                  kl $$8 = kl.a($$1.a() + $$7 - $$2, $$1.b() + $$6 - $$2, $$1.c() + $$5 - $$2);
                  euh.b $$9 = $$0.b($$3, $$8);
                  if ($$9 == euh.b.c) {
                     this.a.c($$7, $$6, $$5);
                     this.b.c($$7, $$6, $$5);
                  } else if ($$9 == euh.b.b) {
                     this.b.c($$7, $$6, $$5);
                  }
               }
            }
         }

         this.c = kl.a($$1.a() - $$2, $$1.b() - $$2, $$1.c() - $$2);
      }
   }
}
