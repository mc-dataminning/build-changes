import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.datafixers.util.Either;
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
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class uj extends ByteBuf {
   public static final int a = 2097152;
   private final ByteBuf d;
   public static final short b = 32767;
   public static final int c = 262144;
   private static final int e = 256;
   private static final int f = 256;
   private static final int g = 512;
   private static final Gson h = new Gson();

   public uj(ByteBuf $$0) {
      this.d = $$0;
   }

   @Deprecated
   public <T> T a(DynamicOps<tl> $$0, Codec<T> $$1) {
      return this.a($$0, $$1, sx.a());
   }

   @Deprecated
   public <T> T a(DynamicOps<tl> $$0, Codec<T> $$1, sx $$2) {
      tl $$3 = this.a($$2);
      return ac.a($$1.parse($$0, $$3), $$1x -> new DecoderException("Failed to decode: " + $$1x + " " + $$3));
   }

   @Deprecated
   public <T> uj a(DynamicOps<tl> $$0, Codec<T> $$1, T $$2) {
      tl $$3 = ac.a($$1.encodeStart($$0, $$2), $$1x -> new EncoderException("Failed to encode: " + $$1x + " " + $$2));
      this.a($$3);
      return this;
   }

   public <T> T a(Codec<T> $$0) {
      JsonElement $$1 = auf.a(h, this.s(), JsonElement.class);
      DataResult<T> $$2 = $$0.parse(JsonOps.INSTANCE, $$1);
      return ac.a($$2, $$0x -> new DecoderException("Failed to decode json: " + $$0x));
   }

   public <T> void a(Codec<T> $$0, T $$1) {
      DataResult<JsonElement> $$2 = $$0.encodeStart(JsonOps.INSTANCE, $$1);
      this.a(h.toJson(ac.a($$2, $$1x -> new EncoderException("Failed to encode: " + $$1x + " " + $$1))));
   }

   public <T> void a(im<T> $$0, T $$1) {
      int $$2 = $$0.a($$1);
      if ($$2 == -1) {
         throw new IllegalArgumentException("Can't find id for '" + $$1 + "' in map " + $$0);
      } else {
         this.c($$2);
      }
   }

   public <T> void a(im<ih<T>> $$0, ih<T> $$1, uj.b<T> $$2) {
      switch ($$1.f()) {
         case a:
            int $$3 = $$0.a($$1);
            if ($$3 == -1) {
               throw new IllegalArgumentException("Can't find id for '" + $$1.a() + "' in map " + $$0);
            }

            this.c($$3 + 1);
            break;
         case b:
            this.c(0);
            $$2.accept(this, $$1.a());
      }
   }

   @Nullable
   public <T> T a(im<T> $$0) {
      int $$1 = this.n();
      return $$0.a($$1);
   }

   public <T> ih<T> a(im<ih<T>> $$0, uj.a<T> $$1) {
      int $$2 = this.n();
      if ($$2 == 0) {
         return ih.a($$1.apply(this));
      } else {
         ih<T> $$3 = $$0.a($$2 - 1);
         if ($$3 == null) {
            throw new IllegalArgumentException("Can't find element with id " + $$2);
         } else {
            return $$3;
         }
      }
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

   public <T, C extends Collection<T>> C a(IntFunction<C> $$0, uj.a<T> $$1) {
      int $$2 = this.n();
      C $$3 = (C)$$0.apply($$2);

      for (int $$4 = 0; $$4 < $$2; $$4++) {
         $$3.add($$1.apply(this));
      }

      return $$3;
   }

   public <T> void a(Collection<T> $$0, uj.b<T> $$1) {
      this.c($$0.size());

      for (T $$2 : $$0) {
         $$1.accept(this, $$2);
      }
   }

   public <T> List<T> a(uj.a<T> $$0) {
      return this.a(Lists::newArrayListWithCapacity, $$0);
   }

   public IntList a() {
      int $$0 = this.n();
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         $$1.add(this.n());
      }

      return $$1;
   }

   public void a(IntList $$0) {
      this.c($$0.size());
      $$0.forEach(this::c);
   }

   public <K, V, M extends Map<K, V>> M a(IntFunction<M> $$0, uj.a<K> $$1, uj.a<V> $$2) {
      int $$3 = this.n();
      M $$4 = (M)$$0.apply($$3);

      for (int $$5 = 0; $$5 < $$3; $$5++) {
         K $$6 = $$1.apply(this);
         V $$7 = $$2.apply(this);
         $$4.put($$6, $$7);
      }

      return $$4;
   }

   public <K, V> Map<K, V> a(uj.a<K> $$0, uj.a<V> $$1) {
      return this.a(Maps::newHashMapWithExpectedSize, $$0, $$1);
   }

   public <K, V> void a(Map<K, V> $$0, uj.b<K> $$1, uj.b<V> $$2) {
      this.c($$0.size());
      $$0.forEach(($$2x, $$3) -> {
         $$1.accept(this, (K)$$2x);
         $$2.accept(this, (V)$$3);
      });
   }

   public void a(Consumer<uj> $$0) {
      int $$1 = this.n();

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

   public <T> void a(Optional<T> $$0, uj.b<T> $$1) {
      if ($$0.isPresent()) {
         this.a(true);
         $$1.accept(this, $$0.get());
      } else {
         this.a(false);
      }
   }

   public <T> Optional<T> b(uj.a<T> $$0) {
      return this.readBoolean() ? Optional.of($$0.apply(this)) : Optional.empty();
   }

   @Nullable
   public <T> T c(uj.a<T> $$0) {
      return this.readBoolean() ? $$0.apply(this) : null;
   }

   public <T> void a(@Nullable T $$0, uj.b<T> $$1) {
      if ($$0 != null) {
         this.a(true);
         $$1.accept(this, $$0);
      } else {
         this.a(false);
      }
   }

   public <L, R> void a(Either<L, R> $$0, uj.b<L> $$1, uj.b<R> $$2) {
      $$0.ifLeft($$1x -> {
         this.a(true);
         $$1.accept(this, (L)$$1x);
      }).ifRight($$1x -> {
         this.a(false);
         $$2.accept(this, (R)$$1x);
      });
   }

   public <L, R> Either<L, R> b(uj.a<L> $$0, uj.a<R> $$1) {
      return this.readBoolean() ? Either.left($$0.apply(this)) : Either.right($$1.apply(this));
   }

   public byte[] b() {
      return this.a(this.readableBytes());
   }

   public uj a(byte[] $$0) {
      this.c($$0.length);
      this.c($$0);
      return this;
   }

   public byte[] a(int $$0) {
      int $$1 = this.n();
      if ($$1 > $$0) {
         throw new DecoderException("ByteArray with size " + $$1 + " is bigger than allowed " + $$0);
      } else {
         byte[] $$2 = new byte[$$1];
         this.b($$2);
         return $$2;
      }
   }

   public uj a(int[] $$0) {
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
      int $$1 = this.n();
      if ($$1 > $$0) {
         throw new DecoderException("VarIntArray with size " + $$1 + " is bigger than allowed " + $$0);
      } else {
         int[] $$2 = new int[$$1];

         for (int $$3 = 0; $$3 < $$2.length; $$3++) {
            $$2[$$3] = this.n();
         }

         return $$2;
      }
   }

   public uj a(long[] $$0) {
      this.c($$0.length);

      for (long $$1 : $$0) {
         this.b($$1);
      }

      return this;
   }

   public long[] d() {
      return this.b(null);
   }

   public long[] b(@Nullable long[] $$0) {
      return this.a($$0, this.readableBytes() / 8);
   }

   public long[] a(@Nullable long[] $$0, int $$1) {
      int $$2 = this.n();
      if ($$0 == null || $$0.length != $$2) {
         if ($$2 > $$1) {
            throw new DecoderException("LongArray with size " + $$2 + " is bigger than allowed " + $$1);
         }

         $$0 = new long[$$2];
      }

      for (int $$3 = 0; $$3 < $$0.length; $$3++) {
         $$0[$$3] = this.readLong();
      }

      return $$0;
   }

   public hx e() {
      return hx.d(this.readLong());
   }

   public uj a(hx $$0) {
      this.b($$0.a());
      return this;
   }

   public cte f() {
      return new cte(this.readLong());
   }

   public uj a(cte $$0) {
      this.b($$0.a());
      return this;
   }

   public iz g() {
      return iz.a(this.readLong());
   }

   public uj a(iz $$0) {
      this.b($$0.s());
      return this;
   }

   public ig h() {
      ahg<ctx> $$0 = this.a(ke.aM);
      hx $$1 = this.e();
      return ig.a($$0, $$1);
   }

   public void a(ig $$0) {
      this.b($$0.a());
      this.a($$0.b());
   }

   public Vector3f i() {
      return new Vector3f(this.readFloat(), this.readFloat(), this.readFloat());
   }

   public void a(Vector3f $$0) {
      this.a($$0.x());
      this.a($$0.y());
      this.a($$0.z());
   }

   public Quaternionf j() {
      return new Quaternionf(this.readFloat(), this.readFloat(), this.readFloat(), this.readFloat());
   }

   public void a(Quaternionf $$0) {
      this.a($$0.x);
      this.a($$0.y);
      this.a($$0.z);
      this.a($$0.w);
   }

   public emc k() {
      return new emc(this.readDouble(), this.readDouble(), this.readDouble());
   }

   public void a(emc $$0) {
      this.a($$0.a());
      this.a($$0.b());
      this.a($$0.c());
   }

   public vg l() {
      return this.a(tc.a, vi.a, sx.a(2097152L));
   }

   public vg m() {
      return this.a(tc.a, vi.a);
   }

   public uj a(vg $$0) {
      return this.a(tc.a, vi.a, $$0);
   }

   public <T extends Enum<T>> T b(Class<T> $$0) {
      return $$0.getEnumConstants()[this.n()];
   }

   public uj a(Enum<?> $$0) {
      return this.c($$0.ordinal());
   }

   public <T> T a(IntFunction<T> $$0) {
      int $$1 = this.n();
      return $$0.apply($$1);
   }

   public <T> uj a(ToIntFunction<T> $$0, T $$1) {
      int $$2 = $$0.applyAsInt($$1);
      return this.c($$2);
   }

   public int n() {
      return ux.a(this.d);
   }

   public long o() {
      return uy.a(this.d);
   }

   public uj a(UUID $$0) {
      this.b($$0.getMostSignificantBits());
      this.b($$0.getLeastSignificantBits());
      return this;
   }

   public UUID p() {
      return new UUID(this.readLong(), this.readLong());
   }

   public uj c(int $$0) {
      ux.a(this.d, $$0);
      return this;
   }

   public uj a(long $$0) {
      uy.a(this.d, $$0);
      return this;
   }

   public uj a(@Nullable tl $$0) {
      if ($$0 == null) {
         $$0 = sq.b;
      }

      try {
         tb.a($$0, new ByteBufOutputStream(this));
         return this;
      } catch (IOException var3) {
         throw new EncoderException(var3);
      }
   }

   @Nullable
   public so q() {
      tl $$0 = this.a(sx.a(2097152L));
      if ($$0 != null && !($$0 instanceof so)) {
         throw new DecoderException("Not a compound tag: " + $$0);
      } else {
         return (so)$$0;
      }
   }

   @Nullable
   public tl a(sx $$0) {
      try {
         tl $$1 = tb.b(new ByteBufInputStream(this), $$0);
         return $$1.b() == 0 ? null : $$1;
      } catch (IOException var3) {
         throw new EncoderException(var3);
      }
   }

   public uj a(cng $$0) {
      if ($$0.b()) {
         this.a(false);
      } else {
         this.a(true);
         cnb $$1 = $$0.d();
         this.a(kd.h, $$1);
         this.k($$0.L());
         so $$2 = null;
         if ($$1.n() || $$1.q()) {
            $$2 = $$0.v();
         }

         this.a((tl)$$2);
      }

      return this;
   }

   public cng r() {
      if (!this.readBoolean()) {
         return cng.f;
      } else {
         cnb $$0 = this.a(kd.h);
         int $$1 = this.readByte();
         cng $$2 = new cng($$0, $$1);
         $$2.c(this.q());
         return $$2;
      }
   }

   public String s() {
      return this.d(32767);
   }

   public String d(int $$0) {
      return uw.a(this.d, $$0);
   }

   public uj a(String $$0) {
      return this.a($$0, 32767);
   }

   public uj a(String $$0, int $$1) {
      uw.a(this.d, $$0, $$1);
      return this;
   }

   public ahh t() {
      return new ahh(this.d(32767));
   }

   public uj a(ahh $$0) {
      this.a($$0.toString());
      return this;
   }

   public <T> ahg<T> a(ahg<? extends it<T>> $$0) {
      ahh $$1 = this.t();
      return ahg.a($$0, $$1);
   }

   public void b(ahg<?> $$0) {
      this.a($$0.a());
   }

   public <T> ahg<? extends it<T>> u() {
      ahh $$0 = this.t();
      return ahg.a($$0);
   }

   public Date v() {
      return new Date(this.readLong());
   }

   public uj a(Date $$0) {
      this.b($$0.getTime());
      return this;
   }

   public Instant w() {
      return Instant.ofEpochMilli(this.readLong());
   }

   public void a(Instant $$0) {
      this.b($$0.toEpochMilli());
   }

   public PublicKey x() {
      try {
         return atn.a(this.a(512));
      } catch (ato var2) {
         throw new DecoderException("Malformed public key bytes", var2);
      }
   }

   public uj a(PublicKey $$0) {
      this.a($$0.getEncoded());
      return this;
   }

   public ely y() {
      hx $$0 = this.e();
      ic $$1 = this.b(ic.class);
      float $$2 = this.readFloat();
      float $$3 = this.readFloat();
      float $$4 = this.readFloat();
      boolean $$5 = this.readBoolean();
      return new ely(new emc((double)$$0.u() + (double)$$2, (double)$$0.v() + (double)$$3, (double)$$0.w() + (double)$$4), $$1, $$0, $$5);
   }

   public void a(ely $$0) {
      hx $$1 = $$0.a();
      this.a($$1);
      this.a($$0.b());
      emc $$2 = $$0.e();
      this.a((float)($$2.c - (double)$$1.u()));
      this.a((float)($$2.d - (double)$$1.v()));
      this.a((float)($$2.e - (double)$$1.w()));
      this.a($$0.d());
   }

   public BitSet z() {
      return BitSet.valueOf(this.d());
   }

   public void a(BitSet $$0) {
      this.a($$0.toLongArray());
   }

   public BitSet e(int $$0) {
      byte[] $$1 = new byte[aup.e($$0, 8)];
      this.b($$1);
      return BitSet.valueOf($$1);
   }

   public void a(BitSet $$0, int $$1) {
      if ($$0.length() > $$1) {
         throw new EncoderException("BitSet is larger than expected size (" + $$0.length() + ">" + $$1 + ")");
      } else {
         byte[] $$2 = $$0.toByteArray();
         this.c(Arrays.copyOf($$2, aup.e($$1, 8)));
      }
   }

   public GameProfile A() {
      UUID $$0 = this.p();
      String $$1 = this.d(16);
      GameProfile $$2 = new GameProfile($$0, $$1);
      $$2.getProperties().putAll(this.B());
      return $$2;
   }

   public void a(GameProfile $$0) {
      this.a($$0.getId());
      this.a($$0.getName());
      this.a($$0.getProperties());
   }

   public PropertyMap B() {
      PropertyMap $$0 = new PropertyMap();
      this.a((Consumer<uj>)($$1 -> {
         Property $$2 = this.C();
         $$0.put($$2.name(), $$2);
      }));
      return $$0;
   }

   public void a(PropertyMap $$0) {
      this.a($$0.values(), uj::a);
   }

   public Property C() {
      String $$0 = this.s();
      String $$1 = this.s();
      String $$2 = this.c(uj::s);
      return new Property($$0, $$1, $$2);
   }

   public void a(Property $$0) {
      this.a($$0.name());
      this.a($$0.value());
      this.a($$0.signature(), uj::a);
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

   public uj f(int $$0) {
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

   public uj g(int $$0) {
      this.d.readerIndex($$0);
      return this;
   }

   public int writerIndex() {
      return this.d.writerIndex();
   }

   public uj h(int $$0) {
      this.d.writerIndex($$0);
      return this;
   }

   public uj a(int $$0, int $$1) {
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

   public uj D() {
      this.d.clear();
      return this;
   }

   public uj E() {
      this.d.markReaderIndex();
      return this;
   }

   public uj F() {
      this.d.resetReaderIndex();
      return this;
   }

   public uj G() {
      this.d.markWriterIndex();
      return this;
   }

   public uj H() {
      this.d.resetWriterIndex();
      return this;
   }

   public uj I() {
      this.d.discardReadBytes();
      return this;
   }

   public uj J() {
      this.d.discardSomeReadBytes();
      return this;
   }

   public uj i(int $$0) {
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

   public uj a(int $$0, ByteBuf $$1) {
      this.d.getBytes($$0, $$1);
      return this;
   }

   public uj a(int $$0, ByteBuf $$1, int $$2) {
      this.d.getBytes($$0, $$1, $$2);
      return this;
   }

   public uj a(int $$0, ByteBuf $$1, int $$2, int $$3) {
      this.d.getBytes($$0, $$1, $$2, $$3);
      return this;
   }

   public uj a(int $$0, byte[] $$1) {
      this.d.getBytes($$0, $$1);
      return this;
   }

   public uj a(int $$0, byte[] $$1, int $$2, int $$3) {
      this.d.getBytes($$0, $$1, $$2, $$3);
      return this;
   }

   public uj a(int $$0, ByteBuffer $$1) {
      this.d.getBytes($$0, $$1);
      return this;
   }

   public uj a(int $$0, OutputStream $$1, int $$2) throws IOException {
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

   public uj a(int $$0, boolean $$1) {
      this.d.setBoolean($$0, $$1);
      return this;
   }

   public uj b(int $$0, int $$1) {
      this.d.setByte($$0, $$1);
      return this;
   }

   public uj c(int $$0, int $$1) {
      this.d.setShort($$0, $$1);
      return this;
   }

   public uj d(int $$0, int $$1) {
      this.d.setShortLE($$0, $$1);
      return this;
   }

   public uj e(int $$0, int $$1) {
      this.d.setMedium($$0, $$1);
      return this;
   }

   public uj f(int $$0, int $$1) {
      this.d.setMediumLE($$0, $$1);
      return this;
   }

   public uj g(int $$0, int $$1) {
      this.d.setInt($$0, $$1);
      return this;
   }

   public uj h(int $$0, int $$1) {
      this.d.setIntLE($$0, $$1);
      return this;
   }

   public uj a(int $$0, long $$1) {
      this.d.setLong($$0, $$1);
      return this;
   }

   public uj b(int $$0, long $$1) {
      this.d.setLongLE($$0, $$1);
      return this;
   }

   public uj i(int $$0, int $$1) {
      this.d.setChar($$0, $$1);
      return this;
   }

   public uj a(int $$0, float $$1) {
      this.d.setFloat($$0, $$1);
      return this;
   }

   public uj a(int $$0, double $$1) {
      this.d.setDouble($$0, $$1);
      return this;
   }

   public uj b(int $$0, ByteBuf $$1) {
      this.d.setBytes($$0, $$1);
      return this;
   }

   public uj b(int $$0, ByteBuf $$1, int $$2) {
      this.d.setBytes($$0, $$1, $$2);
      return this;
   }

   public uj b(int $$0, ByteBuf $$1, int $$2, int $$3) {
      this.d.setBytes($$0, $$1, $$2, $$3);
      return this;
   }

   public uj b(int $$0, byte[] $$1) {
      this.d.setBytes($$0, $$1);
      return this;
   }

   public uj b(int $$0, byte[] $$1, int $$2, int $$3) {
      this.d.setBytes($$0, $$1, $$2, $$3);
      return this;
   }

   public uj b(int $$0, ByteBuffer $$1) {
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

   public uj j(int $$0, int $$1) {
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

   public uj a(ByteBuf $$0) {
      this.d.readBytes($$0);
      return this;
   }

   public uj a(ByteBuf $$0, int $$1) {
      this.d.readBytes($$0, $$1);
      return this;
   }

   public uj a(ByteBuf $$0, int $$1, int $$2) {
      this.d.readBytes($$0, $$1, $$2);
      return this;
   }

   public uj b(byte[] $$0) {
      this.d.readBytes($$0);
      return this;
   }

   public uj a(byte[] $$0, int $$1, int $$2) {
      this.d.readBytes($$0, $$1, $$2);
      return this;
   }

   public uj a(ByteBuffer $$0) {
      this.d.readBytes($$0);
      return this;
   }

   public uj a(OutputStream $$0, int $$1) throws IOException {
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

   public uj j(int $$0) {
      this.d.skipBytes($$0);
      return this;
   }

   public uj a(boolean $$0) {
      this.d.writeBoolean($$0);
      return this;
   }

   public uj k(int $$0) {
      this.d.writeByte($$0);
      return this;
   }

   public uj l(int $$0) {
      this.d.writeShort($$0);
      return this;
   }

   public uj m(int $$0) {
      this.d.writeShortLE($$0);
      return this;
   }

   public uj n(int $$0) {
      this.d.writeMedium($$0);
      return this;
   }

   public uj o(int $$0) {
      this.d.writeMediumLE($$0);
      return this;
   }

   public uj p(int $$0) {
      this.d.writeInt($$0);
      return this;
   }

   public uj q(int $$0) {
      this.d.writeIntLE($$0);
      return this;
   }

   public uj b(long $$0) {
      this.d.writeLong($$0);
      return this;
   }

   public uj c(long $$0) {
      this.d.writeLongLE($$0);
      return this;
   }

   public uj r(int $$0) {
      this.d.writeChar($$0);
      return this;
   }

   public uj a(float $$0) {
      this.d.writeFloat($$0);
      return this;
   }

   public uj a(double $$0) {
      this.d.writeDouble($$0);
      return this;
   }

   public uj b(ByteBuf $$0) {
      this.d.writeBytes($$0);
      return this;
   }

   public uj b(ByteBuf $$0, int $$1) {
      this.d.writeBytes($$0, $$1);
      return this;
   }

   public uj b(ByteBuf $$0, int $$1, int $$2) {
      this.d.writeBytes($$0, $$1, $$2);
      return this;
   }

   public uj c(byte[] $$0) {
      this.d.writeBytes($$0);
      return this;
   }

   public uj b(byte[] $$0, int $$1, int $$2) {
      this.d.writeBytes($$0, $$1, $$2);
      return this;
   }

   public uj b(ByteBuffer $$0) {
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

   public uj s(int $$0) {
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

   public uj t(int $$0) {
      this.d.retain($$0);
      return this;
   }

   public uj K() {
      this.d.retain();
      return this;
   }

   public uj L() {
      this.d.touch();
      return this;
   }

   public uj a(Object $$0) {
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

   @FunctionalInterface
   public interface a<T> extends Function<uj, T> {
      default uj.a<Optional<T>> asOptional() {
         return $$0 -> $$0.b(this);
      }
   }

   @FunctionalInterface
   public interface b<T> extends BiConsumer<uj, T> {
      default uj.b<Optional<T>> asOptional() {
         return ($$0, $$1) -> $$0.a($$1, this);
      }
   }
}
