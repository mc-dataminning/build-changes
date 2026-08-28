import java.util.ArrayList;
import java.util.List;
import org.joml.Matrix4f;
import org.joml.Quaternionf;

public abstract class goy<T extends buj, S, ST extends gvi> extends gpj<T, ST> {
   private final gpi a;

   protected goy(gpk.a $$0) {
      super($$0);
      this.a = $$0.a();
   }

   protected ezt a(T $$0) {
      return $$0.j();
   }

   protected boolean b(T $$0) {
      return $$0.l();
   }

   private static int c(buj $$0) {
      buj.k $$1 = $$0.n();
      return $$1 != null ? $$1.c() : -1;
   }

   protected int a(T $$0, jh $$1) {
      int $$2 = c($$0);
      return $$2 != -1 ? gje.b($$2) : super.b($$0, $$1);
   }

   protected int b(T $$0, jh $$1) {
      int $$2 = c($$0);
      return $$2 != -1 ? gje.a($$2) : super.a($$0, $$1);
   }

   public void a(ST $$0, fer $$1, gjg $$2, int $$3) {
      buj.k $$4 = $$0.b;
      if ($$4 != null) {
         if ($$0.a()) {
            float $$5 = $$0.c;
            this.f = $$4.d().get($$5);
            this.g = $$4.e().get($$5);
            super.a($$0, $$1, $$2, $$3);
            $$1.a();
            $$1.a(this.a($$4, $$0, new Quaternionf()));
            j $$6 = $$4.a().get($$5);
            $$1.a($$6.c());
            this.a($$0, $$1, $$2, $$3, $$5);
            $$1.b();
         }
      }
   }

   private Quaternionf a(buj.k $$0, ST $$1, Quaternionf $$2) {
      fjn $$3 = this.a.b;

      return switch ($$0.b()) {
         case a -> $$2.rotationYXZ((float) (-Math.PI / 180.0) * $$1.d, (float) (Math.PI / 180.0) * $$1.e, 0.0F);
         case c -> $$2.rotationYXZ((float) (-Math.PI / 180.0) * $$1.d, (float) (Math.PI / 180.0) * b($$3), 0.0F);
         case b -> $$2.rotationYXZ((float) (-Math.PI / 180.0) * a($$3), (float) (Math.PI / 180.0) * $$1.e, 0.0F);
         case d -> $$2.rotationYXZ((float) (-Math.PI / 180.0) * a($$3), (float) (Math.PI / 180.0) * b($$3), 0.0F);
      };
   }

   private static float a(fjn $$0) {
      return $$0.e() - 180.0F;
   }

   private static float b(fjn $$0) {
      return -$$0.d();
   }

   private static <T extends buj> float a(T $$0, float $$1) {
      return $$0.k($$1);
   }

   private static <T extends buj> float b(T $$0, float $$1) {
      return $$0.j($$1);
   }

   protected abstract void a(ST var1, fer var2, gjg var3, int var4, float var5);

   public void a(T $$0, ST $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.n();
      $$1.c = $$0.a($$2);
      $$1.d = a($$0, $$2);
      $$1.e = b($$0, $$2);
   }

   public static class a extends goy<buj.b, buj.b.a, gva> {
      private final gkj a;

      protected a(gpk.a $$0) {
         super($$0);
         this.a = $$0.d();
      }

      public gva a() {
         return new gva();
      }

      public void a(buj.b $$0, gva $$1, float $$2) {
         super.a($$0, $$1, $$2);
         $$1.a = $$0.q();
      }

      public void a(gva $$0, fer $$1, gjg $$2, int $$3, float $$4) {
         this.a.a($$0.a.a(), $$1, $$2, $$3, gyv.d);
      }
   }

   public static class b extends goy<buj.g, buj.g.a, gwi> {
      private final gqi a;

      protected b(gpk.a $$0) {
         super($$0);
         this.a = $$0.b();
      }

      public gwi a() {
         return new gwi();
      }

