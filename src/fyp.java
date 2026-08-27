import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Quaternionf;

public abstract class fyp<T extends blv, S> extends fyz<T> {
   private final fyy a;

   protected fyp(fza.a $$0) {
      super($$0);
      this.a = $$0.a();
   }

   public ahh a(T $$0) {
      return gfa.e;
   }

   public void a(T $$0, float $$1, float $$2, eqk $$3, ftt $$4, int $$5) {
      blv.k $$6 = $$0.q();
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

   private Quaternionf a(blv.k $$0, T $$1, float $$2, Quaternionf $$3) {
      evc $$4 = this.a.b;

      return switch ($$0.b()) {
         case a -> $$3.rotationYXZ((float) (-Math.PI / 180.0) * a($$1, $$2), (float) (Math.PI / 180.0) * b($$1, $$2), 0.0F);
         case c -> $$3.rotationYXZ((float) (-Math.PI / 180.0) * a($$1, $$2), (float) (Math.PI / 180.0) * b($$4), 0.0F);
         case b -> $$3.rotationYXZ((float) (-Math.PI / 180.0) * a($$4), (float) (Math.PI / 180.0) * b($$1, $$2), 0.0F);
         case d -> $$3.rotationYXZ((float) (-Math.PI / 180.0) * a($$4), (float) (Math.PI / 180.0) * b($$4), 0.0F);
      };
   }

   private static float a(evc $$0) {
      return $$0.e() - 180.0F;
   }

   private static float b(evc $$0) {
      return -$$0.d();
   }

   private static <T extends blv> float a(T $$0, float $$1) {
      return aup.j($$1, $$0.N, $$0.dB());
   }

   private static <T extends blv> float b(T $$0, float $$1) {
      return aup.i($$1, $$0.O, $$0.dD());
   }

   @Nullable
   protected abstract S b(T var1);

   protected abstract void a(T var1, S var2, eqk var3, ftt var4, int var5, float var6);

   public static class a extends fyp<blv.b, blv.b.a> {
      private final fun a;

      protected a(fza.a $$0) {
         super($$0);
         this.a = $$0.c();
      }

      @Nullable
      protected blv.b.a a(blv.b $$0) {
         return $$0.s();
      }

      public void a(blv.b $$0, blv.b.a $$1, eqk $$2, ftt $$3, int $$4, float $$5) {
         this.a.a($$1.a(), $$2, $$3, $$4, ges.d);
      }
   }

   public static class b extends fyp<blv.g, blv.g.a> {
      private final fzy a;

      protected b(fza.a $$0) {
         super($$0);
         this.a = $$0.b();
      }

      @Nullable
      protected blv.g.a a(blv.g $$0) {
         return $$0.s();
      }

      public void a(blv.g $$0, blv.g.a $$1, eqk $$2, ftt $$3, int $$4, float $$5) {
         $$2.a(a.d.rotation((float) Math.PI));
         this.a.a($$1.a(), $$1.b(), $$4, ges.d, $$2, $$3, $$0.dL(), $$0.aj());
      }
   }

   public static class c extends fyp<blv.l, blv.l.e> {
      private final exc a;

      protected c(fza.a $$0) {
         super($$0);
         this.a = $$0.h();
      }

      private blv.l.b a(vg $$0, int $$1) {
         List<aub> $$2 = this.a.c($$0, $$1);
         List<blv.l.c> $$3 = new ArrayList<>($$2.size());
         int $$4 = 0;

         for (aub $$5 : $$2) {
            int $$6 = this.a.a($$5);
            $$4 = Math.max($$4, $$6);
            $$3.add(new blv.l.c($$5, $$6));
         }

         return new blv.l.b($$3, $$4);
      }

      @Nullable
      protected blv.l.e a(blv.l $$0) {
         return $$0.s();
      }

      public void a(blv.l $$0, blv.l.e $$1, eqk $$2, ftt $$3, int $$4, float $$5) {
         byte $$6 = $$1.e();
         boolean $$7 = ($$6 & 2) != 0;
         boolean $$8 = ($$6 & 4) != 0;
         boolean $$9 = ($$6 & 1) != 0;
         blv.l.a $$10 = blv.l.a($$6);
         byte $$11 = (byte)$$1.c().get($$5);
         int $$13;
         if ($$8) {
            float $$12 = evr.O().m.a(0.25F);
            $$13 = (int)($$12 * 255.0F) << 24;
         } else {
            $$13 = $$1.d().get($$5);
         }

         float $$15 = 0.0F;
         Matrix4f $$16 = $$2.c().a();
         $$16.rotate((float) Math.PI, 0.0F, 1.0F, 0.0F);
         $$16.scale(-0.025F, -0.025F, -0.025F);
         blv.l.b $$17 = $$0.a(this::a);
         int $$18 = 9 + 1;
         int $$19 = $$17.b();
         int $$20 = $$17.a().size() * $$18;
         $$16.translate(1.0F - (float)$$19 / 2.0F, (float)(-$$20), 0.0F);
         if ($$13 != 0) {
            eqo $$21 = $$3.getBuffer($$7 ? fub.r() : fub.q());
            $$21.a($$16, -1.0F, -1.0F, 0.0F).a($$13).b($$4).e();
            $$21.a($$16, -1.0F, (float)$$20, 0.0F).a($$13).b($$4).e();
            $$21.a($$16, (float)$$19, (float)$$20, 0.0F).a($$13).b($$4).e();
            $$21.a($$16, (float)$$19, -1.0F, 0.0F).a($$13).b($$4).e();
         }

         for (blv.l.c $$22 : $$17.a()) {
            float $$23 = switch ($$10) {
               case b -> 0.0F;
               case c -> (float)($$19 - $$22.b());
               case a -> (float)$$19 / 2.0F - (float)$$22.b() / 2.0F;
            };
            this.a.a($$22.a(), $$23, $$15, $$11 << 24 | 16777215, $$9, $$16, $$3, $$7 ? exc.a.b : exc.a.c, 0, $$4);
            $$15 += (float)$$18;
         }
      }
   }
}
