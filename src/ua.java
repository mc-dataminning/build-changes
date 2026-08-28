import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class ua implements va {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<ua> a = Codec.PASSTHROUGH.comapFlatMap($$0 -> {
      va $$1 = (va)$$0.convert(uo.a).getValue();
      return $$1 instanceof ua $$2 ? DataResult.success($$2 == $$0.getValue() ? $$2.l() : $$2) : DataResult.error(() -> "Not a compound tag: " + $$1);
   }, $$0 -> new Dynamic(uo.a, $$0.l()));
   private static final int v = 48;
   private static final int w = 32;
   public static final vc<ua> b = new vc.b<ua>() {
      public ua a(DataInput $$0, uj $$1) throws IOException {
         $$1.b();

         ua var3;
         try {
            var3 = d($$0, $$1);
         } finally {
            $$1.c();
         }

         return var3;
      }

      private static ua d(DataInput $$0, uj $$1) throws IOException {
         $$1.b(48L);
         Map<String, va> $$2 = Maps.newHashMap();

         byte $$3;
         while (($$3 = $$0.readByte()) != 0) {
            String $$4 = e($$0, $$1);
            va $$5 = ua.a(vd.a($$3), $$4, $$0, $$1);
            if ($$2.put($$4, $$5) == null) {
               $$1.b(36L);
            }
         }

         return new ua($$2);
      }

      @Override
      public ux.b a(DataInput $$0, ux $$1, uj $$2) throws IOException {
         $$2.b();

         ux.b var4;
         try {
            var4 = c($$0, $$1, $$2);
         } finally {
            $$2.c();
         }

         return var4;
      }

      private static ux.b c(DataInput $$0, ux $$1, uj $$2) throws IOException {
         $$2.b(48L);

         byte $$3;
         label35:
         while (($$3 = $$0.readByte()) != 0) {
            vc<?> $$4 = vd.a($$3);
            switch ($$1.a($$4)) {
               case d:
                  return ux.b.c;
               case c:
                  uy.a($$0);
                  $$4.b($$0, $$2);
                  break label35;
               case b:
                  uy.a($$0);
                  $$4.b($$0, $$2);
                  break;
               default:
                  String $$5 = e($$0, $$2);
                  switch ($$1.a($$4, $$5)) {
                     case d:
                        return ux.b.c;
                     case c:
                        $$4.b($$0, $$2);
                        break label35;
                     case b:
                        $$4.b($$0, $$2);
                        break;
                     default:
                        $$2.b(36L);
                        switch ($$4.a($$0, $$1, $$2)) {
                           case c:
                              return ux.b.c;
                           case b:
                        }
                  }
            }
         }

         if ($$3 != 0) {
            while (($$3 = $$0.readByte()) != 0) {
               uy.a($$0);
               vd.a($$3).b($$0, $$2);
            }
         }

         return $$1.b();
      }

      private static String e(DataInput $$0, uj $$1) throws IOException {
         String $$2 = $$0.readUTF();
         $$1.b(28L);
         $$1.a(2L, (long)$$2.length());
         return $$2;
      }

      @Override
      public void b(DataInput $$0, uj $$1) throws IOException {
         $$1.b();

         byte $$2;
         try {
            while (($$2 = $$0.readByte()) != 0) {
               uy.a($$0);
               vd.a($$2).b($$0, $$1);
            }
         } finally {
            $$1.c();
         }
      }

      @Override
      public String a() {
         return "COMPOUND";
      }

      @Override
      public String b() {
         return "TAG_Compound";
      }
   };
   private final Map<String, va> x;

   ua(Map<String, va> $$0) {
      this.x = $$0;
   }

   public ua() {
      this(new HashMap<>());
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      for (String $$1 : this.x.keySet()) {
         va $$2 = this.x.get($$1);
         a($$1, $$2, $$0);
      }

      $$0.writeByte(0);
   }

   @Override
   public int a() {
      int $$0 = 48;

      for (Entry<String, va> $$1 : this.x.entrySet()) {
         $$0 += 28 + 2 * $$1.getKey().length();
         $$0 += 36;
         $$0 += $$1.getValue().a();
      }

      return $$0;
   }

   public Set<String> e() {
      return this.x.keySet();
   }

   public Set<Entry<String, va>> g() {
      return this.x.entrySet();
   }

   public Collection<va> h() {
      return this.x.values();
   }

   public void a(BiConsumer<String, va> $$0) {
      this.x.forEach($$0);
   }

   @Override
   public byte b() {
      return 10;
   }

   @Override
   public vc<ua> c() {
      return b;
   }

   public int i() {
      return this.x.size();
   }

   @Nullable
   public va a(String $$0, va $$1) {
      return this.x.put($$0, $$1);
   }

   public void a(String $$0, byte $$1) {
      this.x.put($$0, ty.a($$1));
   }

   public void a(String $$0, short $$1) {
      this.x.put($$0, ut.a($$1));
   }

   public void a(String $$0, int $$1) {
      this.x.put($$0, uf.a($$1));
   }

   public void a(String $$0, long $$1) {
      this.x.put($$0, ui.a($$1));
   }

   public void a(String $$0, float $$1) {
      this.x.put($$0, ud.a($$1));
   }

   public void a(String $$0, double $$1) {
      this.x.put($$0, ub.a($$1));
   }

   public void a(String $$0, String $$1) {
      this.x.put($$0, uy.a($$1));
   }

   public void a(String $$0, byte[] $$1) {
      this.x.put($$0, new tx($$1));
   }

   public void a(String $$0, int[] $$1) {
      this.x.put($$0, new ue($$1));
   }

   public void a(String $$0, long[] $$1) {
      this.x.put($$0, new uh($$1));
   }

   public void a(String $$0, boolean $$1) {
      this.x.put($$0, ty.a($$1));
   }

   @Nullable
   public va a(String $$0) {
      return this.x.get($$0);
   }

   public boolean b(String $$0) {
      return this.x.containsKey($$0);
   }

   private Optional<va> s(String $$0) {
      return Optional.ofNullable(this.x.get($$0));
   }

   public Optional<Byte> c(String $$0) {
      return this.s($$0).flatMap(va::p);
   }

   public byte b(String $$0, byte $$1) {
      return this.x.get($$0) instanceof uq $$2 ? $$2.j() : $$1;
   }

   public Optional<Short> d(String $$0) {
      return this.s($$0).flatMap(va::q);
   }

   public short b(String $$0, short $$1) {
      return this.x.get($$0) instanceof uq $$2 ? $$2.i() : $$1;
   }

   public Optional<Integer> e(String $$0) {
      return this.s($$0).flatMap(va::r);
   }

   public int b(String $$0, int $$1) {
      return this.x.get($$0) instanceof uq $$2 ? $$2.h() : $$1;
   }

   public Optional<Long> f(String $$0) {
      return this.s($$0).flatMap(va::s);
   }

   public long b(String $$0, long $$1) {
      return this.x.get($$0) instanceof uq $$2 ? $$2.g() : $$1;
   }

   public Optional<Float> g(String $$0) {
      return this.s($$0).flatMap(va::t);
   }

   public float b(String $$0, float $$1) {
      return this.x.get($$0) instanceof uq $$2 ? $$2.l() : $$1;
   }

   public Optional<Double> h(String $$0) {
      return this.s($$0).flatMap(va::u);
   }

   public double b(String $$0, double $$1) {
      return this.x.get($$0) instanceof uq $$2 ? $$2.k() : $$1;
   }

   public Optional<String> i(String $$0) {
      return this.s($$0).flatMap(va::p_);
   }

   public String b(String $$0, String $$1) {
      if (this.x.get($$0) instanceof uy var3) {
         uy var10000 = var3;

         try {
            var8 = var10000.k();
         } catch (Throwable var7) {
            throw new MatchException(var7.toString(), var7);
         }

         return var8;
      } else {
         return $$1;
      }
   }

   public Optional<byte[]> j(String $$0) {
      return this.x.get($$0) instanceof tx $$1 ? Optional.of($$1.e()) : Optional.empty();
   }

   public Optional<int[]> k(String $$0) {
      return this.x.get($$0) instanceof ue $$1 ? Optional.of($$1.g()) : Optional.empty();
   }

   public Optional<long[]> l(String $$0) {
      return this.x.get($$0) instanceof uh $$1 ? Optional.of($$1.g()) : Optional.empty();
   }

   public Optional<ua> m(String $$0) {
      return this.x.get($$0) instanceof ua $$1 ? Optional.of($$1) : Optional.empty();
   }

   public ua n(String $$0) {
      return this.m($$0).orElseGet(ua::new);
   }

   public Optional<ug> o(String $$0) {
      return this.x.get($$0) instanceof ug $$1 ? Optional.of($$1) : Optional.empty();
   }

   public ug p(String $$0) {
      return this.o($$0).orElseGet(ug::new);
   }

   public Optional<Boolean> q(String $$0) {
      return this.s($$0).flatMap(va::v);
   }

   public boolean b(String $$0, boolean $$1) {
      return this.b($$0, (byte)($$1 ? 1 : 0)) != 0;
   }

   public void r(String $$0) {
      this.x.remove($$0);
   }

   @Override
   public String toString() {
      uz $$0 = new uz();
      $$0.a(this);
      return $$0.a();
   }

   public boolean j() {
      return this.x.isEmpty();
   }

   protected ua k() {
      return new ua(new HashMap<>(this.x));
   }

   public ua l() {
      HashMap<String, va> $$0 = new HashMap<>();
      this.x.forEach(($$1, $$2) -> $$0.put($$1, $$2.d()));
      return new ua($$0);
   }

   @Override
   public Optional<ua> s_() {
      return Optional.of(this);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof ua && Objects.equals(this.x, ((ua)$$0).x);
   }

   @Override
   public int hashCode() {
      return this.x.hashCode();
   }

   private static void a(String $$0, va $$1, DataOutput $$2) throws IOException {
      $$2.writeByte($$1.b());
      if ($$1.b() != 0) {
         $$2.writeUTF($$0);
         $$1.a($$2);
      }
   }

   static va a(vc<?> $$0, String $$1, DataInput $$2, uj $$3) {
      try {
         return $$0.c($$2, $$3);
      } catch (IOException var7) {
         p $$5 = p.a(var7, "Loading NBT data");
         q $$6 = $$5.a("NBT Tag");
         $$6.a("Tag name", $$1);
         $$6.a("Tag type", $$0.a());
         throw new us($$5);
      }
   }

   public ua a(ua $$0) {
      for (String $$1 : $$0.x.keySet()) {
         va $$2 = $$0.x.get($$1);
         if ($$2 instanceof ua $$3 && this.x.get($$1) instanceof ua $$4) {
            $$4.a($$3);
            continue;
         }

         this.a($$1, $$2.d());
      }

      return this;
   }

   @Override
   public void a(ve $$0) {
      $$0.a(this);
   }

   @Override
   public ux.b a(ux $$0) {
      for (Entry<String, va> $$1 : this.x.entrySet()) {
         va $$2 = $$1.getValue();
         vc<?> $$3 = $$2.c();
         ux.a $$4 = $$0.a($$3);
         switch ($$4) {
            case d:
               return ux.b.c;
            case c:
               return $$0.b();
            case b:
               break;
            default:
               $$4 = $$0.a($$3, $$1.getKey());
               switch ($$4) {
                  case d:
                     return ux.b.c;
                  case c:
                     return $$0.b();
                  case b:
                     break;
                  default:
                     ux.b $$5 = $$2.a($$0);
                     switch ($$5) {
                        case c:
                           return ux.b.c;
                        case b:
                           return $$0.b();
                     }
               }
         }
      }

      return $$0.b();
   }

   public <T> void a(String $$0, Codec<T> $$1, T $$2) {
      this.a($$0, $$1, uo.a, $$2);
   }

   public <T> void b(String $$0, Codec<T> $$1, @Nullable T $$2) {
      if ($$2 != null) {
         this.a($$0, $$1, $$2);
      }
   }

   public <T> void a(String $$0, Codec<T> $$1, DynamicOps<va> $$2, T $$3) {
      this.a($$0, (va)$$1.encodeStart($$2, $$3).getOrThrow());
   }

   public <T> void b(String $$0, Codec<T> $$1, DynamicOps<va> $$2, @Nullable T $$3) {
      if ($$3 != null) {
         this.a($$0, $$1, $$2, $$3);
      }
   }

   public <T> void a(MapCodec<T> $$0, T $$1) {
      this.a($$0, uo.a, $$1);
   }

   public <T> void a(MapCodec<T> $$0, DynamicOps<va> $$1, T $$2) {
      this.a((ua)$$0.encoder().encodeStart($$1, $$2).getOrThrow());
   }

   public <T> Optional<T> a(String $$0, Codec<T> $$1) {
      return this.a($$0, $$1, uo.a);
   }

   public <T> Optional<T> a(String $$0, Codec<T> $$1, DynamicOps<va> $$2) {
      va $$3 = this.a($$0);
      return $$3 == null
         ? Optional.empty()
         : $$1.parse($$2, $$3).resultOrPartial($$2x -> c.error("Failed to read field ({}={}): {}", new Object[]{$$0, $$3, $$2x}));
   }

   public <T> Optional<T> a(MapCodec<T> $$0) {
      return this.a($$0, uo.a);
   }

   public <T> Optional<T> a(MapCodec<T> $$0, DynamicOps<va> $$1) {
      return $$0.decode($$1, (MapLike)$$1.getMap(this).getOrThrow()).resultOrPartial($$0x -> c.error("Failed to read value ({}): {}", this, $$0x));
   }
}
