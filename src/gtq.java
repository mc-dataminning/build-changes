import com.google.common.annotations.VisibleForTesting;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4f;

public class gtq {
   public static final int a = 8;
   private static final float d = 1.0F / (float)Math.cos((float) (Math.PI / 8)) - 1.0F;
   private static final float e = 1.0F / (float)Math.cos((float) (Math.PI / 4)) - 1.0F;
   public static final int b = 4;
   private static final int f = 3;
   public static final int c = 4;

   @VisibleForTesting
   static gtk.b a(Vector3fc $$0, Vector3fc $$1, jc $$2) {
      return switch ($$2) {
         case a -> new gtk.b($$0.x(), 16.0F - $$1.z(), $$1.x(), 16.0F - $$0.z());
         case b -> new gtk.b($$0.x(), $$0.z(), $$1.x(), $$1.z());
         case c -> new gtk.b(16.0F - $$1.x(), 16.0F - $$1.y(), 16.0F - $$0.x(), 16.0F - $$0.y());
         case d -> new gtk.b($$0.x(), 16.0F - $$1.y(), $$1.x(), 16.0F - $$0.y());
         case e -> new gtk.b($$0.z(), 16.0F - $$1.y(), $$1.z(), 16.0F - $$0.y());
         case f -> new gtk.b(16.0F - $$1.z(), 16.0F - $$1.y(), 16.0F - $$0.z(), 16.0F - $$0.y());
      };
   }

   public static gti a(Vector3fc $$0, Vector3fc $$1, gtk $$2, hlc $$3, jc $$4, hnr $$5, @Nullable gtl $$6, boolean $$7, int $$8) {
      gtk.b $$9 = $$2.d();
      if ($$9 == null) {
         $$9 = a($$0, $$1, $$4);
      }

      $$9 = a($$3, $$9);
      Matrix4fc $$10 = $$5.b($$4);
      int[] $$11 = a($$9, $$2.e(), $$10, $$3, $$4, a($$0, $$1), $$5.a(), $$6);
      jc $$12 = a($$11);
      if ($$6 == null) {
         a($$11, $$12);
      }

      return new gti($$11, $$2.b(), $$12, $$3, $$7, $$8);
   }

   private static gtk.b a(hlc $$0, gtk.b $$1) {
      float $$2 = $$1.a();
      float $$3 = $$1.b();
      float $$4 = $$1.c();
      float $$5 = $$1.d();
      float $$6 = $$0.j();
      float $$7 = ($$2 + $$2 + $$4 + $$4) / 4.0F;
      float $$8 = ($$3 + $$3 + $$5 + $$5) / 4.0F;
      return new gtk.b(azq.h($$6, $$2, $$7), azq.h($$6, $$3, $$8), azq.h($$6, $$4, $$7), azq.h($$6, $$5, $$8));
   }

   private static int[] a(gtk.b $$0, i $$1, Matrix4fc $$2, hlc $$3, jc $$4, float[] $$5, k $$6, @Nullable gtl $$7) {
      grp $$8 = grp.a($$4);
      int[] $$9 = new int[32];

      for (int $$10 = 0; $$10 < 4; $$10++) {
         a($$9, $$10, $$8, $$0, $$1, $$2, $$5, $$3, $$6, $$7);
      }

      return $$9;
   }

   private static float[] a(Vector3fc $$0, Vector3fc $$1) {
      float[] $$2 = new float[jc.values().length];
      $$2[grp.a.f] = $$0.x() / 16.0F;
      $$2[grp.a.e] = $$0.y() / 16.0F;
      $$2[grp.a.d] = $$0.z() / 16.0F;
      $$2[grp.a.c] = $$1.x() / 16.0F;
      $$2[grp.a.b] = $$1.y() / 16.0F;
      $$2[grp.a.a] = $$1.z() / 16.0F;
      return $$2;
   }

