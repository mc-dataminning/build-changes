import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

public class sp extends sk<sq> {
   private static final int b = 24;
   public static final tk<sp> a = new tk.b<sp>() {
      public sp a(DataInput $$0, su $$1) throws IOException {
         return new sp(d($$0, $$1));
      }

      @Override
      public tf.b a(DataInput $$0, tf $$1, su $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static int[] d(DataInput $$0, su $$1) throws IOException {
         $$1.b(24L);
         int $$2 = $$0.readInt();
         $$1.a(4L, (long)$$2);
         int[] $$3 = new int[$$2];

         for (int $$4 = 0; $$4 < $$2; $$4++) {
            $$3[$$4] = $$0.readInt();
         }

         return $$3;
      }

      @Override
      public void b(DataInput $$0, su $$1) throws IOException {
         $$0.skipBytes($$0.readInt() * 4);
      }

      @Override
      public String a() {
         return "INT[]";
      }

      @Override
      public String b() {
         return "TAG_Int_Array";
      }
   };
   private int[] c;

   public sp(int[] $$0) {
      this.c = $$0;
   }

   public sp(List<Integer> $$0) {
      this(a($$0));
   }

   private static int[] a(List<Integer> $$0) {
      int[] $$1 = new int[$$0.size()];

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         Integer $$3 = $$0.get($$2);
         $$1[$$2] = $$3 == null ? 0 : $$3;
      }

      return $$1;
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeInt(this.c.length);

      for (int $$1 : this.c) {
         $$0.writeInt($$1);
      }
   }

   @Override
   public int a() {
      return 24 + 4 * this.c.length;
   }

   @Override
   public byte b() {
      return 11;
   }

   @Override
   public tk<sp> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.t_();
   }

   public sp e() {
      int[] $$0 = new int[this.c.length];
      System.arraycopy(this.c, 0, $$0, 0, this.c.length);
      return new sp($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof sp && Arrays.equals(this.c, ((sp)$$0).c);
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode(this.c);
   }

   public int[] g() {
      return this.c;
   }

   @Override
   public void a(tm $$0) {
      $$0.a(this);
   }

   @Override
   public int size() {
      return this.c.length;
   }

   public sq a(int $$0) {
      return sq.a(this.c[$$0]);
   }

   public sq a(int $$0, sq $$1) {
      int $$2 = this.c[$$0];
      this.c[$$0] = $$1.g();
      return sq.a($$2);
   }

   public void b(int $$0, sq $$1) {
      this.c = ArrayUtils.add(this.c, $$0, $$1.g());
   }

   @Override
   public boolean a(int $$0, ti $$1) {
      if ($$1 instanceof tb) {
         this.c[$$0] = ((tb)$$1).g();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean b(int $$0, ti $$1) {
      if ($$1 instanceof tb) {
         this.c = ArrayUtils.add(this.c, $$0, ((tb)$$1).g());
         return true;
      } else {
         return false;
      }
   }

   public sq b(int $$0) {
      int $$1 = this.c[$$0];
      this.c = ArrayUtils.remove(this.c, $$0);
      return sq.a($$1);
   }

   @Override
   public byte f() {
      return 3;
   }

   @Override
   public void clear() {
      this.c = new int[0];
   }

   @Override
   public tf.b a(tf $$0) {
      return $$0.a(this.c);
   }
}
