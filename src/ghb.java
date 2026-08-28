import java.time.Duration;
import java.time.Instant;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Vector4f;

public class ghb implements ggv.a {
   private static final Duration a = Duration.ofMillis(500L);
   private static final int b = 10;
   private static final Vector4f c = new Vector4f(1.0F, 1.0F, 0.0F, 0.25F);
   private static final Vector4f d = new Vector4f(0.25F, 0.125F, 0.0F, 0.125F);
   private final ffa e;
   private final dcc f;
   private Instant g = Instant.now();
   @Nullable
   private ghb.a h;

   public ghb(ffa $$0, dcc $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public void a(ezt $$0, gdj $$1, double $$2, double $$3, double $$4) {
      Instant $$5 = Instant.now();
      if (this.h == null || Duration.between(this.g, $$5).compareTo(a) > 0) {
         this.g = $$5;
         this.h = new ghb.a(this.e.r.y_(), kb.a(this.e.s.dp()), 10, this.f);
      }

      a($$0, this.h.a, this.h.c, $$1, $$2, $$3, $$4, c);
      a($$0, this.h.b, this.h.c, $$1, $$2, $$3, $$4, d);
      ezx $$6 = $$1.getBuffer(gdr.C());
      a($$0, this.h.a, this.h.c, $$6, $$2, $$3, $$4, c);
      a($$0, this.h.b, this.h.c, $$6, $$2, $$3, $$4, d);
   }

   private static void a(ezt $$0, evv $$1, kb $$2, ezx $$3, double $$4, double $$5, double $$6, Vector4f $$7) {
      $$1.a(($$7x, $$8, $$9, $$10) -> {
         int $$11 = $$8 + $$2.u();
         int $$12 = $$9 + $$2.v();
         int $$13 = $$10 + $$2.w();
         a($$0, $$3, $$7x, $$4, $$5, $$6, $$11, $$12, $$13, $$7);
      });
   }

   private static void a(ezt $$0, evv $$1, kb $$2, gdj $$3, double $$4, double $$5, double $$6, Vector4f $$7) {
      $$1.a(($$7x, $$8, $$9, $$10, $$11, $$12) -> {
         int $$13 = $$7x + $$2.u();
         int $$14 = $$8 + $$2.v();
         int $$15 = $$9 + $$2.w();
         int $$16 = $$10 + $$2.u();
         int $$17 = $$11 + $$2.v();
         int $$18 = $$12 + $$2.w();
         ezx $$19 = $$3.getBuffer(gdr.a(1.0));
         a($$0, $$19, $$4, $$5, $$6, $$13, $$14, $$15, $$16, $$17, $$18, $$7);
      }, true);
   }

   private static void a(ezt $$0, ezx $$1, je $$2, double $$3, double $$4, double $$5, int $$6, int $$7, int $$8, Vector4f $$9) {
      float $$10 = (float)((double)kb.c($$6) - $$3);
      float $$11 = (float)((double)kb.c($$7) - $$4);
      float $$12 = (float)((double)kb.c($$8) - $$5);
      float $$13 = $$10 + 16.0F;
      float $$14 = $$11 + 16.0F;
      float $$15 = $$12 + 16.0F;
      float $$16 = $$9.x();
      float $$17 = $$9.y();
      float $$18 = $$9.z();
      float $$19 = $$9.w();
      Matrix4f $$20 = $$0.c().a();
      switch ($$2) {
         case a:
            $$1.a($$20, $$10, $$11, $$12).a($$16, $$17, $$18, $$19).e();
            $$1.a($$20, $$13, $$11, $$12).a($$16, $$17, $$18, $$19).e();
            $$1.a($$20, $$13, $$11, $$15).a($$16, $$17, $$18, $$19).e();
            $$1.a($$20, $$10, $$11, $$15).a($$16, $$17, $$18, $$19).e();
            break;
         case b:
            $$1.a($$20, $$10, $$14, $$12).a($$16, $$17, $$18, $$19).e();
            $$1.a($$20, $$10, $$14, $$15).a($$16, $$17, $$18, $$19).e();
            $$1.a($$20, $$13, $$14, $$15).a($$16, $$17, $$18, $$19).e();
            $$1.a($$20, $$13, $$14, $$12).a($$16, $$17, $$18, $$19).e();
            break;
         case c:
            $$1.a($$20, $$10, $$11, $$12).a($$16, $$17, $$18, $$19).e();
            $$1.a($$20, $$10, $$14, $$12).a($$16, $$17, $$18, $$19).e();
            $$1.a($$20, $$13, $$14, $$12).a($$16, $$17, $$18, $$19).e();
            $$1.a($$20, $$13, $$11, $$12).a($$16, $$17, $$18, $$19).e();
            break;
         case d:
            $$1.a($$20, $$10, $$11, $$15).a($$16, $$17, $$18, $$19).e();
            $$1.a($$20, $$13, $$11, $$15).a($$16, $$17, $$18, $$19).e();
            $$1.a($$20, $$13, $$14, $$15).a($$16, $$17, $$18, $$19).e();
            $$1.a($$20, $$10, $$14, $$15).a($$16, $$17, $$18, $$19).e();
            break;
         case e:
            $$1.a($$20, $$10, $$11, $$12).a($$16, $$17, $$18, $$19).e();
            $$1.a($$20, $$10, $$11, $$15).a($$16, $$17, $$18, $$19).e();
            $$1.a($$20, $$10, $$14, $$15).a($$16, $$17, $$18, $$19).e();
            $$1.a($$20, $$10, $$14, $$12).a($$16, $$17, $$18, $$19).e();
            break;
         case f:
            $$1.a($$20, $$13, $$11, $$12).a($$16, $$17, $$18, $$19).e();
            $$1.a($$20, $$13, $$14, $$12).a($$16, $$17, $$18, $$19).e();
            $$1.a($$20, $$13, $$14, $$15).a($$16, $$17, $$18, $$19).e();
            $$1.a($$20, $$13, $$11, $$15).a($$16, $$17, $$18, $$19).e();
      }
   }

   private static void a(ezt $$0, ezx $$1, double $$2, double $$3, double $$4, int $$5, int $$6, int $$7, int $$8, int $$9, int $$10, Vector4f $$11) {
      float $$12 = (float)((double)kb.c($$5) - $$2);
      float $$13 = (float)((double)kb.c($$6) - $$3);
      float $$14 = (float)((double)kb.c($$7) - $$4);
      float $$15 = (float)((double)kb.c($$8) - $$2);
      float $$16 = (float)((double)kb.c($$9) - $$3);
      float $$17 = (float)((double)kb.c($$10) - $$4);
      Matrix4f $$18 = $$0.c().a();
      $$1.a($$18, $$12, $$13, $$14).a($$11.x(), $$11.y(), $$11.z(), 1.0F).e();
      $$1.a($$18, $$15, $$16, $$17).a($$11.x(), $$11.y(), $$11.z(), 1.0F).e();
   }

   static final class a {
      final evv a;
      final evv b;
      final kb c;

      a(enf $$0, kb $$1, int $$2, dcc $$3) {
         int $$4 = $$2 * 2 + 1;
         this.a = new evp($$4, $$4, $$4);
         this.b = new evp($$4, $$4, $$4);

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            for (int $$6 = 0; $$6 < $$4; $$6++) {
               for (int $$7 = 0; $$7 < $$4; $$7++) {
                  kb $$8 = kb.a($$1.a() + $$7 - $$2, $$1.b() + $$6 - $$2, $$1.c() + $$5 - $$2);
                  ene.b $$9 = $$0.b($$3, $$8);
                  if ($$9 == ene.b.c) {
                     this.a.c($$7, $$6, $$5);
                     this.b.c($$7, $$6, $$5);
                  } else if ($$9 == ene.b.b) {
                     this.b.c($$7, $$6, $$5);
                  }
               }
            }
         }

         this.c = kb.a($$1.a() - $$2, $$1.b() - $$2, $$1.c() - $$2);
      }
   }
}
