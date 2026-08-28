import java.util.ArrayList;
import java.util.List;
import org.joml.Matrix4f;
import org.joml.Quaternionf;

public abstract class gmg<T extends bth, S, ST extends gso> extends gmr<T, ST> {
   private final gmq a;

   protected gmg(gms.a $$0) {
      super($$0);
      this.a = $$0.a();
   }

   protected exz a(T $$0) {
      return $$0.m();
   }

   protected boolean b(T $$0) {
      return $$0.o();
   }

   public alb a(gso $$0) {
      return gwj.d;
   }

   public void a(ST $$0, fcu $$1, ggv $$2, int $$3) {
      bth.k $$4 = $$0.b;
      if ($$4 != null) {
         if ($$0.a()) {
            float $$5 = $$0.c;
            this.f = $$4.d().get($$5);
            this.g = $$4.e().get($$5);
            int $$6 = $$4.c();
            int $$7 = $$6 != -1 ? $$6 : $$3;
            super.a($$0, $$1, $$2, $$7);
            $$1.a();
            $$1.a(this.a($$4, $$0, new Quaternionf()));
            j $$8 = $$4.a().get($$5);
            $$1.a($$8.c());
            this.a($$0, $$1, $$2, $$7, $$5);
            $$1.b();
         }
      }
   }

   private Quaternionf a(bth.k $$0, ST $$1, Quaternionf $$2) {
      fhk $$3 = this.a.b;

      return switch ($$0.b()) {
         case a -> $$2.rotationYXZ((float) (-Math.PI / 180.0) * $$1.d, (float) (Math.PI / 180.0) * $$1.e, 0.0F);
         case c -> $$2.rotationYXZ((float) (-Math.PI / 180.0) * $$1.d, (float) (Math.PI / 180.0) * b($$3), 0.0F);
         case b -> $$2.rotationYXZ((float) (-Math.PI / 180.0) * a($$3), (float) (Math.PI / 180.0) * $$1.e, 0.0F);
         case d -> $$2.rotationYXZ((float) (-Math.PI / 180.0) * a($$3), (float) (Math.PI / 180.0) * b($$3), 0.0F);
      };
   }

   private static float a(fhk $$0) {
      return $$0.e() - 180.0F;
   }

   private static float b(fhk $$0) {
      return -$$0.d();
   }

   private static <T extends bth> float a(T $$0, float $$1) {
      return $$0.k($$1);
   }

   private static <T extends bth> float b(T $$0, float $$1) {
      return $$0.j($$1);
   }

   protected abstract void a(ST var1, fcu var2, ggv var3, int var4, float var5);

   public void a(T $$0, ST $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.q();
      $$1.c = $$0.a($$2);
      $$1.d = a($$0, $$2);
      $$1.e = b($$0, $$2);
   }

   public static class a extends gmg<bth.b, bth.b.a, gsg> {
      private final ghu a;

      protected a(gms.a $$0) {
         super($$0);
         this.a = $$0.d();
      }

      public gsg a() {
         return new gsg();
      }

      public void a(bth.b $$0, gsg $$1, float $$2) {
         super.a($$0, $$1, $$2);
         $$1.a = $$0.t();
      }

      public void a(gsg $$0, fcu $$1, ggv $$2, int $$3, float $$4) {
         this.a.a($$0.a.a(), $$1, $$2, $$3, gwb.d);
      }
   }

   public static class b extends gmg<bth.g, bth.g.a, gto> {
      private final gnq a;

      protected b(gms.a $$0) {
         super($$0);
         this.a = $$0.b();
      }

      public gto a() {
         return new gto();
      }

      public void a(bth.g $$0, gto $$1, float $$2) {
         super.a($$0, $$1, $$2);
         bth.g.a $$3 = $$0.t();
         if ($$3 != null) {
            $$1.a = $$3;
            $$1.f = this.a.a($$1.a.a(), $$0.dS(), null, $$0.ap());
         } else {
            $$1.a = null;
            $$1.f = null;
         }
      }

      public void a(gto $$0, fcu $$1, ggv $$2, int $$3, float $$4) {
         bth.g.a $$5 = $$0.a;
         gym $$6 = $$0.f;
         if ($$5 != null && $$6 != null) {
            $$1.a(a.d.rotation((float) Math.PI));
            this.a.a($$5.a(), $$5.b(), false, $$1, $$2, $$3, gwb.d, $$6);
         }
      }
   }

   public static class c extends gmg<bth.l, bth.l.e, guu> {
      private final fjl a;

      protected c(gms.a $$0) {
         super($$0);
         this.a = $$0.h();
      }

      public guu a() {
         return new guu();
      }

      public void a(bth.l $$0, guu $$1, float $$2) {
         super.a($$0, $$1, $$2);
         $$1.a = $$0.t();
         $$1.f = $$0.a(this::a);
      }

      private bth.l.b a(xd $$0, int $$1) {
         List<ayo> $$2 = this.a.c($$0, $$1);
         List<bth.l.c> $$3 = new ArrayList<>($$2.size());
         int $$4 = 0;

         for (ayo $$5 : $$2) {
            int $$6 = this.a.a($$5);
            $$4 = Math.max($$4, $$6);
            $$3.add(new bth.l.c($$5, $$6));
         }

         return new bth.l.b($$3, $$4);
      }

      public void a(guu $$0, fcu $$1, ggv $$2, int $$3, float $$4) {
         bth.l.e $$5 = $$0.a;
         byte $$6 = $$5.e();
         boolean $$7 = ($$6 & 2) != 0;
         boolean $$8 = ($$6 & 4) != 0;
         boolean $$9 = ($$6 & 1) != 0;
         bth.l.a $$10 = bth.l.a($$6);
         byte $$11 = (byte)$$5.c().get($$4);
         int $$13;
         if ($$8) {
            float $$12 = fib.Q().n.a(0.25F);
            $$13 = (int)($$12 * 255.0F) << 24;
         } else {
            $$13 = $$5.d().get($$4);
         }

         float $$15 = 0.0F;
         Matrix4f $$16 = $$1.c().a();
         $$16.rotate((float) Math.PI, 0.0F, 1.0F, 0.0F);
         $$16.scale(-0.025F, -0.025F, -0.025F);
         bth.l.b $$17 = $$0.f;
         int $$18 = 1;
         int $$19 = 9 + 1;
         int $$20 = $$17.b();
         int $$21 = $$17.a().size() * $$19 - 1;
         $$16.translate(1.0F - (float)$$20 / 2.0F, (float)(-$$21), 0.0F);
         if ($$13 != 0) {
            fcy $$22 = $$2.getBuffer($$7 ? ghe.p() : ghe.o());
            $$22.a($$16, -1.0F, -1.0F, 0.0F).a($$13).c($$3);
            $$22.a($$16, -1.0F, (float)$$21, 0.0F).a($$13).c($$3);
            $$22.a($$16, (float)$$20, (float)$$21, 0.0F).a($$13).c($$3);
            $$22.a($$16, (float)$$20, -1.0F, 0.0F).a($$13).c($$3);
         }

         for (bth.l.c $$23 : $$17.a()) {
            float $$24 = switch ($$10) {
               case b -> 0.0F;
               case c -> (float)($$20 - $$23.b());
               case a -> (float)$$20 / 2.0F - (float)$$23.b() / 2.0F;
            };
            this.a.a($$23.a(), $$24, $$15, $$11 << 24 | 16777215, $$9, $$16, $$2, $$7 ? fjl.a.b : fjl.a.c, 0, $$3);
            $$15 += (float)$$19;
         }
      }
   }
}
