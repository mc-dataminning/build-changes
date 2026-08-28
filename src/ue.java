import it.unimi.dsi.fastutil.longs.LongSet;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

public class ue extends tw<uf> {
   private static final int b = 24;
   public static final uw<ue> a = new uw.b<ue>() {
      public ue a(DataInput $$0, ug $$1) throws IOException {
         return new ue(d($$0, $$1));
      }

      @Override
      public ur.b a(DataInput $$0, ur $$1, ug $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static long[] d(DataInput $$0, ug $$1) throws IOException {
         $$1.b(24L);
         int $$2 = $$0.readInt();
         $$1.a(8L, (long)$$2);
         long[] $$3 = new long[$$2];

         for (int $$4 = 0; $$4 < $$2; $$4++) {
            $$3[$$4] = $$0.readLong();
         }

         return $$3;
      }

      @Override
      public void b(DataInput $$0, ug $$1) throws IOException {
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

   public ue(long[] $$0) {
      this.c = $$0;
   }

   public ue(LongSet $$0) {
      this.c = $$0.toLongArray();
   }

   public ue(List<Long> $$0) {
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
   public uw<ue> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.p_();
   }

   public ue e() {
      long[] $$0 = new long[this.c.length];
      System.arraycopy(this.c, 0, $$0, 0, this.c.length);
      return new ue($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof ue && Arrays.equals(this.c, ((ue)$$0).c);
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode(this.c);
   }

   @Override
   public void a(uy $$0) {
      $$0.a(this);
   }

   public long[] g() {
      return this.c;
   }

   @Override
   public int size() {
      return this.c.length;
   }

   public uf a(int $$0) {
      return uf.a(this.c[$$0]);
   }

   public uf a(int $$0, uf $$1) {
      long $$2 = this.c[$$0];
      this.c[$$0] = $$1.f();
      return uf.a($$2);
   }

   public void b(int $$0, uf $$1) {
      this.c = ArrayUtils.add(this.c, $$0, $$1.f());
   }

   @Override
   public boolean a(int $$0, uu $$1) {
      if ($$1 instanceof un) {
         this.c[$$0] = ((un)$$1).f();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean b(int $$0, uu $$1) {
      if ($$1 instanceof un) {
         this.c = ArrayUtils.add(this.c, $$0, ((un)$$1).f());
         return true;
      } else {
         return false;
      }
   }

   public uf b(int $$0) {
      long $$1 = this.c[$$0];
      this.c = ArrayUtils.remove(this.c, $$0);
      return uf.a($$1);
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
   public ur.b a(ur $$0) {
      return $$0.a(this.c);
   }
}
