import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class ud implements va {
   public static final Codec<ud> a = Codec.PASSTHROUGH.comapFlatMap($$0 -> {
      va $$1 = (va)$$0.convert(ur.a).getValue();
      return $$1 instanceof ud $$2 ? DataResult.success($$2 == $$0.getValue() ? $$2.h() : $$2) : DataResult.error(() -> "Not a compound tag: " + $$1);
   }, $$0 -> new Dynamic(ur.a, $$0.h()));
   private static final int c = 48;
   private static final int w = 32;
   public static final vc<ud> b = new vc.b<ud>() {
      public ud a(DataInput $$0, um $$1) throws IOException {
         $$1.b();

         ud var3;
         try {
            var3 = d($$0, $$1);
         } finally {
            $$1.c();
         }

         return var3;
      }

      private static ud d(DataInput $$0, um $$1) throws IOException {
         $$1.b(48L);
         Map<String, va> $$2 = Maps.newHashMap();

         byte $$3;
         while (($$3 = $$0.readByte()) != 0) {
            String $$4 = e($$0, $$1);
            va $$5 = ud.a(vd.a($$3), $$4, $$0, $$1);
            if ($$2.put($$4, $$5) == null) {
               $$1.b(36L);
            }
         }

         return new ud($$2);
      }

      @Override
      public ux.b a(DataInput $$0, ux $$1, um $$2) throws IOException {
         $$2.b();

         ux.b var4;
         try {
            var4 = c($$0, $$1, $$2);
         } finally {
            $$2.c();
         }

         return var4;
      }

      private static ux.b c(DataInput $$0, ux $$1, um $$2) throws IOException {
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

      private static String e(DataInput $$0, um $$1) throws IOException {
         String $$2 = $$0.readUTF();
         $$1.b(28L);
         $$1.a(2L, (long)$$2.length());
         return $$2;
      }

      @Override
      public void b(DataInput $$0, um $$1) throws IOException {
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

   protected ud(Map<String, va> $$0) {
      this.x = $$0;
   }

   public ud() {
      this(Maps.newHashMap());
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

   @Override
   public byte b() {
      return 10;
   }

   @Override
   public vc<ud> c() {
      return b;
   }

   public int f() {
      return this.x.size();
   }

   @Nullable
   public va a(String $$0, va $$1) {
      return this.x.put($$0, $$1);
   }

   public void a(String $$0, byte $$1) {
      this.x.put($$0, ub.a($$1));
   }

   public void a(String $$0, short $$1) {
      this.x.put($$0, uv.a($$1));
   }

   public void a(String $$0, int $$1) {
      this.x.put($$0, ui.a($$1));
   }

   public void a(String $$0, long $$1) {
      this.x.put($$0, ul.a($$1));
   }

   public void a(String $$0, UUID $$1) {
      this.x.put($$0, us.a($$1));
   }

   public UUID a(String $$0) {
      return us.a(this.c($$0));
   }

   public boolean b(String $$0) {
      va $$1 = this.c($$0);
      return $$1 != null && $$1.c() == uh.a && ((uh)$$1).g().length == 4;
   }

   public void a(String $$0, float $$1) {
      this.x.put($$0, ug.a($$1));
   }

   public void a(String $$0, double $$1) {
      this.x.put($$0, ue.a($$1));
   }

   public void a(String $$0, String $$1) {
      this.x.put($$0, uy.a($$1));
   }

   public void a(String $$0, byte[] $$1) {
      this.x.put($$0, new ua($$1));
   }

   public void a(String $$0, List<Byte> $$1) {
      this.x.put($$0, new ua($$1));
   }

   public void a(String $$0, int[] $$1) {
      this.x.put($$0, new uh($$1));
   }

   public void b(String $$0, List<Integer> $$1) {
      this.x.put($$0, new uh($$1));
   }

   public void a(String $$0, long[] $$1) {
      this.x.put($$0, new uk($$1));
   }

   public void c(String $$0, List<Long> $$1) {
      this.x.put($$0, new uk($$1));
   }

   public void a(String $$0, boolean $$1) {
      this.x.put($$0, ub.a($$1));
   }

   @Nullable
   public va c(String $$0) {
      return this.x.get($$0);
   }

   public byte d(String $$0) {
      va $$1 = this.x.get($$0);
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
            return ((ut)this.x.get($$0)).i();
         }
      } catch (ClassCastException var3) {
      }

      return 0;
   }

   public short g(String $$0) {
      try {
         if (this.b($$0, 99)) {
            return ((ut)this.x.get($$0)).h();
         }
      } catch (ClassCastException var3) {
      }

      return 0;
   }

   public int h(String $$0) {
      try {
         if (this.b($$0, 99)) {
            return ((ut)this.x.get($$0)).g();
         }
      } catch (ClassCastException var3) {
      }

      return 0;
   }

   public long i(String $$0) {
      try {
         if (this.b($$0, 99)) {
            return ((ut)this.x.get($$0)).f();
         }
      } catch (ClassCastException var3) {
      }

      return 0L;
   }

   public float j(String $$0) {
      try {
         if (this.b($$0, 99)) {
            return ((ut)this.x.get($$0)).k();
         }
      } catch (ClassCastException var3) {
      }

      return 0.0F;
   }

   public double k(String $$0) {
      try {
         if (this.b($$0, 99)) {
            return ((ut)this.x.get($$0)).j();
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
            return ((ua)this.x.get($$0)).e();
         }
      } catch (ClassCastException var3) {
         throw new y(this.a($$0, ua.a, var3));
      }

      return new byte[0];
   }

   public int[] n(String $$0) {
      try {
         if (this.b($$0, 11)) {
            return ((uh)this.x.get($$0)).g();
         }
      } catch (ClassCastException var3) {
         throw new y(this.a($$0, uh.a, var3));
      }

      return new int[0];
   }

   public long[] o(String $$0) {
      try {
         if (this.b($$0, 12)) {
            return ((uk)this.x.get($$0)).g();
         }
      } catch (ClassCastException var3) {
         throw new y(this.a($$0, uk.a, var3));
      }

      return new long[0];
   }

   public ud p(String $$0) {
      try {
         if (this.b($$0, 10)) {
            return (ud)this.x.get($$0);
         }
      } catch (ClassCastException var3) {
         throw new y(this.a($$0, b, var3));
      }

      return new ud();
   }

   public uj c(String $$0, int $$1) {
      try {
         if (this.d($$0) == 9) {
            uj $$2 = (uj)this.x.get($$0);
            if (!$$2.isEmpty() && $$2.f() != $$1) {
               return new uj();
            }

            return $$2;
         }
      } catch (ClassCastException var4) {
         throw new y(this.a($$0, uj.a, var4));
      }

      return new uj();
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

   private o a(String $$0, vc<?> $$1, ClassCastException $$2) {
      o $$3 = o.a($$2, "Reading NBT data");
      p $$4 = $$3.a("Corrupt NBT tag", 1);
      $$4.a("Tag type found", () -> this.x.get($$0).c().a());
      $$4.a("Tag type expected", $$1::a);
      $$4.a("Tag name", $$0);
      return $$3;
   }

   public ud h() {
      Map<String, va> $$0 = Maps.newHashMap(Maps.transformValues(this.x, va::d));
      return new ud($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof ud && Objects.equals(this.x, ((ud)$$0).x);
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

   static va a(vc<?> $$0, String $$1, DataInput $$2, um $$3) {
      try {
         return $$0.c($$2, $$3);
      } catch (IOException var7) {
         o $$5 = o.a(var7, "Loading NBT data");
         p $$6 = $$5.a("NBT Tag");
         $$6.a("Tag name", $$1);
         $$6.a("Tag type", $$0.a());
         throw new uu($$5);
      }
   }

   public ud a(ud $$0) {
      for (String $$1 : $$0.x.keySet()) {
         va $$2 = $$0.x.get($$1);
         if ($$2.b() == 10) {
            if (this.b($$1, 10)) {
               ud $$3 = this.p($$1);
               $$3.a((ud)$$2);
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
   public void a(ve $$0) {
      $$0.a(this);
   }

   protected Map<String, va> i() {
      return Collections.unmodifiableMap(this.x);
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
}
