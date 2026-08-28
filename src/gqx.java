import java.util.ArrayList;
import java.util.List;
import org.joml.Matrix4f;
import org.joml.Quaternionf;

public abstract class gqx<T extends bvd, S, ST extends gxi> extends gri<T, ST> {
   private final grh a;

   protected gqx(grj.a $$0) {
      super($$0);
      this.a = $$0.a();
   }

   protected fbn a(T $$0) {
      return $$0.l();
   }

   protected boolean b(T $$0) {
      return $$0.m();
   }

   private static int c(bvd $$0) {
      bvd.k $$1 = $$0.p();
      return $$1 != null ? $$1.c() : -1;
   }

   protected int a(T $$0, jh $$1) {
      int $$2 = c($$0);
      return $$2 != -1 ? glc.b($$2) : super.b($$0, $$1);
   }

   protected int b(T $$0, jh $$1) {
      int $$2 = c($$0);
      return $$2 != -1 ? glc.a($$2) : super.a($$0, $$1);
   }

   public void a(ST $$0, fgl $$1, gle $$2, int $$3) {
      bvd.k $$4 = $$0.b;
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

   private Quaternionf a(bvd.k $$0, ST $$1, Quaternionf $$2) {
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

   private static <T extends bvd> float a(T $$0, float $$1) {
      return $$0.k($$1);
   }

   private static <T extends bvd> float b(T $$0, float $$1) {
      return $$0.j($$1);
   }

   protected abstract void a(ST var1, fgl var2, gle var3, int var4, float var5);

   public void a(T $$0, ST $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.p();
      $$1.c = $$0.a($$2);
      $$1.d = a($$0, $$2);
      $$1.e = b($$0, $$2);
   }

   public static class a extends gqx<bvd.b, bvd.b.a, gwz> {
      private final gmh a;

      protected a(grj.a $$0) {
         super($$0);
         this.a = $$0.d();
      }

      public gwz a() {
         return new gwz();
      }

      public void a(bvd.b $$0, gwz $$1, float $$2) {
         super.a($$0, $$1, $$2);
         $$1.a = $$0.s();
      }

      public void a(gwz $$0, fgl $$1, gle $$2, int $$3, float $$4) {
         this.a.a($$0.a.a(), $$1, $$2, $$3, hav.d);
      }
   }

   public static class b extends gqx<bvd.g, bvd.g.a, gyi> {
      private final gsh a;

      protected b(grj.a $$0) {
         super($$0);
         this.a = $$0.b();
      }

      public gyi a() {
         return new gyi();
      }

      public void a(bvd.g $$0, gyi $$1, float $$2) {
         super.a($$0, $$1, $$2);
         bvd.g.a $$3 = $$0.s();
         if ($$3 != null) {
            $$1.a = $$3;
            $$1.f = this.a.a($$1.a.a(), $$0.dV(), null, $$0.ar());
         } else {
            $$1.a = null;
            $$1.f = null;
         }
      }

      public void a(gyi $$0, fgl $$1, gle $$2, int $$3, float $$4) {
         bvd.g.a $$5 = $$0.a;
         hdg $$6 = $$0.f;
         if ($$5 != null && $$6 != null) {
            $$1.a(a.d.rotation((float) Math.PI));
            this.a.a($$5.a(), $$5.b(), false, $$1, $$2, $$3, hav.d, $$6);
         }
      }
   }

   public static class c extends gqx<bvd.l, bvd.l.e, gzo> {
      private final fnj a;

      protected c(grj.a $$0) {
         super($$0);
         this.a = $$0.j();
      }

      public gzo a() {
         return new gzo();
      }

      public void a(bvd.l $$0, gzo $$1, float $$2) {
         super.a($$0, $$1, $$2);
         $$1.a = $$0.s();
         $$1.f = $$0.a(this::a);
      }

      private bvd.l.b a(xv $$0, int $$1) {
         List<azq> $$2 = this.a.c($$0, $$1);
         List<bvd.l.c> $$3 = new ArrayList<>($$2.size());
         int $$4 = 0;

         for (azq $$5 : $$2) {
            int $$6 = this.a.a($$5);
            $$4 = Math.max($$4, $$6);
            $$3.add(new bvd.l.c($$5, $$6));
         }

         return new bvd.l.b($$3, $$4);
      }

      public void a(gzo $$0, fgl $$1, gle $$2, int $$3, float $$4) {
         bvd.l.e $$5 = $$0.a;
         byte $$6 = $$5.e();
         boolean $$7 = ($$6 & 2) != 0;
         boolean $$8 = ($$6 & 4) != 0;
         boolean $$9 = ($$6 & 1) != 0;
         bvd.l.a $$10 = bvd.l.a($$6);
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
         bvd.l.b $$17 = $$0.f;
         int $$18 = 1;
         int $$19 = 9 + 1;
         int $$20 = $$17.b();
         int $$21 = $$17.a().size() * $$19 - 1;
         $$16.translate(1.0F - (float)$$20 / 2.0F, (float)(-$$21), 0.0F);
         if ($$13 != 0) {
            fgp $$22 = $$2.getBuffer($$7 ? glo.o() : glo.n());
            $$22.a($$16, -1.0F, -1.0F, 0.0F).a($$13).c($$3);
            $$22.a($$16, -1.0F, (float)$$21, 0.0F).a($$13).c($$3);
            $$22.a($$16, (float)$$20, (float)$$21, 0.0F).a($$13).c($$3);
            $$22.a($$16, (float)$$20, -1.0F, 0.0F).a($$13).c($$3);
         }

         for (bvd.l.c $$23 : $$17.a()) {
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
