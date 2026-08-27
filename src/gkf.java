import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Quaternionf;

public abstract class gkf<T extends bru, S> extends gkp<T> {
   private final gko a;

   protected gkf(gkq.a $$0) {
      super($$0);
      this.a = $$0.a();
   }

   public akt a(T $$0) {
      return gqx.e;
   }

   public void a(T $$0, float $$1, float $$2, fbc $$3, gfg $$4, int $$5) {
      bru.k $$6 = $$0.p();
      if ($$6 != null) {
         S $$7 = this.b($$0);
         if ($$7 != null) {
            float $$8 = $$0.a($$2);
            this.e = $$6.d().get($$8);
            this.f = $$6.e().get($$8);
            int $$9 = $$6.c();
            int $$10 = $$9 != -1 ? $$9 : $$5;
            super.a($$0, $$1, $$2, $$3, $$4, $$10);
            $$3.a();
            $$3.a(this.a($$6, $$0, $$2, new Quaternionf()));
            j $$11 = $$6.a().get($$8);
            $$3.a($$11.c());
            this.a($$0, $$7, $$3, $$4, $$10, $$8);
            $$3.b();
         }
      }
   }

   private Quaternionf a(bru.k $$0, T $$1, float $$2, Quaternionf $$3) {
      ffu $$4 = this.a.b;

      return switch ($$0.b()) {
         case a -> $$3.rotationYXZ((float) (-Math.PI / 180.0) * a($$1, $$2), (float) (Math.PI / 180.0) * b($$1, $$2), 0.0F);
         case c -> $$3.rotationYXZ((float) (-Math.PI / 180.0) * a($$1, $$2), (float) (Math.PI / 180.0) * b($$4), 0.0F);
         case b -> $$3.rotationYXZ((float) (-Math.PI / 180.0) * a($$4), (float) (Math.PI / 180.0) * b($$1, $$2), 0.0F);
         case d -> $$3.rotationYXZ((float) (-Math.PI / 180.0) * a($$4), (float) (Math.PI / 180.0) * b($$4), 0.0F);
      };
   }

   private static float a(ffu $$0) {
      return $$0.e() - 180.0F;
   }

   private static float b(ffu $$0) {
      return -$$0.d();
   }

   private static <T extends bru> float a(T $$0, float $$1) {
      return aym.j($$1, $$0.P, $$0.dK());
   }

   private static <T extends bru> float b(T $$0, float $$1) {
      return aym.i($$1, $$0.Q, $$0.dM());
   }

   @Nullable
   protected abstract S b(T var1);

   protected abstract void a(T var1, S var2, fbc var3, gfg var4, int var5, float var6);

   public static class a extends gkf<bru.b, bru.b.a> {
      private final gga a;

      protected a(gkq.a $$0) {
         super($$0);
         this.a = $$0.c();
      }

      @Nullable
      protected bru.b.a a(bru.b $$0) {
         return $$0.r();
      }

      public void a(bru.b $$0, bru.b.a $$1, fbc $$2, gfg $$3, int $$4, float $$5) {
         this.a.a($$1.a(), $$2, $$3, $$4, gqp.d);
      }
   }

   public static class b extends gkf<bru.g, bru.g.a> {
      private final glp a;

      protected b(gkq.a $$0) {
         super($$0);
         this.a = $$0.b();
      }

      @Nullable
      protected bru.g.a a(bru.g $$0) {
         return $$0.r();
      }

      public void a(bru.g $$0, bru.g.a $$1, fbc $$2, gfg $$3, int $$4, float $$5) {
         $$2.a(a.d.rotation((float) Math.PI));
         this.a.a($$1.a(), $$1.b(), $$4, gqp.d, $$2, $$3, $$0.dU(), $$0.al());
      }
   }

   public static class c extends gkf<bru.l, bru.l.e> {
      private final fhy a;

      protected c(gkq.a $$0) {
         super($$0);
         this.a = $$0.h();
      }

      private bru.l.b a(xe $$0, int $$1) {
         List<axy> $$2 = this.a.c($$0, $$1);
         List<bru.l.c> $$3 = new ArrayList<>($$2.size());
         int $$4 = 0;

         for (axy $$5 : $$2) {
            int $$6 = this.a.a($$5);
            $$4 = Math.max($$4, $$6);
            $$3.add(new bru.l.c($$5, $$6));
         }

         return new bru.l.b($$3, $$4);
      }

      @Nullable
      protected bru.l.e a(bru.l $$0) {
         return $$0.r();
      }

      public void a(bru.l $$0, bru.l.e $$1, fbc $$2, gfg $$3, int $$4, float $$5) {
         byte $$6 = $$1.e();
         boolean $$7 = ($$6 & 2) != 0;
         boolean $$8 = ($$6 & 4) != 0;
         boolean $$9 = ($$6 & 1) != 0;
         bru.l.a $$10 = bru.l.a($$6);
         byte $$11 = (byte)$$1.c().get($$5);
         int $$13;
         if ($$8) {
            float $$12 = fgj.Q().m.a(0.25F);
            $$13 = (int)($$12 * 255.0F) << 24;
         } else {
            $$13 = $$1.d().get($$5);
         }

         float $$15 = 0.0F;
         Matrix4f $$16 = $$2.c().a();
         $$16.rotate((float) Math.PI, 0.0F, 1.0F, 0.0F);
         $$16.scale(-0.025F, -0.025F, -0.025F);
         bru.l.b $$17 = $$0.a(this::a);
         int $$18 = 9 + 1;
         int $$19 = $$17.b();
         int $$20 = $$17.a().size() * $$18;
         $$16.translate(1.0F - (float)$$19 / 2.0F, (float)(-$$20), 0.0F);
         if ($$13 != 0) {
            fbg $$21 = $$3.getBuffer($$7 ? gfo.r() : gfo.q());
            $$21.a($$16, -1.0F, -1.0F, 0.0F).a($$13).b($$4).e();
            $$21.a($$16, -1.0F, (float)$$20, 0.0F).a($$13).b($$4).e();
            $$21.a($$16, (float)$$19, (float)$$20, 0.0F).a($$13).b($$4).e();
            $$21.a($$16, (float)$$19, -1.0F, 0.0F).a($$13).b($$4).e();
         }

         for (bru.l.c $$22 : $$17.a()) {
            float $$23 = switch ($$10) {
               case b -> 0.0F;
               case c -> (float)($$19 - $$22.b());
               case a -> (float)$$19 / 2.0F - (float)$$22.b() / 2.0F;
            };
            this.a.a($$22.a(), $$23, $$15, $$11 << 24 | 16777215, $$9, $$16, $$3, $$7 ? fhy.a.b : fhy.a.c, 0, $$4);
            $$15 += (float)$$18;
         }
      }
   }
}