   private static void a(int[] $$0, int $$1, grp $$2, gtk.b $$3, i $$4, Matrix4fc $$5, float[] $$6, hlc $$7, k $$8, @Nullable gtl $$9) {
      grp.b $$10 = $$2.a($$1);
      Vector3f $$11 = new Vector3f($$6[$$10.a], $$6[$$10.b], $$6[$$10.c]);
      a($$11, $$9);
      a($$11, $$8);
      float $$12 = gtk.a($$3, $$4, $$1);
      float $$13 = gtk.b($$3, $$4, $$1);
      float $$15;
      float $$14;
      if (f.a($$5)) {
         $$14 = $$12;
         $$15 = $$13;
      } else {
         Vector3f $$16 = $$5.transformPosition(new Vector3f(a($$12), a($$13), 0.0F));
         $$14 = b($$16.x);
         $$15 = b($$16.y);
      }

      a($$0, $$1, $$11, $$7, $$14, $$15);
   }

   private static float a(float $$0) {
      return $$0 - 0.5F;
   }

   private static float b(float $$0) {
      return $$0 + 0.5F;
   }

   private static void a(int[] $$0, int $$1, Vector3f $$2, hlc $$3, float $$4, float $$5) {
      int $$6 = $$1 * 8;
      $$0[$$6] = Float.floatToRawIntBits($$2.x());
      $$0[$$6 + 1] = Float.floatToRawIntBits($$2.y());
      $$0[$$6 + 2] = Float.floatToRawIntBits($$2.z());
      $$0[$$6 + 3] = -1;
      $$0[$$6 + 4] = Float.floatToRawIntBits($$3.a($$4));
      $$0[$$6 + 4 + 1] = Float.floatToRawIntBits($$3.c($$5));
   }

   private static void a(Vector3f $$0, @Nullable gtl $$1) {
      if ($$1 != null) {
         Vector3f $$2;
         Vector3f $$3;
         switch ($$1.b()) {
            case a:
               $$2 = new Vector3f(1.0F, 0.0F, 0.0F);
               $$3 = new Vector3f(0.0F, 1.0F, 1.0F);
               break;
            case b:
               $$2 = new Vector3f(0.0F, 1.0F, 0.0F);
               $$3 = new Vector3f(1.0F, 0.0F, 1.0F);
               break;
            case c:
               $$2 = new Vector3f(0.0F, 0.0F, 1.0F);
               $$3 = new Vector3f(1.0F, 1.0F, 0.0F);
               break;
            default:
               throw new IllegalArgumentException("There are only 3 axes");
         }

         Quaternionf $$10 = new Quaternionf().rotationAxis($$1.c() * (float) (Math.PI / 180.0), $$2);
         if ($$1.d()) {
            if (Math.abs($$1.c()) == 22.5F) {
               $$3.mul(d);
            } else {
               $$3.mul(e);
            }

            $$3.add(1.0F, 1.0F, 1.0F);
         } else {
            $$3.set(1.0F, 1.0F, 1.0F);
         }

         a($$0, new Vector3f($$1.a()), new Matrix4f().rotation($$10), $$3);
      }
   }

   private static void a(Vector3f $$0, k $$1) {
      if ($$1 != k.a()) {
         a($$0, new Vector3f(0.5F, 0.5F, 0.5F), $$1.c(), new Vector3f(1.0F, 1.0F, 1.0F));
      }
   }

   private static void a(Vector3f $$0, Vector3fc $$1, Matrix4fc $$2, Vector3fc $$3) {
      Vector4f $$4 = $$2.transform(new Vector4f($$0.x() - $$1.x(), $$0.y() - $$1.y(), $$0.z() - $$1.z(), 1.0F));
      $$4.mul(new Vector4f($$3, 1.0F));
      $$0.set($$4.x() + $$1.x(), $$4.y() + $$1.y(), $$4.z() + $$1.z());
   }

