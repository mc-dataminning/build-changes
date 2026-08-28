import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class gtc implements hnl {
   public static final alr a = alr.b("builtin/generated");
   public static final List<String> b = List.of("layer0", "layer1", "layer2", "layer3", "layer4");
   private static final float d = 7.5F;
   private static final float e = 8.5F;
   private static final gti.a f = new gti.a.a().a("particle", "layer0").a();
   private static final gsv.b g = new gsv.b(0.0F, 0.0F, 16.0F, 16.0F);
   private static final gsv.b h = new gsv.b(16.0F, 0.0F, 0.0F, 16.0F);

   @Override
   public gti.a e() {
      return f;
   }

   @Override
   public hnk a() {
      return gtc::a;
   }

   @Nullable
   @Override
   public hnl.a b() {
      return hnl.a.a;
   }

   private static hng a(gti $$0, hmz $$1, hnf $$2, hnb $$3) {
      return a($$0, $$1.a(), $$2, $$3);
   }

   private static hng a(gti $$0, hnj $$1, hnf $$2, hnb $$3) {
      List<gsu> $$4 = new ArrayList<>();

      for (int $$5 = 0; $$5 < b.size(); $$5++) {
         String $$6 = b.get($$5);
         hmx $$7 = $$0.a($$6);
         if ($$7 == null) {
            break;
         }

         hkk $$8 = $$1.a($$7, $$3).e();
         $$4.addAll(a($$5, $$6, $$8));
      }

      return gtg.a($$4, $$0, $$1, $$2, $$3);
   }

   private static List<gsu> a(int $$0, String $$1, hkk $$2) {
      Map<jc, gsv> $$3 = Map.of(jc.d, new gsv(null, $$0, $$1, g, i.a), jc.c, new gsv(null, $$0, $$1, h, i.a));
      List<gsu> $$4 = new ArrayList<>();
      $$4.add(new gsu(new Vector3f(0.0F, 0.0F, 7.5F), new Vector3f(16.0F, 16.0F, 8.5F), $$3));
      $$4.addAll(a($$2, $$1, $$0));
      return $$4;
   }

   private static List<gsu> a(hkk $$0, String $$1, int $$2) {
      float $$3 = (float)$$0.a();
      float $$4 = (float)$$0.b();
      List<gsu> $$5 = new ArrayList<>();

      for (gtc.a $$6 : a($$0)) {
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
         gtc.b $$20 = $$6.a();
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
         Map<jc, gsv> $$21 = Map.of($$20.a(), new gsv(null, $$2, $$1, new gsv.b($$11, $$13, $$12, $$14), i.a));
         switch ($$20) {
            case a:
               $$5.add(new gsu(new Vector3f($$7, $$8, 7.5F), new Vector3f($$9, $$8, 8.5F), $$21));
               break;
            case b:
               $$5.add(new gsu(new Vector3f($$7, $$10, 7.5F), new Vector3f($$9, $$10, 8.5F), $$21));
               break;
            case c:
               $$5.add(new gsu(new Vector3f($$7, $$8, 7.5F), new Vector3f($$7, $$10, 8.5F), $$21));
               break;
            case d:
               $$5.add(new gsu(new Vector3f($$9, $$8, 7.5F), new Vector3f($$9, $$10, 8.5F), $$21));
         }
      }

      return $$5;
   }

   private static List<gtc.a> a(hkk $$0) {
      int $$1 = $$0.a();
      int $$2 = $$0.b();
      List<gtc.a> $$3 = new ArrayList<>();
      $$0.d().forEach($$4 -> {
         for (int $$5 = 0; $$5 < $$2; $$5++) {
            for (int $$6 = 0; $$6 < $$1; $$6++) {
               boolean $$7 = !a($$0, $$4, $$6, $$5, $$1, $$2);
               a(gtc.b.a, $$3, $$0, $$4, $$6, $$5, $$1, $$2, $$7);
               a(gtc.b.b, $$3, $$0, $$4, $$6, $$5, $$1, $$2, $$7);
               a(gtc.b.c, $$3, $$0, $$4, $$6, $$5, $$1, $$2, $$7);
               a(gtc.b.d, $$3, $$0, $$4, $$6, $$5, $$1, $$2, $$7);
            }
         }
      });
      return $$3;
   }

   private static void a(gtc.b $$0, List<gtc.a> $$1, hkk $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8) {
      boolean $$9 = a($$2, $$3, $$4 + $$0.b(), $$5 + $$0.c(), $$6, $$7) && $$8;
      if ($$9) {
         a($$1, $$0, $$4, $$5);
      }
   }

   private static void a(List<gtc.a> $$0, gtc.b $$1, int $$2, int $$3) {
      gtc.a $$4 = null;

      for (gtc.a $$5 : $$0) {
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
         $$0.add(new gtc.a($$1, $$8, $$7));
      } else {
         $$4.a($$8);
      }
   }

   private static boolean a(hkk $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return $$2 >= 0 && $$3 >= 0 && $$2 < $$4 && $$3 < $$5 ? $$0.a($$1, $$2, $$3) : true;
   }

   static class a {
      private final gtc.b a;
      private int b;
      private int c;
      private final int d;

      public a(gtc.b $$0, int $$1, int $$2) {
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

      public gtc.b a() {
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
      a(jc.b, 0, -1),
      b(jc.a, 0, 1),
      c(jc.f, -1, 0),
      d(jc.e, 1, 0);

      private final jc e;
      private final int f;
      private final int g;

      private b(final jc $$0, final int $$1, final int $$2) {
         this.e = $$0;
         this.f = $$1;
         this.g = $$2;
      }

      public jc a() {
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
