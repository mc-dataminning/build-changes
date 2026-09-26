package net.minecraft.nbt;

import com.google.common.primitives.Shorts;
import com.google.common.primitives.SignedBytes;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public record DoubleTag(double value) implements NumericTag {
   private static final int SELF_SIZE_IN_BYTES = 16;
   public static final DoubleTag ZERO = new DoubleTag(0.0);
   public static final TagType<DoubleTag> TYPE = new TagType.StaticSize<DoubleTag>() {
      public DoubleTag load(final DataInput input, final NbtAccounter accounter) throws IOException {
         return DoubleTag.valueOf(readAccounted(input, accounter));
      }

      @Override
      public StreamTagVisitor.ValueResult parse(final DataInput input, final StreamTagVisitor output, final NbtAccounter accounter) throws IOException {
         return output.visit(readAccounted(input, accounter));
      }

      private static double readAccounted(final DataInput input, final NbtAccounter accounter) throws IOException {
         accounter.accountBytes(16L);
         return input.readDouble();
      }

      @Override
      public int size() {
         return 8;
      }

      @Override
      public String getName() {
         return "DOUBLE";
      }

      @Override
      public String getPrettyName() {
         return "TAG_Double";
      }
   };

   @Deprecated(forRemoval = true)
   public DoubleTag {
   }

   public static DoubleTag valueOf(final double data) {
      return data == 0.0 ? ZERO : new DoubleTag(data);
   }

   @Override
   public void write(final DataOutput output) throws IOException {
      output.writeDouble(this.value);
   }

   @Override
   public int sizeInBytes() {
      return 16;
   }

   @Override
   public byte getId() {
      return 6;
   }

   @Override
   public TagType<DoubleTag> getType() {
      return TYPE;
   }

   public DoubleTag copy() {
      return this;
   }

   @Override
   public void accept(final TagVisitor visitor) {
      visitor.visitDouble(this);
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
      return (float)this.value;
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
      visitor.visitDouble(this);
      return visitor.build();
   }
}
