import java.util.ArrayList;
import java.util.List;
import org.joml.Matrix4f;
import org.joml.Quaternionf;

public abstract class grq<T extends bui, S, ST extends gyc> extends gsb<T, ST> {
   private final gsa a;

   protected grq(gsc.a $$0) {
      super($$0);
      this.a = $$0.a();
   }

   protected fav a(T $$0) {
      return $$0.l();
   }

   protected boolean b(T $$0) {
      return $$0.m();
   }

   private static int c(bui $$0) {
      bui.k $$1 = $$0.p();
      return $$1 != null ? $$1.c() : -1;
   }

   protected int a(T $$0, ji $$1) {
      int $$2 = c($$0);
      return $$2 != -1 ? glv.b($$2) : super.b($$0, $$1);
   }

   protected int b(T $$0, ji $$1) {
      int $$2 = c($$0);
      return $$2 != -1 ? glv.a($$2) : super.a($$0, $$1);
   }

   protected float a(ST $$0) {
      bui.k $$1 = $$0.b;
      return $$1 == null ? 0.0F : $$1.d().get($$0.c);
   }

   protected float b(ST $$0) {
      bui.k $$1 = $$0.b;
      return $$1 == null ? 0.0F : $$1.e().get($$0.c);
   }

   public void a(ST $$0, ffu $$1, glx $$2, int $$3) {
      bui.k $$4 = $$0.b;
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

   private Quaternionf a(bui.k $$0, ST $$1, Quaternionf $$2) {
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

   private static <T extends bui> float a(T $$0, float $$1) {
      return $$0.k($$1);
   }

   private static <T extends bui> float b(T $$0, float $$1) {
      return $$0.j($$1);
   }

   protected abstract void a(ST var1, ffu var2, glx var3, int var4, float var5);

   public void a(T $$0, ST $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.p();
      $$1.c = $$0.a($$2);
      $$1.d = a($$0, $$2);
      $$1.e = b($$0, $$2);
   }

   public static class a extends grq<bui.b, bui.b.a, gxt> {
      private final gnb a;

      protected a(gsc.a $$0) {
         super($$0);
         this.a = $$0.d();
      }

      public gxt a() {
         return new gxt();
      }

      public void a(bui.b $$0, gxt $$1, float $$2) {
         super.a($$0, $$1, $$2);
         $$1.a = $$0.s();
      }

      public void a(gxt $$0, ffu $$1, glx $$2, int $$3, float $$4) {
         this.a.a($$0.a.a(), $$1, $$2, $$3, hea.d);
      }
   }

   public static class b extends grq<bui.g, bui.g.a, gze> {
      private final hbj a;

      protected b(gsc.a $$0) {
         super($$0);
         this.a = $$0.b();
      }

      public gze a() {
         return new gze();
      }

      public void a(bui.g $$0, gze $$1, float $$2) {
         super.a($$0, $$1, $$2);
         bui.g.a $$3 = $$0.s();
         if ($$3 != null) {
            this.a.a($$1.a, $$3.a(), $$3.b(), $$0);
         } else {
            $$1.a.b();
         }
      }

      public void a(gze $$0, ffu $$1, glx $$2, int $$3, float $$4) {
         if (!$$0.a.c()) {
            $$1.a(a.d.rotation((float) Math.PI));
            $$0.a.a($$1, $$2, $$3, hea.d);
         }
      }
   }

   public static class c extends grq<bui.l, bui.l.e, hak> {
      private final fob a;

      protected c(gsc.a $$0) {
         super($$0);
         this.a = $$0.j();
      }

      public hak a() {
         return new hak();
      }

      public void a(bui.l $$0, hak $$1, float $$2) {
         super.a($$0, $$1, $$2);
         $$1.a = $$0.s();
         $$1.f = $$0.a(this::a);
      }

      private bui.l.b a(wo $$0, int $$1) {
         List<ayl> $$2 = this.a.c($$0, $$1);
         List<bui.l.c> $$3 = new ArrayList<>($$2.size());
         int $$4 = 0;

         for (ayl $$5 : $$2) {
            int $$6 = this.a.a($$5);
            $$4 = Math.max($$4, $$6);
            $$3.add(new bui.l.c($$5, $$6));
         }

         return new bui.l.b($$3, $$4);
      }

      public void a(hak $$0, ffu $$1, glx $$2, int $$3, float $$4) {
         bui.l.e $$5 = $$0.a;
         byte $$6 = $$5.e();
         boolean $$7 = ($$6 & 2) != 0;
         boolean $$8 = ($$6 & 4) != 0;
         boolean $$9 = ($$6 & 1) != 0;
         bui.l.a $$10 = bui.l.a($$6);
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
         bui.l.b $$17 = $$0.f;
         int $$18 = 1;
         int $$19 = 9 + 1;
         int $$20 = $$17.b();
         int $$21 = $$17.a().size() * $$19 - 1;
         $$16.translate(1.0F - (float)$$20 / 2.0F, (float)(-$$21), 0.0F);
         if ($$13 != 0) {
            ffy $$22 = $$2.getBuffer($$7 ? gmh.o() : gmh.n());
            $$22.a($$16, -1.0F, -1.0F, 0.0F).a($$13).c($$3);
            $$22.a($$16, -1.0F, (float)$$21, 0.0F).a($$13).c($$3);
            $$22.a($$16, (float)$$20, (float)$$21, 0.0F).a($$13).c($$3);
            $$22.a($$16, (float)$$20, -1.0F, 0.0F).a($$13).c($$3);
         }

         for (bui.l.c $$23 : $$17.a()) {
            float $$24 = switch ($$10) {
               case b -> 0.0F;
               case c -> (float)($$20 - $$23.b());
               case a -> (float)$$20 / 2.0F - (float)$$23.b() / 2.0F;
            };
            this.a.a($$23.a(), $$24, $$15, $$11 << 24 | 16777215, $$9, $$16, $$2, $$7 ? fob.a.b : fob.a.c, 0, $$3);
            $$15 += (float)$$19;
         }
      }
   }
}
