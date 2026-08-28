import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import org.joml.Vector3f;

public class gfc {
   public static final List<String> a = Lists.newArrayList(new String[]{"layer0", "layer1", "layer2", "layer3", "layer4"});
   private static final float b = 7.5F;
   private static final float c = 8.5F;

   public gez a(Function<grm, gpi> $$0, gez $$1) {
      Map<String, Either<grm, String>> $$2 = Maps.newHashMap();
      List<gev> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < a.size(); $$4++) {
         String $$5 = a.get($$4);
         if (!$$1.b($$5)) {
            break;
         }

         grm $$6 = $$1.c($$5);
         $$2.put($$5, Either.left($$6));
         gpc $$7 = $$0.apply($$6).e();
         $$3.addAll(this.a($$4, $$5, $$7));
      }

      $$2.put("particle", $$1.b("particle") ? Either.left($$1.c("particle")) : $$2.get("layer0"));
      gez $$8 = new gez(null, $$3, $$2, false, $$1.c(), $$1.h(), $$1.e());
      $$8.c = $$1.c;
      return $$8;
   }

   private List<gev> a(int $$0, String $$1, gpc $$2) {
      Map<jf, gew> $$3 = Maps.newHashMap();
      $$3.put(jf.d, new gew(null, $$0, $$1, new gey(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, 0)));
      $$3.put(jf.c, new gew(null, $$0, $$1, new gey(new float[]{16.0F, 0.0F, 0.0F, 16.0F}, 0)));
      List<gev> $$4 = Lists.newArrayList();
      $$4.add(new gev(new Vector3f(0.0F, 0.0F, 7.5F), new Vector3f(16.0F, 16.0F, 8.5F), $$3, null, true));
      $$4.addAll(this.a($$2, $$1, $$0));
      return $$4;
   }

   private List<gev> a(gpc $$0, String $$1, int $$2) {
      float $$3 = (float)$$0.a();
      float $$4 = (float)$$0.b();
      List<gev> $$5 = Lists.newArrayList();

      for (gfc.a $$6 : this.a($$0)) {
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
         gfc.b $$20 = $$6.a();
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
         Map<jf, gew> $$21 = Maps.newHashMap();
         $$21.put($$20.a(), new gew(null, $$2, $$1, new gey(new float[]{$$11, $$13, $$12, $$14}, 0)));
         switch ($$20) {
            case a:
               $$5.add(new gev(new Vector3f($$7, $$8, 7.5F), new Vector3f($$9, $$8, 8.5F), $$21, null, true));
               break;
            case b:
               $$5.add(new gev(new Vector3f($$7, $$10, 7.5F), new Vector3f($$9, $$10, 8.5F), $$21, null, true));
               break;
            case c:
               $$5.add(new gev(new Vector3f($$7, $$8, 7.5F), new Vector3f($$7, $$10, 8.5F), $$21, null, true));
               break;
            case d:
               $$5.add(new gev(new Vector3f($$9, $$8, 7.5F), new Vector3f($$9, $$10, 8.5F), $$21, null, true));
         }
      }

      return $$5;
   }

   private List<gfc.a> a(gpc $$0) {
      int $$1 = $$0.a();
      int $$2 = $$0.b();
      List<gfc.a> $$3 = Lists.newArrayList();
      $$0.d().forEach($$4 -> {
         for (int $$5 = 0; $$5 < $$2; $$5++) {
            for (int $$6 = 0; $$6 < $$1; $$6++) {
               boolean $$7 = !this.a($$0, $$4, $$6, $$5, $$1, $$2);
               this.a(gfc.b.a, $$3, $$0, $$4, $$6, $$5, $$1, $$2, $$7);
               this.a(gfc.b.b, $$3, $$0, $$4, $$6, $$5, $$1, $$2, $$7);
               this.a(gfc.b.c, $$3, $$0, $$4, $$6, $$5, $$1, $$2, $$7);
               this.a(gfc.b.d, $$3, $$0, $$4, $$6, $$5, $$1, $$2, $$7);
            }
         }
      });
      return $$3;
   }

   private void a(gfc.b $$0, List<gfc.a> $$1, gpc $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8) {
      boolean $$9 = this.a($$2, $$3, $$4 + $$0.b(), $$5 + $$0.c(), $$6, $$7) && $$8;
      if ($$9) {
         this.a($$1, $$0, $$4, $$5);
      }
   }

   private void a(List<gfc.a> $$0, gfc.b $$1, int $$2, int $$3) {
      gfc.a $$4 = null;

      for (gfc.a $$5 : $$0) {
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
         $$0.add(new gfc.a($$1, $$8, $$7));
      } else {
         $$4.a($$8);
      }
   }

   private boolean a(gpc $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return $$2 >= 0 && $$3 >= 0 && $$2 < $$4 && $$3 < $$5 ? $$0.a($$1, $$2, $$3) : true;
   }

   static class a {
      private final gfc.b a;
      private int b;
      private int c;
      private final int d;

      public a(gfc.b $$0, int $$1, int $$2) {
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

      public gfc.b a() {
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
      a(jf.b, 0, -1),
      b(jf.a, 0, 1),
      c(jf.f, -1, 0),
      d(jf.e, 1, 0);

      private final jf e;
      private final int f;
      private final int g;

      private b(final jf $$0, final int $$1, final int $$2) {
         this.e = $$0;
         this.f = $$1;
         this.g = $$2;
      }

      public jf a() {
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
