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

public class tu extends ByteBuf {
   public static final int a = 2097152;
   private final ByteBuf d;
   public static final short b = 32767;
   public static final int c = 262144;
   private static final int e = 256;
   private static final int f = 256;
   private static final int g = 512;
   private static final Gson h = new Gson();

   public tu(ByteBuf $$0) {
      this.d = $$0;
   }

   @Deprecated
   public <T> T a(DynamicOps<sw> $$0, Codec<T> $$1) {
      return this.a($$0, $$1, si.a());
   }

   @Deprecated
   public <T> T a(DynamicOps<sw> $$0, Codec<T> $$1, si $$2) {
      sw $$3 = this.a($$2);
      return ac.a($$1.parse($$0, $$3), $$1x -> new DecoderException("Failed to decode: " + $$1x + " " + $$3));
   }

   @Deprecated
   public <T> tu a(DynamicOps<sw> $$0, Codec<T> $$1, T $$2) {
      sw $$3 = ac.a($$1.encodeStart($$0, $$2), $$1x -> new EncoderException("Failed to encode: " + $$1x + " " + $$2));
      this.a($$3);
      return this;
   }

   public <T> T a(Codec<T> $$0) {
      JsonElement $$1 = atc.a(h, this.s(), JsonElement.class);
      DataResult<T> $$2 = $$0.parse(JsonOps.INSTANCE, $$1);
      return ac.a($$2, $$0x -> new DecoderException("Failed to decode json: " + $$0x));
   }

   public <T> void a(Codec<T> $$0, T $$1) {
      DataResult<JsonElement> $$2 = $$0.encodeStart(JsonOps.INSTANCE, $$1);
      this.a(h.toJson(ac.a($$2, $$1x -> new EncoderException("Failed to encode: " + $$1x + " " + $$1))));
   }

   public <T> void a(ih<T> $$0, T $$1) {
      int $$2 = $$0.a($$1);
      if ($$2 == -1) {
         throw new IllegalArgumentException("Can't find id for '" + $$1 + "' in map " + $$0);
      } else {
         this.c($$2);
      }
   }

