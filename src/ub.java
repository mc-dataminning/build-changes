import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class ub implements uy {
   public static final Codec<ub> a = Codec.PASSTHROUGH.comapFlatMap($$0 -> {
      uy $$1 = (uy)$$0.convert(up.a).getValue();
      return $$1 instanceof ub $$2 ? DataResult.success($$2 == $$0.getValue() ? $$2.i() : $$2) : DataResult.error(() -> "Not a compound tag: " + $$1);
   }, $$0 -> new Dynamic(up.a, $$0.i()));
   private static final int c = 48;
   private static final int w = 32;
   public static final va<ub> b = new va.b<ub>() {
      public ub a(DataInput $$0, uk $$1) throws IOException {
         $$1.b();

         ub var3;
         try {
            var3 = d($$0, $$1);
         } finally {
            $$1.c();
         }

         return var3;
      }

      private static ub d(DataInput $$0, uk $$1) throws IOException {
         $$1.b(48L);
         Map<String, uy> $$2 = Maps.newHashMap();

         byte $$3;
         while (($$3 = $$0.readByte()) != 0) {
            String $$4 = e($$0, $$1);
            uy $$5 = ub.a(vb.a($$3), $$4, $$0, $$1);
            if ($$2.put($$4, $$5) == null) {
               $$1.b(36L);
            }
         }

         return new ub($$2);
      }

      @Override
      public uv.b a(DataInput $$0, uv $$1, uk $$2) throws IOException {
         $$2.b();

         uv.b var4;
         try {
            var4 = c($$0, $$1, $$2);
         } finally {
            $$2.c();
         }

         return var4;
      }

      private static uv.b c(DataInput $$0, uv $$1, uk $$2) throws IOException {
         $$2.b(48L);

         byte $$3;
         label35:
         while (($$3 = $$0.readByte()) != 0) {
            va<?> $$4 = vb.a($$3);
            switch ($$1.a($$4)) {
               case d:
                  return uv.b.c;
               case c:
                  uw.a($$0);
                  $$4.b($$0, $$2);
                  break label35;
               case b:
                  uw.a($$0);
                  $$4.b($$0, $$2);
                  break;
               default:
                  String $$5 = e($$0, $$2);
                  switch ($$1.a($$4, $$5)) {
                     case d:
                        return uv.b.c;
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
                              return uv.b.c;
                           case b:
                        }
                  }
            }
         }

         if ($$3 != 0) {
            while (($$3 = $$0.readByte()) != 0) {
               uw.a($$0);
               vb.a($$3).b($$0, $$2);
            }
         }

         return $$1.b();
      }

      private static String e(DataInput $$0, uk $$1) throws IOException {
         String $$2 = $$0.readUTF();
         $$1.b(28L);
         $$1.a(2L, (long)$$2.length());
         return $$2;
      }

      @Override
      public void b(DataInput $$0, uk $$1) throws IOException {
         $$1.b();

         byte $$2;
         try {
            while (($$2 = $$0.readByte()) != 0) {
               uw.a($$0);
               vb.a($$2).b($$0, $$1);
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
   private final Map<String, uy> x;

   protected ub(Map<String, uy> $$0) {
      this.x = $$0;
   }

   public ub() {
      this(Maps.newHashMap());
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      for (String $$1 : this.x.keySet()) {
         uy $$2 = this.x.get($$1);
         a($$1, $$2, $$0);
      }

      $$0.writeByte(0);
   }

   @Override
   public int a() {
      int $$0 = 48;

      for (Entry<String, uy> $$1 : this.x.entrySet()) {
         $$0 += 28 + 2 * $$1.getKey().length();
         $$0 += 36;
         $$0 += $$1.getValue().a();
      }

      return $$0;
   }

   public Set<String> e() {
      return this.x.keySet();
   }

   @Override
   public byte b() {
      return 10;
   }

   @Override
   public va<ub> c() {
      return b;
   }

   public int f() {
      return this.x.size();
   }

   @Nullable
   public uy a(String $$0, uy $$1) {
      return this.x.put($$0, $$1);
   }

   public void a(String $$0, byte $$1) {
      this.x.put($$0, tz.a($$1));
   }

   public void a(String $$0, short $$1) {
      this.x.put($$0, ut.a($$1));
   }

   public void a(String $$0, int $$1) {
      this.x.put($$0, ug.a($$1));
   }

   public void a(String $$0, long $$1) {
      this.x.put($$0, uj.a($$1));
   }

   public void a(String $$0, UUID $$1) {
      this.x.put($$0, uq.a($$1));
   }

   public UUID a(String $$0) {
      return uq.a(this.c($$0));
   }

   public boolean b(String $$0) {
      uy $$1 = this.c($$0);
      return $$1 != null && $$1.c() == uf.a && ((uf)$$1).g().length == 4;
   }

   public void a(String $$0, float $$1) {
      this.x.put($$0, ue.a($$1));
   }

   public void a(String $$0, double $$1) {
      this.x.put($$0, uc.a($$1));
   }

   public void a(String $$0, String $$1) {
      this.x.put($$0, uw.a($$1));
   }

   public void a(String $$0, byte[] $$1) {
      this.x.put($$0, new ty($$1));
   }

   public void a(String $$0, List<Byte> $$1) {
      this.x.put($$0, new ty($$1));
   }

   public void a(String $$0, int[] $$1) {
      this.x.put($$0, new uf($$1));
   }

   public void b(String $$0, List<Integer> $$1) {
      this.x.put($$0, new uf($$1));
   }

   public void a(String $$0, long[] $$1) {
      this.x.put($$0, new ui($$1));
   }

   public void c(String $$0, List<Long> $$1) {
      this.x.put($$0, new ui($$1));
   }

   public void a(String $$0, boolean $$1) {
      this.x.put($$0, tz.a($$1));
   }

   @Nullable
   public uy c(String $$0) {
      return this.x.get($$0);
   }

   public byte d(String $$0) {
      uy $$1 = this.x.get($$0);
      return $$1 == null ? 0 : $$1.b();
   }

   public boolean e(String $$0) {
      return this.x.containsKey($$0);
   }

   public boolean b(String $$0, int $$1) {
      int $$2 = this.d($$0);
      if ($$2 == $$1) {
         return true;
      } else {
         return $$1 != 99 ? false : $$2 == 1 || $$2 == 2 || $$2 == 3 || $$2 == 4 || $$2 == 5 || $$2 == 6;
      }
   }

   public byte f(String $$0) {
      try {
         if (this.b($$0, 99)) {
            return ((ur)this.x.get($$0)).i();
         }
      } catch (ClassCastException var3) {
      }

      return 0;
   }

   public short g(String $$0) {
      try {
         if (this.b($$0, 99)) {
            return ((ur)this.x.get($$0)).h();
         }
      } catch (ClassCastException var3) {
      }

      return 0;
   }

   public int h(String $$0) {
      try {
         if (this.b($$0, 99)) {
            return ((ur)this.x.get($$0)).g();
         }
      } catch (ClassCastException var3) {
      }

      return 0;
   }

   public long i(String $$0) {
      try {
         if (this.b($$0, 99)) {
            return ((ur)this.x.get($$0)).f();
         }
      } catch (ClassCastException var3) {
      }

      return 0L;
   }

   public float j(String $$0) {
      try {
         if (this.b($$0, 99)) {
            return ((ur)this.x.get($$0)).k();
         }
      } catch (ClassCastException var3) {
      }

      return 0.0F;
   }

   public double k(String $$0) {
      try {
         if (this.b($$0, 99)) {
            return ((ur)this.x.get($$0)).j();
         }
      } catch (ClassCastException var3) {
      }

      return 0.0;
   }

   public String l(String $$0) {
      try {
         if (this.b($$0, 8)) {
            return this.x.get($$0).s_();
         }
      } catch (ClassCastException var3) {
      }

      return "";
   }

   public byte[] m(String $$0) {
      try {
         if (this.b($$0, 7)) {
            return ((ty)this.x.get($$0)).e();
         }
      } catch (ClassCastException var3) {
         throw new z(this.a($$0, ty.a, var3));
      }

      return new byte[0];
   }

   public int[] n(String $$0) {
      try {
         if (this.b($$0, 11)) {
            return ((uf)this.x.get($$0)).g();
         }
      } catch (ClassCastException var3) {
         throw new z(this.a($$0, uf.a, var3));
      }

      return new int[0];
   }

   public long[] o(String $$0) {
      try {
         if (this.b($$0, 12)) {
            return ((ui)this.x.get($$0)).g();
         }
      } catch (ClassCastException var3) {
         throw new z(this.a($$0, ui.a, var3));
      }

      return new long[0];
   }

   public ub p(String $$0) {
      try {
         if (this.b($$0, 10)) {
            return (ub)this.x.get($$0);
         }
      } catch (ClassCastException var3) {
         throw new z(this.a($$0, b, var3));
      }

      return new ub();
   }

   public uh c(String $$0, int $$1) {
      try {
         if (this.d($$0) == 9) {
            uh $$2 = (uh)this.x.get($$0);
            if (!$$2.isEmpty() && $$2.f() != $$1) {
               return new uh();
            }

            return $$2;
         }
      } catch (ClassCastException var4) {
         throw new z(this.a($$0, uh.a, var4));
      }

      return new uh();
   }

   public boolean q(String $$0) {
      return this.f($$0) != 0;
   }

   public void r(String $$0) {
      this.x.remove($$0);
   }

   @Override
   public String toString() {
      return this.s_();
   }

   public boolean g() {
      return this.x.isEmpty();
   }

   private o a(String $$0, va<?> $$1, ClassCastException $$2) {
      o $$3 = o.a($$2, "Reading NBT data");
      p $$4 = $$3.a("Corrupt NBT tag", 1);
      $$4.a("Tag type found", () -> this.x.get($$0).c().a());
      $$4.a("Tag type expected", $$1::a);
      $$4.a("Tag name", $$0);
      return $$3;
   }

   protected ub h() {
      return new ub(new HashMap<>(this.x));
   }

   public ub i() {
      Map<String, uy> $$0 = Maps.newHashMap(Maps.transformValues(this.x, uy::d));
      return new ub($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof ub && Objects.equals(this.x, ((ub)$$0).x);
   }

   @Override
   public int hashCode() {
      return this.x.hashCode();
   }

   private static void a(String $$0, uy $$1, DataOutput $$2) throws IOException {
      $$2.writeByte($$1.b());
      if ($$1.b() != 0) {
         $$2.writeUTF($$0);
         $$1.a($$2);
      }
   }

   static uy a(va<?> $$0, String $$1, DataInput $$2, uk $$3) {
      try {
         return $$0.c($$2, $$3);
      } catch (IOException var7) {
         o $$5 = o.a(var7, "Loading NBT data");
         p $$6 = $$5.a("NBT Tag");
         $$6.a("Tag name", $$1);
         $$6.a("Tag type", $$0.a());
         throw new us($$5);
      }
   }

   public ub a(ub $$0) {
      for (String $$1 : $$0.x.keySet()) {
         uy $$2 = $$0.x.get($$1);
         if ($$2.b() == 10) {
            if (this.b($$1, 10)) {
               ub $$3 = this.p($$1);
               $$3.a((ub)$$2);
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
   public void a(vc $$0) {
      $$0.a(this);
   }

   protected Set<Entry<String, uy>> j() {
      return this.x.entrySet();
   }

   @Override
   public uv.b a(uv $$0) {
      for (Entry<String, uy> $$1 : this.x.entrySet()) {
         uy $$2 = $$1.getValue();
         va<?> $$3 = $$2.c();
         uv.a $$4 = $$0.a($$3);
         switch ($$4) {
            case d:
               return uv.b.c;
            case c:
               return $$0.b();
            case b:
               break;
            default:
               $$4 = $$0.a($$3, $$1.getKey());
               switch ($$4) {
                  case d:
                     return uv.b.c;
                  case c:
                     return $$0.b();
                  case b:
                     break;
                  default:
                     uv.b $$5 = $$2.a($$0);
                     switch ($$5) {
                        case c:
                           return uv.b.c;
                        case b:
                           return $$0.b();
                     }
               }
         }
      }

      return $$0.b();
   }
}
