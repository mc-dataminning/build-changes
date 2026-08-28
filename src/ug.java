import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;
import org.apache.commons.lang3.ArrayUtils;

public final class ug implements ty {
   private static final int b = 24;
   public static final va<ug> a = new va.b<ug>() {
      public ug a(DataInput $$0, ui $$1) throws IOException {
         return new ug(d($$0, $$1));
      }

      @Override
      public uv.b a(DataInput $$0, uv $$1, ui $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static long[] d(DataInput $$0, ui $$1) throws IOException {
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
      public void b(DataInput $$0, ui $$1) throws IOException {
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

   public ug(long[] $$0) {
      this.c = $$0;
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
   public va<ug> c() {
      return a;
   }

   @Override
   public String toString() {
      ux $$0 = new ux();
      $$0.a(this);
      return $$0.a();
   }

   public ug e() {
      long[] $$0 = new long[this.c.length];
      System.arraycopy(this.c, 0, $$0, 0, this.c.length);
      return new ug($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof ug && Arrays.equals(this.c, ((ug)$$0).c);
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode(this.c);
   }

   @Override
   public void a(vc $$0) {
      $$0.a(this);
   }

   public long[] g() {
      return this.c;
   }

   @Override
   public int size() {
      return this.c.length;
   }

   public uh a(int $$0) {
      return uh.a(this.c[$$0]);
   }

   @Override
   public boolean a(int $$0, uy $$1) {
      if ($$1 instanceof up $$2) {
         this.c[$$0] = $$2.g();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean b(int $$0, uy $$1) {
      if ($$1 instanceof up $$2) {
         this.c = ArrayUtils.add(this.c, $$0, $$2.g());
         return true;
      } else {
         return false;
      }
   }

   public uh b(int $$0) {
      long $$1 = this.c[$$0];
      this.c = ArrayUtils.remove(this.c, $$0);
      return uh.a($$1);
   }

   @Override
   public void clear() {
      this.c = new long[0];
   }

   @Override
   public Optional<long[]> r_() {
      return Optional.of(this.c);
   }

   @Override
   public uv.b a(uv $$0) {
      return $$0.a(this.c);
   }
}
