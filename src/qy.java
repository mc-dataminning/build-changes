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

public class qy implements rr {
   public static final Codec<qy> a = Codec.PASSTHROUGH.comapFlatMap($$0 -> {
      rr $$1 = (rr)$$0.convert(rj.a).getValue();
      return $$1 instanceof qy ? DataResult.success((qy)$$1) : DataResult.error(() -> "Not a compound tag: " + $$1);
   }, $$0 -> new Dynamic(rj.a, $$0));
   private static final int c = 48;
   private static final int w = 32;
   public static final rt<qy> b = new rt.b<qy>() {
      public qy a(DataInput $$0, int $$1, rh $$2) throws IOException {
         $$2.a(48L);
         if ($$1 > 512) {
            throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
         } else {
            Map<String, rr> $$3 = Maps.newHashMap();

            byte $$4;
            while (($$4 = qy.a($$0, $$2)) != 0) {
               String $$5 = qy.b($$0, $$2);
               $$2.a((long)(28 + 2 * $$5.length()));
               rr $$6 = qy.a(ru.a($$4), $$5, $$0, $$1 + 1, $$2);
               if ($$3.put($$5, $$6) == null) {
                  $$2.a(36L);
               }
            }

            return new qy($$3);
         }
      }

      @Override
      public ro.b a(DataInput $$0, ro $$1) throws IOException {
         byte $$2;
         label33:
         while (($$2 = $$0.readByte()) != 0) {
            rt<?> $$3 = ru.a($$2);
            switch ($$1.a($$3)) {
               case d:
                  return ro.b.c;
               case c:
                  rp.a($$0);
                  $$3.a($$0);
                  break label33;
               case b:
                  rp.a($$0);
                  $$3.a($$0);
                  break;
               default:
                  String $$4 = $$0.readUTF();
                  switch ($$1.a($$3, $$4)) {
                     case d:
                        return ro.b.c;
                     case c:
                        $$3.a($$0);
                        break label33;
                     case b:
                        $$3.a($$0);
                        break;
                     default:
                        switch ($$3.a($$0, $$1)) {
                           case c:
                              return ro.b.c;
                           case b:
                        }
                  }
            }
         }

         if ($$2 != 0) {
            while (($$2 = $$0.readByte()) != 0) {
               rp.a($$0);
               ru.a($$2).a($$0);
            }
         }

         return $$1.b();
      }

      @Override
      public void a(DataInput $$0) throws IOException {
         byte $$1;
         while (($$1 = $$0.readByte()) != 0) {
            rp.a($$0);
            ru.a($$1).a($$0);
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
   private final Map<String, rr> x;

   protected qy(Map<String, rr> $$0) {
      this.x = $$0;
   }

   public qy() {
      this(Maps.newHashMap());
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      for (String $$1 : this.x.keySet()) {
         rr $$2 = this.x.get($$1);
         a($$1, $$2, $$0);
      }

      $$0.writeByte(0);
   }

   @Override
   public int a() {
      int $$0 = 48;

      for (Entry<String, rr> $$1 : this.x.entrySet()) {
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
   public rt<qy> c() {
      return b;
   }

   public int f() {
      return this.x.size();
   }

   @Nullable
   public rr a(String $$0, rr $$1) {
      return this.x.put($$0, $$1);
   }

   public void a(String $$0, byte $$1) {
      this.x.put($$0, qw.a($$1));
   }

   public void a(String $$0, short $$1) {
      this.x.put($$0, rm.a($$1));
   }

   public void a(String $$0, int $$1) {
      this.x.put($$0, rd.a($$1));
   }

   public void a(String $$0, long $$1) {
      this.x.put($$0, rg.a($$1));
   }

   public void a(String $$0, UUID $$1) {
      this.x.put($$0, rk.a($$1));
   }

   public UUID a(String $$0) {
      return rk.a(this.c($$0));
   }

   public boolean b(String $$0) {
      rr $$1 = this.c($$0);
      return $$1 != null && $$1.c() == rc.a && ((rc)$$1).g().length == 4;
   }

   public void a(String $$0, float $$1) {
      this.x.put($$0, rb.a($$1));
   }

   public void a(String $$0, double $$1) {
      this.x.put($$0, qz.a($$1));
   }

   public void a(String $$0, String $$1) {
      this.x.put($$0, rp.a($$1));
   }

   public void a(String $$0, byte[] $$1) {
      this.x.put($$0, new qv($$1));
   }

   public void a(String $$0, List<Byte> $$1) {
      this.x.put($$0, new qv($$1));
   }

   public void a(String $$0, int[] $$1) {
      this.x.put($$0, new rc($$1));
   }

   public void b(String $$0, List<Integer> $$1) {
      this.x.put($$0, new rc($$1));
   }

   public void a(String $$0, long[] $$1) {
      this.x.put($$0, new rf($$1));
   }

   public void c(String $$0, List<Long> $$1) {
      this.x.put($$0, new rf($$1));
   }

   public void a(String $$0, boolean $$1) {
      this.x.put($$0, qw.a($$1));
   }

   @Nullable
   public rr c(String $$0) {
      return this.x.get($$0);
   }

   public byte d(String $$0) {
      rr $$1 = this.x.get($$0);
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
            return ((rl)this.x.get($$0)).i();
         }
      } catch (ClassCastException var3) {
      }

      return 0;
   }

   public short g(String $$0) {
      try {
         if (this.b($$0, 99)) {
            return ((rl)this.x.get($$0)).h();
         }
      } catch (ClassCastException var3) {
      }

      return 0;
   }

   public int h(String $$0) {
      try {
         if (this.b($$0, 99)) {
            return ((rl)this.x.get($$0)).g();
         }
      } catch (ClassCastException var3) {
      }

      return 0;
   }

   public long i(String $$0) {
      try {
         if (this.b($$0, 99)) {
            return ((rl)this.x.get($$0)).f();
         }
      } catch (ClassCastException var3) {
      }

      return 0L;
   }

   public float j(String $$0) {
      try {
         if (this.b($$0, 99)) {
            return ((rl)this.x.get($$0)).k();
         }
      } catch (ClassCastException var3) {
      }

      return 0.0F;
   }

   public double k(String $$0) {
      try {
         if (this.b($$0, 99)) {
            return ((rl)this.x.get($$0)).j();
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
            return ((qv)this.x.get($$0)).e();
         }
      } catch (ClassCastException var3) {
         throw new y(this.a($$0, qv.a, var3));
      }

      return new byte[0];
   }

   public int[] n(String $$0) {
      try {
         if (this.b($$0, 11)) {
            return ((rc)this.x.get($$0)).g();
         }
      } catch (ClassCastException var3) {
         throw new y(this.a($$0, rc.a, var3));
      }

      return new int[0];
   }

   public long[] o(String $$0) {
      try {
         if (this.b($$0, 12)) {
            return ((rf)this.x.get($$0)).g();
         }
      } catch (ClassCastException var3) {
         throw new y(this.a($$0, rf.a, var3));
      }

      return new long[0];
   }

   public qy p(String $$0) {
      try {
         if (this.b($$0, 10)) {
            return (qy)this.x.get($$0);
         }
      } catch (ClassCastException var3) {
         throw new y(this.a($$0, b, var3));
      }

      return new qy();
   }

   public re c(String $$0, int $$1) {
      try {
         if (this.d($$0) == 9) {
            re $$2 = (re)this.x.get($$0);
            if (!$$2.isEmpty() && $$2.f() != $$1) {
               return new re();
            }

            return $$2;
         }
      } catch (ClassCastException var4) {
         throw new y(this.a($$0, re.a, var4));
      }

      return new re();
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

   private o a(String $$0, rt<?> $$1, ClassCastException $$2) {
      o $$3 = o.a($$2, "Reading NBT data");
      p $$4 = $$3.a("Corrupt NBT tag", 1);
      $$4.a("Tag type found", () -> this.x.get($$0).c().a());
      $$4.a("Tag type expected", $$1::a);
      $$4.a("Tag name", $$0);
      return $$3;
   }

   public qy h() {
      Map<String, rr> $$0 = Maps.newHashMap(Maps.transformValues(this.x, rr::d));
      return new qy($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof qy && Objects.equals(this.x, ((qy)$$0).x);
   }

   @Override
   public int hashCode() {
      return this.x.hashCode();
   }

   private static void a(String $$0, rr $$1, DataOutput $$2) throws IOException {
      $$2.writeByte($$1.b());
      if ($$1.b() != 0) {
         $$2.writeUTF($$0);
         $$1.a($$2);
      }
   }

   static byte a(DataInput $$0, rh $$1) throws IOException {
      return $$0.readByte();
   }

   static String b(DataInput $$0, rh $$1) throws IOException {
      return $$0.readUTF();
   }

   static rr a(rt<?> $$0, String $$1, DataInput $$2, int $$3, rh $$4) {
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

   public qy a(qy $$0) {
      for (String $$1 : $$0.x.keySet()) {
         rr $$2 = $$0.x.get($$1);
         if ($$2.b() == 10) {
            if (this.b($$1, 10)) {
               qy $$3 = this.p($$1);
               $$3.a((qy)$$2);
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
   public void a(rv $$0) {
      $$0.a(this);
   }

   protected Map<String, rr> i() {
      return Collections.unmodifiableMap(this.x);
   }

   @Override
   public ro.b a(ro $$0) {
      for (Entry<String, rr> $$1 : this.x.entrySet()) {
         rr $$2 = $$1.getValue();
         rt<?> $$3 = $$2.c();
         ro.a $$4 = $$0.a($$3);
         switch ($$4) {
            case d:
               return ro.b.c;
            case c:
               return $$0.b();
            case b:
               break;
            default:
               $$4 = $$0.a($$3, $$1.getKey());
               switch ($$4) {
                  case d:
                     return ro.b.c;
                  case c:
                     return $$0.b();
                  case b:
                     break;
                  default:
                     ro.b $$5 = $$2.a($$0);
                     switch ($$5) {
                        case c:
                           return ro.b.c;
                        case b:
                           return $$0.b();
                     }
               }
         }
      }

      return $$0.b();
   }
}