   public <T> void a(ih<ib<T>> $$0, ib<T> $$1, tu.b<T> $$2) {
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
   public <T> T a(ih<T> $$0) {
      int $$1 = this.n();
      return $$0.a($$1);
   }

   public <T> ib<T> a(ih<ib<T>> $$0, tu.a<T> $$1) {
      int $$2 = this.n();
      if ($$2 == 0) {
         return ib.a($$1.apply(this));
      } else {
         ib<T> $$3 = $$0.a($$2 - 1);
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

   public <T, C extends Collection<T>> C a(IntFunction<C> $$0, tu.a<T> $$1) {
      int $$2 = this.n();
      C $$3 = (C)$$0.apply($$2);

      for (int $$4 = 0; $$4 < $$2; $$4++) {
         $$3.add($$1.apply(this));
      }

      return $$3;
   }

   public <T> void a(Collection<T> $$0, tu.b<T> $$1) {
      this.c($$0.size());

      for (T $$2 : $$0) {
         $$1.accept(this, $$2);
      }
   }

   public <T> List<T> a(tu.a<T> $$0) {
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

   public <K, V, M extends Map<K, V>> M a(IntFunction<M> $$0, tu.a<K> $$1, tu.a<V> $$2) {
      int $$3 = this.n();
      M $$4 = (M)$$0.apply($$3);

      for (int $$5 = 0; $$5 < $$3; $$5++) {
         K $$6 = $$1.apply(this);
         V $$7 = $$2.apply(this);
         $$4.put($$6, $$7);
      }

      return $$4;
   }

   public <K, V> Map<K, V> a(tu.a<K> $$0, tu.a<V> $$1) {
      return this.a(Maps::newHashMapWithExpectedSize, $$0, $$1);
   }

   public <K, V> void a(Map<K, V> $$0, tu.b<K> $$1, tu.b<V> $$2) {
      this.c($$0.size());
      $$0.forEach(($$2x, $$3) -> {
         $$1.accept(this, (K)$$2x);
         $$2.accept(this, (V)$$3);
      });
   }

   public void a(Consumer<tu> $$0) {
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

   public <T> void a(Optional<T> $$0, tu.b<T> $$1) {
      if ($$0.isPresent()) {
         this.a(true);
         $$1.accept(this, $$0.get());
      } else {
         this.a(false);
      }
   }

   public <T> Optional<T> b(tu.a<T> $$0) {
      return this.readBoolean() ? Optional.of($$0.apply(this)) : Optional.empty();
   }

   @Nullable
   public <T> T c(tu.a<T> $$0) {
      return this.readBoolean() ? $$0.apply(this) : null;
   }

   public <T> void a(@Nullable T $$0, tu.b<T> $$1) {
      if ($$0 != null) {
         this.a(true);
         $$1.accept(this, $$0);
      } else {
         this.a(false);
      }
   }

   public <L, R> void a(Either<L, R> $$0, tu.b<L> $$1, tu.b<R> $$2) {
      $$0.ifLeft($$1x -> {
         this.a(true);
         $$1.accept(this, (L)$$1x);
      }).ifRight($$1x -> {
         this.a(false);
         $$2.accept(this, (R)$$1x);
      });
   }

   public <L, R> Either<L, R> b(tu.a<L> $$0, tu.a<R> $$1) {
      return this.readBoolean() ? Either.left($$0.apply(this)) : Either.right($$1.apply(this));
   }

   public byte[] b() {
      return this.a(this.readableBytes());
   }

   public tu a(byte[] $$0) {
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

   public tu a(int[] $$0) {
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

   public tu a(long[] $$0) {
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

   public ht e() {
      return ht.d(this.readLong());
   }

   public tu a(ht $$0) {
      this.b($$0.a());
      return this;
   }

   public crh f() {
      return new crh(this.readLong());
   }

   public tu a(crh $$0) {
      this.b($$0.a());
      return this;
   }

   public iu g() {
      return iu.a(this.readLong());
   }

   public tu a(iu $$0) {
      this.b($$0.s());
      return this;
   }

   public ia h() {
      agh<csa> $$0 = this.a(jz.aJ);
      ht $$1 = this.e();
      return ia.a($$0, $$1);
   }

   public void a(ia $$0) {
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

   public eju k() {
      return new eju(this.readDouble(), this.readDouble(), this.readDouble());
   }

   public void a(eju $$0) {
      this.a($$0.a());
      this.a($$0.b());
      this.a($$0.c());
   }

   public ur l() {
      return this.a(sn.a, ut.a, si.a(2097152L));
   }

   public ur m() {
      return this.a(sn.a, ut.a);
   }

   public tu a(ur $$0) {
      return this.a(sn.a, ut.a, $$0);
   }

   public <T extends Enum<T>> T b(Class<T> $$0) {
      return $$0.getEnumConstants()[this.n()];
   }

   public tu a(Enum<?> $$0) {
      return this.c($$0.ordinal());
   }

   public <T> T a(IntFunction<T> $$0) {
      int $$1 = this.n();
      return $$0.apply($$1);
   }

   public <T> tu a(ToIntFunction<T> $$0, T $$1) {
      int $$2 = $$0.applyAsInt($$1);
      return this.c($$2);
   }

   public int n() {
      return ui.a(this.d);
   }

   public long o() {
      return uj.a(this.d);
   }

   public tu a(UUID $$0) {
      this.b($$0.getMostSignificantBits());
      this.b($$0.getLeastSignificantBits());
      return this;
   }

   public UUID p() {
      return new UUID(this.readLong(), this.readLong());
   }

   public tu c(int $$0) {
      ui.a(this.d, $$0);
      return this;
   }

   public tu a(long $$0) {
      uj.a(this.d, $$0);
      return this;
   }

   public tu a(@Nullable sw $$0) {
      if ($$0 == null) {
         $$0 = sb.b;
      }

      try {
         sm.a($$0, new ByteBufOutputStream(this));
         return this;
      } catch (IOException var3) {
         throw new EncoderException(var3);
      }
   }

   @Nullable
   public rz q() {
      sw $$0 = this.a(si.a(2097152L));
      if ($$0 != null && !($$0 instanceof rz)) {
         throw new DecoderException("Not a compound tag: " + $$0);
      } else {
         return (rz)$$0;
      }
   }

   @Nullable
   public sw a(si $$0) {
      try {
         sw $$1 = sm.b(new ByteBufInputStream(this), $$0);
         return $$1.b() == 0 ? null : $$1;
      } catch (IOException var3) {
         throw new EncoderException(var3);
      }
   }

   public tu a(clj $$0) {
      if ($$0.b()) {
         this.a(false);
      } else {
         this.a(true);
         cle $$1 = $$0.d();
         this.a(jy.i, $$1);
         this.k($$0.L());
         rz $$2 = null;
         if ($$1.o() || $$1.r()) {
            $$2 = $$0.v();
         }

         this.a((sw)$$2);
      }

      return this;
   }

   public clj r() {
      if (!this.readBoolean()) {
         return clj.b;
      } else {
         cle $$0 = this.a(jy.i);
         int $$1 = this.readByte();
         clj $$2 = new clj($$0, $$1);
         $$2.c(this.q());
         return $$2;
      }
   }

   public String s() {
      return this.d(32767);
   }

   public String d(int $$0) {
      return uh.a(this.d, $$0);
   }

   public tu a(String $$0) {
      return this.a($$0, 32767);
   }

   public tu a(String $$0, int $$1) {
      uh.a(this.d, $$0, $$1);
      return this;
   }

   public agi t() {
      return new agi(this.d(32767));
   }

   public tu a(agi $$0) {
      this.a($$0.toString());
      return this;
   }

   public <T> agh<T> a(agh<? extends io<T>> $$0) {
      agi $$1 = this.t();
      return agh.a($$0, $$1);
   }

   public void b(agh<?> $$0) {
      this.a($$0.a());
   }

   public <T> agh<? extends io<T>> u() {
      agi $$0 = this.t();
      return agh.a($$0);
   }

   public Date v() {
      return new Date(this.readLong());
   }

   public tu a(Date $$0) {
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
         return asl.a(this.a(512));
      } catch (asm var2) {
         throw new DecoderException("Malformed public key bytes", var2);
      }
   }

   public tu a(PublicKey $$0) {
      this.a($$0.getEncoded());
      return this;
   }

   public ejq y() {
      ht $$0 = this.e();
      hx $$1 = this.b(hx.class);
      float $$2 = this.readFloat();
      float $$3 = this.readFloat();
      float $$4 = this.readFloat();
      boolean $$5 = this.readBoolean();
      return new ejq(new eju((double)$$0.u() + (double)$$2, (double)$$0.v() + (double)$$3, (double)$$0.w() + (double)$$4), $$1, $$0, $$5);
   }

   public void a(ejq $$0) {
      ht $$1 = $$0.a();
      this.a($$1);
      this.a($$0.b());
      eju $$2 = $$0.e();
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
      byte[] $$1 = new byte[atm.e($$0, 8)];
      this.b($$1);
      return BitSet.valueOf($$1);
   }

   public void a(BitSet $$0, int $$1) {
      if ($$0.length() > $$1) {
         throw new EncoderException("BitSet is larger than expected size (" + $$0.length() + ">" + $$1 + ")");
      } else {
         byte[] $$2 = $$0.toByteArray();
         this.c(Arrays.copyOf($$2, atm.e($$1, 8)));
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
      this.a((Consumer<tu>)($$1 -> {
         Property $$2 = this.C();
         $$0.put($$2.name(), $$2);
      }));
      return $$0;
   }

   public void a(PropertyMap $$0) {
      this.a($$0.values(), tu::a);
   }

   public Property C() {
      String $$0 = this.s();
      String $$1 = this.s();
      String $$2 = this.c(tu::s);
      return new Property($$0, $$1, $$2);
   }

   public void a(Property $$0) {
      this.a($$0.name());
      this.a($$0.value());
      this.a($$0.signature(), tu::a);
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

   public tu f(int $$0) {
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

   public tu g(int $$0) {
      this.d.readerIndex($$0);
      return this;
   }

   public int writerIndex() {
      return this.d.writerIndex();
   }

   public tu h(int $$0) {
      this.d.writerIndex($$0);
      return this;
   }

   public tu a(int $$0, int $$1) {
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

   public tu D() {
      this.d.clear();
      return this;
   }

   public tu E() {
      this.d.markReaderIndex();
      return this;
   }

   public tu F() {
      this.d.resetReaderIndex();
      return this;
   }

   public tu G() {
      this.d.markWriterIndex();
      return this;
   }

   public tu H() {
      this.d.resetWriterIndex();
      return this;
   }

   public tu I() {
      this.d.discardReadBytes();
      return this;
   }

   public tu J() {
      this.d.discardSomeReadBytes();
      return this;
   }

   public tu i(int $$0) {
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

   public tu a(int $$0, ByteBuf $$1) {
      this.d.getBytes($$0, $$1);
      return this;
   }

   public tu a(int $$0, ByteBuf $$1, int $$2) {
      this.d.getBytes($$0, $$1, $$2);
      return this;
   }

   public tu a(int $$0, ByteBuf $$1, int $$2, int $$3) {
      this.d.getBytes($$0, $$1, $$2, $$3);
      return this;
   }

   public tu a(int $$0, byte[] $$1) {
      this.d.getBytes($$0, $$1);
      return this;
   }

   public tu a(int $$0, byte[] $$1, int $$2, int $$3) {
      this.d.getBytes($$0, $$1, $$2, $$3);
      return this;
   }

   public tu a(int $$0, ByteBuffer $$1) {
      this.d.getBytes($$0, $$1);
      return this;
   }

   public tu a(int $$0, OutputStream $$1, int $$2) throws IOException {
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

   public tu a(int $$0, boolean $$1) {
      this.d.setBoolean($$0, $$1);
      return this;
   }

   public tu b(int $$0, int $$1) {
      this.d.setByte($$0, $$1);
      return this;
   }

   public tu c(int $$0, int $$1) {
      this.d.setShort($$0, $$1);
      return this;
   }

   public tu d(int $$0, int $$1) {
      this.d.setShortLE($$0, $$1);
      return this;
   }

   public tu e(int $$0, int $$1) {
      this.d.setMedium($$0, $$1);
      return this;
   }

   public tu f(int $$0, int $$1) {
      this.d.setMediumLE($$0, $$1);
      return this;
   }

   public tu g(int $$0, int $$1) {
      this.d.setInt($$0, $$1);
      return this;
   }

   public tu h(int $$0, int $$1) {
      this.d.setIntLE($$0, $$1);
      return this;
   }

   public tu a(int $$0, long $$1) {
      this.d.setLong($$0, $$1);
      return this;
   }

   public tu b(int $$0, long $$1) {
      this.d.setLongLE($$0, $$1);
      return this;
   }

   public tu i(int $$0, int $$1) {
      this.d.setChar($$0, $$1);
      return this;
   }

   public tu a(int $$0, float $$1) {
      this.d.setFloat($$0, $$1);
      return this;
   }

   public tu a(int $$0, double $$1) {
      this.d.setDouble($$0, $$1);
      return this;
   }

   public tu b(int $$0, ByteBuf $$1) {
      this.d.setBytes($$0, $$1);
      return this;
   }

   public tu b(int $$0, ByteBuf $$1, int $$2) {
      this.d.setBytes($$0, $$1, $$2);
      return this;
   }

   public tu b(int $$0, ByteBuf $$1, int $$2, int $$3) {
      this.d.setBytes($$0, $$1, $$2, $$3);
      return this;
   }

   public tu b(int $$0, byte[] $$1) {
      this.d.setBytes($$0, $$1);
      return this;
   }

   public tu b(int $$0, byte[] $$1, int $$2, int $$3) {
      this.d.setBytes($$0, $$1, $$2, $$3);
      return this;
   }

   public tu b(int $$0, ByteBuffer $$1) {
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

   public tu j(int $$0, int $$1) {
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

   public tu a(ByteBuf $$0) {
      this.d.readBytes($$0);
      return this;
   }

   public tu a(ByteBuf $$0, int $$1) {
      this.d.readBytes($$0, $$1);
      return this;
   }

   public tu a(ByteBuf $$0, int $$1, int $$2) {
      this.d.readBytes($$0, $$1, $$2);
      return this;
   }

   public tu b(byte[] $$0) {
      this.d.readBytes($$0);
      return this;
   }

   public tu a(byte[] $$0, int $$1, int $$2) {
      this.d.readBytes($$0, $$1, $$2);
      return this;
   }

   public tu a(ByteBuffer $$0) {
      this.d.readBytes($$0);
      return this;
   }

   public tu a(OutputStream $$0, int $$1) throws IOException {
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

   public tu j(int $$0) {
      this.d.skipBytes($$0);
      return this;
   }

   public tu a(boolean $$0) {
      this.d.writeBoolean($$0);
      return this;
   }

   public tu k(int $$0) {
      this.d.writeByte($$0);
      return this;
   }

   public tu l(int $$0) {
      this.d.writeShort($$0);
      return this;
   }

   public tu m(int $$0) {
      this.d.writeShortLE($$0);
      return this;
   }

   public tu n(int $$0) {
      this.d.writeMedium($$0);
      return this;
   }

   public tu o(int $$0) {
      this.d.writeMediumLE($$0);
      return this;
   }

   public tu p(int $$0) {
      this.d.writeInt($$0);
      return this;
   }

   public tu q(int $$0) {
      this.d.writeIntLE($$0);
      return this;
   }

   public tu b(long $$0) {
      this.d.writeLong($$0);
      return this;
   }

   public tu c(long $$0) {
      this.d.writeLongLE($$0);
      return this;
   }

   public tu r(int $$0) {
      this.d.writeChar($$0);
      return this;
   }

   public tu a(float $$0) {
      this.d.writeFloat($$0);
      return this;
   }

   public tu a(double $$0) {
      this.d.writeDouble($$0);
      return this;
   }

   public tu b(ByteBuf $$0) {
      this.d.writeBytes($$0);
      return this;
   }

   public tu b(ByteBuf $$0, int $$1) {
      this.d.writeBytes($$0, $$1);
      return this;
   }

   public tu b(ByteBuf $$0, int $$1, int $$2) {
      this.d.writeBytes($$0, $$1, $$2);
      return this;
   }

   public tu c(byte[] $$0) {
      this.d.writeBytes($$0);
      return this;
   }

   public tu b(byte[] $$0, int $$1, int $$2) {
      this.d.writeBytes($$0, $$1, $$2);
      return this;
   }

   public tu b(ByteBuffer $$0) {
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

   public tu s(int $$0) {
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

   public tu t(int $$0) {
      this.d.retain($$0);
      return this;
   }

   public tu K() {
      this.d.retain();
      return this;
   }

   public tu L() {
      this.d.touch();
      return this;
   }

   public tu a(Object $$0) {
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
   public interface a<T> extends Function<tu, T> {
      default tu.a<Optional<T>> asOptional() {
         return $$0 -> $$0.b(this);
      }
   }

   @FunctionalInterface
   public interface b<T> extends BiConsumer<tu, T> {
      default tu.b<Optional<T>> asOptional() {
         return ($$0, $$1) -> $$0.a($$1, this);
      }
   }
}
