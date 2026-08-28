import java.util.ArrayList;
import java.util.List;
import org.joml.Matrix4f;
import org.joml.Quaternionf;

public abstract class gxw<T extends bwq, S, ST extends hej> extends gyh<T, ST> {
   private final gyg a;

   protected gxw(gyi.a $$0) {
      super($$0);
      this.a = $$0.a();
   }

   protected ffl a(T $$0) {
      return $$0.f();
   }

   protected boolean b(T $$0) {
      return $$0.g();
   }

   private static int c(bwq $$0) {
      bwq.j $$1 = $$0.j();
      return $$1 != null ? $$1.c() : -1;
   }

   protected int a(T $$0, iv $$1) {
      int $$2 = c($$0);
      return $$2 != -1 ? grx.b($$2) : super.b($$0, $$1);
   }

   protected int b(T $$0, iv $$1) {
      int $$2 = c($$0);
      return $$2 != -1 ? grx.a($$2) : super.a($$0, $$1);
   }

   protected float a(ST $$0) {
      bwq.j $$1 = $$0.b;
      return $$1 == null ? 0.0F : $$1.d().get($$0.c);
   }

   protected float b(ST $$0) {
      bwq.j $$1 = $$0.b;
      return $$1 == null ? 0.0F : $$1.e().get($$0.c);
   }

   public void a(ST $$0, flo $$1, gsa $$2, int $$3) {
      bwq.j $$4 = $$0.b;
      if ($$4 != null && $$0.a()) {
         float $$5 = $$0.c;
         super.a($$0, $$1, $$2, $$3);
         $$1.a();
         $$1.a(this.a($$4, $$0, new Quaternionf()));
         k $$6 = $$4.a().get($$5);
         $$1.a($$6.c());
         this.a($$0, $$1, $$2, $$3, $$5);
         $$1.b();
      }
   }

   private Quaternionf a(bwq.j $$0, ST $$1, Quaternionf $$2) {
      fql $$3 = this.a.b;

      return switch ($$0.b()) {
         case a -> $$2.rotationYXZ((float) (-Math.PI / 180.0) * $$1.d, (float) (Math.PI / 180.0) * $$1.e, 0.0F);
         case c -> $$2.rotationYXZ((float) (-Math.PI / 180.0) * $$1.d, (float) (Math.PI / 180.0) * b($$3), 0.0F);
         case b -> $$2.rotationYXZ((float) (-Math.PI / 180.0) * a($$3), (float) (Math.PI / 180.0) * $$1.e, 0.0F);
         case d -> $$2.rotationYXZ((float) (-Math.PI / 180.0) * a($$3), (float) (Math.PI / 180.0) * b($$3), 0.0F);
      };
   }

   private static float a(fql $$0) {
      return $$0.e() - 180.0F;
   }

   private static float b(fql $$0) {
      return -$$0.d();
   }

   private static <T extends bwq> float a(T $$0, float $$1) {
      return $$0.l($$1);
   }

   private static <T extends bwq> float b(T $$0, float $$1) {
      return $$0.k($$1);
   }

   protected abstract void a(ST var1, flo var2, gsa var3, int var4, float var5);

   public void a(T $$0, ST $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.j();
      $$1.c = $$0.a($$2);
      $$1.d = a($$0, $$2);
      $$1.e = b($$0, $$2);
   }

   public static class a extends gxw<bwq.b, bwq.b.a, hdz> {
      private final gtd a;

      protected a(gyi.a $$0) {
         super($$0);
         this.a = $$0.d();
      }

      public hdz a() {
         return new hdz();
      }

      public void a(bwq.b $$0, hdz $$1, float $$2) {
         super.a($$0, $$1, $$2);
         $$1.a = $$0.m();
      }

      public void a(hdz $$0, flo $$1, gsa $$2, int $$3, float $$4) {
         this.a.a($$0.a.a(), $$1, $$2, $$3, hkq.d);
      }
   }

   public static class b extends gxw<bwq.g, bwq.g.a, hfl> {
      private final hhq a;