      public void a(buj.g $$0, gwi $$1, float $$2) {
         super.a($$0, $$1, $$2);
         buj.g.a $$3 = $$0.q();
         if ($$3 != null) {
            $$1.a = $$3;
            $$1.f = this.a.a($$1.a.a(), $$0.dV(), null, $$0.ar());
         } else {
            $$1.a = null;
            $$1.f = null;
         }
      }

      public void a(gwi $$0, fer $$1, gjg $$2, int $$3, float $$4) {
         buj.g.a $$5 = $$0.a;
         hbg $$6 = $$0.f;
         if ($$5 != null && $$6 != null) {
            $$1.a(a.d.rotation((float) Math.PI));
            this.a.a($$5.a(), $$5.b(), false, $$1, $$2, $$3, gyv.d, $$6);
         }
      }
   }

   public static class c extends goy<buj.l, buj.l.e, gxo> {
      private final flo a;

      protected c(gpk.a $$0) {
         super($$0);
         this.a = $$0.j();
      }

      public gxo a() {
         return new gxo();
      }

      public void a(buj.l $$0, gxo $$1, float $$2) {
         super.a($$0, $$1, $$2);
         $$1.a = $$0.q();
         $$1.f = $$0.a(this::a);
      }

      private buj.l.b a(xj $$0, int $$1) {
         List<ayy> $$2 = this.a.c($$0, $$1);
         List<buj.l.c> $$3 = new ArrayList<>($$2.size());
         int $$4 = 0;

         for (ayy $$5 : $$2) {
            int $$6 = this.a.a($$5);
            $$4 = Math.max($$4, $$6);
            $$3.add(new buj.l.c($$5, $$6));
         }

         return new buj.l.b($$3, $$4);
      }

      public void a(gxo $$0, fer $$1, gjg $$2, int $$3, float $$4) {
         buj.l.e $$5 = $$0.a;
         byte $$6 = $$5.e();
         boolean $$7 = ($$6 & 2) != 0;
         boolean $$8 = ($$6 & 4) != 0;
         boolean $$9 = ($$6 & 1) != 0;
         buj.l.a $$10 = buj.l.a($$6);
         byte $$11 = (byte)$$5.c().get($$4);
         int $$13;
         if ($$8) {
            float $$12 = fke.Q().n.a(0.25F);
            $$13 = (int)($$12 * 255.0F) << 24;
         } else {
            $$13 = $$5.d().get($$4);
         }

         float $$15 = 0.0F;
         Matrix4f $$16 = $$1.c().a();
         $$16.rotate((float) Math.PI, 0.0F, 1.0F, 0.0F);
         $$16.scale(-0.025F, -0.025F, -0.025F);
         buj.l.b $$17 = $$0.f;
         int $$18 = 1;
         int $$19 = 9 + 1;
         int $$20 = $$17.b();
         int $$21 = $$17.a().size() * $$19 - 1;
         $$16.translate(1.0F - (float)$$20 / 2.0F, (float)(-$$21), 0.0F);
         if ($$13 != 0) {
            fev $$22 = $$2.getBuffer($$7 ? gjq.o() : gjq.n());
            $$22.a($$16, -1.0F, -1.0F, 0.0F).a($$13).c($$3);
            $$22.a($$16, -1.0F, (float)$$21, 0.0F).a($$13).c($$3);
            $$22.a($$16, (float)$$20, (float)$$21, 0.0F).a($$13).c($$3);
            $$22.a($$16, (float)$$20, -1.0F, 0.0F).a($$13).c($$3);
         }

         for (buj.l.c $$23 : $$17.a()) {
            float $$24 = switch ($$10) {
               case b -> 0.0F;
               case c -> (float)($$20 - $$23.b());
               case a -> (float)$$20 / 2.0F - (float)$$23.b() / 2.0F;
            };
            this.a.a($$23.a(), $$24, $$15, $$11 << 24 | 16777215, $$9, $$16, $$2, $$7 ? flo.a.b : flo.a.c, 0, $$3);
            $$15 += (float)$$19;
         }
      }
   }
}
