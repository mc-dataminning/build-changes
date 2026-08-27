import it.unimi.dsi.fastutil.longs.LongSet;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

public class qy extends qq<qz> {
   private static final int b = 24;
   public static final rm<qy> a = new rm.b<qy>() {
      public qy a(DataInput $$0, int $$1, ra $$2) throws IOException {
         $$2.a(24L);
         int $$3 = $$0.readInt();
         $$2.a(8L * (long)$$3);
         long[] $$4 = new long[$$3];

         for (int $$5 = 0; $$5 < $$3; $$5++) {
            $$4[$$5] = $$0.readLong();
         }

         return new qy($$4);
      }

      @Override
      public rh.b a(DataInput $$0, rh $$1) throws IOException {
         int $$2 = $$0.readInt();
         long[] $$3 = new long[$$2];

         for (int $$4 = 0; $$4 < $$2; $$4++) {
            $$3[$$4] = $$0.readLong();
         }

         return $$1.a($$3);
      }

      @Override
      public void a(DataInput $$0) throws IOException {
         $$0.skipBytes($$0.readInt() * 8);
      }

      @Override
      public String a() {
         return "LONG[]";
      }

      @Override
      public String b() {
         return "TAG_Long_Array";
      }
   };
   private long[] c;

   public qy(long[] $$0) {
      this.c = $$0;
   }

   public qy(LongSet $$0) {
      this.c = $$0.toLongArray();
   }

   public qy(List<Long> $$0) {
      this(a($$0));
   }

   private static long[] a(List<Long> $$0) {
      long[] $$1 = new long[$$0.size()];

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         Long $$3 = $$0.get($$2);
         $$1[$$2] = $$3 == null ? 0L : $$3;
      }

      return $$1;
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeInt(this.c.length);

      for (long $$1 : this.c) {
         $$0.writeLong($$1);
      }
   }

   @Override
   public int a() {
      return 24 + 8 * this.c.length;
   }

   @Override
   public byte b() {
      return 12;
   }

   @Override
   public rm<qy> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.m_();
   }

   public qy e() {
      long[] $$0 = new long[this.c.length];
      System.arraycopy(this.c, 0, $$0, 0, this.c.length);
      return new qy($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof qy && Arrays.equals(this.c, ((qy)$$0).c);
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode(this.c);
   }

   @Override
   public void a(ro $$0) {
      $$0.a(this);
   }

   public long[] g() {
      return this.c;
   }

   @Override
   public int size() {
      return this.c.length;
   }

   public qz a(int $$0) {
      return qz.a(this.c[$$0]);
   }

   public qz a(int $$0, qz $$1) {
      long $$2 = this.c[$$0];
      this.c[$$0] = $$1.f();
      return qz.a($$2);
   }

   public void b(int $$0, qz $$1) {
      this.c = ArrayUtils.add(this.c, $$0, $$1.f());
   }

   @Override
   public boolean a(int $$0, rk $$1) {
      if ($$1 instanceof re) {
         this.c[$$0] = ((re)$$1).f();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean b(int $$0, rk $$1) {
      if ($$1 instanceof re) {
         this.c = ArrayUtils.add(this.c, $$0, ((re)$$1).f());
         return true;
      } else {
         return false;
      }
   }

   public qz b(int $$0) {
      long $$1 = this.c[$$0];
      this.c = ArrayUtils.remove(this.c, $$0);
      return qz.a($$1);
   }

   @Override
   public byte f() {
      return 4;
   }

   @Override
   public void clear() {
      this.c = new long[0];
   }

   @Override
   public rh.b a(rh $$0) {
      return $$0.a(this.c);
   }
}