   private static jc a(int[] $$0) {
      Vector3f $$1 = d($$0, 0);
      Vector3f $$2 = d($$0, 8);
      Vector3f $$3 = d($$0, 16);
      Vector3f $$4 = new Vector3f($$1).sub($$2);
      Vector3f $$5 = new Vector3f($$3).sub($$2);
      Vector3f $$6 = new Vector3f($$5).cross($$4).normalize();
      if (!$$6.isFinite()) {
         return jc.b;
      } else {
         jc $$7 = null;
         float $$8 = 0.0F;

         for (jc $$9 : jc.values()) {
            float $$10 = $$6.dot($$9.s());
            if ($$10 >= 0.0F && $$10 > $$8) {
               $$8 = $$10;
               $$7 = $$9;
            }
         }

         return $$7 == null ? jc.b : $$7;
      }
   }

   private static float a(int[] $$0, int $$1) {
      return Float.intBitsToFloat($$0[$$1]);
   }

   private static float b(int[] $$0, int $$1) {
      return Float.intBitsToFloat($$0[$$1 + 1]);
   }

   private static float c(int[] $$0, int $$1) {
      return Float.intBitsToFloat($$0[$$1 + 2]);
   }

   private static Vector3f d(int[] $$0, int $$1) {
      return new Vector3f(a($$0, $$1), b($$0, $$1), c($$0, $$1));
   }

   private static void a(int[] $$0, jc $$1) {
      int[] $$2 = new int[$$0.length];
      System.arraycopy($$0, 0, $$2, 0, $$0.length);
      float[] $$3 = new float[jc.values().length];
      $$3[grp.a.f] = 999.0F;
      $$3[grp.a.e] = 999.0F;
      $$3[grp.a.d] = 999.0F;
      $$3[grp.a.c] = -999.0F;
      $$3[grp.a.b] = -999.0F;
      $$3[grp.a.a] = -999.0F;

      for (int $$4 = 0; $$4 < 4; $$4++) {
         int $$5 = 8 * $$4;
         float $$6 = a($$2, $$5);
         float $$7 = b($$2, $$5);
         float $$8 = c($$2, $$5);
         if ($$6 < $$3[grp.a.f]) {
            $$3[grp.a.f] = $$6;
         }

         if ($$7 < $$3[grp.a.e]) {
            $$3[grp.a.e] = $$7;
         }

         if ($$8 < $$3[grp.a.d]) {
            $$3[grp.a.d] = $$8;
         }

         if ($$6 > $$3[grp.a.c]) {
            $$3[grp.a.c] = $$6;
         }

         if ($$7 > $$3[grp.a.b]) {
            $$3[grp.a.b] = $$7;
         }

         if ($$8 > $$3[grp.a.a]) {
            $$3[grp.a.a] = $$8;
         }
      }

      grp $$9 = grp.a($$1);

      for (int $$10 = 0; $$10 < 4; $$10++) {
         int $$11 = 8 * $$10;
         grp.b $$12 = $$9.a($$10);
         float $$13 = $$3[$$12.a];
         float $$14 = $$3[$$12.b];
         float $$15 = $$3[$$12.c];
         $$0[$$11] = Float.floatToRawIntBits($$13);
         $$0[$$11 + 1] = Float.floatToRawIntBits($$14);
         $$0[$$11 + 2] = Float.floatToRawIntBits($$15);

         for (int $$16 = 0; $$16 < 4; $$16++) {
            int $$17 = 8 * $$16;
            float $$18 = a($$2, $$17);
            float $$19 = b($$2, $$17);
            float $$20 = c($$2, $$17);
            if (azq.a($$13, $$18) && azq.a($$14, $$19) && azq.a($$15, $$20)) {
               $$0[$$11 + 4] = $$2[$$17 + 4];
               $$0[$$11 + 4 + 1] = $$2[$$17 + 4 + 1];
            }
         }
      }
   }

   public static void a(int[] $$0, Consumer<Vector3f> $$1) {
      for (int $$2 = 0; $$2 < 4; $$2++) {
         $$1.accept(d($$0, 8 * $$2));
      }
   }
}
