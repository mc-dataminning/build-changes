import javax.annotation.Nullable;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.joml.Vector4f;

public class gpm {
   public static final int a = 8;
   private static final float d = 1.0F / (float)Math.cos((float) (Math.PI / 8)) - 1.0F;
   private static final float e = 1.0F / (float)Math.cos((float) (Math.PI / 4)) - 1.0F;
   public static final int b = 4;
   private static final int f = 3;
   public static final int c = 4;

   public static gpf a(Vector3f $$0, Vector3f $$1, gph $$2, hgs $$3, jo $$4, hji $$5, @Nullable gpi $$6, boolean $$7, int $$8) {
      gpj $$9 = $$2.d();
      if ($$5.b()) {
         $$9 = a($$2.d(), $$4, $$5.a());
      }

      float[] $$10 = new float[$$9.a.length];
      System.arraycopy($$9.a, 0, $$10, 0, $$10.length);
      float $$11 = $$3.k();
      float $$12 = ($$9.a[0] + $$9.a[0] + $$9.a[2] + $$9.a[2]) / 4.0F;
      float $$13 = ($$9.a[1] + $$9.a[1] + $$9.a[3] + $$9.a[3]) / 4.0F;
      $$9.a[0] = azk.h($$11, $$9.a[0], $$12);
      $$9.a[2] = azk.h($$11, $$9.a[2], $$12);
      $$9.a[1] = azk.h($$11, $$9.a[1], $$13);
      $$9.a[3] = azk.h($$11, $$9.a[3], $$13);
      int[] $$14 = a($$9, $$3, $$4, a($$0, $$1), $$5.a(), $$6);
      jo $$15 = a($$14);
      System.arraycopy($$10, 0, $$9.a, 0, $$10.length);
      if ($$6 == null) {
         a($$14, $$15);
      }

      return new gpf($$14, $$2.b(), $$15, $$3, $$7, $$8);
   }

   public static gpj a(gpj $$0, jo $$1, j $$2) {
      Matrix4f $$3 = ji.a($$2, $$1).c();
      float $$4 = $$0.a($$0.c(0));
      float $$5 = $$0.b($$0.c(0));
      Vector4f $$6 = $$3.transform(new Vector4f($$4 / 16.0F, $$5 / 16.0F, 0.0F, 1.0F));
      float $$7 = 16.0F * $$6.x();
      float $$8 = 16.0F * $$6.y();
      float $$9 = $$0.a($$0.c(2));
      float $$10 = $$0.b($$0.c(2));
      Vector4f $$11 = $$3.transform(new Vector4f($$9 / 16.0F, $$10 / 16.0F, 0.0F, 1.0F));
      float $$12 = 16.0F * $$11.x();
      float $$13 = 16.0F * $$11.y();
      float $$14;
      float $$15;
      if (Math.signum($$9 - $$4) == Math.signum($$12 - $$7)) {
         $$14 = $$7;
         $$15 = $$12;
      } else {
         $$14 = $$12;
         $$15 = $$7;
      }

      float $$18;
      float $$19;
      if (Math.signum($$10 - $$5) == Math.signum($$13 - $$8)) {
         $$18 = $$8;
         $$19 = $$13;
      } else {
         $$18 = $$13;
         $$19 = $$8;
      }

      float $$22 = (float)Math.toRadians((double)$$0.b);
      Matrix3f $$23 = new Matrix3f($$3);
      Vector3f $$24 = $$23.transform(new Vector3f(azk.b($$22), azk.a($$22), 0.0F));
      int $$25 = Math.floorMod(-((int)Math.round(Math.toDegrees(Math.atan2((double)$$24.y(), (double)$$24.x())) / 90.0)) * 90, 360);
      return new gpj(new float[]{$$14, $$18, $$15, $$19}, $$25);
   }

   private static int[] a(gpj $$0, hgs $$1, jo $$2, float[] $$3, j $$4, @Nullable gpi $$5) {
      int[] $$6 = new int[32];

      for (int $$7 = 0; $$7 < 4; $$7++) {
         a($$6, $$7, $$2, $$0, $$3, $$1, $$4, $$5);
      }

      return $$6;
   }

   private static float[] a(Vector3f $$0, Vector3f $$1) {
      float[] $$2 = new float[jo.values().length];
      $$2[gnm.a.f] = $$0.x() / 16.0F;
      $$2[gnm.a.e] = $$0.y() / 16.0F;
      $$2[gnm.a.d] = $$0.z() / 16.0F;
      $$2[gnm.a.c] = $$1.x() / 16.0F;
      $$2[gnm.a.b] = $$1.y() / 16.0F;
      $$2[gnm.a.a] = $$1.z() / 16.0F;
      return $$2;
   }

   private static void a(int[] $$0, int $$1, jo $$2, gpj $$3, float[] $$4, hgs $$5, j $$6, @Nullable gpi $$7) {
      gnm.b $$8 = gnm.a($$2).a($$1);
      Vector3f $$9 = new Vector3f($$4[$$8.a], $$4[$$8.b], $$4[$$8.c]);
      a($$9, $$7);
      a($$9, $$6);
      a($$0, $$1, $$9, $$5, $$3);
   }

