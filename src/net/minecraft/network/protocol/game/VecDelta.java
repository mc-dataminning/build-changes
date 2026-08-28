package net.minecraft.network.protocol.game;

import io.netty.handler.codec.DecoderException;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.PositionPath;
import net.minecraft.world.entity.PositionStep;
import net.minecraft.world.phys.Vec3;
import org.jspecify.annotations.Nullable;

public sealed interface VecDelta permits VecDelta.Linear, VecDelta.Stepped {
   VecDelta ZERO = new VecDelta.Linear((short)0, (short)0, (short)0);

   int stepCount();

   boolean hasDeltaX();

   boolean hasDeltaZ();

   PositionPath decode(VecDeltaCodec positionCodec);

   static VecDelta read(final FriendlyByteBuf input, final int stepCount) {
      if (stepCount <= 0) {
         short xa = input.readShort();
         short ya = input.readShort();
         short za = input.readShort();
         return new VecDelta.Linear(xa, ya, za);
      } else {
         int maxSteps = input.readableBytes() / 7;
         if (stepCount > maxSteps) {
            throw new DecoderException("VecDelta with size " + stepCount + " is bigger than allowed " + maxSteps);
         } else {
            List<VecDelta.Stepped.DeltaStep> steps = new ArrayList<>(stepCount);

            for (int i = 0; i < stepCount; i++) {
               int ticks = input.readVarInt();
               short xa = input.readShort();
               short ya = input.readShort();
               short za = input.readShort();
               steps.add(new VecDelta.Stepped.DeltaStep(xa, ya, za, ticks));
            }

            return new VecDelta.Stepped(steps);
         }
      }
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   static void write(final FriendlyByteBuf output, final VecDelta delta) {
      Objects.requireNonNull(delta);
      VecDelta var2 = delta;
      byte var3 = 0;

      while (true) {
         label70: {
            Throwable var21;
            switch (SwitchBootstraps.typeSwitch<"typeSwitch",VecDelta.Linear,VecDelta.Stepped>(var2, var3)) {
               case 0:
                  VecDelta.Linear var4 = (VecDelta.Linear)var2;
                  VecDelta.Linear var23 = var4;

                  try {
                     var24 = var23.xa();
                  } catch (Throwable var15) {
                     var21 = var15;
                     boolean var29 = false;
                     break;
                  }

                  short var17 = var24;
                  if (false) {
                     break label70;
                  }

                  VecDelta.Linear var25 = var4;

                  try {
                     var26 = var25.ya();
                  } catch (Throwable var14) {
                     var21 = var14;
                     boolean var30 = false;
                     break;
                  }

                  var17 = var26;
                  if (false) {
                     break label70;
                  }

                  VecDelta.Linear var27 = var4;

                  try {
                     var28 = var27.za();
                  } catch (Throwable var13) {
                     var21 = var13;
                     boolean var31 = false;
                     break;
                  }

                  var17 = var28;
                  if (false) {
                     break label70;
                  }

                  output.writeShort(var17);
                  output.writeShort(var17);
                  output.writeShort(var17);
                  return;
               case 1:
                  VecDelta.Stepped var8 = (VecDelta.Stepped)var2;
                  VecDelta.Stepped var10000 = var8;

                  try {
                     var22 = var10000.steps();
                  } catch (Throwable var12) {
                     var21 = var12;
                     boolean var10001 = false;
                     break;
                  }

                  for (VecDelta.Stepped.DeltaStep step : var22) {
                     output.writeVarInt(step.ticks);
                     output.writeShort(step.xa);
                     output.writeShort(step.ya);
                     output.writeShort(step.za);
                  }

                  return;
               default:
                  throw new MatchException(null, null);
            }

            Throwable var16 = var21;
            throw new MatchException(var16.toString(), var16);
         }

         var3 = 1;
      }
   }

   public static record Linear(short xa, short ya, short za) implements VecDelta {
      @Override
      public int stepCount() {
         return 0;
      }

      @Override
      public boolean hasDeltaX() {
         return this.xa != 0;
      }

      @Override
      public boolean hasDeltaZ() {
         return this.za != 0;
      }

      @Override
      public PositionPath decode(final VecDeltaCodec positionCodec) {
         Vec3 pos = positionCodec.decode((long)this.xa, (long)this.ya, (long)this.za);
         return PositionPath.of(pos);
      }
   }

   public static record Stepped(List<VecDelta.Stepped.DeltaStep> steps) implements VecDelta {
      private static final int MIN_BYTES_PER_STEP = 7;

      @Override
      public int stepCount() {
         return this.steps.size();
      }

      @Override
      public boolean hasDeltaX() {
         for (VecDelta.Stepped.DeltaStep step : this.steps) {
            if (step.xa != 0) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean hasDeltaZ() {
         for (VecDelta.Stepped.DeltaStep step : this.steps) {
            if (step.za != 0) {
               return true;
            }
         }

         return false;
      }

      @Override
      public PositionPath decode(final VecDeltaCodec positionCodec) {
         if (this.steps.isEmpty()) {
            return PositionPath.of(positionCodec.getBase());
         } else {
            List<PositionStep> output = new ArrayList<>(this.steps.size());
            Vec3 originalBase = positionCodec.getBase();

            for (VecDelta.Stepped.DeltaStep e : this.steps) {
               Vec3 pos = positionCodec.decode((long)e.xa, (long)e.ya, (long)e.za);
               output.add(new PositionStep(pos, e.ticks));
               positionCodec.setBase(pos);
            }

            positionCodec.setBase(originalBase);
            return PositionPath.stepped(output);
         }
      }

      @Nullable
      public static VecDelta.Stepped tryEncode(final VecDeltaCodec positionCodec, final List<PositionStep> steps) {
         if (steps.isEmpty()) {
            return new VecDelta.Stepped(List.of());
         } else {
            List<VecDelta.Stepped.DeltaStep> output = new ArrayList<>(steps.size());
            Vec3 originalBase = positionCodec.getBase();

            for (PositionStep step : steps) {
               Vec3 pos = step.position();
               long xa = positionCodec.encodeX(pos);
               long ya = positionCodec.encodeY(pos);
               long za = positionCodec.encodeZ(pos);
               if (VecDeltaCodec.isDeltaTooBig(xa, ya, za)) {
                  positionCodec.setBase(originalBase);
                  return null;
               }

               output.add(new VecDelta.Stepped.DeltaStep((short)((int)xa), (short)((int)ya), (short)((int)za), step.tickOffset()));
               positionCodec.setBase(pos);
            }

            positionCodec.setBase(originalBase);
            return new VecDelta.Stepped(output);
         }
      }

      public static record DeltaStep(short xa, short ya, short za, int ticks) {
      }
   }
}
