import java.util.ArrayList;
import java.util.List;
import org.joml.Matrix4f;
import org.joml.Quaternionf;

public abstract class gqz<T extends buz, S, ST extends gxk> extends grk<T, ST> {
   private final grj a;

   protected gqz(grl.a $$0) {
      super($$0);
      this.a = $$0.a();
   }

   protected fbm a(T $$0) {
      return $$0.l();
   }

   protected boolean b(T $$0) {
      return $$0.m();
   }

   private static int c(buz $$0) {
      buz.k $$1 = $$0.p();
      return $$1 != null ? $$1.c() : -1;
   }

   protected int a(T $$0, jh $$1) {
      int $$2 = c($$0);
      return $$2 != -1 ? gle.b($$2) : super.b($$0, $$1);
   }

   protected int b(T $$0, jh $$1) {
      int $$2 = c($$0);
      return $$2 != -1 ? gle.a($$2) : super.a($$0, $$1);
   }

   protected float a(ST $$0) {
      buz.k $$1 = $$0.b;
      return $$1 == null ? 0.0F : $$1.d().get($$0.c);
   }

   protected float b(ST $$0) {
      buz.k $$1 = $$0.b;
      return $$1 == null ? 0.0F : $$1.e().get($$0.c);
   }

   public void a(ST $$0, fgl $$1, glg $$2, int $$3) {
      buz.k $$4 = $$0.b;
      if ($$4 != null && $$0.a()) {
         float $$5 = $$0.c;
         super.a($$0, $$1, $$2, $$3);
         $$1.a();
         $$1.a(this.a($$4, $$0, new Quaternionf()));
         j $$6 = $$4.a().get($$5);
         $$1.a($$6.c());
         this.a($$0, $$1, $$2, $$3, $$5);
         $$1.b();
      }
   }

   private Quaternionf a(buz.k $$0, ST $$1, Quaternionf $$2) {
      fli $$3 = this.a.b;

      return switch ($$0.b()) {
         case a -> $$2.rotationYXZ((float) (-Math.PI / 180.0) * $$1.d, (float) (Math.PI / 180.0) * $$1.e, 0.0F);
         case c -> $$2.rotationYXZ((float) (-Math.PI / 180.0) * $$1.d, (float) (Math.PI / 180.0) * b($$3), 0.0F);
         case b -> $$2.rotationYXZ((float) (-Math.PI / 180.0) * a($$3), (float) (Math.PI / 180.0) * $$1.e, 0.0F);
         case d -> $$2.rotationYXZ((float) (-Math.PI / 180.0) * a($$3), (float) (Math.PI / 180.0) * b($$3), 0.0F);
      };
   }

   private static float a(fli $$0) {
      return $$0.e() - 180.0F;
   }

   private static float b(fli $$0) {
      return -$$0.d();
   }

   private static <T extends buz> float a(T $$0, float $$1) {
      return $$0.k($$1);
   }

   private static <T extends buz> float b(T $$0, float $$1) {
      return $$0.j($$1);
   }

   protected abstract void a(ST var1, fgl var2, glg var3, int var4, float var5);

   public void a(T $$0, ST $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.p();
      $$1.c = $$0.a($$2);
      $$1.d = a($$0, $$2);
      $$1.e = b($$0, $$2);
   }

   public static class a extends gqz<buz.b, buz.b.a, gxb> {
      private final gmj a;

      protected a(grl.a $$0) {
         super($$0);
         this.a = $$0.d();
      }

      public gxb a() {
         return new gxb();
      }

      public void a(buz.b $$0, gxb $$1, float $$2) {
         super.a($$0, $$1, $$2);
         $$1.a = $$0.s();
      }

      public void a(gxb $$0, fgl $$1, glg $$2, int $$3, float $$4) {
         this.a.a($$0.a.a(), $$1, $$2, $$3, hax.d);
      }
   }

   public static class b extends gqz<buz.g, buz.g.a, gyk> {
      private final gsj a;

      protected b(grl.a $$0) {
         super($$0);
         this.a = $$0.b();
      }

      public gyk a() {
         return new gyk();
      }

