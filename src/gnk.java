import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class gnk implements hhh {
   public static final aku a = aku.b("builtin/generated");
   public static final List<String> b = List.of("layer0", "layer1", "layer2", "layer3", "layer4");
   private static final float e = 7.5F;
   private static final float f = 8.5F;
   private static final gno.a g = new gno.a.a().a("particle", "layer0").a();

   @Override
   public gno.a d() {
      return g;
   }

   @Override
   public void a(hhe.a $$0) {
   }

   @Nullable
   @Override
   public hhh.a b() {
      return hhh.a.a;
   }

   @Override
   public hgm a(gno $$0, hgv $$1, hhc $$2, boolean $$3, boolean $$4, gnm $$5) {
      return this.a($$0, $$1.a(), $$2, $$3, $$4, $$5);
   }

   private hgm a(gno $$0, hhg $$1, hhc $$2, boolean $$3, boolean $$4, gnm $$5) {
      gno.a.a $$6 = new gno.a.a();
      List<gnd> $$7 = new ArrayList<>();

      for (int $$8 = 0; $$8 < b.size(); $$8++) {
         String $$9 = b.get($$8);
         hgt $$10 = $$0.a($$9);
         if ($$10 == null) {
            break;
         }

         $$6.a($$9, $$10);
         heg $$11 = $$1.a($$10).e();
         $$7.addAll(this.a($$8, $$9, $$11));
      }

      return hhf.a($$7, $$0, $$1, $$2, $$3, $$4, false, $$5);
   }

   private List<gnd> a(int $$0, String $$1, heg $$2) {
      Map<jn, gne> $$3 = Map.of(
         jn.d,
         new gne(null, $$0, $$1, new gng(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, 0)),
         jn.c,
         new gne(null, $$0, $$1, new gng(new float[]{16.0F, 0.0F, 0.0F, 16.0F}, 0))
      );
      List<gnd> $$4 = new ArrayList<>();
      $$4.add(new gnd(new Vector3f(0.0F, 0.0F, 7.5F), new Vector3f(16.0F, 16.0F, 8.5F), $$3));
      $$4.addAll(this.a($$2, $$1, $$0));
      return $$4;
   }

   private List<gnd> a(heg $$0, String $$1, int $$2) {
      float $$3 = (float)$$0.a();
      float $$4 = (float)$$0.b();
      List<gnd> $$5 = new ArrayList<>();

      for (gnk.a $$6 : this.a($$0)) {
         float $$7 = 0.0F;
         float $$8 = 0.0F;
         float $$9 = 0.0F;
         float $$10 = 0.0F;
         float $$11 = 0.0F;
         float $$12 = 0.0F;
         float $$13 = 0.0F;
         float $$14 = 0.0F;
         float $$15 = 16.0F / $$3;
         float $$16 = 16.0F / $$4;
         float $$17 = (float)$$6.b();
         float $$18 = (float)$$6.c();
         float $$19 = (float)$$6.d();
         gnk.b $$20 = $$6.a();
         switch ($$20) {
            case a:
               $$11 = $$17;
               $$7 = $$17;
               $$9 = $$12 = $$18 + 1.0F;
               $$13 = $$19;
               $$8 = $$19;
               $$10 = $$19;
               $$14 = $$19 + 1.0F;
               break;
            case b:
               $$13 = $$19;
               $$14 = $$19 + 1.0F;
               $$11 = $$17;
               $$7 = $$17;
               $$9 = $$12 = $$18 + 1.0F;
               $$8 = $$19 + 1.0F;
               $$10 = $$19 + 1.0F;
               break;
            case c:
               $$11 = $$19;
               $$7 = $$19;
               $$9 = $$19;
               $$12 = $$19 + 1.0F;
               $$14 = $$17;
               $$8 = $$17;
               $$10 = $$13 = $$18 + 1.0F;
               break;
            case d:
               $$11 = $$19;
               $$12 = $$19 + 1.0F;
               $$7 = $$19 + 1.0F;
               $$9 = $$19 + 1.0F;
               $$14 = $$17;
               $$8 = $$17;
               $$10 = $$13 = $$18 + 1.0F;
         }

         $$7 *= $$15;
         $$9 *= $$15;
         $$8 *= $$16;
         $$10 *= $$16;
         $$8 = 16.0F - $$8;
         $$10 = 16.0F - $$10;
         $$11 *= $$15;
         $$12 *= $$15;
         $$13 *= $$16;
         $$14 *= $$16;
         Map<jn, gne> $$21 = Map.of($$20.a(), new gne(null, $$2, $$1, new gng(new float[]{$$11, $$13, $$12, $$14}, 0)));
         switch ($$20) {
            case a:
               $$5.add(new gnd(new Vector3f($$7, $$8, 7.5F), new Vector3f($$9, $$8, 8.5F), $$21));
               break;
            case b:
               $$5.add(new gnd(new Vector3f($$7, $$10, 7.5F), new Vector3f($$9, $$10, 8.5F), $$21));
               break;
            case c:
               $$5.add(new gnd(new Vector3f($$7, $$8, 7.5F), new Vector3f($$7, $$10, 8.5F), $$21));
               break;
            case d:
               $$5.add(new gnd(new Vector3f($$9, $$8, 7.5F), new Vector3f($$9, $$10, 8.5F), $$21));
         }
      }

      return $$5;
   }

   private List<gnk.a> a(heg $$0) {
      int $$1 = $$0.a();
      int $$2 = $$0.b();
      List<gnk.a> $$3 = new ArrayList<>();
      $$0.d().forEach($$4 -> {
         for (int $$5 = 0; $$5 < $$2; $$5++) {
            for (int $$6 = 0; $$6 < $$1; $$6++) {
               boolean $$7 = !this.a($$0, $$4, $$6, $$5, $$1, $$2);
               this.a(gnk.b.a, $$3, $$0, $$4, $$6, $$5, $$1, $$2, $$7);
               this.a(gnk.b.b, $$3, $$0, $$4, $$6, $$5, $$1, $$2, $$7);
               this.a(gnk.b.c, $$3, $$0, $$4, $$6, $$5, $$1, $$2, $$7);
               this.a(gnk.b.d, $$3, $$0, $$4, $$6, $$5, $$1, $$2, $$7);
            }
         }
      });
      return $$3;
   }

   private void a(gnk.b $$0, List<gnk.a> $$1, heg $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8) {
      boolean $$9 = this.a($$2, $$3, $$4 + $$0.b(), $$5 + $$0.c(), $$6, $$7) && $$8;
      if ($$9) {
         this.a($$1, $$0, $$4, $$5);
      }
   }

   private void a(List<gnk.a> $$0, gnk.b $$1, int $$2, int $$3) {
      gnk.a $$4 = null;

      for (gnk.a $$5 : $$0) {
         if ($$5.a() == $$1) {
            int $$6 = $$1.d() ? $$3 : $$2;
            if ($$5.d() == $$6) {
               $$4 = $$5;
               break;
            }
         }
      }

      int $$7 = $$1.d() ? $$3 : $$2;
      int $$8 = $$1.d() ? $$2 : $$3;
      if ($$4 == null) {
         $$0.add(new gnk.a($$1, $$8, $$7));
      } else {
         $$4.a($$8);
      }
   }

   private boolean a(heg $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return $$2 >= 0 && $$3 >= 0 && $$2 < $$4 && $$3 < $$5 ? $$0.a($$1, $$2, $$3) : true;
   }

   static class a {
      private final gnk.b a;
      private int b;
      private int c;
      private final int d;

      public a(gnk.b $$0, int $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(int $$0) {
         if ($$0 < this.b) {
            this.b = $$0;
         } else if ($$0 > this.c) {
            this.c = $$0;
         }
      }

      public gnk.b a() {
         return this.a;
      }

      public int b() {
         return this.b;
      }

      public int c() {
         return this.c;
      }

      public int d() {
         return this.d;
      }
   }

   static enum b {
      a(jn.b, 0, -1),
      b(jn.a, 0, 1),
      c(jn.f, -1, 0),
      d(jn.e, 1, 0);

      private final jn e;
      private final int f;
      private final int g;

      private b(final jn $$0, final int $$1, final int $$2) {
         this.e = $$0;
         this.f = $$1;
         this.g = $$2;
      }

      public jn a() {
         return this.e;
      }

      public int b() {
         return this.f;
      }

      public int c() {
         return this.g;
      }

      boolean d() {
         return this == b || this == a;
      }
   }
}
