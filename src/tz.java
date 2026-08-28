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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class tz implements uw {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<tz> a = Codec.PASSTHROUGH.comapFlatMap($$0 -> {
      uw $$1 = (uw)$$0.convert(un.a).getValue();
      return $$1 instanceof tz $$2 ? DataResult.success($$2 == $$0.getValue() ? $$2.i() : $$2) : DataResult.error(() -> "Not a compound tag: " + $$1);
   }, $$0 -> new Dynamic(un.a, $$0.i()));
   private static final int w = 48;
   private static final int x = 32;
   public static final uy<tz> b = new uy.b<tz>() {
      public tz a(DataInput $$0, ui $$1) throws IOException {
         $$1.b();

         tz var3;
         try {
            var3 = d($$0, $$1);
         } finally {
            $$1.c();
         }

         return var3;
      }

      private static tz d(DataInput $$0, ui $$1) throws IOException {
         $$1.b(48L);
         Map<String, uw> $$2 = Maps.newHashMap();

         byte $$3;
         while (($$3 = $$0.readByte()) != 0) {
            String $$4 = e($$0, $$1);
            uw $$5 = tz.a(uz.a($$3), $$4, $$0, $$1);
            if ($$2.put($$4, $$5) == null) {
               $$1.b(36L);
            }
         }

         return new tz($$2);
      }

      @Override
      public ut.b a(DataInput $$0, ut $$1, ui $$2) throws IOException {
         $$2.b();

         ut.b var4;
         try {
            var4 = c($$0, $$1, $$2);
         } finally {
            $$2.c();
         }

         return var4;
      }

      private static ut.b c(DataInput $$0, ut $$1, ui $$2) throws IOException {
         $$2.b(48L);

         byte $$3;
         label35:
         while (($$3 = $$0.readByte()) != 0) {
            uy<?> $$4 = uz.a($$3);
            switch ($$1.a($$4)) {
               case d:
                  return ut.b.c;
               case c:
                  uu.a($$0);
                  $$4.b($$0, $$2);
                  break label35;
               case b:
                  uu.a($$0);
                  $$4.b($$0, $$2);
                  break;
               default:
                  String $$5 = e($$0, $$2);
                  switch ($$1.a($$4, $$5)) {
                     case d:
                        return ut.b.c;
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
                              return ut.b.c;
                           case b:
                        }
                  }
            }
         }

         if ($$3 != 0) {
            while (($$3 = $$0.readByte()) != 0) {
               uu.a($$0);
               uz.a($$3).b($$0, $$2);
            }
         }

         return $$1.b();
      }

      private static String e(DataInput $$0, ui $$1) throws IOException {
         String $$2 = $$0.readUTF();
         $$1.b(28L);
         $$1.a(2L, (long)$$2.length());
         return $$2;
      }

      @Override
      public void b(DataInput $$0, ui $$1) throws IOException {
         $$1.b();

         byte $$2;
         try {
            while (($$2 = $$0.readByte()) != 0) {
               uu.a($$0);
               uz.a($$2).b($$0, $$1);
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
   private final Map<String, uw> y;

   protected tz(Map<String, uw> $$0) {
      this.y = $$0;
   }

   public tz() {
      this(Maps.newHashMap());
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      for (String $$1 : this.y.keySet()) {
         uw $$2 = this.y.get($$1);
         a($$1, $$2, $$0);
      }

      $$0.writeByte(0);
   }

   @Override
   public int a() {
      int $$0 = 48;

      for (Entry<String, uw> $$1 : this.y.entrySet()) {
         $$0 += 28 + 2 * $$1.getKey().length();
         $$0 += 36;
         $$0 += $$1.getValue().a();
      }

      return $$0;
   }

   public Set<String> e() {
      return this.y.keySet();
   }

   @Override
   public byte b() {
      return 10;
   }

   @Override
   public uy<tz> c() {
      return b;
   }

   public int f() {
      return this.y.size();
   }

   @Nullable
   public uw a(String $$0, uw $$1) {
      return this.y.put($$0, $$1);
   }

   public void a(String $$0, byte $$1) {
      this.y.put($$0, tx.a($$1));
   }

   public void a(String $$0, short $$1) {
      this.y.put($$0, ur.a($$1));
   }

   public void a(String $$0, int $$1) {
      this.y.put($$0, ue.a($$1));
   }

   public void a(String $$0, long $$1) {
      this.y.put($$0, uh.a($$1));
   }

   public void a(String $$0, float $$1) {
      this.y.put($$0, uc.a($$1));
   }

   public void a(String $$0, double $$1) {
      this.y.put($$0, ua.a($$1));
   }

   public void a(String $$0, String $$1) {
      this.y.put($$0, uu.a($$1));
   }

   public void a(String $$0, byte[] $$1) {
      this.y.put($$0, new tw($$1));
   }

   public void a(String $$0, List<Byte> $$1) {
      this.y.put($$0, new tw($$1));
   }

   public void a(String $$0, int[] $$1) {
      this.y.put($$0, new ud($$1));
   }

   public void b(String $$0, List<Integer> $$1) {
      this.y.put($$0, new ud($$1));
   }

   public void a(String $$0, long[] $$1) {
      this.y.put($$0, new ug($$1));
   }

   public void c(String $$0, List<Long> $$1) {
      this.y.put($$0, new ug($$1));
   }

   public void a(String $$0, boolean $$1) {
      this.y.put($$0, tx.a($$1));
   }

   @Nullable
   public uw a(String $$0) {
      return this.y.get($$0);
   }

   public byte b(String $$0) {
      uw $$1 = this.y.get($$0);
      return $$1 == null ? 0 : $$1.b();
   }

   public boolean c(String $$0) {
      return this.y.containsKey($$0);
   }

   public boolean b(String $$0, int $$1) {
      int $$2 = this.b($$0);
      if ($$2 == $$1) {
         return true;
      } else {
         return $$1 != 99 ? false : $$2 == 1 || $$2 == 2 || $$2 == 3 || $$2 == 4 || $$2 == 5 || $$2 == 6;
      }
   }

   public byte d(String $$0) {
      try {
         if (this.b($$0, 99)) {
            return ((up)this.y.get($$0)).i();
         }
      } catch (ClassCastException var3) {
      }

      return 0;
   }

   public short e(String $$0) {
      try {
         if (this.b($$0, 99)) {
            return ((up)this.y.get($$0)).h();
         }
      } catch (ClassCastException var3) {
      }

      return 0;
   }

   public int f(String $$0) {
      return this.c($$0, 0);
   }

   public int c(String $$0, int $$1) {
      try {
         if (this.b($$0, 99)) {
            return ((up)this.y.get($$0)).g();
         }
      } catch (ClassCastException var4) {
      }

      return $$1;
   }

   public long g(String $$0) {
      return this.b($$0, 0L);
   }

   public long b(String $$0, long $$1) {
      try {
         if (this.b($$0, 99)) {
            return ((up)this.y.get($$0)).f();
         }
      } catch (ClassCastException var5) {
      }

      return $$1;
   }

   public float h(String $$0) {
      return this.b($$0, 0.0F);
   }

   public float b(String $$0, float $$1) {
      try {
         if (this.b($$0, 99)) {
            return ((up)this.y.get($$0)).k();
         }
      } catch (ClassCastException var4) {
      }

      return $$1;
   }

   public double i(String $$0) {
      try {
         if (this.b($$0, 99)) {
            return ((up)this.y.get($$0)).j();
         }
      } catch (ClassCastException var3) {
      }

      return 0.0;
   }

   public String j(String $$0) {
      try {
         if (this.b($$0, 8)) {
            return this.y.get($$0).p_();
         }
      } catch (ClassCastException var3) {
      }

      return "";
   }

   public byte[] k(String $$0) {
      try {
         if (this.b($$0, 7)) {
            return ((tw)this.y.get($$0)).e();
         }
      } catch (ClassCastException var3) {
         throw new aa(this.a($$0, tw.a, var3));
      }

      return new byte[0];
   }

   public int[] l(String $$0) {
      try {
         if (this.b($$0, 11)) {
            return ((ud)this.y.get($$0)).g();
         }
      } catch (ClassCastException var3) {
         throw new aa(this.a($$0, ud.a, var3));
      }

      return new int[0];
   }

   public long[] m(String $$0) {
      try {
         if (this.b($$0, 12)) {
            return ((ug)this.y.get($$0)).g();
         }
      } catch (ClassCastException var3) {
         throw new aa(this.a($$0, ug.a, var3));
      }

      return new long[0];
   }

   public tz n(String $$0) {
      try {
         if (this.b($$0, 10)) {
            return (tz)this.y.get($$0);
         }
      } catch (ClassCastException var3) {
         throw new aa(this.a($$0, b, var3));
      }

      return new tz();
   }

   public uf d(String $$0, int $$1) {
      try {
         if (this.b($$0) == 9) {
            uf $$2 = (uf)this.y.get($$0);
            if (!$$2.isEmpty() && $$2.f() != $$1) {
               return new uf();
            }

            return $$2;
         }
      } catch (ClassCastException var4) {
         throw new aa(this.a($$0, uf.a, var4));
      }

      return new uf();
   }

   public boolean o(String $$0) {
      return this.d($$0) != 0;
   }

   public void p(String $$0) {
      this.y.remove($$0);
   }

   @Override
   public String toString() {
      return this.p_();
   }

   public boolean g() {
      return this.y.isEmpty();
   }

   private p a(String $$0, uy<?> $$1, ClassCastException $$2) {
      p $$3 = p.a($$2, "Reading NBT data");
      q $$4 = $$3.a("Corrupt NBT tag", 1);
      $$4.a("Tag type found", () -> this.y.get($$0).c().a());
      $$4.a("Tag type expected", $$1::a);
      $$4.a("Tag name", $$0);
      return $$3;
   }

   protected tz h() {
      return new tz(new HashMap<>(this.y));
   }

   public tz i() {
      return new tz(ag.a(this.y, uw::d));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof tz && Objects.equals(this.y, ((tz)$$0).y);
   }

   @Override
   public int hashCode() {
      return this.y.hashCode();
   }

   private static void a(String $$0, uw $$1, DataOutput $$2) throws IOException {
      $$2.writeByte($$1.b());
      if ($$1.b() != 0) {
         $$2.writeUTF($$0);
         $$1.a($$2);
      }
   }

   static uw a(uy<?> $$0, String $$1, DataInput $$2, ui $$3) {
      try {
         return $$0.c($$2, $$3);
      } catch (IOException var7) {
         p $$5 = p.a(var7, "Loading NBT data");
         q $$6 = $$5.a("NBT Tag");
         $$6.a("Tag name", $$1);
         $$6.a("Tag type", $$0.a());
         throw new uq($$5);
      }
   }

   public tz a(tz $$0) {
      for (String $$1 : $$0.y.keySet()) {
         uw $$2 = $$0.y.get($$1);
         if ($$2.b() == 10) {
            if (this.b($$1, 10)) {
               tz $$3 = this.n($$1);
               $$3.a((tz)$$2);
            } else {
               this.a($$1, $$2.d());
            }
         } else {
            this.a($$1, $$2.d());
         }
      }

      return this;
   }

   @Override
   public void a(va $$0) {
      $$0.a(this);
   }

   protected Set<Entry<String, uw>> j() {
      return this.y.entrySet();
   }

   @Override
   public ut.b a(ut $$0) {
      for (Entry<String, uw> $$1 : this.y.entrySet()) {
         uw $$2 = $$1.getValue();
         uy<?> $$3 = $$2.c();
         ut.a $$4 = $$0.a($$3);
         switch ($$4) {
            case d:
               return ut.b.c;
            case c:
               return $$0.b();
            case b:
               break;
            default:
               $$4 = $$0.a($$3, $$1.getKey());
               switch ($$4) {
                  case d:
                     return ut.b.c;
                  case c:
                     return $$0.b();
                  case b:
                     break;
                  default:
                     ut.b $$5 = $$2.a($$0);
                     switch ($$5) {
                        case c:
                           return ut.b.c;
                        case b:
                           return $$0.b();
                     }
               }
         }
      }

      return $$0.b();
   }

   public <T> void a(String $$0, Codec<T> $$1, T $$2) {
      this.a($$0, $$1, un.a, $$2);
   }

   public <T> void b(String $$0, Codec<T> $$1, @Nullable T $$2) {
      if ($$2 != null) {
         this.a($$0, $$1, $$2);
      }
   }

   public <T> void a(String $$0, Codec<T> $$1, DynamicOps<uw> $$2, T $$3) {
      this.a($$0, (uw)$$1.encodeStart($$2, $$3).getOrThrow());
   }

   public <T> void b(String $$0, Codec<T> $$1, DynamicOps<uw> $$2, @Nullable T $$3) {
      if ($$3 != null) {
         this.a($$0, $$1, $$2, $$3);
      }
   }

   public <T> void a(MapCodec<T> $$0, T $$1) {
      this.a($$0, un.a, $$1);
   }

   public <T> void a(MapCodec<T> $$0, DynamicOps<uw> $$1, T $$2) {
      this.a((tz)$$0.encoder().encodeStart($$1, $$2).getOrThrow());
   }

   public <T> Optional<T> a(String $$0, Codec<T> $$1) {
      return this.a($$0, $$1, un.a);
   }

   public <T> Optional<T> a(String $$0, Codec<T> $$1, DynamicOps<uw> $$2) {
      uw $$3 = this.a($$0);
      return $$3 == null
         ? Optional.empty()
         : $$1.parse($$2, $$3).resultOrPartial($$2x -> c.error("Failed to read field ({}={}): {}", new Object[]{$$0, $$3, $$2x}));
   }

   public <T> Optional<T> a(MapCodec<T> $$0) {
      return this.a($$0, un.a);
   }

   public <T> Optional<T> a(MapCodec<T> $$0, DynamicOps<uw> $$1) {
      return $$0.decode($$1, (MapLike)$$1.getMap(this).getOrThrow()).resultOrPartial($$0x -> c.error("Failed to read value ({}): {}", this, $$0x));
   }
}