      protected b(gyi.a $$0) {
         super($$0);
         this.a = $$0.b();
      }

      public hfl a() {
         return new hfl();
      }

      public void a(bwq.g $$0, hfl $$1, float $$2) {
         super.a($$0, $$1, $$2);
         bwq.g.a $$3 = $$0.m();
         if ($$3 != null) {
            this.a.a($$1.a, $$3.a(), $$3.b(), $$0);
         } else {
            $$1.a.b();
         }
      }

      public void a(hfl $$0, flo $$1, gsa $$2, int $$3, float $$4) {
         if (!$$0.a.c()) {
            $$1.a(a.d.rotation((float) Math.PI));
            $$0.a.a($$1, $$2, $$3, hkq.d);
         }
      }
   }

   public static class c extends gxw<bwq.k, bwq.k.e, hgq> {
      private final ftv a;

      protected c(gyi.a $$0) {
         super($$0);
         this.a = $$0.j();
      }

      public hgq a() {
         return new hgq();
      }

      public void a(bwq.k $$0, hgq $$1, float $$2) {
         super.a($$0, $$1, $$2);
         $$1.a = $$0.m();
         $$1.f = $$0.a(this::a);
      }

      private bwq.k.b a(xa $$0, int $$1) {
         List<aza> $$2 = this.a.c($$0, $$1);
         List<bwq.k.c> $$3 = new ArrayList<>($$2.size());
         int $$4 = 0;

         for (aza $$5 : $$2) {
            int $$6 = this.a.a($$5);
            $$4 = Math.max($$4, $$6);
            $$3.add(new bwq.k.c($$5, $$6));
         }

         return new bwq.k.b($$3, $$4);
      }

      public void a(hgq $$0, flo $$1, gsa $$2, int $$3, float $$4) {
         bwq.k.e $$5 = $$0.a;
         byte $$6 = $$5.e();
         boolean $$7 = ($$6 & 2) != 0;
         boolean $$8 = ($$6 & 4) != 0;
         boolean $$9 = ($$6 & 1) != 0;
         bwq.k.a $$10 = bwq.k.a($$6);
         byte $$11 = (byte)$$5.c().get($$4);
         int $$13;
         if ($$8) {
            float $$12 = frd.Q().n.a(0.25F);
            $$13 = (int)($$12 * 255.0F) << 24;
         } else {
            $$13 = $$5.d().get($$4);
         }

         float $$15 = 0.0F;
         Matrix4f $$16 = $$1.c().a();
         $$16.rotate((float) Math.PI, 0.0F, 1.0F, 0.0F);
         $$16.scale(-0.025F, -0.025F, -0.025F);
         bwq.k.b $$17 = $$0.f;
         int $$18 = 1;
         int $$19 = 9 + 1;
         int $$20 = $$17.b();
         int $$21 = $$17.a().size() * $$19 - 1;
         $$16.translate(1.0F - (float)$$20 / 2.0F, (float)(-$$21), 0.0F);
         if ($$13 != 0) {
            flr $$22 = $$2.getBuffer($$7 ? gsl.p() : gsl.o());
            $$22.a($$16, -1.0F, -1.0F, 0.0F).a($$13).c($$3);
            $$22.a($$16, -1.0F, (float)$$21, 0.0F).a($$13).c($$3);
            $$22.a($$16, (float)$$20, (float)$$21, 0.0F).a($$13).c($$3);
            $$22.a($$16, (float)$$20, -1.0F, 0.0F).a($$13).c($$3);
         }

         for (bwq.k.c $$23 : $$17.a()) {
            float $$24 = switch ($$10) {
               case b -> 0.0F;
               case c -> (float)($$20 - $$23.b());
               case a -> (float)$$20 / 2.0F - (float)$$23.b() / 2.0F;
            };
            this.a.a($$23.a(), $$24, $$15, $$11 << 24 | 16777215, $$9, $$16, $$2, $$7 ? ftv.a.b : ftv.a.c, 0, $$3);
            $$15 += (float)$$19;
         }
      }
   }
}