      public void a(buz.g $$0, gyk $$1, float $$2) {
         super.a($$0, $$1, $$2);
         buz.g.a $$3 = $$0.s();
         if ($$3 != null) {
            $$1.a = $$3;
            $$1.f = this.a.a($$1.a.a(), $$0.dW(), null, $$0.ar());
         } else {
            $$1.a = null;
            $$1.f = null;
         }
      }

      public void a(gyk $$0, fgl $$1, glg $$2, int $$3, float $$4) {
         buz.g.a $$5 = $$0.a;
         hdi $$6 = $$0.f;
         if ($$5 != null && $$6 != null) {
            $$1.a(a.d.rotation((float) Math.PI));
            this.a.a($$5.a(), $$5.b(), false, $$1, $$2, $$3, hax.d, $$6);
         }
      }
   }

   public static class c extends gqz<buz.l, buz.l.e, gzq> {
      private final fnj a;

      protected c(grl.a $$0) {
         super($$0);
         this.a = $$0.j();
      }

      public gzq a() {
         return new gzq();
      }

      public void a(buz.l $$0, gzq $$1, float $$2) {
         super.a($$0, $$1, $$2);
         $$1.a = $$0.s();
         $$1.f = $$0.a(this::a);
      }

      private buz.l.b a(xk $$0, int $$1) {
         List<azg> $$2 = this.a.c($$0, $$1);
         List<buz.l.c> $$3 = new ArrayList<>($$2.size());
         int $$4 = 0;

         for (azg $$5 : $$2) {
            int $$6 = this.a.a($$5);
            $$4 = Math.max($$4, $$6);
            $$3.add(new buz.l.c($$5, $$6));
         }

         return new buz.l.b($$3, $$4);
      }

      public void a(gzq $$0, fgl $$1, glg $$2, int $$3, float $$4) {
         buz.l.e $$5 = $$0.a;
         byte $$6 = $$5.e();
         boolean $$7 = ($$6 & 2) != 0;
         boolean $$8 = ($$6 & 4) != 0;
         boolean $$9 = ($$6 & 1) != 0;
         buz.l.a $$10 = buz.l.a($$6);
         byte $$11 = (byte)$$5.c().get($$4);
         int $$13;
         if ($$8) {
            float $$12 = flz.Q().n.a(0.25F);
            $$13 = (int)($$12 * 255.0F) << 24;
         } else {
            $$13 = $$5.d().get($$4);
         }

         float $$15 = 0.0F;
         Matrix4f $$16 = $$1.c().a();
         $$16.rotate((float) Math.PI, 0.0F, 1.0F, 0.0F);
         $$16.scale(-0.025F, -0.025F, -0.025F);
         buz.l.b $$17 = $$0.f;
         int $$18 = 1;
         int $$19 = 9 + 1;
         int $$20 = $$17.b();
         int $$21 = $$17.a().size() * $$19 - 1;
         $$16.translate(1.0F - (float)$$20 / 2.0F, (float)(-$$21), 0.0F);
         if ($$13 != 0) {
            fgp $$22 = $$2.getBuffer($$7 ? glq.o() : glq.n());
            $$22.a($$16, -1.0F, -1.0F, 0.0F).a($$13).c($$3);
            $$22.a($$16, -1.0F, (float)$$21, 0.0F).a($$13).c($$3);
            $$22.a($$16, (float)$$20, (float)$$21, 0.0F).a($$13).c($$3);
            $$22.a($$16, (float)$$20, -1.0F, 0.0F).a($$13).c($$3);
         }

         for (buz.l.c $$23 : $$17.a()) {
            float $$24 = switch ($$10) {
               case b -> 0.0F;
               case c -> (float)($$20 - $$23.b());
               case a -> (float)$$20 / 2.0F - (float)$$23.b() / 2.0F;
            };
            this.a.a($$23.a(), $$24, $$15, $$11 << 24 | 16777215, $$9, $$16, $$2, $$7 ? fnj.a.b : fnj.a.c, 0, $$3);
            $$15 += (float)$$19;
         }
      }
   }
}
