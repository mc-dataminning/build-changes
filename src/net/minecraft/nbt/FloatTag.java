package net.minecraft.nbt;

import com.google.common.primitives.Shorts;
import com.google.common.primitives.SignedBytes;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public record FloatTag(float value) implements NumericTag {
   private static final int SELF_SIZE_IN_BYTES = 12;
   public static final FloatTag ZERO = new FloatTag(0.0F);
   public static final TagType<FloatTag> TYPE = new TagType.StaticSize<FloatTag>() {
      public FloatTag load(final DataInput input, final NbtAccounter accounter) throws IOException {
         return FloatTag.valueOf(readAccounted(input, accounter));
      }

      @Override
      public StreamTagVisitor.ValueResult parse(final DataInput input, final StreamTagVisitor output, final NbtAccounter accounter) throws IOException {
         return output.visit(readAccounted(input, accounter));
      }

      private static float readAccounted(final DataInput input, final NbtAccounter accounter) throws IOException {
         accounter.accountBytes(12L);
         return input.readFloat();
      }

      @Override
      public int size() {
         return 4;
      }

      @Override
      public String getName() {
         return "FLOAT";
      }

      @Override
      public String getPrettyName() {
         return "TAG_Float";
      }
   };

   @Deprecated(forRemoval = true)
   public FloatTag {
   }

   public static FloatTag valueOf(final float data) {
      return data == 0.0F ? ZERO : new FloatTag(data);
   }

   @Override
   public void write(final DataOutput output) throws IOException {
      output.writeFloat(this.value);
   }

   @Override
   public int sizeInBytes() {
      return 12;
   }

   @Override
   public byte getId() {
      return 5;
   }

   @Override
   public TagType<FloatTag> getType() {
      return TYPE;
   }

   public FloatTag copy() {
      return this;
   }

   @Override
   public void accept(final TagVisitor visitor) {
      visitor.visitFloat(this);
   }

   @Override
   public long longValue() {
      return (long)Math.floor(this.value);
   }

   @Override
   public int intValue() {
      return (int)Math.floor(this.value);
   }

   @Override
   public short shortValue() {
      return Shorts.saturatedCast((long)Math.floor(this.value));
   }

   @Override
   public byte byteValue() {
      return SignedBytes.saturatedCast((long)Math.floor(this.value));
   }

   @Override
   public double doubleValue() {
      return this.value;
   }

   @Override
   public float floatValue() {
      return this.value;
   }

   @Override
   public Number box() {
      return this.value;
   }

   @Override
   public StreamTagVisitor.ValueResult accept(final StreamTagVisitor visitor) {
      return visitor.visit(this.value);
   }

   @Override
   public String toString() {
      StringTagVisitor visitor = new StringTagVisitor();
      visitor.visitFloat(this);
      return visitor.build();
   }
}
