import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import io.netty.util.ByteProcessor;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;
import java.security.PublicKey;
import java.time.Instant;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class vy extends ByteBuf {
   public static final int a = 2097152;
   private final ByteBuf d;
   public static final short b = 32767;
   public static final int c = 262144;
   private static final int e = 256;
   private static final int f = 256;
   private static final int g = 512;
   private static final Gson h = new Gson();

   public vy(ByteBuf $$0) {
      this.d = $$0;
   }

   @Deprecated
   public <T> T a(DynamicOps<va> $$0, Codec<T> $$1) {
      return this.a($$0, $$1, uj.a());
   }

   @Deprecated
   public <T> T a(DynamicOps<va> $$0, Codec<T> $$1, uj $$2) {
      va $$3 = this.a($$2);
      return (T)$$1.parse($$0, $$3).getOrThrow($$1x -> new DecoderException("Failed to decode: " + $$1x + " " + $$3));
   }

   @Deprecated
   public <T> vy a(DynamicOps<va> $$0, Codec<T> $$1, T $$2) {
      va $$3 = (va)$$1.encodeStart($$0, $$2).getOrThrow($$1x -> new EncoderException("Failed to encode: " + $$1x + " " + $$2));
      this.a($$3);
      return this;
   }

   public <T> T a(Codec<T> $$0) {
      JsonElement $$1 = azo.a(h, this.p(), JsonElement.class);
      DataResult<T> $$2 = $$0.parse(JsonOps.INSTANCE, $$1);
      return (T)$$2.getOrThrow($$0x -> new DecoderException("Failed to decode json: " + $$0x));
   }

   public <T> void a(Codec<T> $$0, T $$1) {
      DataResult<JsonElement> $$2 = $$0.encodeStart(JsonOps.INSTANCE, $$1);
      this.a(h.toJson((JsonElement)$$2.getOrThrow($$1x -> new EncoderException("Failed to encode: " + $$1x + " " + $$1))));
   }

   public static <T> IntFunction<T> a(IntFunction<T> $$0, int $$1) {
      return $$2 -> {
         if ($$2 > $$1) {
            throw new DecoderException("Value " + $$2 + " is larger than limit " + $$1);
         } else {
            return $$0.apply($$2);
         }
      };
   }

   public <T, C extends Collection<T>> C a(IntFunction<C> $$0, zf<? super vy, T> $$1) {
      int $$2 = this.l();
      C $$3 = (C)$$0.apply($$2);

      for (int $$4 = 0; $$4 < $$2; $$4++) {
         $$3.add($$1.decode(this));
      }

      return $$3;
   }

   public <T> void a(Collection<T> $$0, zg<? super vy, T> $$1) {
      this.c($$0.size());

      for (T $$2 : $$0) {
         $$1.encode(this, $$2);
      }
   }

   public <T> List<T> a(zf<? super vy, T> $$0) {
      return this.a(Lists::newArrayListWithCapacity, $$0);
   }

   public IntList a() {
      int $$0 = this.l();
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         $$1.add(this.l());
      }

      return $$1;
   }

   public void a(IntList $$0) {
      this.c($$0.size());
      $$0.forEach(this::c);
   }

   public <K, V, M extends Map<K, V>> M a(IntFunction<M> $$0, zf<? super vy, K> $$1, zf<? super vy, V> $$2) {
      int $$3 = this.l();
      M $$4 = (M)$$0.apply($$3);

      for (int $$5 = 0; $$5 < $$3; $$5++) {
         K $$6 = $$1.decode(this);
         V $$7 = $$2.decode(this);
         $$4.put($$6, $$7);
      }

      return $$4;
   }

   public <K, V> Map<K, V> a(zf<? super vy, K> $$0, zf<? super vy, V> $$1) {
      return this.a(Maps::newHashMapWithExpectedSize, $$0, $$1);
   }

   public <K, V> void a(Map<K, V> $$0, zg<? super vy, K> $$1, zg<? super vy, V> $$2) {
      this.c($$0.size());
      $$0.forEach(($$2x, $$3) -> {
         $$1.encode(this, (K)$$2x);
         $$2.encode(this, (V)$$3);
      });
   }

   public void a(Consumer<vy> $$0) {
      int $$1 = this.l();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         $$0.accept(this);
      }
   }

   public <E extends Enum<E>> void a(EnumSet<E> $$0, Class<E> $$1) {
      E[] $$2 = (E[])$$1.getEnumConstants();
      BitSet $$3 = new BitSet($$2.length);

      for (int $$4 = 0; $$4 < $$2.length; $$4++) {
         $$3.set($$4, $$0.contains($$2[$$4]));
      }

      this.a($$3, $$2.length);
   }

   public <E extends Enum<E>> EnumSet<E> a(Class<E> $$0) {
      E[] $$1 = (E[])$$0.getEnumConstants();
      BitSet $$2 = this.e($$1.length);
      EnumSet<E> $$3 = EnumSet.noneOf($$0);

      for (int $$4 = 0; $$4 < $$1.length; $$4++) {
         if ($$2.get($$4)) {
            $$3.add($$1[$$4]);
         }
      }

      return $$3;
   }

   public <T> void a(Optional<T> $$0, zg<? super vy, T> $$1) {
      if ($$0.isPresent()) {
         this.a(true);
         $$1.encode(this, $$0.get());
      } else {
         this.a(false);
      }
   }

   public <T> Optional<T> b(zf<? super vy, T> $$0) {
      return this.readBoolean() ? Optional.of($$0.decode(this)) : Optional.empty();
   }

   @Nullable
   public <T> T c(zf<? super vy, T> $$0) {
      return a(this, $$0);
   }

   @Nullable
   public static <T, B extends ByteBuf> T a(B $$0, zf<? super B, T> $$1) {
      return $$0.readBoolean() ? $$1.decode($$0) : null;
   }

   public <T> void a(@Nullable T $$0, zg<? super vy, T> $$1) {
      a(this, $$0, $$1);
   }

   public static <T, B extends ByteBuf> void a(B $$0, @Nullable T $$1, zg<? super B, T> $$2) {
      if ($$1 != null) {
         $$0.writeBoolean(true);
         $$2.encode($$0, $$1);
      } else {
         $$0.writeBoolean(false);
      }
   }

   public byte[] b() {
      return a((ByteBuf)this);
   }

   public static byte[] a(ByteBuf $$0) {
      return a($$0, $$0.readableBytes());
   }

   public vy a(byte[] $$0) {
      a(this, $$0);
      return this;
   }

   public static void a(ByteBuf $$0, byte[] $$1) {
      wx.a($$0, $$1.length);
      $$0.writeBytes($$1);
   }

   public byte[] a(int $$0) {
      return a(this, $$0);
   }

   public static byte[] a(ByteBuf $$0, int $$1) {
      int $$2 = wx.a($$0);
      if ($$2 > $$1) {
         throw new DecoderException("ByteArray with size " + $$2 + " is bigger than allowed " + $$1);
      } else {
         byte[] $$3 = new byte[$$2];
         $$0.readBytes($$3);
         return $$3;
      }
   }

   public vy a(int[] $$0) {
      this.c($$0.length);

      for (int $$1 : $$0) {
         this.c($$1);
      }

      return this;
   }

   public int[] c() {
      return this.b(this.readableBytes());
   }

   public int[] b(int $$0) {
      int $$1 = this.l();
      if ($$1 > $$0) {
         throw new DecoderException("VarIntArray with size " + $$1 + " is bigger than allowed " + $$0);
      } else {
         int[] $$2 = new int[$$1];

         for (int $$3 = 0; $$3 < $$2.length; $$3++) {
            $$2[$$3] = this.l();
         }

         return $$2;
      }
   }

   public vy a(long[] $$0) {
      a(this, $$0);
      return this;
   }

   public static void a(ByteBuf $$0, long[] $$1) {
      wx.a($$0, $$1.length);
      b($$0, $$1);
   }

   public vy b(long[] $$0) {
      b(this, $$0);
      return this;
   }

   public static void b(ByteBuf $$0, long[] $$1) {
      for (long $$2 : $$1) {
         $$0.writeLong($$2);
      }
   }

   public long[] d() {
      return b(this);
   }

   public long[] c(long[] $$0) {
      return c(this, $$0);
   }

   public static long[] b(ByteBuf $$0) {
      int $$1 = wx.a($$0);
      int $$2 = $$0.readableBytes() / 8;
      if ($$1 > $$2) {
         throw new DecoderException("LongArray with size " + $$1 + " is bigger than allowed " + $$2);
      } else {
         return c($$0, new long[$$1]);
      }
   }

   public static long[] c(ByteBuf $$0, long[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2] = $$0.readLong();
      }

      return $$1;
   }

   public iw e() {
      return c(this);
   }

   public static iw c(ByteBuf $$0) {
      return iw.d($$0.readLong());
   }

   public vy a(iw $$0) {
      a(this, $$0);
      return this;
   }

   public static void a(ByteBuf $$0, iw $$1) {
      $$0.writeLong($$1.a());
   }

   public djo f() {
      return new djo(this.readLong());
   }

   public vy a(djo $$0) {
      this.b($$0.a());
      return this;
   }

   public static djo d(ByteBuf $$0) {
      return new djo($$0.readLong());
   }

   public static void a(ByteBuf $$0, djo $$1) {
      $$0.writeLong($$1.a());
   }

   public jz g() {
      return jz.a(this.readLong());
   }

   public vy a(jz $$0) {
      this.b($$0.s());
      return this;
   }

   public jf h() {
      alq<dkj> $$0 = this.a(mi.bp);
      iw $$1 = this.e();
      return jf.a($$0, $$1);
   }

   public void a(jf $$0) {
      this.b($$0.a());
      this.a($$0.b());
   }

   public Vector3f i() {
      return e(this);
   }

   public static Vector3f e(ByteBuf $$0) {
      return new Vector3f($$0.readFloat(), $$0.readFloat(), $$0.readFloat());
   }

   public void a(Vector3f $$0) {
      a(this, $$0);
   }

   public static void a(ByteBuf $$0, Vector3f $$1) {
      $$0.writeFloat($$1.x());
      $$0.writeFloat($$1.y());
      $$0.writeFloat($$1.z());
   }

   public Quaternionf j() {
      return f(this);
   }

   public static Quaternionf f(ByteBuf $$0) {
      return new Quaternionf($$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat());
   }

   public void a(Quaternionf $$0) {
      a(this, $$0);
   }

   public static void a(ByteBuf $$0, Quaternionf $$1) {
      $$0.writeFloat($$1.x);
      $$0.writeFloat($$1.y);
      $$0.writeFloat($$1.z);
      $$0.writeFloat($$1.w);
   }

   public static fgc g(ByteBuf $$0) {
      return new fgc($$0.readDouble(), $$0.readDouble(), $$0.readDouble());
   }

   public fgc k() {
      return g(this);
   }

   public static void a(ByteBuf $$0, fgc $$1) {
      $$0.writeDouble($$1.a());
      $$0.writeDouble($$1.b());
      $$0.writeDouble($$1.c());
   }

   public void a(fgc $$0) {
      a(this, $$0);
   }

   public <T extends Enum<T>> T b(Class<T> $$0) {
      return $$0.getEnumConstants()[this.l()];
   }

   public vy a(Enum<?> $$0) {
      return this.c($$0.ordinal());
   }

   public <T> T a(IntFunction<T> $$0) {
      int $$1 = this.l();
      return $$0.apply($$1);
   }

   public <T> vy a(ToIntFunction<T> $$0, T $$1) {
      int $$2 = $$0.applyAsInt($$1);
      return this.c($$2);
   }

   public int l() {
      return wx.a(this.d);
   }

   public long m() {
      return wy.a(this.d);
   }

   public vy a(UUID $$0) {
      a(this, $$0);
      return this;
   }

   public static void a(ByteBuf $$0, UUID $$1) {
      $$0.writeLong($$1.getMostSignificantBits());
      $$0.writeLong($$1.getLeastSignificantBits());
   }

   public UUID n() {
      return h(this);
   }

   public static UUID h(ByteBuf $$0) {
      return new UUID($$0.readLong(), $$0.readLong());
   }

   public vy c(int $$0) {
      wx.a(this.d, $$0);
      return this;
   }

   public vy a(long $$0) {
      wy.a(this.d, $$0);
      return this;
   }

   public vy a(@Nullable va $$0) {
      a(this, $$0);
      return this;
   }

   public static void a(ByteBuf $$0, @Nullable va $$1) {
      if ($$1 == null) {
         $$1 = uc.b;
      }

      try {
         un.a($$1, new ByteBufOutputStream($$0));
      } catch (IOException var3) {
         throw new EncoderException(var3);
      }
   }

   @Nullable
   public ua o() {
      return i(this);
   }

   @Nullable
   public static ua i(ByteBuf $$0) {
      va $$1 = a($$0, uj.a(2097152L));
      if ($$1 != null && !($$1 instanceof ua)) {
         throw new DecoderException("Not a compound tag: " + $$1);
      } else {
         return (ua)$$1;
      }
   }

   @Nullable
   public static va a(ByteBuf $$0, uj $$1) {
      try {
         va $$2 = un.b(new ByteBufInputStream($$0), $$1);
         return $$2.b() == 0 ? null : $$2;
      } catch (IOException var3) {
         throw new EncoderException(var3);
      }
   }

   @Nullable
   public va a(uj $$0) {
      return a(this, $$0);
   }

   public String p() {
      return this.d(32767);
   }

   public String d(int $$0) {
      return ww.a(this.d, $$0);
   }

   public vy a(String $$0) {
      return this.a($$0, 32767);
   }

   public vy a(String $$0, int $$1) {
      ww.a(this.d, $$0, $$1);
      return this;
   }

   public alr q() {
      return alr.a(this.d(32767));
   }

   public vy a(alr $$0) {
      this.a($$0.toString());
      return this;
   }

   public <T> alq<T> a(alq<? extends jt<T>> $$0) {
      alr $$1 = this.q();
      return alq.a($$0, $$1);
   }

   public void b(alq<?> $$0) {
      this.a($$0.a());
   }

   public <T> alq<? extends jt<T>> r() {
      alr $$0 = this.q();
      return alq.a($$0);
   }

   public Date s() {
      return new Date(this.readLong());
   }

   public vy a(Date $$0) {
      this.b($$0.getTime());
      return this;
   }

   public Instant t() {
      return Instant.ofEpochMilli(this.readLong());
   }

   public void a(Instant $$0) {
      this.b($$0.toEpochMilli());
   }

   public PublicKey u() {
      try {
         return ayv.a(this.a(512));
      } catch (ayw var2) {
         throw new DecoderException("Malformed public key bytes", var2);
      }
   }

   public vy a(PublicKey $$0) {
      this.a($$0.getEncoded());
      return this;
   }

   public ffy v() {
      iw $$0 = this.e();
      jc $$1 = this.b(jc.class);
      float $$2 = this.readFloat();
      float $$3 = this.readFloat();
      float $$4 = this.readFloat();
      boolean $$5 = this.readBoolean();
      boolean $$6 = this.readBoolean();
      return new ffy(new fgc((double)$$0.u() + (double)$$2, (double)$$0.v() + (double)$$3, (double)$$0.w() + (double)$$4), $$1, $$0, $$5, $$6);
   }

   public void a(ffy $$0) {
      iw $$1 = $$0.b();
      this.a($$1);
      this.a($$0.c());
      fgc $$2 = $$0.g();
      this.a((float)($$2.d - (double)$$1.u()));
      this.a((float)($$2.e - (double)$$1.v()));
      this.a((float)($$2.f - (double)$$1.w()));
      this.a($$0.e());
      this.a($$0.f());
   }

   public BitSet w() {
      return BitSet.valueOf(this.d());
   }

   public void a(BitSet $$0) {
      this.a($$0.toLongArray());
   }

   public BitSet e(int $$0) {
      byte[] $$1 = new byte[azz.e($$0, 8)];
      this.b($$1);
      return BitSet.valueOf($$1);
   }

   public void a(BitSet $$0, int $$1) {
      if ($$0.length() > $$1) {
         throw new EncoderException("BitSet is larger than expected size (" + $$0.length() + ">" + $$1 + ")");
      } else {
         byte[] $$2 = $$0.toByteArray();
         this.c(Arrays.copyOf($$2, azz.e($$1, 8)));
      }
   }

   public static int j(ByteBuf $$0) {
      return wx.a($$0);
   }

   public int x() {
      return j(this.d);
   }

   public static void b(ByteBuf $$0, int $$1) {
      wx.a($$0, $$1);
   }

   public void f(int $$0) {
      b(this.d, $$0);
   }

   public boolean isContiguous() {
      return this.d.isContiguous();
   }

   public int maxFastWritableBytes() {
      return this.d.maxFastWritableBytes();
   }

   public int capacity() {
      return this.d.capacity();
   }

   public vy g(int $$0) {
      this.d.capacity($$0);
      return this;
   }

   public int maxCapacity() {
      return this.d.maxCapacity();
   }

   public ByteBufAllocator alloc() {
      return this.d.alloc();
   }

   public ByteOrder order() {
      return this.d.order();
   }

   public ByteBuf order(ByteOrder $$0) {
      return this.d.order($$0);
   }

   public ByteBuf unwrap() {
      return this.d;
   }

   public boolean isDirect() {
      return this.d.isDirect();
   }

   public boolean isReadOnly() {
      return this.d.isReadOnly();
   }

   public ByteBuf asReadOnly() {
      return this.d.asReadOnly();
   }

   public int readerIndex() {
      return this.d.readerIndex();
   }

   public vy h(int $$0) {
      this.d.readerIndex($$0);
      return this;
   }

   public int writerIndex() {
      return this.d.writerIndex();
   }

   public vy i(int $$0) {
      this.d.writerIndex($$0);
      return this;
   }

   public vy a(int $$0, int $$1) {
      this.d.setIndex($$0, $$1);
      return this;
   }

   public int readableBytes() {
      return this.d.readableBytes();
   }

   public int writableBytes() {
      return this.d.writableBytes();
   }

   public int maxWritableBytes() {
      return this.d.maxWritableBytes();
   }

   public boolean isReadable() {
      return this.d.isReadable();
   }

   public boolean isReadable(int $$0) {
      return this.d.isReadable($$0);
   }

   public boolean isWritable() {
      return this.d.isWritable();
   }

   public boolean isWritable(int $$0) {
      return this.d.isWritable($$0);
   }

   public vy y() {
      this.d.clear();
      return this;
   }

   public vy z() {
      this.d.markReaderIndex();
      return this;
   }

   public vy A() {
      this.d.resetReaderIndex();
      return this;
   }

   public vy B() {
      this.d.markWriterIndex();
      return this;
   }

   public vy C() {
      this.d.resetWriterIndex();
      return this;
   }

   public vy D() {
      this.d.discardReadBytes();
      return this;
   }

   public vy E() {
      this.d.discardSomeReadBytes();
      return this;
   }

   public vy j(int $$0) {
      this.d.ensureWritable($$0);
      return this;
   }

   public int ensureWritable(int $$0, boolean $$1) {
      return this.d.ensureWritable($$0, $$1);
   }

   public boolean getBoolean(int $$0) {
      return this.d.getBoolean($$0);
   }

   public byte getByte(int $$0) {
      return this.d.getByte($$0);
   }

   public short getUnsignedByte(int $$0) {
      return this.d.getUnsignedByte($$0);
   }

   public short getShort(int $$0) {
      return this.d.getShort($$0);
   }

   public short getShortLE(int $$0) {
      return this.d.getShortLE($$0);
   }

   public int getUnsignedShort(int $$0) {
      return this.d.getUnsignedShort($$0);
   }

   public int getUnsignedShortLE(int $$0) {
      return this.d.getUnsignedShortLE($$0);
   }

   public int getMedium(int $$0) {
      return this.d.getMedium($$0);
   }

   public int getMediumLE(int $$0) {
      return this.d.getMediumLE($$0);
   }

   public int getUnsignedMedium(int $$0) {
      return this.d.getUnsignedMedium($$0);
   }

   public int getUnsignedMediumLE(int $$0) {
      return this.d.getUnsignedMediumLE($$0);
   }

   public int getInt(int $$0) {
      return this.d.getInt($$0);
   }

   public int getIntLE(int $$0) {
      return this.d.getIntLE($$0);
   }

   public long getUnsignedInt(int $$0) {
      return this.d.getUnsignedInt($$0);
   }

   public long getUnsignedIntLE(int $$0) {
      return this.d.getUnsignedIntLE($$0);
   }

   public long getLong(int $$0) {
      return this.d.getLong($$0);
   }

   public long getLongLE(int $$0) {
      return this.d.getLongLE($$0);
   }

   public char getChar(int $$0) {
      return this.d.getChar($$0);
   }

   public float getFloat(int $$0) {
      return this.d.getFloat($$0);
   }

   public double getDouble(int $$0) {
      return this.d.getDouble($$0);
   }

   public vy a(int $$0, ByteBuf $$1) {
      this.d.getBytes($$0, $$1);
      return this;
   }

   public vy a(int $$0, ByteBuf $$1, int $$2) {
      this.d.getBytes($$0, $$1, $$2);
      return this;
   }

   public vy a(int $$0, ByteBuf $$1, int $$2, int $$3) {
      this.d.getBytes($$0, $$1, $$2, $$3);
      return this;
   }

   public vy a(int $$0, byte[] $$1) {
      this.d.getBytes($$0, $$1);
      return this;
   }

   public vy a(int $$0, byte[] $$1, int $$2, int $$3) {
      this.d.getBytes($$0, $$1, $$2, $$3);
      return this;
   }

   public vy a(int $$0, ByteBuffer $$1) {
      this.d.getBytes($$0, $$1);
      return this;
   }

   public vy a(int $$0, OutputStream $$1, int $$2) throws IOException {
      this.d.getBytes($$0, $$1, $$2);
      return this;
   }

   public int getBytes(int $$0, GatheringByteChannel $$1, int $$2) throws IOException {
      return this.d.getBytes($$0, $$1, $$2);
   }

   public int getBytes(int $$0, FileChannel $$1, long $$2, int $$3) throws IOException {
      return this.d.getBytes($$0, $$1, $$2, $$3);
   }

   public CharSequence getCharSequence(int $$0, int $$1, Charset $$2) {
      return this.d.getCharSequence($$0, $$1, $$2);
   }

   public vy a(int $$0, boolean $$1) {
      this.d.setBoolean($$0, $$1);
      return this;
   }

   public vy b(int $$0, int $$1) {
      this.d.setByte($$0, $$1);
      return this;
   }

   public vy c(int $$0, int $$1) {
      this.d.setShort($$0, $$1);
      return this;
   }

   public vy d(int $$0, int $$1) {
      this.d.setShortLE($$0, $$1);
      return this;
   }

   public vy e(int $$0, int $$1) {
      this.d.setMedium($$0, $$1);
      return this;
   }

   public vy f(int $$0, int $$1) {
      this.d.setMediumLE($$0, $$1);
      return this;
   }

   public vy g(int $$0, int $$1) {
      this.d.setInt($$0, $$1);
      return this;
   }

   public vy h(int $$0, int $$1) {
      this.d.setIntLE($$0, $$1);
      return this;
   }

   public vy a(int $$0, long $$1) {
      this.d.setLong($$0, $$1);
      return this;
   }

   public vy b(int $$0, long $$1) {
      this.d.setLongLE($$0, $$1);
      return this;
   }

   public vy i(int $$0, int $$1) {
      this.d.setChar($$0, $$1);
      return this;
   }

   public vy a(int $$0, float $$1) {
      this.d.setFloat($$0, $$1);
      return this;
   }

   public vy a(int $$0, double $$1) {
      this.d.setDouble($$0, $$1);
      return this;
   }

   public vy b(int $$0, ByteBuf $$1) {
      this.d.setBytes($$0, $$1);
      return this;
   }

   public vy b(int $$0, ByteBuf $$1, int $$2) {
      this.d.setBytes($$0, $$1, $$2);
      return this;
   }

   public vy b(int $$0, ByteBuf $$1, int $$2, int $$3) {
      this.d.setBytes($$0, $$1, $$2, $$3);
      return this;
   }

   public vy b(int $$0, byte[] $$1) {
      this.d.setBytes($$0, $$1);
      return this;
   }

   public vy b(int $$0, byte[] $$1, int $$2, int $$3) {
      this.d.setBytes($$0, $$1, $$2, $$3);
      return this;
   }

   public vy b(int $$0, ByteBuffer $$1) {
      this.d.setBytes($$0, $$1);
      return this;
   }

   public int setBytes(int $$0, InputStream $$1, int $$2) throws IOException {
      return this.d.setBytes($$0, $$1, $$2);
   }

   public int setBytes(int $$0, ScatteringByteChannel $$1, int $$2) throws IOException {
      return this.d.setBytes($$0, $$1, $$2);
   }

   public int setBytes(int $$0, FileChannel $$1, long $$2, int $$3) throws IOException {
      return this.d.setBytes($$0, $$1, $$2, $$3);
   }

   public vy j(int $$0, int $$1) {
      this.d.setZero($$0, $$1);
      return this;
   }

   public int setCharSequence(int $$0, CharSequence $$1, Charset $$2) {
      return this.d.setCharSequence($$0, $$1, $$2);
   }

   public boolean readBoolean() {
      return this.d.readBoolean();
   }

   public byte readByte() {
      return this.d.readByte();
   }

   public short readUnsignedByte() {
      return this.d.readUnsignedByte();
   }

   public short readShort() {
      return this.d.readShort();
   }

   public short readShortLE() {
      return this.d.readShortLE();
   }

   public int readUnsignedShort() {
      return this.d.readUnsignedShort();
   }

   public int readUnsignedShortLE() {
      return this.d.readUnsignedShortLE();
   }

   public int readMedium() {
      return this.d.readMedium();
   }

   public int readMediumLE() {
      return this.d.readMediumLE();
   }

   public int readUnsignedMedium() {
      return this.d.readUnsignedMedium();
   }

   public int readUnsignedMediumLE() {
      return this.d.readUnsignedMediumLE();
   }

   public int readInt() {
      return this.d.readInt();
   }

   public int readIntLE() {
      return this.d.readIntLE();
   }

   public long readUnsignedInt() {
      return this.d.readUnsignedInt();
   }

   public long readUnsignedIntLE() {
      return this.d.readUnsignedIntLE();
   }

   public long readLong() {
      return this.d.readLong();
   }

   public long readLongLE() {
      return this.d.readLongLE();
   }

   public char readChar() {
      return this.d.readChar();
   }

   public float readFloat() {
      return this.d.readFloat();
   }

   public double readDouble() {
      return this.d.readDouble();
   }

   public ByteBuf readBytes(int $$0) {
      return this.d.readBytes($$0);
   }

   public ByteBuf readSlice(int $$0) {
      return this.d.readSlice($$0);
   }

   public ByteBuf readRetainedSlice(int $$0) {
      return this.d.readRetainedSlice($$0);
   }

   public vy k(ByteBuf $$0) {
      this.d.readBytes($$0);
      return this;
   }

   public vy c(ByteBuf $$0, int $$1) {
      this.d.readBytes($$0, $$1);
      return this;
   }

   public vy a(ByteBuf $$0, int $$1, int $$2) {
      this.d.readBytes($$0, $$1, $$2);
      return this;
   }

   public vy b(byte[] $$0) {
      this.d.readBytes($$0);
      return this;
   }

   public vy a(byte[] $$0, int $$1, int $$2) {
      this.d.readBytes($$0, $$1, $$2);
      return this;
   }

   public vy a(ByteBuffer $$0) {
      this.d.readBytes($$0);
      return this;
   }

   public vy a(OutputStream $$0, int $$1) throws IOException {
      this.d.readBytes($$0, $$1);
      return this;
   }

   public int readBytes(GatheringByteChannel $$0, int $$1) throws IOException {
      return this.d.readBytes($$0, $$1);
   }

   public CharSequence readCharSequence(int $$0, Charset $$1) {
      return this.d.readCharSequence($$0, $$1);
   }

   public int readBytes(FileChannel $$0, long $$1, int $$2) throws IOException {
      return this.d.readBytes($$0, $$1, $$2);
   }

   public vy k(int $$0) {
      this.d.skipBytes($$0);
      return this;
   }

   public vy a(boolean $$0) {
      this.d.writeBoolean($$0);
      return this;
   }

   public vy l(int $$0) {
      this.d.writeByte($$0);
      return this;
   }

   public vy m(int $$0) {
      this.d.writeShort($$0);
      return this;
   }

   public vy n(int $$0) {
      this.d.writeShortLE($$0);
      return this;
   }

   public vy o(int $$0) {
      this.d.writeMedium($$0);
      return this;
   }

   public vy p(int $$0) {
      this.d.writeMediumLE($$0);
      return this;
   }

   public vy q(int $$0) {
      this.d.writeInt($$0);
      return this;
   }

   public vy r(int $$0) {
      this.d.writeIntLE($$0);
      return this;
   }

   public vy b(long $$0) {
      this.d.writeLong($$0);
      return this;
   }

   public vy c(long $$0) {
      this.d.writeLongLE($$0);
      return this;
   }

   public vy s(int $$0) {
      this.d.writeChar($$0);
      return this;
   }

   public vy a(float $$0) {
      this.d.writeFloat($$0);
      return this;
   }

   public vy a(double $$0) {
      this.d.writeDouble($$0);
      return this;
   }

   public vy l(ByteBuf $$0) {
      this.d.writeBytes($$0);
      return this;
   }

   public vy d(ByteBuf $$0, int $$1) {
      this.d.writeBytes($$0, $$1);
      return this;
   }

   public vy b(ByteBuf $$0, int $$1, int $$2) {
      this.d.writeBytes($$0, $$1, $$2);
      return this;
   }

   public vy c(byte[] $$0) {
      this.d.writeBytes($$0);
      return this;
   }

   public vy b(byte[] $$0, int $$1, int $$2) {
      this.d.writeBytes($$0, $$1, $$2);
      return this;
   }

   public vy b(ByteBuffer $$0) {
      this.d.writeBytes($$0);
      return this;
   }

   public int writeBytes(InputStream $$0, int $$1) throws IOException {
      return this.d.writeBytes($$0, $$1);
   }

   public int writeBytes(ScatteringByteChannel $$0, int $$1) throws IOException {
      return this.d.writeBytes($$0, $$1);
   }

   public int writeBytes(FileChannel $$0, long $$1, int $$2) throws IOException {
      return this.d.writeBytes($$0, $$1, $$2);
   }

   public vy t(int $$0) {
      this.d.writeZero($$0);
      return this;
   }

   public int writeCharSequence(CharSequence $$0, Charset $$1) {
      return this.d.writeCharSequence($$0, $$1);
   }

   public int indexOf(int $$0, int $$1, byte $$2) {
      return this.d.indexOf($$0, $$1, $$2);
   }

   public int bytesBefore(byte $$0) {
      return this.d.bytesBefore($$0);
   }

   public int bytesBefore(int $$0, byte $$1) {
      return this.d.bytesBefore($$0, $$1);
   }

   public int bytesBefore(int $$0, int $$1, byte $$2) {
      return this.d.bytesBefore($$0, $$1, $$2);
   }

   public int forEachByte(ByteProcessor $$0) {
      return this.d.forEachByte($$0);
   }

   public int forEachByte(int $$0, int $$1, ByteProcessor $$2) {
      return this.d.forEachByte($$0, $$1, $$2);
   }

   public int forEachByteDesc(ByteProcessor $$0) {
      return this.d.forEachByteDesc($$0);
   }

   public int forEachByteDesc(int $$0, int $$1, ByteProcessor $$2) {
      return this.d.forEachByteDesc($$0, $$1, $$2);
   }

   public ByteBuf copy() {
      return this.d.copy();
   }

   public ByteBuf copy(int $$0, int $$1) {
      return this.d.copy($$0, $$1);
   }

   public ByteBuf slice() {
      return this.d.slice();
   }

   public ByteBuf retainedSlice() {
      return this.d.retainedSlice();
   }

   public ByteBuf slice(int $$0, int $$1) {
      return this.d.slice($$0, $$1);
   }

   public ByteBuf retainedSlice(int $$0, int $$1) {
      return this.d.retainedSlice($$0, $$1);
   }

   public ByteBuf duplicate() {
      return this.d.duplicate();
   }

   public ByteBuf retainedDuplicate() {
      return this.d.retainedDuplicate();
   }

   public int nioBufferCount() {
      return this.d.nioBufferCount();
   }

   public ByteBuffer nioBuffer() {
      return this.d.nioBuffer();
   }

   public ByteBuffer nioBuffer(int $$0, int $$1) {
      return this.d.nioBuffer($$0, $$1);
   }

   public ByteBuffer internalNioBuffer(int $$0, int $$1) {
      return this.d.internalNioBuffer($$0, $$1);
   }

   public ByteBuffer[] nioBuffers() {
      return this.d.nioBuffers();
   }

   public ByteBuffer[] nioBuffers(int $$0, int $$1) {
      return this.d.nioBuffers($$0, $$1);
   }

   public boolean hasArray() {
      return this.d.hasArray();
   }

   public byte[] array() {
      return this.d.array();
   }

   public int arrayOffset() {
      return this.d.arrayOffset();
   }

   public boolean hasMemoryAddress() {
      return this.d.hasMemoryAddress();
   }

   public long memoryAddress() {
      return this.d.memoryAddress();
   }

   public String toString(Charset $$0) {
      return this.d.toString($$0);
   }

   public String toString(int $$0, int $$1, Charset $$2) {
      return this.d.toString($$0, $$1, $$2);
   }

   public int hashCode() {
      return this.d.hashCode();
   }

   public boolean equals(Object $$0) {
      return this.d.equals($$0);
   }

   public int compareTo(ByteBuf $$0) {
      return this.d.compareTo($$0);
   }

   public String toString() {
      return this.d.toString();
   }

   public vy u(int $$0) {
      this.d.retain($$0);
      return this;
   }

   public vy F() {
      this.d.retain();
      return this;
   }

   public vy G() {
      this.d.touch();
      return this;
   }

   public vy a(Object $$0) {
      this.d.touch($$0);
      return this;
   }

   public int refCnt() {
      return this.d.refCnt();
   }

   public boolean release() {
      return this.d.release();
   }

   public boolean release(int $$0) {
      return this.d.release($$0);
   }
}
