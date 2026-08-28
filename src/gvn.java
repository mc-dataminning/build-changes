import java.util.ArrayList;
import java.util.List;
import org.joml.Matrix4f;
import org.joml.Quaternionf;

public abstract class gvn<T extends bwa, S, ST extends hbz> extends gvy<T, ST> {
   private final gvx a;

   protected gvn(gvz.a $$0) {
      super($$0);
      this.a = $$0.a();
   }

   protected fed a(T $$0) {
      return $$0.f();
   }

   protected boolean b(T $$0) {
      return $$0.g();
   }

   private static int c(bwa $$0) {
      bwa.j $$1 = $$0.j();
      return $$1 != null ? $$1.c() : -1;
   }

   protected int a(T $$0, iu $$1) {
      int $$2 = c($$0);
      return $$2 != -1 ? gpp.b($$2) : super.b($$0, $$1);
   }

   protected int b(T $$0, iu $$1) {
      int $$2 = c($$0);
      return $$2 != -1 ? gpp.a($$2) : super.a($$0, $$1);
   }

   protected float a(ST $$0) {
      bwa.j $$1 = $$0.b;
      return $$1 == null ? 0.0F : $$1.d().get($$0.c);
   }

   protected float b(ST $$0) {
      bwa.j $$1 = $$0.b;
      return $$1 == null ? 0.0F : $$1.e().get($$0.c);
   }

   public void a(ST $$0, fjc $$1, gps $$2, int $$3) {
      bwa.j $$4 = $$0.b;
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

   private Quaternionf a(bwa.j $$0, ST $$1, Quaternionf $$2) {
      fnz $$3 = this.a.b;

      return switch ($$0.b()) {
         case a -> $$2.rotationYXZ((float) (-Math.PI / 180.0) * $$1.d, (float) (Math.PI / 180.0) * $$1.e, 0.0F);
         case c -> $$2.rotationYXZ((float) (-Math.PI / 180.0) * $$1.d, (float) (Math.PI / 180.0) * b($$3), 0.0F);
         case b -> $$2.rotationYXZ((float) (-Math.PI / 180.0) * a($$3), (float) (Math.PI / 180.0) * $$1.e, 0.0F);
         case d -> $$2.rotationYXZ((float) (-Math.PI / 180.0) * a($$3), (float) (Math.PI / 180.0) * b($$3), 0.0F);
      };
   }

   private static float a(fnz $$0) {
      return $$0.e() - 180.0F;
   }

   private static float b(fnz $$0) {
      return -$$0.d();
   }

   private static <T extends bwa> float a(T $$0, float $$1) {
      return $$0.l($$1);
   }

   private static <T extends bwa> float b(T $$0, float $$1) {
      return $$0.k($$1);
   }

   protected abstract void a(ST var1, fjc var2, gps var3, int var4, float var5);

   public void a(T $$0, ST $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.j();
      $$1.c = $$0.a($$2);
      $$1.d = a($$0, $$2);
      $$1.e = b($$0, $$2);
   }

   public static class a extends gvn<bwa.b, bwa.b.a, hbp> {
      private final gqw a;

      protected a(gvz.a $$0) {
         super($$0);
         this.a = $$0.d();
      }

      public hbp a() {
         return new hbp();
      }

      public void a(bwa.b $$0, hbp $$1, float $$2) {
         super.a($$0, $$1, $$2);
         $$1.a = $$0.m();
      }

      public void a(hbp $$0, fjc $$1, gps $$2, int $$3, float $$4) {
         this.a.a($$0.a.a(), $$1, $$2, $$3, hif.d);
      }
   }

   public static class b extends gvn<bwa.g, bwa.g.a, hdb> {
      private final hfg a;

      protected b(gvz.a $$0) {
         super($$0);
         this.a = $$0.b();
      }

      public hdb a() {
         return new hdb();
      }

      public void a(bwa.g $$0, hdb $$1, float $$2) {
         super.a($$0, $$1, $$2);
         bwa.g.a $$3 = $$0.m();
         if ($$3 != null) {
            this.a.a($$1.a, $$3.a(), $$3.b(), $$0);
         } else {
            $$1.a.b();
         }
      }

      public void a(hdb $$0, fjc $$1, gps $$2, int $$3, float $$4) {
         if (!$$0.a.c()) {
            $$1.a(a.d.rotation((float) Math.PI));
            $$0.a.a($$1, $$2, $$3, hif.d);
         }
      }
   }

   public static class c extends gvn<bwa.k, bwa.k.e, heg> {
      private final frm a;

      protected c(gvz.a $$0) {
         super($$0);
         this.a = $$0.j();
      }

      public heg a() {
         return new heg();
      }

      public void a(bwa.k $$0, heg $$1, float $$2) {
         super.a($$0, $$1, $$2);
         $$1.a = $$0.m();
         $$1.f = $$0.a(this::a);
      }

      private bwa.k.b a(wy $$0, int $$1) {
         List<ayy> $$2 = this.a.c($$0, $$1);
         List<bwa.k.c> $$3 = new ArrayList<>($$2.size());
         int $$4 = 0;

         for (ayy $$5 : $$2) {
            int $$6 = this.a.a($$5);
            $$4 = Math.max($$4, $$6);
            $$3.add(new bwa.k.c($$5, $$6));
         }

         return new bwa.k.b($$3, $$4);
      }

      public void a(heg $$0, fjc $$1, gps $$2, int $$3, float $$4) {
         bwa.k.e $$5 = $$0.a;
         byte $$6 = $$5.e();
         boolean $$7 = ($$6 & 2) != 0;
         boolean $$8 = ($$6 & 4) != 0;
         boolean $$9 = ($$6 & 1) != 0;
         bwa.k.a $$10 = bwa.k.a($$6);
         byte $$11 = (byte)$$5.c().get($$4);
         int $$13;
         if ($$8) {
            float $$12 = fos.Q().n.a(0.25F);
            $$13 = (int)($$12 * 255.0F) << 24;
         } else {
            $$13 = $$5.d().get($$4);
         }

         float $$15 = 0.0F;
         Matrix4f $$16 = $$1.c().a();
         $$16.rotate((float) Math.PI, 0.0F, 1.0F, 0.0F);
         $$16.scale(-0.025F, -0.025F, -0.025F);
         bwa.k.b $$17 = $$0.f;
         int $$18 = 1;
         int $$19 = 9 + 1;
         int $$20 = $$17.b();
         int $$21 = $$17.a().size() * $$19 - 1;
         $$16.translate(1.0F - (float)$$20 / 2.0F, (float)(-$$21), 0.0F);
         if ($$13 != 0) {
            fjg $$22 = $$2.getBuffer($$7 ? gqc.o() : gqc.n());
            $$22.a($$16, -1.0F, -1.0F, 0.0F).a($$13).c($$3);
            $$22.a($$16, -1.0F, (float)$$21, 0.0F).a($$13).c($$3);
            $$22.a($$16, (float)$$20, (float)$$21, 0.0F).a($$13).c($$3);
            $$22.a($$16, (float)$$20, -1.0F, 0.0F).a($$13).c($$3);
         }

         for (bwa.k.c $$23 : $$17.a()) {
            float $$24 = switch ($$10) {
               case b -> 0.0F;
               case c -> (float)($$20 - $$23.b());
               case a -> (float)$$20 / 2.0F - (float)$$23.b() / 2.0F;
            };
            this.a.a($$23.a(), $$24, $$15, $$11 << 24 | 16777215, $$9, $$16, $$2, $$7 ? frm.a.b : frm.a.c, 0, $$3);
            $$15 += (float)$$19;
         }
      }
   }
}
