import com.google.common.annotations.VisibleForTesting;
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
import java.nio.charset.StandardCharsets;
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
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class sf extends ByteBuf {
   private static final int d = 5;
   private static final int e = 10;
   public static final int a = 2097152;
   private final ByteBuf f;
   public static final short b = 32767;
   public static final int c = 262144;
   private static final int g = 256;
   private static final int h = 256;
   private static final int i = 512;
   private static final Gson j = new Gson();

   public sf(ByteBuf $$0) {
      this.f = $$0;
   }

   public static int a(int $$0) {
      for (int $$1 = 1; $$1 < 5; $$1++) {
         if (($$0 & -1 << $$1 * 7) == 0) {
            return $$1;
         }
      }

      return 5;
   }

   public static int a(long $$0) {
      for (int $$1 = 1; $$1 < 10; $$1++) {
         if (($$0 & -1L << $$1 * 7) == 0L) {
            return $$1;
         }
      }

      return 10;
   }

   @Deprecated
   public <T> T a(DynamicOps<rk> $$0, Codec<T> $$1) {
      qr $$2 = this.q();
      return ac.a($$1.parse($$0, $$2), $$1x -> new DecoderException("Failed to decode: " + $$1x + " " + $$2));
   }

   @Deprecated
   public <T> void a(DynamicOps<rk> $$0, Codec<T> $$1, T $$2) {
      rk $$3 = ac.a($$1.encodeStart($$0, $$2), $$1x -> new EncoderException("Failed to encode: " + $$1x + " " + $$2));
      this.a((qr)$$3);
   }

   public <T> T a(Codec<T> $$0) {
      JsonElement $$1 = aor.a(j, this.s(), JsonElement.class);
      DataResult<T> $$2 = $$0.parse(JsonOps.INSTANCE, $$1);
      return ac.a($$2, $$0x -> new DecoderException("Failed to decode json: " + $$0x));
   }

   public <T> void a(Codec<T> $$0, T $$1) {
      DataResult<JsonElement> $$2 = $$0.encodeStart(JsonOps.INSTANCE, $$1);
      this.a(j.toJson(ac.a($$2, $$1x -> new EncoderException("Failed to encode: " + $$1x + " " + $$1))));
   }

   public <T> void a(hj<T> $$0, T $$1) {
      int $$2 = $$0.a($$1);
      if ($$2 == -1) {
         throw new IllegalArgumentException("Can't find id for '" + $$1 + "' in map " + $$0);
      } else {
         this.d($$2);
      }
   }

   public <T> void a(hj<he<T>> $$0, he<T> $$1, sf.b<T> $$2) {
      switch ($$1.f()) {
         case a:
            int $$3 = $$0.a($$1);
            if ($$3 == -1) {
               throw new IllegalArgumentException("Can't find id for '" + $$1.a() + "' in map " + $$0);
            }

            this.d($$3 + 1);
            break;
         case b:
            this.d(0);
            $$2.accept(this, $$1.a());
      }
   }

   @Nullable
   public <T> T a(hj<T> $$0) {
      int $$1 = this.m();
      return $$0.a($$1);
   }

   public <T> he<T> a(hj<he<T>> $$0, sf.a<T> $$1) {
      int $$2 = this.m();
      if ($$2 == 0) {
         return he.a($$1.apply(this));
      } else {
         he<T> $$3 = $$0.a($$2 - 1);
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

   public <T, C extends Collection<T>> C a(IntFunction<C> $$0, sf.a<T> $$1) {
      int $$2 = this.m();
      C $$3 = (C)$$0.apply($$2);

      for (int $$4 = 0; $$4 < $$2; $$4++) {
         $$3.add($$1.apply(this));
      }

      return $$3;
   }

   public <T> void a(Collection<T> $$0, sf.b<T> $$1) {
      this.d($$0.size());

      for (T $$2 : $$0) {
         $$1.accept(this, $$2);
      }
   }

   public <T> List<T> a(sf.a<T> $$0) {
      return this.a(Lists::newArrayListWithCapacity, $$0);
   }

   public IntList a() {
      int $$0 = this.m();
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         $$1.add(this.m());
      }

      return $$1;
   }

   public void a(IntList $$0) {
      this.d($$0.size());
      $$0.forEach(this::d);
   }

   public <K, V, M extends Map<K, V>> M a(IntFunction<M> $$0, sf.a<K> $$1, sf.a<V> $$2) {
      int $$3 = this.m();
      M $$4 = (M)$$0.apply($$3);

      for (int $$5 = 0; $$5 < $$3; $$5++) {
         K $$6 = $$1.apply(this);
         V $$7 = $$2.apply(this);
         $$4.put($$6, $$7);
      }

      return $$4;
   }

   public <K, V> Map<K, V> a(sf.a<K> $$0, sf.a<V> $$1) {
      return this.a(Maps::newHashMapWithExpectedSize, $$0, $$1);
   }

   public <K, V> void a(Map<K, V> $$0, sf.b<K> $$1, sf.b<V> $$2) {
      this.d($$0.size());
      $$0.forEach(($$2x, $$3) -> {
         $$1.accept(this, (K)$$2x);
         $$2.accept(this, (V)$$3);
      });
   }

   public void a(Consumer<sf> $$0) {
      int $$1 = this.m();

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
      BitSet $$2 = this.f($$1.length);
      EnumSet<E> $$3 = EnumSet.noneOf($$0);

      for (int $$4 = 0; $$4 < $$1.length; $$4++) {
         if ($$2.get($$4)) {
            $$3.add($$1[$$4]);
         }
      }

      return $$3;
   }

   public <T> void a(Optional<T> $$0, sf.b<T> $$1) {
      if ($$0.isPresent()) {
         this.writeBoolean(true);
         $$1.accept(this, $$0.get());
      } else {
         this.writeBoolean(false);
      }
   }

   public <T> Optional<T> b(sf.a<T> $$0) {
      return this.readBoolean() ? Optional.of($$0.apply(this)) : Optional.empty();
   }

   @Nullable
   public <T> T c(sf.a<T> $$0) {
      return this.readBoolean() ? $$0.apply(this) : null;
   }

   public <T> void a(@Nullable T $$0, sf.b<T> $$1) {
      if ($$0 != null) {
         this.writeBoolean(true);
         $$1.accept(this, $$0);
      } else {
         this.writeBoolean(false);
      }
   }

   public <L, R> void a(Either<L, R> $$0, sf.b<L> $$1, sf.b<R> $$2) {
      $$0.ifLeft($$1x -> {
         this.writeBoolean(true);
         $$1.accept(this, (L)$$1x);
      }).ifRight($$1x -> {
         this.writeBoolean(false);
         $$2.accept(this, (R)$$1x);
      });
   }

   public <L, R> Either<L, R> b(sf.a<L> $$0, sf.a<R> $$1) {
      return this.readBoolean() ? Either.left($$0.apply(this)) : Either.right($$1.apply(this));
   }

   public byte[] b() {
      return this.b(this.readableBytes());
   }

   public sf a(byte[] $$0) {
      this.d($$0.length);
      this.writeBytes($$0);
      return this;
   }

   public byte[] b(int $$0) {
      int $$1 = this.m();
      if ($$1 > $$0) {
         throw new DecoderException("ByteArray with size " + $$1 + " is bigger than allowed " + $$0);
      } else {
         byte[] $$2 = new byte[$$1];
         this.readBytes($$2);
         return $$2;
      }
   }

   public sf a(int[] $$0) {
      this.d($$0.length);

      for (int $$1 : $$0) {
         this.d($$1);
      }

      return this;
   }

   public int[] c() {
      return this.c(this.readableBytes());
   }

   public int[] c(int $$0) {
      int $$1 = this.m();
      if ($$1 > $$0) {
         throw new DecoderException("VarIntArray with size " + $$1 + " is bigger than allowed " + $$0);
      } else {
         int[] $$2 = new int[$$1];

         for (int $$3 = 0; $$3 < $$2.length; $$3++) {
            $$2[$$3] = this.m();
         }

         return $$2;
      }
   }

   public sf a(long[] $$0) {
      this.d($$0.length);

      for (long $$1 : $$0) {
         this.writeLong($$1);
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
      int $$2 = this.m();
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

   @VisibleForTesting
   public byte[] e() {
      int $$0 = this.writerIndex();
      byte[] $$1 = new byte[$$0];
      this.getBytes(0, $$1);
      return $$1;
   }

   public gu f() {
      return gu.d(this.readLong());
   }

   public sf a(gu $$0) {
      this.writeLong($$0.a());
      return this;
   }

   public clt g() {
      return new clt(this.readLong());
   }

   public sf a(clt $$0) {
      this.writeLong($$0.a());
      return this;
   }

   public hx h() {
      return hx.a(this.readLong());
   }

   public sf a(hx $$0) {
      this.writeLong($$0.s());
      return this;
   }

   public hd i() {
      acp<cmm> $$0 = this.a(jc.aH);
      gu $$1 = this.f();
      return hd.a($$0, $$1);
   }

   public void a(hd $$0) {
      this.b($$0.a());
      this.a($$0.b());
   }

   public Vector3f j() {
      return new Vector3f(this.readFloat(), this.readFloat(), this.readFloat());
   }

   public void a(Vector3f $$0) {
      this.writeFloat($$0.x());
      this.writeFloat($$0.y());
      this.writeFloat($$0.z());
   }

   public Quaternionf k() {
      return new Quaternionf(this.readFloat(), this.readFloat(), this.readFloat(), this.readFloat());
   }

   public void a(Quaternionf $$0) {
      this.writeFloat($$0.x);
      this.writeFloat($$0.y);
      this.writeFloat($$0.z);
      this.writeFloat($$0.w);
   }

   public sw l() {
      sw $$0 = sw.a.a(this.e(262144));
      if ($$0 == null) {
         throw new DecoderException("Received unexpected null component");
      } else {
         return $$0;
      }
   }

   public sf a(sw $$0) {
      return this.a(sw.a.a($$0), 262144);
   }

   public <T extends Enum<T>> T b(Class<T> $$0) {
      return $$0.getEnumConstants()[this.m()];
   }

   public sf a(Enum<?> $$0) {
      return this.d($$0.ordinal());
   }

   public int m() {
      int $$0 = 0;
      int $$1 = 0;

      byte $$2;
      do {
         $$2 = this.readByte();
         $$0 |= ($$2 & 127) << $$1++ * 7;
         if ($$1 > 5) {
            throw new RuntimeException("VarInt too big");
         }
      } while (($$2 & 128) == 128);

      return $$0;
   }

   public long n() {
      long $$0 = 0L;
      int $$1 = 0;

      byte $$2;
      do {
         $$2 = this.readByte();
         $$0 |= (long)($$2 & 127) << $$1++ * 7;
         if ($$1 > 10) {
            throw new RuntimeException("VarLong too big");
         }
      } while (($$2 & 128) == 128);

      return $$0;
   }

   public sf a(UUID $$0) {
      this.writeLong($$0.getMostSignificantBits());
      this.writeLong($$0.getLeastSignificantBits());
      return this;
   }

   public UUID o() {
      return new UUID(this.readLong(), this.readLong());
   }

   public sf d(int $$0) {
      while (($$0 & -128) != 0) {
         this.writeByte($$0 & 127 | 128);
         $$0 >>>= 7;
      }

      this.writeByte($$0);
      return this;
   }

   public sf b(long $$0) {
      while (($$0 & -128L) != 0L) {
         this.writeByte((int)($$0 & 127L) | 128);
         $$0 >>>= 7;
      }

      this.writeByte((int)$$0);
      return this;
   }

   public sf a(@Nullable qr $$0) {
      if ($$0 == null) {
         this.writeByte(0);
      } else {
         try {
            rb.a($$0, new ByteBufOutputStream(this));
         } catch (IOException var3) {
            throw new EncoderException(var3);
         }
      }

      return this;
   }

   @Nullable
   public qr p() {
      return this.a(new ra(2097152L));
   }

   @Nullable
   public qr q() {
      return this.a(ra.a);
   }

   @Nullable
   public qr a(ra $$0) {
      int $$1 = this.readerIndex();
      byte $$2 = this.readByte();
      if ($$2 == 0) {
         return null;
      } else {
         this.readerIndex($$1);

         try {
            return rb.a(new ByteBufInputStream(this), $$0);
         } catch (IOException var5) {
            throw new EncoderException(var5);
         }
      }
   }

   public sf a(cfz $$0) {
      if ($$0.b()) {
         this.writeBoolean(false);
      } else {
         this.writeBoolean(true);
         cfu $$1 = $$0.d();
         this.a(jb.i, $$1);
         this.writeByte($$0.L());
         qr $$2 = null;
         if ($$1.o() || $$1.r()) {
            $$2 = $$0.v();
         }

         this.a($$2);
      }

      return this;
   }

   public cfz r() {
      if (!this.readBoolean()) {
         return cfz.b;
      } else {
         cfu $$0 = this.a(jb.i);
         int $$1 = this.readByte();
         cfz $$2 = new cfz($$0, $$1);
         $$2.c(this.p());
         return $$2;
      }
   }

   public String s() {
      return this.e(32767);
   }

   public String e(int $$0) {
      int $$1 = g($$0);
      int $$2 = this.m();
      if ($$2 > $$1) {
         throw new DecoderException("The received encoded string buffer length is longer than maximum allowed (" + $$2 + " > " + $$1 + ")");
      } else if ($$2 < 0) {
         throw new DecoderException("The received encoded string buffer length is less than zero! Weird string!");
      } else {
         String $$3 = this.toString(this.readerIndex(), $$2, StandardCharsets.UTF_8);
         this.readerIndex(this.readerIndex() + $$2);
         if ($$3.length() > $$0) {
            throw new DecoderException("The received string length is longer than maximum allowed (" + $$3.length() + " > " + $$0 + ")");
         } else {
            return $$3;
         }
      }
   }

   public sf a(String $$0) {
      return this.a($$0, 32767);
   }

   public sf a(String $$0, int $$1) {
      if ($$0.length() > $$1) {
         throw new EncoderException("String too big (was " + $$0.length() + " characters, max " + $$1 + ")");
      } else {
         byte[] $$2 = $$0.getBytes(StandardCharsets.UTF_8);
         int $$3 = g($$1);
         if ($$2.length > $$3) {
            throw new EncoderException("String too big (was " + $$2.length + " bytes encoded, max " + $$3 + ")");
         } else {
            this.d($$2.length);
            this.writeBytes($$2);
            return this;
         }
      }
   }

   private static int g(int $$0) {
      return $$0 * 3;
   }

   public acq t() {
      return new acq(this.e(32767));
   }

   public sf a(acq $$0) {
      this.a($$0.toString());
      return this;
   }

   public <T> acp<T> a(acp<? extends hr<T>> $$0) {
      acq $$1 = this.t();
      return acp.a($$0, $$1);
   }

   public void b(acp<?> $$0) {
      this.a($$0.a());
   }

   public Date u() {
      return new Date(this.readLong());
   }

   public sf a(Date $$0) {
      this.writeLong($$0.getTime());
      return this;
   }

   public Instant v() {
      return Instant.ofEpochMilli(this.readLong());
   }

   public void a(Instant $$0) {
      this.writeLong($$0.toEpochMilli());
   }

   public PublicKey w() {
      try {
         return anz.a(this.b(512));
      } catch (aoa var2) {
         throw new DecoderException("Malformed public key bytes", var2);
      }
   }

   public sf a(PublicKey $$0) {
      this.a($$0.getEncoded());
      return this;
   }

   public eee x() {
      gu $$0 = this.f();
      ha $$1 = this.b(ha.class);
      float $$2 = this.readFloat();
      float $$3 = this.readFloat();
      float $$4 = this.readFloat();
      boolean $$5 = this.readBoolean();
      return new eee(new eei((double)$$0.u() + (double)$$2, (double)$$0.v() + (double)$$3, (double)$$0.w() + (double)$$4), $$1, $$0, $$5);
   }

   public void a(eee $$0) {
      gu $$1 = $$0.a();
      this.a($$1);
      this.a($$0.b());
      eei $$2 = $$0.e();
      this.writeFloat((float)($$2.c - (double)$$1.u()));
      this.writeFloat((float)($$2.d - (double)$$1.v()));
      this.writeFloat((float)($$2.e - (double)$$1.w()));
      this.writeBoolean($$0.d());
   }

   public BitSet y() {
      return BitSet.valueOf(this.d());
   }

   public void a(BitSet $$0) {
      this.a($$0.toLongArray());
   }

   public BitSet f(int $$0) {
      byte[] $$1 = new byte[apa.e($$0, 8)];
      this.readBytes($$1);
      return BitSet.valueOf($$1);
   }

   public void a(BitSet $$0, int $$1) {
      if ($$0.length() > $$1) {
         throw new EncoderException("BitSet is larger than expected size (" + $$0.length() + ">" + $$1 + ")");
      } else {
         byte[] $$2 = $$0.toByteArray();
         this.writeBytes(Arrays.copyOf($$2, apa.e($$1, 8)));
      }
   }

   public GameProfile z() {
      UUID $$0 = this.o();
      String $$1 = this.e(16);
      GameProfile $$2 = new GameProfile($$0, $$1);
      $$2.getProperties().putAll(this.A());
      return $$2;
   }

   public void a(GameProfile $$0) {
      this.a($$0.getId());
      this.a($$0.getName());
      this.a($$0.getProperties());
   }

   public PropertyMap A() {
      PropertyMap $$0 = new PropertyMap();
      this.a((Consumer<sf>)($$1 -> {
         Property $$2 = this.B();
         $$0.put($$2.getName(), $$2);
      }));
      return $$0;
   }

   public void a(PropertyMap $$0) {
      this.a($$0.values(), sf::a);
   }

   public Property B() {
      String $$0 = this.s();
      String $$1 = this.s();
      if (this.readBoolean()) {
         String $$2 = this.s();
         return new Property($$0, $$1, $$2);
      } else {
         return new Property($$0, $$1);
      }
   }

   public void a(Property $$0) {
      this.a($$0.getName());
      this.a($$0.getValue());
      if ($$0.hasSignature()) {
         this.writeBoolean(true);
         this.a($$0.getSignature());
      } else {
         this.writeBoolean(false);
      }
   }

   public int capacity() {
      return this.f.capacity();
   }

   public ByteBuf capacity(int $$0) {
      return this.f.capacity($$0);
   }

   public int maxCapacity() {
      return this.f.maxCapacity();
   }

   public ByteBufAllocator alloc() {
      return this.f.alloc();
   }

   public ByteOrder order() {
      return this.f.order();
   }

   public ByteBuf order(ByteOrder $$0) {
      return this.f.order($$0);
   }

   public ByteBuf unwrap() {
      return this.f.unwrap();
   }

   public boolean isDirect() {
      return this.f.isDirect();
   }

   public boolean isReadOnly() {
      return this.f.isReadOnly();
   }

   public ByteBuf asReadOnly() {
      return this.f.asReadOnly();
   }

   public int readerIndex() {
      return this.f.readerIndex();
   }

   public ByteBuf readerIndex(int $$0) {
      return this.f.readerIndex($$0);
   }

   public int writerIndex() {
      return this.f.writerIndex();
   }

   public ByteBuf writerIndex(int $$0) {
      return this.f.writerIndex($$0);
   }

   public ByteBuf setIndex(int $$0, int $$1) {
      return this.f.setIndex($$0, $$1);
   }

   public int readableBytes() {
      return this.f.readableBytes();
   }

   public int writableBytes() {
      return this.f.writableBytes();
   }

   public int maxWritableBytes() {
      return this.f.maxWritableBytes();
   }

   public boolean isReadable() {
      return this.f.isReadable();
   }

   public boolean isReadable(int $$0) {
      return this.f.isReadable($$0);
   }

   public boolean isWritable() {
      return this.f.isWritable();
   }

   public boolean isWritable(int $$0) {
      return this.f.isWritable($$0);
   }

   public ByteBuf clear() {
      return this.f.clear();
   }

   public ByteBuf markReaderIndex() {
      return this.f.markReaderIndex();
   }

   public ByteBuf resetReaderIndex() {
      return this.f.resetReaderIndex();
   }

   public ByteBuf markWriterIndex() {
      return this.f.markWriterIndex();
   }

   public ByteBuf resetWriterIndex() {
      return this.f.resetWriterIndex();
   }

   public ByteBuf discardReadBytes() {
      return this.f.discardReadBytes();
   }

   public ByteBuf discardSomeReadBytes() {
      return this.f.discardSomeReadBytes();
   }

   public ByteBuf ensureWritable(int $$0) {
      return this.f.ensureWritable($$0);
   }

   public int ensureWritable(int $$0, boolean $$1) {
      return this.f.ensureWritable($$0, $$1);
   }

   public boolean getBoolean(int $$0) {
      return this.f.getBoolean($$0);
   }

   public byte getByte(int $$0) {
      return this.f.getByte($$0);
   }

   public short getUnsignedByte(int $$0) {
      return this.f.getUnsignedByte($$0);
   }

   public short getShort(int $$0) {
      return this.f.getShort($$0);
   }

   public short getShortLE(int $$0) {
      return this.f.getShortLE($$0);
   }

   public int getUnsignedShort(int $$0) {
      return this.f.getUnsignedShort($$0);
   }

   public int getUnsignedShortLE(int $$0) {
      return this.f.getUnsignedShortLE($$0);
   }

   public int getMedium(int $$0) {
      return this.f.getMedium($$0);
   }

   public int getMediumLE(int $$0) {
      return this.f.getMediumLE($$0);
   }

   public int getUnsignedMedium(int $$0) {
      return this.f.getUnsignedMedium($$0);
   }

   public int getUnsignedMediumLE(int $$0) {
      return this.f.getUnsignedMediumLE($$0);
   }

   public int getInt(int $$0) {
      return this.f.getInt($$0);
   }

   public int getIntLE(int $$0) {
      return this.f.getIntLE($$0);
   }

   public long getUnsignedInt(int $$0) {
      return this.f.getUnsignedInt($$0);
   }

   public long getUnsignedIntLE(int $$0) {
      return this.f.getUnsignedIntLE($$0);
   }

   public long getLong(int $$0) {
      return this.f.getLong($$0);
   }

   public long getLongLE(int $$0) {
      return this.f.getLongLE($$0);
   }

   public char getChar(int $$0) {
      return this.f.getChar($$0);
   }

   public float getFloat(int $$0) {
      return this.f.getFloat($$0);
   }

   public double getDouble(int $$0) {
      return this.f.getDouble($$0);
   }

   public ByteBuf getBytes(int $$0, ByteBuf $$1) {
      return this.f.getBytes($$0, $$1);
   }

   public ByteBuf getBytes(int $$0, ByteBuf $$1, int $$2) {
      return this.f.getBytes($$0, $$1, $$2);
   }

   public ByteBuf getBytes(int $$0, ByteBuf $$1, int $$2, int $$3) {
      return this.f.getBytes($$0, $$1, $$2, $$3);
   }

   public ByteBuf getBytes(int $$0, byte[] $$1) {
      return this.f.getBytes($$0, $$1);
   }

   public ByteBuf getBytes(int $$0, byte[] $$1, int $$2, int $$3) {
      return this.f.getBytes($$0, $$1, $$2, $$3);
   }

   public ByteBuf getBytes(int $$0, ByteBuffer $$1) {
      return this.f.getBytes($$0, $$1);
   }

   public ByteBuf getBytes(int $$0, OutputStream $$1, int $$2) throws IOException {
      return this.f.getBytes($$0, $$1, $$2);
   }

   public int getBytes(int $$0, GatheringByteChannel $$1, int $$2) throws IOException {
      return this.f.getBytes($$0, $$1, $$2);
   }

   public int getBytes(int $$0, FileChannel $$1, long $$2, int $$3) throws IOException {
      return this.f.getBytes($$0, $$1, $$2, $$3);
   }

   public CharSequence getCharSequence(int $$0, int $$1, Charset $$2) {
      return this.f.getCharSequence($$0, $$1, $$2);
   }

   public ByteBuf setBoolean(int $$0, boolean $$1) {
      return this.f.setBoolean($$0, $$1);
   }

   public ByteBuf setByte(int $$0, int $$1) {
      return this.f.setByte($$0, $$1);
   }

   public ByteBuf setShort(int $$0, int $$1) {
      return this.f.setShort($$0, $$1);
   }

   public ByteBuf setShortLE(int $$0, int $$1) {
      return this.f.setShortLE($$0, $$1);
   }

   public ByteBuf setMedium(int $$0, int $$1) {
      return this.f.setMedium($$0, $$1);
   }

   public ByteBuf setMediumLE(int $$0, int $$1) {
      return this.f.setMediumLE($$0, $$1);
   }

   public ByteBuf setInt(int $$0, int $$1) {
      return this.f.setInt($$0, $$1);
   }

   public ByteBuf setIntLE(int $$0, int $$1) {
      return this.f.setIntLE($$0, $$1);
   }

   public ByteBuf setLong(int $$0, long $$1) {
      return this.f.setLong($$0, $$1);
   }

   public ByteBuf setLongLE(int $$0, long $$1) {
      return this.f.setLongLE($$0, $$1);
   }

   public ByteBuf setChar(int $$0, int $$1) {
      return this.f.setChar($$0, $$1);
   }

   public ByteBuf setFloat(int $$0, float $$1) {
      return this.f.setFloat($$0, $$1);
   }

   public ByteBuf setDouble(int $$0, double $$1) {
      return this.f.setDouble($$0, $$1);
   }

   public ByteBuf setBytes(int $$0, ByteBuf $$1) {
      return this.f.setBytes($$0, $$1);
   }

   public ByteBuf setBytes(int $$0, ByteBuf $$1, int $$2) {
      return this.f.setBytes($$0, $$1, $$2);
   }

   public ByteBuf setBytes(int $$0, ByteBuf $$1, int $$2, int $$3) {
      return this.f.setBytes($$0, $$1, $$2, $$3);
   }

   public ByteBuf setBytes(int $$0, byte[] $$1) {
      return this.f.setBytes($$0, $$1);
   }

   public ByteBuf setBytes(int $$0, byte[] $$1, int $$2, int $$3) {
      return this.f.setBytes($$0, $$1, $$2, $$3);
   }

   public ByteBuf setBytes(int $$0, ByteBuffer $$1) {
      return this.f.setBytes($$0, $$1);
   }

   public int setBytes(int $$0, InputStream $$1, int $$2) throws IOException {
      return this.f.setBytes($$0, $$1, $$2);
   }

   public int setBytes(int $$0, ScatteringByteChannel $$1, int $$2) throws IOException {
      return this.f.setBytes($$0, $$1, $$2);
   }

   public int setBytes(int $$0, FileChannel $$1, long $$2, int $$3) throws IOException {
      return this.f.setBytes($$0, $$1, $$2, $$3);
   }

   public ByteBuf setZero(int $$0, int $$1) {
      return this.f.setZero($$0, $$1);
   }

   public int setCharSequence(int $$0, CharSequence $$1, Charset $$2) {
      return this.f.setCharSequence($$0, $$1, $$2);
   }

   public boolean readBoolean() {
      return this.f.readBoolean();
   }

   public byte readByte() {
      return this.f.readByte();
   }

   public short readUnsignedByte() {
      return this.f.readUnsignedByte();
   }

   public short readShort() {
      return this.f.readShort();
   }

   public short readShortLE() {
      return this.f.readShortLE();
   }

   public int readUnsignedShort() {
      return this.f.readUnsignedShort();
   }

   public int readUnsignedShortLE() {
      return this.f.readUnsignedShortLE();
   }

   public int readMedium() {
      return this.f.readMedium();
   }

   public int readMediumLE() {
      return this.f.readMediumLE();
   }

   public int readUnsignedMedium() {
      return this.f.readUnsignedMedium();
   }

   public int readUnsignedMediumLE() {
      return this.f.readUnsignedMediumLE();
   }

   public int readInt() {
      return this.f.readInt();
   }

   public int readIntLE() {
      return this.f.readIntLE();
   }

   public long readUnsignedInt() {
      return this.f.readUnsignedInt();
   }

   public long readUnsignedIntLE() {
      return this.f.readUnsignedIntLE();
   }

   public long readLong() {
      return this.f.readLong();
   }

   public long readLongLE() {
      return this.f.readLongLE();
   }

   public char readChar() {
      return this.f.readChar();
   }

   public float readFloat() {
      return this.f.readFloat();
   }

   public double readDouble() {
      return this.f.readDouble();
   }

   public ByteBuf readBytes(int $$0) {
      return this.f.readBytes($$0);
   }

   public ByteBuf readSlice(int $$0) {
      return this.f.readSlice($$0);
   }

   public ByteBuf readRetainedSlice(int $$0) {
      return this.f.readRetainedSlice($$0);
   }

   public ByteBuf readBytes(ByteBuf $$0) {
      return this.f.readBytes($$0);
   }

   public ByteBuf readBytes(ByteBuf $$0, int $$1) {
      return this.f.readBytes($$0, $$1);
   }

   public ByteBuf readBytes(ByteBuf $$0, int $$1, int $$2) {
      return this.f.readBytes($$0, $$1, $$2);
   }

   public ByteBuf readBytes(byte[] $$0) {
      return this.f.readBytes($$0);
   }

   public ByteBuf readBytes(byte[] $$0, int $$1, int $$2) {
      return this.f.readBytes($$0, $$1, $$2);
   }

   public ByteBuf readBytes(ByteBuffer $$0) {
      return this.f.readBytes($$0);
   }

   public ByteBuf readBytes(OutputStream $$0, int $$1) throws IOException {
      return this.f.readBytes($$0, $$1);
   }

   public int readBytes(GatheringByteChannel $$0, int $$1) throws IOException {
      return this.f.readBytes($$0, $$1);
   }

   public CharSequence readCharSequence(int $$0, Charset $$1) {
      return this.f.readCharSequence($$0, $$1);
   }

   public int readBytes(FileChannel $$0, long $$1, int $$2) throws IOException {
      return this.f.readBytes($$0, $$1, $$2);
   }

   public ByteBuf skipBytes(int $$0) {
      return this.f.skipBytes($$0);
   }

   public ByteBuf writeBoolean(boolean $$0) {
      return this.f.writeBoolean($$0);
   }

   public ByteBuf writeByte(int $$0) {
      return this.f.writeByte($$0);
   }

   public ByteBuf writeShort(int $$0) {
      return this.f.writeShort($$0);
   }

   public ByteBuf writeShortLE(int $$0) {
      return this.f.writeShortLE($$0);
   }

   public ByteBuf writeMedium(int $$0) {
      return this.f.writeMedium($$0);
   }

   public ByteBuf writeMediumLE(int $$0) {
      return this.f.writeMediumLE($$0);
   }

   public ByteBuf writeInt(int $$0) {
      return this.f.writeInt($$0);
   }

   public ByteBuf writeIntLE(int $$0) {
      return this.f.writeIntLE($$0);
   }

   public ByteBuf writeLong(long $$0) {
      return this.f.writeLong($$0);
   }

   public ByteBuf writeLongLE(long $$0) {
      return this.f.writeLongLE($$0);
   }

   public ByteBuf writeChar(int $$0) {
      return this.f.writeChar($$0);
   }

   public ByteBuf writeFloat(float $$0) {
      return this.f.writeFloat($$0);
   }

   public ByteBuf writeDouble(double $$0) {
      return this.f.writeDouble($$0);
   }

   public ByteBuf writeBytes(ByteBuf $$0) {
      return this.f.writeBytes($$0);
   }

   public ByteBuf writeBytes(ByteBuf $$0, int $$1) {
      return this.f.writeBytes($$0, $$1);
   }

   public ByteBuf writeBytes(ByteBuf $$0, int $$1, int $$2) {
      return this.f.writeBytes($$0, $$1, $$2);
   }

   public ByteBuf writeBytes(byte[] $$0) {
      return this.f.writeBytes($$0);
   }

   public ByteBuf writeBytes(byte[] $$0, int $$1, int $$2) {
      return this.f.writeBytes($$0, $$1, $$2);
   }

   public ByteBuf writeBytes(ByteBuffer $$0) {
      return this.f.writeBytes($$0);
   }

   public int writeBytes(InputStream $$0, int $$1) throws IOException {
      return this.f.writeBytes($$0, $$1);
   }

   public int writeBytes(ScatteringByteChannel $$0, int $$1) throws IOException {
      return this.f.writeBytes($$0, $$1);
   }

   public int writeBytes(FileChannel $$0, long $$1, int $$2) throws IOException {
      return this.f.writeBytes($$0, $$1, $$2);
   }

   public ByteBuf writeZero(int $$0) {
      return this.f.writeZero($$0);
   }

   public int writeCharSequence(CharSequence $$0, Charset $$1) {
      return this.f.writeCharSequence($$0, $$1);
   }

   public int indexOf(int $$0, int $$1, byte $$2) {
      return this.f.indexOf($$0, $$1, $$2);
   }

   public int bytesBefore(byte $$0) {
      return this.f.bytesBefore($$0);
   }

   public int bytesBefore(int $$0, byte $$1) {
      return this.f.bytesBefore($$0, $$1);
   }

   public int bytesBefore(int $$0, int $$1, byte $$2) {
      return this.f.bytesBefore($$0, $$1, $$2);
   }

   public int forEachByte(ByteProcessor $$0) {
      return this.f.forEachByte($$0);
   }

   public int forEachByte(int $$0, int $$1, ByteProcessor $$2) {
      return this.f.forEachByte($$0, $$1, $$2);
   }

   public int forEachByteDesc(ByteProcessor $$0) {
      return this.f.forEachByteDesc($$0);
   }

   public int forEachByteDesc(int $$0, int $$1, ByteProcessor $$2) {
      return this.f.forEachByteDesc($$0, $$1, $$2);
   }

   public ByteBuf copy() {
      return this.f.copy();
   }

   public ByteBuf copy(int $$0, int $$1) {
      return this.f.copy($$0, $$1);
   }

   public ByteBuf slice() {
      return this.f.slice();
   }

   public ByteBuf retainedSlice() {
      return this.f.retainedSlice();
   }

   public ByteBuf slice(int $$0, int $$1) {
      return this.f.slice($$0, $$1);
   }

   public ByteBuf retainedSlice(int $$0, int $$1) {
      return this.f.retainedSlice($$0, $$1);
   }

   public ByteBuf duplicate() {
      return this.f.duplicate();
   }

   public ByteBuf retainedDuplicate() {
      return this.f.retainedDuplicate();
   }

   public int nioBufferCount() {
      return this.f.nioBufferCount();
   }

   public ByteBuffer nioBuffer() {
      return this.f.nioBuffer();
   }

   public ByteBuffer nioBuffer(int $$0, int $$1) {
      return this.f.nioBuffer($$0, $$1);
   }

   public ByteBuffer internalNioBuffer(int $$0, int $$1) {
      return this.f.internalNioBuffer($$0, $$1);
   }

   public ByteBuffer[] nioBuffers() {
      return this.f.nioBuffers();
   }

   public ByteBuffer[] nioBuffers(int $$0, int $$1) {
      return this.f.nioBuffers($$0, $$1);
   }

   public boolean hasArray() {
      return this.f.hasArray();
   }

   public byte[] array() {
      return this.f.array();
   }

   public int arrayOffset() {
      return this.f.arrayOffset();
   }

   public boolean hasMemoryAddress() {
      return this.f.hasMemoryAddress();
   }

   public long memoryAddress() {
      return this.f.memoryAddress();
   }

   public String toString(Charset $$0) {
      return this.f.toString($$0);
   }

   public String toString(int $$0, int $$1, Charset $$2) {
      return this.f.toString($$0, $$1, $$2);
   }

   public int hashCode() {
      return this.f.hashCode();
   }

   public boolean equals(Object $$0) {
      return this.f.equals($$0);
   }

   public int compareTo(ByteBuf $$0) {
      return this.f.compareTo($$0);
   }

   public String toString() {
      return this.f.toString();
   }

   public ByteBuf retain(int $$0) {
      return this.f.retain($$0);
   }

   public ByteBuf retain() {
      return this.f.retain();
   }

   public ByteBuf touch() {
      return this.f.touch();
   }

   public ByteBuf touch(Object $$0) {
      return this.f.touch($$0);
   }

   public int refCnt() {
      return this.f.refCnt();
   }

   public boolean release() {
      return this.f.release();
   }

   public boolean release(int $$0) {
      return this.f.release($$0);
   }

   @FunctionalInterface
   public interface a<T> extends Function<sf, T> {
      default sf.a<Optional<T>> asOptional() {
         return $$0 -> $$0.b(this);
      }
   }

   @FunctionalInterface
   public interface b<T> extends BiConsumer<sf, T> {
      default sf.b<Optional<T>> asOptional() {
         return ($$0, $$1) -> $$0.a($$1, this);
      }
   }
}
