import java.util.ArrayList;
import java.util.List;
import org.joml.Matrix4f;
import org.joml.Quaternionf;

public abstract class grs<T extends buj, S, ST extends gye> extends gsd<T, ST> {
   private final gsc a;

   protected grs(gse.a $$0) {
      super($$0);
      this.a = $$0.a();
   }

   protected fav a(T $$0) {
      return $$0.l();
   }

   protected boolean b(T $$0) {
      return $$0.m();
   }

   private static int c(buj $$0) {
      buj.k $$1 = $$0.p();
      return $$1 != null ? $$1.c() : -1;
   }

   protected int a(T $$0, ji $$1) {
      int $$2 = c($$0);
      return $$2 != -1 ? glw.b($$2) : super.b($$0, $$1);
   }

   protected int b(T $$0, ji $$1) {
      int $$2 = c($$0);
      return $$2 != -1 ? glw.a($$2) : super.a($$0, $$1);
   }

   protected float a(ST $$0) {
      buj.k $$1 = $$0.b;
      return $$1 == null ? 0.0F : $$1.d().get($$0.c);
   }

   protected float b(ST $$0) {
      buj.k $$1 = $$0.b;
      return $$1 == null ? 0.0F : $$1.e().get($$0.c);
   }

   public void a(ST $$0, ffu $$1, gly $$2, int $$3) {
      buj.k $$4 = $$0.b;
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

   private Quaternionf a(buj.k $$0, ST $$1, Quaternionf $$2) {
      fkr $$3 = this.a.b;

      return switch ($$0.b()) {
         case a -> $$2.rotationYXZ((float) (-Math.PI / 180.0) * $$1.d, (float) (Math.PI / 180.0) * $$1.e, 0.0F);
         case c -> $$2.rotationYXZ((float) (-Math.PI / 180.0) * $$1.d, (float) (Math.PI / 180.0) * b($$3), 0.0F);
         case b -> $$2.rotationYXZ((float) (-Math.PI / 180.0) * a($$3), (float) (Math.PI / 180.0) * $$1.e, 0.0F);
         case d -> $$2.rotationYXZ((float) (-Math.PI / 180.0) * a($$3), (float) (Math.PI / 180.0) * b($$3), 0.0F);
      };
   }

   private static float a(fkr $$0) {
      return $$0.e() - 180.0F;
   }

   private static float b(fkr $$0) {
      return -$$0.d();
   }

   private static <T extends buj> float a(T $$0, float $$1) {
      return $$0.k($$1);
   }

   private static <T extends buj> float b(T $$0, float $$1) {
      return $$0.j($$1);
   }

   protected abstract void a(ST var1, ffu var2, gly var3, int var4, float var5);

   public void a(T $$0, ST $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.p();
      $$1.c = $$0.a($$2);
      $$1.d = a($$0, $$2);
      $$1.e = b($$0, $$2);
   }

   public static class a extends grs<buj.b, buj.b.a, gxv> {
      private final gnc a;

      protected a(gse.a $$0) {
         super($$0);
         this.a = $$0.d();
      }

      public gxv a() {
         return new gxv();
      }

      public void a(buj.b $$0, gxv $$1, float $$2) {
         super.a($$0, $$1, $$2);
         $$1.a = $$0.s();
      }

      public void a(gxv $$0, ffu $$1, gly $$2, int $$3, float $$4) {
         this.a.a($$0.a.a(), $$1, $$2, $$3, hei.d);
      }
   }

   public static class b extends grs<buj.g, buj.g.a, gzg> {
      private final hbm a;

      protected b(gse.a $$0) {
         super($$0);
         this.a = $$0.b();
      }

      public gzg a() {
         return new gzg();
      }

      public void a(buj.g $$0, gzg $$1, float $$2) {
         super.a($$0, $$1, $$2);
         buj.g.a $$3 = $$0.s();
         if ($$3 != null) {
            this.a.a($$1.a, $$3.a(), $$3.b(), $$0);
         } else {
            $$1.a.b();
         }
      }

      public void a(gzg $$0, ffu $$1, gly $$2, int $$3, float $$4) {
         if (!$$0.a.c()) {
            $$1.a(a.d.rotation((float) Math.PI));
            $$0.a.a($$1, $$2, $$3, hei.d);
         }
      }
   }

   public static class c extends grs<buj.l, buj.l.e, ham> {
      private final foc a;

      protected c(gse.a $$0) {
         super($$0);
         this.a = $$0.j();
      }

      public ham a() {
         return new ham();
      }

      public void a(buj.l $$0, ham $$1, float $$2) {
         super.a($$0, $$1, $$2);
         $$1.a = $$0.s();
         $$1.f = $$0.a(this::a);
      }

      private buj.l.b a(wp $$0, int $$1) {
         List<ayl> $$2 = this.a.c($$0, $$1);
         List<buj.l.c> $$3 = new ArrayList<>($$2.size());
         int $$4 = 0;

         for (ayl $$5 : $$2) {
            int $$6 = this.a.a($$5);
            $$4 = Math.max($$4, $$6);
            $$3.add(new buj.l.c($$5, $$6));
         }

         return new buj.l.b($$3, $$4);
      }

      public void a(ham $$0, ffu $$1, gly $$2, int $$3, float $$4) {
         buj.l.e $$5 = $$0.a;
         byte $$6 = $$5.e();
         boolean $$7 = ($$6 & 2) != 0;
         boolean $$8 = ($$6 & 4) != 0;
         boolean $$9 = ($$6 & 1) != 0;
         buj.l.a $$10 = buj.l.a($$6);
         byte $$11 = (byte)$$5.c().get($$4);
         int $$13;
         if ($$8) {
            float $$12 = flj.Q().n.a(0.25F);
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
            ffy $$22 = $$2.getBuffer($$7 ? gmi.o() : gmi.n());
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
            this.a.a($$23.a(), $$24, $$15, $$11 << 24 | 16777215, $$9, $$16, $$2, $$7 ? foc.a.b : foc.a.c, 0, $$3);
            $$15 += (float)$$19;
         }
      }
   }
}
