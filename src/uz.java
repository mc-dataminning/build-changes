import it.unimi.dsi.fastutil.longs.LongSet;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

public class uz extends ur<va> {
   private static final int b = 24;
   public static final vr<uz> a = new vr.b<uz>() {
      public uz a(DataInput $$0, vb $$1) throws IOException {
         return new uz(d($$0, $$1));
      }

      @Override
      public vm.b a(DataInput $$0, vm $$1, vb $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static long[] d(DataInput $$0, vb $$1) throws IOException {
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
      public void b(DataInput $$0, vb $$1) throws IOException {
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

   public uz(long[] $$0) {
      this.c = $$0;
   }

   public uz(LongSet $$0) {
      this.c = $$0.toLongArray();
   }

   public uz(List<Long> $$0) {
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
   public vr<uz> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.s_();
   }

   public uz e() {
      long[] $$0 = new long[this.c.length];
      System.arraycopy(this.c, 0, $$0, 0, this.c.length);
      return new uz($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof uz && Arrays.equals(this.c, ((uz)$$0).c);
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode(this.c);
   }

   @Override
   public void a(vt $$0) {
      $$0.a(this);
   }

   public long[] g() {
      return this.c;
   }

   @Override
   public int size() {
      return this.c.length;
   }

   public va a(int $$0) {
      return va.a(this.c[$$0]);
   }

   public va a(int $$0, va $$1) {
      long $$2 = this.c[$$0];
      this.c[$$0] = $$1.f();
      return va.a($$2);
   }

   public void b(int $$0, va $$1) {
      this.c = ArrayUtils.add(this.c, $$0, $$1.f());
   }

   @Override
   public boolean a(int $$0, vp $$1) {
      if ($$1 instanceof vi) {
         this.c[$$0] = ((vi)$$1).f();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean b(int $$0, vp $$1) {
      if ($$1 instanceof vi) {
         this.c = ArrayUtils.add(this.c, $$0, ((vi)$$1).f());
         return true;
      } else {
         return false;
      }
   }

   public va b(int $$0) {
      long $$1 = this.c[$$0];
      this.c = ArrayUtils.remove(this.c, $$0);
      return va.a($$1);
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
   public vm.b a(vm $$0) {
      return $$0.a(this.c);
   }
}
