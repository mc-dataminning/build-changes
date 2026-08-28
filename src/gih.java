import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Quaternionf;

public abstract class gih<T extends bso, S> extends gir<T> {
   private final giq a;

   protected gih(gis.a $$0) {
      super($$0);
      this.a = $$0.a();
   }

   public alb a(T $$0) {
      return got.e;
   }

   public void a(T $$0, float $$1, float $$2, ezt $$3, gdj $$4, int $$5) {
      bso.k $$6 = $$0.p();
      if ($$6 != null) {
         S $$7 = this.b($$0);
         if ($$7 != null) {
            float $$8 = $$0.a($$2);
            this.d = $$6.d().get($$8);
            this.e = $$6.e().get($$8);
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

   private Quaternionf a(bso.k $$0, T $$1, float $$2, Quaternionf $$3) {
      fel $$4 = this.a.b;

      return switch ($$0.b()) {
         case a -> $$3.rotationYXZ((float) (-Math.PI / 180.0) * a($$1, $$2), (float) (Math.PI / 180.0) * b($$1, $$2), 0.0F);
         case c -> $$3.rotationYXZ((float) (-Math.PI / 180.0) * a($$1, $$2), (float) (Math.PI / 180.0) * b($$4), 0.0F);
         case b -> $$3.rotationYXZ((float) (-Math.PI / 180.0) * a($$4), (float) (Math.PI / 180.0) * b($$1, $$2), 0.0F);
         case d -> $$3.rotationYXZ((float) (-Math.PI / 180.0) * a($$4), (float) (Math.PI / 180.0) * b($$4), 0.0F);
      };
   }

   private static float a(fel $$0) {
      return $$0.e() - 180.0F;
   }

   private static float b(fel $$0) {
      return -$$0.d();
   }

   private static <T extends bso> float a(T $$0, float $$1) {
      return ayu.j($$1, $$0.O, $$0.dF());
   }

   private static <T extends bso> float b(T $$0, float $$1) {
      return ayu.i($$1, $$0.P, $$0.dH());
   }

   @Nullable
   protected abstract S b(T var1);

   protected abstract void a(T var1, S var2, ezt var3, gdj var4, int var5, float var6);

   public static class a extends gih<bso.b, bso.b.a> {
      private final ged a;

      protected a(gis.a $$0) {
         super($$0);
         this.a = $$0.c();
      }

      @Nullable
      protected bso.b.a a(bso.b $$0) {
         return $$0.s();
      }

      public void a(bso.b $$0, bso.b.a $$1, ezt $$2, gdj $$3, int $$4, float $$5) {
         this.a.a($$1.a(), $$2, $$3, $$4, gol.d);
      }
   }

   public static class b extends gih<bso.g, bso.g.a> {
      private final gjq a;

      protected b(gis.a $$0) {
         super($$0);
         this.a = $$0.b();
      }

      @Nullable
      protected bso.g.a a(bso.g $$0) {
         return $$0.s();
      }

      public void a(bso.g $$0, bso.g.a $$1, ezt $$2, gdj $$3, int $$4, float $$5) {
         $$2.a(a.d.rotation((float) Math.PI));
         this.a.a($$1.a(), $$1.b(), $$4, gol.d, $$2, $$3, $$0.dP(), $$0.al());
      }
   }

   public static class c extends gih<bso.l, bso.l.e> {
      private final fgk a;

      protected c(gis.a $$0) {
         super($$0);
         this.a = $$0.h();
      }

      private bso.l.b a(xl $$0, int $$1) {
         List<ayg> $$2 = this.a.c($$0, $$1);
         List<bso.l.c> $$3 = new ArrayList<>($$2.size());
         int $$4 = 0;

         for (ayg $$5 : $$2) {
            int $$6 = this.a.a($$5);
            $$4 = Math.max($$4, $$6);
            $$3.add(new bso.l.c($$5, $$6));
         }

         return new bso.l.b($$3, $$4);
      }

      @Nullable
      protected bso.l.e a(bso.l $$0) {
         return $$0.s();
      }

      public void a(bso.l $$0, bso.l.e $$1, ezt $$2, gdj $$3, int $$4, float $$5) {
         byte $$6 = $$1.e();
         boolean $$7 = ($$6 & 2) != 0;
         boolean $$8 = ($$6 & 4) != 0;
         boolean $$9 = ($$6 & 1) != 0;
         bso.l.a $$10 = bso.l.a($$6);
         byte $$11 = (byte)$$1.c().get($$5);
         int $$13;
         if ($$8) {
            float $$12 = ffa.Q().m.a(0.25F);
            $$13 = (int)($$12 * 255.0F) << 24;
         } else {
            $$13 = $$1.d().get($$5);
         }

         float $$15 = 0.0F;
         Matrix4f $$16 = $$2.c().a();
         $$16.rotate((float) Math.PI, 0.0F, 1.0F, 0.0F);
         $$16.scale(-0.025F, -0.025F, -0.025F);
         bso.l.b $$17 = $$0.a(this::a);
         int $$18 = 9 + 1;
         int $$19 = $$17.b();
         int $$20 = $$17.a().size() * $$18;
         $$16.translate(1.0F - (float)$$19 / 2.0F, (float)(-$$20), 0.0F);
         if ($$13 != 0) {
            ezx $$21 = $$3.getBuffer($$7 ? gdr.r() : gdr.q());
            $$21.a($$16, -1.0F, -1.0F, 0.0F).a($$13).b($$4).e();
            $$21.a($$16, -1.0F, (float)$$20, 0.0F).a($$13).b($$4).e();
            $$21.a($$16, (float)$$19, (float)$$20, 0.0F).a($$13).b($$4).e();
            $$21.a($$16, (float)$$19, -1.0F, 0.0F).a($$13).b($$4).e();
         }

         for (bso.l.c $$22 : $$17.a()) {
            float $$23 = switch ($$10) {
               case b -> 0.0F;
               case c -> (float)($$19 - $$22.b());
               case a -> (float)$$19 / 2.0F - (float)$$22.b() / 2.0F;
            };
            this.a.a($$22.a(), $$23, $$15, $$11 << 24 | 16777215, $$9, $$16, $$3, $$7 ? fgk.a.b : fgk.a.c, 0, $$4);
            $$15 += (float)$$18;
         }
      }
   }
}
