import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Quaternionf;

public abstract class fxu<T extends blo, S> extends fye<T> {
   private final fyd a;

   protected fxu(fyf.a $$0) {
      super($$0);
      this.a = $$0.a();
   }

   public ahd a(T $$0) {
      return gee.e;
   }

   public void a(T $$0, float $$1, float $$2, ept $$3, fsz $$4, int $$5) {
      blo.k $$6 = $$0.q();
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
            $$3.c().b().rotate($$11.e()).rotate($$11.g());
            this.a($$0, $$7, $$3, $$4, $$10, $$8);
            $$3.b();
         }
      }
   }

   private Quaternionf a(blo.k $$0, T $$1, float $$2, Quaternionf $$3) {
      eul $$4 = this.a.b;

      return switch ($$0.b()) {
         case a -> $$3.rotationYXZ((float) (-Math.PI / 180.0) * a($$1, $$2), (float) (Math.PI / 180.0) * b($$1, $$2), 0.0F);
         case c -> $$3.rotationYXZ((float) (-Math.PI / 180.0) * a($$1, $$2), (float) (Math.PI / 180.0) * b($$4), 0.0F);
         case b -> $$3.rotationYXZ((float) (-Math.PI / 180.0) * a($$4), (float) (Math.PI / 180.0) * b($$1, $$2), 0.0F);
         case d -> $$3.rotationYXZ((float) (-Math.PI / 180.0) * a($$4), (float) (Math.PI / 180.0) * b($$4), 0.0F);
      };
   }

   private static float a(eul $$0) {
      return $$0.e() - 180.0F;
   }

   private static float b(eul $$0) {
      return -$$0.d();
   }

   private static <T extends blo> float a(T $$0, float $$1) {
      return aui.j($$1, $$0.N, $$0.dC());
   }

   private static <T extends blo> float b(T $$0, float $$1) {
      return aui.i($$1, $$0.O, $$0.dE());
   }

   @Nullable
   protected abstract S b(T var1);

   protected abstract void a(T var1, S var2, ept var3, fsz var4, int var5, float var6);

   public static class a extends fxu<blo.b, blo.b.a> {
      private final ftt a;

      protected a(fyf.a $$0) {
         super($$0);
         this.a = $$0.c();
      }

      @Nullable
      protected blo.b.a a(blo.b $$0) {
         return $$0.s();
      }

      public void a(blo.b $$0, blo.b.a $$1, ept $$2, fsz $$3, int $$4, float $$5) {
         this.a.a($$1.a(), $$2, $$3, $$4, gdw.d);
      }
   }

   public static class b extends fxu<blo.g, blo.g.a> {
      private final fzd a;

      protected b(fyf.a $$0) {
         super($$0);
         this.a = $$0.b();
      }

      @Nullable
      protected blo.g.a a(blo.g $$0) {
         return $$0.s();
      }

      public void a(blo.g $$0, blo.g.a $$1, ept $$2, fsz $$3, int $$4, float $$5) {
         $$2.a(a.d.rotation((float) Math.PI));
         this.a.a($$1.a(), $$1.b(), $$4, gdw.d, $$2, $$3, $$0.dM(), $$0.aj());
      }
   }

   public static class c extends fxu<blo.l, blo.l.e> {
      private final ewk a;

      protected c(fyf.a $$0) {
         super($$0);
         this.a = $$0.h();
      }

      private blo.l.b a(vd $$0, int $$1) {
         List<atu> $$2 = this.a.c($$0, $$1);
         List<blo.l.c> $$3 = new ArrayList<>($$2.size());
         int $$4 = 0;

         for (atu $$5 : $$2) {
            int $$6 = this.a.a($$5);
            $$4 = Math.max($$4, $$6);
            $$3.add(new blo.l.c($$5, $$6));
         }

         return new blo.l.b($$3, $$4);
      }

      @Nullable
      protected blo.l.e a(blo.l $$0) {
         return $$0.s();
      }

      public void a(blo.l $$0, blo.l.e $$1, ept $$2, fsz $$3, int $$4, float $$5) {
         byte $$6 = $$1.e();
         boolean $$7 = ($$6 & 2) != 0;
         boolean $$8 = ($$6 & 4) != 0;
         boolean $$9 = ($$6 & 1) != 0;
         blo.l.a $$10 = blo.l.a($$6);
         byte $$11 = (byte)$$1.c().get($$5);
         int $$13;
         if ($$8) {
            float $$12 = eva.N().m.a(0.25F);
            $$13 = (int)($$12 * 255.0F) << 24;
         } else {
            $$13 = $$1.d().get($$5);
         }

         float $$15 = 0.0F;
         Matrix4f $$16 = $$2.c().a();
         $$16.rotate((float) Math.PI, 0.0F, 1.0F, 0.0F);
         $$16.scale(-0.025F, -0.025F, -0.025F);
         blo.l.b $$17 = $$0.a(this::a);
         int $$18 = 9 + 1;
         int $$19 = $$17.b();
         int $$20 = $$17.a().size() * $$18;
         $$16.translate(1.0F - (float)$$19 / 2.0F, (float)(-$$20), 0.0F);
         if ($$13 != 0) {
            epx $$21 = $$3.getBuffer($$7 ? fth.r() : fth.q());
            $$21.a($$16, -1.0F, -1.0F, 0.0F).a($$13).b($$4).e();
            $$21.a($$16, -1.0F, (float)$$20, 0.0F).a($$13).b($$4).e();
            $$21.a($$16, (float)$$19, (float)$$20, 0.0F).a($$13).b($$4).e();
            $$21.a($$16, (float)$$19, -1.0F, 0.0F).a($$13).b($$4).e();
         }

         for (blo.l.c $$22 : $$17.a()) {
            float $$23 = switch ($$10) {
               case b -> 0.0F;
               case c -> (float)($$19 - $$22.b());
               case a -> (float)$$19 / 2.0F - (float)$$22.b() / 2.0F;
            };
            this.a.a($$22.a(), $$23, $$15, $$11 << 24 | 16777215, $$9, $$16, $$3, $$7 ? ewk.a.b : ewk.a.c, 0, $$4);
            $$15 += (float)$$18;
         }
      }
   }
}
