package net.minecraft.nbt;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import com.mojang.serialization.RecordBuilder.AbstractStringBuilder;
import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import java.lang.runtime.SwitchBootstraps;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import net.minecraft.util.Util;
import org.jspecify.annotations.Nullable;

public class NbtOps implements DynamicOps<Tag> {
   public static final NbtOps INSTANCE = new NbtOps();

   private NbtOps() {
   }

   public Tag empty() {
      return EndTag.INSTANCE;
   }

   public Tag emptyList() {
      return new ListTag();
   }

   public Tag emptyMap() {
      return new CompoundTag();
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public <U> U convertTo(final DynamicOps<U> outOps, final Tag input) {
      Objects.requireNonNull(input);
      Tag var3 = input;
      byte var4 = 0;

      while (true) {
         Throwable var43;
         switch (SwitchBootstraps.typeSwitch<"typeSwitch",EndTag,ByteTag,ShortTag,IntTag,LongTag,FloatTag,DoubleTag,ByteArrayTag,StringTag,ListTag,CompoundTag,IntArrayTag,LongArrayTag>(
            var3, var4
         )) {
            case 0:
               EndTag ignored = (EndTag)var3;
               return (U)outOps.empty();
            case 1:
               ByteTag var6 = (ByteTag)var3;
               ByteTag var55 = var6;

               try {
                  var56 = var55.value();
               } catch (Throwable var33) {
                  var43 = var33;
                  boolean var62 = false;
                  break;
               }

               byte var35 = var56;
               if (false) {
                  var4 = 2;
                  continue;
               }

               return (U)outOps.createByte(var35);
            case 2:
               ShortTag var8 = (ShortTag)var3;
               ShortTag var53 = var8;

               try {
                  var54 = var53.value();
               } catch (Throwable var32) {
                  var43 = var32;
                  boolean var61 = false;
                  break;
               }

               short var36 = var54;
               if (false) {
                  var4 = 3;
                  continue;
               }

               return (U)outOps.createShort(var36);
            case 3:
               IntTag var10 = (IntTag)var3;
               IntTag var51 = var10;

               try {
                  var52 = var51.value();
               } catch (Throwable var31) {
                  var43 = var31;
                  boolean var60 = false;
                  break;
               }

               int var37 = var52;
               if (false) {
                  var4 = 4;
                  continue;
               }

               return (U)outOps.createInt(var37);
            case 4:
               LongTag var12 = (LongTag)var3;
               LongTag var49 = var12;

               try {
                  var50 = var49.value();
               } catch (Throwable var30) {
                  var43 = var30;
                  boolean var59 = false;
                  break;
               }

               long var38 = var50;
               if (false) {
                  var4 = 5;
                  continue;
               }

               return (U)outOps.createLong(var38);
            case 5:
               FloatTag var15 = (FloatTag)var3;
               FloatTag var47 = var15;

               try {
                  var48 = var47.value();
               } catch (Throwable var29) {
                  var43 = var29;
                  boolean var58 = false;
                  break;
               }

               float var39 = var48;
               if (false) {
                  var4 = 6;
                  continue;
               }

               return (U)outOps.createFloat(var39);
            case 6:
               DoubleTag var17 = (DoubleTag)var3;
               DoubleTag var45 = var17;

               try {
                  var46 = var45.value();
               } catch (Throwable var28) {
                  var43 = var28;
                  boolean var57 = false;
                  break;
               }

               double var40 = var46;
               if (false) {
                  var4 = 7;
                  continue;
               }

               return (U)outOps.createDouble(var40);
            case 7:
               ByteArrayTag byteArrayTag = (ByteArrayTag)var3;
               return (U)outOps.createByteList(ByteBuffer.wrap(byteArrayTag.getAsByteArray()));
            case 8:
               StringTag var21 = (StringTag)var3;
               StringTag var42 = var21;

               try {
                  var44 = var42.value();
               } catch (Throwable var27) {
                  var43 = var27;
                  boolean var10001 = false;
                  break;
               }

               String var41 = var44;
               return (U)outOps.createString(var41);
            case 9:
               ListTag listTag = (ListTag)var3;
               return (U)this.convertList(outOps, listTag);
            case 10:
               CompoundTag compoundTag = (CompoundTag)var3;
               return (U)this.convertMap(outOps, compoundTag);
            case 11:
               IntArrayTag intArrayTag = (IntArrayTag)var3;
               return (U)outOps.createIntList(Arrays.stream(intArrayTag.getAsIntArray()));
            case 12:
               LongArrayTag longArrayTag = (LongArrayTag)var3;
               return (U)outOps.createLongList(Arrays.stream(longArrayTag.getAsLongArray()));
            default:
               throw new MatchException(null, null);
         }

         Throwable var34 = var43;
         throw new MatchException(var34.toString(), var34);
      }
   }

   public DataResult<Number> getNumberValue(final Tag input) {
      return input.asNumber().<DataResult<Number>>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Not a number"));
   }

   public Tag createNumeric(final Number i) {
      return DoubleTag.valueOf(i.doubleValue());
   }

   public Tag createByte(final byte value) {
      return ByteTag.valueOf(value);
   }

   public Tag createShort(final short value) {
      return ShortTag.valueOf(value);
   }

   public Tag createInt(final int value) {
      return IntTag.valueOf(value);
   }

   public Tag createLong(final long value) {
      return LongTag.valueOf(value);
   }

   public Tag createFloat(final float value) {
      return FloatTag.valueOf(value);
   }

   public Tag createDouble(final double value) {
      return DoubleTag.valueOf(value);
   }

   public DataResult<Boolean> getBooleanValue(final Tag input) {
      return this.getNumberValue(input).map(value -> value.doubleValue() != 0.0);
   }

   public Tag createBoolean(final boolean value) {
      return ByteTag.valueOf(value);
   }

   public DataResult<String> getStringValue(final Tag input) {
      if (input instanceof StringTag var2) {
         StringTag var10000 = var2;

         try {
            var6 = var10000.value();
         } catch (Throwable var5) {
            throw new MatchException(var5.toString(), var5);
         }

         String var4 = var6;
         return DataResult.success(var4);
      } else {
         return DataResult.error(() -> "Not a string");
      }
   }

   public Tag createString(final String value) {
      return StringTag.valueOf(value);
   }

   public DataResult<Tag> mergeToList(final Tag list, final Tag value) {
      return createCollector(list)
         .map(collector -> DataResult.success(collector.accept(value).result()))
         .orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + list, list));
   }

   public DataResult<Tag> mergeToList(final Tag list, final List<Tag> values) {
      return createCollector(list)
         .map(collector -> DataResult.success(collector.acceptAll(values).result()))
         .orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + list, list));
   }

   public DataResult<Tag> mergeToMap(final Tag map, final Tag key, final Tag value) {
      if (!(map instanceof CompoundTag) && !(map instanceof EndTag)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + map, map);
      } else if (key instanceof StringTag output) {
         StringTag var10000 = output;

         try {
            var10 = var10000.value();
         } catch (Throwable var7) {
            throw new MatchException(var7.toString(), var7);
         }

         String tag = var10;
         CompoundTag outputx = map instanceof CompoundTag tagx ? tagx.shallowCopy() : new CompoundTag();
         outputx.put(tag, value);
         return DataResult.success(outputx);
      } else {
         return DataResult.error(() -> "key is not a string: " + key, map);
      }
   }

   public DataResult<Tag> mergeToMap(final Tag map, final MapLike<Tag> values) {
      if (!(map instanceof CompoundTag) && !(map instanceof EndTag)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + map, map);
      } else {
         Iterator<Pair<Tag, Tag>> valuesIterator = values.entries().iterator();
         if (!valuesIterator.hasNext()) {
            return map == this.empty() ? DataResult.success(this.emptyMap()) : DataResult.success(map);
         } else {
            CompoundTag output = map instanceof CompoundTag tag ? tag.shallowCopy() : new CompoundTag();
            List<Tag> missed = new ArrayList<>();
            valuesIterator.forEachRemaining(entry -> {
               Tag key = (Tag)entry.getFirst();
               if (key instanceof StringTag $b$0) {
                  StringTag var10000 = $b$0;

                  try {
                     var8 = var10000.value();
                  } catch (Throwable var7) {
                     throw new MatchException(var7.toString(), var7);
                  }

                  String patt1$temp = var8;
                  output.put(patt1$temp, (Tag)entry.getSecond());
               } else {
                  missed.add(key);
               }
            });
            return !missed.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + missed, output) : DataResult.success(output);
         }
      }
   }

   public DataResult<Tag> mergeToMap(final Tag map, final Map<Tag, Tag> values) {
      if (!(map instanceof CompoundTag) && !(map instanceof EndTag)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + map, map);
      } else if (values.isEmpty()) {
         return map == this.empty() ? DataResult.success(this.emptyMap()) : DataResult.success(map);
      } else {
         CompoundTag output = map instanceof CompoundTag tag ? tag.shallowCopy() : new CompoundTag();
         List<Tag> missed = new ArrayList<>();

         for (Entry<Tag, Tag> entry : values.entrySet()) {
            Tag key = entry.getKey();
            if (key instanceof StringTag) {
               StringTag var8 = (StringTag)key;
               StringTag var13 = var8;

               try {
                  var14 = var13.value();
               } catch (Throwable var11) {
                  throw new MatchException(var11.toString(), var11);
               }

               String var10 = var14;
               output.put(var10, entry.getValue());
            } else {
               missed.add(key);
            }
         }

         return !missed.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + missed, output) : DataResult.success(output);
      }
   }

   public DataResult<Stream<Pair<Tag, Tag>>> getMapValues(final Tag input) {
      return input instanceof CompoundTag tag
         ? DataResult.success(tag.entrySet().stream().map(entry -> Pair.of(this.createString(entry.getKey()), entry.getValue())))
         : DataResult.error(() -> "Not a map: " + input);
   }

   public DataResult<Consumer<BiConsumer<Tag, Tag>>> getMapEntries(final Tag input) {
      return input instanceof CompoundTag tag ? DataResult.success((Consumer<BiConsumer>)c -> {
         for (Entry<String, Tag> entry : tag.entrySet()) {
            c.accept(this.createString(entry.getKey()), entry.getValue());
         }
      }) : DataResult.error(() -> "Not a map: " + input);
   }

   public DataResult<MapLike<Tag>> getMap(final Tag input) {
      return input instanceof CompoundTag tag ? DataResult.success(new MapLike<Tag>() {
         {
            Objects.requireNonNull(NbtOps.this);
         }

         @Nullable
         public Tag get(final Tag key) {
            if (key instanceof StringTag var2) {
               StringTag var10000 = var2;

               try {
                  var6 = var10000.value();
               } catch (Throwable var5) {
                  throw new MatchException(var5.toString(), var5);
               }

               String var4 = var6;
               return tag.get(var4);
            } else {
               throw new UnsupportedOperationException("Cannot get map entry with non-string key: " + key);
            }
         }

         @Nullable
         public Tag get(final String key) {
            return tag.get(key);
         }

         public Stream<Pair<Tag, Tag>> entries() {
            return tag.entrySet().stream().map(entry -> Pair.of(NbtOps.this.createString(entry.getKey()), entry.getValue()));
         }

         @Override
         public String toString() {
            return "MapLike[" + tag + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + input);
   }

   public Tag createMap(final Stream<Pair<Tag, Tag>> map) {
      CompoundTag tag = new CompoundTag();
      map.forEach(entry -> {
         Tag key = (Tag)entry.getFirst();
         Tag value = (Tag)entry.getSecond();
         if (key instanceof StringTag $b$0) {
            StringTag var10000 = $b$0;

            try {
               var8 = var10000.value();
            } catch (Throwable var7) {
               throw new MatchException(var7.toString(), var7);
            }

            String patt1$temp = var8;
            tag.put(patt1$temp, value);
         } else {
            throw new UnsupportedOperationException("Cannot create map with non-string key: " + key);
         }
      });
      return tag;
   }

   public DataResult<Stream<Tag>> getStream(final Tag input) {
      return input instanceof CollectionTag collection ? DataResult.success(collection.stream()) : DataResult.error(() -> "Not a list");
   }

   public DataResult<Consumer<Consumer<Tag>>> getList(final Tag input) {
      return input instanceof CollectionTag collection ? DataResult.success(collection::forEach) : DataResult.error(() -> "Not a list: " + input);
   }

   public DataResult<ByteBuffer> getByteBuffer(final Tag input) {
      return input instanceof ByteArrayTag array ? DataResult.success(ByteBuffer.wrap(array.getAsByteArray())) : super.getByteBuffer(input);
   }

   public Tag createByteList(final ByteBuffer input) {
      ByteBuffer wholeBuffer = input.duplicate().clear();
      byte[] bytes = new byte[input.capacity()];
      wholeBuffer.get(0, bytes, 0, bytes.length);
      return new ByteArrayTag(bytes);
   }

   public DataResult<IntStream> getIntStream(final Tag input) {
      return input instanceof IntArrayTag array ? DataResult.success(Arrays.stream(array.getAsIntArray())) : super.getIntStream(input);
   }

   public Tag createIntList(final IntStream input) {
      return new IntArrayTag(input.toArray());
   }

   public DataResult<LongStream> getLongStream(final Tag input) {
      return input instanceof LongArrayTag array ? DataResult.success(Arrays.stream(array.getAsLongArray())) : super.getLongStream(input);
   }

   public Tag createLongList(final LongStream input) {
      return new LongArrayTag(input.toArray());
   }

   public Tag createList(final Stream<Tag> input) {
      return new ListTag(input.collect(Util.toMutableList()));
   }

   public Tag remove(final Tag input, final String key) {
      if (input instanceof CompoundTag tag) {
         CompoundTag result = tag.shallowCopy();
         result.remove(key);
         return result;
      } else {
         return input;
      }
   }

   @Override
   public String toString() {
      return "NBT";
   }

   public RecordBuilder<Tag> mapBuilder() {
      return new NbtOps.NbtRecordBuilder();
   }

   private static Optional<NbtOps.ListCollector> createCollector(final Tag tag) {
      if (tag instanceof EndTag) {
         return Optional.of(new NbtOps.GenericListCollector());
      } else if (tag instanceof CollectionTag collection) {
         if (collection.isEmpty()) {
            return Optional.of(new NbtOps.GenericListCollector());
         } else {
            Objects.requireNonNull(collection);

            return switch (collection) {
               case ListTag list -> Optional.of(new NbtOps.GenericListCollector(list));
               case ByteArrayTag array -> Optional.of(new NbtOps.ByteListCollector(array.getAsByteArray()));
               case IntArrayTag arrayx -> Optional.of(new NbtOps.IntListCollector(arrayx.getAsIntArray()));
               case LongArrayTag arrayxx -> Optional.of(new NbtOps.LongListCollector(arrayxx.getAsLongArray()));
               default -> throw new MatchException(null, null);
            };
         }
      } else {
         return Optional.empty();
      }
   }

   private static class ByteListCollector implements NbtOps.ListCollector {
      private final ByteArrayList values = new ByteArrayList();

      public ByteListCollector(final byte[] initialValues) {
         this.values.addElements(0, initialValues);
      }

      @Override
      public NbtOps.ListCollector accept(final Tag tag) {
         if (tag instanceof ByteTag byteTag) {
            this.values.add(byteTag.byteValue());
            return this;
         } else {
            return new NbtOps.GenericListCollector(this.values).accept(tag);
         }
      }

      @Override
      public Tag result() {
         return new ByteArrayTag(this.values.toByteArray());
      }
   }

   private static class GenericListCollector implements NbtOps.ListCollector {
      private final ListTag result = new ListTag();

      private GenericListCollector() {
      }

      private GenericListCollector(final ListTag initial) {
         this.result.addAll(initial);
      }

      public GenericListCollector(final IntArrayList initials) {
         initials.forEach(v -> this.result.add(IntTag.valueOf(v)));
      }

      public GenericListCollector(final ByteArrayList initials) {
         initials.forEach(v -> this.result.add(ByteTag.valueOf(v)));
      }

      public GenericListCollector(final LongArrayList initials) {
         initials.forEach(v -> this.result.add(LongTag.valueOf(v)));
      }

      @Override
      public NbtOps.ListCollector accept(final Tag tag) {
         this.result.add(tag);
         return this;
      }

      @Override
      public Tag result() {
         return this.result;
      }
   }

   private static class IntListCollector implements NbtOps.ListCollector {
      private final IntArrayList values = new IntArrayList();

      public IntListCollector(final int[] initialValues) {
         this.values.addElements(0, initialValues);
      }

      @Override
      public NbtOps.ListCollector accept(final Tag tag) {
         if (tag instanceof IntTag intTag) {
            this.values.add(intTag.intValue());
            return this;
         } else {
            return new NbtOps.GenericListCollector(this.values).accept(tag);
         }
      }

      @Override
      public Tag result() {
         return new IntArrayTag(this.values.toIntArray());
      }
   }

   private interface ListCollector {
      NbtOps.ListCollector accept(Tag t);

      default NbtOps.ListCollector acceptAll(final Iterable<Tag> tags) {
         NbtOps.ListCollector collector = this;

         for (Tag tag : tags) {
            collector = collector.accept(tag);
         }

         return collector;
      }

      Tag result();
   }

   private static class LongListCollector implements NbtOps.ListCollector {
      private final LongArrayList values = new LongArrayList();

      public LongListCollector(final long[] initialValues) {
         this.values.addElements(0, initialValues);
      }

      @Override
      public NbtOps.ListCollector accept(final Tag tag) {
         if (tag instanceof LongTag longTag) {
            this.values.add(longTag.longValue());
            return this;
         } else {
            return new NbtOps.GenericListCollector(this.values).accept(tag);
         }
      }

      @Override
      public Tag result() {
         return new LongArrayTag(this.values.toLongArray());
      }
   }

   private class NbtRecordBuilder extends AbstractStringBuilder<Tag, CompoundTag> {
      protected NbtRecordBuilder() {
         Objects.requireNonNull(NbtOps.this);
         super(NbtOps.this);
      }

      protected CompoundTag initBuilder() {
         return new CompoundTag();
      }

      protected CompoundTag append(final String key, final Tag value, final CompoundTag builder) {
         builder.put(key, value);
         return builder;
      }

      protected DataResult<Tag> build(final CompoundTag builder, final Tag prefix) {
         if (prefix == null || prefix == EndTag.INSTANCE) {
            return DataResult.success(builder);
         } else if (!(prefix instanceof CompoundTag compound)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + prefix, prefix);
         } else {
            CompoundTag result = compound.shallowCopy();

            for (Entry<String, Tag> entry : builder.entrySet()) {
               result.put(entry.getKey(), entry.getValue());
            }

            return DataResult.success(result);
         }
      }
   }
}
