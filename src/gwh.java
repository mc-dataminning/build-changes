import java.util.ArrayList;
import java.util.List;
import org.joml.Matrix4f;
import org.joml.Quaternionf;

public abstract class gwh<T extends bwf, S, ST extends hct> extends gws<T, ST> {
   private final gwr a;

   protected gwh(gwt.a $$0) {
      super($$0);
      this.a = $$0.a();
   }

   protected fes a(T $$0) {
      return $$0.f();
   }

   protected boolean b(T $$0) {
      return $$0.g();
   }

   private static int c(bwf $$0) {
      bwf.j $$1 = $$0.j();
      return $$1 != null ? $$1.c() : -1;
   }

   protected int a(T $$0, iv $$1) {
      int $$2 = c($$0);
      return $$2 != -1 ? gqj.b($$2) : super.b($$0, $$1);
   }

   protected int b(T $$0, iv $$1) {
      int $$2 = c($$0);
      return $$2 != -1 ? gqj.a($$2) : super.a($$0, $$1);
   }

   protected float a(ST $$0) {
      bwf.j $$1 = $$0.b;
      return $$1 == null ? 0.0F : $$1.d().get($$0.c);
   }

   protected float b(ST $$0) {
      bwf.j $$1 = $$0.b;
      return $$1 == null ? 0.0F : $$1.e().get($$0.c);
   }

   public void a(ST $$0, fjy $$1, gqm $$2, int $$3) {
      bwf.j $$4 = $$0.b;
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

   private Quaternionf a(bwf.j $$0, ST $$1, Quaternionf $$2) {
      fow $$3 = this.a.b;

      return switch ($$0.b()) {
         case a -> $$2.rotationYXZ((float) (-Math.PI / 180.0) * $$1.d, (float) (Math.PI / 180.0) * $$1.e, 0.0F);
         case c -> $$2.rotationYXZ((float) (-Math.PI / 180.0) * $$1.d, (float) (Math.PI / 180.0) * b($$3), 0.0F);
         case b -> $$2.rotationYXZ((float) (-Math.PI / 180.0) * a($$3), (float) (Math.PI / 180.0) * $$1.e, 0.0F);
         case d -> $$2.rotationYXZ((float) (-Math.PI / 180.0) * a($$3), (float) (Math.PI / 180.0) * b($$3), 0.0F);
      };
   }

   private static float a(fow $$0) {
      return $$0.e() - 180.0F;
   }

   private static float b(fow $$0) {
      return -$$0.d();
   }

   private static <T extends bwf> float a(T $$0, float $$1) {
      return $$0.l($$1);
   }

   private static <T extends bwf> float b(T $$0, float $$1) {
      return $$0.k($$1);
   }

   protected abstract void a(ST var1, fjy var2, gqm var3, int var4, float var5);

   public void a(T $$0, ST $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.j();
      $$1.c = $$0.a($$2);
      $$1.d = a($$0, $$2);
      $$1.e = b($$0, $$2);
   }

   public static class a extends gwh<bwf.b, bwf.b.a, hcj> {
      private final grp a;

      protected a(gwt.a $$0) {
         super($$0);
         this.a = $$0.d();
      }

      public hcj a() {
         return new hcj();
      }

      public void a(bwf.b $$0, hcj $$1, float $$2) {
         super.a($$0, $$1, $$2);
         $$1.a = $$0.m();
      }

      public void a(hcj $$0, fjy $$1, gqm $$2, int $$3, float $$4) {
         this.a.a($$0.a.a(), $$1, $$2, $$3, hja.d);
      }
   }

   public static class b extends gwh<bwf.g, bwf.g.a, hdv> {
      private final hga a;

      protected b(gwt.a $$0) {
         super($$0);
         this.a = $$0.b();
      }

      public hdv a() {
         return new hdv();
      }

      public void a(bwf.g $$0, hdv $$1, float $$2) {
         super.a($$0, $$1, $$2);
         bwf.g.a $$3 = $$0.m();
         if ($$3 != null) {
            this.a.a($$1.a, $$3.a(), $$3.b(), $$0);
         } else {
            $$1.a.b();
         }
      }

      public void a(hdv $$0, fjy $$1, gqm $$2, int $$3, float $$4) {
         if (!$$0.a.c()) {
            $$1.a(a.d.rotation((float) Math.PI));
            $$0.a.a($$1, $$2, $$3, hja.d);
         }
      }
   }

   public static class c extends gwh<bwf.k, bwf.k.e, hfa> {
      private final fsf a;

      protected c(gwt.a $$0) {
         super($$0);
         this.a = $$0.j();
      }

      public hfa a() {
         return new hfa();
      }

      public void a(bwf.k $$0, hfa $$1, float $$2) {
         super.a($$0, $$1, $$2);
         $$1.a = $$0.m();
         $$1.f = $$0.a(this::a);
      }

      private bwf.k.b a(wy $$0, int $$1) {
         List<ayy> $$2 = this.a.c($$0, $$1);
         List<bwf.k.c> $$3 = new ArrayList<>($$2.size());
         int $$4 = 0;

         for (ayy $$5 : $$2) {
            int $$6 = this.a.a($$5);
            $$4 = Math.max($$4, $$6);
            $$3.add(new bwf.k.c($$5, $$6));
         }

         return new bwf.k.b($$3, $$4);
      }

      public void a(hfa $$0, fjy $$1, gqm $$2, int $$3, float $$4) {
         bwf.k.e $$5 = $$0.a;
         byte $$6 = $$5.e();
         boolean $$7 = ($$6 & 2) != 0;
         boolean $$8 = ($$6 & 4) != 0;
         boolean $$9 = ($$6 & 1) != 0;
         bwf.k.a $$10 = bwf.k.a($$6);
         byte $$11 = (byte)$$5.c().get($$4);
         int $$13;
         if ($$8) {
            float $$12 = fpo.Q().n.a(0.25F);
            $$13 = (int)($$12 * 255.0F) << 24;
         } else {
            $$13 = $$5.d().get($$4);
         }

         float $$15 = 0.0F;
         Matrix4f $$16 = $$1.c().a();
         $$16.rotate((float) Math.PI, 0.0F, 1.0F, 0.0F);
         $$16.scale(-0.025F, -0.025F, -0.025F);
         bwf.k.b $$17 = $$0.f;
         int $$18 = 1;
         int $$19 = 9 + 1;
         int $$20 = $$17.b();
         int $$21 = $$17.a().size() * $$19 - 1;
         $$16.translate(1.0F - (float)$$20 / 2.0F, (float)(-$$21), 0.0F);
         if ($$13 != 0) {
            fkc $$22 = $$2.getBuffer($$7 ? gqx.o() : gqx.n());
            $$22.a($$16, -1.0F, -1.0F, 0.0F).a($$13).c($$3);
            $$22.a($$16, -1.0F, (float)$$21, 0.0F).a($$13).c($$3);
            $$22.a($$16, (float)$$20, (float)$$21, 0.0F).a($$13).c($$3);
            $$22.a($$16, (float)$$20, -1.0F, 0.0F).a($$13).c($$3);
         }

         for (bwf.k.c $$23 : $$17.a()) {
            float $$24 = switch ($$10) {
               case b -> 0.0F;
               case c -> (float)($$20 - $$23.b());
               case a -> (float)$$20 / 2.0F - (float)$$23.b() / 2.0F;
            };
            this.a.a($$23.a(), $$24, $$15, $$11 << 24 | 16777215, $$9, $$16, $$2, $$7 ? fsf.a.b : fsf.a.c, 0, $$3);
            $$15 += (float)$$19;
         }
      }
   }
}
