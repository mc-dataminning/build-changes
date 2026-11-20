package net.minecraft.network.protocol.game;

import com.google.common.annotations.VisibleForTesting;
import java.lang.runtime.SwitchBootstraps;
import java.util.List;
import net.minecraft.world.entity.PositionPath;
import net.minecraft.world.entity.PositionStep;
import net.minecraft.world.phys.Vec3;
import org.jspecify.annotations.Nullable;

public class VecDeltaCodec {
   private static final double TRUNCATION_STEPS = 4096.0;
   private Vec3 base = Vec3.ZERO;

   @VisibleForTesting
   static long encode(final double input) {
      return Math.round(input * 4096.0);
   }

   @VisibleForTesting
   static double decode(final long v) {
      return v / 4096.0;
   }

   public static double encodingPrecisionLoss(final double d) {
      return decode(encode(d)) - d;
   }

   public static boolean isDeltaTooBig(final long xa, final long ya, final long za) {
      return xa < -32768L || xa > 32767L || ya < -32768L || ya > 32767L || za < -32768L || za > 32767L;
   }

   public Vec3 decode(final long xa, final long ya, final long za) {
      if (xa == 0L && ya == 0L && za == 0L) {
         return this.base;
      }

      double x = xa == 0L ? this.base.x : decode(encode(this.base.x) + xa);
      double y = ya == 0L ? this.base.y : decode(encode(this.base.y) + ya);
      double z = za == 0L ? this.base.z : decode(encode(this.base.z) + za);
      return new Vec3(x, y, z);
   }

   public @Nullable VecDelta tryEncode(final PositionPath position) {
      PositionPath var2 = position;
      byte var3 = 0;

      while (true) {
         VecDelta var21;
         switch (SwitchBootstraps.typeSwitch<"typeSwitch",PositionPath.Linear,PositionPath.Stepped>(var2, var3)) {
            case 0:
               PositionPath.Linear var4 = (PositionPath.Linear)var2;
               PositionPath.Linear var22 = var4;

               try {
                  var23 = var22.endPosition();
               } catch (Throwable var11) {
                  throw new MatchException(var11.toString(), var11);
               }

               Vec3 var15 = var23;
               Vec3 pos = var15;
               var21 = this.tryEncode(pos);
               break;
            case 1:
               PositionPath.Stepped var6 = (PositionPath.Stepped)var2;
               PositionPath.Stepped var10000 = var6;

               try {
                  var10000.endPosition();
               } catch (Throwable var14) {
                  throw new MatchException(var14.toString(), var14);
               }

               PositionPath.Stepped var17 = var6;

               try {
                  var18 = var17.steps();
               } catch (Throwable var13) {
                  throw new MatchException(var13.toString(), var13);
               }

               List var9 = var18;
               List<PositionStep> steps = var9;
               PositionPath.Stepped var19 = var6;

               try {
                  var20 = var19.startImmediately();
               } catch (Throwable var12) {
                  throw new MatchException(var12.toString(), var12);
               }

               boolean var16 = var20;
               if (false) {
                  var3 = 2;
                  continue;
               }

               boolean startImmediately = var16;
               var21 = VecDelta.Stepped.tryEncode(this, steps, startImmediately);
               break;
            default:
               throw new MatchException(null, null);
         }

         return var21;
      }
   }

   public @Nullable VecDelta tryEncode(final Vec3 pos) {
      long xa = this.encodeX(pos);
      long ya = this.encodeY(pos);
      long za = this.encodeZ(pos);
      return isDeltaTooBig(xa, ya, za) ? null : new VecDelta.Linear((short)xa, (short)ya, (short)za);
   }

   public long encodeX(final Vec3 pos) {
      return encode(pos.x) - encode(this.base.x);
   }

   public long encodeY(final Vec3 pos) {
      return encode(pos.y) - encode(this.base.y);
   }

   public long encodeZ(final Vec3 pos) {
      return encode(pos.z) - encode(this.base.z);
   }

   public Vec3 delta(final Vec3 pos) {
      return pos.subtract(this.base);
   }

   public void setBase(final Vec3 base) {
      this.base = base;
   }

   public Vec3 getBase() {
      return this.base;
   }
}