   private static void a(int[] $$0, int $$1, Vector3f $$2, hgs $$3, gpj $$4) {
      int $$5 = $$1 * 8;
      $$0[$$5] = Float.floatToRawIntBits($$2.x());
      $$0[$$5 + 1] = Float.floatToRawIntBits($$2.y());
      $$0[$$5 + 2] = Float.floatToRawIntBits($$2.z());
      $$0[$$5 + 3] = -1;
      $$0[$$5 + 4] = Float.floatToRawIntBits($$3.a($$4.a($$1) / 16.0F));
      $$0[$$5 + 4 + 1] = Float.floatToRawIntBits($$3.c($$4.b($$1) / 16.0F));
   }

   private static void a(Vector3f $$0, @Nullable gpi $$1) {
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

   private static void a(Vector3f $$0, j $$1) {
      if ($$1 != j.a()) {
         a($$0, new Vector3f(0.5F, 0.5F, 0.5F), $$1.c(), new Vector3f(1.0F, 1.0F, 1.0F));
      }
   }

   private static void a(Vector3f $$0, Vector3f $$1, Matrix4f $$2, Vector3f $$3) {
      Vector4f $$4 = $$2.transform(new Vector4f($$0.x() - $$1.x(), $$0.y() - $$1.y(), $$0.z() - $$1.z(), 1.0F));
      $$4.mul(new Vector4f($$3, 1.0F));
      $$0.set($$4.x() + $$1.x(), $$4.y() + $$1.y(), $$4.z() + $$1.z());
   }

   private static jo a(int[] $$0) {
      Vector3f $$1 = new Vector3f(Float.intBitsToFloat($$0[0]), Float.intBitsToFloat($$0[1]), Float.intBitsToFloat($$0[2]));
      Vector3f $$2 = new Vector3f(Float.intBitsToFloat($$0[8]), Float.intBitsToFloat($$0[9]), Float.intBitsToFloat($$0[10]));
      Vector3f $$3 = new Vector3f(Float.intBitsToFloat($$0[16]), Float.intBitsToFloat($$0[17]), Float.intBitsToFloat($$0[18]));
      Vector3f $$4 = new Vector3f($$1).sub($$2);
      Vector3f $$5 = new Vector3f($$3).sub($$2);
      Vector3f $$6 = new Vector3f($$5).cross($$4).normalize();
      if (!$$6.isFinite()) {
         return jo.b;
      } else {
         jo $$7 = null;
         float $$8 = 0.0F;

         for (jo $$9 : jo.values()) {
            kn $$10 = $$9.q();
            Vector3f $$11 = new Vector3f((float)$$10.u(), (float)$$10.v(), (float)$$10.w());
            float $$12 = $$6.dot($$11);
            if ($$12 >= 0.0F && $$12 > $$8) {
               $$8 = $$12;
               $$7 = $$9;
            }
         }

         return $$7 == null ? jo.b : $$7;
      }
   }

   private static void a(int[] $$0, jo $$1) {
      int[] $$2 = new int[$$0.length];
      System.arraycopy($$0, 0, $$2, 0, $$0.length);
      float[] $$3 = new float[jo.values().length];
      $$3[gnm.a.f] = 999.0F;
      $$3[gnm.a.e] = 999.0F;
      $$3[gnm.a.d] = 999.0F;
      $$3[gnm.a.c] = -999.0F;
      $$3[gnm.a.b] = -999.0F;
      $$3[gnm.a.a] = -999.0F;

      for (int $$4 = 0; $$4 < 4; $$4++) {
         int $$5 = 8 * $$4;
         float $$6 = Float.intBitsToFloat($$2[$$5]);
         float $$7 = Float.intBitsToFloat($$2[$$5 + 1]);
         float $$8 = Float.intBitsToFloat($$2[$$5 + 2]);
         if ($$6 < $$3[gnm.a.f]) {
            $$3[gnm.a.f] = $$6;
         }

         if ($$7 < $$3[gnm.a.e]) {
            $$3[gnm.a.e] = $$7;
         }

         if ($$8 < $$3[gnm.a.d]) {
            $$3[gnm.a.d] = $$8;
         }

         if ($$6 > $$3[gnm.a.c]) {
            $$3[gnm.a.c] = $$6;
         }

         if ($$7 > $$3[gnm.a.b]) {
            $$3[gnm.a.b] = $$7;
         }

         if ($$8 > $$3[gnm.a.a]) {
            $$3[gnm.a.a] = $$8;
         }
      }

      gnm $$9 = gnm.a($$1);

      for (int $$10 = 0; $$10 < 4; $$10++) {
         int $$11 = 8 * $$10;
         gnm.b $$12 = $$9.a($$10);
         float $$13 = $$3[$$12.a];
         float $$14 = $$3[$$12.b];
         float $$15 = $$3[$$12.c];
         $$0[$$11] = Float.floatToRawIntBits($$13);
         $$0[$$11 + 1] = Float.floatToRawIntBits($$14);
         $$0[$$11 + 2] = Float.floatToRawIntBits($$15);

         for (int $$16 = 0; $$16 < 4; $$16++) {
            int $$17 = 8 * $$16;
            float $$18 = Float.intBitsToFloat($$2[$$17]);
            float $$19 = Float.intBitsToFloat($$2[$$17 + 1]);
            float $$20 = Float.intBitsToFloat($$2[$$17 + 2]);
            if (azk.a($$13, $$18) && azk.a($$14, $$19) && azk.a($$15, $$20)) {
               $$0[$$11 + 4] = $$2[$$17 + 4];
               $$0[$$11 + 4 + 1] = $$2[$$17 + 4 + 1];
            }
         }
      }
   }
}
