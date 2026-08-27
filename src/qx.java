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

public class qx implements rq {
   public static final Codec<qx> a = Codec.PASSTHROUGH.comapFlatMap($$0 -> {
      rq $$1 = (rq)$$0.convert(ri.a).getValue();
      return $$1 instanceof qx ? DataResult.success((qx)$$1) : DataResult.error(() -> "Not a compound tag: " + $$1);
   }, $$0 -> new Dynamic(ri.a, $$0));
   private static final int c = 48;
   private static final int w = 32;
   public static final rs<qx> b = new rs.b<qx>() {
      public qx a(DataInput $$0, int $$1, rg $$2) throws IOException {
         $$2.a(48L);
         if ($$1 > 512) {
            throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
         } else {
            Map<String, rq> $$3 = Maps.newHashMap();

            byte $$4;
            while (($$4 = qx.a($$0, $$2)) != 0) {
               String $$5 = qx.b($$0, $$2);
               $$2.a((long)(28 + 2 * $$5.length()));
               rq $$6 = qx.a(rt.a($$4), $$5, $$0, $$1 + 1, $$2);
               if ($$3.put($$5, $$6) == null) {
                  $$2.a(36L);
               }
            }

            return new qx($$3);
         }
      }

      @Override
      public rn.b a(DataInput $$0, rn $$1) throws IOException {
         byte $$2;
         label33:
         while (($$2 = $$0.readByte()) != 0) {
            rs<?> $$3 = rt.a($$2);
            switch ($$1.a($$3)) {
               case d:
                  return rn.b.c;
               case c:
                  ro.a($$0);
                  $$3.a($$0);
                  break label33;
               case b:
                  ro.a($$0);
                  $$3.a($$0);
                  break;
               default:
                  String $$4 = $$0.readUTF();
                  switch ($$1.a($$3, $$4)) {
                     case d:
                        return rn.b.c;
                     case c:
                        $$3.a($$0);
                        break label33;
                     case b:
                        $$3.a($$0);
                        break;
                     default:
                        switch ($$3.a($$0, $$1)) {
                           case c:
                              return rn.b.c;
                           case b:
                        }
                  }
            }
         }

         if ($$2 != 0) {
            while (($$2 = $$0.readByte()) != 0) {
               ro.a($$0);
               rt.a($$2).a($$0);
            }
         }

         return $$1.b();
      }

      @Override
      public void a(DataInput $$0) throws IOException {
         byte $$1;
         while (($$1 = $$0.readByte()) != 0) {
            ro.a($$0);
            rt.a($$1).a($$0);
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
   private final Map<String, rq> x;

   protected qx(Map<String, rq> $$0) {
      this.x = $$0;
   }

   public qx() {
      this(Maps.newHashMap());
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      for (String $$1 : this.x.keySet()) {
         rq $$2 = this.x.get($$1);
         a($$1, $$2, $$0);
      }

      $$0.writeByte(0);
   }

   @Override
   public int a() {
      int $$0 = 48;

      for (Entry<String, rq> $$1 : this.x.entrySet()) {
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
   public rs<qx> c() {
      return b;
   }

   public int f() {
      return this.x.size();
   }

   @Nullable
   public rq a(String $$0, rq $$1) {
      return this.x.put($$0, $$1);
   }

   public void a(String $$0, byte $$1) {
      this.x.put($$0, qv.a($$1));
   }

   public void a(String $$0, short $$1) {
      this.x.put($$0, rl.a($$1));
   }

   public void a(String $$0, int $$1) {
      this.x.put($$0, rc.a($$1));
   }

   public void a(String $$0, long $$1) {
      this.x.put($$0, rf.a($$1));
   }

   public void a(String $$0, UUID $$1) {
      this.x.put($$0, rj.a($$1));
   }

   public UUID a(String $$0) {
      return rj.a(this.c($$0));
   }

   public boolean b(String $$0) {
      rq $$1 = this.c($$0);
      return $$1 != null && $$1.c() == rb.a && ((rb)$$1).g().length == 4;
   }

   public void a(String $$0, float $$1) {
      this.x.put($$0, ra.a($$1));
   }

   public void a(String $$0, double $$1) {
      this.x.put($$0, qy.a($$1));
   }

   public void a(String $$0, String $$1) {
      this.x.put($$0, ro.a($$1));
   }

   public void a(String $$0, byte[] $$1) {
      this.x.put($$0, new qu($$1));
   }

   public void a(String $$0, List<Byte> $$1) {
      this.x.put($$0, new qu($$1));
   }

   public void a(String $$0, int[] $$1) {
      this.x.put($$0, new rb($$1));
   }

   public void b(String $$0, List<Integer> $$1) {
      this.x.put($$0, new rb($$1));
   }

   public void a(String $$0, long[] $$1) {
      this.x.put($$0, new re($$1));
   }

   public void c(String $$0, List<Long> $$1) {
      this.x.put($$0, new re($$1));
   }

   public void a(String $$0, boolean $$1) {
      this.x.put($$0, qv.a($$1));
   }

   @Nullable
   public rq c(String $$0) {
      return this.x.get($$0);
   }

   public byte d(String $$0) {
      rq $$1 = this.x.get($$0);
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
            return ((rk)this.x.get($$0)).i();
         }
      } catch (ClassCastException var3) {
      }

      return 0;
   }

   public short g(String $$0) {
      try {
         if (this.b($$0, 99)) {
            return ((rk)this.x.get($$0)).h();
         }
      } catch (ClassCastException var3) {
      }

      return 0;
   }

   public int h(String $$0) {
      try {
         if (this.b($$0, 99)) {
            return ((rk)this.x.get($$0)).g();
         }
      } catch (ClassCastException var3) {
      }

      return 0;
   }

   public long i(String $$0) {
      try {
         if (this.b($$0, 99)) {
            return ((rk)this.x.get($$0)).f();
         }
      } catch (ClassCastException var3) {
      }

      return 0L;
   }

   public float j(String $$0) {
      try {
         if (this.b($$0, 99)) {
            return ((rk)this.x.get($$0)).k();
         }
      } catch (ClassCastException var3) {
      }

      return 0.0F;
   }

   public double k(String $$0) {
      try {
         if (this.b($$0, 99)) {
            return ((rk)this.x.get($$0)).j();
         }
      } catch (ClassCastException var3) {
      }

      return 0.0;
   }

   public String l(String $$0) {
      try {
         if (this.b($$0, 8)) {
            return this.x.get($$0).r_();
         }
      } catch (ClassCastException var3) {
      }

      return "";
   }

   public byte[] m(String $$0) {
      try {
         if (this.b($$0, 7)) {
            return ((qu)this.x.get($$0)).e();
         }
      } catch (ClassCastException var3) {
         throw new y(this.a($$0, qu.a, var3));
      }

      return new byte[0];
   }

   public int[] n(String $$0) {
      try {
         if (this.b($$0, 11)) {
            return ((rb)this.x.get($$0)).g();
         }
      } catch (ClassCastException var3) {
         throw new y(this.a($$0, rb.a, var3));
      }

      return new int[0];
   }

   public long[] o(String $$0) {
      try {
         if (this.b($$0, 12)) {
            return ((re)this.x.get($$0)).g();
         }
      } catch (ClassCastException var3) {
         throw new y(this.a($$0, re.a, var3));
      }

      return new long[0];
   }

   public qx p(String $$0) {
      try {
         if (this.b($$0, 10)) {
            return (qx)this.x.get($$0);
         }
      } catch (ClassCastException var3) {
         throw new y(this.a($$0, b, var3));
      }

      return new qx();
   }

   public rd c(String $$0, int $$1) {
      try {
         if (this.d($$0) == 9) {
            rd $$2 = (rd)this.x.get($$0);
            if (!$$2.isEmpty() && $$2.f() != $$1) {
               return new rd();
            }

            return $$2;
         }
      } catch (ClassCastException var4) {
         throw new y(this.a($$0, rd.a, var4));
      }

      return new rd();
   }

   public boolean q(String $$0) {
      return this.f($$0) != 0;
   }

   public void r(String $$0) {
      this.x.remove($$0);
   }

   @Override
   public String toString() {
      return this.r_();
   }

   public boolean g() {
      return this.x.isEmpty();
   }

   private o a(String $$0, rs<?> $$1, ClassCastException $$2) {
      o $$3 = o.a($$2, "Reading NBT data");
      p $$4 = $$3.a("Corrupt NBT tag", 1);
      $$4.a("Tag type found", () -> this.x.get($$0).c().a());
      $$4.a("Tag type expected", $$1::a);
      $$4.a("Tag name", $$0);
      return $$3;
   }

   public qx h() {
      Map<String, rq> $$0 = Maps.newHashMap(Maps.transformValues(this.x, rq::d));
      return new qx($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof qx && Objects.equals(this.x, ((qx)$$0).x);
   }

   @Override
   public int hashCode() {
      return this.x.hashCode();
   }

   private static void a(String $$0, rq $$1, DataOutput $$2) throws IOException {
      $$2.writeByte($$1.b());
      if ($$1.b() != 0) {
         $$2.writeUTF($$0);
         $$1.a($$2);
      }
   }

   static byte a(DataInput $$0, rg $$1) throws IOException {
      return $$0.readByte();
   }

   static String b(DataInput $$0, rg $$1) throws IOException {
      return $$0.readUTF();
   }

   static rq a(rs<?> $$0, String $$1, DataInput $$2, int $$3, rg $$4) {
      try {
         return $$0.b($$2, $$3, $$4);
      } catch (IOException var8) {
         o $$6 = o.a(var8, "Loading NBT data");
         p $$7 = $$6.a("NBT Tag");
         $$7.a("Tag name", $$1);
         $$7.a("Tag type", $$0.a());
         throw new y($$6);
      }
   }

   public qx a(qx $$0) {
      for (String $$1 : $$0.x.keySet()) {
         rq $$2 = $$0.x.get($$1);
         if ($$2.b() == 10) {
            if (this.b($$1, 10)) {
               qx $$3 = this.p($$1);
               $$3.a((qx)$$2);
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
   public void a(ru $$0) {
      $$0.a(this);
   }

   protected Map<String, rq> i() {
      return Collections.unmodifiableMap(this.x);
   }

   @Override
   public rn.b a(rn $$0) {
      for (Entry<String, rq> $$1 : this.x.entrySet()) {
         rq $$2 = $$1.getValue();
         rs<?> $$3 = $$2.c();
         rn.a $$4 = $$0.a($$3);
         switch ($$4) {
            case d:
               return rn.b.c;
            case c:
               return $$0.b();
            case b:
               break;
            default:
               $$4 = $$0.a($$3, $$1.getKey());
               switch ($$4) {
                  case d:
                     return rn.b.c;
                  case c:
                     return $$0.b();
                  case b:
                     break;
                  default:
                     rn.b $$5 = $$2.a($$0);
                     switch ($$5) {
                        case c:
                           return rn.b.c;
                        case b:
                           return $$0.b();
                     }
               }
         }
      }

      return $$0.b();
   }
}
